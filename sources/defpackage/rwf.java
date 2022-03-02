package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.model.LatLng;
import org.chromium.net.UrlRequest;

/* renamed from: rwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwf extends bhw implements rwg {
    public rwf() {
        super("com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 3:
                LatLng latLng = (LatLng) bhx.a(parcel, LatLng.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                LatLng latLng2 = new LatLng(0.0d, 0.0d);
                parcel2.writeNoException();
                bhx.b(parcel2, latLng2);
                return true;
            case 5:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                parcel2.writeString("");
                return true;
            case 9:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case Service.START_CONTINUATION_MASK:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof rwg) {
                        rwg rwg = (rwg) queryLocalInterface;
                    } else {
                        new rwe(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 17:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface2 instanceof mby) {
                        mby mby = (mby) queryLocalInterface2;
                    } else {
                        new mbw(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readFloat();
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 20:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 22:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                parcel.readFloat();
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 27:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 28:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 29:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof mby) {
                        mby mby2 = (mby) queryLocalInterface3;
                    } else {
                        new mbw(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 30:
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) null);
                return true;
            default:
                return false;
        }
    }

    public final boolean a(rwg rwg) {
        return false;
    }

    public final void b() {
    }

    public final String c() {
        return "";
    }

    public final int d() {
        return 0;
    }
}
