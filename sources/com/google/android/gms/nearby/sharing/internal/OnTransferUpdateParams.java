package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzh();
    public ShareTarget a;
    public TransferMetadata b;

    public OnTransferUpdateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnTransferUpdateParams) {
            OnTransferUpdateParams onTransferUpdateParams = (OnTransferUpdateParams) obj;
            return ius.a(this.a, onTransferUpdateParams.a) && ius.a(this.b, onTransferUpdateParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public OnTransferUpdateParams(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.a = shareTarget;
        this.b = transferMetadata;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
