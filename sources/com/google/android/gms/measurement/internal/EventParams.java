package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new spr();
    public final Bundle a;

    public EventParams(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public final String c(String str) {
        return this.a.getString(str);
    }

    public final Iterator iterator() {
        return new spq(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Object a(String str) {
        return this.a.get(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, a(), false);
        ivx.b(parcel, a2);
    }
}
