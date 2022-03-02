package defpackage;

import android.content.pm.PackageManager;
import android.os.Process;

/* renamed from: ixl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ixl implements PackageManager.OnPermissionsChangedListener {
    final /* synthetic */ ixm a;

    public ixl(ixm ixm) {
        this.a = ixm;
    }

    public final void onPermissionsChanged(int i) {
        if (Process.myUid() == i) {
            this.a.b();
        }
    }
}
