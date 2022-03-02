package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbj();
    final int a;
    @Deprecated
    public final boolean b;
    public final int c;

    public CheckFactoryResetPolicyComplianceResponse(int i, int i2) {
        this.a = i;
        this.b = i2 != 1 ? false : true;
        this.c = i2;
    }

    public static CheckFactoryResetPolicyComplianceResponse a(int i) {
        return new CheckFactoryResetPolicyComplianceResponse(2, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
