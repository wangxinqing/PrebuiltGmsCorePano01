package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecurePaymentsPayload extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adxk();
    public byte[] a;
    SecurePaymentsData[] b;

    public SecurePaymentsPayload(byte[] bArr, SecurePaymentsData[] securePaymentsDataArr) {
        this.a = bArr;
        this.b = securePaymentsDataArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, (Parcelable[]) this.b, i);
        ivx.b(parcel, a2);
    }
}
