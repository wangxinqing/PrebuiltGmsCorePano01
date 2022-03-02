package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearCacheRequest extends Request {
    private final Cache d;
    private final Runnable e;

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, (String) null, (Response.ErrorListener) null);
        this.d = cache;
        this.e = runnable;
    }

    public void deliverResponse(Object obj) {
    }

    public Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }

    public boolean isCanceled() {
        this.d.clear();
        if (this.e == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.e);
        return true;
    }

    /* access modifiers changed from: protected */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }
}
