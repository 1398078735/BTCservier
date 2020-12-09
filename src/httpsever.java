//import com.alibaba.fastjson.JSONObject;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//
//public class httpsever {
//    private static final String RPCURL = "http://127.0.0.1:8332";
//    public static String sendPost(JSONObject json, String URL) throws IOException {
//        String result = null;
//        httpclient = HttpClients.createDefault();
//        DefaultHttpClient client = new DefaultHttpClient();
//        HttpPost httpPost = new HttpPost(RPCURL);
//        httpPost.setHeader("Content-Type", "application/json");
//        httpPost.addHeader("Authorization", "basic ");
//
//        //设置请求和传输超时时间
//        httpPost.setConfig(requestConfig);
//        CloseableHttpResponse httpResp = httpclient.execute(httpPost);
//        try {
//            int statusCode = httpResp.getStatusLine().getStatusCode();
//            // 判断是够请求成功
//            if (statusCode == HttpStatus.SC_OK) {
//                System.out.println("状态码:" + statusCode);
//                System.out.println("请求成功!");
//                // 获取返回的数据
//                result = EntityUtils.toString(httpResp.getEntity(), "UTF-8");
//            } else {
//                System.out.println("状态码:"
//                        + httpResp.getStatusLine().getStatusCode());
//                System.out.println("HttpPost方式请求失败!");
//            }
//        } finally {
//            httpResp.close();
//            httpclient.close();
//        }
//        return result;
//    }
//}
