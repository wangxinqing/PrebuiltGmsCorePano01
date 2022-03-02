package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baee extends azxl {
    static final long a = TimeUnit.SECONDS.toNanos(1);
    private static final Logger j = Logger.getLogger(baee.class.getName());
    public final baaj b;
    public final Executor c;
    public final bads d;
    public final azyd e;
    public baef f;
    public volatile boolean g;
    public azyi h = azyi.b;
    public azxy i = azxy.a;
    private final boolean k;
    private final azxh l;
    private boolean m;
    private boolean n;
    private baed o;
    private final ScheduledExecutorService p;
    private volatile ScheduledFuture q;
    private volatile ScheduledFuture r;
    private boolean s;
    private final baiq t;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public baee(baaj baaj, Executor executor, azxh azxh, baiq baiq, ScheduledExecutorService scheduledExecutorService, bads bads) {
        Executor executor2;
        boolean z = false;
        this.s = false;
        this.b = baaj;
        System.identityHashCode(this);
        if (executor != aoqm.a) {
            executor2 = new balc(executor);
        } else {
            executor2 = new baky();
        }
        this.c = executor2;
        this.d = bads;
        this.e = azyd.a();
        this.k = (baaj.a == baai.UNARY || baaj.a == baai.SERVER_STREAMING) ? true : z;
        this.l = azxh;
        this.t = baiq;
        this.p = scheduledExecutorService;
        int i2 = bapg.a;
    }

    private final void a(azxk azxk, babj babj) {
        this.c.execute(new badv(this, azxk, babj));
    }

    private final void b(Object obj) {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Not started");
        amrl.b(!this.m, (Object) "call was cancelled");
        amrl.b(!this.n, (Object) "call was half-closed");
        try {
            baef baef = this.f;
            if (!(baef instanceof bakw)) {
                baef.a(this.b.d.a(obj));
                if (!this.k) {
                    this.f.g();
                    return;
                }
                return;
            }
            bakv bakv = ((bakw) baef).a;
            throw null;
        } catch (RuntimeException e2) {
            this.f.b(babj.c.b((Throwable) e2).a("Failed to stream message"));
        } catch (Error e3) {
            this.f.b(babj.c.a("Client sendMessage() failed with Error"));
            throw e3;
        }
    }

    public final azyf c() {
        azyf azyf = this.l.b;
        if (azyf != null) {
            return azyf;
        }
        return null;
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("method", (Object) this.b);
        return a2.toString();
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture scheduledFuture2 = this.q;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
    }

    public final void a(int i2) {
        boolean z;
        int i3 = bapg.a;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Not started");
        amrl.a(true, (Object) "Number requested must be non-negative");
        this.f.c(i2);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0180 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0190 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019b A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019c A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0201 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.azxk r11, defpackage.baaf r12) {
        /*
            r10 = this;
            int r0 = defpackage.bapg.a
            baef r0 = r10.f     // Catch:{ all -> 0x020c }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            java.lang.String r3 = "Already started"
            defpackage.amrl.b((boolean) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x020c }
            boolean r0 = r10.m     // Catch:{ all -> 0x020c }
            r0 = r0 ^ r2
            java.lang.String r3 = "call was cancelled"
            defpackage.amrl.b((boolean) r0, (java.lang.Object) r3)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "observer"
            defpackage.amrl.a((java.lang.Object) r11, (java.lang.Object) r0)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "headers"
            defpackage.amrl.a((java.lang.Object) r12, (java.lang.Object) r0)     // Catch:{ all -> 0x020c }
            azxh r0 = r10.l     // Catch:{ all -> 0x020c }
            java.lang.String r0 = r0.e     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x004d
            azxy r3 = r10.i     // Catch:{ all -> 0x020c }
            java.util.concurrent.ConcurrentMap r3 = r3.b     // Catch:{ all -> 0x020c }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x020c }
            azxx r3 = (defpackage.azxx) r3     // Catch:{ all -> 0x020c }
            if (r3 != 0) goto L_0x004c
            bajy r12 = defpackage.bajy.a     // Catch:{ all -> 0x020c }
            r10.f = r12     // Catch:{ all -> 0x020c }
            babj r12 = defpackage.babj.n     // Catch:{ all -> 0x020c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x020c }
            r2[r1] = r0     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "Unable to find compressor by name %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x020c }
            babj r12 = r12.a((java.lang.String) r0)     // Catch:{ all -> 0x020c }
            r10.a((defpackage.azxk) r11, (defpackage.babj) r12)     // Catch:{ all -> 0x020c }
            return
        L_0x004c:
            goto L_0x004f
        L_0x004d:
            azxw r3 = defpackage.azxv.a     // Catch:{ all -> 0x020c }
        L_0x004f:
            azyi r0 = r10.h     // Catch:{ all -> 0x020c }
            baab r4 = defpackage.bagt.b     // Catch:{ all -> 0x020c }
            r12.c((defpackage.baab) r4)     // Catch:{ all -> 0x020c }
            azxw r4 = defpackage.azxv.a     // Catch:{ all -> 0x020c }
            if (r3 != r4) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            baab r4 = defpackage.bagt.b     // Catch:{ all -> 0x020c }
            java.lang.String r5 = r3.a()     // Catch:{ all -> 0x020c }
            r12.a((defpackage.baab) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x020c }
        L_0x0064:
            baab r4 = defpackage.bagt.c     // Catch:{ all -> 0x020c }
            r12.c((defpackage.baab) r4)     // Catch:{ all -> 0x020c }
            byte[] r0 = r0.d     // Catch:{ all -> 0x020c }
            int r4 = r0.length     // Catch:{ all -> 0x020c }
            if (r4 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            baab r4 = defpackage.bagt.c     // Catch:{ all -> 0x020c }
            r12.a((defpackage.baab) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x020c }
        L_0x0074:
            baab r0 = defpackage.bagt.d     // Catch:{ all -> 0x020c }
            r12.c((defpackage.baab) r0)     // Catch:{ all -> 0x020c }
            baab r0 = defpackage.bagt.e     // Catch:{ all -> 0x020c }
            r12.c((defpackage.baab) r0)     // Catch:{ all -> 0x020c }
            azyf r0 = r10.c()     // Catch:{ all -> 0x020c }
            r4 = 0
            if (r0 != 0) goto L_0x0086
            goto L_0x00ba
        L_0x0086:
            boolean r5 = r0.a()     // Catch:{ all -> 0x020c }
            if (r5 == 0) goto L_0x00ba
            bage r12 = new bage     // Catch:{ all -> 0x020c }
            babj r1 = defpackage.babj.f     // Catch:{ all -> 0x020c }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x020c }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x020c }
            int r5 = r5.length()     // Catch:{ all -> 0x020c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x020c }
            int r5 = r5 + 44
            r6.<init>(r5)     // Catch:{ all -> 0x020c }
            java.lang.String r5 = "ClientCall started after deadline exceeded: "
            r6.append(r5)     // Catch:{ all -> 0x020c }
            r6.append(r2)     // Catch:{ all -> 0x020c }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x020c }
            babj r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x020c }
            r12.<init>(r1)     // Catch:{ all -> 0x020c }
            r10.f = r12     // Catch:{ all -> 0x020c }
            goto L_0x017a
        L_0x00ba:
            azxh r5 = r10.l     // Catch:{ all -> 0x020c }
            azyf r5 = r5.b     // Catch:{ all -> 0x020c }
            java.util.logging.Logger r6 = j     // Catch:{ all -> 0x020c }
            java.util.logging.Level r7 = java.util.logging.Level.FINE     // Catch:{ all -> 0x020c }
            boolean r6 = r6.isLoggable(r7)     // Catch:{ all -> 0x020c }
            if (r6 != 0) goto L_0x00c9
            goto L_0x011e
        L_0x00c9:
            if (r0 == 0) goto L_0x011e
            boolean r6 = r0.equals(r4)     // Catch:{ all -> 0x020c }
            if (r6 == 0) goto L_0x011e
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x020c }
            long r8 = r0.a((java.util.concurrent.TimeUnit) r8)     // Catch:{ all -> 0x020c }
            long r6 = java.lang.Math.max(r6, r8)     // Catch:{ all -> 0x020c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x020c }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x020c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x020c }
            r9[r1] = r6     // Catch:{ all -> 0x020c }
            java.lang.String r6 = "Call timeout set to '%d' ns, due to context deadline."
            java.lang.String r6 = java.lang.String.format(r6, r9)     // Catch:{ all -> 0x020c }
            r8.<init>(r6)     // Catch:{ all -> 0x020c }
            if (r5 == 0) goto L_0x010a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x020c }
            long r5 = r5.a((java.util.concurrent.TimeUnit) r6)     // Catch:{ all -> 0x020c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x020c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x020c }
            r2[r1] = r5     // Catch:{ all -> 0x020c }
            java.lang.String r1 = " Explicit call timeout was '%d' ns."
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x020c }
            r8.append(r1)     // Catch:{ all -> 0x020c }
            goto L_0x010f
        L_0x010a:
            java.lang.String r1 = " Explicit call timeout was not set."
            r8.append(r1)     // Catch:{ all -> 0x020c }
        L_0x010f:
            java.util.logging.Logger r1 = j     // Catch:{ all -> 0x020c }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x020c }
            java.lang.String r5 = "io.grpc.internal.ClientCallImpl"
            java.lang.String r6 = "logIfContextNarrowedTimeout"
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x020c }
            r1.logp(r2, r5, r6, r7)     // Catch:{ all -> 0x020c }
        L_0x011e:
            baiq r1 = r10.t     // Catch:{ all -> 0x020c }
            bakh r2 = new bakh     // Catch:{ all -> 0x020c }
            baaj r5 = r10.b     // Catch:{ all -> 0x020c }
            azxh r6 = r10.l     // Catch:{ all -> 0x020c }
            r2.<init>(r5, r12, r6)     // Catch:{ all -> 0x020c }
            baji r5 = r1.a     // Catch:{ all -> 0x020c }
            azzm r5 = r5.s     // Catch:{ all -> 0x020c }
            baji r6 = r1.a     // Catch:{ all -> 0x020c }
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.y     // Catch:{ all -> 0x020c }
            boolean r6 = r6.get()     // Catch:{ all -> 0x020c }
            if (r6 == 0) goto L_0x013c
            baji r1 = r1.a     // Catch:{ all -> 0x020c }
            bafa r1 = r1.w     // Catch:{ all -> 0x020c }
            goto L_0x0165
        L_0x013c:
            if (r5 == 0) goto L_0x0155
            azzh r5 = r5.a()     // Catch:{ all -> 0x020c }
            azxh r2 = r2.a     // Catch:{ all -> 0x020c }
            boolean r2 = r2.a()     // Catch:{ all -> 0x020c }
            baei r2 = defpackage.bagt.a((defpackage.azzh) r5, (boolean) r2)     // Catch:{ all -> 0x020c }
            if (r2 != 0) goto L_0x0153
            baji r1 = r1.a     // Catch:{ all -> 0x020c }
            bafa r1 = r1.w     // Catch:{ all -> 0x020c }
            goto L_0x0165
        L_0x0153:
            r1 = r2
            goto L_0x0165
        L_0x0155:
            baji r2 = r1.a     // Catch:{ all -> 0x020c }
            babq r2 = r2.l     // Catch:{ all -> 0x020c }
            baip r5 = new baip     // Catch:{ all -> 0x020c }
            r5.<init>(r1)     // Catch:{ all -> 0x020c }
            r2.execute(r5)     // Catch:{ all -> 0x020c }
            baji r1 = r1.a     // Catch:{ all -> 0x020c }
            bafa r1 = r1.w     // Catch:{ all -> 0x020c }
        L_0x0165:
            azyd r2 = r10.e     // Catch:{ all -> 0x020c }
            azyd r2 = r2.b()     // Catch:{ all -> 0x020c }
            baaj r5 = r10.b     // Catch:{ all -> 0x0205 }
            azxh r6 = r10.l     // Catch:{ all -> 0x0205 }
            baef r12 = r1.a(r5, r12, r6)     // Catch:{ all -> 0x0205 }
            r10.f = r12     // Catch:{ all -> 0x0205 }
            azyd r12 = r10.e     // Catch:{ all -> 0x020c }
            r12.a(r2)     // Catch:{ all -> 0x020c }
        L_0x017a:
            azxh r12 = r10.l     // Catch:{ all -> 0x020c }
            java.lang.Integer r12 = r12.h     // Catch:{ all -> 0x020c }
            if (r12 != 0) goto L_0x0181
            goto L_0x018a
        L_0x0181:
            baef r1 = r10.f     // Catch:{ all -> 0x020c }
            int r12 = r12.intValue()     // Catch:{ all -> 0x020c }
            r1.b((int) r12)     // Catch:{ all -> 0x020c }
        L_0x018a:
            azxh r12 = r10.l     // Catch:{ all -> 0x020c }
            java.lang.Integer r12 = r12.i     // Catch:{ all -> 0x020c }
            if (r12 == 0) goto L_0x0199
            baef r1 = r10.f     // Catch:{ all -> 0x020c }
            int r12 = r12.intValue()     // Catch:{ all -> 0x020c }
            r1.a((int) r12)     // Catch:{ all -> 0x020c }
        L_0x0199:
            if (r0 != 0) goto L_0x019c
            goto L_0x01a1
        L_0x019c:
            baef r12 = r10.f     // Catch:{ all -> 0x020c }
            r12.a((defpackage.azyf) r0)     // Catch:{ all -> 0x020c }
        L_0x01a1:
            baef r12 = r10.f     // Catch:{ all -> 0x020c }
            r12.a((defpackage.azxx) r3)     // Catch:{ all -> 0x020c }
            baef r12 = r10.f     // Catch:{ all -> 0x020c }
            azyi r1 = r10.h     // Catch:{ all -> 0x020c }
            r12.a((defpackage.azyi) r1)     // Catch:{ all -> 0x020c }
            bads r12 = r10.d     // Catch:{ all -> 0x020c }
            r12.a()     // Catch:{ all -> 0x020c }
            baed r12 = new baed     // Catch:{ all -> 0x020c }
            r12.<init>(r10, r11)     // Catch:{ all -> 0x020c }
            r10.o = r12     // Catch:{ all -> 0x020c }
            baef r12 = r10.f     // Catch:{ all -> 0x020c }
            baec r1 = new baec     // Catch:{ all -> 0x020c }
            r1.<init>(r10, r11)     // Catch:{ all -> 0x020c }
            r12.a((defpackage.baeh) r1)     // Catch:{ all -> 0x020c }
            baed r12 = r10.o     // Catch:{ all -> 0x020c }
            aoqm r1 = defpackage.aoqm.a     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "cancellationListener"
            defpackage.azyd.a(r12, r2)     // Catch:{ all -> 0x020c }
            java.lang.String r12 = "executor"
            defpackage.azyd.a(r1, r12)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01fd
            boolean r12 = r0.equals(r4)     // Catch:{ all -> 0x020c }
            if (r12 != 0) goto L_0x01fd
            java.util.concurrent.ScheduledExecutorService r12 = r10.p     // Catch:{ all -> 0x020c }
            if (r12 == 0) goto L_0x01fd
            baef r12 = r10.f     // Catch:{ all -> 0x020c }
            boolean r12 = r12 instanceof defpackage.bage     // Catch:{ all -> 0x020c }
            if (r12 != 0) goto L_0x01fd
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x020c }
            long r0 = r0.a((java.util.concurrent.TimeUnit) r12)     // Catch:{ all -> 0x020c }
            java.util.concurrent.ScheduledExecutorService r12 = r10.p     // Catch:{ all -> 0x020c }
            baid r2 = new baid     // Catch:{ all -> 0x020c }
            badw r3 = new badw     // Catch:{ all -> 0x020c }
            r3.<init>(r10, r0, r11)     // Catch:{ all -> 0x020c }
            r2.<init>(r3)     // Catch:{ all -> 0x020c }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x020c }
            java.util.concurrent.ScheduledFuture r11 = r12.schedule(r2, r0, r11)     // Catch:{ all -> 0x020c }
            r10.q = r11     // Catch:{ all -> 0x020c }
        L_0x01fd:
            boolean r11 = r10.g     // Catch:{ all -> 0x020c }
            if (r11 == 0) goto L_0x0204
            r10.a()     // Catch:{ all -> 0x020c }
        L_0x0204:
            return
        L_0x0205:
            r11 = move-exception
            azyd r12 = r10.e     // Catch:{ all -> 0x020c }
            r12.a(r2)     // Catch:{ all -> 0x020c }
            throw r11     // Catch:{ all -> 0x020c }
        L_0x020c:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baee.a(azxk, baaf):void");
    }

    public final void b() {
        boolean z;
        int i2 = bapg.a;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Not started");
        amrl.b(!this.m, (Object) "call was cancelled");
        amrl.b(!this.n, (Object) "call already half-closed");
        this.n = true;
        this.f.f();
    }

    public final void a(azxk azxk, babj babj, baaf baaf) {
        if (!this.s) {
            this.s = true;
            azxk.a(babj, baaf);
        }
    }

    public final void a(babj babj, azxk azxk) {
        if (this.r == null) {
            this.r = this.p.schedule(new baid(new badx(this, babj)), a, TimeUnit.NANOSECONDS);
            a(azxk, babj);
        }
    }

    public final void a(Object obj) {
        int i2 = bapg.a;
        b(obj);
    }

    public final void a(String str, Throwable th) {
        babj babj;
        int i2 = bapg.a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            j.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.m) {
            this.m = true;
            try {
                if (this.f != null) {
                    babj babj2 = babj.c;
                    if (str == null) {
                        babj = babj2.a("Call cancelled without message");
                    } else {
                        babj = babj2.a(str);
                    }
                    if (th != null) {
                        babj = babj.b(th);
                    }
                    this.f.b(babj);
                }
            } finally {
                a();
            }
        }
    }
}
