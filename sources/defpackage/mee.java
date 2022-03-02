package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;

/* renamed from: mee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mee extends mez {
    final /* synthetic */ acwd a;

    public mee(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        if (status.c()) {
            try {
                ihd.a(status, (atwh) aucj.a((aucj) atwh.d, getActivityControlsSettingsResult.a), this.a);
            } catch (auda e) {
                this.a.a((Exception) e);
            }
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
