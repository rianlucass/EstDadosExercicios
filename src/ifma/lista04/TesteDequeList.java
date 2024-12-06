package ifma.lista04;

public class TesteDequeList {
    public static void main(String[] args) {
        DequeList<Aluno> deque = new DequeList<>();

        Aluno aluno1 = new Aluno("Rian Lucas", 8.5, 7.8);
        Aluno aluno2 = new Aluno("Erica", 7.1, 9.0);
        Aluno aluno3 = new Aluno("Enzo lucas", 6.0, 8.5);

        deque.addLast(aluno1);
        deque.addLast(aluno2);
        deque.addLast(aluno3);

        System.out.println("Deque inicial: " + deque);

        System.out.println("Primeiro elemento: " + deque.getFirst().getData());
        System.out.println("Último elemento: " + deque.getLast().getData());

        System.out.println("Removendo primeiro: " + deque.removeFirst());
        System.out.println("Deque após remover o primeiro: " + deque);

        System.out.println("Removendo último: " + deque.removeLast());
        System.out.println("Deque após remover o último: " + deque);

        deque.addLast(aluno1);
        deque.addLast(aluno2);
        System.out.println("Deque após adicionar novamente: " + deque);

        try {
            System.out.println("Buscando por 'Maria': " + deque.search("Maria").getData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Buscando por 'Pedro': " + deque.search("Pedro").getData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
