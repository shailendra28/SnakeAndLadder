
public class SnakeAndLadder {
	public static final int LADDER=1;
	public static final int SNAKE=2;
    public static void main(String[] args) {
			int position = 0;
			System.out.println("Current Position is : " + position);
			
			while(position < 100){
			int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
			int choice=(int)Math.floor((Math.random()*10)%3);
			System.out.println("Number on die is : " + die);
			
			
			    switch(choice){
			    
			    case LADDER:
			    	
				System.out.println("Current position is : " + die);
				position += die;
				if(position >= 100){
					System.out.println("Player win the game!!!!! ");
				}
				else{
					
					System.out.println("Player got ladder, New position is : " + position);
				}
				break;
				
			    case SNAKE:
			    	
				    System.out.println("Current position is : " + die);
				position -= die;
				if(position < 0){
					position = 0;
				}
				    System.out.println("Player got the snake, New position is : " + position);
				break;
				
			default:
				    System.out.println("No Play, Stay at the same position : " + position);
			}
	    }	
	}

}
