package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;

/* renamed from: eei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eei implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Snoop$Params[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Encoding[] encodingArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                encodingArr = (Encoding[]) ivw.b(parcel, readInt, Encoding.CREATOR);
            } else if (a == 3) {
                z = ivw.c(parcel, readInt);
            } else if (a == 4) {
                z2 = ivw.c(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Snoop$Params(encodingArr, z, z2, j);
    }
}
