package defpackage;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;

/* renamed from: abar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abar implements amqy {
    private final ConsentChimeraActivity a;

    public abar(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        String str = ((RecordConsentByConsentResultResponse) obj).b;
        amrl.a((Object) str);
        consentChimeraActivity.a(str);
        return ampu.a;
    }
}
