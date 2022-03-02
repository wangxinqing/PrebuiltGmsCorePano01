package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: alok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alok extends alop {
    public final Logger a = Logger.getLogger(alok.class.getName());
    public int b;
    private final alpl g;
    private final aloo h;
    private final alst i;
    private final PriorityQueue j = new PriorityQueue();
    private final Set k = Collections.newSetFromMap(new IdentityHashMap());
    private final alpi l;
    private boolean m;
    private long n;
    private alro o;
    private boolean p;
    private long q = Math.abs(new Random().nextLong());
    /* access modifiers changed from: private */
    public boolean r;
    private final Runnable s = new alof(this);

    public alok(alpl alpl, alov alov, aloo aloo, alst alst, alrt alrt) {
        super(alrt);
        this.g = alpl;
        this.h = aloo;
        this.i = alst;
        this.e = alrt.b;
        if (alov != null) {
            alov.a(alrn.class, new alog(this));
            alov.a(alou.class, new aloh(this));
        }
        this.l = new aloi(this, alov);
    }

    private final synchronized void a(int i2) {
        if (i2 != -1) {
            Logger logger = this.a;
            Level level = Level.INFO;
            int i3 = this.e;
            StringBuilder sb = new StringBuilder(69);
            sb.append("Requesting catchup from revision ");
            sb.append(i3);
            sb.append(" to revision ");
            sb.append(i2);
            sb.append(".");
            logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "requestCatchup", sb.toString());
        } else {
            Logger logger2 = this.a;
            Level level2 = Level.INFO;
            int i4 = this.e;
            StringBuilder sb2 = new StringBuilder(62);
            sb2.append("Requesting catchup from revision ");
            sb2.append(i4);
            sb2.append(" to head revision.");
            logger2.logp(level2, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "requestCatchup", sb2.toString());
        }
        this.r = true;
        this.g.a(this.e + 1, i2, new aloj(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r12.o = r5;
        r12.p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r12.j.add(r5);
        r4 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void h() {
        /*
            r12 = this;
            monitor-enter(r12)
            alro r0 = r12.o     // Catch:{ all -> 0x0087 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.String r3 = "change skipped"
            defpackage.alys.b(r0, r3)     // Catch:{ all -> 0x0087 }
            java.util.PriorityQueue r0 = r12.j     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0085
            int r0 = r12.e     // Catch:{ all -> 0x0087 }
            int r0 = r0 + r1
            r3 = -1
            r4 = -1
        L_0x001c:
            java.util.PriorityQueue r5 = r12.j     // Catch:{ all -> 0x0087 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r5 != 0) goto L_0x007c
            java.util.PriorityQueue r5 = r12.j     // Catch:{ all -> 0x0087 }
            java.lang.Object r5 = r5.remove()     // Catch:{ all -> 0x0087 }
            alro r5 = (defpackage.alro) r5     // Catch:{ all -> 0x0087 }
            java.util.Set r6 = r12.k     // Catch:{ all -> 0x0087 }
            boolean r6 = r6.remove(r5)     // Catch:{ all -> 0x0087 }
            int r7 = r5.c     // Catch:{ all -> 0x0087 }
            if (r7 != r0) goto L_0x0073
            boolean r4 = r12.a((defpackage.alro) r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x005f
            int r4 = r5.c     // Catch:{ all -> 0x0087 }
            int r8 = r12.e     // Catch:{ all -> 0x0087 }
            int r8 = r8 + r1
            if (r4 != r8) goto L_0x005f
            java.util.LinkedList r4 = r12.c     // Catch:{ all -> 0x0087 }
            java.lang.Object r4 = r4.peek()     // Catch:{ all -> 0x0087 }
            alrr r4 = (defpackage.alrr) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x005f
            java.lang.Long r8 = r5.f     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x005d
            long r8 = r8.longValue()     // Catch:{ all -> 0x0087 }
            long r10 = r4.a     // Catch:{ all -> 0x0087 }
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x005f
            r4 = 1
            goto L_0x0060
        L_0x005d:
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            boolean r8 = r12.a((defpackage.alro) r5)     // Catch:{ all -> 0x0087 }
            if (r8 != 0) goto L_0x0067
        L_0x0066:
            goto L_0x006d
        L_0x0067:
            if (r4 != 0) goto L_0x0066
            if (r6 != 0) goto L_0x0066
            r4 = r7
            goto L_0x001c
        L_0x006d:
            r12.o = r5     // Catch:{ all -> 0x0087 }
            r12.p = r4     // Catch:{ all -> 0x0087 }
            monitor-exit(r12)
            return
        L_0x0073:
            if (r7 <= r0) goto L_0x001c
            java.util.PriorityQueue r0 = r12.j     // Catch:{ all -> 0x0087 }
            r0.add(r5)     // Catch:{ all -> 0x0087 }
            int r4 = r7 + -1
        L_0x007c:
            boolean r0 = r12.r     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0085
            if (r4 == r3) goto L_0x0085
            r12.a((int) r4)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r12)
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r12)
            goto L_0x008b
        L_0x008a:
            throw r0
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alok.h():void");
    }

    private final boolean i() {
        return this.g != null && this.b == 0 && f();
    }

    public final synchronized alse b() {
        alss alss;
        if (c()) {
            boolean z = true;
            if (this.p) {
                this.c.pop();
                this.b = Math.max(this.b - 1, 0);
                this.e++;
                d();
                this.o = null;
                this.p = false;
                h();
                return alse.a;
            }
            alro alro = this.o;
            String str = alro.d;
            if (a(alro)) {
                alss = alss.c;
                Logger logger = this.a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(this.o);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94);
                sb.append("Received change from server for current session that has not beenapplied; treating as remote: ");
                sb.append(valueOf);
                logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "applyNextChange", sb.toString());
            } else {
                alss = str != null ? alss.a(str) : alss.c;
            }
            int i2 = this.o.e;
            if (i2 <= this.e) {
                z = false;
            }
            alys.b(z, "newAppliedRevision must be > appliedRevision");
            this.e = i2;
            alyo alyo = alyo.a;
            LinkedList linkedList = this.c;
            amiw amiw = this.o.a;
            alyj alyj = new alyj(linkedList);
            alyn alyn = new alyn(amiw);
            alyo.a((alyl) alyj, (alym) alyn);
            alse a2 = this.i.a(alyn.a, alss);
            this.o = null;
            this.p = false;
            h();
            return a2;
        }
        return alse.a;
    }

    public final synchronized boolean c() {
        return this.o != null;
    }

    public final synchronized void d() {
        if (!this.m && i()) {
            long currentTimeMillis = System.currentTimeMillis() - this.n;
            if (currentTimeMillis < 0) {
                this.a.logp(Level.WARNING, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "sendOrScheduleIfReady", "Detected system clock skew.");
                currentTimeMillis = 0;
            }
            long max = Math.max(0, 200 - currentTimeMillis);
            this.m = true;
            this.h.a(this.s, (int) max);
        }
    }

    public final synchronized void e() {
        long j2;
        this.m = false;
        if (i()) {
            this.n = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            if (!this.c.isEmpty()) {
                Logger logger = this.a;
                Level level = Level.INFO;
                int size = this.c.size();
                StringBuilder sb = new StringBuilder(52);
                sb.append("Sending ");
                sb.append(size);
                sb.append(" operation(s) to Realtime server.");
                logger.logp(level, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager", "send", sb.toString());
                j2 = ((alrr) this.c.get(0)).a;
                Iterator it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    alrr alrr = (alrr) it.next();
                    if (alrr.a != j2) {
                        break;
                    }
                    arrayList.add(alrr.b);
                }
            } else {
                j2 = this.q;
            }
            this.b = arrayList.size();
            alru alru = new alru(this.e, j2, arrayList);
            long j3 = this.q;
            if (j3 == j2) {
                this.q = j3 + 1;
            }
            this.g.a(alru, this.l);
        }
    }

    private final boolean a(alro alro) {
        return this.d.equals(alro.d);
    }

    public final synchronized alrr a(amiw amiw) {
        alrr alrr;
        alrr = new alrr(this.q, amiw, System.currentTimeMillis());
        this.c.add(alrr);
        d();
        return alrr;
    }

    public final void a() {
        a(-1);
    }

    public final void a(Collection collection, boolean z) {
        synchronized (this) {
            if (z) {
                this.k.addAll(collection);
            }
            this.j.addAll(collection);
            if (this.o == null) {
                h();
            }
        }
        this.f.a(this);
        d();
    }
}
