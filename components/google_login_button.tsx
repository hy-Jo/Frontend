import { Box, Button } from '@chakra-ui/react';

export const GoogleLoginButton = function () {
  return (
    <Box>
      <Button
        size="lg"
        width="full"
        maxW="md"
        borderRadius="full"
        bgColor="#4285f4"
        color="white"
        colorScheme="blue"
        leftIcon={<img src="/google.svg" alt="google logo" style={{ backgroundColor: 'white', padding: '8px' }} />}
      >
        Start with Google Account{' '}
      </Button>
    </Box>
  );
};
