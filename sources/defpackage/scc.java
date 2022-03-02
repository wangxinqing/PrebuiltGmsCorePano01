package defpackage;

import android.content.Context;

/* renamed from: scc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class scc implements awdt {
    private final bapu a;
    private final bapu b;

    public scc(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Integer num = 22528;
        amsv a2 = amta.a((amsv) new scb(num.intValue(), (Context) this.a.a(), (agzs) this.b.a()));
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
