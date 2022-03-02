package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: eeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eeu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenReceiver$Params[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Encoding[] encodingArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                encodingArr = (Encoding[]) ivw.b(parcel, readInt, Encoding.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new TokenReceiver$Params(encodingArr);
    }
}
