package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: wjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wjz extends bhw implements wka {
    public wjz() {
        super("com.google.android.gms.notifications.internal.IGunsService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        wjy wjy;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.notifications.internal.IGunsCallbacks");
            wjy = queryLocalInterface instanceof wjy ? (wjy) queryLocalInterface : new wjy(readStrongBinder);
        } else {
            wjy = null;
        }
        a(wjy, parcel.readString(), parcel.readString(), (ReadStateUpdate) bhx.a(parcel, ReadStateUpdate.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
