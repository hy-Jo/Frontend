// Next.js API route support: https://nextjs.org/docs/api-routes/introduction

import { NextApiRequest, NextApiResponse } from 'next';
import FriebaseAdmin from '@/model/firebase_admin';

export default function handler(_: NextApiRequest, res: NextApiResponse) {
  FriebaseAdmin.getInstance().Firebase.collection('test');
  res.status(200).json({ name: 'John Doe' });
}
