package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ProviderAcceptParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzn();
    public ShareTarget a;

    public ProviderAcceptParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderAcceptParams) {
            return ius.a(this.a, ((ProviderAcceptParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public ProviderAcceptParams(ShareTarget shareTarget) {
        this.a = shareTarget;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
