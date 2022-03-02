package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;

/* renamed from: tan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tan implements igp {
    private final GetEsimConfigRequest a;

    public tan(GetEsimConfigRequest getEsimConfigRequest) {
        this.a = getEsimConfigRequest;
    }

    public final void a(Object obj, Object obj2) {
        GetEsimConfigRequest getEsimConfigRequest = this.a;
        tar tar = new tar((acwd) obj2);
        tau tau = (tau) ((tav) obj).x();
        Parcel aQ = tau.aQ();
        bhx.a(aQ, (IInterface) tar);
        bhx.a(aQ, (Parcelable) getEsimConfigRequest);
        tau.b(4, aQ);
    }
}
