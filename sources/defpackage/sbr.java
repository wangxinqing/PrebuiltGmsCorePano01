package defpackage;

import android.content.Context;

/* renamed from: sbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbr implements awdt {
    private final bapu a;

    public sbr(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afsz afsz = new afsz((Context) this.a.a());
        awdx.a((Object) afsz, "Cannot return null from a non-@Nullable @Provides method");
        return afsz;
    }
}
