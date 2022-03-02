package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnListEntriesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator CREATOR = new kww();
    public final DataHolder b;
    public final boolean c;

    public OnListEntriesResponse(DataHolder dataHolder, boolean z) {
        this.b = dataHolder;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a);
    }
}
