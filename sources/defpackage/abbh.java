package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbh implements amsv {
    private final ConsentChimeraActivity a;

    public abbh(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a() {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        aosh f = aosh.f();
        qub.a((Context) consentChimeraActivity).a(consentChimeraActivity.h.a(), consentChimeraActivity.h.b, Bundle.EMPTY, consentChimeraActivity.getContainerActivity(), (AccountManagerCallback) new abbd(consentChimeraActivity, f));
        return f;
    }
}
