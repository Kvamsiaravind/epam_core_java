package practice;

class Test {

    int x  = 10;
    public int test(){
        return x;
    }

    public static void main(String[] args) {    

//         System.out.println(x);

        Test t=new Test();
        System.out.println(t.test());
    }

}