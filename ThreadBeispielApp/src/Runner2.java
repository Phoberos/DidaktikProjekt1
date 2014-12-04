import javax.swing.JOptionPane;


public class Runner2 extends Thread {

	public static String winner;
	public static String race;
	public void runner(){
			for(int distance=1;distance<=100;distance++){
				if(race != null){
					race = race +"\nZurückgelegte Strecke von "+Thread.currentThread().getName()+":"+distance +"meters";}
				else{
					race = "Zurückgelegte Strecke von "+Thread.currentThread().getName()+":"+distance +"meters";}
			// Überprüft ob Rennen von einem anderem Thread schon gewonnen wurde
			boolean isRaceWon = this.isRaceWon(distance);
			if(isRaceWon){
				break;
			}
		}
	}

	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon =  false;
		if((Runner2.winner==null )&&(totalDistanceCovered==100)){
				String winnerName = Thread.currentThread().getName();
				Runner2.winner = winnerName; //Namen übergeben
				race = race + "\nErster ist :"+Runner2.winner;
				JOptionPane.showMessageDialog(null, "Erster ist: "+Runner2.winner);
				isRaceWon = true;
			}else if(Runner2.winner==null){
			isRaceWon = false;
			}else if(Runner2.winner!=null){
				Window raceResult = new Window(race);
				isRaceWon = true;
			}
		
		return isRaceWon;
		}

	@Override
	public void run() {
		this.runner();

	}
	
}