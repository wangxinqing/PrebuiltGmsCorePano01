package com.google.android.gms.common.threads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TraceWrappingParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new jgb();
    public final Bundle a;
    public Object b;
    public Bundle c;

    public TraceWrappingParcelable() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putParcelable("gctthpwp", this);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
