package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

/* renamed from: adxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SecurePaymentsPayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        SecurePaymentsData[] securePaymentsDataArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                securePaymentsDataArr = (SecurePaymentsData[]) ivw.b(parcel, readInt, SecurePaymentsData.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SecurePaymentsPayload(bArr, securePaymentsDataArr);
    }
}
