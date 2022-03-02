package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.EstimationOptions;

/* renamed from: adtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EstimationOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                z = ivw.c(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                z2 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new EstimationOptions(z, z2);
    }
}
