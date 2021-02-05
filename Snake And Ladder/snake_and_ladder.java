import java.util.*;
class array
{ 
public static int getNum(){
    Random rand=new Random();
    int randomNum=rand.nextInt(6)+1;
    return randomNum;
}
}

class snake_and_ladder
{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);  
 int arr[][]=new int[10][10];
  int count=0;
for(int i=0;i<10;i++)
{
    for(int j=0;j<10;j++)
    {
        if(i%2==0)
        {
            arr[i][j]=(10*i)+j+1;
        }
        else
        {
            arr[i][j]=(10*i)+(10-j);
        }
    }
}
System.out.println("PRESS S TO START THE GAME");

    while(count!=1)
    {
char response1= sc.next().charAt(0);
    System.out.println();
    if(response1=='s')
    {
        printing_board(arr);
        start_game(arr);
        count++;
    }
    else
    System.out.println("INVALID BUTTON PRESS S TO START THE GAME");
}
}
public static void printing_board(int arr[][])
{
    System.out.println("Main Board");
System.out.println();

for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
System.out.println();
System.out.println();
System.out.println();
}
public static void start_game(int arr[][])
{
Scanner sc=new Scanner(System.in);
array p1 = new array(); //player 1
  array p2 = new array(); //player 2
    try
{
Thread.sleep(3000);
}  
catch(Exception e){}
int move=0,a=-1,b=-1,c,x=0,y=0,z=0,d=0,g=0;

while(a<100&&b<100)
{
    if(move%2==0)
    {
    try
{
Thread.sleep(1000);
}  
catch(Exception e){}
         System.out.println("player 1 turn");
  System.out.println();
System.out.println();
  
 System.out.println("Press c to roll your dice");
   char response = sc.next().charAt(0);

      if(response=='c')
      {
          if(a==-1)
         {
             c=p1.getNum();
             System.out.println("Dice value "+c);
             if(c==6)
            {
             a=0;
            move--;
             }
         }
         else
         {
          c=p1.getNum();
             System.out.println("Dice value "+c);
             a=a+c;
             if(a==1)
         {
             a=38;
             System.out.println("Ladder here");
         }
              if(a==4)
         {
             a=14;
             System.out.println("Ladder here");
         }
                if(a==8)
         {
             a=30;
             System.out.println("Ladder here");
         }
               if(a==21)
         {
             a=42;
             System.out.println("Ladder here");
         }
              if(a==28)
         {
             a=76;
             System.out.println("Ladder here");
         }
               if(a==50)
         {
             a=67;
             System.out.println("Ladder here");
         }
        if(a==71)
         {
             a=92;
             System.out.println("Ladder here");
         }
    if(a==80)
         {
             a=99;
             System.out.println("Ladder here");
         }
             if(a==97)
         {
             a=78;
             System.out.println("Snake here");
         }
            if(a==95)
         {
             a=56;
             System.out.println("Snake here");
         }
            if(a==88)
         {
             a=24;
             System.out.println("Snake here");
         }
            if(a==62)
         {
             a=18;
             System.out.println("Snake here");
         }
             if(a==48)
         {
             a=26;
             System.out.println("Snake here");
         }
            if(a==36)
         {
             a=6;
             System.out.println("Snake here");
         } 
            if(a==32)
         {
             a=10;
             System.out.println("Snake here");
         }  
              if(a>100)
              {
                  a=a-c;
              }
              if(c==6)
              move--;
         }
    try
{
Thread.sleep(1000);
}  
catch(Exception e){}

         for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
       if(a==b&&a!=-1&&arr[i][j]==a)
    System.out.print("p1p2 ");
      else
{
        if(arr[i][j]==a)
        System.out.print("p1 ");
    else if(arr[i][j]==b)
        System.out.print("p2 ");
    
        else
        System.out.print(arr[i][j]+" ");
    }
}
    System.out.println();

}
 System.out.println("At pos "+a);
System.out.println();


   if(a==100)
{
System.out.println("player 1 winner");
break;
}        
      }
      else
{
System.out.println("INVALID KEY PRESS C TO ROLL THE DICE");
move--;
}
}
else
{
    try
{
Thread.sleep(1000);
}  
catch(Exception e){}
         System.out.println("player 2 turn");
  System.out.println();
System.out.println();
 
 System.out.println("Press c to roll your dice");
   char response = sc.next().charAt(0);

      if(response=='c')
      {
          if(b==-1)
         {
             c=p1.getNum();
             System.out.println("Dice value "+c);
             if(c==6)
         {
             b=0;
             move--;
          }
         }
         else
         {
          c=p1.getNum();
             System.out.println("Dice value "+c);
             b=b+c;
             if(b==1)
         {
             b=38;
             System.out.println("Ladder here");
         }
              if(b==4)
         {
             b=14;
             System.out.println("Ladder here");
         }
                if(b==8)
         {
             b=30;
             System.out.println("Ladder here");
         }
               if(b==21)
         {
             b=42;
             System.out.println("Ladder here");
         }
              if(b==28)
         {
             b=76;
             System.out.println("Ladder here");
         }
               if(b==50)
         {
             b=67;
             System.out.println("Ladder here");
         }
        if(b==71)
         {
             b=92;
             System.out.println("Ladder here");
         }
    if(b==80)
         {
             b=99;
             System.out.println("Ladder here");
         }
             if(b==97)
         {
             b=78;
             System.out.println("Snake here");
         }
            if(b==95)
         {
             b=56;
             System.out.println("Snake here");
         }
            if(b==88)
         {
             b=24;
             System.out.println("Snake here");
         }
            if(b==62)
         {
             b=18;
             System.out.println("Snake here");
         }
             if(b==48)
         {
             b=26;
             System.out.println("Snake here");
         }
            if(b==36)
         {
             b=6;
             System.out.println("Snake here");
         } 
            if(b==32)
         {
             b=10;
             System.out.println("Snake here");
         }  
              if(b>100)
              {
                  b=b-c;
              }
              if(c==6)
              move--;
         }
    try
{
Thread.sleep(1000);
}  
catch(Exception e) {}
         for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
        if(a==b&&a!=-1&&arr[i][j]==a)
    System.out.print("p1p2 ");
        else
     {
        if(arr[i][j]==a)
        System.out.print("p1 ");
    else if(arr[i][j]==b)
        System.out.print("p2 ");
        else
        System.out.print(arr[i][j]+" ");
    }
}
    System.out.println();

}
 System.out.println("At pos "+b);
System.out.println();


   if(b==100)
{
System.out.println("player 2 winner");
break;
}        
}
else
{
System.out.println("INVALID KEY PRESS C TO ROLL THE DICE");
move--;
}
}
move++;
}
}
}
