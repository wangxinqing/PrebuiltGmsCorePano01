package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aaar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aaar extends bhw implements aaas {
    public aaar() {
        super("com.google.android.gms.scheduler.IGmsTaskScheduler");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        aaav aaav;
        if (i == 1) {
            Intent intent = (Intent) bhx.a(parcel, Intent.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.scheduler.ISchedulerCallbacks");
                aaav = queryLocalInterface instanceof aaav ? (aaav) queryLocalInterface : new aaat(readStrongBinder);
            } else {
                aaav = null;
            }
            a(intent, aaav);
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readInt());
        }
        return true;
    }
}
