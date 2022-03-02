package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: acye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acye implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConsentFlowConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    z = ivw.c(parcel, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 4:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 5:
                    i = ivw.g(parcel, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    z4 = ivw.c(parcel, readInt);
                    break;
                case 8:
                    i3 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ConsentFlowConfig(z, z2, z3, i, i2, z4, i3);
    }
}
