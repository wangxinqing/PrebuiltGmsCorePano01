package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: kyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FileList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 4) {
                arrayList = ivw.c(parcel, readInt, File.CREATOR);
                hashSet.add(4);
            } else if (a != 7) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
                hashSet.add(7);
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileList(hashSet, arrayList, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
