package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChangeEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new ksf();
    public final DriveId a;
    final int b;

    public ChangeEvent(DriveId driveId, int i) {
        this.a = driveId;
        this.b = i;
    }

    public final int a() {
        return 1;
    }

    public final String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
