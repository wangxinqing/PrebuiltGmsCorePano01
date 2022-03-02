package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentsFeed[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 4) {
                arrayList = ivw.c(parcel, readInt, MomentEntity.CREATOR);
                hashSet.add(4);
            } else if (a == 7) {
                str = ivw.q(parcel, readInt);
                hashSet.add(7);
            } else if (a != 9) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(9);
            }
        }
        if (parcel.dataPosition() == b) {
            return new MomentsFeed(hashSet, i, arrayList, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
