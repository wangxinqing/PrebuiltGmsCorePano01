package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final Parcelable.Creator CREATOR = new ktf();
    public final DataHolder b;
    public final boolean c;
    public final int d;

    public QueryResultEventParcelable(DataHolder dataHolder, boolean z, int i) {
        this.b = dataHolder;
        this.c = z;
        this.d = i;
    }

    public final int a() {
        return 3;
    }

    public final void a(Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, a);
    }
}
