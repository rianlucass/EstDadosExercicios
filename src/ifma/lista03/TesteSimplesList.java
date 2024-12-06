package ifma.lista03;

public class TesteSimplesList {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        list.addInicio(1);
        list.addInicio(2);
        list.addInicio(3);
        list.addFim(4);
        list.addFim(5);
        list.addFim(6);

        list.removerComeco();
        list.removerFinal();
        System.out.println(list.getMaiorValor());
        System.out.println(list.getMenorValor());
        System.out.println(list.getMedia());


        System.out.println("\nLista final: " + list.toString());

    }
}
