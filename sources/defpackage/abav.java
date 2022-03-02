package defpackage;

import android.accounts.Account;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: abav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abav implements Callable {
    private final ConsentChimeraActivity a;
    private final Account b;

    public abav(ConsentChimeraActivity consentChimeraActivity, Account account) {
        this.a = consentChimeraActivity;
        this.b = account;
    }

    public final Object call() {
        return Boolean.valueOf(jgu.e(this.a, this.b.name));
    }
}
