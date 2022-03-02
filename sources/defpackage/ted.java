package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ted  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ted extends bhw implements tee {
    public ted() {
        super("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        teb teb;
        switch (i) {
            case 1:
                a((StartScanRequest) bhx.a(parcel, StartScanRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((StopScanRequest) bhx.a(parcel, StopScanRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                a((EnableTargetRequest) bhx.a(parcel, EnableTargetRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                a((DisableTargetRequest) bhx.a(parcel, DisableTargetRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                a((ConnectRequest) bhx.a(parcel, ConnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                a((DisconnectRequest) bhx.a(parcel, DisconnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                a((SendDataRequest) bhx.a(parcel, SendDataRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a((ContinueConnectRequest) bhx.a(parcel, ContinueConnectRequest.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 10:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback");
                    teb = queryLocalInterface instanceof teb ? (teb) queryLocalInterface : new tdz(readStrongBinder);
                } else {
                    teb = null;
                }
                a(teb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
