package defpackage;

import android.accounts.Account;

/* renamed from: sjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sjp implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public sjp(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afto b2 = ((sjw) this.b).a();
        afjl afjl = (afjl) this.c.a();
        sjn sjn = new sjn((String) ((awdu) this.d).a, afjl, b2, (Account) ((awdu) this.a).a);
        awdx.a((Object) sjn, "Cannot return null from a non-@Nullable @Provides method");
        return sjn;
    }
}
