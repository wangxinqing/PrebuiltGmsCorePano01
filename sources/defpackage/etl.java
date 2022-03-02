package defpackage;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;

/* renamed from: etl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class etl extends iby {
    private static final ibq a = new ibq("AccountTransfer.ACCOUNT_TRANSFER_API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new esv();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public etl(android.content.Context r4, defpackage.etq r5) {
        /*
            r3 = this;
            ibq r0 = a
            ibw r1 = new ibw
            r1.<init>()
            icz r2 = new icz
            r2.<init>()
            r1.a(r2)
            ibx r1 = r1.a()
            r3.<init>((android.content.Context) r4, (defpackage.ibq) r0, (defpackage.ibm) r5, (defpackage.ibx) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etl.<init>(android.content.Context, etq):void");
    }

    public final acwa a(AccountTransferMsg accountTransferMsg) {
        iva.a((Object) accountTransferMsg);
        return b((ihb) new ete(accountTransferMsg));
    }

    public final acwa b(AccountTransferMsg accountTransferMsg) {
        return b((ihb) new etg(accountTransferMsg));
    }

    public final acwa a(String str, int i) {
        iva.a((Object) str);
        return b((ihb) new etc(new NotifyCompletionRequest(str, i)));
    }
}
