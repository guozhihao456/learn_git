import java.util.Deque;
import java.util.LinkedList;

public class ChangeDeque {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList();
		//头部插入
		deque.offerFirst("郭志浩");
		
		//尾部插入
		deque.offerLast("跟着");
		deque.offerLast("谭超");
		deque.offerLast("学习数据结构与算法");
		System.out.println(deque);
		
		//头部
		String str = deque.peek();
		System.out.println(str);
		
		//弹出来
		while(deque.size() > 0) {
			System.out.println(deque.pop());
		}
		System.out.println(deque);
		
		
		
	}
}