package mk.petrovski.weathergurumvp.data.remote.helper.error;

/**
 * Created by Nikola Petrovski on 2/22/2017.
 */
public class ServerException extends Throwable {
  public ServerException(Throwable throwable) {
    super(throwable);
  }
}
