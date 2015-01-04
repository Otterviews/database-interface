package pool;

import akka.actor.Props;

import java.util.ArrayList;
import java.util.List;

public class DatabaseActorPool {
    private static DatabaseActorPool databaseActorPool = new DatabaseActorPool();
    private final List<Props> databaseActors;

    private DatabaseActorPool() {
        databaseActors = new ArrayList<>();
    }

    public static void registerActor(Props actorProps) {
        databaseActorPool.databaseActors.add(actorProps);
    }

    public static List<Props> getAllActors() {
        return databaseActorPool.databaseActors;
    }
}
