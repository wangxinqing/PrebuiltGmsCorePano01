package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.aidlrequests.SignInWithCustomTokenAidlRequest;
import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: aprb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprb extends apqg {
    private final apvi g;

    public aprb(String str, String str2, aptp aptp, SignInWithCustomTokenAidlRequest signInWithCustomTokenAidlRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "SignInWithCustomToken");
        this.g = new apvi(signInWithCustomTokenAidlRequest.a, signInWithCustomTokenAidlRequest.b);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        apvi apvi = this.g;
        aptg aptg = this.a;
        iva.a((Object) apvi);
        iva.a((Object) aptg);
        apte.b.a((aptv) apvi, (apth) new VerifyCustomTokenResponse(), axic.c(), "verifyCustomToken").a((acvp) new appv(new apsm(apte, aptg)));
    }
}
