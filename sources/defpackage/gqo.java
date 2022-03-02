package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gqo extends bhw implements gqp {
    public gqo() {
        super("com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        gqq gqq;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceServiceCallback");
            gqq = queryLocalInterface instanceof gqq ? (gqq) queryLocalInterface : new gqq(readStrongBinder);
        } else {
            gqq = null;
        }
        a(gqq);
        parcel2.writeNoException();
        return true;
    }
}
