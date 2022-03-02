package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RequestFuture implements Future, Response.Listener, Response.ErrorListener {
    private Request a;
    private boolean b = false;
    private Object c;
    private VolleyError d;

    private RequestFuture() {
    }

    private final synchronized Object a(Long l) {
        VolleyError volleyError = this.d;
        if (volleyError != null) {
            throw new ExecutionException(volleyError);
        } else if (!this.b) {
            if (l == null) {
                while (!isDone()) {
                    wait(0);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            VolleyError volleyError2 = this.d;
            if (volleyError2 != null) {
                throw new ExecutionException(volleyError2);
            } else if (this.b) {
                return this.c;
            } else {
                throw new TimeoutException();
            }
        } else {
            return this.c;
        }
    }

    public static RequestFuture newFuture() {
        return new RequestFuture();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.android.volley.Request r2 = r1.a     // Catch:{ all -> 0x0016 }
            r0 = 0
            if (r2 == 0) goto L_0x0014
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0014
            com.android.volley.Request r2 = r1.a     // Catch:{ all -> 0x0016 }
            r2.cancel()     // Catch:{ all -> 0x0016 }
            r2 = 1
            monitor-exit(r1)
            return r2
        L_0x0014:
            monitor-exit(r1)
            return r0
        L_0x0016:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.RequestFuture.cancel(boolean):boolean");
    }

    public Object get() {
        try {
            return a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public boolean isCancelled() {
        Request request = this.a;
        if (request != null) {
            return request.isCanceled();
        }
        return false;
    }

    public synchronized boolean isDone() {
        return this.b || this.d != null || isCancelled();
    }

    public synchronized void onErrorResponse(VolleyError volleyError) {
        this.d = volleyError;
        notifyAll();
    }

    public synchronized void onResponse(Object obj) {
        this.b = true;
        this.c = obj;
        notifyAll();
    }

    public void setRequest(Request request) {
        this.a = request;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
