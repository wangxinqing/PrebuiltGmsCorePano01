package com.android.volley;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VolleyError extends Exception {
    public long a;
    public final NetworkResponse networkResponse;

    public VolleyError() {
        this.networkResponse = null;
    }

    public long getNetworkTimeMs() {
        return this.a;
    }

    public VolleyError(NetworkResponse networkResponse2) {
        this.networkResponse = networkResponse2;
    }

    public VolleyError(String str) {
        super(str);
        this.networkResponse = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.networkResponse = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}
