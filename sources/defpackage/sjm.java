package defpackage;

import android.accounts.Account;

/* renamed from: sjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sjm implements awdt {
    private final bapu a;

    public sjm(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        afjl afjl;
        aekn b = aeko.b();
        Account account = (Account) ((awdu) this.a).a;
        if (aygo.b()) {
            afjl = afjn.b(b, account.toString(), (int) aygr.e());
        } else {
            afjl = afjn.a(b, account.toString(), (int) aygr.e());
        }
        awdx.a((Object) afjl, "Cannot return null from a non-@Nullable @Provides method");
        return afjl;
    }
}
