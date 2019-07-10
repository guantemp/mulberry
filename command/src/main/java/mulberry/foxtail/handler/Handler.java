package mulberry.foxtail.handler;

import cqrs.foxtail.command.Command;

/***
 * @author <a href="www.foxtail.cc/authors/guan xiangHuan">guan xiangHuang</a>
 * @since JDK8.0
 * @version 0.0.1 2019-06-17
 */
public interface Handler<T extends Command> {
    void handle(T command);
}
