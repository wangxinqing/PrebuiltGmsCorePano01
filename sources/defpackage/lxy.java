package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import java.util.Set;

/* renamed from: lxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxy extends irf {
    final /* synthetic */ DroidGuardChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lxy(DroidGuardChimeraService droidGuardChimeraService, Context context) {
        super(context, 25, new int[0]);
        this.a = droidGuardChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return DroidGuardChimeraService.a;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        if (axet.b()) {
            DroidGuardChimeraService droidGuardChimeraService = this.a;
            anax anax = DroidGuardChimeraService.a;
            if (droidGuardChimeraService.c != null) {
                try {
                    droidGuardChimeraService.d.execute(new lxx(this));
                } catch (RuntimeException e) {
                    this.a.e.a((Throwable) e);
                }
            }
        }
        isv.a(0, (IBinder) new mab(this.a, getServiceRequest.d), (Bundle) null);
    }
}
