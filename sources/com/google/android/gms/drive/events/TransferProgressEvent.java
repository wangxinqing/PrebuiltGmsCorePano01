package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TransferProgressEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new kto();
    public final TransferProgressData a;

    public TransferProgressEvent(TransferProgressData transferProgressData) {
        this.a = transferProgressData;
    }

    public final int a() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj != this) {
            return ius.a(this.a, ((TransferProgressEvent) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
