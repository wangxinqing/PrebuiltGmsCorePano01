package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.update.InstallationOptions;

/* renamed from: adip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adip implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InstallationOptions[i];
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
            if (a == 1) {
                z = ivw.c(parcel, readInt);
            } else if (a == 2) {
                z2 = ivw.c(parcel, readInt);
            } else if (a == 3) {
                z3 = ivw.c(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                z4 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new InstallationOptions(z, z2, z3, z4);
    }
}
