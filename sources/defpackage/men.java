package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: men  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class men extends mff {
    final /* synthetic */ acwd a;

    public men(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        if (status.c()) {
            ihd.a(status, updateActivityControlsSettingsInternalResult.a, this.a);
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
