import akka.actor.ActorSystem;
import akka.actor.Props;
import clojure.java.api.Clojure;

public class DatabaseActorPool {
    private static DatabaseActorPool databaseActorPool = new DatabaseActorPool();

    private static ActorSystem databaseActorSystem;

    private DatabaseActorPool() {
        databaseActorSystem = ActorSystem.create("database");
    }

    private static void registerTitan() {
        databaseActorSystem.actorOf((Props) Clojure.var("titan-interface.core", "titan").invoke(), "Titan");
    }

    public ActorSystem getDatabaseActorSystem() {
        return databaseActorSystem;
    }
}
