package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;

/* renamed from: esy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esy extends eti {
    final /* synthetic */ RetrieveDataRequest a;

    public esy(RetrieveDataRequest retrieveDataRequest) {
        this.a = retrieveDataRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        esx esx = new esx(this, this);
        RetrieveDataRequest retrieveDataRequest = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) esx);
        bhx.a(aQ, (Parcelable) retrieveDataRequest);
        eua.b(6, aQ);
    }
}
