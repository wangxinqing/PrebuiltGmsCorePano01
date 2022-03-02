package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* renamed from: adxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxq extends adwp {
    final /* synthetic */ GetClientTokenRequest a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adxq(icc icc, GetClientTokenRequest getClientTokenRequest) {
        super(icc);
        this.a = getClientTokenRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        adxp adxp = (adxp) ibf;
        GetClientTokenRequest getClientTokenRequest = this.a;
        adxo adxo = new adxo(this);
        Bundle a2 = adxp.a(adxp.u, adxp.a.getPackageName(), adxp.v, adxp.w, adxp.x);
        try {
            adxm adxm = (adxm) adxp.x();
            Parcel aQ = adxm.aQ();
            bhx.a(aQ, (Parcelable) getClientTokenRequest);
            bhx.a(aQ, (Parcelable) a2);
            bhx.a(aQ, (IInterface) adxo);
            adxm.c(15, aQ);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            Status status = Status.c;
            GetClientTokenResponse getClientTokenResponse = new GetClientTokenResponse(new byte[0]);
            Bundle bundle = Bundle.EMPTY;
            adxo.a(status, getClientTokenResponse);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new adxe(status, new GetClientTokenResponse(new byte[0]));
    }
}
