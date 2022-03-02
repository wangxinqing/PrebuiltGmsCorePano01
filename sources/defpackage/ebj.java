package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;

/* renamed from: ebj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebj implements hcy {
    private final ebi a;

    public ebj(ebi ebi) {
        this.a = ebi;
    }

    public final /* bridge */ /* synthetic */ void a(hdd hdd) {
        AppStateIntentChimeraService appStateIntentChimeraService = (AppStateIntentChimeraService) hdd;
        if (eaw.b == null) {
            eaw.b = new eaw();
        }
        eaw eaw = eaw.b;
        try {
            SystemClock.elapsedRealtime();
            this.a.a(appStateIntentChimeraService, eaw);
            SystemClock.elapsedRealtime();
        } catch (eif e) {
            Log.e("AppStateIntentService", "Auth error executing an operation: ", e);
        } catch (Throwable th) {
            eaw.a();
            throw th;
        }
        eaw.a();
    }
}
