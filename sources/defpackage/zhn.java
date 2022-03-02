package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PeopleFeed[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                arrayList = ivw.c(parcel, readInt, PersonEntity.CREATOR);
                hashSet.add(3);
            } else if (a == 5) {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(5);
            } else if (a != 8) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
                hashSet.add(8);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PeopleFeed(hashSet, i, str, arrayList, str2, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
