package defpackage;

import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.pano.SystemUpdateTvMainChimeraActivity;

/* renamed from: adoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adoo implements Runnable {
    private final SystemUpdateStatus a;
    private final SystemUpdateTvMainChimeraActivity b;

    public adoo(SystemUpdateStatus systemUpdateStatus, SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity) {
        this.a = systemUpdateStatus;
        this.b = systemUpdateTvMainChimeraActivity;
    }

    public final void run() {
        SystemUpdateStatus systemUpdateStatus = this.a;
        SystemUpdateTvMainChimeraActivity systemUpdateTvMainChimeraActivity = this.b;
        iwd iwd = SystemUpdateTvMainChimeraActivity.a;
        String valueOf = String.valueOf(String.format("0x%03X.", new Object[]{Integer.valueOf(systemUpdateStatus.c)}));
        iwd.a(valueOf.length() == 0 ? new String("Received system update status = ") : "Received system update status = ".concat(valueOf), new Object[0]);
        systemUpdateTvMainChimeraActivity.c = true;
        systemUpdateTvMainChimeraActivity.a(systemUpdateStatus);
    }
}
