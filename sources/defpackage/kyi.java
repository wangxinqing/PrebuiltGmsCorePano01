package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.Property;
import java.util.HashSet;

/* renamed from: kyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Property[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 7) {
                str3 = ivw.q(parcel, readInt);
                hashSet.add(7);
            } else if (a != 8) {
                ivw.b(parcel, readInt);
            } else {
                str4 = ivw.q(parcel, readInt);
                hashSet.add(8);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Property(hashSet, str, str2, str3, str4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
