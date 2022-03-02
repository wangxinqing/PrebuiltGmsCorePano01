package com.android.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.Cache;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkDispatcher extends Thread {
    private final BlockingQueue a;
    private final Network b;
    private final Cache c;
    private final ResponseDelivery d;
    private volatile boolean e = false;

    public NetworkDispatcher(BlockingQueue blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.a = blockingQueue;
        this.b = network;
        this.c = cache;
        this.d = responseDelivery;
    }

    private void a() {
        beu beu;
        List<Request> list;
        Request request = (Request) this.a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.a(3);
        try {
            request.addMarker("network-queue-take");
            if (!request.isCanceled()) {
                int i = Build.VERSION.SDK_INT;
                TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
                NetworkResponse performRequest = this.b.performRequest(request);
                request.addMarker("network-http-complete");
                if (performRequest.notModified && request.hasHadResponseDelivered()) {
                    request.a("not-modified");
                    request.a();
                } else {
                    Response parseNetworkResponse = request.parseNetworkResponse(performRequest);
                    request.addMarker("network-parse-complete");
                    if (request.shouldCache() && parseNetworkResponse.cacheEntry != null) {
                        this.c.put(request.getCacheKey(), parseNetworkResponse.cacheEntry);
                        request.addMarker("network-cache-written");
                    }
                    request.markDelivered();
                    this.d.postResponse(request, parseNetworkResponse);
                    synchronized (request.b) {
                        beu = request.c;
                    }
                    if (beu != null) {
                        Cache.Entry entry = parseNetworkResponse.cacheEntry;
                        if (entry == null || entry.isExpired()) {
                            beu.a(request);
                        } else {
                            String cacheKey = request.getCacheKey();
                            synchronized (beu) {
                                list = (List) beu.a.remove(cacheKey);
                            }
                            if (list != null) {
                                if (VolleyLog.DEBUG) {
                                    VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                                }
                                for (Request postResponse : list) {
                                    beu.b.b.postResponse(postResponse, parseNetworkResponse);
                                }
                            }
                        }
                    }
                }
            } else {
                request.a("network-discard-cancelled");
                request.a();
            }
        } catch (VolleyError e2) {
            e2.a = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.d.postError(request, request.parseNetworkError(e2));
            request.a();
        } catch (Exception e3) {
            try {
                VolleyLog.e(e3, "Unhandled exception %s", e3.toString());
                VolleyError volleyError = new VolleyError((Throwable) e3);
                volleyError.a = SystemClock.elapsedRealtime() - elapsedRealtime;
                this.d.postError(request, volleyError);
                request.a();
            } catch (Throwable th) {
                request.a(4);
                throw th;
            }
        }
        request.a(4);
    }

    public void quit() {
        this.e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException e2) {
                if (!this.e) {
                    VolleyLog.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                } else {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
