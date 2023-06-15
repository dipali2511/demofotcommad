class A
{
int var1;
int var2;

//special method (Constructor)

A() //supplying values to the instance variables
{
var1=100;
var2=200;
}

//overloading constructors

A(int var1,int var2)
{
this.var1=var1;
this.var2=var2;
}

void display()
{
System.out.println(var1);
System.out.println(var2);
}

public static void main(String args[])
{
A obj1=new A();

System.out.println(obj1.var1);
System.out.println(obj1.var2);

A obj2=new A(500,798);
obj2.display();
}
}