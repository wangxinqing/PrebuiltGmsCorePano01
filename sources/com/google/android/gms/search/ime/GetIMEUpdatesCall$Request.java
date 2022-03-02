package com.google.android.gms.search.ime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetIMEUpdatesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aakg();
    public int a;
    public byte[] b;

    public GetIMEUpdatesCall$Request() {
    }

    public GetIMEUpdatesCall$Request(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
