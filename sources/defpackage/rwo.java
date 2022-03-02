package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.net.UrlRequest;

/* renamed from: rwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwo extends bhw implements rwp {
    public rwo() {
        super("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 4:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 6:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if (queryLocalInterface instanceof rwp) {
                        rwp rwp = (rwp) queryLocalInterface;
                    } else {
                        new rwn(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 9:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 10:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 12:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
