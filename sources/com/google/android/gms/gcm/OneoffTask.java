package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new ntk();
    public final long a;
    public final long b;

    @Deprecated
    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(j);
        sb.append(" windowEnd=");
        sb.append(j2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
