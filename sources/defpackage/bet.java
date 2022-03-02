package defpackage;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;

/* renamed from: bet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bet implements Runnable {
    final /* synthetic */ Request a;
    final /* synthetic */ CacheDispatcher b;

    public bet(CacheDispatcher cacheDispatcher, Request request) {
        this.b = cacheDispatcher;
        this.a = request;
    }

    public final void run() {
        try {
            this.b.a.put(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
