package maventask;
 interface Gifts{
	 int weight();//abstract
				
		}
class candies implements Gifts{
	public int weight(){
		return 0;
	}
	
	void sort(int a){
		if(a==10)
        System.out.println("Dairymilk");
		if(a==8)
	        System.out.println("Munch");
		if(a==9)
	        System.out.println("Perk");
 }
 void candies1(int a){
            if(a==100)
	           System.out.println("Jalebi");
		    if(a==105)
	           System.out.println("Gulanjamun");

}
 }
abstract class chocolates extends candies{
	 void m1(){
		System.out.println("chocolates in gifts are Dairymilk,Munch,Perk");
	 }
}
      class Sweets extends candies{
	void m2(){
		System.out.println("Sweets in gifts are Jalebi,Gulabjamun");
	}
}
class Dairymilk extends chocolates{
	public int weight(){
		int w=10;
		return w;
	}
}
class Munch extends chocolates{
     public int weight(){
		int w=8;return w;
	}
}
class Perk extends chocolates{
	public int weight(){
		int w=9;return w;
	}
}
class Jalebi extends Sweets{
  public  int weight(){
	  int w=100;return w;
}}
class Gulabjamun extends Sweets{
   public int weight(){
		int w=105;return w;
	}
}
public class Newyeargift {
	public static void main(String args[]){
Sweets s1=new Sweets();
Sweets s2=new Sweets();
s2.m2();
chocolates s3=new Dairymilk();
s3.m1();
Gifts s4=new Munch();
Gifts s5=new Perk();
candies s6=new candies();
Sweets s7=new Jalebi();
Sweets s8=new Gulabjamun();
int w1=s3.weight();int w2=s4.weight();int w3=s5.weight();int w4 =s7.weight();int w5=s8.weight();
int totalweight=w1+w2+w3;
System.out.println("totalweight of chocolates in the gift is "+totalweight);
System.out.println("chocolates in the order of weight");
int a[]={w1,w2,w3};
int c[]={w1,w2,w3,w4,w5};
for (int i = 0; i < a.length; i++) 
{

    for (int j = i + 1; j < a.length; j++)
    {

        if (a[i] > a[j]) 
        {

            int t=  a[i];
            a[i] = a[j];
            a[j] = t;
        }
        }
}

	for(int i=0;i<a.length;i++){
		s6.sort(a[i]);
	}
	System.out.println("candies in the gift according to their weights in between 10 and 110");
	for(int i=0;i<5;i++){
		if(c[i]>10 && c[i]<110){
			s6.candies1(c[i]);
		}
	}
	}
}