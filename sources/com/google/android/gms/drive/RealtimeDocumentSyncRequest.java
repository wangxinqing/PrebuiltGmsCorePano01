package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RealtimeDocumentSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jzx();
    public final List a;
    public final List b;

    public RealtimeDocumentSyncRequest(List list, List list2) {
        iva.a((Object) list);
        this.a = list;
        iva.a((Object) list2);
        this.b = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
