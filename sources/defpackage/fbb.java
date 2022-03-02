package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import java.util.concurrent.Executor;

/* renamed from: fbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fbb implements ow {
    private final fbk a;

    public fbb(fbk fbk) {
        this.a = fbk;
    }

    public final Object a() {
        fbk fbk = this.a;
        AuthorizationRequest authorizationRequest = fbk.b;
        Account account = authorizationRequest.e;
        String str = authorizationRequest.f;
        if (account == null) {
            fsj fsj = fbk.m;
            String str2 = fbk.c;
            String str3 = fbk.d;
            iva.c(str2);
            iva.c(str3);
            iha b = ihb.b();
            b.a = new fuj(str3, str2);
            return aopr.a(qbc.a(((iby) fsj).a(b.a())), (amqy) new fav(fbk, str), (Executor) fbk.h);
        } else if (!jgu.b(fbk.getContext().getApplicationContext(), account, fbk.c) || !fbk.a(account, str)) {
            fbk.a.d("Requested account does not satisfy the hostedDomain restriction", new Object[0]);
            return aorl.a((Throwable) qbf.a(28441));
        } else {
            fbk.l = account;
            return aorl.a((Object) amri.b(qcr.EXTERNAL_ACCOUNT_CHOOSER));
        }
    }
}
