package mulberry.foxtail.exception;

/***
 * @author <a href="www.foxtail.cc/authors/guan xiangHuan">guan xiangHuang</a>
 * @since JDK8.0
 * @version 0.0.1 2019-06-17
 */
public abstract class CommandException extends RuntimeException {
    /**
     * 仅包含message, 没有cause, 不记录栈异常, 性能最高
     *
     * @param message the message
     */
    public CommandException(String message) {
        super(message, null, false, false);
    }

    /**
     * 包含message和cause, 会记录栈异常
     *
     * @param message the message
     * @param cause   the cause
     */
    public CommandException(String message, Throwable cause) {
        super(message, cause, false, true);
    }
}
