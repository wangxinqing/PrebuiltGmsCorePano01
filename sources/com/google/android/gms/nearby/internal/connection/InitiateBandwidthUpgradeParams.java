package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InitiateBandwidthUpgradeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhf();
    public uha a;
    public String b;

    public InitiateBandwidthUpgradeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitiateBandwidthUpgradeParams) {
            InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = (InitiateBandwidthUpgradeParams) obj;
            return ius.a(this.a, initiateBandwidthUpgradeParams.a) && ius.a(this.b, initiateBandwidthUpgradeParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public InitiateBandwidthUpgradeParams(IBinder iBinder, String str) {
        uha uha;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            uha = queryLocalInterface instanceof uha ? (uha) queryLocalInterface : new ugy(iBinder);
        } else {
            uha = null;
        }
        this.a = uha;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        uha uha = this.a;
        if (uha != null) {
            iBinder = uha.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
