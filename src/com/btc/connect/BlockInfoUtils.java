package com.btc.connect;

import com.alibaba.fastjson.JSON;
import com.btc.connect.constants.Constants;
import com.btc.connect.result.Result;
import com.btc.connect.result.RpcResult;
import com.btc.connect.softutil.BlockChaininfo;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Set;

public class BlockInfoUtils {
    public static BlockChaininfo sendPost(Map<String, String> headers, String jsonStr) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(Constants.RPCURL);

        post.addHeader("Encoding", "UTF-8");
        post.addHeader("Content-Type", "application/json");

        //Map：key -> value
//        Map map = new HashMap();
        //);

        if (headers != null) {
            Set<String> keys = headers.keySet();
            for (String key: keys) {
                String value = headers.get(key);
                post.addHeader(key, value);
            }
        }

        try {
            StringEntity entity = new StringEntity(jsonStr);
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            int code = response.getStatusLine().getStatusCode();
            Result result = new Result();//请求返回的结果
            if (code == HttpStatus.SC_OK) {//状态码正常
                String resEntity = EntityUtils.toString(response.getEntity());
                result.setCode(code);
                result.setMsg("请求成功");
                //将相应的数据反序列化为类对象
                BlockChaininfo blockChaininfo = JSON.parseObject(resEntity, BlockChaininfo.class);
                return blockChaininfo;
            }else {
                result.setCode(code);
                result.setMsg("请求失败");
                result.setData(null);
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String base64Encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes(StandardCharsets.UTF_8));
    }
}