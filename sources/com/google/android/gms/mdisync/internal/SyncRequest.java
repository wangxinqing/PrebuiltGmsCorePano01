package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sje();
    public final set a;
    public final byte[] b;
    public final SyncOptions c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        set a2 = set.a(i);
        this.a = a2 == null ? set.UNKNOWN : a2;
        this.b = bArr;
        this.c = syncOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a.e);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
