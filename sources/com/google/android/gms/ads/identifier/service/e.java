package com.google.android.gms.ads.identifier.service;

import android.os.Binder;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.d;
import com.google.android.gms.ads.eventattestation.internal.f;
import com.google.android.gms.ads.eventattestation.internal.h;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class e extends f implements niz {
    private final nix a;

    public e(nix nix) {
        this.a = nix;
    }

    public final void a(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, d dVar) {
        this.a.a(new b(adRequestAttestationTokenRequestParcel, Binder.getCallingUid(), dVar));
    }

    public final void a(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, h hVar) {
        this.a.a(new d(impressionAttestationTokenRequestParcel, Binder.getCallingUid(), hVar));
    }

    public final void a(com.google.android.gms.ads.eventattestation.internal.e eVar) {
        this.a.a(new c(eVar));
    }
}
