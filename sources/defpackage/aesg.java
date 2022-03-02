package defpackage;

import android.content.Context;

/* renamed from: aesg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesg implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public aesg(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context b2 = ((aeqr) this.a).a();
        ((aeqp) this.b).a();
        String b3 = ((aeqt) this.c).a();
        String b4 = ((aequ) this.d).a();
        aese aese = new aese(b3, b4, jhg.h(b2, b4));
        awdx.a((Object) aese, "Cannot return null from a non-@Nullable @Provides method");
        return aese;
    }
}
