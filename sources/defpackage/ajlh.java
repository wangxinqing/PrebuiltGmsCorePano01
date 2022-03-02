package defpackage;

import android.content.Intent;
import com.google.android.location.reporting.service.DispatchingChimeraService;

/* renamed from: ajlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajlh implements Runnable {
    private final DispatchingChimeraService a;
    private final int b;
    private final Intent c;

    public ajlh(DispatchingChimeraService dispatchingChimeraService, int i, Intent intent) {
        this.a = dispatchingChimeraService;
        this.b = i;
        this.c = intent;
    }

    public final void run() {
        DispatchingChimeraService dispatchingChimeraService = this.a;
        int i = this.b;
        Intent intent = this.c;
        ajme ajme = dispatchingChimeraService.b;
        if (ajme == null) {
            dispatchingChimeraService.stopSelf(i);
        } else {
            ajme.a(intent, i);
        }
    }
}
