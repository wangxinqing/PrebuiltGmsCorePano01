package defpackage;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: acuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuw implements acuv {
    private final String a;
    private final HttpEntity b;

    public acuw(String str, HttpEntity httpEntity) {
        this.a = str;
        this.b = httpEntity;
    }

    public final HttpUriRequest a(URI uri) {
        HttpPost httpPost = new HttpPost(uri);
        String str = this.a;
        if (str != null) {
            httpPost.addHeader("X-HTTP-Method-Override", str);
        }
        httpPost.setEntity(this.b);
        return httpPost;
    }
}
