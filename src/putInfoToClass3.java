import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by jm on 2017/8/11.
 * 更新对象中的json格式的参数
 */
public class putInfoToClass3 {
    static public void main(String[]args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn/")
                .build();
        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"http.gender\":\"女\"}");
        Response<ResponseBody> response = retrofitApi.put("4dc6ea83c1",body).execute();
        LOGGER.info(response.body().string());
        //{"updatedAt":"2017-08-11 22:35:11"}
    }
}
