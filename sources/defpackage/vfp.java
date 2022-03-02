package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfp extends qvy {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfp(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.a = nearbyMessagesChimeraService;
    }

    public final void a(ComponentName componentName) {
        jjg jjg = tgc.a;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        this.a.h.a(ased.class, (Object) asec.a(iBinder));
        ((vav) this.a.h.a(vav.class)).d();
        jjg jjg = tgc.a;
        this.a.e.countDown();
    }
}
