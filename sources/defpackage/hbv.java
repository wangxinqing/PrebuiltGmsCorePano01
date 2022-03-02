package defpackage;

import android.content.Context;

/* renamed from: hbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbv implements awdt {
    private final bapu a;

    public hbv(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        gzq h = hbs.h((Context) this.a.a());
        awdx.a((Object) h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
