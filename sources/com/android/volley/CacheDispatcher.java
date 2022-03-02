package com.android.volley;

import android.os.Process;
import com.android.volley.Cache;
import java.util.concurrent.BlockingQueue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CacheDispatcher extends Thread {
    private static final boolean c = VolleyLog.DEBUG;
    public final BlockingQueue a;
    public final ResponseDelivery b;
    private final BlockingQueue d;
    private final Cache e;
    private volatile boolean f = false;
    private final beu g;

    public CacheDispatcher(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.d = blockingQueue;
        this.a = blockingQueue2;
        this.e = cache;
        this.b = responseDelivery;
        this.g = new beu(this);
    }

    private void a() {
        Request request = (Request) this.d.take();
        request.addMarker("cache-queue-take");
        request.a(1);
        try {
            if (!request.isCanceled()) {
                Cache.Entry entry = this.e.get(request.getCacheKey());
                if (entry == null) {
                    request.addMarker("cache-miss");
                    if (!this.g.b(request)) {
                        this.a.put(request);
                    }
                } else if (!entry.isExpired()) {
                    request.addMarker("cache-hit");
                    Response parseNetworkResponse = request.parseNetworkResponse(new NetworkResponse(entry.data, entry.responseHeaders));
                    request.addMarker("cache-hit-parsed");
                    if (entry.refreshNeeded()) {
                        request.addMarker("cache-hit-refresh-needed");
                        request.setCacheEntry(entry);
                        parseNetworkResponse.intermediate = true;
                        if (!this.g.b(request)) {
                            this.b.postResponse(request, parseNetworkResponse, new bet(this, request));
                        } else {
                            this.b.postResponse(request, parseNetworkResponse);
                        }
                    } else {
                        this.b.postResponse(request, parseNetworkResponse);
                    }
                } else {
                    request.addMarker("cache-hit-expired");
                    request.setCacheEntry(entry);
                    if (!this.g.b(request)) {
                        this.a.put(request);
                    }
                }
            } else {
                request.a("cache-discard-canceled");
            }
        } finally {
            request.a(2);
        }
    }

    public void quit() {
        this.f = true;
        interrupt();
    }

    public void run() {
        if (c) {
            VolleyLog.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.e.initialize();
        while (true) {
            try {
                a();
            } catch (InterruptedException e2) {
                if (!this.f) {
                    VolleyLog.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
