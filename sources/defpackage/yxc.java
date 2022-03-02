package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;

/* renamed from: yxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity.OrganizationsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
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
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str5 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    z = ivw.c(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str6 = ivw.q(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    str7 = ivw.q(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    i2 = ivw.g(parcel, readInt);
                    hashSet.add(10);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonEntity.OrganizationsEntity(hashSet, i, str, str2, str3, str4, str5, z, str6, str7, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
