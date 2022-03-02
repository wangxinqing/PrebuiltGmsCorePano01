package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.service.chooser.ChooserTargetService;
import java.util.List;

/* renamed from: bja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bja extends ChooserTargetService {
    final /* synthetic */ com.google.android.chimera.ChooserTargetService a;

    public bja(com.google.android.chimera.ChooserTargetService chooserTargetService, Context context) {
        this.a = chooserTargetService;
        attachBaseContext(context);
    }

    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        return this.a.onGetChooserTargets(componentName, intentFilter);
    }
}
