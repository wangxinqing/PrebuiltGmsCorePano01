package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaSignInAidlRequest;

/* renamed from: apqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqp extends apqg {
    private final FinalizeMfaSignInAidlRequest g;

    public apqp(String str, String str2, aptp aptp, FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "FinishMfaPhoneNumberEnrollment");
        this.g = finalizeMfaSignInAidlRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        FinalizeMfaSignInAidlRequest finalizeMfaSignInAidlRequest = this.g;
        PhoneAuthCredential phoneAuthCredential = finalizeMfaSignInAidlRequest.a;
        String str = finalizeMfaSignInAidlRequest.b;
        apud apud = null;
        if (phoneAuthCredential.c && !TextUtils.isEmpty(phoneAuthCredential.g)) {
            String a = apox.a.a(context, str, phoneAuthCredential.g);
            if (!TextUtils.isEmpty(a) && apov.a(context, a, "FinishMfaPhoneNumberEnrollment")) {
                String a2 = apox.a.a(context, a);
                iva.c(a2);
                iva.c(a);
                apud = new apud("phone", str, (String) null, (String) null, a2, a);
            }
        } else if (!TextUtils.isEmpty(phoneAuthCredential.a) && !TextUtils.isEmpty(phoneAuthCredential.b)) {
            String str2 = phoneAuthCredential.a;
            String str3 = phoneAuthCredential.b;
            iva.c(str3);
            iva.c(str2);
            apud = new apud("phone", str, str2, str3, (String) null, (String) null);
        }
        if (apud != null) {
            aptg aptg = this.a;
            iva.a((Object) apud);
            iva.a((Object) aptg);
            aptt aptt = apte.b;
            aptt.a((aptv) apud, (apth) new apue(), axif.c(), "mfaSignIn:finalize").a((acvp) new appq(aptt, context, apud, new apsp(apte, aptg)));
            return;
        }
        this.a.a(new Status(17499, "Phone Number instant validation failed!"));
    }
}
