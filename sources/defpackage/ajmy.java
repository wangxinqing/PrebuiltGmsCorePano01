package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.state.update.Conditions;

/* renamed from: ajmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Conditions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                z = ivw.c(parcel, readInt);
            } else if (a == 3) {
                z2 = ivw.c(parcel, readInt);
            } else if (a == 4) {
                z3 = ivw.c(parcel, readInt);
            } else if (a == 5) {
                z4 = ivw.c(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                z5 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Conditions(z, z2, z3, z4, z5);
    }
}
