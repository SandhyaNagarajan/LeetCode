import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution1 {
	    public int mySqrt(int x) {
	    	int arraySize=x;
	    	int[] nums=new int[arraySize];
	    	if(x<4)
	    		return 1;
	        for(int i=1;i<arraySize;i++){
	        	nums[i]=i;
	        }
	        int left=0;
	        int right=nums.length-1;
	        while(left<=right){
	        	int mid= left+(right-left)/ 2;
	        	int squareValue=nums[mid]*nums[mid];
	        	if(x==squareValue)
	        		return mid;
	        	else if(squareValue > x)
                {
                    int squarevalueNextSmall=nums[mid-1]*nums[mid-1];
                    if(squarevalueNextSmall < x)
                        return mid-1;
                    else if(squarevalueNextSmall == x)
                    	return mid-1;
                    else
                        right=mid-1;
                }
	        	else
                {
                    int squarevalueNextBig=nums[mid+1]*nums[mid+1];
                    if(squarevalueNextBig > x)
                        return mid;
                    else if(squarevalueNextBig==x)
                    	return mid+1;
                    else
                        left=mid+1;
                }
	        		
	        		
	        	
	        }
			return -1;
	    }
	}

	public class sqrt {
	    public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        while ((line = in.readLine()) != null) {
	            int x = Integer.parseInt(line);
	            
	            int ret = new Solution1().mySqrt(x);
	            
	            String out = String.valueOf(ret);
	            
	            System.out.print(out);
	        }
	    }
	}
