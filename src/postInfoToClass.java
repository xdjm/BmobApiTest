import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by jm on 2017/8/10.
 * 对单个列表添加信息
 */
public class postInfoToClass {
    static public void main(String[]args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn/")
                .build();
        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n\t\"url\":\"http://ww4.sinaimg.cn/large/7a8aed7bgw1esfbgw6vc3j20gy0pedic.jpg\",\n\t\"subtitle\":\"不是美女4\"\n}");
        Response<ResponseBody> response = retrofitApi.post(body).execute();
        LOGGER.info(response.message());
    }
}
