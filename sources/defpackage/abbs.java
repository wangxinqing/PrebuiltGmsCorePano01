package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbs implements amsv {
    private final SignInChimeraActivity a;

    public abbs(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        icc icc = signInChimeraActivity.k;
        Account account = signInChimeraActivity.f;
        amrl.a((Object) account);
        return qbc.a((icf) icc.a((idf) new abcz(icc, new AuthAccountRequest(account, signInChimeraActivity.g))));
    }
}
