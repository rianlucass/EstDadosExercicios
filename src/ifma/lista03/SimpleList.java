package ifma.lista03;

public class SimpleList {
    Node tail;
    Node head;
    int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addInicio(int elemento) {
        Node node = new Node();
        node.elemento = elemento;
        node.next = tail;
        tail = node;
        if (isEmpty()) {
            head = node;
        }
        size++;
    }

    public void addFim(int elemento) {
        if (isEmpty()){
            addInicio(elemento);
            return;
        }

        Node node = new Node();
        node.elemento = elemento;
        Node local = tail;
        while(local.next != null) {
            local = local.next;
        }
        local.next = node;
        node.next = null;
        head = node;
        size++;
    }

    public int removerComeco() {
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        int elementoRemovido = tail.elemento;
        tail = tail.next;
        if (tail == null) {
            head = null;
        }
        size--;
        return elementoRemovido;
    }

    public int removerFinal() {
        if (isEmpty()) {
            throw new RuntimeException("Lista Vazia");
        }
        if (tail == head) {
            return removerComeco();
        }
        Node local = tail;
        while (local.next != head) {
            local = local.next;
        }
        int elementoRemovido = head.elemento;
        head = local;
        local.next = null;
        size--;
        return elementoRemovido;
    }

    public int getMaiorValor() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int maior = Integer.MIN_VALUE;
        Node local = tail;
        while (local != null) {
            if (local.elemento > maior) {
                maior = local.elemento;
            }
            local = local.next;
        }
        return maior;
    }

    public int getMenorValor() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int menor = Integer.MAX_VALUE;
        Node local = tail;
        while (local != null) {
            if (local.elemento < menor) {
                menor = local.elemento;
            }
            local = local.next;
        }
        return menor;
    }

    public double getMedia() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int soma = 0;
        Node local = tail;
        while (local != null) {
            soma += local.elemento;
            local = local.next;
        }
        return (double) soma / size;
    }



    @Override
    public String toString() {
        if (isEmpty()) {
            return "Lista vazia";
        }
        StringBuilder sb = new StringBuilder(">> ");
        Node local = tail;
        while (local != null) {
            sb.append(local.elemento).append(" -> ");
            local = local.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
