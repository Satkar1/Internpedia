import java.util.*;
import java.io.*;
class Currency 
{
    /*Doller,EUro,Ruppe,frac, pound,yen*/
    int from,to;
    double arr[][]=new double [6][6];
    
    Currency()
    {
        arr[0][1]=0.92;
        arr[0][2]=82.85;
        arr[0][3]=0.88;
        arr[0][4]=0.79;
        arr[0][5]=150.10;
        arr[1][2]=89.93;
        arr[1][3]=0.96;
        arr[1][4]=0.86;
        arr[1][5]=162.93;
        arr[2][3]=0.011;
        arr[2][4]=0.0095;
        arr[2][5]=1.82;
        arr[3][4]=0.89;
        arr[3][5]=169.74;
        arr[4][5]=190.39;
        
        
        for (int i=0;i<6;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if(i==j)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=(1/arr[j][i]);
                }
            }
        }
    }
    
    void converter ()
    {
        System.out.println("Welcome to Currency converter");
        Scanner s=new Scanner (System.in);
        int k=0;
        while (k!=1)
        {
            System.out.print("1)Doller\t2)EUro\t3)Ruppe\t4)frac\t5)pound\t6)yen\n");
            System.out.print("From : ");
            int i=s.nextInt();
            System.out.print("To : ");
            int j=s.nextInt();
            System.out.print("Enter amount : ");
            double amt=s.nextDouble();
            System.out.println("Amount receive : "+(amt*arr[i-1][j-1])+"");
            System.out.println("Enter choice :1) Continue , 2) Exit");
            int temp=s.nextInt();
            if(temp==2)
            {
                k=1;
            }
        }
    }
};

class T2
{
    public static void main (String args[])
    {
        Currency c=new Currency ();
        c.converter();
    }
}

/*
Output :
Welcome to Currency converter

1)Doller        2)EUro  3)Ruppe 4)frac       5)pound 6)yen
From : 1
To : 3
Enter amount : 56
Amount receive : 4639.599999999999

Enter choice :1) Continue , 2) Exit
1
1)Doller        2)EUro  3)Ruppe 4)frac  5)pound 6)yen
From : 2
To : 5
Enter amount : 75
Amount receive : 64.5

Enter choice :1) Continue , 2) Exit
1
1)Doller        2)EUro  3)Ruppe 4)frac  5)pound 6)yen
From : 4
To : 6
Enter amount : 999
Amount receive : 169570.26

Enter choice :1) Continue , 2) Exit
2
*/