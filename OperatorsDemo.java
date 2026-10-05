public class OperatorsDemo{
    public OperatorsDemo(){

    }
    void add (int var1,int var2){
        int var3=var1+var2;
        System.out.println("addition:"+var3);
    }
    int multiply(int var1,int var2){
        return var1*var2;
    }
        public static void main(String[]var0){
            byte var1=6;
            byte var2=9;
            int var3=var1+var2;
            System.out.println("Arithmatic Promotion Result:"+var3);

            byte var4=30;
            byte var5=4;
            System.out.println("x+y="+(var4+var5));
            System.out.println("x-y="+(var4-var5));
            System.out.println("x*y="+(var4*var5));
            System.out.println("x/y="+(var4/var5));
            System.out.println("x%y="+(var4%var5));
            
            OperatorsDemo var6=new OperatorsDemo();
            var6.add(5,7);
            int var7=var6.multiply(4,6);
            System.out.println("Multiplication:" +var7);
        }
    }
