package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ivp();
    final int a;
    public final int b;
    public final int c;
    @Deprecated
    public final Scope[] d;

    public SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, (Parcelable[]) this.d, i);
        ivx.b(parcel, a2);
    }
}
