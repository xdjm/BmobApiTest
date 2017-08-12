import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by jm on 2017/8/12.
 * 查询对象中的信息
 */
public class queryInfoFromClass {
    static public void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn/")
                .build();
        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        Response<ResponseBody> response = retrofitApi.query("Project","{\"subtitle\":\"不是美女4\"}").execute();
        LOGGER.info(response.body().string());
        //{"updatedAt":"2017-08-11 22:35:11"}
    }
}
