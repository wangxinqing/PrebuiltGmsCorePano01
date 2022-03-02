package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentItemEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientLoggedRhsComponentItemEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                arrayList = ivw.c(parcel, readInt, ClientLoggedCircleEntity.CREATOR);
                hashSet.add(2);
            } else if (a != 9) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, ClientLoggedCircleMemberEntity.CREATOR);
                hashSet.add(9);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientLoggedRhsComponentItemEntity(hashSet, i, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
