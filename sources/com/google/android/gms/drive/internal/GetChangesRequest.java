package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kvw();
    public final ChangeSequenceNumber a;
    public final int b;
    public final List c;
    public final boolean d;

    public GetChangesRequest(ChangeSequenceNumber changeSequenceNumber, int i, List list, boolean z) {
        this.a = changeSequenceNumber;
        this.b = i;
        this.c = list;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.c(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
