package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.NetworkLocationStatus;

/* renamed from: rew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rew implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NetworkLocationStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                j2 = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new NetworkLocationStatus(i, i2, j, j2);
    }
}
