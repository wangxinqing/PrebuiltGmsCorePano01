package defpackage;

import android.content.Context;

/* renamed from: sbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbt implements awdt {
    private final bapu a;
    private final bapu b;

    public sbt(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amzy amzy;
        afsz afsz = (afsz) this.b.a();
        amzy a2 = amzy.a((Object) agzx.a((Context) this.a.a()).a());
        amzy a3 = amzy.a((Object) new ahct());
        if (!axsv.a.a().s()) {
            amzy = amzy.h();
        } else {
            amzy = amzy.a((Object) afsz);
        }
        agzs agzs = new agzs(a2, a3, amzy);
        awdx.a((Object) agzs, "Cannot return null from a non-@Nullable @Provides method");
        return agzs;
    }
}
