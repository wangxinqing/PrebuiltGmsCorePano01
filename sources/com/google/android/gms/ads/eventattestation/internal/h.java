package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class h extends bhv implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IImpressionAttestationTokenCallback");
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeInt(1);
        aQ.writeString(str);
        c(3, aQ);
    }
}
