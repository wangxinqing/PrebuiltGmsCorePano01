package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aaur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaur {
    public static final anax a = anax.a((Object) 1, (Object) 12);
    public static final anax b = anax.a((Object) 12);
    public static final long c = TimeUnit.MINUTES.toMillis(30);
    static final long d = TimeUnit.DAYS.toMillis(1);
    public static final long e = TimeUnit.MINUTES.toMillis(4);
    static final SparseArray l = new SparseArray();
    public final Context f;
    public aavb g;
    public aaus h;
    public aauz i;
    SparseArray j;
    public SparseArray k;
    public final aauv m;
    public final aawl n;
    public final AtomicBoolean o;
    public long p;
    public long q;
    private final ExecutorService r;
    private final ExecutorService s = new jfz(5, 10);
    private final AtomicBoolean t;
    private final aavc u;

    static {
        aaur.class.getSimpleName();
    }

    public aaur(Context context, aavc aavc, ExecutorService executorService) {
        this.f = context;
        this.r = executorService;
        this.u = aavc;
        this.n = aawl.a(context);
        this.m = new aauv(context);
        this.t = new AtomicBoolean(true);
        this.o = new AtomicBoolean(true);
        this.r.execute(new aauo(this));
    }

    private final void a(aarq aarq) {
        int i2 = aarq.a.getInt("snet_safe_browsing_num_consecutive_update_errors", 0) + 1;
        long currentTimeMillis = System.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, (double) (i2 - 1)) * 900000.0d * (new Random().nextDouble() + 1.0d)), 86400000);
        this.q = currentTimeMillis;
        aarq.a(currentTimeMillis);
        aarq.c(i2);
    }

    private final boolean c() {
        return System.currentTimeMillis() >= this.q;
    }

    public final boolean b() {
        return (this.g == null || this.j == null || this.k == null || this.h == null || this.i == null || this.u == null) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(java.util.List r21, java.util.List r22, java.lang.String r23, java.lang.String r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r24
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            aawl r3 = r1.n
            java.util.Set r3 = r3.a()
            java.util.Iterator r4 = r21.iterator()
        L_0x0013:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0031
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r6 = r3.contains(r5)
            if (r6 == 0) goto L_0x0013
            r2.add(r5)
            goto L_0x0013
        L_0x0031:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x04b9
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            boolean r5 = r20.b()
            if (r5 == 0) goto L_0x04b8
            boolean r5 = r20.b()
            if (r5 == 0) goto L_0x0053
            boolean r5 = r20.c()
            if (r5 == 0) goto L_0x0053
            android.content.Context r5 = r1.f
            com.google.android.gms.security.snet.SafetyNetClientChimeraService.a((android.content.Context) r5)
        L_0x0053:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x005c:
            boolean r7 = r6.hasNext()
            r9 = 2
            if (r7 == 0) goto L_0x0193
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.util.SparseArray r10 = r1.j
            java.lang.Object r10 = r10.get(r7)
            aauw r10 = (defpackage.aauw) r10
            if (r10 == 0) goto L_0x018f
            java.util.Iterator r11 = r22.iterator()
        L_0x007b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()
            aaae r12 = (defpackage.aaae) r12
            java.util.concurrent.locks.ReadWriteLock r13 = r10.c
            java.util.concurrent.locks.Lock r13 = r13.readLock()
            r13.lock()
            aaae r13 = r12.b()     // Catch:{ all -> 0x0180 }
            java.util.Map r14 = r10.a     // Catch:{ all -> 0x0180 }
            if (r14 == 0) goto L_0x00df
            boolean r14 = r14.containsKey(r13)     // Catch:{ all -> 0x0180 }
            if (r14 == 0) goto L_0x00df
            java.util.Map r14 = r10.a     // Catch:{ all -> 0x0180 }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ all -> 0x0180 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x0180 }
            if (r14 != 0) goto L_0x00a9
            goto L_0x00d3
        L_0x00a9:
            boolean r15 = r14.isEmpty()     // Catch:{ all -> 0x0180 }
            if (r15 != 0) goto L_0x00d3
            java.util.Iterator r13 = r14.iterator()     // Catch:{ all -> 0x0180 }
        L_0x00b3:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x0180 }
            if (r14 == 0) goto L_0x00e3
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x0180 }
            aaae r14 = (defpackage.aaae) r14     // Catch:{ all -> 0x0180 }
            boolean r15 = r12.a((defpackage.aaae) r14)     // Catch:{ all -> 0x0180 }
            if (r15 == 0) goto L_0x00b3
            java.util.concurrent.locks.ReadWriteLock r13 = r10.c
            java.util.concurrent.locks.Lock r13 = r13.readLock()
            r13.unlock()
            r17 = r6
            r13 = r14
            goto L_0x013f
        L_0x00d3:
            java.util.concurrent.locks.ReadWriteLock r14 = r10.c
            java.util.concurrent.locks.Lock r14 = r14.readLock()
            r14.unlock()
            r17 = r6
            goto L_0x013f
        L_0x00df:
            aaai r14 = r10.b     // Catch:{ all -> 0x0180 }
            if (r14 != 0) goto L_0x00f0
        L_0x00e3:
            java.util.concurrent.locks.ReadWriteLock r13 = r10.c
            java.util.concurrent.locks.Lock r13 = r13.readLock()
            r13.unlock()
            r17 = r6
            r13 = 0
            goto L_0x013f
        L_0x00f0:
            byte[] r15 = r13.a     // Catch:{ all -> 0x0180 }
            int[] r4 = r14.a     // Catch:{ all -> 0x0180 }
            if (r4 == 0) goto L_0x0133
            long r15 = defpackage.aaai.a((byte[]) r15)     // Catch:{ all -> 0x0180 }
            int[] r4 = r14.a     // Catch:{ all -> 0x0180 }
            int r14 = r4.length     // Catch:{ all -> 0x0180 }
            r8 = -1
            int r14 = r14 + r8
            r8 = 3
        L_0x0100:
            if (r8 > r14) goto L_0x0133
            int r17 = r14 - r8
            int r17 = r17 / 2
            int r9 = r8 + r17
            r17 = r6
            r6 = r4[r9]     // Catch:{ all -> 0x0180 }
            r18 = r13
            r19 = r14
            long r13 = (long) r6     // Catch:{ all -> 0x0180 }
            long r13 = defpackage.aaai.a((long) r13)     // Catch:{ all -> 0x0180 }
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x012b
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 < 0) goto L_0x0121
            int r9 = r9 + -1
            r14 = r9
            goto L_0x0125
        L_0x0121:
            int r8 = r9 + 1
            r14 = r19
        L_0x0125:
            r6 = r17
            r13 = r18
            r9 = 2
            goto L_0x0100
        L_0x012b:
            r4 = -1
            if (r9 != r4) goto L_0x0130
            r13 = 0
            goto L_0x0136
        L_0x0130:
            r13 = r18
            goto L_0x0136
        L_0x0133:
            r17 = r6
            r13 = 0
        L_0x0136:
            java.util.concurrent.locks.ReadWriteLock r4 = r10.c
            java.util.concurrent.locks.Lock r4 = r4.readLock()
            r4.unlock()
        L_0x013f:
            if (r13 != 0) goto L_0x0178
            anax r4 = a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x0173
            android.util.SparseArray r4 = r1.k
            java.lang.Object r4 = r4.get(r7)
            aaun r4 = (defpackage.aaun) r4
            if (r4 == 0) goto L_0x016e
            aaae r6 = r12.b()
            boolean r4 = r4.a(r6)
            if (r4 == 0) goto L_0x0169
            r5.put(r6, r12)
            r6 = r17
            r9 = 2
            goto L_0x007b
        L_0x0169:
            r6 = r17
            r9 = 2
            goto L_0x007b
        L_0x016e:
            r6 = r17
            r9 = 2
            goto L_0x007b
        L_0x0173:
            r6 = r17
            r9 = 2
            goto L_0x007b
        L_0x0178:
            r5.put(r13, r12)
            r6 = r17
            r9 = 2
            goto L_0x007b
        L_0x0180:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r10.c
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            throw r0
        L_0x018b:
            r17 = r6
            goto L_0x005c
        L_0x018f:
            r17 = r6
            goto L_0x005c
        L_0x0193:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x04b8
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x01a6:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0279
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            aaae r8 = (defpackage.aaae) r8
            java.lang.Object r6 = r6.getValue()
            aaae r6 = (defpackage.aaae) r6
            aauz r9 = r1.i
            aaae r10 = r6.b()
            java.util.concurrent.locks.ReadWriteLock r11 = r9.b
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.lock()
            java.util.Map r11 = r9.a     // Catch:{ all -> 0x026e }
            boolean r11 = r11.containsKey(r10)     // Catch:{ all -> 0x026e }
            if (r11 == 0) goto L_0x0241
            java.util.Map r11 = r9.a     // Catch:{ all -> 0x026e }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ all -> 0x026e }
            aaux r10 = (defpackage.aaux) r10     // Catch:{ all -> 0x026e }
            if (r10 != 0) goto L_0x01e3
            java.util.concurrent.locks.ReadWriteLock r7 = r9.b
            goto L_0x0243
        L_0x01e3:
            java.util.Map r11 = r10.b     // Catch:{ all -> 0x026e }
            if (r11 == 0) goto L_0x020c
            boolean r11 = r11.containsKey(r6)     // Catch:{ all -> 0x026e }
            if (r11 == 0) goto L_0x020c
            java.util.Map r11 = r10.b     // Catch:{ all -> 0x026e }
            java.lang.Object r11 = r11.get(r6)     // Catch:{ all -> 0x026e }
            aauy r11 = (defpackage.aauy) r11     // Catch:{ all -> 0x026e }
            if (r11 != 0) goto L_0x01f8
            goto L_0x020c
        L_0x01f8:
            aauy r7 = defpackage.aauz.a((defpackage.aauy) r11, (boolean) r7)     // Catch:{ all -> 0x026e }
            if (r7 != 0) goto L_0x0201
            r11 = 0
            goto L_0x0202
        L_0x0201:
        L_0x0202:
            java.util.concurrent.locks.ReadWriteLock r7 = r9.b
        L_0x0204:
            java.util.concurrent.locks.Lock r7 = r7.readLock()
            r7.unlock()
            goto L_0x024c
        L_0x020c:
            java.util.Map r7 = r10.a     // Catch:{ all -> 0x026e }
            if (r7 != 0) goto L_0x0211
            goto L_0x023e
        L_0x0211:
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x026e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x026e }
        L_0x0219:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x026e }
            if (r10 == 0) goto L_0x023e
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x026e }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x026e }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x026e }
            aaae r11 = (defpackage.aaae) r11     // Catch:{ all -> 0x026e }
            boolean r11 = r6.a((defpackage.aaae) r11)     // Catch:{ all -> 0x026e }
            if (r11 == 0) goto L_0x0219
            java.lang.Object r7 = r10.getValue()     // Catch:{ all -> 0x026e }
            aauy r7 = (defpackage.aauy) r7     // Catch:{ all -> 0x026e }
            aauy r11 = defpackage.aauz.a(r7)     // Catch:{ all -> 0x026e }
            java.util.concurrent.locks.ReadWriteLock r7 = r9.b
            goto L_0x0204
        L_0x023e:
            java.util.concurrent.locks.ReadWriteLock r7 = r9.b
            goto L_0x0244
        L_0x0241:
            java.util.concurrent.locks.ReadWriteLock r7 = r9.b
        L_0x0243:
        L_0x0244:
            java.util.concurrent.locks.Lock r7 = r7.readLock()
            r7.unlock()
            r11 = 0
        L_0x024c:
            if (r11 == 0) goto L_0x0269
            aavs r7 = r11.a
            boolean r7 = defpackage.aawf.a((defpackage.aavs) r7)
            if (r7 == 0) goto L_0x01a6
            aavs r7 = r11.a
            aucx r7 = r7.b
            java.util.Set r6 = java.util.Collections.singleton(r6)
            org.json.JSONObject r6 = defpackage.aawf.a(r2, r7, r6)
            int r7 = r6.length()
            if (r7 == 0) goto L_0x01a6
            return r6
        L_0x0269:
            r4.put(r8, r6)
            goto L_0x01a6
        L_0x026e:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r9.b
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            throw r0
        L_0x0279:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x04b8
            android.content.Context r5 = r1.f
            aarq r6 = new aarq
            r6.<init>(r5)
            android.content.SharedPreferences r5 = r6.a
            java.lang.String r6 = java.lang.String.valueOf(r23)
            int r8 = r6.length()
            java.lang.String r9 = "snet_safe_browsing_next_allowed_time_to_query_ms_"
            if (r8 != 0) goto L_0x029a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r9)
            goto L_0x029e
        L_0x029a:
            java.lang.String r6 = r9.concat(r6)
        L_0x029e:
            r10 = 0
            long r5 = r5.getLong(r6, r10)
            long r12 = java.lang.System.currentTimeMillis()
            int r8 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x04b7
            java.util.Set r5 = r4.keySet()
            aavc r6 = r1.u
            android.content.Context r8 = r6.a
            aawl r8 = defpackage.aawl.a((android.content.Context) r8)
            java.util.Set r8 = r8.a()
            aavr r12 = defpackage.aavr.e
            aucd r12 = r12.o()
            aavg r13 = r6.a()
            boolean r14 = r12.c
            if (r14 == 0) goto L_0x02cf
            r12.c()
            r12.c = r7
        L_0x02cf:
            aucj r14 = r12.b
            aavr r14 = (defpackage.aavr) r14
            r13.getClass()
            r14.b = r13
            int r13 = r14.a
            r13 = r13 | 1
            r14.a = r13
            if (r0 == 0) goto L_0x031e
            aavg r13 = defpackage.aavg.d
            aucd r13 = r13.o()
            boolean r14 = r13.c
            if (r14 != 0) goto L_0x02eb
            goto L_0x02f0
        L_0x02eb:
            r13.c()
            r13.c = r7
        L_0x02f0:
            aucj r14 = r13.b
            aavg r14 = (defpackage.aavg) r14
            r24.getClass()
            int r15 = r14.a
            r15 = r15 | 1
            r14.a = r15
            r14.b = r0
            aucj r0 = r13.i()
            aavg r0 = (defpackage.aavg) r0
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x030a
            goto L_0x030f
        L_0x030a:
            r12.c()
            r12.c = r7
        L_0x030f:
            aucj r13 = r12.b
            aavr r13 = (defpackage.aavr) r13
            r0.getClass()
            r13.d = r0
            int r0 = r13.a
            r0 = r0 | 4
            r13.a = r0
        L_0x031e:
            aawc r0 = defpackage.aawc.e
            aucd r0 = r0.o()
            java.util.Iterator r8 = r8.iterator()
        L_0x0328:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x035c
            java.lang.Object r13 = r8.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r14 = r0.c
            if (r14 != 0) goto L_0x033d
            goto L_0x0342
        L_0x033d:
            r0.c()
            r0.c = r7
        L_0x0342:
            aucj r14 = r0.b
            aawc r14 = (defpackage.aawc) r14
            aucs r15 = r14.a
            boolean r15 = r15.a()
            if (r15 != 0) goto L_0x0356
            aucs r15 = r14.a
            aucs r15 = defpackage.aucj.a((defpackage.aucs) r15)
            r14.a = r15
        L_0x0356:
            aucs r14 = r14.a
            r14.d(r13)
            goto L_0x0328
        L_0x035c:
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x0361
            goto L_0x0366
        L_0x0361:
            r0.c()
            r0.c = r7
        L_0x0366:
            aucj r8 = r0.b
            aawc r8 = (defpackage.aawc) r8
            aucs r13 = r8.b
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x037a
            aucs r13 = r8.b
            aucs r13 = defpackage.aucj.a((defpackage.aucs) r13)
            r8.b = r13
        L_0x037a:
            aucs r8 = r8.b
            r13 = 3
            r8.d(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x0384:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x03e1
            java.lang.Object r8 = r5.next()
            aaae r8 = (defpackage.aaae) r8
            aavw r13 = defpackage.aavw.c
            aucd r13 = r13.o()
            byte[] r8 = r8.a
            auay r8 = defpackage.auay.a((byte[]) r8)
            boolean r14 = r13.c
            if (r14 == 0) goto L_0x03a5
            r13.c()
            r13.c = r7
        L_0x03a5:
            aucj r14 = r13.b
            aavw r14 = (defpackage.aavw) r14
            r8.getClass()
            int r15 = r14.a
            r15 = r15 | 1
            r14.a = r15
            r14.b = r8
            aucj r8 = r13.i()
            aavw r8 = (defpackage.aavw) r8
            boolean r13 = r0.c
            if (r13 != 0) goto L_0x03bf
            goto L_0x03c4
        L_0x03bf:
            r0.c()
            r0.c = r7
        L_0x03c4:
            aucj r13 = r0.b
            aawc r13 = (defpackage.aawc) r13
            r8.getClass()
            aucx r14 = r13.d
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x03db
            aucx r14 = r13.d
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.d = r14
        L_0x03db:
            aucx r13 = r13.d
            r13.add(r8)
            goto L_0x0384
        L_0x03e1:
            aawb r5 = defpackage.aawb.URL_EXPRESSION
            boolean r8 = r0.c
            if (r8 != 0) goto L_0x03e8
            goto L_0x03ed
        L_0x03e8:
            r0.c()
            r0.c = r7
        L_0x03ed:
            aucj r8 = r0.b
            aawc r8 = (defpackage.aawc) r8
            r5.getClass()
            aucs r13 = r8.c
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x0404
            aucs r13 = r8.c
            aucs r13 = defpackage.aucj.a((defpackage.aucs) r13)
            r8.c = r13
        L_0x0404:
            aucs r8 = r8.c
            int r5 = r5.e
            r8.d(r5)
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x0410
            goto L_0x0415
        L_0x0410:
            r12.c()
            r12.c = r7
        L_0x0415:
            aucj r5 = r12.b
            aavr r5 = (defpackage.aavr) r5
            aucj r0 = r0.i()
            aawc r0 = (defpackage.aawc) r0
            r0.getClass()
            r5.c = r0
            int r0 = r5.a
            r7 = 2
            r0 = r0 | r7
            r5.a = r0
            aucj r0 = r12.i()
            aavr r0 = (defpackage.aavr) r0
            byte[] r0 = r0.k()
            r5 = r23
            byte[] r0 = r6.a(r7, r0, r5)
            if (r0 == 0) goto L_0x044f
            int r6 = r0.length
            if (r6 == 0) goto L_0x044f
            aubs r6 = defpackage.aubs.c()     // Catch:{ auda -> 0x044c }
            aavs r7 = defpackage.aavs.e     // Catch:{ auda -> 0x044c }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r0, (defpackage.aubs) r6)     // Catch:{ auda -> 0x044c }
            aavs r0 = (defpackage.aavs) r0     // Catch:{ auda -> 0x044c }
            goto L_0x0450
        L_0x044c:
            r0 = move-exception
            r0 = 0
            goto L_0x0450
        L_0x044f:
            r0 = 0
        L_0x0450:
            if (r0 == 0) goto L_0x04b6
            android.content.Context r6 = r1.f
            int r7 = r0.a
            r7 = r7 & 1
            if (r7 == 0) goto L_0x0495
            aavj r7 = r0.c
            if (r7 == 0) goto L_0x045f
            goto L_0x0461
        L_0x045f:
            aavj r7 = defpackage.aavj.b
        L_0x0461:
            long r7 = r7.a
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0495
            long r7 = java.lang.System.currentTimeMillis()
            aavj r10 = r0.c
            if (r10 == 0) goto L_0x0470
            goto L_0x0472
        L_0x0470:
            aavj r10 = defpackage.aavj.b
        L_0x0472:
            long r10 = r10.a
            aarq r12 = new aarq
            r12.<init>(r6)
            r13 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r13
            long r7 = r7 + r10
            java.lang.String r5 = java.lang.String.valueOf(r23)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x048e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r9)
            goto L_0x0492
        L_0x048e:
            java.lang.String r5 = r9.concat(r5)
        L_0x0492:
            r12.a((java.lang.String) r5, (long) r7)
        L_0x0495:
            java.util.concurrent.ExecutorService r5 = r1.s
            aaup r6 = new aaup
            r6.<init>(r1, r4, r0)
            r5.execute(r6)
            boolean r5 = defpackage.aawf.a((defpackage.aavs) r0)
            if (r5 == 0) goto L_0x04b5
            aucx r0 = r0.b
            java.util.HashSet r3 = new java.util.HashSet
            java.util.Collection r4 = r4.values()
            r3.<init>(r4)
            org.json.JSONObject r0 = defpackage.aawf.a(r2, r0, r3)
            return r0
        L_0x04b5:
            return r3
        L_0x04b6:
            return r3
        L_0x04b7:
            return r3
        L_0x04b8:
            return r3
        L_0x04b9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaur.a(java.util.List, java.util.List, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ef, code lost:
        if (r23 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f2, code lost:
        r23.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f5, code lost:
        r0 = r1.t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x032e, code lost:
        if (r23 == null) goto L_0x01f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aauq r23) {
        /*
            r22 = this;
            r1 = r22
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            r2 = 1
            r3 = 0
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L_0x0340
            aarq r4 = new aarq     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = r1.f     // Catch:{ all -> 0x0332 }
            r4.<init>(r0)     // Catch:{ all -> 0x0332 }
            boolean r0 = r22.c()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x032e
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0332 }
            android.util.SparseArray r0 = new android.util.SparseArray     // Catch:{ all -> 0x0332 }
            r0.<init>()     // Catch:{ all -> 0x0332 }
            aawl r7 = r1.n     // Catch:{ all -> 0x0332 }
            java.util.Set r7 = r7.a()     // Catch:{ all -> 0x0332 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0332 }
        L_0x002c:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0332 }
            if (r8 == 0) goto L_0x006a
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0332 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0332 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0332 }
            anax r9 = a     // Catch:{ all -> 0x0332 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0332 }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x0332 }
            if (r9 == 0) goto L_0x0053
            long r9 = r4.a((int) r8)     // Catch:{ all -> 0x0332 }
            long r11 = d     // Catch:{ all -> 0x0332 }
            long r9 = r9 + r11
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 > 0) goto L_0x002c
        L_0x0053:
            android.util.SparseArray r9 = r1.j     // Catch:{ all -> 0x0332 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0332 }
            aauw r9 = (defpackage.aauw) r9     // Catch:{ all -> 0x0332 }
            if (r9 == 0) goto L_0x0065
            byte[] r9 = r9.a()     // Catch:{ all -> 0x0332 }
            r0.put(r8, r9)     // Catch:{ all -> 0x0332 }
            goto L_0x002c
        L_0x0065:
            r9 = 0
            r0.put(r8, r9)     // Catch:{ all -> 0x0332 }
            goto L_0x002c
        L_0x006a:
            int r7 = r0.size()     // Catch:{ all -> 0x0332 }
            if (r7 == 0) goto L_0x0324
            aavc r7 = r1.u     // Catch:{ all -> 0x0332 }
            aavm r8 = defpackage.aavm.d     // Catch:{ all -> 0x0332 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x0332 }
            aavg r9 = r7.a()     // Catch:{ all -> 0x0332 }
            boolean r10 = r8.c     // Catch:{ all -> 0x0332 }
            if (r10 != 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            r8.c()     // Catch:{ all -> 0x0332 }
            r8.c = r3     // Catch:{ all -> 0x0332 }
        L_0x0086:
            aucj r10 = r8.b     // Catch:{ all -> 0x0332 }
            aavm r10 = (defpackage.aavm) r10     // Catch:{ all -> 0x0332 }
            r9.getClass()     // Catch:{ all -> 0x0332 }
            r10.b = r9     // Catch:{ all -> 0x0332 }
            int r9 = r10.a     // Catch:{ all -> 0x0332 }
            r9 = r9 | r2
            r10.a = r9     // Catch:{ all -> 0x0332 }
            android.content.Context r9 = r7.a     // Catch:{ all -> 0x0332 }
            aawl r9 = defpackage.aawl.a((android.content.Context) r9)     // Catch:{ all -> 0x0332 }
            r10 = 0
        L_0x009b:
            int r11 = r0.size()     // Catch:{ all -> 0x0332 }
            if (r10 < r11) goto L_0x021d
            aucj r0 = r8.i()     // Catch:{ all -> 0x0332 }
            aavm r0 = (defpackage.aavm) r0     // Catch:{ all -> 0x0332 }
            byte[] r0 = r0.k()     // Catch:{ all -> 0x0332 }
            java.lang.String r8 = "AIzaSyBOOWlOhte3AhpCUZaoGoHa1yjYRI1dIww"
            byte[] r0 = r7.a(r2, r0, r8)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x0211
            aubs r7 = defpackage.aubs.c()     // Catch:{ OutOfMemoryError -> 0x0204, auda -> 0x0202 }
            aavq r8 = defpackage.aavq.d     // Catch:{ OutOfMemoryError -> 0x0204, auda -> 0x0202 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r8, (byte[]) r0, (defpackage.aubs) r7)     // Catch:{ OutOfMemoryError -> 0x0204, auda -> 0x0202 }
            aavq r0 = (defpackage.aavq) r0     // Catch:{ OutOfMemoryError -> 0x0204, auda -> 0x0202 }
            java.lang.String r7 = "snet_safe_browsing_last_update_time_ms"
            r4.a((java.lang.String) r7, (long) r5)     // Catch:{ all -> 0x0332 }
            r4.c(r3)     // Catch:{ all -> 0x0332 }
            int r7 = r0.a     // Catch:{ all -> 0x0332 }
            r7 = r7 & r2
            if (r7 == 0) goto L_0x00f2
            aavj r7 = r0.c     // Catch:{ all -> 0x0332 }
            if (r7 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            aavj r7 = defpackage.aavj.b     // Catch:{ all -> 0x0332 }
        L_0x00d3:
            long r7 = r7.a     // Catch:{ all -> 0x0332 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f2
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0332 }
            aavj r9 = r0.c     // Catch:{ all -> 0x0332 }
            if (r9 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            aavj r9 = defpackage.aavj.b     // Catch:{ all -> 0x0332 }
        L_0x00e6:
            long r9 = r9.a     // Catch:{ all -> 0x0332 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r7 = r7 + r9
            r1.q = r7     // Catch:{ all -> 0x0332 }
            r4.a((long) r7)     // Catch:{ all -> 0x0332 }
        L_0x00f2:
            android.util.SparseArray r7 = defpackage.aawf.a((defpackage.aavq) r0)     // Catch:{ OutOfMemoryError -> 0x01f8 }
            if (r7 == 0) goto L_0x01ef
        L_0x00f8:
            int r0 = r7.size()     // Catch:{ all -> 0x0332 }
            if (r3 >= r0) goto L_0x01e1
            int r0 = r7.keyAt(r3)     // Catch:{ all -> 0x0332 }
            java.lang.Object r8 = r7.get(r0)     // Catch:{ all -> 0x0332 }
            aawe r8 = (defpackage.aawe) r8     // Catch:{ all -> 0x0332 }
            java.util.List r10 = r8.a     // Catch:{ OutOfMemoryError -> 0x01db }
            java.util.Queue r11 = r8.b     // Catch:{ OutOfMemoryError -> 0x01db }
            byte[] r12 = r8.c     // Catch:{ OutOfMemoryError -> 0x01db }
            byte[] r13 = r8.d     // Catch:{ OutOfMemoryError -> 0x01db }
            boolean r8 = r8.e     // Catch:{ OutOfMemoryError -> 0x01db }
            aawl r9 = r1.n     // Catch:{ OutOfMemoryError -> 0x01db }
            java.util.Set r9 = r9.a()     // Catch:{ OutOfMemoryError -> 0x01db }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            boolean r9 = r9.contains(r15)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 != 0) goto L_0x0124
            goto L_0x01dc
        L_0x0124:
            boolean r9 = r22.b()     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 == 0) goto L_0x01dc
            boolean r9 = defpackage.aans.a((java.util.Collection) r10)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 != 0) goto L_0x0131
        L_0x0130:
            goto L_0x0138
        L_0x0131:
            boolean r9 = defpackage.aans.a((java.util.Collection) r11)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 != 0) goto L_0x01d3
            goto L_0x0130
        L_0x0138:
            android.util.SparseArray r9 = r1.j     // Catch:{ OutOfMemoryError -> 0x01db }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            aauw r9 = (defpackage.aauw) r9     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r8 != 0) goto L_0x017e
            anax r14 = a     // Catch:{ OutOfMemoryError -> 0x01db }
            boolean r14 = r14.contains(r15)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r14 == 0) goto L_0x017e
            android.util.SparseArray r14 = r1.k     // Catch:{ OutOfMemoryError -> 0x01db }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            aaun r14 = (defpackage.aaun) r14     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r14 == 0) goto L_0x017e
            java.util.List r17 = r14.c()     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r17 == 0) goto L_0x017e
            boolean r14 = r17.isEmpty()     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r14 != 0) goto L_0x017e
            aauw r9 = new aauw     // Catch:{ OutOfMemoryError -> 0x01db }
            r9.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            aavb r14 = r1.g     // Catch:{ OutOfMemoryError -> 0x01db }
            aava r14 = r14.a(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r14 == 0) goto L_0x017e
            r18 = 0
            byte[] r2 = r14.a     // Catch:{ OutOfMemoryError -> 0x01db }
            byte[] r14 = r14.b     // Catch:{ OutOfMemoryError -> 0x01db }
            r21 = 1
            r16 = r9
            r19 = r2
            r20 = r14
            r16.a(r17, r18, r19, r20, r21)     // Catch:{ OutOfMemoryError -> 0x01db }
        L_0x017e:
            r2 = r9
            if (r2 != 0) goto L_0x0195
            aauw r2 = new aauw     // Catch:{ OutOfMemoryError -> 0x01db }
            r2.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            r11 = 0
            r9 = r2
            r14 = r8
            boolean r9 = r9.a(r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 == 0) goto L_0x01dc
            android.util.SparseArray r9 = r1.j     // Catch:{ OutOfMemoryError -> 0x01db }
            r9.put(r0, r2)     // Catch:{ OutOfMemoryError -> 0x01db }
            goto L_0x019d
        L_0x0195:
            r9 = r2
            r14 = r8
            boolean r9 = r9.a(r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 == 0) goto L_0x01dc
        L_0x019d:
            android.util.SparseArray r9 = r1.k     // Catch:{ OutOfMemoryError -> 0x01db }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            aaun r9 = (defpackage.aaun) r9     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 != 0) goto L_0x01bb
            aaun r9 = new aaun     // Catch:{ OutOfMemoryError -> 0x01db }
            android.content.Context r10 = r1.f     // Catch:{ OutOfMemoryError -> 0x01db }
            aauv r11 = r1.m     // Catch:{ OutOfMemoryError -> 0x01db }
            r9.<init>(r10, r0, r11)     // Catch:{ OutOfMemoryError -> 0x01db }
            aavb r10 = r1.g     // Catch:{ OutOfMemoryError -> 0x01db }
            r9.a(r2, r10)     // Catch:{ OutOfMemoryError -> 0x01db }
            android.util.SparseArray r10 = r1.k     // Catch:{ OutOfMemoryError -> 0x01db }
            r10.put(r0, r9)     // Catch:{ OutOfMemoryError -> 0x01db }
            goto L_0x01c0
        L_0x01bb:
            aavb r10 = r1.g     // Catch:{ OutOfMemoryError -> 0x01db }
            r9.a(r2, r10)     // Catch:{ OutOfMemoryError -> 0x01db }
        L_0x01c0:
            anax r9 = a     // Catch:{ OutOfMemoryError -> 0x01db }
            boolean r9 = r9.contains(r15)     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r9 != 0) goto L_0x01c9
            goto L_0x01d3
        L_0x01c9:
            r2.b()     // Catch:{ OutOfMemoryError -> 0x01db }
            if (r8 != 0) goto L_0x01d3
            android.util.SparseArray r8 = r1.j     // Catch:{ OutOfMemoryError -> 0x01db }
            r8.put(r0, r2)     // Catch:{ OutOfMemoryError -> 0x01db }
        L_0x01d3:
            java.lang.String r0 = defpackage.aarq.b(r0)     // Catch:{ OutOfMemoryError -> 0x01db }
            r4.a((java.lang.String) r0, (long) r5)     // Catch:{ OutOfMemoryError -> 0x01db }
            goto L_0x01dc
        L_0x01db:
            r0 = move-exception
        L_0x01dc:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x00f8
        L_0x01e1:
            if (r23 != 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            r23.a()
        L_0x01e7:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
        L_0x01e9:
        L_0x01ea:
            r2 = 1
            r0.set(r2)
            return
        L_0x01ef:
            if (r23 != 0) goto L_0x01f2
            goto L_0x01f5
        L_0x01f2:
            r23.a()
        L_0x01f5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            goto L_0x01e9
        L_0x01f8:
            r0 = move-exception
            if (r23 != 0) goto L_0x01fc
            goto L_0x01ff
        L_0x01fc:
            r23.a()
        L_0x01ff:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            goto L_0x01ea
        L_0x0202:
            r0 = move-exception
            goto L_0x0205
        L_0x0204:
            r0 = move-exception
        L_0x0205:
            r1.a((defpackage.aarq) r4)     // Catch:{ all -> 0x0332 }
            if (r23 != 0) goto L_0x020b
            goto L_0x020e
        L_0x020b:
            r23.a()
        L_0x020e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            goto L_0x01e9
        L_0x0211:
            r1.a((defpackage.aarq) r4)     // Catch:{ all -> 0x0332 }
            if (r23 != 0) goto L_0x0217
            goto L_0x021a
        L_0x0217:
            r23.a()
        L_0x021a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            goto L_0x01e9
        L_0x021d:
            aavl r2 = defpackage.aavl.g     // Catch:{ all -> 0x0332 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0332 }
            int r11 = r0.keyAt(r10)     // Catch:{ all -> 0x0332 }
            boolean r12 = r2.c     // Catch:{ all -> 0x0332 }
            if (r12 != 0) goto L_0x022c
            goto L_0x0231
        L_0x022c:
            r2.c()     // Catch:{ all -> 0x0332 }
            r2.c = r3     // Catch:{ all -> 0x0332 }
        L_0x0231:
            aucj r12 = r2.b     // Catch:{ all -> 0x0332 }
            aavl r12 = (defpackage.aavl) r12     // Catch:{ all -> 0x0332 }
            int r13 = r12.a     // Catch:{ all -> 0x0332 }
            r14 = 1
            r13 = r13 | r14
            r12.a = r13     // Catch:{ all -> 0x0332 }
            r12.b = r11     // Catch:{ all -> 0x0332 }
            r13 = r13 | 2
            r12.a = r13     // Catch:{ all -> 0x0332 }
            r13 = 3
            r12.c = r13     // Catch:{ all -> 0x0332 }
            r12 = 12
            if (r11 != r12) goto L_0x024b
            aawb r12 = defpackage.aawb.BINARY_DIGEST     // Catch:{ all -> 0x0332 }
            goto L_0x024d
        L_0x024b:
            aawb r12 = defpackage.aawb.URL_EXPRESSION     // Catch:{ all -> 0x0332 }
        L_0x024d:
            boolean r13 = r2.c     // Catch:{ all -> 0x0332 }
            if (r13 != 0) goto L_0x0252
            goto L_0x0257
        L_0x0252:
            r2.c()     // Catch:{ all -> 0x0332 }
            r2.c = r3     // Catch:{ all -> 0x0332 }
        L_0x0257:
            aucj r13 = r2.b     // Catch:{ all -> 0x0332 }
            aavl r13 = (defpackage.aavl) r13     // Catch:{ all -> 0x0332 }
            int r12 = r12.e     // Catch:{ all -> 0x0332 }
            r13.d = r12     // Catch:{ all -> 0x0332 }
            int r12 = r13.a     // Catch:{ all -> 0x0332 }
            r12 = r12 | 4
            r13.a = r12     // Catch:{ all -> 0x0332 }
            java.lang.Object r12 = r0.valueAt(r10)     // Catch:{ all -> 0x0332 }
            byte[] r12 = (byte[]) r12     // Catch:{ all -> 0x0332 }
            if (r12 != 0) goto L_0x026e
            goto L_0x028e
        L_0x026e:
            int r13 = r12.length     // Catch:{ all -> 0x0332 }
            if (r13 <= 0) goto L_0x028e
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x0332 }
            boolean r13 = r2.c     // Catch:{ all -> 0x0332 }
            if (r13 != 0) goto L_0x027a
            goto L_0x027f
        L_0x027a:
            r2.c()     // Catch:{ all -> 0x0332 }
            r2.c = r3     // Catch:{ all -> 0x0332 }
        L_0x027f:
            aucj r13 = r2.b     // Catch:{ all -> 0x0332 }
            aavl r13 = (defpackage.aavl) r13     // Catch:{ all -> 0x0332 }
            r12.getClass()     // Catch:{ all -> 0x0332 }
            int r14 = r13.a     // Catch:{ all -> 0x0332 }
            r14 = r14 | 8
            r13.a = r14     // Catch:{ all -> 0x0332 }
            r13.e = r12     // Catch:{ all -> 0x0332 }
        L_0x028e:
            aavk r12 = defpackage.aavk.e     // Catch:{ all -> 0x0332 }
            aucd r12 = r12.o()     // Catch:{ all -> 0x0332 }
            int r13 = r9.a((int) r11)     // Catch:{ all -> 0x0332 }
            boolean r14 = r12.c     // Catch:{ all -> 0x0332 }
            if (r14 != 0) goto L_0x029d
            goto L_0x02a2
        L_0x029d:
            r12.c()     // Catch:{ all -> 0x0332 }
            r12.c = r3     // Catch:{ all -> 0x0332 }
        L_0x02a2:
            aucj r14 = r12.b     // Catch:{ all -> 0x0332 }
            aavk r14 = (defpackage.aavk) r14     // Catch:{ all -> 0x0332 }
            int r15 = r14.a     // Catch:{ all -> 0x0332 }
            r16 = 1
            r15 = r15 | 1
            r14.a = r15     // Catch:{ all -> 0x0332 }
            r14.b = r13     // Catch:{ all -> 0x0332 }
            int r11 = r9.a((int) r11)     // Catch:{ all -> 0x0332 }
            boolean r13 = r12.c     // Catch:{ all -> 0x0332 }
            if (r13 != 0) goto L_0x02b9
            goto L_0x02be
        L_0x02b9:
            r12.c()     // Catch:{ all -> 0x0332 }
            r12.c = r3     // Catch:{ all -> 0x0332 }
        L_0x02be:
            aucj r13 = r12.b     // Catch:{ all -> 0x0332 }
            aavk r13 = (defpackage.aavk) r13     // Catch:{ all -> 0x0332 }
            int r14 = r13.a     // Catch:{ all -> 0x0332 }
            r14 = r14 | 2
            r13.a = r14     // Catch:{ all -> 0x0332 }
            r13.c = r11     // Catch:{ all -> 0x0332 }
            aavi r11 = defpackage.aavi.RAW     // Catch:{ all -> 0x0332 }
            r12.a((defpackage.aavi) r11)     // Catch:{ all -> 0x0332 }
            aavi r11 = defpackage.aavi.RICE     // Catch:{ all -> 0x0332 }
            r12.a((defpackage.aavi) r11)     // Catch:{ all -> 0x0332 }
            boolean r11 = r2.c     // Catch:{ all -> 0x0332 }
            if (r11 != 0) goto L_0x02d9
            goto L_0x02de
        L_0x02d9:
            r2.c()     // Catch:{ all -> 0x0332 }
            r2.c = r3     // Catch:{ all -> 0x0332 }
        L_0x02de:
            aucj r11 = r2.b     // Catch:{ all -> 0x0332 }
            aavl r11 = (defpackage.aavl) r11     // Catch:{ all -> 0x0332 }
            aucj r12 = r12.i()     // Catch:{ all -> 0x0332 }
            aavk r12 = (defpackage.aavk) r12     // Catch:{ all -> 0x0332 }
            r12.getClass()     // Catch:{ all -> 0x0332 }
            r11.f = r12     // Catch:{ all -> 0x0332 }
            int r12 = r11.a     // Catch:{ all -> 0x0332 }
            r12 = r12 | 16
            r11.a = r12     // Catch:{ all -> 0x0332 }
            boolean r11 = r8.c     // Catch:{ all -> 0x0332 }
            if (r11 != 0) goto L_0x02f8
            goto L_0x02fd
        L_0x02f8:
            r8.c()     // Catch:{ all -> 0x0332 }
            r8.c = r3     // Catch:{ all -> 0x0332 }
        L_0x02fd:
            aucj r11 = r8.b     // Catch:{ all -> 0x0332 }
            aavm r11 = (defpackage.aavm) r11     // Catch:{ all -> 0x0332 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x0332 }
            aavl r2 = (defpackage.aavl) r2     // Catch:{ all -> 0x0332 }
            r2.getClass()     // Catch:{ all -> 0x0332 }
            aucx r12 = r11.c     // Catch:{ all -> 0x0332 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x0332 }
            if (r12 != 0) goto L_0x031a
            aucx r12 = r11.c     // Catch:{ all -> 0x0332 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x0332 }
            r11.c = r12     // Catch:{ all -> 0x0332 }
        L_0x031a:
            aucx r11 = r11.c     // Catch:{ all -> 0x0332 }
            r11.add(r2)     // Catch:{ all -> 0x0332 }
            int r10 = r10 + 1
            r2 = 1
            goto L_0x009b
        L_0x0324:
            if (r23 != 0) goto L_0x0327
            goto L_0x032a
        L_0x0327:
            r23.a()
        L_0x032a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.t
            goto L_0x01e9
        L_0x032e:
            if (r23 != 0) goto L_0x01f2
            goto L_0x01f5
        L_0x0332:
            r0 = move-exception
            if (r23 != 0) goto L_0x0336
            goto L_0x0339
        L_0x0336:
            r23.a()
        L_0x0339:
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.t
            r3 = 1
            r2.set(r3)
            throw r0
        L_0x0340:
            if (r23 == 0) goto L_0x0345
            r23.a()
        L_0x0345:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaur.a(aauq):void");
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        aauw aauw;
        byte[] bArr;
        int length;
        if (b()) {
            try {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < this.j.size(); i3++) {
                    aauw = (aauw) this.j.valueAt(i3);
                    if (!a.contains(Integer.valueOf(this.j.keyAt(i3)))) {
                        aauw.c.readLock().lock();
                        int[] iArr = aauw.b.a;
                        if (iArr == null || (length = iArr.length) == 0) {
                            bArr = null;
                        } else {
                            bArr = new byte[(length * 4)];
                            for (int i4 = 0; i4 < iArr.length; i4++) {
                                long j2 = ((long) iArr[i4]) & 4294967295L;
                                int i5 = i4 * 4;
                                bArr[i5 + 3] = (byte) ((int) (255 & j2));
                                bArr[i5 + 2] = (byte) ((int) ((65280 & j2) >>> 8));
                                bArr[i5 + 1] = (byte) ((int) ((16711680 & j2) >>> 16));
                                bArr[i5] = (byte) ((int) ((j2 & -16777216) >>> 24));
                            }
                        }
                        aauw.c.readLock().unlock();
                        arrayList.add(bArr);
                        i2 += bArr.length;
                    }
                }
                return aaag.a(arrayList, i2);
            } catch (OutOfMemoryError e2) {
            } catch (Throwable th) {
                aauw.c.readLock().unlock();
                throw th;
            }
        }
        return null;
    }
}
