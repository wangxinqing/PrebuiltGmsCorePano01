package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.Change;
import com.google.android.gms.drive.internal.model.ChangeList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: kxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kxz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChangeList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 4) {
                arrayList = ivw.c(parcel, readInt, Change.CREATOR);
                hashSet.add(4);
            } else if (a == 6) {
                j = ivw.i(parcel, readInt);
                hashSet.add(6);
            } else if (a != 8) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
                hashSet.add(8);
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangeList(hashSet, arrayList, j, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
