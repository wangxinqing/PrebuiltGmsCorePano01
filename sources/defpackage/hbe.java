package defpackage;

import android.content.Context;

/* renamed from: hbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbe implements awdt {
    private final bapu a;
    private final bapu b;

    public hbe(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amri a2 = hbb.a((Context) this.a.a(), ((Boolean) this.b.a()).booleanValue());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
