package defpackage;

import android.accounts.Account;

/* renamed from: afgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgd implements awdt {
    private final afgc a;

    public afgd(afgc afgc) {
        this.a = afgc;
    }

    public static afgd a(afgc afgc) {
        return new afgd(afgc);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Account account = this.a.a;
        awdx.a((Object) account, "Cannot return null from a non-@Nullable @Provides method");
        return account;
    }
}
