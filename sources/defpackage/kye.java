package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.File;
import java.util.HashSet;

/* renamed from: kye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kye implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new File.Labels[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 3) {
                z = ivw.c(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                z2 = ivw.c(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                z3 = ivw.c(parcel, readInt);
                hashSet.add(5);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                z4 = ivw.c(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new File.Labels(hashSet, z, z2, z3, z4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
