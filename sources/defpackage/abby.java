package defpackage;

import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abby implements amsv {
    private final SignInChimeraActivity a;
    private final int b;

    public abby(SignInChimeraActivity signInChimeraActivity, int i) {
        this.a = signInChimeraActivity;
        this.b = i;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        int i = this.b;
        icc icc = signInChimeraActivity.k;
        Account account = signInChimeraActivity.f;
        amrl.a((Object) account);
        return qbc.a((icf) icc.a((idf) new abcv(icc, i, account)));
    }
}
