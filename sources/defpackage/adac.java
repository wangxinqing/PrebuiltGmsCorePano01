package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;

/* renamed from: adac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adac extends aczh {
    private static final anij c = addh.b();

    public adac(mfa mfa, addq addq) {
        super("ReadDeviceLevelSettingsOperation", mfa, addq);
    }

    public final void a(Context context) {
        c.d().a("adac", "a", 29, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        this.a.a(Status.a, new ReadDeviceLevelSettingsResult((this.b.a() ? this.b.b() : atvp.d).k()));
        c.d().a("adac", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' successful!", (Object) this.m);
    }

    public final void a(Status status) {
        this.a.a(status, (ReadDeviceLevelSettingsResult) null);
        c.c().a("adac", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' failed with status '%d'!", (Object) this.m, status.i);
    }
}
