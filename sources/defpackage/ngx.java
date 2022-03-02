package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: ngx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngx {
    final hph a;
    final boolean b;
    private final Context c = ihs.b();

    public ngx() {
        hol hol = new hol(this.c, "GMSCORE_API_COUNTERS", (String) null);
        hol.a(avsd.UNMETERED_OR_DAILY);
        hph hph = new hph(hol, hol.g, 100);
        this.a = hph;
        hph.a();
        this.b = awxc.a.a().a();
    }

    public final void a(Status status) {
        if (this.b) {
            this.a.d("132-FontsProvider").a(status.i);
            this.a.d();
        }
    }
}
