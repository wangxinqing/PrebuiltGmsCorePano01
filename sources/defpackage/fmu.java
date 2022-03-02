package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fmu implements Callable {
    private final fnb a;
    private final Account b;
    private final int c;

    public fmu(fnb fnb, Account account, int i) {
        this.a = fnb;
        this.b = account;
        this.c = i;
    }

    public final Object call() {
        fnb fnb = this.a;
        Account account = this.b;
        int i = this.c;
        gck gck = fnb.a;
        qah a2 = qah.a(account, (Iterable) amzy.a((Object) GoogleSignInOptions.c));
        a2.a(5);
        a2.a(fnb.c, i);
        TokenResponse a3 = gck.a(a2.a());
        if (!gei.SUCCESS.equals(a3.b())) {
            return (gei.NEED_REMOTE_CONSENT.equals(a3.b()) || gei.NEED_PERMISSION.equals(a3.b())) ? amri.b(new fna(account, amzy.h())) : ampu.a;
        }
        TokenData tokenData = a3.w;
        iva.a((Object) tokenData);
        List list = tokenData.f;
        iva.a((Object) list);
        return amri.b(new fna(account, amym.a((Iterable) list).a(fmv.a).a(fmw.a).b()));
    }
}
