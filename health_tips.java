import java.util.Random;

public class health_tips {
	
		health_tips(){
			Random_tip_generator();
		}
	

		
	    String arr[] = {"Use an App to Keep Track of Your Movement, Sleep, and Heart Rate \n"
				, "Find Ways to Manage Your Emotions \n" , "Go Easy on Alcohol and Stay Sober \n" , "Get Enough Good Sleep \n"
				,"Reduce Sitting and Screen Time \n" ,"Exercise Regularly and Be Physically Active \n","Drink Water and Stay Hydrated, and Limit Sugared Beverages \n"
				,"Take Multivitamin Supplements \n","Measure and Watch Your Weight \n","Limit Unhealthy Foods and Eat Healthy Meals \n"};
	    
	    void Random_tip_generator() {
	    	System.out.println(arr[new Random().nextInt(arr.length)]);
        
		}
        public static void main(String[] args) {
        	health_tips ht=new health_tips();
        }
}
