package session29;
import session29.Queue;
public class DynamicQueue extends Queue {
	@Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			int[] arr = new int[super.data.length * 2];
			for (int i = 0; i < super.data.length; i++) {
				arr[i] = data[(front + i) % data.length];
			}
			super.data = arr;
			super.front = 0;
		}
		super.enqueue(item);

	}
}
