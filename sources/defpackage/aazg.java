package defpackage;

import com.android.volley.Cache;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.server.NetworkCallbacks;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aazg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazg extends Request implements NetworkCallbacks {
    private static final int h = aazz.a(15);
    private final Response.Listener d;
    private final int e;
    private final byte[] f;
    private final boolean g;

    public aazg(String str, Response.ErrorListener errorListener, Response.Listener listener, int i, byte[] bArr, boolean z) {
        super(1, str, errorListener);
        this.d = listener;
        this.e = i;
        this.f = bArr;
        this.g = z;
        setRetryPolicy(new DefaultRetryPolicy(h, 0, 1.0f));
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        Integer num = (Integer) obj;
        Response.Listener listener = this.d;
        if (listener != null) {
            listener.onResponse(num);
        }
    }

    public final byte[] getBody() {
        return this.f;
    }

    public final String getBodyContentType() {
        return "application/octet-stream";
    }

    public final Map getHeaders() {
        HashMap hashMap = new HashMap();
        if (this.g) {
            hashMap.put("X-Goog-Upload-Command", "upload, finalize");
        } else {
            hashMap.put("X-Goog-Upload-Command", "upload");
        }
        hashMap.put("X-Goog-Upload-Http-Method", "POST");
        hashMap.put("X-Goog-Upload-Offset", Integer.toString(this.e));
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
        new Object[1][0] = Integer.valueOf(networkResponse.statusCode);
        int i = networkResponse.statusCode;
        if (i != 200) {
            return Response.error(new VolleyError(String.format("Received status %d from server", new Object[]{Integer.valueOf(i)})));
        }
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null) {
            return Response.error(new VolleyError("Response did not include the upload status header"));
        }
        if (!str.equals("final")) {
            if (str.equals("active")) {
                return Response.success(0, (Cache.Entry) null);
            }
            new Object[1][0] = str;
            return Response.error(new VolleyError("Server returned unknown status value"));
        } else if (this.g) {
            return Response.success(0, (Cache.Entry) null);
        } else {
            return Response.success(1, (Cache.Entry) null);
        }
    }
}
