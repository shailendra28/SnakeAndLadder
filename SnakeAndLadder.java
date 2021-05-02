
public class SnakeAndLadder {
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static int DIECOUNT = 0;
	public int runGame(int player) {
		
			int die = (int)Math.floor( ( ( Math.random() * 10 ) % 6) + 1);
			 DIECOUNT++;
			int choice=(int)Math.floor((Math.random()*10)%3);
			
			
			
			    switch(choice){
			    
			    case LADDER:
			    	
				System.out.println(" Current position is : " + die);
				player += die;
				if(player > 100){
					player -= die;
					int remaining = 100 - player;
					System.out.println(" Player needs exact " + remaining + " on die to win! ");
				
				}
				else
				{
					
					System.out.println(" Player got ladder, New position is : "  + player);
				}
				 break;
				
			    case SNAKE:
			    	
				    System.out.println(" Current position is : " + die);
				    player -= die;
				if(player < 0)
				{
					player = 0;
				}
				    System.out.println(" Player got the snake, New position is : " + player);
				break;
				
			default:
				    System.out.println(" No Play, Stay at the same position : " + player);
			}
			    if(choice == LADDER){
					return runGame(player);
	    }
			    else
					return player;
	}
	public static void main(String args[]){
		int player1 = 0 , player2 = 0;
		SnakeAndLadder snakeLadderObject = new SnakeAndLadder();
		while(player1 != 100 && player2 != 100){
			player1=snakeLadderObject.runGame(player1);
			System.out.println(" player1 current position is : " + player1);
			player2=snakeLadderObject.runGame(player2);
			System.out.println(" player2 current position is : " + player2);
		}
		if(player1 == 100){
			System.out.println(" player1 win the game !!!!!! ");
		}
		else if(player2 == 100){
			System.out.println(" player2 win the game !!!!!! ");
		}

		System.out.println(" Total number of times Die played is : " +  DIECOUNT);
	}

}
