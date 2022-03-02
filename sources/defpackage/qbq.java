package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* renamed from: qbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbq implements njb {
    private final amry a;
    private final HashMap b = new HashMap();

    private qbq(amry amry) {
        this.a = amry;
    }

    public static void a(nix nix, amry amry) {
        qbq qbq = new qbq(amry);
        nix.f = amzy.a((Object) qbq);
        nix.g = amzy.a((Object) qbq);
    }

    public final void a() {
        this.b.clear();
    }

    public final void a(nis nis) {
        this.b.put(nis, Long.valueOf(System.currentTimeMillis()));
    }

    public final void a(nis nis, Status status) {
        if (this.b.containsKey(nis)) {
            Long l = (Long) this.b.get(nis);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            this.a.a(new qbr(l.longValue(), valueOf.longValue(), valueOf.longValue() - l.longValue(), status, nis));
            this.b.remove(nis);
        }
    }
}
