package defpackage;

import java.util.Set;

/* renamed from: qwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qwa extends qxw {
    public final Set a = new ob();

    public qwa() {
        this.n = false;
    }

    private static final void b(qvz qvz) {
        if (qvz == null || qvz.a == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
    }

    /* renamed from: a */
    public final qwb b() {
        super.d();
        if (!this.a.isEmpty()) {
            c();
            return new qwb(this);
        }
        throw new IllegalArgumentException("Must provide at least one URI to observe.");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r4) {
        /*
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0013
            java.lang.Object r2 = r4.get(r1)
            qvz r2 = (defpackage.qvz) r2
            b(r2)
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0013:
            java.util.Set r0 = r3.a
            r0.addAll(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwa.a(java.util.Collection):void");
    }

    public final void a(qvz qvz) {
        b(qvz);
        this.a.add(qvz);
    }
}
