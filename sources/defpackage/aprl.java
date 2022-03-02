package defpackage;

import android.content.Context;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;

/* renamed from: aprl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprl extends apqg {
    private final StartMfaPhoneNumberSignInAidlRequest g;

    public aprl(String str, String str2, aptp aptp, StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "VerifyPhoneNumberForMfaSignInOperation");
        this.g = startMfaPhoneNumberSignInAidlRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str;
        StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest = this.g;
        String str2 = startMfaPhoneNumberSignInAidlRequest.b;
        PhoneMultiFactorInfo phoneMultiFactorInfo = startMfaPhoneNumberSignInAidlRequest.a;
        String str3 = phoneMultiFactorInfo.a;
        String str4 = phoneMultiFactorInfo.d;
        String str5 = startMfaPhoneNumberSignInAidlRequest.c;
        iva.c(str4);
        apvd apvd = new apvd("phone", str2, str3, str4, str5);
        String a = apox.a.a(context, apvd.a, apvd.b);
        if (a != null) {
            str = a;
        } else {
            str = apvd.d;
        }
        String str6 = this.d;
        aptg aptg = this.a;
        StartMfaPhoneNumberSignInAidlRequest startMfaPhoneNumberSignInAidlRequest2 = this.g;
        appg.a(apvd, context, str6, apte, aptg, str, startMfaPhoneNumberSignInAidlRequest2.d, startMfaPhoneNumberSignInAidlRequest2.e, startMfaPhoneNumberSignInAidlRequest2.f);
    }
}
