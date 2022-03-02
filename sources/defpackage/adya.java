package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* renamed from: adya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adya implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) ivw.a(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) ivw.a(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }
}
