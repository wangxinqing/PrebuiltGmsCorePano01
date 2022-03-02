package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: iut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iut implements ice {
    final /* synthetic */ icf a;
    final /* synthetic */ acwd b;
    final /* synthetic */ iuw c;

    public iut(icf icf, acwd acwd, iuw iuw) {
        this.a = icf;
        this.b = acwd;
        this.c = iuw;
    }

    public final void a(Status status) {
        if (status.c()) {
            this.b.a(this.c.a(this.a.a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.a((Exception) irj.a(status));
    }
}
