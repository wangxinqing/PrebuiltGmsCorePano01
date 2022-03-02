package defpackage;

import android.content.Context;

/* renamed from: pkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pkv implements awdt {
    private final bapu a;
    private final bapu b;

    public pkv(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afcx afcx = new afcx((pkw) this.a.a(), (Context) this.b.a());
        awdx.a((Object) afcx, "Cannot return null from a non-@Nullable @Provides method");
        return afcx;
    }
}
