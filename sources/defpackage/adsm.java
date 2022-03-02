package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;

/* renamed from: adsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UsageReportingOptInOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 5:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new UsageReportingOptInOptions(i, z, arrayList, i2, str, z2);
    }
}
