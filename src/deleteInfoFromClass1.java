import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by jm on 2017/8/11.
 * 删除对象中的信息
 */
public class deleteInfoFromClass1 {
    static public void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn/")
                .build();
        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        Response<ResponseBody> response = retrofitApi.delete("4dc6ea83c1").execute();
        LOGGER.info(response.body().string());
        //{"updatedAt":"2017-08-11 22:35:11"}
    }
}
