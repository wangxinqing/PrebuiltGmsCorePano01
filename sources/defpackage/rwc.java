package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: rwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rwc extends bhw implements rwd {
    public rwc() {
        super("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 3:
                ArrayList arrayList = new ArrayList();
                parcel2.writeNoException();
                parcel2.writeBinderList(arrayList);
                return true;
            case 4:
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    if (queryLocalInterface instanceof rwd) {
                        rwd rwd = (rwd) queryLocalInterface;
                    } else {
                        new rwb(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                bhx.a(parcel2, false);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }
}
