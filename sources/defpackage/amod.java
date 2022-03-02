package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: amod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amod {
    final /* synthetic */ amoe a;
    private final Queue b = new LinkedList();
    private final Queue c = new LinkedList();
    private amot d;

    public amod(amoe amoe) {
        this.a = amoe;
    }

    public final synchronized amoo a(amoj amoj) {
        amos amos;
        amos = new amos(amoj);
        this.b.add(amos);
        a();
        return amos.a;
    }

    public final void b() {
        amot amot = (amot) this.c.peek();
        if (amot != null && amot.a()) {
            amot.c();
        }
    }

    public final synchronized amoo a(byte[] bArr) {
        amor amor;
        amor = new amor(bArr);
        this.c.add(amor);
        a();
        return amor.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            amot r0 = r4.d     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0064
            java.util.Queue r0 = r4.b     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0066 }
            amot r0 = (defpackage.amot) r0     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x001e
            amoe r1 = r4.a     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.d     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001e
            java.util.Queue r0 = r4.c     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0066 }
            amot r0 = (defpackage.amot) r0     // Catch:{ all -> 0x0066 }
            goto L_0x0021
        L_0x001e:
            r4.b()     // Catch:{ all -> 0x0066 }
        L_0x0021:
            if (r0 == 0) goto L_0x0054
            boolean r1 = r0.b()     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x005e
            r4.d = r0     // Catch:{ all -> 0x0066 }
            amoe r1 = r4.a     // Catch:{ all -> 0x0066 }
            int r1 = r1.e     // Catch:{ all -> 0x0066 }
            amoj r0 = r0.a(r1)     // Catch:{ all -> 0x0066 }
            amoe r1 = r4.a     // Catch:{ all -> 0x0066 }
            amok r1 = r1.c     // Catch:{ all -> 0x0066 }
            int r1 = r1.a()     // Catch:{ all -> 0x0066 }
            if (r1 < 0) goto L_0x0056
            r2 = 7
            if (r1 > r2) goto L_0x0056
            byte[] r0 = r0.a     // Catch:{ all -> 0x0066 }
            r2 = 0
            byte r3 = r0[r2]     // Catch:{ all -> 0x0066 }
            int r1 = r1 << 4
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            byte r1 = (byte) r1     // Catch:{ all -> 0x0066 }
            r0[r2] = r1     // Catch:{ all -> 0x0066 }
            amoe r1 = r4.a     // Catch:{ all -> 0x0066 }
            amog r1 = r1.a     // Catch:{ all -> 0x0066 }
            r1.b(r0)     // Catch:{ all -> 0x0066 }
        L_0x0054:
            monitor-exit(r4)
            return
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "packet counter must be between 0 and 7"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r4)
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amod.a():void");
    }

    public final synchronized void a(amon amon) {
        amot amot = this.d;
        if (amot != null) {
            if (amot.b()) {
                amoo d2 = this.d.d();
                if (d2.b == null) {
                    d2.b = amon;
                    d2.a.countDown();
                    d2.a();
                    if (this.d == this.b.peek()) {
                        this.b.poll();
                    } else if (this.d == this.c.peek()) {
                        this.c.poll();
                    }
                } else {
                    throw new IllegalStateException("setResult() called twice");
                }
            }
            this.d = null;
            a();
        } else {
            throw new IllegalStateException("result received but no current write");
        }
    }
}
