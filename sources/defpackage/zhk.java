package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity;
import java.util.HashSet;

/* renamed from: zhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OzDeviceInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    i2 = ivw.g(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    z2 = ivw.c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i3 = ivw.g(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    i4 = ivw.g(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OzDeviceInfoEntity(hashSet, i, i2, z, z2, str, str2, str3, i3, i4);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
