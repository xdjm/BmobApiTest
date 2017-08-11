import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by jm on 2017/8/10.
 * retrofit接口
 * Bmob全案例
 */
public interface RetrofitApi {

    //https://api.bmob.cn/1/classes/Project
    @Headers({"x-bmob-application-id:fc845d2c89dcdab10aad9b17d4805f79",
            "x-bmob-rest-api-key:cc261ab628d365f1788c9fbb5a0be2e1",
            "content-type:application/json"})
    @GET("/1/classes/{project}")
    Call<ResponseBody> get
    (@Path("project") String project);

    // https://api.bmob.cn/1/classes/TableName/objectId
    @Headers({"x-bmob-application-id:fc845d2c89dcdab10aad9b17d4805f79",
            "x-bmob-rest-api-key:cc261ab628d365f1788c9fbb5a0be2e1",
            "content-type:application/json"})
    @POST("/1/classes/Project/")
    Call<ResponseBody> post(@Body RequestBody requestBody);

    //https://api.bmob.cn/1/classes/TableName/objectId
    @Headers({"x-bmob-application-id:fc845d2c89dcdab10aad9b17d4805f79",
            "x-bmob-rest-api-key:cc261ab628d365f1788c9fbb5a0be2e1",
            "content-type:application/json"})
    @PUT("/1/classes/Project/{id}")
    Call<ResponseBody> put(@Path("id") String id,@Body RequestBody requestBody);

    //https://api.bmob.cn/1/classes/TableName/objectId
    @Headers({"x-bmob-application-id:fc845d2c89dcdab10aad9b17d4805f79",
            "x-bmob-rest-api-key:cc261ab628d365f1788c9fbb5a0be2e1",
            "content-type:application/json"})
    @DELETE("/1/classes/Project/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
