//变量的类型
class VarDemo{
    public static void main(String[] args){
	//byte 1个字节 8位；short、char 2个字节 16位；int float 4个字节 32位；double、long 8个字节 64位；boolean;
	byte bb = 3; // 申请byte大小的内存, -127-128
	bb = 8; //修改内存中b的值，b的引用值
	System.out.println(bb);

	int x = 3;
	byte y = 5;
	x = x + bb;//x 占用4个字节的内存
	//下面一行是会出现编译错误提示
	//y = y + 4;
	y = (byte)(y + 4);//强制类型转换，默认的4是int类型。y =5，在计算过程中，5占四个字节内存，4占4个字节内存，两个内存相加之后的值占4个字节，但是y只有一个字节，所以需要强制类型转换。
	
	byte b = 4;
	b = 3 + 7;//常量运算，值已经固定。相对下面的变量运算。结果是：编译通过
	byte b1 = 3;
	byte b2 = 7;
	//b = b1 + b2;//变量运算，值不固定，所以编译器无法进行类型转换动作，所以：编译报错
	int bx ;
	bx = b1 + b2;
    }
}
