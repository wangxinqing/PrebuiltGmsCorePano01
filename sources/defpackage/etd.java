package defpackage;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;

/* renamed from: etd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class etd extends eth {
    final /* synthetic */ ete a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public etd(ete ete, eti eti) {
        super(eti);
        this.a = ete;
    }

    public final void a(Status status, AccountTransferMsg accountTransferMsg) {
        if (status.c()) {
            this.a.a((Object) accountTransferMsg);
        } else {
            this.a.a(status);
        }
    }
}
