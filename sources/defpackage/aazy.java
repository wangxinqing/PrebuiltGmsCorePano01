package defpackage;

import android.text.TextUtils;
import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aazy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazy extends Request implements NetworkCallbacks {
    private static final int g = aazz.a(5);
    private final Response.Listener d;
    private final aazm e;
    private final int f;

    public aazy(String str, Response.ErrorListener errorListener, Response.Listener listener, aazm aazm, int i) {
        super(1, str, errorListener);
        this.d = listener;
        this.e = aazm;
        this.f = i;
        setRetryPolicy(new DefaultRetryPolicy(g, 1, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        String str = (String) obj;
        Response.Listener listener = this.d;
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    public final byte[] getBody() {
        return this.e.k();
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Goog-Upload-Protocol", "resumable");
        hashMap.put("X-Goog-Upload-Command", "start");
        hashMap.put("X-Goog-Upload-Http-Method", "POST");
        hashMap.put("X-Goog-Upload-Header-Content-Length", Integer.toString(this.f));
        return hashMap;
    }

    public final void onPostNetworkDispatch() {
        izj.a();
    }

    public final void onPreNetworkDispatch() {
        izj.b(6144);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null || !str.equals("active")) {
            new Object[1][0] = str;
            return Response.error(new VolleyError("Unexpected status"));
        }
        String str2 = (String) networkResponse.headers.get("X-Goog-Upload-URL");
        if (TextUtils.isEmpty(str2)) {
            return Response.error(new VolleyError("Server did not provide an upload location"));
        }
        new Object[1][0] = str2;
        return Response.success(str2, (Cache.Entry) null);
    }
}
