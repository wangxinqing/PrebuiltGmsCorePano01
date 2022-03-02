package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.FinalizeMfaEnrollmentAidlRequest;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqo extends apqg {
    private final FinalizeMfaEnrollmentAidlRequest g;

    public apqo(String str, String str2, aptp aptp, FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "FinishMfaPhoneNumberEnrollment");
        this.g = finalizeMfaEnrollmentAidlRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        apub apub;
        Context context2 = context;
        apte apte2 = apte;
        FinalizeMfaEnrollmentAidlRequest finalizeMfaEnrollmentAidlRequest = this.g;
        PhoneAuthCredential phoneAuthCredential = finalizeMfaEnrollmentAidlRequest.a;
        String str = finalizeMfaEnrollmentAidlRequest.c;
        String str2 = GetTokenResponse.a(finalizeMfaEnrollmentAidlRequest.b).b;
        String str3 = phoneAuthCredential.d;
        if (!phoneAuthCredential.c) {
            String str4 = phoneAuthCredential.a;
            String str5 = phoneAuthCredential.b;
            iva.c(str5);
            iva.c(str4);
            apub = new apub("phone", str2, str4, str5, (String) null, (String) null, str);
        } else if (apov.a(context2, str3, "FinishMfaPhoneNumberEnrollment")) {
            String a = apox.a.a(context2, str3);
            String str6 = finalizeMfaEnrollmentAidlRequest.c;
            iva.c(a);
            iva.c(str3);
            apub = new apub("phone", str2, (String) null, (String) null, a, str3, str6);
        } else {
            apub = null;
        }
        if (apub != null) {
            String str7 = this.g.b;
            aptg aptg = this.a;
            iva.a((Object) apub);
            iva.a((Object) aptg);
            apte2.a(str7, (apts) new apso(apte2, apub, context2, aptg));
            return;
        }
        this.a.a(new Status(17499, "Phone Number instant validation failed!"));
    }
}
