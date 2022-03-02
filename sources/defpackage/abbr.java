package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbr implements amsv {
    private final SignInChimeraActivity a;

    public abbr(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        abdk abdk = signInChimeraActivity.n;
        Account account = signInChimeraActivity.f;
        amrl.a((Object) account);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(account, signInChimeraActivity.g);
        iha b = ihb.b();
        b.a = new abdf(authAccountRequest);
        return qbc.a(abdk.a(b.a()));
    }
}
