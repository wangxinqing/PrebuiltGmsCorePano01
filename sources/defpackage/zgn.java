package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzExtensionEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientOzExtensionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList = ivw.c(parcel, readInt, ClientOzEventEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    j = ivw.i(parcel, readInt);
                    hashSet.add(6);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientOzExtensionEntity(hashSet, i, str3, arrayList, str, str2, j);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
