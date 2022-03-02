package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jom();
    public final int a;
    public final DataHolder b;
    public final long c;
    public final DataHolder d;

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, long j, DataHolder dataHolder2) {
        this.a = i;
        this.b = dataHolder;
        this.c = j;
        this.d = dataHolder2;
    }

    public final void a() {
        DataHolder dataHolder = this.b;
        if (dataHolder != null && !dataHolder.b()) {
            this.b.close();
        }
    }

    public FetchConfigIpcResponse(int i, DataHolder dataHolder, DataHolder dataHolder2) {
        this(i, dataHolder, -1, dataHolder2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
