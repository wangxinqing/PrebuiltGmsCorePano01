package com.google.android.gms.chromesync;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChromeSyncState extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new hie();
    public final boolean a;
    public final int b;
    public final PendingIntent c;
    public final boolean d;

    public ChromeSyncState(boolean z, int i, PendingIntent pendingIntent, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = pendingIntent;
        this.d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
