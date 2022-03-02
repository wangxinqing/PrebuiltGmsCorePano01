package defpackage;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;

/* renamed from: abth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abth implements abtl {
    private final absy a;
    private final AccountTransferPayload b;

    public abth(absy absy, AccountTransferPayload accountTransferPayload) {
        this.a = absy;
        this.b = accountTransferPayload;
    }

    public final void a() {
        AccountTransferMsg b2 = this.b.b();
        if (b2 == null) {
            abtm.d.e("Could not import accounts because AccountTransferMsg is null", new Object[0]);
        } else {
            this.a.a(b2);
        }
    }
}
