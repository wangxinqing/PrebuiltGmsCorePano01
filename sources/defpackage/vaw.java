package defpackage;

import android.os.Binder;
import com.google.android.gms.nearby.messages.debug.DebugPokeChimeraService;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: vaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vaw extends asnc {
    final /* synthetic */ DebugPokeChimeraService a;

    public vaw(DebugPokeChimeraService debugPokeChimeraService) {
        this.a = debugPokeChimeraService;
    }

    public final void a(DebugPokeRequest debugPokeRequest, asnb asnb) {
        jjg jjg = tgc.a;
        String nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
        jhg.c(this.a, nameForUid);
        DebugPokeChimeraService debugPokeChimeraService = this.a;
        if (!aynf.f() ? aync.c() || uxv.a(debugPokeChimeraService, nameForUid, aync.a.a().m()) : uxv.a(debugPokeChimeraService, nameForUid)) {
            try {
                this.a.a.await(2000, TimeUnit.MILLISECONDS);
                uwr uwr = (uwr) NearbyMessagesChimeraService.e().a(uwr.class);
                uwr.b.c(new uwq(uwr, "debugPoke", asnb, debugPokeRequest));
            } catch (InterruptedException e) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("vaw", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error waiting for NMS to initialize");
            }
        } else {
            String valueOf = String.valueOf(nameForUid);
            throw new SecurityException(valueOf.length() == 0 ? new String("DebugPokeService is not allowed for: ") : "DebugPokeService is not allowed for: ".concat(valueOf));
        }
    }
}
