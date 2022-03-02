package defpackage;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: vjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjv implements Runnable {
    private final NearbySharingChimeraService.AnonymousClass2 a;
    private final PowerManager b;
    private final KeyguardManager c;

    public vjv(NearbySharingChimeraService.AnonymousClass2 r1, PowerManager powerManager, KeyguardManager keyguardManager) {
        this.a = r1;
        this.b = powerManager;
        this.c = keyguardManager;
    }

    public final void run() {
        NearbySharingChimeraService.AnonymousClass2 r0 = this.a;
        PowerManager powerManager = this.b;
        KeyguardManager keyguardManager = this.c;
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        boolean z = false;
        if (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked()) {
            z = true;
        }
        Charset charset = NearbySharingChimeraService.a;
        nearbySharingChimeraService.a(z);
    }
}
