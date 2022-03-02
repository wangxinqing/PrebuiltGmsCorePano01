package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;

/* renamed from: gfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FrpSnapshot[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PersistentDeviceOwnerState persistentDeviceOwnerState = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 4:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 5:
                    persistentDeviceOwnerState = (PersistentDeviceOwnerState) ivw.a(parcel, readInt, PersistentDeviceOwnerState.CREATOR);
                    break;
                case 6:
                    z4 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FrpSnapshot(i, z, z2, z3, persistentDeviceOwnerState, z4);
    }
}
