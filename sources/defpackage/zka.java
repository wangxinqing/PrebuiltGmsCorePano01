package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.HashSet;

/* renamed from: zka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zka implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Person.Nicknames[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        Mergedpeoplemetadata mergedpeoplemetadata = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                mergedpeoplemetadata = (Mergedpeoplemetadata) ivw.a(parcel, readInt, Mergedpeoplemetadata.CREATOR);
                hashSet.add(2);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
                hashSet.add(3);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Person.Nicknames(hashSet, mergedpeoplemetadata, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
