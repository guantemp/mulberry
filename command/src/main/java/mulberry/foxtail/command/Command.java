package mulberry.foxtail.command;

/***
 * @author <a href="www.foxtail.cc/authors/guan xiangHuan">guan xiangHuang</a>
 * @since JDK8.0
 * @version 0.0.1 2019-06-13
 */
public interface Command {
    <T> T identity();

    default int version() {
        return 1;
    }
}
