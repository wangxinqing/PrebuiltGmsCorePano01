package com.android.volley;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ResponseDelivery {
    void postError(Request request, VolleyError volleyError);

    void postResponse(Request request, Response response);

    void postResponse(Request request, Response response, Runnable runnable);
}
