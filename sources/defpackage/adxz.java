package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* renamed from: adxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        double d = 0.0d;
        long j = 0;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new LoyaltyPointsBalance(i, str, d, str2, j, i2);
    }
}
