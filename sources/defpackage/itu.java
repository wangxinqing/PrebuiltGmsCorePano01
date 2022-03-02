package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: itu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class itu extends bhw implements itv {
    public itu() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo) bhx.a(parcel, ConnectionInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
