import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
// Criando um set para armazenar numeros sorteados
Set<Integer> numerosSorteados = new HashSet<>();
Random random = new Random();

// Sorteando 06 numeros
while (numerosSorteados.size() < 6) {
    int numero = random.nextInt(60) + 1;
    numerosSorteados.add(numero);
    
}
List<Integer> numerosOrdenados = new ArrayList<>(numerosSorteados);
Collections.sort(numerosOrdenados);

//Exibindo numeros sorteados
System.out.println("Numeros sorteados: " + numerosOrdenados);
      
     }

}
