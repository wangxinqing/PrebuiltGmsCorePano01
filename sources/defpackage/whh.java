package defpackage;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: whh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whh implements Callable {
    private final Callable a;
    private final Account b;

    public whh(Callable callable, Account account) {
        this.a = callable;
        this.b = account;
    }

    public final Object call() {
        Callable callable = this.a;
        Account account = this.b;
        arzi arzi = new arzi(ayni.a.a().ae());
        arzi.b = 5;
        whn whn = (whn) arzk.a(callable, "GetAccountOwner", arzi.a());
        if (whn != null) {
            return whn;
        }
        String str = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("Failed to find account ");
        sb.append(str);
        sb.append(" in the list of on device accounts");
        throw new Exception(sb.toString());
    }
}
