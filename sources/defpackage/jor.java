package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.config.internal.PackageConfigTable;

/* renamed from: jor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jor implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PackageConfigTable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PackageConfigTable(bundle);
    }
}
