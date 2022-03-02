package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: edt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Encoding[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DsssEncoding dsssEncoding = null;
        DtmfEncoding dtmfEncoding = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                dsssEncoding = (DsssEncoding) ivw.a(parcel, readInt, DsssEncoding.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                dtmfEncoding = (DtmfEncoding) ivw.a(parcel, readInt, DtmfEncoding.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new Encoding(i, dsssEncoding, dtmfEncoding);
    }
}
