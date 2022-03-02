package defpackage;

import android.content.Context;

/* renamed from: afmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmk implements awdt {
    private final bapu a;

    public afmk(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afsu afsu = new afsu((Context) this.a.a());
        awdx.a((Object) afsu, "Cannot return null from a non-@Nullable @Provides method");
        return afsu;
    }
}
