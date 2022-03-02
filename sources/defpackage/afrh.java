package defpackage;

import android.accounts.AccountManager;

/* renamed from: afrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrh implements awdt {
    private final bapu a;

    public afrh(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amri b = amri.b(AccountManager.get(((afqx) this.a).a()));
        awdx.a((Object) b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
