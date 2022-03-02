package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExecutorDelivery implements ResponseDelivery {
    private final Executor a;

    public ExecutorDelivery(Handler handler) {
        this.a = new bev(handler);
    }

    public void postError(Request request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.a.execute(new bew(request, Response.error(volleyError), (Runnable) null));
    }

    public void postResponse(Request request, Response response) {
        postResponse(request, response, (Runnable) null);
    }

    public void postResponse(Request request, Response response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.a.execute(new bew(request, response, runnable));
    }

    public ExecutorDelivery(Executor executor) {
        this.a = executor;
    }
}
