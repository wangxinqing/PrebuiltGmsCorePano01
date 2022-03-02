package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: hst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hst extends bhw implements hsu {
    public hst() {
        super("com.google.android.gms.clearcut.internal.IBootCountService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        hsr hsr;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
            hsr = queryLocalInterface instanceof hsr ? (hsr) queryLocalInterface : new hsp(readStrongBinder);
        } else {
            hsr = null;
        }
        a(hsr);
        return true;
    }
}
