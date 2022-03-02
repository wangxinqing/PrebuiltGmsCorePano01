package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: adak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adak extends aczh {
    private static final anij c = addh.b();
    private final atvp d;

    public adak(atvp atvp, mfa mfa, addq addq) {
        super("WriteDeviceLevelSettingsOperation", mfa, addq);
        this.d = atvp;
    }

    public final void a(Context context) {
        c.d().a("adak", "a", 36, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        if (this.b.a()) {
            this.b.a(this.d);
        }
        this.a.a(Status.a);
        c.d().a("adak", "a", 44, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' successful!", (Object) this.m);
    }

    public final void a(Status status) {
        this.a.a(status);
        c.c().a("adak", "a", 51, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' failed with status '%d'!", (Object) this.m, status.i);
    }
}
