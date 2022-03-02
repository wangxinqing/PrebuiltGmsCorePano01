package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgt extends key {
    public static final ith f = new ith("RequestSyncOperation", "");
    private final ley g;

    public kgt(kec kec, kwg kwg, ley ley) {
        super("RequestSyncOperation", kec, kwg, 18, false);
        this.g = ley;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        int i;
        kgs kgs = new kgs(this);
        kec kec = this.a;
        String str = kec.d.a.a;
        if (!kec.f()) {
            i = 100;
        } else {
            i = 103;
        }
        int a = this.g.a(str, i, 1, Collections.singletonList(b().c.b));
        if (a == 0 || a == 1) {
            this.g.a(str, (lev) kgs);
        } else if (a == 2) {
            throw new nja(1507, "Sync request rate limit exceeded.");
        } else if (a != 3) {
            throw new nja(8, "Internal error while requesting sync.");
        } else {
            throw new nja(7, "Cannot request a sync while the device is offline.");
        }
    }
}
