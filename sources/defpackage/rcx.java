package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;

/* renamed from: rcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                z = ivw.c(parcel2, readInt);
            } else if (a == 2) {
                j = ivw.i(parcel2, readInt);
            } else if (a == 3) {
                f = ivw.l(parcel2, readInt);
            } else if (a == 4) {
                j2 = ivw.i(parcel2, readInt);
            } else if (a != 5) {
                ivw.b(parcel2, readInt);
            } else {
                i = ivw.g(parcel2, readInt);
            }
        }
        ivw.E(parcel2, b);
        return new DeviceOrientationRequest(z, j, f, j2, i);
    }
}
