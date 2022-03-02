package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: adcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcv extends adct {
    private final atzx a;

    public adcv(Context context, Account account, atzx atzx) {
        super(context, account);
        this.a = atzx;
    }

    public final acwa a(iby iby) {
        atzx atzx = this.a;
        icc icc = iby.j;
        adcl adcl = new adcl(icc, atzx);
        icc.b((idf) adcl);
        return iux.a((icf) adcl, (iuw) new acyz()).a(adcu.a);
    }

    public final /* bridge */ /* synthetic */ icl a(Status status) {
        return new adcq(status, (atzy) null);
    }
}
