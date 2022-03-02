package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountCredentialSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fft();
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public AccountCredentialSettings(boolean z, boolean z2, List list, boolean z3) {
        this.a = z;
        this.b = z2;
        iva.a((Object) list);
        this.c = amzy.a((Collection) list);
        this.d = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
