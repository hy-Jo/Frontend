import * as admin from 'firebase-admin';

interface Config {
  credential: {
    privateKey: string;
    clientEmail: string;
    projectId: string;
  };
}

export default class FriebaseAdmin {
  public static instance: FriebaseAdmin;

  private init = false;

  public static getInstance(): FriebaseAdmin {
    if (FriebaseAdmin.instance === undefined || FriebaseAdmin.getInstance === null) {
      FriebaseAdmin.instance = new FriebaseAdmin();
      FriebaseAdmin.instance.bootstrap();
    }
    return FriebaseAdmin.instance;
  }

  private bootstrap(): void {
    const haveApp = admin.apps.length != 0;
    if (haveApp) {
      this.init = true;
      return;
    }

    const config: Config = {
      credential: {
        projectId: process.env.projectId || '',
        clientEmail: process.env.clientEmail || '',
        privateKey: (process.env.privateKey || '').replace(/\\n/g, '/n'),
      },
    };
    admin.initializeApp({ credential: admin.credential.cert(config.credential) });
    console.info('bootstrap firebase admin');
  }

  public get Firebase(): FirebaseFirestore.Firestore {
    if (this.init === false) {
      this.bootstrap();
    }
    return admin.firestore();
  }

  public get Auth(): admin.auth.Auth {
    if (this.init === false) {
      this.bootstrap();
    }
    return admin.auth();
  }
}
