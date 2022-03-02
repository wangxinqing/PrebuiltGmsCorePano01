package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TransferProgressData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ktu();
    public final int a;
    public final DriveId b;
    public final int c;
    public final long d;
    public final long e;

    public TransferProgressData(int i, DriveId driveId) {
        this(i, driveId, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferProgressData transferProgressData = (TransferProgressData) obj;
        return this.a == transferProgressData.a && ius.a(this.b, transferProgressData.b) && this.c == transferProgressData.c && this.d == transferProgressData.d && this.e == transferProgressData.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    public TransferProgressData(int i, DriveId driveId, int i2, long j, long j2) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
