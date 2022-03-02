package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;

/* renamed from: mef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mef extends mez {
    final /* synthetic */ acwd a;

    public mef(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        if (status.c()) {
            try {
                ihd.a(status, (atvp) aucj.a((aucj) atvp.d, readDeviceLevelSettingsResult.a, aubs.c()), this.a);
            } catch (auda e) {
                this.a.a((Exception) e);
            }
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
