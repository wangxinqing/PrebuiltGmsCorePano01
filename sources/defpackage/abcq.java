package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: abcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abcq extends abdq {
    final /* synthetic */ abcr a;

    public abcq(abcr abcr) {
        this.a = abcr;
    }

    public final void a(Status status, GoogleSignInAccount googleSignInAccount) {
        this.a.a((icl) new fvv(googleSignInAccount, status));
    }
}
