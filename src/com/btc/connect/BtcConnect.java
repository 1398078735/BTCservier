package com.btc.connect;

import com.alibaba.fastjson.JSONObject;
import com.btc.connect.constants.Constants;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;


public class BtcConnect {
    //RPC服务的用户名,应该与比特币客户端节点的配置文件中的配置一致
    //2,使用java网络通信进行rpc连接
    //httpclient,httpcore
    //发起一个post类型的网络请求，将第一步准备好的json格式数据发送给rpc服务器
    //private static CloseableHttpClient httpclient;
    //private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();


    //maven:管理和构建项目的依赖和配置
    //依赖的配置:xml文件
    //lib:lib库是存放程序的依赖库的目录
    //fastjson.jar:效率高的处理json格式的代码库
    public static void main(String[] args) {

        //1,准备要连接的json-rpc通信的json数据
        //fastjson.jar
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", System.currentTimeMillis() + "");//唯一标识
        jsonObject.put("jsonrpc", "2.0");//版本
        jsonObject.put("method", "getblockcount");//命令
        //jsonObject.put("params", 0);//参数
        //序列化
        String jsonRpcStr = jsonObject.toJSONString();
        System.out.println(jsonRpcStr);
        //2,使用java网络通信进行rpc连接
        //httpclient,httpcore
        //发起一个post类型的网络请求，将第一步准备好的json格式数据发送给rpc服务器
        CloseableHttpClient client = HttpClients.createDefault();
        //client执行一个post请求
        HttpPost post = new HttpPost(Constants.RPCURL);
        try {
            //设置请求头
            post.addHeader("Encoding","UTF-8");
            post.addHeader("Content-Type", "application/json");
            post.addHeader("Authorization", "Basic "+ BcRPCUtils.base64Encode(Constants.RPCUSER + ":" + Constants.RPCPASSWORD));
            //entity实体,
            //UNAUTHORIZED:unauthorized没有被授权
            StringEntity entity = new StringEntity(jsonRpcStr);
            post.setEntity(entity);//设置请求的数据
            HttpResponse response = client.execute(post);
            int code = response.getStatusLine().getStatusCode();//获取请求状态码
            // 判断是够请求成功
            if (code == HttpStatus.SC_OK) {
                System.out.println("状态码:" + code);
                System.out.println("请求成功!");
                // 获取返回的数据
                 String result = EntityUtils.toString(response.getEntity());
                 System.out.println(result);
            } else {
                System.out.println("状态码:"
                        + response.getStatusLine().getStatusCode());
                System.out.println("HttpPost方式请求失败!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3,接受java中的http形式的rpc连接的响应
        //4,处理结果
    }
}
