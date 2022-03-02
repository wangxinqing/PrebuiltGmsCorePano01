package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dso();
    public final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
