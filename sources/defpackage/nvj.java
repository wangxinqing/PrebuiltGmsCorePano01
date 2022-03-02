package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: nvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvj implements nvl {
    private final nvk a;
    private final aucd b;

    public nvj(nqj nqj) {
        nqn nqn;
        int a2;
        int a3;
        nqo nqo = nqj.j;
        nqo = nqo == null ? nqo.c : nqo;
        if (nqo.a == 1) {
            nqn = (nqn) nqo.b;
        } else {
            nqn = nqn.f;
        }
        this.b = nqn.f.a((aucj) nqn);
        this.a = new nvk();
        nqn nqn2 = (nqn) this.b.b;
        int i = nqn2.d;
        nvk nvk = this.a;
        if (i >= nvk.g && i <= nvk.h && (a2 = nqm.a(nqn2.e)) != 0 && a2 != 1) {
            nqn nqn3 = (nqn) this.b.b;
            int i2 = nqn3.b;
            int a4 = nqm.a(nqn3.e);
            if (i2 < c(a4 == 0 ? 1 : a4)) {
                nqn nqn4 = (nqn) this.b.b;
                if (nqn4.c < this.a.f && ((a3 = nqm.a(nqn4.e)) == 0 || a3 != 2 || ((nqn) this.b.b).c == 0)) {
                    aucd aucd = this.b;
                    int b2 = b(((nqn) aucd.b).d);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nqn nqn5 = (nqn) aucd.b;
                    nqn5.a |= 4;
                    nqn5.d = b2;
                    return;
                }
            }
        }
        aucd aucd2 = this.b;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        nqn nqn6 = (nqn) aucd2.b;
        nqn6.a |= 1;
        nqn6.b = 0;
        aucd aucd3 = this.b;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        nqn nqn7 = (nqn) aucd3.b;
        nqn7.a |= 2;
        nqn7.c = 0;
        aucd aucd4 = this.b;
        int b3 = b(this.a.j);
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        nqn nqn8 = (nqn) aucd4.b;
        nqn8.a |= 4;
        nqn8.d = b3;
        aucd aucd5 = this.b;
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        nqn nqn9 = (nqn) aucd5.b;
        nqn9.e = 4;
        nqn9.a |= 8;
    }

    private final void a(String str) {
        nqn nqn = (nqn) this.b.b;
        int i = nqn.b;
        int i2 = nqn.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
        sb.append(str);
        sb.append(", good=");
        sb.append(i);
        sb.append(" bad=");
        sb.append(i2);
        sb.toString();
    }

    private final int b(int i) {
        nvk nvk = this.a;
        int a2 = aoog.a(i, nvk.g, nvk.h);
        nvk nvk2 = this.a;
        double d = (double) (a2 - nvk2.g);
        double d2 = (double) nvk2.i;
        Double.isNaN(d);
        Double.isNaN(d2);
        long round = Math.round(d / d2);
        nvk nvk3 = this.a;
        return nvk3.g + (((int) round) * nvk3.i);
    }

    private final int c(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return this.a.b;
        }
        if (i2 == 1) {
            return this.a.b;
        }
        if (i2 != 2) {
            return i2 != 3 ? this.a.a : this.a.d;
        }
        return this.a.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 == 5) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void d() {
        /*
            r10 = this;
            monitor-enter(r10)
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r0 = r0.e     // Catch:{ all -> 0x01f3 }
            int r0 = defpackage.nqm.a(r0)     // Catch:{ all -> 0x01f3 }
            r1 = 4
            r2 = 1
            r3 = 2
            r4 = 0
            if (r0 != 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            if (r0 != r3) goto L_0x0017
            goto L_0x002a
        L_0x0017:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r0 = r0.e     // Catch:{ all -> 0x01f3 }
            int r0 = defpackage.nqm.a(r0)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x0027
            goto L_0x009e
        L_0x0027:
            r5 = 5
            if (r0 != r5) goto L_0x009e
        L_0x002a:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r0 = r0.d     // Catch:{ all -> 0x01f3 }
            nvk r5 = r10.a     // Catch:{ all -> 0x01f3 }
            int r6 = r5.g     // Catch:{ all -> 0x01f3 }
            if (r0 <= r6) goto L_0x007d
            int r5 = r5.i     // Catch:{ all -> 0x01f3 }
            int[] r7 = new int[r3]     // Catch:{ all -> 0x01f3 }
            int r0 = r0 - r5
            r7[r4] = r0     // Catch:{ all -> 0x01f3 }
            r7[r2] = r6     // Catch:{ all -> 0x01f3 }
            int r0 = defpackage.aoog.a((int[]) r7)     // Catch:{ all -> 0x01f3 }
            aucd r5 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r6 = r5.c     // Catch:{ all -> 0x01f3 }
            if (r6 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            r5.c()     // Catch:{ all -> 0x01f3 }
            r5.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x0051:
            aucj r5 = r5.b     // Catch:{ all -> 0x01f3 }
            nqn r5 = (defpackage.nqn) r5     // Catch:{ all -> 0x01f3 }
            nqn r6 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            int r6 = r5.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | r6
            r5.a = r1     // Catch:{ all -> 0x01f3 }
            r5.d = r0     // Catch:{ all -> 0x01f3 }
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r0 = r0.d     // Catch:{ all -> 0x01f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5 = 50
            r1.<init>(r5)     // Catch:{ all -> 0x01f3 }
            java.lang.String r5 = "Lowering heartbeat interval 1 notch to "
            r1.append(r5)     // Catch:{ all -> 0x01f3 }
            r1.append(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f3 }
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            goto L_0x0082
        L_0x007d:
            java.lang.String r0 = "Resetting heartbeat counters (at min)"
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
        L_0x0082:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r1 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x008e:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            nqn r1 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            r0.e = r3     // Catch:{ all -> 0x01f3 }
            int r1 = r0.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | 8
            r0.a = r1     // Catch:{ all -> 0x01f3 }
            goto L_0x01da
        L_0x009e:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r5 = r0.c     // Catch:{ all -> 0x01f3 }
            nvk r6 = r10.a     // Catch:{ all -> 0x01f3 }
            int r5 = r5 + r2
            int r7 = r6.f     // Catch:{ all -> 0x01f3 }
            if (r5 >= r7) goto L_0x016b
            int r0 = r0.d     // Catch:{ all -> 0x01f3 }
            int r5 = r6.g     // Catch:{ all -> 0x01f3 }
            if (r0 <= r5) goto L_0x012c
            double r5 = r6.e     // Catch:{ all -> 0x01f3 }
            double r7 = (double) r0
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r5
            int r0 = (int) r7
            int r0 = r10.b(r0)     // Catch:{ all -> 0x01f3 }
            aucd r7 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r7 = r7.b     // Catch:{ all -> 0x01f3 }
            nqn r7 = (defpackage.nqn) r7     // Catch:{ all -> 0x01f3 }
            int r7 = r7.d     // Catch:{ all -> 0x01f3 }
            if (r0 < r7) goto L_0x00cf
            nvk r7 = r10.a     // Catch:{ all -> 0x01f3 }
            int r7 = r7.i     // Catch:{ all -> 0x01f3 }
            int r0 = r0 - r7
        L_0x00cf:
            int[] r7 = new int[r3]     // Catch:{ all -> 0x01f3 }
            r7[r4] = r0     // Catch:{ all -> 0x01f3 }
            nvk r0 = r10.a     // Catch:{ all -> 0x01f3 }
            int r0 = r0.g     // Catch:{ all -> 0x01f3 }
            r7[r2] = r0     // Catch:{ all -> 0x01f3 }
            int r0 = defpackage.aoog.a((int[]) r7)     // Catch:{ all -> 0x01f3 }
            aucd r7 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r8 = r7.b     // Catch:{ all -> 0x01f3 }
            nqn r8 = (defpackage.nqn) r8     // Catch:{ all -> 0x01f3 }
            int r8 = r8.d     // Catch:{ all -> 0x01f3 }
            boolean r9 = r7.c     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            r7.c()     // Catch:{ all -> 0x01f3 }
            r7.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x00f0:
            aucj r7 = r7.b     // Catch:{ all -> 0x01f3 }
            nqn r7 = (defpackage.nqn) r7     // Catch:{ all -> 0x01f3 }
            nqn r9 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            int r9 = r7.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | r9
            r7.a = r1     // Catch:{ all -> 0x01f3 }
            r7.d = r0     // Catch:{ all -> 0x01f3 }
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r0 = r0.d     // Catch:{ all -> 0x01f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r7 = 96
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            java.lang.String r7 = "Lowering heartbeat interval from "
            r1.append(r7)     // Catch:{ all -> 0x01f3 }
            r1.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r7 = " to "
            r1.append(r7)     // Catch:{ all -> 0x01f3 }
            r1.append(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = " using ratio "
            r1.append(r0)     // Catch:{ all -> 0x01f3 }
            r1.append(r5)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f3 }
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            goto L_0x0131
        L_0x012c:
            java.lang.String r0 = "Resetting heartbeat counters (at min)"
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
        L_0x0131:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            aucj r1 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r1 = (defpackage.nqn) r1     // Catch:{ all -> 0x01f3 }
            int r1 = r1.c     // Catch:{ all -> 0x01f3 }
            int r1 = r1 + r2
            boolean r5 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r5 != 0) goto L_0x013f
            goto L_0x0144
        L_0x013f:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x0144:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            nqn r5 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            int r5 = r0.a     // Catch:{ all -> 0x01f3 }
            r3 = r3 | r5
            r0.a = r3     // Catch:{ all -> 0x01f3 }
            r0.c = r1     // Catch:{ all -> 0x01f3 }
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r1 != 0) goto L_0x0158
            goto L_0x015d
        L_0x0158:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x015d:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            r1 = 3
            r0.e = r1     // Catch:{ all -> 0x01f3 }
            int r1 = r0.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | 8
            r0.a = r1     // Catch:{ all -> 0x01f3 }
            goto L_0x01da
        L_0x016b:
            int r0 = r0.d     // Catch:{ all -> 0x01f3 }
            int r5 = r6.g     // Catch:{ all -> 0x01f3 }
            if (r0 <= r5) goto L_0x01a4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r6 = 51
            r5.<init>(r6)     // Catch:{ all -> 0x01f3 }
            java.lang.String r6 = "Dropping heartbeat interval to min from "
            r5.append(r6)     // Catch:{ all -> 0x01f3 }
            r5.append(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x01f3 }
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            nvk r5 = r10.a     // Catch:{ all -> 0x01f3 }
            int r5 = r5.g     // Catch:{ all -> 0x01f3 }
            boolean r6 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r6 == 0) goto L_0x0196
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x0196:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            nqn r6 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            int r6 = r0.a     // Catch:{ all -> 0x01f3 }
            r6 = r6 | r1
            r0.a = r6     // Catch:{ all -> 0x01f3 }
            r0.d = r5     // Catch:{ all -> 0x01f3 }
            goto L_0x01a9
        L_0x01a4:
            java.lang.String r0 = "Resetting heartbeat counters (at min)"
            r10.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
        L_0x01a9:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r5 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r5 != 0) goto L_0x01b0
            goto L_0x01b5
        L_0x01b0:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x01b5:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            nqn r5 = defpackage.nqn.f     // Catch:{ all -> 0x01f3 }
            int r5 = r0.a     // Catch:{ all -> 0x01f3 }
            r3 = r3 | r5
            r0.a = r3     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r3 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r3 != 0) goto L_0x01c9
            goto L_0x01ce
        L_0x01c9:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x01ce:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            r0.e = r1     // Catch:{ all -> 0x01f3 }
            int r1 = r0.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | 8
            r0.a = r1     // Catch:{ all -> 0x01f3 }
        L_0x01da:
            aucd r0 = r10.b     // Catch:{ all -> 0x01f3 }
            boolean r1 = r0.c     // Catch:{ all -> 0x01f3 }
            if (r1 != 0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            r0.c()     // Catch:{ all -> 0x01f3 }
            r0.c = r4     // Catch:{ all -> 0x01f3 }
        L_0x01e6:
            aucj r0 = r0.b     // Catch:{ all -> 0x01f3 }
            nqn r0 = (defpackage.nqn) r0     // Catch:{ all -> 0x01f3 }
            int r1 = r0.a     // Catch:{ all -> 0x01f3 }
            r1 = r1 | r2
            r0.a = r1     // Catch:{ all -> 0x01f3 }
            r0.b = r4     // Catch:{ all -> 0x01f3 }
            monitor-exit(r10)
            return
        L_0x01f3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvj.d():void");
    }

    public final String toString() {
        nvk nvk = this.a;
        int i = nvk.b;
        int i2 = nvk.c;
        int i3 = nvk.d;
        int i4 = nvk.f;
        double d = nvk.e;
        int i5 = nvk.g;
        int i6 = nvk.h;
        int i7 = nvk.i;
        int i8 = nvk.j;
        nqn nqn = (nqn) this.b.b;
        int i9 = nqn.b;
        int i10 = nqn.c;
        int i11 = nqn.d;
        int a2 = nqm.a(nqn.e);
        if (a2 == 0) {
            a2 = 1;
        }
        String valueOf = String.valueOf(Integer.toString(a2 - 1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 424);
        sb.append("FastSlowHeartbeatAlgorithm{fast_upward_trigger: ");
        sb.append(i);
        sb.append(", slow_upward_trigger: ");
        sb.append(i2);
        sb.append(", after_ratio_drop_upward_trigger: ");
        sb.append(i3);
        sb.append(", fall_fast_trigger: ");
        sb.append(i4);
        sb.append(", drop_ratio: ");
        sb.append(d);
        sb.append(", interval_range: [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("], interval_step: ");
        sb.append(i7);
        sb.append(", initial_interval: ");
        sb.append(i8);
        sb.append(", good_heartbeat_count: ");
        sb.append(i9);
        sb.append(", bad_heartbeat_count: ");
        sb.append(i10);
        sb.append(", heartbeat_interval: ");
        sb.append(i11);
        sb.append(", phase: ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    private final synchronized void c() {
        aucd aucd = this.b;
        int i = ((nqn) aucd.b).b + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        nqn nqn = (nqn) aucd.b;
        nqn nqn2 = nqn.f;
        nqn.a |= 1;
        nqn.b = i;
        int a2 = nqm.a(((nqn) this.b.b).e);
        if (a2 == 0) {
            a2 = 1;
        }
        int c = c(a2);
        nqn nqn3 = (nqn) this.b.b;
        if (nqn3.b >= c) {
            int i2 = nqn3.d;
            nvk nvk = this.a;
            int i3 = nvk.h;
            if (i2 < i3) {
                int[] iArr = {i2 + nvk.i, i3};
                amrl.a(true);
                int i4 = iArr[0];
                for (char c2 = 1; c2 < 2; c2 = 2) {
                    int i5 = iArr[1];
                    if (i5 < i4) {
                        i4 = i5;
                    }
                }
                aucd aucd2 = this.b;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                nqn nqn4 = (nqn) aucd2.b;
                nqn4.a |= 4;
                nqn4.d = i4;
                int i6 = ((nqn) this.b.b).d;
                StringBuilder sb = new StringBuilder(41);
                sb.append("Raising heartbeat interval to ");
                sb.append(i6);
                a(sb.toString());
            } else {
                a("Resetting heartbeat counters (at max)");
            }
            aucd aucd3 = this.b;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            nqn nqn5 = (nqn) aucd3.b;
            nqn5.a |= 1;
            nqn5.b = 0;
            aucd aucd4 = this.b;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            nqn nqn6 = (nqn) aucd4.b;
            nqn6.a |= 2;
            nqn6.c = 0;
            aucd aucd5 = this.b;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            nqn nqn7 = (nqn) aucd5.b;
            nqn7.e = 1;
            nqn7.a |= 8;
        }
    }

    public final nqj b() {
        aucd o = nqo.c.o();
        aucd aucd = this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nqo nqo = (nqo) o.b;
        nqn nqn = (nqn) aucd.i();
        nqn.getClass();
        nqo.b = nqn;
        nqo.a = 1;
        nqo nqo2 = (nqo) o.i();
        aucd o2 = nqj.k.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nqj nqj = (nqj) o2.b;
        nqo2.getClass();
        nqj.j = nqo2;
        nqj.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return (nqj) o2.i();
    }

    public final int a() {
        return ((nqn) this.b.b).d;
    }

    public final void a(int i) {
        if (i != 1) {
            d();
        } else {
            c();
        }
    }
}
