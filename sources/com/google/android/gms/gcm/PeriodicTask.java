package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new ntm();
    public long a = -1;
    public long b = -1;

    @Deprecated
    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = Math.min(parcel.readLong(), this.a);
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(j);
        sb.append(" flex=");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
