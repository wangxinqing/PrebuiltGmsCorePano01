package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import java.util.HashSet;

/* renamed from: zgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientLoggedCircleMemberEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
                hashSet.add(3);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientLoggedCircleMemberEntity(hashSet, i, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
