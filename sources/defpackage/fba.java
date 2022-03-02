package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fba implements Callable {
    private final fbk a;
    private final int b;

    public fba(fbk fbk, int i) {
        this.a = fbk;
        this.b = i;
    }

    public final Object call() {
        TokenRequest tokenRequest;
        fbk fbk = this.a;
        int i = this.b;
        boolean z = true;
        if (i == 1) {
            qah a2 = qah.a(fbk.l, fbk.b.b, fbk.a());
            a2.a(5);
            a2.a(fbk.a().contains(new Scope("email")));
            a2.b(fbk.a().contains(new Scope("profile")));
            a2.a("auto");
            a2.a(fbk.c, fbk.n);
            tokenRequest = a2.a();
        } else if (i != 2) {
            Account account = fbk.b.e;
            if (account == null || !fbk.l.equals(account)) {
                z = false;
            }
            qah a3 = qah.a(fbk.l, fbk.b.b);
            a3.a(5);
            a3.a(fbk.c, fbk.n);
            if (!z) {
                a3.a(fbk.a().contains(new Scope("email")));
                a3.b(fbk.a().contains(new Scope("profile")));
            }
            tokenRequest = a3.a();
        } else {
            qah a4 = qah.a(fbk.l, (Iterable) fbk.a());
            a4.a(5);
            a4.a(fbk.c, fbk.n);
            tokenRequest = a4.a();
        }
        fbk.q = tokenRequest;
        fbk.r = fbk.p.a(fbk.q);
        TokenResponse tokenResponse = fbk.r;
        if (tokenResponse != null) {
            gei gei = gei.CLIENT_LOGIN_DISABLED;
            int ordinal = tokenResponse.b().ordinal();
            if (ordinal == 3) {
                TokenData tokenData = fbk.r.w;
                if (tokenData != null) {
                    List list = tokenData.f;
                    if (list != null) {
                        fbk.o = jkx.a((Collection) list);
                    }
                    fbk.a(i, tokenData.b);
                    return amri.b(qcr.AUTH_ACCOUNT);
                }
                throw new ibr(Status.c);
            } else if (ordinal == 20) {
                return amri.b(qcr.EXTERNAL_CONSENT_SHOW_NATIVE_ACTIVITY);
            } else {
                if (ordinal == 21) {
                    return amri.b(qcr.CONSENT_GET_COOKIES);
                }
                throw new ibr(Status.c);
            }
        } else {
            throw new ibr(Status.c);
        }
    }
}
