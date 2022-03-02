package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: med  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class med extends mez {
    final /* synthetic */ acwd a;

    public med(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        if (status.c()) {
            try {
                ihd.a(status, (atxj) aucj.a((aucj) atxj.b, updateActivityControlsSettingsResult.a), this.a);
            } catch (auda e) {
                this.a.a((Exception) e);
            }
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
