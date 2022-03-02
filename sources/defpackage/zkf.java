package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: zkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zkf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.PlacesLived[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                z = ivw.c(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                mergedpeoplemetadata = (Mergedpeoplemetadata) ivw.a(parcel, readInt, Mergedpeoplemetadata.CREATOR);
                hashSet.add(3);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.PlacesLived(hashSet, z, mergedpeoplemetadata, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
