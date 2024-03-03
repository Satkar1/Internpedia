import java.util.*;
class Student
{
    
    int n,sub;
    String name[], subject[];
    double nm[][];
    Student ()
    {}
    void grade (int l, double p)
    {
        if(p<=100 && p>90)
        {
            nm[l][sub+2]=65;
        }
        
        else if(p<=90 && p>80)
        {
            nm[l][sub+2]=66;
        }
        else if(p<=80 && p>70)
        {
            nm[l][sub+2]=67;
        }        
        else if(p<=70 && p>60)
        {
            nm[l][sub+2]=68;
        }
        else if(p<=60 && p>50)
        {
            nm[l][sub+2]=69;
        }  
        else if(p<=50 && p>40)
        {
            nm[l][sub+2]=70;
        }
        else
        {
            nm[l][sub+2]=0;
        }                      
    }
    void input ()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter total number of students : ");
        n=s.nextInt();


        System.out.print("\n ");
        name=new String [n];
        System.out.print("Enter Names of Students  : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(""+(i+1)+") ");
            name[i]=s.next();
        }
        System.out.print("\n ");


        System.out.print("Enter total number of subject : ");
        sub=s.nextInt();
        subject=new String [sub];
        System.out.print("Enter Names of Subject  : ");
        for(int i=0;i<sub;i++)
        {
            System.out.print(""+(i+1)+") ");
            subject[i]=s.next();
        }
        System.out.print("\n ");


        nm=new double [n][sub+3];
        System.out.print("Enter Marks : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(""+name[i]+"");
            int temp=0;
            for(int j=0;j<sub;j++)
            {
                System.out.print(""+subject[j]+" : ");
                nm[i][j]=s.nextDouble();
                temp+=nm[i][j];
            }
            nm[i][sub]=temp;
            double percentage =temp/sub;
            nm[i][sub+1]=percentage;
            grade(i, percentage);
            System.out.print("\n ");
        }
    }
    
    void display ()
    {
        System.out.print("\n ");
        System.out.println("Result :");
        for(int i=0;i<n;i++)
        {
            System.out.println(""+name[i]+" : ");
            
            for(int j=0;j<sub;j++)
            {
                System.out.println(""+subject [j]+" : "+nm[i][j]+"");
            }
            System.out.println("Total : "+nm[i][sub]+"");
            System.out.println("Percentage : "+nm[i][sub+1]+"");
            if(nm[i][sub+2]==0)
            {
                System.out.println("Result: Failed...");
            }
            else
            {
                int a=(int)nm[i][sub+2];
                //char c=a;
                System.out.println("Grade : "+(char)a+"");
            }
            System.out.print("\n ");
        }    
    }
};

class T1
{
    public static void main (String args[])
    {
        Student ob=new Student();
        ob.input();
        ob.display();
    }
}

/*
Output:

Enter total number of students : 3

Enter Names of Students  : 1) Shyam 
2) Ram
3) Hari

Enter total number of subject : 3   
Enter Names of Subject  : 1) Physics 
2) Math
3) Chemistry

Enter Marks : Shyam
Physics : 78
Math : 91
Chemistry : 81

Ram
Physics : 55
Math : 71
Chemistry : 96

Hari
Physics : 91
Math : 88
Chemistry : 99


Result :
Shyam :
Physics : 78.0
Math : 91.0
Chemistry : 81.0
Total : 250.0
Percentage : 83.0
Grade : B

Ram :
Physics : 55.0
Math : 71.0
Chemistry : 96.0
Total : 222.0
Percentage : 74.0
Grade : C

Hari :
Physics : 91.0
Math : 88.0
Chemistry : 99.0
Total : 278.0
Percentage : 92.0
Grade : A
 */