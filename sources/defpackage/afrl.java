package defpackage;

import android.content.Context;

/* renamed from: afrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrl implements awdt {
    private final afrg a;
    private final bapu b;

    public afrl(afrg afrg, bapu bapu) {
        this.a = afrg;
        this.b = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        afrg afrg = this.a;
        Context b2 = ((afqx) this.b).a();
        if (afrg.d.a()) {
            obj = new scd(b2, (afsu) afrg.d.b(), 20190814);
        } else {
            obj = new afrf();
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
