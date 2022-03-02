package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aisq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aisq {
    aisp a = aisp.UNAVAILABLE;
    final List b = new ArrayList();
    final List c = new ArrayList();
    private final aiso d;
    private long e;
    private final aimk f;

    static {
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ");
    }

    public aisq(aiso aiso, aimk aimk) {
        this.d = aiso;
        this.f = aimk;
    }

    private static aism a(aism aism, int i) {
        aisn aisn = new aisn();
        aisn.a(aism);
        return aisn.a(i);
    }

    private final aisp b(long j) {
        if (aycg.a.a().forceHardwareGeofenceWhenAvailable()) {
            return aisp.FAST_MOVING;
        }
        if (this.b.isEmpty()) {
            return aisp.UNAVAILABLE;
        }
        aism aism = (aism) a(this.b);
        int a2 = aism.a();
        if (a2 != 3 && j - aism.b > 660000) {
            return aisp.UNAVAILABLE;
        }
        switch (a2) {
            case 0:
            case 1:
                break;
            case 2:
            case 7:
            case 8:
                return aisp.WALKING;
            case 3:
                Pair a3 = a(j);
                if (((Long) a3.first).longValue() >= 900000) {
                    return aisp.STILL;
                }
                return ((Long) a3.second).longValue() > 660000 ? aisp.UNAVAILABLE : this.a;
            case 4:
                aism aism2 = (aism) a(this.b);
                int max = Math.max(aism2.a(0), aism2.a(1));
                int a4 = aism2.a(2);
                if (this.a != aisp.STILL) {
                    if (this.a == aisp.FAST_MOVING && max > 10) {
                        return aisp.FAST_MOVING;
                    }
                    if (this.a == aisp.WALKING && a4 > 10) {
                        return aisp.WALKING;
                    }
                }
                return aisp.UNKNOWN;
            case 5:
            case 6:
                return this.a;
            default:
                switch (a2) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return aisp.UNKNOWN;
                }
        }
        return aisp.FAST_MOVING;
    }

    public final synchronized boolean c() {
        return ((Long) a(SystemClock.elapsedRealtime()).first).longValue() >= 11700000;
    }

    public final synchronized void d() {
        aisp b2 = b(SystemClock.elapsedRealtime());
        if (b2 != this.a) {
            boolean z = aikq.a;
            aimk aimk = this.f;
            aisp aisp = this.a;
            aing aing = aimk.a;
            synchronized (aing.k) {
                int i = 4;
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    String valueOf = String.valueOf(aisp);
                    String valueOf2 = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
                    sb.append("sendMovementChange: previousMovement=");
                    sb.append(valueOf);
                    sb.append(",currentMovement=");
                    sb.append(valueOf2);
                    aikq.a("GeofencerStateMachine", sb.toString());
                }
                aikp aikp = aiko.a;
                int a2 = aing.a(aisp);
                int a3 = aing.a(b2);
                if (aybx.e()) {
                    aikp.a((aiky) new aikx(a2, a3));
                }
                aikk aikk = aing.q;
                if (aikk != null) {
                    if (aikk.d()) {
                        aucd e2 = aikk.e();
                        aucd o = aoae.c.o();
                        aisp aisp2 = aisp.UNAVAILABLE;
                        int ordinal = b2.ordinal();
                        if (ordinal == 1) {
                            i = 2;
                        } else if (ordinal == 2) {
                            i = 3;
                        } else if (ordinal != 3) {
                            i = ordinal != 4 ? 1 : 5;
                        }
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aoae aoae = (aoae) o.b;
                        aoae.b = i - 1;
                        aoae.a |= 1;
                        if (e2.c) {
                            e2.c();
                            e2.c = false;
                        }
                        aoar aoar = (aoar) e2.b;
                        aoae aoae2 = (aoae) o.i();
                        aoar aoar2 = aoar.m;
                        aoae2.getClass();
                        aoar.k = aoae2;
                        aoar.a |= 512;
                        aikk.a.a((aoar) e2.i());
                    }
                }
                aing.b(7, Pair.create(aisp, b2));
            }
            this.a = b2;
        }
    }

    public final synchronized aucd e() {
        aucd aucd;
        ajcd ajcd;
        aucd = null;
        if (!this.b.isEmpty()) {
            aucd o = ailr.e.o();
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ailr ailr = (ailr) o.b;
            ailr.a |= 1;
            ailr.b = currentTimeMillis;
            List list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aism aism = (aism) list.get(i);
                int i2 = 0;
                for (int i3 = 0; i3 < 23; i3++) {
                    if (aism.c[i3] != 0) {
                        i2++;
                    }
                }
                int[] iArr = new int[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < 23; i5++) {
                    if (aism.c[i5] != 0) {
                        iArr[i4] = i5;
                        i4++;
                    }
                }
                if (i2 != 0) {
                    aucd o2 = ajcd.f.o();
                    long j = aism.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    ajcd ajcd2 = (ajcd) o2.b;
                    int i6 = ajcd2.a | 1;
                    ajcd2.a = i6;
                    ajcd2.c = j;
                    long j2 = aism.a;
                    ajcd2.a = i6 | 2;
                    ajcd2.d = j2;
                    for (int i7 = 0; i7 < i2; i7++) {
                        int i8 = iArr[i7];
                        aucd o3 = ajci.d.o();
                        int a2 = aisr.a(i8);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajci ajci = (ajci) o3.b;
                        ajci.b = a2;
                        ajci.a |= 1;
                        int a3 = aism.a(i8);
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        ajci ajci2 = (ajci) o3.b;
                        ajci2.a |= 2;
                        ajci2.c = a3;
                        o2.a((ajci) o3.i());
                    }
                    ajcd = (ajcd) o2.i();
                } else {
                    ajcd = null;
                }
                if (ajcd != null) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ailr ailr2 = (ailr) o.b;
                    ajcd.getClass();
                    if (!ailr2.c.a()) {
                        ailr2.c = aucj.a(ailr2.c);
                    }
                    ailr2.c.add(ajcd);
                }
            }
            List list2 = this.c;
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                aucd aucd2 = (aucd) list2.get(i9);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ailr ailr3 = (ailr) o.b;
                ailq ailq = (ailq) aucd2.i();
                ailq.getClass();
                if (!ailr3.d.a()) {
                    ailr3.d = aucj.a(ailr3.d);
                }
                ailr3.d.add(ailq);
            }
            aucd = o;
        }
        return aucd;
    }

    private static Object a(List list) {
        return list.get(list.size() - 1);
    }

    private final void f() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.e >= 900000) {
            this.e = elapsedRealtime;
            long j = elapsedRealtime - 12300000;
            int size = this.b.size();
            int i = 0;
            while (i < size && ((aism) this.b.get(i)).b < j) {
                i++;
            }
            if (i > 0) {
                this.b.subList(0, i).clear();
            }
        }
    }

    public final synchronized long a() {
        return this.b.size() != 0 ? ((aism) a(this.b)).b : -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Pair a(long j) {
        long j2;
        long j3;
        long j4;
        if (!this.c.isEmpty()) {
            int size = this.c.size() - 1;
            j2 = j;
            while (true) {
                if (size < 0) {
                    break;
                }
                aucd aucd = (aucd) this.c.get(size);
                if (((ailq) aucd.b).b <= j) {
                    if (size == this.c.size() - 1) {
                        ailq ailq = (ailq) aucd.b;
                        if ((ailq.a & 2) == 0) {
                            j2 = ailq.b;
                        }
                    }
                    ailq ailq2 = (ailq) aucd.b;
                    if (j2 - ailq2.c >= 660000) {
                        break;
                    }
                    j2 = ailq2.b;
                    boolean z = aikq.a;
                }
                size--;
            }
        } else {
            j2 = j;
        }
        int size2 = this.b.size() - 1;
        aism aism = null;
        aism aism2 = null;
        while (true) {
            if (size2 < 0) {
                break;
            }
            aism aism3 = (aism) this.b.get(size2);
            long j5 = aism3.b;
            if (j5 <= j) {
                if (j5 < j2) {
                    break;
                } else if (aism3.a() != 3) {
                    aism = aism3;
                    break;
                } else {
                    aism2 = aism3;
                }
            }
            size2--;
        }
        boolean z2 = aikq.a;
        if (aism2 != null) {
            j3 = j - aism2.b;
        } else {
            j3 = 0;
        }
        j4 = Long.MAX_VALUE;
        if (aism != null) {
            if (aism2 != null) {
                j4 = aism2.b - aism.b;
            }
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
    }

    public final synchronized void a(ailr ailr) {
        aism aism;
        if (ailr.d.size() > 0) {
            aucx aucx = ailr.d;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                ailq ailq = (ailq) aucx.get(i);
                if ((ailq.a & 1) != 0) {
                    List list = this.c;
                    aucd aucd = (aucd) ailq.c(5);
                    aucd.a((aucj) ailq);
                    list.add(aucd);
                }
            }
        }
        aucx aucx2 = ailr.c;
        int size2 = aucx2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ajcd ajcd = (ajcd) aucx2.get(i2);
            if (ajcd.b.size() != 0) {
                aisn aisn = new aisn();
                aucx aucx3 = ajcd.b;
                int size3 = aucx3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ajci ajci = (ajci) aucx3.get(i3);
                    aisn.a(aisr.a(ajci), ajci.c);
                }
                aisn.a(ajcd.d);
                aisn.b(ajcd.c);
                aism = aisn.a();
            } else {
                aism = null;
            }
            if (aism != null) {
                this.b.add(aism);
                this.a = b(aism.b);
            }
        }
        f();
        this.a = b(SystemClock.elapsedRealtime());
        boolean z = aikq.a;
    }

    public final synchronized aisp b() {
        aisp b2;
        b2 = b(SystemClock.elapsedRealtime());
        this.a = b2;
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r11.a.size() == 1) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.google.android.gms.location.ActivityRecognitionResult r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
            if (r11 == 0) goto L_0x0032
            java.util.List r0 = r10.b     // Catch:{ all -> 0x00de }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x001d
            java.util.List r0 = r10.b     // Catch:{ all -> 0x00de }
            java.lang.Object r0 = a((java.util.List) r0)     // Catch:{ all -> 0x00de }
            aism r0 = (defpackage.aism) r0     // Catch:{ all -> 0x00de }
            long r0 = r0.b     // Catch:{ all -> 0x00de }
            long r2 = r11.c     // Catch:{ all -> 0x00de }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
        L_0x001d:
            com.google.android.gms.location.DetectedActivity r0 = r11.a()     // Catch:{ all -> 0x00de }
            int r0 = r0.a()     // Catch:{ all -> 0x00de }
            r1 = 5
            r2 = 1
            if (r0 == r1) goto L_0x002a
            goto L_0x0036
        L_0x002a:
            java.util.List r1 = r11.a     // Catch:{ all -> 0x00de }
            int r1 = r1.size()     // Catch:{ all -> 0x00de }
            if (r1 != r2) goto L_0x0036
        L_0x0032:
            boolean r11 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
            monitor-exit(r10)
            return
        L_0x0036:
            aiso r1 = r10.d     // Catch:{ all -> 0x00de }
            boolean r1 = r1.a     // Catch:{ all -> 0x00de }
            r3 = 2
            if (r1 != 0) goto L_0x003e
            goto L_0x0048
        L_0x003e:
            if (r0 == r3) goto L_0x0048
            if (r0 == 0) goto L_0x0048
            if (r0 == r2) goto L_0x0048
            boolean r11 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
            monitor-exit(r10)
            return
        L_0x0048:
            aism r0 = new aism     // Catch:{ all -> 0x00de }
            java.util.List r1 = r11.a     // Catch:{ all -> 0x00de }
            r4 = 23
            int[] r5 = new int[r4]     // Catch:{ all -> 0x00de }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00de }
        L_0x0054:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00de }
            com.google.android.gms.location.DetectedActivity r4 = (com.google.android.gms.location.DetectedActivity) r4     // Catch:{ all -> 0x00de }
            int r6 = r4.a()     // Catch:{ all -> 0x00de }
            int r4 = r4.e     // Catch:{ all -> 0x00de }
            r5[r6] = r4     // Catch:{ all -> 0x00de }
            goto L_0x0054
        L_0x0069:
            long r6 = r11.b     // Catch:{ all -> 0x00de }
            long r8 = r11.c     // Catch:{ all -> 0x00de }
            r4 = r0
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x00de }
            int r11 = r0.a()     // Catch:{ all -> 0x00de }
            r1 = 4
            if (r11 == r1) goto L_0x0080
            boolean r11 = r0.b(r11)     // Catch:{ all -> 0x00de }
            if (r11 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            goto L_0x00cc
        L_0x0080:
            boolean r11 = r0.b(r1)     // Catch:{ all -> 0x00de }
            if (r11 == 0) goto L_0x008e
            aism r0 = a(r0, r1)     // Catch:{ all -> 0x00de }
            boolean r11 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
            goto L_0x00cc
        L_0x008e:
            r11 = 0
            int r1 = r0.a(r11)     // Catch:{ all -> 0x00de }
            int r2 = r0.a(r2)     // Catch:{ all -> 0x00de }
            int r1 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x00de }
            r2 = 25
            if (r1 < r2) goto L_0x00a1
            goto L_0x00ac
        L_0x00a1:
            r4 = 10
            if (r1 < r4) goto L_0x00b4
            aisp r1 = r10.a     // Catch:{ all -> 0x00de }
            aisp r5 = defpackage.aisp.FAST_MOVING     // Catch:{ all -> 0x00de }
            if (r1 == r5) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            aism r0 = a(r0, r11)     // Catch:{ all -> 0x00de }
            boolean r11 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
            goto L_0x00cc
        L_0x00b4:
            int r11 = r0.a(r3)     // Catch:{ all -> 0x00de }
            if (r11 < r2) goto L_0x00bc
            goto L_0x00c5
        L_0x00bc:
            if (r11 < r4) goto L_0x007f
            aisp r11 = r10.a     // Catch:{ all -> 0x00de }
            aisp r1 = defpackage.aisp.WALKING     // Catch:{ all -> 0x00de }
            if (r11 == r1) goto L_0x00c5
            goto L_0x007f
        L_0x00c5:
            aism r0 = a(r0, r3)     // Catch:{ all -> 0x00de }
            boolean r11 = defpackage.aikq.a     // Catch:{ all -> 0x00de }
        L_0x00cc:
            java.util.List r11 = r10.b     // Catch:{ all -> 0x00de }
            r11.add(r0)     // Catch:{ all -> 0x00de }
            r10.f()     // Catch:{ all -> 0x00de }
            aimk r11 = r10.f     // Catch:{ all -> 0x00de }
            r11.a()     // Catch:{ all -> 0x00de }
            r10.d()     // Catch:{ all -> 0x00de }
            monitor-exit(r10)
            return
        L_0x00de:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x00e2
        L_0x00e1:
            throw r11
        L_0x00e2:
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisq.a(com.google.android.gms.location.ActivityRecognitionResult):void");
    }

    public final void a(boolean z) {
        boolean z2 = aikq.a;
        aucd aucd = !this.c.isEmpty() ? (aucd) a(this.c) : null;
        if (z) {
            if (aucd != null) {
                ailq ailq = (ailq) aucd.b;
                if ((ailq.a & 2) == 0) {
                    long j = ailq.b;
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Last period not closed. Start=");
                    sb.append(j);
                    aikq.b("MovementManager", sb.toString());
                    return;
                }
            }
            aucd o = ailq.d.o();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ailq ailq2 = (ailq) o.b;
            ailq2.a |= 1;
            ailq2.b = elapsedRealtime;
            this.c.add(o);
            List list = this.c;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ailq ailq3 = (ailq) ((aucd) it.next()).b;
                if ((ailq3.a & 2) != 0 && elapsedRealtime2 - ailq3.c > 660000) {
                    it.remove();
                }
            }
        } else if (aucd != null && (((ailq) aucd.b).a & 2) == 0) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ailq ailq4 = (ailq) aucd.b;
            ailq ailq5 = ailq.d;
            ailq4.a |= 2;
            ailq4.c = elapsedRealtime3;
        } else {
            ailq ailq6 = (ailq) aucd.b;
            long j2 = ailq6.b;
            long j3 = ailq6.c;
            StringBuilder sb2 = new StringBuilder(79);
            sb2.append("Last period already closed. Start=");
            sb2.append(j2);
            sb2.append(" end=");
            sb2.append(j3);
            aikq.b("MovementManager", sb2.toString());
        }
    }
}
