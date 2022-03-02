package defpackage;

import android.accounts.Account;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbv implements amsv {
    private final SignInChimeraActivity a;
    private final int b;

    public abbv(SignInChimeraActivity signInChimeraActivity, int i) {
        this.a = signInChimeraActivity;
        this.b = i;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        int i = this.b;
        abdk abdk = signInChimeraActivity.n;
        Account account = signInChimeraActivity.f;
        amrl.a((Object) account);
        iha b2 = ihb.b();
        b2.a = new abdc(i, account);
        return qbc.a(abdk.b(b2.a()));
    }
}
