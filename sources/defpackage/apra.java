package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apra extends apqg {
    private final VerifyAssertionRequest g;

    public apra(String str, String str2, aptp aptp, VerifyAssertionRequest verifyAssertionRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "SignInWithCredential");
        this.g = verifyAssertionRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        VerifyAssertionRequest verifyAssertionRequest = this.g;
        aptg aptg = this.a;
        iva.a((Object) verifyAssertionRequest);
        iva.a((Object) aptg);
        if (apte.c.a()) {
            verifyAssertionRequest.b();
        }
        apte.b.a(context, verifyAssertionRequest, (apts) new apsx(apte, aptg));
    }
}
