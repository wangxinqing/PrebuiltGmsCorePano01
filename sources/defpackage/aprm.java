package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* renamed from: aprm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprm extends apqg {
    private final SendVerificationCodeRequest g;

    public aprm(String str, String str2, aptp aptp, SendVerificationCodeRequest sendVerificationCodeRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "VerifyPhoneNumberOperation");
        this.g = sendVerificationCodeRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        SendVerificationCodeRequest sendVerificationCodeRequest = this.g;
        appg.a(sendVerificationCodeRequest, context, this.d, apte, this.a, sendVerificationCodeRequest.a, sendVerificationCodeRequest.b, sendVerificationCodeRequest.c, false);
    }
}
