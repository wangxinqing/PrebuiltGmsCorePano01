package com.google.android.gms.ads.identifier.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b extends bhv implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(3, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String b() {
        Parcel a = a(1, aQ());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean c() {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        Parcel a = a(2, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void a(String str, boolean z) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, z);
        b(4, aQ);
    }

    public final String b(String str, boolean z) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, z);
        Parcel a = a(5, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
