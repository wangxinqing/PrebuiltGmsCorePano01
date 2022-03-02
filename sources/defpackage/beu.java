package defpackage;

import com.android.volley.CacheDispatcher;
import com.android.volley.Request;
import com.android.volley.VolleyLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: beu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class beu {
    public final Map a = new HashMap();
    public final CacheDispatcher b;

    public beu(CacheDispatcher cacheDispatcher) {
        this.b = cacheDispatcher;
    }

    public final synchronized void a(Request request) {
        String cacheKey = request.getCacheKey();
        List list = (List) this.a.remove(cacheKey);
        if (list != null && !list.isEmpty()) {
            if (VolleyLog.DEBUG) {
                VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
            }
            Request request2 = (Request) list.remove(0);
            this.a.put(cacheKey, list);
            request2.a(this);
            try {
                this.b.a.put(request2);
            } catch (InterruptedException e) {
                VolleyLog.e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.quit();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(com.android.volley.Request r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.getCacheKey()     // Catch:{ all -> 0x0052 }
            java.util.Map r1 = r5.a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map r1 = r5.a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.addMarker(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map r6 = r5.a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.android.volley.VolleyLog.DEBUG     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.android.volley.VolleyLog.d(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map r1 = r5.a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.a((defpackage.beu) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.android.volley.VolleyLog.DEBUG     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "new request, sending to network %s"
            com.android.volley.VolleyLog.d(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beu.b(com.android.volley.Request):boolean");
    }
}
