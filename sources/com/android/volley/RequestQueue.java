package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RequestQueue {
    public final Set a;
    public final List b;
    private final AtomicInteger c;
    private final PriorityBlockingQueue d;
    private final PriorityBlockingQueue e;
    private final Cache f;
    private final Network g;
    private final ResponseDelivery h;
    private final NetworkDispatcher[] i;
    private CacheDispatcher j;
    private final List k;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public @interface RequestEvent {
        public static final int REQUEST_CACHE_LOOKUP_FINISHED = 2;
        public static final int REQUEST_CACHE_LOOKUP_STARTED = 1;
        public static final int REQUEST_FINISHED = 5;
        public static final int REQUEST_NETWORK_DISPATCH_FINISHED = 4;
        public static final int REQUEST_NETWORK_DISPATCH_STARTED = 3;
        public static final int REQUEST_QUEUED = 0;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface RequestEventListener {
        void onRequestEvent(Request request, int i);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface RequestFilter {
        boolean apply(Request request);
    }

    @Deprecated
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface RequestFinishedListener {
        void onRequestFinished(Request request);
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }

    /* access modifiers changed from: package-private */
    public final void a(Request request, int i2) {
        synchronized (this.k) {
            for (RequestEventListener onRequestEvent : this.k) {
                onRequestEvent.onRequestEvent(request, i2);
            }
        }
    }

    public Request add(Request request) {
        request.setRequestQueue(this);
        synchronized (this.a) {
            this.a.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        a(request, 0);
        if (!request.shouldCache()) {
            this.e.add(request);
            return request;
        }
        this.d.add(request);
        return request;
    }

    public void addRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.k) {
            this.k.add(requestEventListener);
        }
    }

    @Deprecated
    public void addRequestFinishedListener(RequestFinishedListener requestFinishedListener) {
        synchronized (this.b) {
            this.b.add(requestFinishedListener);
        }
    }

    public void cancelAll(RequestFilter requestFilter) {
        synchronized (this.a) {
            for (Request request : this.a) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    public Cache getCache() {
        return this.f;
    }

    public int getSequenceNumber() {
        return this.c.incrementAndGet();
    }

    public void removeRequestEventListener(RequestEventListener requestEventListener) {
        synchronized (this.k) {
            this.k.remove(requestEventListener);
        }
    }

    @Deprecated
    public void removeRequestFinishedListener(RequestFinishedListener requestFinishedListener) {
        synchronized (this.b) {
            this.b.remove(requestFinishedListener);
        }
    }

    public void start() {
        stop();
        CacheDispatcher cacheDispatcher = new CacheDispatcher(this.d, this.e, this.f, this.h);
        this.j = cacheDispatcher;
        cacheDispatcher.start();
        for (int i2 = 0; i2 < this.i.length; i2++) {
            NetworkDispatcher networkDispatcher = new NetworkDispatcher(this.e, this.g, this.f, this.h);
            this.i[i2] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        CacheDispatcher cacheDispatcher = this.j;
        if (cacheDispatcher != null) {
            cacheDispatcher.quit();
        }
        for (NetworkDispatcher networkDispatcher : this.i) {
            if (networkDispatcher != null) {
                networkDispatcher.quit();
            }
        }
    }

    public RequestQueue(Cache cache, Network network, int i2) {
        this(cache, network, i2, new ExecutorDelivery(new Handler(Looper.getMainLooper())));
    }

    public void cancelAll(Object obj) {
        if (obj != null) {
            cancelAll((RequestFilter) new bey(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public RequestQueue(Cache cache, Network network, int i2, ResponseDelivery responseDelivery) {
        this.c = new AtomicInteger();
        this.a = new HashSet();
        this.d = new PriorityBlockingQueue();
        this.e = new PriorityBlockingQueue();
        this.b = new ArrayList();
        this.k = new ArrayList();
        this.f = cache;
        this.g = network;
        this.i = new NetworkDispatcher[i2];
        this.h = responseDelivery;
    }
}
