package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhj {
    private static final jjg a = jjg.a();
    private final iby b;

    public adhj(Context context, Account account) {
        new adhv(context, account.name);
        grb a2 = grb.a("com.google.android.gms.udc", account);
        this.b = gra.d(context, a2);
        gra.c(context, a2);
    }

    public static attc a(ContextData contextData) {
        if (contextData == null) {
            return null;
        }
        return (attc) aucj.a((aucj) attc.b, contextData.k(), aubs.c());
    }

    public final jtk a() {
        jtm jtm = new jtm();
        jtm.a(10002);
        jtm.b(2);
        try {
            return ((jur) ((ick) acws.a(iux.a(juc.a(this.b.j, jtm.a()), new ick()), azrk.c(), TimeUnit.MILLISECONDS)).a).b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            anih anih = (anih) a.b();
            anih.a(e);
            anih.a("Failure reading udc context");
            return null;
        }
    }
}
