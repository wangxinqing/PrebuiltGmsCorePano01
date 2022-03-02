package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.Permissions;

/* renamed from: qgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Permissions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String[] strArr4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 2) {
                strArr2 = ivw.A(parcel, readInt);
            } else if (a == 3) {
                strArr4 = ivw.A(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                strArr3 = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Permissions(strArr, strArr2, strArr3, strArr4);
    }
}
