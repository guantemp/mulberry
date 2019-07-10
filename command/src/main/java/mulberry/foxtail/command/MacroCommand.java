package mulberry.foxtail.command;

import java.util.Queue;

/***
 * @author <a href="www.foxtail.cc/authors/guan xiangHuan">guan xiangHuang</a>
 * @since JDK8.0
 * @version 0.0.1 2019-07-09
 */
public class MacroCommand implements Command {
    private Queue<Command> queue;

    public MacroCommand(Command command) {
    }

    @Override
    public <T> T identity() {
        return queue.peek().identity();
    }

    public boolean offer(Command command) {
        if (!queue.peek().identity().equals(command.identity()))
            throw new IllegalArgumentException("");
        return queue.offer(command);
    }
}
