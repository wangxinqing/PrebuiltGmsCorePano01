package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: rvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a == 4) {
                f = ivw.l(parcel, readInt);
            } else if (a == 5) {
                z2 = ivw.c(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                f2 = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }
}
