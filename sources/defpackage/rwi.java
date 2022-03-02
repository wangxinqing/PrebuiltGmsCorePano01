package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: rwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwi extends bhw implements rwj {
    public rwi() {
        super("com.google.android.gms.maps.model.internal.IPolygonDelegate");
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
                parcel.createTypedArrayList(LatLng.CREATOR);
                parcel2.writeNoException();
                return true;
            case 4:
                ArrayList arrayList = new ArrayList();
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 5:
                bhx.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayList2 = new ArrayList();
                parcel2.writeNoException();
                parcel2.writeList(arrayList2);
                return true;
            case 7:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 9:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 11:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                parcel.readFloat();
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case Service.START_CONTINUATION_MASK:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 17:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 19:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if (queryLocalInterface instanceof rwj) {
                        rwj rwj = (rwj) queryLocalInterface;
                    } else {
                        new rwh(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 20:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 21:
                bhx.a(parcel);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 23:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 25:
                parcel.createTypedArrayList(PatternItem.CREATOR);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                parcel2.writeTypedList((List) null);
                return true;
            case 27:
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
            case 28:
                parcel2.writeNoException();
                bhx.a(parcel2, (IInterface) null);
                return true;
            default:
                return false;
        }
    }
}
