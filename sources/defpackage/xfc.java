package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AccountMetadata;

/* renamed from: xfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xfc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                z = ivw.c(parcel, readInt);
            } else if (a == 3) {
                z2 = ivw.c(parcel, readInt);
            } else if (a == 4) {
                z3 = ivw.c(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                z4 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AccountMetadata(z, z2, z3, z4);
    }
}
