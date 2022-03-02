package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: tec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tec extends bhv implements tee {
    public tec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    }

    public final void a(ConnectRequest connectRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) connectRequest);
        b(5, aQ);
    }

    public final void a(DisableTargetRequest disableTargetRequest) {
        throw null;
    }

    public final void a(EnableTargetRequest enableTargetRequest) {
        throw null;
    }

    public final String b() {
        throw null;
    }

    public final void a(ContinueConnectRequest continueConnectRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) continueConnectRequest);
        b(8, aQ);
    }

    public final void a(DisconnectRequest disconnectRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) disconnectRequest);
        b(6, aQ);
    }

    public final void a(SendDataRequest sendDataRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) sendDataRequest);
        b(7, aQ);
    }

    public final void a(StartScanRequest startScanRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) startScanRequest);
        b(1, aQ);
    }

    public final void a(StopScanRequest stopScanRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) stopScanRequest);
        b(2, aQ);
    }

    public final void a(teb teb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) teb);
        b(10, aQ);
    }
}
