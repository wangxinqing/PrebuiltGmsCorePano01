package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: tth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tth extends tti {
    private final jiq b;

    public tth(Context context) {
        super(context, "nearby_discovery_item_cache.db");
        this.b = (jiq) thl.a(context, jiq.class);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return uaj.K;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Long l;
        uaj uaj = (uaj) obj;
        long a = this.b.a();
        if ((uaj.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(uaj.k);
        } else {
            l = null;
        }
        return ttg.b(a, l);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return ((uaj) obj).c;
    }

    public final /* bridge */ /* synthetic */ boolean c(audx audx) {
        return ttg.a((uaj) audx, this.b.a());
    }

    public final /* bridge */ /* synthetic */ boolean b(audx audx) {
        uaj uaj = (uaj) audx;
        if (ttg.a(this.b.a(), uaj)) {
            return true;
        }
        int a = uai.a(uaj.m);
        return a != 0 && a == 3;
    }
}
