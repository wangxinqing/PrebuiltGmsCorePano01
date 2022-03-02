package defpackage;

import android.location.LocationProvider;
import android.os.Handler;
import android.os.Looper;

/* renamed from: aiit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiit extends aiiy {
    public final ajpz a;
    public final ajpq b;
    protected final aier c;
    protected final Handler d;
    protected final aidf e;
    protected final aiip f;
    protected final aiip g;
    public aiip h;
    public reh i;

    public aiit(ajpz ajpz, Looper looper, aidf aidf) {
        ajpq ajpq;
        if (!ayap.m()) {
            ajpq = new ajpq(ajpz.a);
        } else {
            ajpq = null;
        }
        this.a = ajpz;
        this.b = ajpq;
        if (ayap.m()) {
            this.c = new aier(ajpz);
        } else {
            this.c = new aier(ajpq);
        }
        this.d = new qvr(looper);
        this.e = aidf;
        this.i = null;
        this.f = new aiiq(this);
        this.g = new aiis(this);
        this.h = this.f;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        LocationProvider locationProvider;
        if (this.u && this.v && this.r < Long.MAX_VALUE) {
            ajpz ajpz = this.a;
            if (ayap.c()) {
                try {
                    locationProvider = ajpz.a.getProvider("gps");
                } catch (SecurityException e2) {
                    locationProvider = null;
                }
            } else {
                locationProvider = ajpz.a.getProvider("gps");
            }
            if (locationProvider != null) {
                this.e.a(18, aidf.a(this.r));
                ajpq ajpq = this.b;
                if (ajpq != null && !ajpq.c) {
                    ajpq.c = true;
                    ajpq.a();
                }
                aier aier = this.c;
                aier.d = 0;
                aier.e = false;
                aier.f = false;
                aier.g = false;
                ajpz ajpz2 = aier.b;
                if (ajpz2 != null) {
                    ajpz2.a(aier, aoqm.a);
                }
                ajpq ajpq2 = aier.a;
                if (ajpq2 != null) {
                    ajpq2.a(aier);
                }
                a(this.g);
            }
        } else if (a(this.f)) {
            aier aier2 = this.c;
            ajpz ajpz3 = aier2.b;
            if (ajpz3 != null) {
                ajpz3.a((ajpx) aier2);
            }
            ajpq ajpq3 = aier2.a;
            if (ajpq3 != null) {
                synchronized (ajpq3.a) {
                    if (ajpq3.b.remove(aier2) && ajpq3.b.isEmpty()) {
                        ajpq3.a();
                    }
                }
            }
            ajpq ajpq4 = this.b;
            if (ajpq4 != null && ajpq4.c) {
                ajpq4.c = false;
                synchronized (ajpq4.a) {
                    ajpq4.a();
                }
            }
            this.e.a(19);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Gps[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x014d, code lost:
        defpackage.rev.a(r10, 1);
        r9.i.a(com.google.android.gms.location.LocationResult.a(java.util.Collections.singletonList(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x015d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.location.Location r10) {
        /*
            r9 = this;
            reh r0 = r9.i
            if (r0 == 0) goto L_0x0165
            aier r0 = r9.c
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            boolean r2 = defpackage.ahyi.a(r10)     // Catch:{ all -> 0x0162 }
            if (r2 != 0) goto L_0x0160
            r2 = 0
            r10.setExtras(r2)     // Catch:{ all -> 0x0162 }
            double r2 = r10.getLatitude()     // Catch:{ all -> 0x0162 }
            double r4 = r10.getLongitude()     // Catch:{ all -> 0x0162 }
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0028
            goto L_0x015e
        L_0x0028:
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x015e
            r6 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x015e
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x015e
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x015e
            boolean r2 = r10.hasAccuracy()     // Catch:{ all -> 0x0162 }
            r3 = 0
            if (r2 == 0) goto L_0x0068
            float r2 = r10.getAccuracy()     // Catch:{ all -> 0x0162 }
            r4 = 1148846080(0x447a0000, float:1000.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0066
            float r2 = r10.getAccuracy()     // Catch:{ all -> 0x0162 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            return
        L_0x0068:
            int r2 = r0.d     // Catch:{ all -> 0x0162 }
            r4 = 3
            r5 = 1
            if (r2 >= r4) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r0.g = r5     // Catch:{ all -> 0x0162 }
        L_0x0071:
            boolean r2 = r0.e     // Catch:{ all -> 0x0162 }
            if (r2 != 0) goto L_0x0086
            boolean r2 = r10.hasAccuracy()     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0086
            float r2 = r10.getAccuracy()     // Catch:{ all -> 0x0162 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r0.e = r5     // Catch:{ all -> 0x0162 }
        L_0x0086:
            boolean r2 = r0.e     // Catch:{ all -> 0x0162 }
            if (r2 != 0) goto L_0x00bb
            int r2 = r0.d     // Catch:{ all -> 0x0162 }
            if (r2 <= 0) goto L_0x00bb
            int r2 = r2 + -3
            if (r2 >= 0) goto L_0x0093
            goto L_0x00bb
        L_0x0093:
            if (r2 == 0) goto L_0x00ad
            if (r2 == r5) goto L_0x00aa
            r6 = 2
            if (r2 == r6) goto L_0x00a7
            if (r2 == r4) goto L_0x00a4
            r4 = 4
            if (r2 == r4) goto L_0x00a1
            r2 = 0
            goto L_0x00af
        L_0x00a1:
            r2 = 1040187392(0x3e000000, float:0.125)
            goto L_0x00af
        L_0x00a4:
            r2 = 1048576000(0x3e800000, float:0.25)
            goto L_0x00af
        L_0x00a7:
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L_0x00af
        L_0x00aa:
            r2 = 1061158912(0x3f400000, float:0.75)
            goto L_0x00af
        L_0x00ad:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00af:
            r4 = 1118830592(0x42b00000, float:88.0)
            float r2 = r2 * r4
            r4 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 + r4
            int r2 = (int) r2     // Catch:{ all -> 0x0162 }
            float r2 = (float) r2     // Catch:{ all -> 0x0162 }
            r10.setAccuracy(r2)     // Catch:{ all -> 0x0162 }
        L_0x00bb:
            boolean r2 = r10.hasAccuracy()     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00cf
            r2 = 1081711002(0x4079999a, float:3.9)
            float r4 = r10.getAccuracy()     // Catch:{ all -> 0x0162 }
            float r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x0162 }
            r10.setAccuracy(r2)     // Catch:{ all -> 0x0162 }
        L_0x00cf:
            boolean r2 = r0.f     // Catch:{ all -> 0x0162 }
            if (r2 != 0) goto L_0x00e4
            boolean r2 = r10.hasBearing()     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00e4
            float r2 = r10.getBearing()     // Catch:{ all -> 0x0162 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r0.f = r5     // Catch:{ all -> 0x0162 }
        L_0x00e4:
            boolean r2 = r0.f     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            r10.removeBearing()     // Catch:{ all -> 0x0162 }
        L_0x00ec:
            boolean r2 = r0.g     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0105
            int r0 = r0.d     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00f5
            goto L_0x0105
        L_0x00f5:
            r2 = 5
            if (r0 >= r2) goto L_0x0105
            float r0 = r10.getAccuracy()     // Catch:{ all -> 0x0162 }
            r2 = 1119879168(0x42c00000, float:96.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            r10.setAccuracy(r2)     // Catch:{ all -> 0x0162 }
        L_0x0105:
            boolean r0 = r10.hasSpeed()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x010c
        L_0x010b:
            goto L_0x0119
        L_0x010c:
            float r0 = r10.getSpeed()     // Catch:{ all -> 0x0162 }
            r2 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x010b
            r10.removeSpeed()     // Catch:{ all -> 0x0162 }
        L_0x0119:
            ayap r0 = defpackage.ayap.a     // Catch:{ all -> 0x0162 }
            ayaq r0 = r0.a()     // Catch:{ all -> 0x0162 }
            boolean r0 = r0.g2kRolloverCorrection()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x014c
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0162 }
            long r6 = r10.getTime()     // Catch:{ all -> 0x0162 }
            long r2 = r2 - r6
            r6 = -619315200000(0xffffff6fcdf00000, double:NaN)
            long r2 = r2 + r6
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0162 }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x014c
            long r2 = r10.getTime()     // Catch:{ all -> 0x0162 }
            r6 = 619315200000(0x9032100000, double:3.059823642673E-312)
            long r2 = r2 + r6
            r10.setTime(r2)     // Catch:{ all -> 0x0162 }
        L_0x014c:
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            defpackage.rev.a((android.location.Location) r10, (int) r5)
            java.util.List r10 = java.util.Collections.singletonList(r10)
            com.google.android.gms.location.LocationResult r10 = com.google.android.gms.location.LocationResult.a((java.util.List) r10)
            reh r0 = r9.i
            r0.a((com.google.android.gms.location.LocationResult) r10)
            return
        L_0x015e:
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            return
        L_0x0160:
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            return
        L_0x0162:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0162 }
            throw r10
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiit.a(android.location.Location):void");
    }

    public boolean a(aiip aiip) {
        aiip aiip2 = this.h;
        if (aiip != aiip2) {
            aiip2.b();
            this.h = aiip;
            aiip.a();
            return true;
        }
        aiip2.c();
        return false;
    }
}
