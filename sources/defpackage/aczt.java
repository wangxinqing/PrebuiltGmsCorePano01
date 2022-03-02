package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import java.util.concurrent.Executor;

/* renamed from: aczt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczt extends aczj {
    private static final anij k = addh.b();
    private final aekn l;
    private long o;

    public aczt(mfa mfa, ClientContext clientContext, adev adev, aful aful, Executor executor, FacsCacheCallOptions facsCacheCallOptions, adde adde, agos agos, aekn aekn, mep mep) {
        super("ForceSettingsCacheRefreshOperation", mfa, clientContext, adev, aful, executor, facsCacheCallOptions, adde, agos, 1006, mep);
        this.l = aekn;
    }

    private final byte[] d() {
        k.d().a("aczt", "d", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
        return (byte[]) a(this.i.a(new FacsInternalSyncCallOptions(true)));
    }

    public final void a(Context context) {
        byte[] bArr;
        k.d().a("aczt", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        this.o = this.l.b();
        a();
        a(azrk.a.a().w());
        this.h.a();
        if (!azrk.g()) {
            bArr = a(adeu.FORCED).k();
        } else {
            k.d().a("aczt", "d", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
            bArr = (byte[]) a(this.i.a(new FacsInternalSyncCallOptions(true)));
        }
        a(Status.a.i, this.l.b() - this.o);
        this.a.a(Status.a, new ForceSettingsCacheRefreshResult(bArr));
    }

    public final void a(Status status) {
        a(status.i, this.l.b() - this.o);
        this.a.a(status, (ForceSettingsCacheRefreshResult) null);
    }
}
