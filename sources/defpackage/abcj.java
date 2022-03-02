package defpackage;

import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: abcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abcj implements amsv {
    private final SignInChimeraActivity a;
    private final RecordConsentRequest b;

    public abcj(SignInChimeraActivity signInChimeraActivity, RecordConsentRequest recordConsentRequest) {
        this.a = signInChimeraActivity;
        this.b = recordConsentRequest;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        RecordConsentRequest recordConsentRequest = this.b;
        abdk abdk = signInChimeraActivity.n;
        iha b2 = ihb.b();
        b2.a = new abdd(recordConsentRequest);
        return qbc.a(abdk.b(b2.a()));
    }
}
