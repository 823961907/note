class OperateDemo{

    public static void main(String[] args){
	//位（二进制）级别运算。& ^ | 。一个数 异或 同一个数两次，结果还是这个数 6 ^ 3 ^ 3 = 6
	// ~ 取反操作。~6 = -X
	int x = 6370;
	x = x / 1000 * 1000;//最后结果x = 6000
	System.out.println(x);
	System.out.println( 5 % -2);//结果为1，只有被除数的5，别模数5的符号是有效的。

	int a = 3 , b , c;
	int d = 3;
	b = a++ ;//b = 3; b = a = a + 1; //比++多一个区域，在+1 之前临时保存a的值。
	c = ++d ;//c = 4; // 在内存中中，只有三个区域，一个存储c一个存储d，另一个运算
	//谁在前，谁先执行。内存中，赋值动作是最后才执行的。 
	System.out.println("b = "+ b +", c = "+ c +", a ="+ a);
	
	int e = 3;
	e+=3;
	e = e + 3;

	short ee = 3;
	ee += 3;//相对下一行的报错，此行代码jvm做了一次向下强转的动作。
	//ee = ee + 3;//3 默认是int 类型，ee是shrot类型，丢失精度，所以jvm没有做向下强转的动作。

	System.out.println(3<<2);//3 左移两位，左移高位舍弃，低位补零, 3 << 2 = 3 * 2的2次方
	//右移相当于除以2的n次方
    }
}
