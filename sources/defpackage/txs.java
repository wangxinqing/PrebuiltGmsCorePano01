package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: txs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txs extends thj {
    private final jiq b;

    public txs(Context context) {
        super(context, "nearby-fast-pair", "nearby_scan_fast_pair_item_cache.db");
        this.b = (jiq) thl.a(context, jiq.class);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return tzg.f;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        tzg tzg = (tzg) obj;
        return tzg.e && this.b.a() - tzg.d >= TimeUnit.HOURS.toMillis(aymt.w());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return ((tzg) obj).b;
    }
}
