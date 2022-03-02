package com.google.android.gms.config.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageConfigTable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jor();
    public final Bundle a;

    public PackageConfigTable(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
