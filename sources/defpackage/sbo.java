package defpackage;

import android.content.Context;

/* renamed from: sbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbo implements awdt {
    private final bapu a;

    public sbo(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context context = (Context) this.a.a();
        scd scd = new scd(context, new afsu(context), sce.a(context));
        awdx.a((Object) scd, "Cannot return null from a non-@Nullable @Provides method");
        return scd;
    }
}
