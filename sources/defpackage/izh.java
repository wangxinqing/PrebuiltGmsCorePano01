package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;

/* renamed from: izh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izh extends BasicNetwork {
    public izh(HttpStack httpStack) {
        super(httpStack);
    }

    private static final void a(long j, long j2, int i, boolean z) {
        int i2;
        int i3;
        if (axbe.b()) {
            ihs b = ihs.b();
            NetworkInfo d = jkf.d(b);
            if (d != null) {
                i2 = d.getType();
            } else {
                i2 = -1;
            }
            if (izi.b(i)) {
                i3 = izi.c(i);
            } else {
                i3 = i;
            }
            int a = jiy.a((Context) b);
            b.getNetworkLatencyLogger().logAsync(new NetworkLatencyEvent(j, j2 - j, i2, i3, a == -1 ? 7 : a, z));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.volley.NetworkResponse performRequest(com.android.volley.Request r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.gms.common.server.NetworkCallbacks
            if (r0 == 0) goto L_0x0008
            r0 = r12
            com.google.android.gms.common.server.NetworkCallbacks r0 = (com.google.android.gms.common.server.NetworkCallbacks) r0
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x0013
            r0.onPreNetworkDispatch()
            int r1 = android.net.TrafficStats.getThreadStatsTag()
            goto L_0x0017
        L_0x0013:
            int r1 = r12.getTrafficStatsTag()
        L_0x0017:
            boolean r2 = defpackage.axbe.f()
            if (r2 == 0) goto L_0x0055
            boolean r2 = defpackage.izi.b(r1)
            if (r2 != 0) goto L_0x0055
            ihs r2 = defpackage.ihs.b()
            android.net.NetworkInfo r3 = defpackage.jkf.d(r2)
            r4 = -1
            if (r3 == 0) goto L_0x0034
            int r3 = r3.getType()
            r5 = r3
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            boolean r8 = defpackage.jkf.e(r2)
            int r3 = defpackage.jiy.a((android.content.Context) r2)
            if (r3 == r4) goto L_0x0041
            r7 = r3
            goto L_0x0043
        L_0x0041:
            r3 = 7
            r7 = 7
        L_0x0043:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger r9 = r2.getNetworkActivityLogger()
            com.google.android.gms.common.stats.radio.NetworkActivityEvent r10 = new com.google.android.gms.common.stats.radio.NetworkActivityEvent
            long r3 = java.lang.System.currentTimeMillis()
            r2 = r10
            r6 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            r9.logAsync(r10)
        L_0x0055:
            agev r8 = new agev
            java.lang.String r2 = r12.getUrl()
            r8.<init>(r2)
            r8.a()
            long r2 = java.lang.System.currentTimeMillis()
            com.android.volley.NetworkResponse r9 = super.performRequest(r12)     // Catch:{ VolleyError -> 0x00b8 }
            r4 = 0
            if (r9 == 0) goto L_0x00a0
            java.util.Map r5 = r9.headers     // Catch:{ VolleyError -> 0x00b8 }
            if (r5 == 0) goto L_0x007b
            java.lang.String r6 = "Content-Type"
            java.lang.Object r5 = r5.get(r6)     // Catch:{ VolleyError -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ VolleyError -> 0x00b8 }
            r8.a((java.lang.String) r5)     // Catch:{ VolleyError -> 0x00b8 }
        L_0x007b:
            byte[] r5 = r9.data     // Catch:{ VolleyError -> 0x00b8 }
            if (r5 == 0) goto L_0x0081
            int r5 = r5.length     // Catch:{ VolleyError -> 0x00b8 }
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            byte[] r6 = r12.getBody()     // Catch:{ VolleyError -> 0x00b8 }
            if (r6 == 0) goto L_0x008e
            byte[] r12 = r12.getBody()     // Catch:{ VolleyError -> 0x00b8 }
            int r12 = r12.length     // Catch:{ VolleyError -> 0x00b8 }
            goto L_0x008f
        L_0x008e:
            r12 = 0
        L_0x008f:
            r8.a(r5, r12)     // Catch:{ VolleyError -> 0x00b8 }
            int r12 = r9.statusCode     // Catch:{ VolleyError -> 0x00b8 }
            r8.a((int) r12)     // Catch:{ VolleyError -> 0x00b8 }
            int r12 = r9.statusCode     // Catch:{ VolleyError -> 0x00b8 }
            r5 = 400(0x190, float:5.6E-43)
            if (r12 >= r5) goto L_0x00a0
            r12 = 1
            r7 = 1
            goto L_0x00a1
        L_0x00a0:
            r7 = 0
        L_0x00a1:
            long r4 = java.lang.System.currentTimeMillis()
            r6 = r1
            a(r2, r4, r6, r7)
            if (r0 == 0) goto L_0x00ae
            r0.onPostNetworkDispatch()
        L_0x00ae:
            agfu r12 = defpackage.agfu.a()
            r12.a((defpackage.agev) r8)
            return r9
        L_0x00b6:
            r12 = move-exception
            goto L_0x00c3
        L_0x00b8:
            r12 = move-exception
            com.android.volley.NetworkResponse r4 = r12.networkResponse     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x00c2
            int r4 = r4.statusCode     // Catch:{ all -> 0x00b6 }
            r8.a((int) r4)     // Catch:{ all -> 0x00b6 }
        L_0x00c2:
            throw r12     // Catch:{ all -> 0x00b6 }
        L_0x00c3:
            long r4 = java.lang.System.currentTimeMillis()
            r7 = 0
            r6 = r1
            a(r2, r4, r6, r7)
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            r0.onPostNetworkDispatch()
        L_0x00d2:
            agfu r0 = defpackage.agfu.a()
            r0.a((defpackage.agev) r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izh.performRequest(com.android.volley.Request):com.android.volley.NetworkResponse");
    }
}
