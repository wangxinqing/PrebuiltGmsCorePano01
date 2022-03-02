package defpackage;

import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.util.ArraySet;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: arnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arnr extends arnq implements arnd, arny, arod {
    public static final arnd a = new arnl();
    public static final arnh b = new arnm();
    public static final Object c = new Object();
    public static volatile arnd d;
    public final ContextHubManager e;
    public final ContextHubInfo f;
    public final int g;
    public final Handler h;
    public final arnz i;
    public final aroc j;
    public final Object k = new Object();
    public final LongSparseArray l = new LongSparseArray();
    public final SparseArray m = new SparseArray();
    public final boolean n;
    public final aipf o;
    private final nz p = new nz();
    private final arnc q;
    private long r;
    private final LongSparseArray s = new LongSparseArray();
    private int t = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: arof} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: arog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: arof} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: arof} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public arnr(android.hardware.location.ContextHubManager r10, defpackage.arnc r11, android.os.Handler r12, defpackage.aipf r13) {
        /*
            r9 = this;
            r9.<init>(r12)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r9.k = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r9.l = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.m = r0
            nz r0 = new nz
            r0.<init>()
            r9.p = r0
            android.util.LongSparseArray r0 = new android.util.LongSparseArray
            r0.<init>()
            r9.s = r0
            r0 = 0
            r9.t = r0
            aydr r1 = defpackage.aydr.a
            ayds r1 = r1.a()
            boolean r1 = r1.enableContexthubApiWrapper()
            r9.n = r1
            r9.e = r10
            r9.q = r11
            r9.h = r12
            java.lang.String r11 = "No ContextHubs were found in the platform."
            r2 = 0
            if (r1 == 0) goto L_0x0079
            boolean r1 = defpackage.jkr.g()
            if (r1 == 0) goto L_0x0052
            arof r1 = new arof
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r9
            r7 = r13
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0057
        L_0x0052:
            arog r1 = new arog
            r1.<init>(r10)
        L_0x0057:
            r9.j = r1
            java.util.List r10 = r1.a()
            if (r10 == 0) goto L_0x0073
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x0073
            java.lang.Object r10 = r10.get(r0)
            android.hardware.location.ContextHubInfo r10 = (android.hardware.location.ContextHubInfo) r10
            r9.f = r10
            r9.g = r0
            r9.i = r2
            goto L_0x00b5
        L_0x0073:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r11)
            throw r10
        L_0x0079:
            r9.j = r2
            int[] r12 = r10.getContextHubHandles()
            if (r12 == 0) goto L_0x0083
            int r1 = r12.length
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            if (r1 == 0) goto L_0x00d3
            r11 = 1
            if (r1 <= r11) goto L_0x009b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r2 = 69
            r11.<init>(r2)
            r11.append(r1)
            java.lang.String r1 = " ContextHubs found in the platform, picking the first one."
            r11.append(r1)
            r11.toString()
        L_0x009b:
            r11 = r12[r0]
            r9.g = r11
            android.hardware.location.ContextHubInfo r11 = r10.getContextHubInfo(r11)
            r9.f = r11
            if (r11 == 0) goto L_0x00b8
            int r11 = r11.getMaxPacketLengthBytes()
            arnz r12 = new arnz
            java.lang.String r0 = "ChreTransfer"
            r12.<init>(r11, r10, r9, r0)
            r9.i = r12
        L_0x00b5:
            r9.o = r13
            return
        L_0x00b8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            int r11 = r9.g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 51
            r12.<init>(r13)
            java.lang.String r13 = "Unable to query ContextHubInfo for UID: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x00d3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arnr.<init>(android.hardware.location.ContextHubManager, arnc, android.os.Handler, aipf):void");
    }

    private static void a(StringBuilder sb, arnh arnh) {
        sb.append("    AppId=0x");
        sb.append(Long.toHexString(arnh.a()));
        sb.append(", UID=");
        sb.append(arnh.b());
        sb.append(", Version=");
        sb.append(arnh.c());
        sb.append("'\n");
    }

    private static final arnh b(arnh arnh) {
        if (b.equals(arnh)) {
            return null;
        }
        return arnh;
    }

    public final void c() {
        try {
            ContextHubTransaction.Response waitForResponse = this.e.queryNanoApps(this.f).waitForResponse(5, TimeUnit.SECONDS);
            if (waitForResponse == null || waitForResponse.getResult() == 0) {
            }
        } catch (InterruptedException e2) {
        } catch (TimeoutException e3) {
        }
    }

    public final int a() {
        return this.f.getPlatformVersion();
    }

    public final List b() {
        if (!this.n) {
            ArrayList arrayList = new ArrayList();
            int[] findNanoAppOnHub = this.e.findNanoAppOnHub(this.g, new NanoAppFilter(-1, 0, -1, -1));
            if (findNanoAppOnHub != null) {
                for (int a2 : findNanoAppOnHub) {
                    arrayList.add(a(a2));
                }
            }
            return arrayList;
        }
        List<arnh> a3 = this.j.a(this.f);
        if (a3 != null) {
            for (arnh arnh : a3) {
                a(a(arnh), (arne) (arns) arnh);
            }
        }
        return a3;
    }

    public final int a(arnh arnh) {
        int intValue;
        synchronized (this.s) {
            if (this.s.get(arnh.a()) == null) {
                LongSparseArray longSparseArray = this.s;
                long a2 = arnh.a();
                int i2 = this.t;
                this.t = i2 + 1;
                longSparseArray.put(a2, Integer.valueOf(i2));
            }
            intValue = ((Integer) this.s.get(arnh.a())).intValue();
        }
        return intValue;
    }

    public final boolean c(int i2) {
        boolean z;
        if (i2 == this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(this.g)};
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = r8.e.getNanoAppInstanceInfo(r9);
        r7 = r8.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.arnh) r8.m.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (b(r0) == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r2 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r1 = new defpackage.arns(r2, r8.e, (defpackage.arnd) r8, r8.o, r8.h);
        r1 = r1.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r1 > 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = java.util.Locale.ENGLISH;
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r9), java.lang.Long.valueOf(r1.a), java.lang.Integer.valueOf(r1)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r8.l.put(r1.a, r1);
        r8.m.put(r9, r1);
        a(r9, (defpackage.arne) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r8.m.put(r9, b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.arnh a(int r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.k
            monitor-enter(r0)
            android.util.SparseArray r1 = r8.m     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x007e }
            arnh r1 = (defpackage.arnh) r1     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0015
            arnh r2 = b((defpackage.arnh) r1)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r1
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            android.hardware.location.ContextHubManager r0 = r8.e
            android.hardware.location.NanoAppInstanceInfo r2 = r0.getNanoAppInstanceInfo(r9)
            java.lang.Object r7 = r8.k
            monitor-enter(r7)
            android.util.SparseArray r0 = r8.m     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x007b }
            arnh r0 = (defpackage.arnh) r0     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0031
            arnh r1 = b((defpackage.arnh) r0)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0031
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0031:
            if (r2 == 0) goto L_0x0071
            arns r0 = new arns     // Catch:{ all -> 0x007b }
            android.hardware.location.ContextHubManager r3 = r8.e     // Catch:{ all -> 0x007b }
            aipf r5 = r8.o     // Catch:{ all -> 0x007b }
            android.os.Handler r6 = r8.h     // Catch:{ all -> 0x007b }
            r1 = r0
            r4 = r8
            r1.<init>((android.hardware.location.NanoAppInstanceInfo) r2, (android.hardware.location.ContextHubManager) r3, (defpackage.arnd) r4, (defpackage.aipf) r5, (android.os.Handler) r6)     // Catch:{ all -> 0x007b }
            int r1 = r0.b     // Catch:{ all -> 0x007b }
            if (r1 > 0) goto L_0x0060
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x007b }
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007b }
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007b }
            r2[r3] = r4     // Catch:{ all -> 0x007b }
            long r3 = r0.a     // Catch:{ all -> 0x007b }
            r5 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x007b }
            r2[r5] = r3     // Catch:{ all -> 0x007b }
            r3 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x007b }
            r2[r3] = r1     // Catch:{ all -> 0x007b }
        L_0x0060:
            android.util.LongSparseArray r1 = r8.l     // Catch:{ all -> 0x007b }
            long r2 = r0.a     // Catch:{ all -> 0x007b }
            r1.put(r2, r0)     // Catch:{ all -> 0x007b }
            android.util.SparseArray r1 = r8.m     // Catch:{ all -> 0x007b }
            r1.put(r9, r0)     // Catch:{ all -> 0x007b }
            r8.a((int) r9, (defpackage.arne) r0)     // Catch:{ all -> 0x007b }
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0071:
            android.util.SparseArray r0 = r8.m     // Catch:{ all -> 0x007b }
            arnh r1 = b     // Catch:{ all -> 0x007b }
            r0.put(r9, r1)     // Catch:{ all -> 0x007b }
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            r9 = 0
            return r9
        L_0x007b:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            throw r9
        L_0x007e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arnr.a(int):arnh");
    }

    public final void b(int i2) {
        if (c(i2)) {
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = Integer.valueOf(i2);
            ArraySet arraySet = new ArraySet();
            synchronized (this.k) {
                for (int i3 = 0; i3 < this.l.size(); i3++) {
                    arraySet.add(Long.valueOf(this.l.keyAt(i3)));
                }
                this.l.clear();
                this.m.clear();
            }
            if (jkr.g() && !this.n) {
                c();
            }
            arnc arnc = this.q;
            ArraySet arraySet2 = new ArraySet();
            for (arnh a2 : b()) {
                arraySet2.add(Long.valueOf(a2.a()));
            }
            aiqo aiqo = (aiqo) arnc;
            aiqo.c.execute(new aiqf(aiqo, arraySet, arraySet2));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.r;
            long j3 = 0;
            if (j2 != 0) {
                j3 = elapsedRealtime - j2;
            }
            aipf aipf = this.o;
            if (aydr.c()) {
                aucd o2 = anyn.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anyn anyn = (anyn) o2.b;
                anyn.a |= 1;
                anyn.b = j3;
                anyn anyn2 = (anyn) o2.i();
                aucd o3 = anyi.g.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anyi anyi = (anyi) o3.b;
                anyi.b = 2;
                int i4 = 1 | anyi.a;
                anyi.a = i4;
                anyn2.getClass();
                anyi.d = anyn2;
                anyi.a = i4 | 4;
                aipf.a(o3);
            }
            this.r = elapsedRealtime;
        }
    }

    public final arnh a(long j2) {
        if (!this.n) {
            return a(j2, false);
        }
        List<arnh> a2 = this.j.a(this.f);
        if (a2 == null) {
            return null;
        }
        for (arnh arnh : a2) {
            if (arnh.a() == j2) {
                a(a(arnh), (arne) (arns) arnh);
                synchronized (this.k) {
                    this.l.put(arnh.a(), arnh);
                }
                return arnh;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r12.e.findNanoAppOnHub(r12.g, new android.hardware.location.NanoAppFilter(r13, 0, -1, -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.arnh a(long r13, boolean r15) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.k
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r12.l     // Catch:{ all -> 0x00aa }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x00aa }
            arnh r1 = (defpackage.arnh) r1     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0013
            arnh r13 = b((defpackage.arnh) r1)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return r13
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            r0 = 0
            r1 = 0
        L_0x0016:
            android.hardware.location.NanoAppFilter r9 = new android.hardware.location.NanoAppFilter
            r5 = 0
            r6 = -1
            r7 = -1
            r2 = r9
            r3 = r13
            r2.<init>(r3, r5, r6, r7)
            r2 = 0
            android.hardware.location.ContextHubManager r3 = r12.e     // Catch:{ NullPointerException -> 0x002b }
            int r4 = r12.g     // Catch:{ NullPointerException -> 0x002b }
            int[] r3 = r3.findNanoAppOnHub(r4, r9)     // Catch:{ NullPointerException -> 0x002b }
            goto L_0x002d
        L_0x002b:
            r3 = move-exception
            r3 = r2
        L_0x002d:
            r4 = 1
            int r1 = r1 + r4
            r5 = 2
            if (r15 == 0) goto L_0x0043
            if (r1 >= r5) goto L_0x0043
            if (r3 != 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r6 = r3.length
            if (r6 == 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0016
        L_0x0041:
            r2 = move-exception
            goto L_0x0016
        L_0x0043:
            r15 = -1
            if (r3 != 0) goto L_0x0047
            goto L_0x0060
        L_0x0047:
            int r1 = r3.length
            if (r1 == 0) goto L_0x0060
            if (r1 <= r4) goto L_0x005c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r1[r0] = r3
            java.lang.String r0 = java.lang.Long.toHexString(r13)
            r1[r4] = r0
            r0 = -1
            goto L_0x0069
        L_0x005c:
            r0 = r3[r0]
            goto L_0x0069
        L_0x0060:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r1[r0] = r3
            r0 = -1
        L_0x0069:
            java.lang.Object r1 = r12.k
            monitor-enter(r1)
            android.util.LongSparseArray r3 = r12.l     // Catch:{ all -> 0x00a7 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x00a7 }
            arnh r3 = (defpackage.arnh) r3     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x007e
            arnh r4 = b((defpackage.arnh) r3)     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x007e
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r3
        L_0x007e:
            if (r0 == r15) goto L_0x009e
            arns r15 = new arns     // Catch:{ all -> 0x00a7 }
            android.hardware.location.ContextHubManager r8 = r12.e     // Catch:{ all -> 0x00a7 }
            aipf r10 = r12.o     // Catch:{ all -> 0x00a7 }
            android.os.Handler r11 = r12.h     // Catch:{ all -> 0x00a7 }
            r4 = r15
            r5 = r13
            r7 = r0
            r9 = r12
            r4.<init>(r5, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a7 }
            android.util.LongSparseArray r2 = r12.l     // Catch:{ all -> 0x00a7 }
            r2.put(r13, r15)     // Catch:{ all -> 0x00a7 }
            android.util.SparseArray r13 = r12.m     // Catch:{ all -> 0x00a7 }
            r13.put(r0, r15)     // Catch:{ all -> 0x00a7 }
            r12.a((int) r0, (defpackage.arne) r15)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r15
        L_0x009e:
            android.util.LongSparseArray r15 = r12.l     // Catch:{ all -> 0x00a7 }
            arnh r0 = b     // Catch:{ all -> 0x00a7 }
            r15.put(r13, r0)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x00a7:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r13
        L_0x00aa:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00ad:
            throw r13
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arnr.a(long, boolean):arnh");
    }

    public final void b(arne arne) {
        d(arne);
    }

    public final void b(arni arni) {
        if (arni != null) {
            synchronized (this.p) {
                this.p.remove(arni);
            }
        }
    }

    public final arnk a(long j2, byte[] bArr) {
        if (this.n) {
            return this.j.a(this.f, bArr);
        }
        arnz arnz = this.i;
        if (bArr.length != 0) {
            aroq aroq = new aroq(arnz, arnz.j, this, j2, bArr);
            arnz.c.execute(aroq);
            return aroq;
        }
        throw new IllegalArgumentException("NanoApp Binary cannot be null or empty.");
    }

    public final void a(long j2, arnb arnb, Handler handler) {
        boolean z;
        NanoAppUpdaterChimeraGcmTaskService.b();
        arnc arnc = this.q;
        Long valueOf = Long.valueOf(j2);
        if (a(j2) != null) {
            z = true;
        } else {
            z = false;
        }
        aiqo aiqo = (aiqo) arnc;
        aiqo.c.execute(new aiqa(aiqo, valueOf, arnb, handler, z));
    }

    public final void a(arnb arnb) {
        aiqo aiqo = (aiqo) this.q;
        aiqo.c.execute(new aiqe(aiqo, arnb));
    }

    public final void a(arne arne) {
        c(arne);
    }

    public final void a(arne arne, Handler handler) {
        c(arne, handler);
    }

    public final void a(arni arni) {
        Handler handler = this.h;
        if (handler != null) {
            synchronized (this.p) {
                this.p.put(arni, handler);
            }
            return;
        }
        throw new IllegalArgumentException("handler cannot be null.");
    }

    public final void a(PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nContextHub State:\n");
        synchronized (this.k) {
            int size = this.l.size();
            sb.append("  NanoApps by ID:\n");
            for (int i2 = 0; i2 < size; i2++) {
                long keyAt = this.l.keyAt(i2);
                arnh b2 = b((arnh) this.l.valueAt(i2));
                if (b2 == null) {
                    sb.append("    AppId=0x");
                    sb.append(Long.toHexString(keyAt));
                    sb.append(", <null>\n");
                } else {
                    a(sb, b2);
                }
            }
            int size2 = this.m.size();
            sb.append("  NanoApps by UID:\n");
            for (int i3 = 0; i3 < size2; i3++) {
                int keyAt2 = this.m.keyAt(i3);
                arnh b3 = b((arnh) this.m.valueAt(i3));
                if (b3 == null) {
                    sb.append("    UID=");
                    sb.append(keyAt2);
                    sb.append(", <null>\n");
                } else {
                    a(sb, b3);
                }
            }
        }
        arnz arnz = this.i;
        if (arnz != null) {
            sb.append("  Events transferred by type:\n");
            synchronized (arnz.e) {
                ListIterator b4 = arnz.e.iterator();
                while (b4.hasNext()) {
                    b4.next();
                }
                while (b4.hasPrevious()) {
                    sb.append((String) b4.previous());
                    sb.append(10);
                }
            }
        }
        sb.append("\n");
        printWriter.print(sb.toString());
    }
}
