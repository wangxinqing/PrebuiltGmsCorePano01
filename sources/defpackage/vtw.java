package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: vtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vtw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransferMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        int i = 0;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                f = ivw.l(parcel, readInt);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                z = ivw.c(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                z2 = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new TransferMetadata(i, f, str, z, z2);
    }
}
