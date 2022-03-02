package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: adxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ApplicationParameters applicationParameters = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                applicationParameters = (ApplicationParameters) ivw.a(parcel, readInt, ApplicationParameters.CREATOR);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 5) {
                str3 = ivw.q(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                str4 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BuyFlowConfig(str, applicationParameters, str2, str3, str4);
    }
}
