package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: ahov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahov {
    public final Context a;
    public final String[] b;
    public final Map c;
    public final aicn d;
    public boolean e = false;
    public final ahow f;
    private final ExecutorService g;
    private final long h;
    private final long i;
    private long j;
    private final aiab k;

    /* JADX WARNING: type inference failed for: r13v7, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahov(android.content.Context r9, defpackage.aiab r10, java.util.concurrent.ExecutorService r11, defpackage.ahow r12, java.lang.String[] r13, defpackage.aicn r14) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.e = r0
            r8.a = r9
            r8.g = r11
            r8.f = r12
            r8.b = r13
            r8.k = r10
            r8.d = r14
            java.util.concurrent.ConcurrentHashMap r9 = new java.util.concurrent.ConcurrentHashMap
            r9.<init>()
            r8.c = r9
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.j = r9
            long r9 = java.lang.System.currentTimeMillis()
            r8.h = r9
            long r9 = android.os.SystemClock.elapsedRealtime()
            r8.i = r9
            java.lang.String[] r9 = r8.b
            int r10 = r9.length
            r11 = 0
        L_0x0030:
            if (r11 >= r10) goto L_0x00c0
            r12 = r9[r11]
            arbo r13 = defpackage.arbo.e
            r1 = -1
            r14 = 5
            ahys r3 = r8.b(r12)     // Catch:{ IOException -> 0x007d }
            r4 = 7
            java.lang.Object r4 = r13.c(r4)     // Catch:{ IOException -> 0x007d }
            auef r4 = (defpackage.auef) r4     // Catch:{ IOException -> 0x007d }
            audx r3 = r3.a((defpackage.auef) r4)     // Catch:{ IOException -> 0x007d }
            arbo r3 = (defpackage.arbo) r3     // Catch:{ IOException -> 0x007d }
            long r4 = r3.b     // Catch:{ IOException -> 0x007a }
            long r6 = r8.h     // Catch:{ IOException -> 0x007a }
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0079
            java.lang.Object r13 = r3.c(r14)     // Catch:{ IOException -> 0x007a }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ IOException -> 0x007a }
            r13.a((defpackage.aucj) r3)     // Catch:{ IOException -> 0x007a }
            boolean r4 = r13.c     // Catch:{ IOException -> 0x007a }
            if (r4 != 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            r13.c()     // Catch:{ IOException -> 0x007a }
            r13.c = r0     // Catch:{ IOException -> 0x007a }
        L_0x0065:
            aucj r4 = r13.b     // Catch:{ IOException -> 0x007a }
            arbo r4 = (defpackage.arbo) r4     // Catch:{ IOException -> 0x007a }
            int r5 = r4.a     // Catch:{ IOException -> 0x007a }
            r5 = r5 | 1
            r4.a = r5     // Catch:{ IOException -> 0x007a }
            r4.b = r1     // Catch:{ IOException -> 0x007a }
            aucj r13 = r13.i()     // Catch:{ IOException -> 0x007a }
            arbo r13 = (defpackage.arbo) r13     // Catch:{ IOException -> 0x007a }
            r3 = r13
            goto L_0x00a5
        L_0x0079:
            goto L_0x00a5
        L_0x007a:
            r13 = move-exception
            r13 = r3
            goto L_0x007e
        L_0x007d:
            r3 = move-exception
        L_0x007e:
            java.lang.Object r14 = r13.c(r14)
            aucd r14 = (defpackage.aucd) r14
            r14.a((defpackage.aucj) r13)
            boolean r13 = r14.c
            if (r13 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r14.c()
            r14.c = r0
        L_0x0092:
            aucj r13 = r14.b
            arbo r13 = (defpackage.arbo) r13
            int r3 = r13.a
            r3 = r3 | 1
            r13.a = r3
            r13.b = r1
            aucj r13 = r14.i()
            r3 = r13
            arbo r3 = (defpackage.arbo) r3
        L_0x00a5:
            ahot r13 = a((defpackage.arbo) r3)
            if (r13 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            java.util.Map r14 = r8.c
            r14.put(r12, r13)
        L_0x00b1:
            long r12 = r8.j
            long r1 = r3.b
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r8.j = r1
        L_0x00bc:
            int r11 = r11 + 1
            goto L_0x0030
        L_0x00c0:
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahov.<init>(android.content.Context, aiab, java.util.concurrent.ExecutorService, ahow, java.lang.String[], aicn):void");
    }

    public static final ahot a(arbo arbo) {
        int i2;
        if ((arbo.a & 8) == 0) {
            return null;
        }
        arbs arbs = arbo.d;
        if (arbs == null) {
            arbs = arbs.c;
        }
        if (arbs.a.size() == 0) {
            return null;
        }
        arbs arbs2 = arbo.d;
        if (arbs2 == null) {
            arbs2 = arbs.c;
        }
        aucx aucx = arbs2.a;
        int size = aucx.size();
        ahos[] ahosArr = new ahos[size];
        for (int i3 = 0; i3 < size; i3++) {
            arbn arbn = (arbn) aucx.get(i3);
            if ((arbn.a & 2) != 0) {
                i2 = arbn.d;
            } else {
                i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
            }
            ahosArr[i3] = new ahos(aooe.a(arbn.b), arbn.c, i2);
        }
        arbs arbs3 = arbo.d;
        if (arbs3 == null) {
            arbs3 = arbs.c;
        }
        return new ahot(ahosArr, arbs3.b);
    }

    public final ahys b(String str) {
        return new ahys(1, a(str), this.k);
    }

    public final File a(String str) {
        return new File(this.a.getFilesDir(), String.format("activity_personalization_model_%s.pb", new Object[]{str}));
    }

    public final void a() {
        NetworkInfo activeNetworkInfo;
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.i) + this.h;
        if (elapsedRealtime - this.j >= ayee.a.a().personalizedModelRefreshIntervalDays() * 86400000 && (activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            if (!ayee.a.a().checkBatteryStatus() || this.e) {
                this.g.execute(new ahou(this, elapsedRealtime));
                this.j = elapsedRealtime;
            }
        }
    }
}
