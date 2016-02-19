package zadaci_18_02_2016;

public class MyStackTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack MS1 = new MyStack();
        for (int i = 0; i < 15; i++) {
            MS1.push(i);
        }
        MyStack MS2 = (MyStack) MS1.clone();
        MS1.pop();
        MS1.pop();
        //MS1.pop();//12-15
        //MS1.pop();//11-15 etc..

        System.out.println("MS1: " + MS1.getSize()+"\nMS2: "+MS2.getSize());

	}

}
