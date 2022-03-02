package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhFootprint;

/* renamed from: ryg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprint[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        long j = 0;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 2) {
                bArr2 = ivw.t(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MdhFootprint(bArr, bArr2, j);
    }
}
