import java.util.Scanner;

class DiamondPattern
{
    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        int N;

        System.out.print("no. of rows of pyramid ");
        N = Input.nextInt();

        if(N <= 0)
            System.out.println("error");
        else
            diamond(N); 
    }


    public static void diamond(int N)
    {
        int D1sc = N;
        int D1oc = 1;
        int D2c = -1;

        
        for(int i = 0; i < N; i++)
        {
            for(int j = 1; j <= D1sc; j++)
                System.out.print(' ');

            for(int k = 1; k <= D1oc; k++)
            {
                if(D1oc > N && k >= (D1oc + 1)/2 - D2c && k <= (D1oc + 1) / 2 + D2c)
                    System.out.print(' ');

                else
                    System.out.print("1");
            }

            System.out.println();
            D1sc -= 1;
            D1oc += 2;
            if(D1oc > N)
                D2c += 1;
        }

        D1sc = 2;
        D1oc = 2 * N - 3;
        D2c = (N-2)/2 - 1;

        for(int i = 0; i < N; i++)
        {
            for(int j = 1; j <= D1sc; j++)
                System.out.print(' ');

            for(int k = 1; k <= D1oc; k++)
            {
                if(D1oc > N && k >= (D1oc + 1)/2 - D2c && k <= (D1oc + 1)/2 + D2c)
                    System.out.print(' ');

                else
                    System.out.print("1");
            }

            System.out.println();
            D1sc += 1;
            D1oc -= 2;
            if(D1oc > N)
                D2c -= 1;
        }
    }
}
