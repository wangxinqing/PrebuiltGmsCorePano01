package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: rmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReportingState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 7:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 8:
                    num = ivw.h(parcel, readInt);
                    break;
                case 9:
                    i4 = ivw.g(parcel, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ReportingState(i, i2, z, z2, i3, i4, num, z3);
    }
}
