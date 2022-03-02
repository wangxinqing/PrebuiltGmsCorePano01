package defpackage;

import android.content.Context;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

/* renamed from: bjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjh extends HostApduService {
    final /* synthetic */ com.google.android.chimera.HostApduService a;

    public bjh(com.google.android.chimera.HostApduService hostApduService) {
        this.a = hostApduService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onDeactivated(int i) {
        this.a.onDeactivated(i);
    }

    public final byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        return this.a.processCommandApdu(bArr, bundle);
    }
}
