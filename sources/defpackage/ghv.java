package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ghv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ghv extends bhw implements ghw {
    public ghv() {
        super("com.google.android.gms.auth.managed.internal.IPasswordComplexityService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ghu ghu;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.managed.internal.IPasswordComplexityCallbacks");
            ghu = queryLocalInterface instanceof ghu ? (ghu) queryLocalInterface : new ghu(readStrongBinder);
        } else {
            ghu = null;
        }
        a(ghu);
        parcel2.writeNoException();
        return true;
    }
}
