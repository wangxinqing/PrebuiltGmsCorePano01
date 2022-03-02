package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenResponseParcel;
import com.google.android.gms.ads.eventattestation.internal.h;
import com.google.android.gms.ads.identifier.settings.c;
import com.google.android.gms.ads.identifier.settings.e;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class d extends nis {
    private final ImpressionAttestationTokenRequestParcel a;
    private final int b;
    private final h c;

    public d(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, int i, h hVar) {
        super(216, "FetchImpressionAttestationToken");
        this.a = impressionAttestationTokenRequestParcel;
        this.b = i;
        this.c = hVar;
    }

    public final void a(Context context) {
        byte[] bArr;
        e a2 = e.a(context);
        try {
            ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel = this.a;
            String str = impressionAttestationTokenRequestParcel.a;
            String str2 = impressionAttestationTokenRequestParcel.b;
            int i = this.b;
            if (awhh.a.a().j()) {
                bArr = a2.a(str, "impressionAttestationToken", new c(a2, a2.a(str2, i)));
            } else {
                bArr = null;
            }
            h hVar = this.c;
            ImpressionAttestationTokenResponseParcel impressionAttestationTokenResponseParcel = new ImpressionAttestationTokenResponseParcel(bArr);
            Parcel aQ = hVar.aQ();
            bhx.a(aQ, (Parcelable) impressionAttestationTokenResponseParcel);
            hVar.c(2, aQ);
        } catch (IOException | GeneralSecurityException e) {
            this.c.a(e.getMessage());
        }
    }

    public final void a(Status status) {
        this.c.a(status.j);
    }
}
