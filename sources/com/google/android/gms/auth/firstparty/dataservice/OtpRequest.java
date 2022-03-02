package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OtpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcr();
    final int a;
    public final String b;
    public final AppDescription c;
    public final byte[] d;
    public final boolean e;

    public OtpRequest(int i, String str, AppDescription appDescription, byte[] bArr, boolean z) {
        this.a = i;
        this.b = str;
        this.d = bArr;
        iva.a((Object) appDescription, (Object) "Caller's app description cannot be null!");
        this.c = appDescription;
        this.e = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
