package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;

/* renamed from: zeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zeh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField.ValueEntity.NameEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
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
                str2 = ivw.q(parcel, readInt);
                hashSet.add(3);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountField.ValueEntity.NameEntity(hashSet, i, str, str2, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
