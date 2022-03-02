package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;

/* renamed from: emt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emt {
    public static HttpResponse a(String str, String str2, HttpEntity httpEntity, Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iiv.a(context, linkedHashMap, str2);
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            linkedHashMap.put(contentType.getName(), contentType.getValue());
        }
        return a(str, httpEntity, linkedHashMap);
    }

    public static String b(HttpResponse httpResponse) {
        byte[] a = a(httpResponse);
        return a != null ? new String(a, amqn.c) : "";
    }

    public static HttpResponse a(String str, HttpEntity httpEntity, Map map) {
        gjm gjm = (gjm) gjm.a.b();
        HttpPost httpPost = new HttpPost(str);
        httpPost.setEntity(httpEntity);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpPost.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        opc.a((HttpRequest) httpPost);
        return gjm.a(httpPost);
    }

    public static byte[] a(HttpResponse httpResponse) {
        InputStream a = opc.a(httpResponse.getEntity());
        if (a != null) {
            return jjt.b(a);
        }
        return null;
    }
}
