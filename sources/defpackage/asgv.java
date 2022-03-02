package defpackage;

import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asgv extends bhw implements asgw {
    public asgv() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((OperationStatus) bhx.a(parcel, OperationStatus.CREATOR));
        return true;
    }
}
