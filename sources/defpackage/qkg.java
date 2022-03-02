package defpackage;

import android.app.InstantAppResolverService;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.Collections;

/* renamed from: qkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkg extends InstantAppResolverService {
    public final qkc a;
    private final qkn b;
    private final qld c;
    private final qlg d;
    private final qex e;
    private Handler f;
    private HandlerThread g;

    public qkg(qkc qkc, qkn qkn, qld qld, qlg qlg, qex qex) {
        this.a = qkc;
        this.b = qkn;
        this.c = qld;
        this.d = qlg;
        this.e = qex;
    }

    public final void onGetInstantAppIntentFilter(int[] iArr, String str, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        Log.e("InstantAppResolver", "2nd phase resolution not yet supported.");
        this.e.a().a("InstantAppResolverService.secondPhaseAttempted");
        instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
    }

    public final void onGetInstantAppResolveInfo(int[] iArr, String str, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        if (!axuy.c() || !this.c.a()) {
            Log.w("InstantAppResolver", "Instant App routing requested but is disabled by flag.");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
            return;
        }
        qev a2 = this.e.a();
        if (!this.b.a()) {
            a2.a("InstantAppResolverService.cannotDownloadInstantApp");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
        } else if (this.d.a() == 0 || this.d.a() == 3) {
            a2.a("InstantAppResolverService.notOptedInAndDontShowPrompt");
            instantAppResolutionCallback.onInstantAppResolveInfo(Collections.emptyList());
        } else {
            if (this.f == null) {
                HandlerThread handlerThread = new HandlerThread("resolverServiceThread");
                this.g = handlerThread;
                handlerThread.start();
                this.f = new qvr(this.g.getLooper());
            }
            this.f.post(new qkf(this, iArr, a2, instantAppResolutionCallback));
        }
    }

    public final boolean onUnbind(Intent intent) {
        this.g.quit();
        this.g = null;
        this.f = null;
        return qkg.super.onUnbind(intent);
    }
}
