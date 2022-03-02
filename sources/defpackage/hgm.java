package defpackage;

/* renamed from: hgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hgm {
    private final boolean a;
    final bpw d;
    final bpw e;

    public hgm(hfk hfk, boolean z) {
        this.d = blj.a(bpw.a(hfk.e, blj.b));
        this.e = blj.a(bpw.a(hfk.d, blj.b));
        boolean z2 = false;
        if (z && awxs.a.a().q()) {
            z2 = true;
        }
        this.a = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r2 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.bob r12, java.util.List r13, java.util.Set r14) {
        /*
            int r0 = r13.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x0042
            java.lang.Object r3 = r13.get(r2)
            hfp r3 = (defpackage.hfp) r3
            bmr r4 = defpackage.hgi.a((defpackage.hfp) r3)
            aucx r3 = r3.c
            int r5 = r3.size()
            r6 = 0
        L_0x0019:
            int r7 = r2 + 1
            if (r6 >= r5) goto L_0x0040
            java.lang.Object r7 = r3.get(r6)
            boc r7 = (defpackage.boc) r7
            java.lang.String r8 = r12.b
            java.lang.String r9 = r7.b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x003d
            long r8 = r12.c
            long r10 = r7.c
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            boolean r7 = r14.contains(r4)
            if (r7 != 0) goto L_0x003d
            return r1
        L_0x003d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0040:
            r2 = r7
            goto L_0x0006
        L_0x0042:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgm.a(bob, java.util.List, java.util.Set):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract boolean a(bob bob, hfg hfg);

    /* access modifiers changed from: package-private */
    public final boolean a(hgc hgc, boolean z) {
        if (!this.d.contains(hgc.a)) {
            return !z || !this.a;
        }
        return false;
    }
}
