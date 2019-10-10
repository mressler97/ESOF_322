

public class Client {

    public static void main(String[] args) {
        Context db = new Context();

        db.setStoreStrategy(new Relational());
        db.store();

        db.setStoreStrategy(new NoSQL());
        db.store();

        db.setStoreStrategy(new Graph());
        db.store();
    }
}
