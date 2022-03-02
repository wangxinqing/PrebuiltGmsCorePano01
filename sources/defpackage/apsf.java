package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsf implements apts {
    final /* synthetic */ VerifyAssertionRequest a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public apsf(apte apte, VerifyAssertionRequest verifyAssertionRequest, aptg aptg) {
        this.c = apte;
        this.a = verifyAssertionRequest;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        if (this.c.c.a()) {
            this.a.b();
        }
        VerifyAssertionRequest verifyAssertionRequest = this.a;
        String str = getTokenResponse.b;
        iva.c(str);
        verifyAssertionRequest.b = str;
        this.c.b.a((Context) null, this.a, (apts) new apse(this, this));
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
