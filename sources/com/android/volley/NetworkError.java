package com.android.volley;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkError extends VolleyError {
    public NetworkError() {
    }

    public NetworkError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public NetworkError(Throwable th) {
        super(th);
    }
}
