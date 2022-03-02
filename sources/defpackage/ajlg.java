package defpackage;

import android.content.Context;
import com.google.android.location.reporting.service.DispatchingChimeraService;

/* renamed from: ajlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajlg implements Runnable {
    private final DispatchingChimeraService a;

    public ajlg(DispatchingChimeraService dispatchingChimeraService) {
        this.a = dispatchingChimeraService;
    }

    public final void run() {
        DispatchingChimeraService dispatchingChimeraService = this.a;
        dispatchingChimeraService.b = ajme.a((Context) dispatchingChimeraService, (ajmb) dispatchingChimeraService);
    }
}
