import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import java.io.IOException;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
/**
 * Created by jm on 2017/8/10.
 * 得到单个列表的所有信息
 */
public class getClassInfo {
    static public void main(String[]args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bmob.cn/")
                .build();

        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        Response<ResponseBody> response = retrofitApi.get("Project").execute();
        LOGGER.info(response.body().string());
        //异步处理
//        retrofitApi.query("Project").enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    LOGGER.info(response.body().string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
//
//            }
//        });
    }
}
