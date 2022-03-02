package defpackage;

import android.content.Context;

/* renamed from: pce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pce implements awdt {
    private final bapu a;

    public pce(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        qdc a2 = qdc.a((Context) this.a.a());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
