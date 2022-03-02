package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.eventattestation.internal.AdvertisingIdParcel;
import com.google.android.gms.ads.eventattestation.internal.e;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class c extends nis {
    private final e a;

    public c(e eVar) {
        super(216, "FetchAdvertisingId");
        this.a = eVar;
    }

    public final void a(Context context) {
        com.google.android.gms.ads.identifier.settings.e a2 = com.google.android.gms.ads.identifier.settings.e.a(context);
        AdvertisingIdParcel advertisingIdParcel = new AdvertisingIdParcel(a2.c(), a2.i());
        e eVar = this.a;
        Parcel aQ = eVar.aQ();
        bhx.a(aQ, (Parcelable) advertisingIdParcel);
        eVar.c(2, aQ);
    }

    public final void a(Status status) {
        e eVar = this.a;
        String str = status.j;
        Parcel aQ = eVar.aQ();
        aQ.writeInt(1);
        aQ.writeString(str);
        eVar.c(3, aQ);
    }
}
