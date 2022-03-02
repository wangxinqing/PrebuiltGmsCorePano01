package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahvc extends Thread {
    public volatile ahss a;
    public volatile aqek b;
    public ahto c;
    public ahuc d;
    public final ajrh e;
    public final Object f = new Object();
    public volatile boolean g = false;
    private volatile Context h;
    private volatile ahsg i;
    private volatile ahua j;
    private final Integer k;
    private final ahyk l;
    private final ajbl m;
    private final aqek n;
    private final ajbg o;
    private final CountDownLatch p;

    public ahvc(ajbg ajbg, Context context, ahsg ahsg, CountDownLatch countDownLatch, ahyk ahyk, ajbl ajbl, aqek aqek, Integer num, ahss ahss, ajrh ajrh) {
        new ahva(this);
        setName("SignalCollector.ScannerThread");
        setPriority(4);
        this.i = ahsg;
        this.h = context;
        this.a = ahss;
        this.k = num;
        this.e = ajrh;
        this.p = countDownLatch;
        this.n = aqek;
        this.l = ahyk;
        this.m = ajbl;
        this.o = ajbg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: ahts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: ahts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: ahui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: ahts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: ahst} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: ahst} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: ahtw} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0270, code lost:
        if (r7.c().contains(defpackage.ahup.ACCELEROMETER) == false) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03b7, code lost:
        if (r4 != false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03b9, code lost:
        r0 = "RealCollector: Nothing to scan.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x03be, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03c6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r1 = r34
            ahsg r0 = r1.i
            aizx r0 = r0.a()
            ajbg r2 = r1.o
            ajbe r3 = defpackage.ajbe.COLLECTIONLIB_SIG_COLLECTOR
            r4 = 600000(0x927c0, double:2.964394E-318)
            r2.b(r3, r4, r0)
            android.os.Looper.prepare()     // Catch:{ all -> 0x041f }
            ahvb r0 = new ahvb     // Catch:{ all -> 0x041f }
            r0.<init>(r1)     // Catch:{ all -> 0x041f }
            r4 = 1
            ahsg r5 = r1.i     // Catch:{ IOException -> 0x03ca }
            ahsg r5 = r5.m()     // Catch:{ IOException -> 0x03ca }
            r1.i = r5     // Catch:{ IOException -> 0x03ca }
            java.lang.Object r5 = r1.f     // Catch:{ IOException -> 0x03ca }
            monitor-enter(r5)     // Catch:{ IOException -> 0x03ca }
            ahuc r6 = new ahuc     // Catch:{ all -> 0x03c2 }
            ajbg r7 = r1.o     // Catch:{ all -> 0x03c2 }
            ajrh r8 = r1.e     // Catch:{ all -> 0x03c2 }
            r6.<init>(r7, r0, r8)     // Catch:{ all -> 0x03c2 }
            r1.d = r6     // Catch:{ all -> 0x03c2 }
            android.content.Context r0 = r1.h     // Catch:{ all -> 0x03c2 }
            ahsg r7 = r1.i     // Catch:{ all -> 0x03c2 }
            ahyk r8 = r1.l     // Catch:{ all -> 0x03c2 }
            ajbl r15 = r1.m     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r14 = r1.k     // Catch:{ all -> 0x03c2 }
            aqek r13 = r1.n     // Catch:{ all -> 0x03c2 }
            ahss r12 = r1.a     // Catch:{ all -> 0x03c2 }
            r6.i = r7     // Catch:{ all -> 0x03c2 }
            aizx r26 = r7.a()     // Catch:{ all -> 0x03c2 }
            int r9 = r7.s()     // Catch:{ all -> 0x03c2 }
            r11 = 2
            r10 = 4
            if (r9 == r10) goto L_0x0189
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x03c2 }
            r9.<init>()     // Catch:{ all -> 0x03c2 }
            int r16 = r7.s()     // Catch:{ all -> 0x03c2 }
            int r2 = r16 + -1
            if (r16 == 0) goto L_0x0186
            if (r2 == r4) goto L_0x013b
            if (r2 == r11) goto L_0x00fd
            if (r2 == r10) goto L_0x00b9
            r10 = 5
            if (r2 == r10) goto L_0x0074
            ahtw r2 = new ahtw     // Catch:{ all -> 0x03c2 }
            ajrh r9 = r6.e     // Catch:{ all -> 0x03c2 }
            r2.<init>(r12, r9)     // Catch:{ all -> 0x03c2 }
            r17 = r2
            r25 = r12
            r4 = r13
            r3 = r14
            r27 = r15
            goto L_0x0169
        L_0x0074:
            ahts r2 = new ahts     // Catch:{ all -> 0x03c2 }
            ajbg r10 = r6.h     // Catch:{ all -> 0x03c2 }
            java.lang.String r18 = r7.d()     // Catch:{ all -> 0x03c2 }
            byte[] r19 = r7.j()     // Catch:{ all -> 0x03c2 }
            ajrh r11 = r6.e     // Catch:{ all -> 0x03c2 }
            ahuz r4 = new ahuz     // Catch:{ all -> 0x03c2 }
            boolean r3 = r7.o()     // Catch:{ all -> 0x03c2 }
            r4.<init>(r3)     // Catch:{ all -> 0x03c2 }
            r16 = r2
            r17 = r10
            r20 = r12
            r21 = r11
            r22 = r4
            r23 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03c2 }
            r9.add(r2)     // Catch:{ all -> 0x03c2 }
            ahtw r2 = new ahtw     // Catch:{ all -> 0x03c2 }
            ajrh r3 = r6.e     // Catch:{ all -> 0x03c2 }
            r4 = 0
            r2.<init>(r12, r3, r4)     // Catch:{ all -> 0x03c2 }
            r9.add(r2)     // Catch:{ all -> 0x03c2 }
            ahst r2 = new ahst     // Catch:{ all -> 0x03c2 }
            ajrh r3 = r6.e     // Catch:{ all -> 0x03c2 }
            r2.<init>(r12, r3, r9)     // Catch:{ all -> 0x03c2 }
            r17 = r2
            r25 = r12
            r4 = r13
            r3 = r14
            r27 = r15
            goto L_0x0169
        L_0x00b9:
            ahts r2 = new ahts     // Catch:{ all -> 0x03c2 }
            ajbg r3 = r6.h     // Catch:{ all -> 0x03c2 }
            java.lang.String r18 = r7.d()     // Catch:{ all -> 0x03c2 }
            byte[] r19 = r7.j()     // Catch:{ all -> 0x03c2 }
            ajrh r4 = r6.e     // Catch:{ all -> 0x03c2 }
            ahuz r10 = new ahuz     // Catch:{ all -> 0x03c2 }
            boolean r11 = r7.o()     // Catch:{ all -> 0x03c2 }
            r10.<init>(r11)     // Catch:{ all -> 0x03c2 }
            r16 = r2
            r17 = r3
            r20 = r12
            r21 = r4
            r22 = r10
            r23 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03c2 }
            r9.add(r2)     // Catch:{ all -> 0x03c2 }
            ahtw r2 = new ahtw     // Catch:{ all -> 0x03c2 }
            ajrh r3 = r6.e     // Catch:{ all -> 0x03c2 }
            r2.<init>(r12, r3)     // Catch:{ all -> 0x03c2 }
            r9.add(r2)     // Catch:{ all -> 0x03c2 }
            ahst r2 = new ahst     // Catch:{ all -> 0x03c2 }
            ajrh r3 = r6.e     // Catch:{ all -> 0x03c2 }
            r2.<init>(r12, r3, r9)     // Catch:{ all -> 0x03c2 }
            r17 = r2
            r25 = r12
            r4 = r13
            r3 = r14
            r27 = r15
            goto L_0x0169
        L_0x00fd:
            ahui r2 = new ahui     // Catch:{ all -> 0x03c2 }
            ajbg r11 = r6.h     // Catch:{ all -> 0x03c2 }
            ahuz r3 = new ahuz     // Catch:{ all -> 0x03c2 }
            boolean r4 = r7.o()     // Catch:{ all -> 0x03c2 }
            r3.<init>(r4)     // Catch:{ all -> 0x03c2 }
            r4 = 3
            r16 = 0
            java.lang.String r17 = r7.d()     // Catch:{ all -> 0x03c2 }
            byte[] r18 = r7.j()     // Catch:{ all -> 0x03c2 }
            java.lang.String r19 = defpackage.ahui.b()     // Catch:{ all -> 0x03c2 }
            ajrh r10 = r6.e     // Catch:{ all -> 0x03c2 }
            r9 = r2
            r20 = r10
            r10 = r0
            r25 = r12
            r12 = r4
            r4 = r13
            r13 = r3
            r3 = r14
            r14 = r16
            r27 = r15
            r15 = r17
            r16 = r18
            r17 = r25
            r18 = r19
            r19 = r20
            r20 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03c2 }
            r17 = r2
            goto L_0x0169
        L_0x013b:
            r25 = r12
            r4 = r13
            r3 = r14
            r27 = r15
            ahts r2 = new ahts     // Catch:{ all -> 0x03c2 }
            ajbg r9 = r6.h     // Catch:{ all -> 0x03c2 }
            java.lang.String r18 = r7.d()     // Catch:{ all -> 0x03c2 }
            byte[] r19 = r7.j()     // Catch:{ all -> 0x03c2 }
            ajrh r10 = r6.e     // Catch:{ all -> 0x03c2 }
            ahuz r11 = new ahuz     // Catch:{ all -> 0x03c2 }
            boolean r12 = r7.o()     // Catch:{ all -> 0x03c2 }
            r11.<init>(r12)     // Catch:{ all -> 0x03c2 }
            r16 = r2
            r17 = r9
            r20 = r25
            r21 = r10
            r22 = r11
            r23 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03c2 }
            r17 = r2
        L_0x0169:
            ahtf r2 = new ahtf     // Catch:{ all -> 0x03c2 }
            java.lang.String r18 = r0.getPackageName()     // Catch:{ all -> 0x03c2 }
            java.lang.String r19 = r7.b()     // Catch:{ all -> 0x03c2 }
            ajbt r22 = new ajbt     // Catch:{ all -> 0x03c2 }
            r22.<init>()     // Catch:{ all -> 0x03c2 }
            r16 = r2
            r20 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x03c2 }
            r6.c = r2     // Catch:{ all -> 0x03c2 }
            r3 = r25
            goto L_0x0196
        L_0x0186:
            r2 = 0
            throw r2     // Catch:{ all -> 0x03c2 }
        L_0x0189:
            r25 = r12
            r27 = r15
            ahur r2 = new ahur     // Catch:{ all -> 0x03c2 }
            r3 = r25
            r2.<init>(r3)     // Catch:{ all -> 0x03c2 }
            r6.c = r2     // Catch:{ all -> 0x03c2 }
        L_0x0196:
            ahsr r2 = new ahsr     // Catch:{ all -> 0x03c2 }
            ahuj r4 = r6.c     // Catch:{ all -> 0x03c2 }
            android.os.Handler r9 = r6.a     // Catch:{ all -> 0x03c2 }
            r2.<init>(r4, r9)     // Catch:{ all -> 0x03c2 }
            r6.d = r2     // Catch:{ all -> 0x03c2 }
            boolean r2 = r7.p()     // Catch:{ all -> 0x03c2 }
            if (r2 != 0) goto L_0x022b
            ahsu r2 = new ahsu     // Catch:{ all -> 0x03c2 }
            ajbg r10 = r6.h     // Catch:{ all -> 0x03c2 }
            java.util.Set r4 = r7.c()     // Catch:{ all -> 0x03c2 }
            java.util.Map r18 = r7.n()     // Catch:{ all -> 0x03c2 }
            boolean r9 = r7.h()     // Catch:{ all -> 0x03c2 }
            long r12 = r7.g()     // Catch:{ all -> 0x03c2 }
            ahuu r19 = r7.i()     // Catch:{ all -> 0x03c2 }
            long r20 = r7.e()     // Catch:{ all -> 0x03c2 }
            long r22 = r7.f()     // Catch:{ all -> 0x03c2 }
            boolean r24 = r7.k()     // Catch:{ all -> 0x03c2 }
            ahsr r15 = r6.d     // Catch:{ all -> 0x03c2 }
            boolean r25 = r7.l()     // Catch:{ all -> 0x03c2 }
            ajrh r14 = r6.e     // Catch:{ all -> 0x03c2 }
            int r11 = r7.s()     // Catch:{ all -> 0x03c2 }
            r16 = r15
            r15 = 4
            if (r11 != r15) goto L_0x01de
            r15 = 1
            goto L_0x01df
        L_0x01de:
            r15 = 0
        L_0x01df:
            int r28 = r7.r()     // Catch:{ all -> 0x03c2 }
            int r29 = r7.q()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x0203
            ahvk r30 = new ahvk     // Catch:{ all -> 0x03c2 }
            ahrx r11 = defpackage.ahrx.a((android.content.Context) r0, (defpackage.ajbg) r10, (defpackage.ajrh) r14)     // Catch:{ all -> 0x03c2 }
            r17 = 0
            r31 = 0
            r9 = r30
            r32 = r14
            r33 = r16
            r16 = r17
            r17 = r31
            r9.<init>(r10, r11, r12, r14, r15, r16, r17)     // Catch:{ all -> 0x03c2 }
            r13 = r30
            goto L_0x0208
        L_0x0203:
            r32 = r14
            r33 = r16
            r13 = 0
        L_0x0208:
            r9 = r2
            r10 = r0
            r11 = r4
            r12 = r18
            r14 = r19
            r15 = r8
            r16 = r27
            r17 = r20
            r19 = r22
            r21 = r24
            r22 = r33
            r23 = r25
            r24 = r3
            r25 = r32
            r27 = r28
            r28 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x03c2 }
            r6.b = r2     // Catch:{ all -> 0x03c2 }
            goto L_0x0335
        L_0x022b:
            ajbg r2 = r6.h     // Catch:{ all -> 0x03c2 }
            ajrh r4 = r6.e     // Catch:{ all -> 0x03c2 }
            ahrx r2 = defpackage.ahrx.a((android.content.Context) r0, (defpackage.ajbg) r2, (defpackage.ajrh) r4)     // Catch:{ all -> 0x03c2 }
            r6.g = r2     // Catch:{ all -> 0x03c2 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x03c2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x03c2 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x03c2 }
            int r4 = r4.length()     // Catch:{ all -> 0x03c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c2 }
            int r4 = r4 + 13
            r9.<init>(r4)     // Catch:{ all -> 0x03c2 }
            java.lang.String r4 = "RealCollector"
            r9.append(r4)     // Catch:{ all -> 0x03c2 }
            r9.append(r2)     // Catch:{ all -> 0x03c2 }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x03c2 }
            r6.f = r2     // Catch:{ all -> 0x03c2 }
            java.util.Set r2 = r7.c()     // Catch:{ all -> 0x03c2 }
            int r2 = r2.size()     // Catch:{ all -> 0x03c2 }
            r4 = 1
            if (r2 == r4) goto L_0x0266
            goto L_0x0272
        L_0x0266:
            java.util.Set r2 = r7.c()     // Catch:{ all -> 0x03c2 }
            ahup r4 = defpackage.ahup.ACCELEROMETER     // Catch:{ all -> 0x03c2 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x03c2 }
            if (r2 != 0) goto L_0x02bc
        L_0x0272:
            java.util.Set r2 = r7.c()     // Catch:{ all -> 0x03c2 }
            int r2 = r2.size()     // Catch:{ all -> 0x03c2 }
            r4 = 2
            if (r2 == r4) goto L_0x027e
            goto L_0x0297
        L_0x027e:
            java.util.Set r2 = r7.c()     // Catch:{ all -> 0x03c2 }
            ahup r4 = defpackage.ahup.ACCELEROMETER     // Catch:{ all -> 0x03c2 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x03c2 }
            if (r2 == 0) goto L_0x0297
            java.util.Set r2 = r7.c()     // Catch:{ all -> 0x03c2 }
            ahup r4 = defpackage.ahup.HEART_RATE     // Catch:{ all -> 0x03c2 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x03c2 }
            if (r2 == 0) goto L_0x0297
            goto L_0x02bc
        L_0x0297:
            java.util.Set r0 = r7.c()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03c2 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03c2 }
            int r2 = r2.length()     // Catch:{ all -> 0x03c2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c2 }
            int r2 = r2 + 58
            r3.<init>(r2)     // Catch:{ all -> 0x03c2 }
            java.lang.String r2 = "This type of sensor batching is not supported. Sensor Type"
            r3.append(r2)     // Catch:{ all -> 0x03c2 }
            r3.append(r0)     // Catch:{ all -> 0x03c2 }
            r3.toString()     // Catch:{ all -> 0x03c2 }
            r4 = 0
            goto L_0x03b6
        L_0x02bc:
            ahsu r2 = new ahsu     // Catch:{ all -> 0x03c2 }
            java.util.Set r11 = r7.c()     // Catch:{ all -> 0x03c2 }
            java.util.Map r12 = r7.n()     // Catch:{ all -> 0x03c2 }
            ahvk r13 = new ahvk     // Catch:{ all -> 0x03c2 }
            ajbg r4 = r6.h     // Catch:{ all -> 0x03c2 }
            ahrx r9 = r6.g     // Catch:{ all -> 0x03c2 }
            r19 = 60000(0xea60, double:2.9644E-319)
            ajrh r10 = r6.e     // Catch:{ all -> 0x03c2 }
            r22 = 0
            r24 = 1
            r16 = r13
            r17 = r4
            r18 = r9
            r21 = r10
            r23 = r26
            r16.<init>(r17, r18, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x03c2 }
            r14 = 0
            long r17 = r7.e()     // Catch:{ all -> 0x03c2 }
            long r19 = r7.f()     // Catch:{ all -> 0x03c2 }
            r21 = 0
            ahsr r4 = r6.d     // Catch:{ all -> 0x03c2 }
            boolean r23 = r7.l()     // Catch:{ all -> 0x03c2 }
            ajrh r15 = r6.e     // Catch:{ all -> 0x03c2 }
            int r28 = r7.r()     // Catch:{ all -> 0x03c2 }
            int r29 = r7.q()     // Catch:{ all -> 0x03c2 }
            r9 = r2
            r10 = r0
            r0 = r15
            r15 = r8
            r16 = r27
            r22 = r4
            r24 = r3
            r25 = r0
            r27 = r28
            r28 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x03c2 }
            r6.b = r2     // Catch:{ all -> 0x03c2 }
            java.util.Set r0 = r7.c()     // Catch:{ all -> 0x03c2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x031a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r2 == 0) goto L_0x0335
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x03c2 }
            ahup r2 = (defpackage.ahup) r2     // Catch:{ all -> 0x03c2 }
            ahrx r3 = r6.g     // Catch:{ all -> 0x03c2 }
            java.lang.String r4 = r6.f     // Catch:{ all -> 0x03c2 }
            int r8 = r7.a(r2)     // Catch:{ all -> 0x03c2 }
            r9 = 60000(0xea60, float:8.4078E-41)
            r3.a(r4, r2, r8, r9)     // Catch:{ all -> 0x03c2 }
            goto L_0x031a
        L_0x0335:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x03c2 }
            r2 = 0
            r0[r2] = r7     // Catch:{ all -> 0x03c2 }
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            java.util.List r0 = r0.a     // Catch:{ all -> 0x03c2 }
            int r0 = r0.size()     // Catch:{ all -> 0x03c2 }
            if (r0 <= 0) goto L_0x03b5
            boolean r0 = r7.h()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x035a
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            ahtv r2 = new ahtv     // Catch:{ all -> 0x03c2 }
            ahsr r3 = r6.d     // Catch:{ all -> 0x03c2 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x03c2 }
            r3 = 0
            r0.a(r2, r3)     // Catch:{ all -> 0x03c2 }
            r4 = 1
            goto L_0x03b6
        L_0x035a:
            ahuu r0 = r7.i()     // Catch:{ all -> 0x03c2 }
            r2 = 0
            if (r0 == 0) goto L_0x0392
            ahuu r0 = r7.i()     // Catch:{ all -> 0x03c2 }
            long r8 = r0.e     // Catch:{ all -> 0x03c2 }
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x037f
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            ahtb r2 = new ahtb     // Catch:{ all -> 0x03c2 }
            ahsr r3 = r6.d     // Catch:{ all -> 0x03c2 }
            ahuu r4 = r7.i()     // Catch:{ all -> 0x03c2 }
            r2.<init>(r0, r3, r4)     // Catch:{ all -> 0x03c2 }
            r3 = 0
            r0.a(r2, r3)     // Catch:{ all -> 0x03c2 }
            r4 = 1
            goto L_0x03b6
        L_0x037f:
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            ahuy r2 = new ahuy     // Catch:{ all -> 0x03c2 }
            ahsr r3 = r6.d     // Catch:{ all -> 0x03c2 }
            ahuu r4 = r7.i()     // Catch:{ all -> 0x03c2 }
            r2.<init>(r0, r3, r4)     // Catch:{ all -> 0x03c2 }
            r3 = 0
            r0.a(r2, r3)     // Catch:{ all -> 0x03c2 }
            r4 = 1
            goto L_0x03b6
        L_0x0392:
            long r8 = r7.g()     // Catch:{ all -> 0x03c2 }
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x03ad
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            ahvt r2 = new ahvt     // Catch:{ all -> 0x03c2 }
            ahsr r3 = r6.d     // Catch:{ all -> 0x03c2 }
            long r6 = r7.g()     // Catch:{ all -> 0x03c2 }
            r2.<init>(r0, r3, r6)     // Catch:{ all -> 0x03c2 }
            r3 = 0
            r0.a(r2, r3)     // Catch:{ all -> 0x03c2 }
            r4 = 1
            goto L_0x03b6
        L_0x03ad:
            ahsu r0 = r6.b     // Catch:{ all -> 0x03c2 }
            r2 = 0
            r0.a(r2)     // Catch:{ all -> 0x03c2 }
            r4 = 1
            goto L_0x03b6
        L_0x03b5:
            r4 = 0
        L_0x03b6:
            monitor-exit(r5)     // Catch:{ all -> 0x03c0 }
            if (r4 != 0) goto L_0x03be
            java.lang.String r0 = "RealCollector: Nothing to scan."
            goto L_0x03bf
        L_0x03bc:
            r0 = move-exception
            goto L_0x03cc
        L_0x03be:
            r0 = 0
        L_0x03bf:
            goto L_0x03dc
        L_0x03c0:
            r0 = move-exception
            goto L_0x03c4
        L_0x03c2:
            r0 = move-exception
            r4 = 0
        L_0x03c4:
            monitor-exit(r5)     // Catch:{ all -> 0x03c8 }
            throw r0     // Catch:{ IOException -> 0x03c6 }
        L_0x03c6:
            r0 = move-exception
            goto L_0x03cc
        L_0x03c8:
            r0 = move-exception
            goto L_0x03c4
        L_0x03ca:
            r0 = move-exception
            r4 = 0
        L_0x03cc:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x041f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x041f }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x041f }
            java.lang.String r0 = "Failed normalize configuration: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x041f }
        L_0x03dc:
            if (r4 != 0) goto L_0x03e7
            ahss r2 = r1.a     // Catch:{ all -> 0x041f }
            if (r2 == 0) goto L_0x03e7
            ahss r2 = r1.a     // Catch:{ all -> 0x041f }
            r2.a((java.lang.String) r0)     // Catch:{ all -> 0x041f }
        L_0x03e7:
            java.util.concurrent.CountDownLatch r0 = r1.p     // Catch:{ all -> 0x041f }
            r0.countDown()     // Catch:{ all -> 0x041f }
            if (r4 != 0) goto L_0x03ef
            goto L_0x03f2
        L_0x03ef:
            android.os.Looper.loop()     // Catch:{ all -> 0x041f }
        L_0x03f2:
            java.lang.String r0 = r34.getName()     // Catch:{ all -> 0x041f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x041f }
            java.lang.String r2 = " is quitting."
            r0.concat(r2)     // Catch:{ all -> 0x041f }
            ajbg r0 = r1.o
            ajbe r2 = defpackage.ajbe.COLLECTIONLIB_SIG_COLLECTOR
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L_0x0410
            ajbg r0 = r1.o
            ajbe r2 = defpackage.ajbe.COLLECTIONLIB_SIG_COLLECTOR
            r0.c(r2)
        L_0x0410:
            java.lang.Object r2 = r1.f
            monitor-enter(r2)
            r3 = 0
            r1.h = r3     // Catch:{ all -> 0x041c }
            r1.i = r3     // Catch:{ all -> 0x041c }
            r1.d = r3     // Catch:{ all -> 0x041c }
            monitor-exit(r2)     // Catch:{ all -> 0x041c }
            return
        L_0x041c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x041c }
            throw r0
        L_0x041f:
            r0 = move-exception
            ajbg r2 = r1.o
            ajbe r3 = defpackage.ajbe.COLLECTIONLIB_SIG_COLLECTOR
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L_0x0431
            ajbg r2 = r1.o
            ajbe r3 = defpackage.ajbe.COLLECTIONLIB_SIG_COLLECTOR
            r2.c(r3)
        L_0x0431:
            java.lang.Object r2 = r1.f
            monitor-enter(r2)
            r3 = 0
            r1.h = r3     // Catch:{ all -> 0x043d }
            r1.i = r3     // Catch:{ all -> 0x043d }
            r1.d = r3     // Catch:{ all -> 0x043d }
            monitor-exit(r2)     // Catch:{ all -> 0x043d }
            throw r0
        L_0x043d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x043d }
            goto L_0x0441
        L_0x0440:
            throw r0
        L_0x0441:
            goto L_0x0440
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvc.run():void");
    }
}
