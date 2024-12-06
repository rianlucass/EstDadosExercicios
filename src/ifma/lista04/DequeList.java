package ifma.lista04;

public class DequeList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public DequeList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
            last = newNode;
        }
        size++;
    }

    public Node<T> getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia.");
        }
        return first;
    }

    public Node<T> getLast() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia.");
        }
        return last;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("lista vazia");
        }
        T data = getFirst().getData();
        if (first == last) {
            first = last = null;
        } else {
            first = first.getNext();
            first.setPrevious(null);
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia.");
        }
        T data = getLast().getData();
        if (first == last) {
            first = last = null;
        } else {
            last = last.getPrevious();
            last.setNext(null);
        }
        size--;
        return data;
    }

    public Node<T> search(String name) {
        Node<T> current = first;
        while (current != null) {
            if (current.getData() instanceof Aluno aluno && aluno.toString().contains(name)) {
                return current;
            }
            current = current.getNext();
        }
        throw new RuntimeException("Aluno " + name + " não foi encontrado.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = first;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
