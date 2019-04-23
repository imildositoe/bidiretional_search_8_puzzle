package searchs;

import java.util.ArrayList;
import java.util.Collections;


public class Bidirectional {

    private ArrayList<String> startToGoal;
    private ArrayList<String> goalToStart;

    public Bidirectional(ArrayList<String> startToGoal, ArrayList<String> goalToStart) {
        this.startToGoal = startToGoal;
        this.goalToStart = goalToStart;
    }

    public ArrayList<String> match() {
        ArrayList<String> caminho = new ArrayList<>();

        ArrayList<String> stg = startToGoal;
        boolean flag = false;
        int contador = 0;
        for (int i = 0; i < stg.size(); i++) {
            for (int k = 0; k <= i; k++) {
                if (stg.get(i).equals(goalToStart.get(k))) {
                    contador = k;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                for (int j = 0; j < i; j++) {
                    caminho.add(stg.get(j));
                }
                for (int l = contador; l >= 0; l--) {
                    caminho.add(goalToStart.get(l));
                }
                Collections.reverse(caminho);
                break;
            }
        }
        return caminho;
    }
}
