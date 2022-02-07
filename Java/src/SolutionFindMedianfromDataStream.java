package src;

import java.util.PriorityQueue;
import java.util.Queue;

public class SolutionFindMedianfromDataStream {
    public class MedianFinder {
        // 12 10 13 11 5 15
        // pqDesc [10], holds descending seq.
        // pqAsc []
        private Queue<Integer> pqAsc = new PriorityQueue<Integer>();
        private Queue<Integer> pqDesc = new PriorityQueue<Integer>((a,b)->b - a);
        
        /** initialize your data structure here. */
        public MedianFinder() {
            
        }
        
        public void addNum(int num) {
            if (pqAsc.size() == 0 && pqDesc.size() == 0 )
            {
                pqDesc.add(num);
            }
            else if ( num < pqDesc.peek() )
            {
                // try add to Desc seq.
                if ( pqDesc.size() - pqAsc.size() > 0 )
                    pqAsc.add(pqDesc.poll()); // re-balance
                pqDesc.add(num);
            }
            // peek will be null if size = 0
            else if ( pqAsc.size() != 0 && num > pqAsc.peek() )
            {
                // try to add Asc seq.
                if ( pqAsc.size() - pqDesc.size() > 0 )
                    pqDesc.add(pqAsc.poll()); // re-balance
                pqAsc.add(num);
            }
            else
            {
                // add to small container
                if ( pqDesc.size() <= pqAsc.size() )
                    pqDesc.add(num);
                else
                    pqAsc.add(num);
            }
        }
        
        public double findMedian() {
            int ascSize = pqAsc.size();
            int descSize = pqDesc.size();
            
            if ( ascSize == 0 && descSize == 0 ) return 0.0d;

            if ( ascSize > descSize ) return pqAsc.peek();
            if ( ascSize < descSize ) return pqDesc.peek();

            return (pqAsc.peek() + pqDesc.peek()) / 2;
        }
    }
}
