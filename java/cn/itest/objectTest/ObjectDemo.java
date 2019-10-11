//Object 是所有类的父类,是通过不断的抽取出现的。

package cn.itest.objectTest;
class Fu{// extend Object
    Fu(){
	super();
    }
}

class Zi extends Fu{
    Zi(){
	super();
    }
}

class Person{
    private int age;
    Person(int age){
	this.age = age;
    }
    //比较person的年龄
    /*
    public boolean compare(Person p){
	return this.age == p.age;
    }
    */

    public boolean equals(Object obj){//覆写,重写
	//多态	
	if(!(obj instanceof Person)){//对象的引用 instanceof 类名
	    throw new ClassCastException("类型错误");
	}
	
	Person p = (Person)obj;
	return this.age == p.age;
    }
}


class Demo{

}

public class ObjectDemo{
    public static void main(String[] args){
	//new Zi();
	Person p1 = new Person(20);
	Person p2 = new Person(20);
	Person p3 = p1;
	
	Demo d = new Demo();
	//System.out.println("");

	//hashCode
	System.out.println(p1);//十六进制
	System.out.println(Integer.toHexString(p1.hashCode()));//十六进制

	System.out.println(p1.hashCode());//十进制

	//equals
	System.out.println(p1.equals(p2));//对象的哈希值。
	System.out.println(p1 == p2);
	System.out.println(p1.equals(p2));//在Object 源码中，还是引用的==
	System.out.println(p1.equals(p3));//在Object 源码中，还是引用的==

	Class clazz1 = p1.getClass();
	Class clazz2 = p2.getClass();
	System.out.println(clazz1 == clazz2);
	System.out.println(clazz1.getName());
	
    }
}
