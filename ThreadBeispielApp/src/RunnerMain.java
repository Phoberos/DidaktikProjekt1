
public class RunnerMain {
	public static void main(String[] args) {
		
//		Runner racer = new Runner();
//		 Thread riaThread = new Thread(racer, "Ria");
//		 Thread sebastianThread = new Thread(racer, "Sebastian");
//		 Thread markusThread = new Thread(racer, "Markus");
//		 Thread evaThread = new Thread(racer, "eva");
//		 //Thread wird mit der start() gestartet  
//		 riaThread.start();
//		 sebastianThread.start();
//		 markusThread.start();
//		 evaThread.start();
		 
		 
		
		
		
		
		
		Runner2 ria2Thread = new Runner2();
		Runner2 sebastian2Thread = new Runner2();
		Runner2 markus2Thread = new Runner2();
		Runner2 eva2Thread = new Runner2();
		ria2Thread.setName("Ria");
		sebastian2Thread.setName("sebastian");
		markus2Thread.setName("markus");
		eva2Thread.setName("eva");
		ria2Thread.start();
		sebastian2Thread.start();
		markus2Thread.start();
		eva2Thread.start();
	
	}
}
