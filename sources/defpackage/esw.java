package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;

/* renamed from: esw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esw extends etk {
    final /* synthetic */ SendDataRequest a;

    public esw(SendDataRequest sendDataRequest) {
        this.a = sendDataRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        etz etz = this.c;
        SendDataRequest sendDataRequest = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) etz);
        bhx.a(aQ, (Parcelable) sendDataRequest);
        eua.b(5, aQ);
    }
}
