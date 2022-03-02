package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import java.util.HashSet;

/* renamed from: acig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acig implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ScreenlockState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        long j = 0;
        long j2 = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                z = ivw.c(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                i = ivw.g(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                j = ivw.i(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                j2 = ivw.i(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                z2 = ivw.c(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ScreenlockState(hashSet, z, i, j, j2, z2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
