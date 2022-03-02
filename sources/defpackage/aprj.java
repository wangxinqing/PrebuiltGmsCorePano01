package defpackage;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

/* renamed from: aprj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprj extends apqg {
    private final VerifyBeforeUpdateEmailAidlRequest g;

    public aprj(String str, String str2, aptp aptp, VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "VerifyBeforeUpdateEmail");
        this.g = verifyBeforeUpdateEmailAidlRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        VerifyBeforeUpdateEmailAidlRequest verifyBeforeUpdateEmailAidlRequest = this.g;
        ActionCodeSettings actionCodeSettings = verifyBeforeUpdateEmailAidlRequest.c;
        String str = verifyBeforeUpdateEmailAidlRequest.a;
        String str2 = verifyBeforeUpdateEmailAidlRequest.b;
        iva.c(str);
        iva.c(str2);
        iva.a((Object) actionCodeSettings);
        apte.a(new apul(aqkx.VERIFY_AND_CHANGE_EMAIL, actionCodeSettings, str2, str), this.a);
    }
}
