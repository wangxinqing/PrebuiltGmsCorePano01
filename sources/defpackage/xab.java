package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

/* renamed from: xab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableLoadImageOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new ParcelableLoadImageOptions(i, i2, z);
    }
}