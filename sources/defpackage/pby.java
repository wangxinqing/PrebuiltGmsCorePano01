package defpackage;

import android.content.Context;

/* renamed from: pby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pby implements awdt {
    private final bapu a;

    public pby(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afgt afgt = new afgt(new pbv((Context) this.a.a()));
        awdx.a((Object) afgt, "Cannot return null from a non-@Nullable @Provides method");
        return afgt;
    }
}
