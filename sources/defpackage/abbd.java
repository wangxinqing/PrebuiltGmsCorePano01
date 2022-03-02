package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abbd implements AccountManagerCallback {
    private final ConsentChimeraActivity a;
    private final aosh b;

    public abbd(ConsentChimeraActivity consentChimeraActivity, aosh aosh) {
        this.a = consentChimeraActivity;
        this.b = aosh;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.a.a(this.b, accountManagerFuture);
    }
}
