package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new nnb();
    private final String a;
    private final byte[] b;
    private final int c;

    public RealTimeMessage(String str, byte[] bArr, int i) {
        iva.a((Object) str);
        this.a = str;
        this.b = (byte[]) ((byte[]) iva.a((Object) bArr)).clone();
        this.c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }
}
