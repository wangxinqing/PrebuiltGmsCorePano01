package defpackage;

import android.content.Context;
import android.util.LruCache;

/* renamed from: tyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyy extends LruCache {
    private final jiq a;

    public tyy(Context context) {
        super((int) aymt.t());
        this.a = (jiq) thl.a(context, jiq.class);
    }

    public final void a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        txm txm = (txm) get(valueOf);
        if (txm == null || txl.a(i2, txm.a) || a(txm)) {
            put(valueOf, new txm(i2, this.a.a()));
        }
    }

    public final void b(int i) {
        txm txm = (txm) remove(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = r10.a - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10) {
        /*
            r9 = this;
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r9.get(r10)
            txm r10 = (defpackage.txm) r10
            r0 = 0
            if (r10 == 0) goto L_0x0036
            boolean r1 = r9.a((defpackage.txm) r10)
            if (r1 != 0) goto L_0x0036
            int r1 = r10.a
            int r1 = r1 + -1
            r2 = 1
            if (r1 == r2) goto L_0x001e
            r3 = 2
            if (r1 == r3) goto L_0x001e
            return r2
        L_0x001e:
            jiq r1 = r9.a
            long r3 = r1.a()
            java.lang.Long r10 = r10.a()
            long r5 = r10.longValue()
            long r7 = defpackage.aymt.g()
            long r5 = r5 + r7
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0036
            return r2
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyy.a(int):boolean");
    }

    public final boolean a(txm txm) {
        int i = txm.a - 1;
        return i != 1 ? i != 2 ? i == 4 && this.a.a() > txm.a().longValue() + aymt.a.a().o() : this.a.a() > txm.a().longValue() + aymt.a.a().n() : this.a.a() > txm.a().longValue() + aymt.g();
    }
}
