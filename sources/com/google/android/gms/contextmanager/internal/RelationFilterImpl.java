package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RelationFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxr();

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
