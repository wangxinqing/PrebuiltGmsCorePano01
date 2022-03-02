package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.service.v1.MomentsFeed;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MomentsFeed[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList = ivw.c(parcel, readInt, MomentEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str4 = ivw.q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str5 = ivw.q(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    str6 = ivw.q(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MomentsFeed(hashSet, i, str, arrayList, str2, str3, str4, str5, str6);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
