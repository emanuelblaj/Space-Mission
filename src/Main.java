import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		Set up a new rocket simulation
		
		Simulation simulation = new Simulation();
		
//		load rocket cargo item manifests
		File phase1 = new File("resources/phase-1.txt");
		File phase2 = new File("resources/phase-2.txt");
		ArrayList<Item> itemsPhase1;
		ArrayList<Item> itemsPhase2;
		ArrayList<U1> u1Phase1;
		ArrayList<U1> u1Phase2;
		ArrayList<U2> u2Phase1;
		ArrayList<U2> u2Phase2;
		
		itemsPhase1 = simulation.loadItems(phase1);
		itemsPhase2 = simulation.loadItems(phase2);
		
		
//		Populate U1 and U2 rockets
		u1Phase1 = simulation.loadU1(itemsPhase1);
		u1Phase2 = simulation.loadU1(itemsPhase2);
		
		u2Phase1 = simulation.loadU2(itemsPhase1);
		u2Phase2 = simulation.loadU2(itemsPhase2);

		
//		Simulate rocket launches to estimate overall cost per mission in millions
		
		double u1Ave = 0;
		double u2Ave = 0;
		
		for(int i = 0; i < 1000000; i++) {
			u1Ave += simulation.runSimulation(u1Phase1);
			u1Ave += simulation.runSimulation(u1Phase2);
			
		}
		
		for(int i = 0; i < 1000000; i++) {
			u2Ave += simulation.runSimulation(u2Phase1);
			u2Ave += simulation.runSimulation(u2Phase2);
			
		}
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("The average cost of the U1 mission over " +
		 "a million simulations is " +
			formatter.format((u1Ave / 1000000) * 1000));
		System.out.println("The average cost of the U2 mission over " +
			"a million simulations is " +
				formatter.format((u2Ave / 1000000) * 1000));
	}

}
