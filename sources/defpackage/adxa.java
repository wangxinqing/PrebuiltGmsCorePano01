package defpackage;

import android.content.Context;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;

/* renamed from: adxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxa extends iby {
    public final Context a;
    public final int b;
    public final int l;

    public adxa(Context context, adwr adwr) {
        super(context, adws.a, (ibm) adwr, (igu) new icz());
        this.a = context;
        this.b = adwr.a;
        this.l = adwr.b;
    }

    public final acwa a(GetClientTokenRequest getClientTokenRequest) {
        icc icc = this.j;
        adxq adxq = new adxq(icc, getClientTokenRequest);
        icc.a((idf) adxq);
        return iux.a((icf) adxq, (iuw) new adwz());
    }
}
