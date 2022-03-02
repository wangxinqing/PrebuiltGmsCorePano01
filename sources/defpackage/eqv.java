package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqv extends nis {
    private final TokenRequest a;
    private final eqk b;
    private final epa c;

    public eqv(epa epa, eqk eqk, TokenRequest tokenRequest) {
        super(153, "GetToken");
        this.c = epa;
        this.a = tokenRequest;
        this.b = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        elt a2 = this.b.a(context);
        TokenRequest tokenRequest = this.a;
        this.c.a(Status.a, a2.a(tokenRequest.j, tokenRequest));
    }

    public final void a(Status status) {
        this.c.a(status, (TokenResponse) null);
    }
}
