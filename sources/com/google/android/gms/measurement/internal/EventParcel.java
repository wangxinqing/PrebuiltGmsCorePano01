package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sps();
    public final String a;
    public final EventParams b;
    public final String c;
    public final long d;

    public EventParcel(EventParcel eventParcel, long j) {
        iva.a((Object) eventParcel);
        this.a = eventParcel.a;
        this.b = eventParcel.b;
        this.c = eventParcel.c;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        sps.a(this, parcel, i);
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.a = str;
        this.b = eventParams;
        this.c = str2;
        this.d = j;
    }
}
