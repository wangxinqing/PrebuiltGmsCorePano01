package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import java.util.HashSet;

/* renamed from: abok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abok implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CompanionApp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                str3 = ivw.q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                str4 = ivw.q(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new CompanionApp(hashSet, str, str2, str3, str4, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
