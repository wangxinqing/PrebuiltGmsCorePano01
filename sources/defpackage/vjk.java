package defpackage;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: vjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjk implements Runnable {
    private final NearbySharingChimeraService a;
    private final PowerManager b;
    private final KeyguardManager c;

    public vjk(NearbySharingChimeraService nearbySharingChimeraService, PowerManager powerManager, KeyguardManager keyguardManager) {
        this.a = nearbySharingChimeraService;
        this.b = powerManager;
        this.c = keyguardManager;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        PowerManager powerManager = this.b;
        KeyguardManager keyguardManager = this.c;
        boolean z = false;
        if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
            z = true;
        }
        nearbySharingChimeraService.a(z);
    }
}
