package defpackage;

import com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService;

/* renamed from: usc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class usc implements ulk {
    private final NfcAdvertisingChimeraService a;
    private final usa b;

    public usc(NfcAdvertisingChimeraService nfcAdvertisingChimeraService, usa usa) {
        this.a = nfcAdvertisingChimeraService;
        this.b = usa;
    }

    public final void a() {
        NfcAdvertisingChimeraService nfcAdvertisingChimeraService = this.a;
        if (nfcAdvertisingChimeraService.a == this.b) {
            nfcAdvertisingChimeraService.a = null;
        }
    }
}
