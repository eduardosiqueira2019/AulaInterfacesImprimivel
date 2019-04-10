import java.util.ArrayList;
import java.util.List;

public class Impressora {


    private List<Imprimivel> imprimivelList = new ArrayList<Imprimivel>();

    public void imprimirTudo(){
        for(int i = 0; i< imprimivelList.size();i++){
            System.out.println(imprimivelList.indexOf(i));
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimivelList.add(umImprimivel);
    }

}


