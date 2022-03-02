package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;

/* renamed from: meo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class meo extends mff {
    final /* synthetic */ acwd a;

    public meo(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        if (status.c()) {
            ihd.a(status, syncActivityControlsSettingsInternalResult.a, this.a);
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
