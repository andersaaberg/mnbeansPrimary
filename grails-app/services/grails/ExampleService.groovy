package grails

import io.lettuce.core.api.StatefulRedisConnection
import org.springframework.beans.factory.annotation.Autowired


class ExampleService {
    @Autowired
//    Work around
//    @Qualifier("io.lettuce.core.api.StatefulRedisConnection(Primary)")
    private final StatefulRedisConnection statefulRedisConnection


    void something() {
        def commands = statefulRedisConnection.sync()
        commands.set("foo", "bar")
        println commands.get("foo")
    }
}