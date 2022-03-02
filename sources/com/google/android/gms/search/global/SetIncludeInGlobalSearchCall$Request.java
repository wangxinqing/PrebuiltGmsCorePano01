package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetIncludeInGlobalSearchCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aajq();
    public String a;
    public String b;
    public boolean c;

    public SetIncludeInGlobalSearchCall$Request() {
    }

    public SetIncludeInGlobalSearchCall$Request(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
