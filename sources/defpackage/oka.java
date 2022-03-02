package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: oka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oka implements Future, Response.Listener, Response.ErrorListener {
    private final RequestFuture a = RequestFuture.newFuture();
    private final Response.Listener b;

    public oka(Response.Listener listener) {
        this.b = listener;
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.onErrorResponse(volleyError);
    }

    public final void onResponse(Object obj) {
        Response.Listener listener = this.b;
        if (listener != null) {
            listener.onResponse(obj);
        }
        this.a.onResponse(obj);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
