package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: ahby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahby implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public ahby(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        agzs agzs = new agzs(amzy.a((Collection) ((awea) this.a).a()), amzy.a((Collection) (Set) ((awdu) this.b).a), amzy.a((Collection) (Set) ((awdu) this.c).a));
        awdx.a((Object) agzs, "Cannot return null from a non-@Nullable @Provides method");
        return agzs;
    }
}
