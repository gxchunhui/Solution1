import java.util.Stack;

/* ��Ŀ����
������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������
 �����е�Ԫ��Ϊint���͡�
 */
public class Solution1 {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	public void push(int code)
	{
		stack1.push(code);
	}
	public int pop()
	{
	if(stack2.empty())
	{
		while(!stack1.empty())
		{
			stack2.push(stack1.pop());
		}
	}
	return stack2.pop();
	}

}
