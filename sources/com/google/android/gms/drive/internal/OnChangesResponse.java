package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnChangesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator CREATOR = new kwp();
    public final DataHolder b;
    final List c;
    final ChangeSequenceNumber d;
    final boolean e;

    public OnChangesResponse(DataHolder dataHolder, List list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.b = dataHolder;
        this.c = list;
        this.d = changeSequenceNumber;
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public final void a(Parcel parcel, int i) {
        int i2 = i | 1;
        int a = ivx.a(parcel);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.c(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a);
    }
}
