package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberEnrollmentAidlRequest;

/* renamed from: aprk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprk extends apqg {
    private final StartMfaPhoneNumberEnrollmentAidlRequest g;

    public aprk(String str, String str2, aptp aptp, StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "VerifyPhoneNumberForMfaEnrollmentOperation");
        this.g = startMfaPhoneNumberEnrollmentAidlRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest = this.g;
        String str = startMfaPhoneNumberEnrollmentAidlRequest.a;
        String str2 = startMfaPhoneNumberEnrollmentAidlRequest.b;
        String str3 = startMfaPhoneNumberEnrollmentAidlRequest.c;
        iva.c(str2);
        apvb apvb = new apvb(str, "phone", str2, str3);
        String str4 = this.d;
        aptg aptg = this.a;
        StartMfaPhoneNumberEnrollmentAidlRequest startMfaPhoneNumberEnrollmentAidlRequest2 = this.g;
        appg.a(apvb, context, str4, apte, aptg, startMfaPhoneNumberEnrollmentAidlRequest2.b, startMfaPhoneNumberEnrollmentAidlRequest2.d, startMfaPhoneNumberEnrollmentAidlRequest2.e, startMfaPhoneNumberEnrollmentAidlRequest2.f);
    }
}
