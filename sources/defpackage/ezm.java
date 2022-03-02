package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;

/* renamed from: ezm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezm implements Callable {
    private final ezo a;
    private final Account b;

    public ezm(ezo ezo, Account account) {
        this.a = ezo;
        this.b = account;
    }

    public final Object call() {
        String str;
        String str2;
        ezo ezo = this.a;
        Account account = this.b;
        AuthorizationRequest authorizationRequest = ezo.c;
        if (authorizationRequest.c) {
            qah a2 = qah.a(account, authorizationRequest.b, authorizationRequest.a);
            a2.a(5);
            a2.a(ezo.f.contains(new Scope("email")));
            a2.b(ezo.f.contains(new Scope("profile")));
            a2.a("auto");
            a2.a(ezo.b, ezo.d);
            TokenResponse a3 = ezo.e.a(a2.a());
            if (a3 != null) {
                TokenData tokenData = a3.w;
                if (a3.b() != gei.SUCCESS || tokenData == null) {
                    return ampu.a;
                }
                str = tokenData.b;
            } else {
                throw new ibr(Status.c);
            }
        } else {
            str = null;
        }
        gck gck = ezo.e;
        qah a4 = qah.a(account, (Iterable) ezo.f);
        a4.a(5);
        a4.a(ezo.b, ezo.d);
        TokenResponse a5 = gck.a(a4.a());
        if (a5 != null) {
            TokenData tokenData2 = a5.w;
            if (a5.b() != gei.SUCCESS || tokenData2 == null) {
                return ampu.a;
            }
            String str3 = tokenData2.b;
            amzy b2 = !tokenData2.e ? amym.a((Iterable) ezo.f).a(ezn.a).b() : tokenData2.f;
            if (b2 != null) {
                AuthorizationRequest authorizationRequest2 = ezo.c;
                if (authorizationRequest2.d) {
                    gck gck2 = ezo.e;
                    Account account2 = authorizationRequest2.e;
                    boolean z = false;
                    if (account2 != null && account.equals(account2)) {
                        z = true;
                    }
                    qah a6 = qah.a(account, ezo.c.b);
                    a6.a(5);
                    a6.a(ezo.b, ezo.d);
                    if (!z) {
                        a6.a(ezo.f.contains(new Scope("email")));
                        a6.b(ezo.f.contains(new Scope("profile")));
                    }
                    TokenResponse a7 = gck2.a(a6.a());
                    if (a7 != null) {
                        TokenData tokenData3 = a7.w;
                        if (a7.b() != gei.SUCCESS || tokenData3 == null) {
                            return ampu.a;
                        }
                        str2 = tokenData3.b;
                    } else {
                        throw new ibr(Status.c);
                    }
                } else {
                    str2 = null;
                }
                if (ezo.c.e != null) {
                    jgu.a(ezo.a, ezo.b, account);
                }
                String str4 = str2;
                return amri.b(new AuthorizationResult(str, str3, str4, b2, fcf.a(ezo.a, ezo.b, account, ezo.f, str4, str), (PendingIntent) null));
            }
            throw new ibr(Status.c);
        }
        throw new ibr(Status.c);
    }
}
