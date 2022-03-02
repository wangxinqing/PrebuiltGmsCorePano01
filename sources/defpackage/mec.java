package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;

/* renamed from: mec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mec extends mez {
    final /* synthetic */ acwd a;

    public mec(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        if (status.c()) {
            try {
                ihd.a(status, (atwh) aucj.a((aucj) atwh.d, forceSettingsCacheRefreshResult.a), this.a);
            } catch (auda e) {
                this.a.a((Exception) e);
            }
        } else {
            ihd.a(status, (Object) null, this.a);
        }
    }
}
