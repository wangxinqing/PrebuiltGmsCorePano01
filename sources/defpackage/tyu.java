package defpackage;

import android.content.Context;
import android.util.LruCache;

/* renamed from: tyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyu extends LruCache {
    private final jiq a;

    public tyu(Context context) {
        super((int) aymt.t());
        this.a = (jiq) thl.a(context, jiq.class);
    }

    private final boolean a(txm txm) {
        return this.a.a() > txm.a().longValue() + aymt.a.a().m();
    }

    public final void a(int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        txm txm = (txm) get(valueOf);
        if (txm == null || txl.a(i2, txm.a) || a(txm)) {
            put(valueOf, new txm(i2, this.a.a()));
        }
    }

    public final boolean a(int i) {
        txm txm = (txm) get(Integer.valueOf(i));
        if (txm == null || txm.a == 2 || a(txm)) {
            return false;
        }
        return true;
    }
}
