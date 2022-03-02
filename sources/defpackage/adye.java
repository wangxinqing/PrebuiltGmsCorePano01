package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* renamed from: adye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adye implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                timeInterval = (TimeInterval) ivw.a(parcel, readInt, TimeInterval.CREATOR);
            } else if (a == 5) {
                uriData = (UriData) ivw.a(parcel, readInt, UriData.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                uriData2 = (UriData) ivw.a(parcel, readInt, UriData.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }
}
