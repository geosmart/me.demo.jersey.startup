##spring+jersey rest service startup
---
1. mvn package
* tomcat部署
* postman等rest工具测试
---
* get服务测试
<table>  
    <tr>
        <td style="min-width:50px">url</td>
        <td>http://localhost:8080/jersey.startup/rest/v100/obj/get</td>
    </tr>
    <tr>
        <td>参数</td>
        <td>userName=geosmart&token=902370e-4c95-42f2-a1b7-cfc2fdbc5ac3</td>
    </tr>
    <tr>
        <td>结果</td>
        <td><pre>
            {
    "token": "902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
    "message": {
        "request": "http://localhost:8080/jersey.startup/rest/v100/obj/get?userName=geosmart&token=902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
        "statusCode": 200,
        "reasonPhrase": "OK"
    },
    "result": "geosmart：Hello World！"
}
</pre>
</td>
    </tr>
</table> 


* post服务测试
<table>  
    <tr>
        <td style="min-width:50px">url</td>
        <td>http://localhost:8080/jersey.startup/rest/v100/obj/post</td>
    </tr>
    <tr>
        <td>参数<br/>(application/json)</td>
        <td><pre>
           {
    "token": "5902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
    "data": {
        "param": {
            "param1": "param1",
            "param2": "param2"
        },
        "filter": {
            "filter1": "filter1",
            "filter2": "filter2"
        },
        "items": [
            {
                "id": "5902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
                "item": {
                    "prop2": "prop2",
                    "prop1": "prop1"
                }
            }
        ]
    }
}
</pre></td>
    </tr>
    <tr>
        <td>结果</td>
        <td><pre>
          {
    "token": "5902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
    "message": {
        "request": "http://localhost:8080/jersey.startup/rest/v100/obj/post",
        "statusCode": 200,
        "reasonPhrase": "OK"
    },
    "result": {
        "param": {
            "param1": "param1",
            "param2": "param2"
        },
        "filter": {
            "filter1": "filter1",
            "filter2": "filter2"
        },
        "items": [
            {
                "id": "5902370e-4c95-42f2-a1b7-cfc2fdbc5ac3",
                "item": {
                    "prop2": "prop2",
                    "prop1": "prop1"
                }
            }
        ]
    }
}
</pre>
</td>
    </tr>
</table>  