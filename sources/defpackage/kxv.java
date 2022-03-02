package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.About;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: kxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kxv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new About[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        long j = 0;
        long j2 = 0;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 8) {
                arrayList2 = ivw.C(parcel, readInt);
                hashSet.add(8);
            } else if (a == 24) {
                j = ivw.i(parcel, readInt);
                hashSet.add(24);
            } else if (a == 13) {
                j2 = ivw.i(parcel, readInt);
                hashSet.add(13);
            } else if (a != 14) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, About.MaxUploadSizes.CREATOR);
                hashSet.add(14);
            }
        }
        if (parcel.dataPosition() == b) {
            return new About(hashSet, arrayList2, j2, arrayList, j);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
