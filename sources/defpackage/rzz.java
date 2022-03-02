package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rzz {
    public final List a = new ArrayList();
    public boolean b;
    public final acwd c;
    final /* synthetic */ sac d;
    private final sab e;

    public rzz(sac sac, acwd acwd, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        this.d = sac;
        this.c = acwd;
        this.e = new sab(sac, syncPolicy, latestFootprintFilter);
    }

    public final void a() {
        this.b = true;
        this.d.c.b((ihb) this.e).a(this.d.a, (acvp) new rzy(this));
    }
}
