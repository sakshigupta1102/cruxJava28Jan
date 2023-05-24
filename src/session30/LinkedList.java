package session30;

public class LinkedList {
	public class Node {
		int val;
		Node next;

		public Node() {
			this.val = 0;
			this.next = null;
		}

		public Node(int val) {
			this.val = val;
		}
	}

	Node head;
	Node tail;
	int size;

	public boolean isempty() {
		return this.head == null;
	}

	public int getfirst() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		return this.head.val;
	}

	public Node getfirstNode() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		return this.head;
	}

	public int getLast() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		return this.tail.val;
	}

	public Node getLastNode() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		return this.tail;
	}

	public int getAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");
		} else if (idx == 0) {
			return getfirst();
		} else if (idx == this.size - 1) {
			return getLast();
		} else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp.val;
		}
	}

	public Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("invalid index");
		} else if (idx == 0) {
			return getfirstNode();
		} else if (idx == this.size) {
			return getLastNode();
		} else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}

	public void addfirst(int val) {
		Node nn = new Node(val);
		if (isempty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = head;
			this.head = nn;
			this.size++;
		}
	}

	public void addLast(int val) {
		Node nn = new Node(val);
		if (isempty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void addAt(int val, int idx) throws Exception {
		Node nn = new Node(val);
		if (idx == 0)
			addfirst(val);
		else if (idx == this.size) {
			addLast(val);
		} else {
			Node pnode = getNodeAt(idx - 1);
			Node save = pnode.next;
			pnode.next = nn;
			nn.next = save;
			size++;
		}
	}

	public void removefirst() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		}
		else{
		head = head.next;
		this.size--;
		}
	}
	public void removeLast() throws Exception {
		if (isempty())
			throw new Exception("LL is empty");
		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		}else{
			Node pNode = getNodeAt(this.size-2);
			pNode.next= null;
			this.tail= pNode;
			this.size--;
		}
	}
	public void removeAt(int idx) throws Exception{
		if(idx==0) removefirst();
		else if(idx==size-1) removeLast();
		else{
			Node pNode = getNodeAt(idx-1);
		    Node cnode = getNodeAt(idx);
		    pNode.next = cnode.next;
		    this.size--;
		}
	}
	public void display(){
		Node temp = head;
		System.out.println("************************");
		while(temp!= null){
			System.out.print(temp.val+"   ");
			temp= temp.next;
		}
		System.out.println("**********************");
	}
	

}

