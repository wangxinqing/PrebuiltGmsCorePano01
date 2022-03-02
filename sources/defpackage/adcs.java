package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: adcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcs extends adct {
    private final atyw a;

    public adcs(Context context, Account account, atyw atyw) {
        super(context, account);
        this.a = atyw;
    }

    public final acwa a(iby iby) {
        boolean z;
        atyw atyw = this.a;
        icc icc = iby.j;
        if ((atyw.a & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "UdcApi.getConsentConfig: Empty user-environment not allowed.");
        adci adci = new adci(icc, atyw);
        icc.a((idf) adci);
        return iux.a((icf) adci, (iuw) new acyy()).a(adcr.a);
    }

    public final /* bridge */ /* synthetic */ icl a(Status status) {
        return new adco(status, (atyx) null);
    }
}
