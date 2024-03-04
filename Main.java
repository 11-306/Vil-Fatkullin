public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.push(1);
        q.push(2);
        q.push(3);

        q.print();

        System.out.println("Удаленный элемент: " + q.pop());

        System.out.println("Первый элемент: " + q.front());

        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.push(8);

        q.print();

        System.out.println("Размер: " + q.size());

        q.push(9);
        q.push(10);
        q.pop();
        q.push(11);

        q.print();

        q.clear();

        q.print();

        System.out.println("Размер: " + q.size());
    }
}
