package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* renamed from: hdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdr extends bkj {
    private static final LifecycleSynchronizer b = new hdo();
    private LifecycleSynchronizer c = b;

    /* access modifiers changed from: protected */
    public final BoundService a(Context context, String str) {
        BoundService a = super.a(context, str);
        if (a != null) {
            return new hdq(a);
        }
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final void a(BoundService boundService, Context context) {
        BoundService boundService2;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            context = new hdp(this, context);
        }
        if (boundService instanceof hdq) {
            boundService2 = ((hdq) boundService).a;
            boundService2.setModuleContext(context);
        } else {
            boundService2 = boundService;
        }
        boundService.setModuleContext(context);
        if (boundService2 instanceof ILifecycleSynchronizerRequired) {
            ILifecycleSynchronizerRequired iLifecycleSynchronizerRequired = (ILifecycleSynchronizerRequired) boundService2;
            if (this.c == b && !jhg.c()) {
                this.c = new LifecycleSynchronizer(this);
            }
            iLifecycleSynchronizerRequired.setLifecycleSynchronizer(this.c);
        }
    }
}
