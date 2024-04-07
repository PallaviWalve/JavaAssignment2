package javaassignment2;

public class Question3 {

	private int num,fact=1;
	
	
	public Question3(int num) {
		super();
		this.num = num;
		this.fact = fact;
	}
	
	public int display()
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}


	public static void main(String[] args) {
		Question3 question=new Question3(5);
		System.out.println(question.display());
	}

}
