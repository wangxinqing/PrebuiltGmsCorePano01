package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.CommentEntity;
import java.util.HashSet;

/* renamed from: zgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CommentEntity.StatusForViewerEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
                hashSet.add(1);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new CommentEntity.StatusForViewerEntity(hashSet, i, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
