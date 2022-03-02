package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqt extends apqg {
    private final String g;
    private final VerifyAssertionRequest h;

    public apqt(String str, String str2, aptp aptp, String str3, VerifyAssertionRequest verifyAssertionRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "LinkFederatedCredential");
        this.g = str3;
        this.h = verifyAssertionRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        VerifyAssertionRequest verifyAssertionRequest = this.h;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) verifyAssertionRequest);
        iva.a((Object) aptg);
        apte.a(str, (apts) new apsf(apte, verifyAssertionRequest, aptg));
    }
}
