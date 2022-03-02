package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenParcel;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.d;
import com.google.android.gms.ads.identifier.settings.e;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class b extends nis {
    private final AdRequestAttestationTokenRequestParcel a;
    private final int b;
    private final d c;

    public b(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, int i, d dVar) {
        super(216, "FetchAdRequestAttestationToken");
        this.a = adRequestAttestationTokenRequestParcel;
        this.b = i;
        this.c = dVar;
    }

    public final void a(Context context) {
        e a2 = e.a(context);
        try {
            AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = this.a;
            byte[] a3 = a2.a(adRequestAttestationTokenRequestParcel.a, "adRequestAttestationToken", new com.google.android.gms.ads.identifier.settings.b(a2, adRequestAttestationTokenRequestParcel.c, this.b, adRequestAttestationTokenRequestParcel.b));
            d dVar = this.c;
            AdRequestAttestationTokenParcel adRequestAttestationTokenParcel = new AdRequestAttestationTokenParcel(a3);
            Parcel aQ = dVar.aQ();
            bhx.a(aQ, (Parcelable) adRequestAttestationTokenParcel);
            dVar.c(2, aQ);
        } catch (IOException | GeneralSecurityException e) {
            this.c.a(e.getMessage());
        }
    }

    public final void a(Status status) {
        this.c.a(status.j);
    }
}
