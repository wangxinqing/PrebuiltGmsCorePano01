package defpackage;

import java.net.URI;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: acuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuu implements acuv {
    public final HttpUriRequest a(URI uri) {
        return new HttpGet(uri);
    }
}
