package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: sfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sfx implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public sfx(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    /* renamed from: b */
    public final afvk a() {
        afvg afvg = new afvg((Account) ((awdu) this.a).a, (Context) this.b.a(), (aflk) this.c.a());
        awdx.a((Object) afvg, "Cannot return null from a non-@Nullable @Provides method");
        return afvg;
    }
}
