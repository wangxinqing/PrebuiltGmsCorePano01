package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: zim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zim implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpgradeAccountEntity.FormEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, AccountField.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpgradeAccountEntity.FormEntity(hashSet, i, arrayList);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
