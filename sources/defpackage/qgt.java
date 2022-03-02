package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: qgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RoutingOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    z = ivw.c(parcel, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 4:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 5:
                    z4 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    z5 = ivw.c(parcel, readInt);
                    break;
                case 7:
                    z6 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new RoutingOptions(z, str, z2, z3, z4, z5, z6);
    }
}
