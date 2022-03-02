package defpackage;

import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: abcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abcm implements amsv {
    private final SignInChimeraActivity a;
    private final RecordConsentRequest b;

    public abcm(SignInChimeraActivity signInChimeraActivity, RecordConsentRequest recordConsentRequest) {
        this.a = signInChimeraActivity;
        this.b = recordConsentRequest;
    }

    public final Object a() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        RecordConsentRequest recordConsentRequest = this.b;
        icc icc = signInChimeraActivity.k;
        return qbc.a((icf) icc.a((idf) new abcx(icc, recordConsentRequest)));
    }
}
