package defpackage;

import android.content.Context;

/* renamed from: hbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbz implements awdt {
    private final bapu a;

    public hbz(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String d = hbs.d((Context) this.a.a());
        awdx.a((Object) d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
