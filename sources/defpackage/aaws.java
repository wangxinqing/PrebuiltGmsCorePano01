package defpackage;

import android.content.ComponentName;
import com.google.android.gms.security.snet.SnetChimeraService;
import com.google.android.gms.security.snet.SnetLaunchChimeraIntentService;
import com.google.android.gms.security.snet.SnetLaunchInProcessChimeraIntentService;
import com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService;
import java.util.ArrayList;

/* renamed from: aaws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaws implements Runnable {
    final /* synthetic */ SnetChimeraService a;

    public aaws(SnetChimeraService snetChimeraService) {
        this.a = snetChimeraService;
    }

    public final void run() {
        ComponentName componentName;
        try {
            this.a.a();
            if (this.a.c.a() || azfv.j()) {
                aarw aarw = aarw.b;
                this.a.b();
                if (azfv.p()) {
                    SnetChimeraService snetChimeraService = this.a;
                    componentName = SnetLaunchInProcessChimeraIntentService.a(snetChimeraService, snetChimeraService.d, snetChimeraService.f, snetChimeraService.h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR", aarw, snetChimeraService.i);
                } else {
                    SnetChimeraService snetChimeraService2 = this.a;
                    componentName = SnetLaunchChimeraIntentService.a(snetChimeraService2, (String) null, (String) null, 0, snetChimeraService2.d, snetChimeraService2.f, snetChimeraService2.h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR", (ArrayList) null, aarw, anfv.a, this.a.i);
                }
                if (componentName != null) {
                    SnetChimeraService snetChimeraService3 = this.a;
                    SnetWatchdogChimeraIntentService.a(snetChimeraService3, snetChimeraService3.d, snetChimeraService3.f, snetChimeraService3.h, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
                }
                this.a.a(false);
                return;
            }
            this.a.a(false);
        } catch (Throwable th) {
            this.a.a(false);
            throw th;
        }
    }
}
