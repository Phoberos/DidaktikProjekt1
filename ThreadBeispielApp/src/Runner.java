import javax.swing.JOptionPane;


public class Runner implements Runnable {

	public static String winner;
	public void runner(){
			for(int distance=1;distance<=100;distance++){
				System.out.println("Zurückgelegte Strecke von "+Thread.currentThread().getName()+":"+distance +"meters");
			// Überprüft ob Rennen von einem anderem Thread schon gewonnen wurde
			boolean isRaceWon = this.isRaceWon(distance);
			if(isRaceWon){
				break;
			}
		}
	}

	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon =  false;
		if((Runner.winner==null )&&(totalDistanceCovered==100)){
				String winnerName = Thread.currentThread().getName();
				Runner.winner = winnerName; //setting the winner name
				JOptionPane.showMessageDialog(null, "Erster ist: "+Runner.winner);
				isRaceWon = true;
			}else if(Runner.winner==null){
			isRaceWon = false;
			}else if(Runner.winner!=null){
				isRaceWon = true;
			}
		return isRaceWon;
		}

	@Override
	public void run() {
		this.runner();

	}

}