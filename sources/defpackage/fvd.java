package defpackage;

import android.app.PendingIntent;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.Map;

/* renamed from: fvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvd extends Request implements NetworkCallbacks {
    private final Map d;
    private final byte[] e;
    private final Response.Listener f;
    private final int g;

    public fvd(int i, String str, Response.Listener listener, Response.ErrorListener errorListener, Map map, byte[] bArr, int i2) {
        super(i, str, errorListener);
        this.f = listener;
        this.d = map;
        this.e = bArr;
        this.g = i2;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f.onResponse((ProxyResponse) obj);
    }

    public final byte[] getBody() {
        return this.e;
    }

    public final Map getHeaders() {
        return this.d;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.a(4100, this.g);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        Map map = networkResponse.headers;
        return Response.success(new ProxyResponse(1, 0, (PendingIntent) null, i, ProxyResponse.a(map), networkResponse.data), HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
