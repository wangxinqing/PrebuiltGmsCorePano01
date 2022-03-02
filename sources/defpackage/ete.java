package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;

/* renamed from: ete  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ete extends eti {
    final /* synthetic */ AccountTransferMsg a;

    public ete(AccountTransferMsg accountTransferMsg) {
        this.a = accountTransferMsg;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        etd etd = new etd(this, this);
        AccountTransferMsg accountTransferMsg = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) etd);
        bhx.a(aQ, (Parcelable) accountTransferMsg);
        eua.b(1, aQ);
    }
}
