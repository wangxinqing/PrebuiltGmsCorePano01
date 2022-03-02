package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StringRequest extends Request {
    public final Object d;
    private Response.Listener e;

    public StringRequest(int i, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.d = new Object();
        this.e = listener;
    }

    public void cancel() {
        super.cancel();
        synchronized (this.d) {
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException e2) {
            str = new String(networkResponse.data);
        }
        return Response.success(str, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(String str) {
        Response.Listener listener;
        synchronized (this.d) {
            listener = this.e;
        }
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    public StringRequest(String str, Response.Listener listener, Response.ErrorListener errorListener) {
        this(0, str, listener, errorListener);
    }
}
