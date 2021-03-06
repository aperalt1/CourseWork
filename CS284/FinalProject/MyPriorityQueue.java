/*
	@author John Spicer
*/
public class MyPriorityQueue extends MyMaxHeap
{
        private MyMaxHeap theQ;

	/*
		default constructor
	*/
        public MyPriorityQueue()
        {
		theQ = new MyMaxHeap();
        }

	/*
		@param cap: Capacity of the Queue to create
	*/
	public MyPriorityQueue(int cap)
	{
		//System.out.println("The cap is " + cap);
		theQ = new MyMaxHeap(cap);
	}
	
	/*
		@param arr: Array of Passenger to add to the Queue
		@param n: size of the Queue
	*/
        public MyPriorityQueue(Passenger[] arr, int n)
        {
                theQ = new MyMaxHeap(arr, n);
        }

	/*
		@param o: Passenger to enqueue to the queue
		@return MyMaxHeap.add(o)
	*/
        public boolean enqueue(Passenger o)
        {
		//theQ.parse();
                return theQ.add(o);
        }

	/*
		@return MyMaxHeap.removeMax()
	*/
        public Passenger dequeue()
        {
                return theQ.removeMax();
        }

	/*
		@return MyMaxHeap.getMax()
	*/
        public Passenger peek()
        {
                return theQ.getMax();
        }

	/*
		@return true if queue is empty, false otherwise
	*/
        public boolean empty()
        {
                if(theQ.size() <= 0)
                        return true;
                return false;
        }

	/*
		MyMaxHeap.parse()
	*/
	public void parse()
	{
		theQ.parse();
	}

	/*
		@return MyMaxHeap.size()
	*/
	public int getSize()
	{
		return theQ.size();
	}

}
