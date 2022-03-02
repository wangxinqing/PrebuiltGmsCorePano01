package defpackage;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: accz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class accz implements Runnable {
    private final TargetChimeraActivity a;
    private final Bundle b;

    public accz(TargetChimeraActivity targetChimeraActivity, Bundle bundle) {
        this.a = targetChimeraActivity;
        this.b = bundle;
    }

    public final void run() {
        TargetChimeraActivity targetChimeraActivity = this.a;
        Bundle bundle = this.b;
        if (!targetChimeraActivity.d.isEmpty()) {
            targetChimeraActivity.a(false);
        } else {
            targetChimeraActivity.a(bundle);
        }
    }
}
