package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class JsonRequest extends Request {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String e = String.format("application/json; charset=%s", new Object[]{PROTOCOL_CHARSET});
    public final Object d;
    private Response.Listener f;
    private final String g;

    public JsonRequest(int i, String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.d = new Object();
        this.f = listener;
        this.g = str2;
    }

    public void cancel() {
        super.cancel();
        synchronized (this.d) {
            this.f = null;
        }
    }

    public void deliverResponse(Object obj) {
        Response.Listener listener;
        synchronized (this.d) {
            listener = this.f;
        }
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    public byte[] getBody() {
        try {
            String str = this.g;
            if (str != null) {
                return str.getBytes(PROTOCOL_CHARSET);
            }
            return null;
        } catch (UnsupportedEncodingException e2) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.g, PROTOCOL_CHARSET);
            return null;
        }
    }

    public String getBodyContentType() {
        return e;
    }

    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    public abstract Response parseNetworkResponse(NetworkResponse networkResponse);

    @Deprecated
    public JsonRequest(String str, String str2, Response.Listener listener, Response.ErrorListener errorListener) {
        this(-1, str, str2, listener, errorListener);
    }
}
