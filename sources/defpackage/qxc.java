package defpackage;

import android.os.Parcel;

/* renamed from: qxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qxc extends bhw implements qxd {
    public qxc() {
        super("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
