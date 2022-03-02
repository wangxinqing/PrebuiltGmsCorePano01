package defpackage;

import android.content.Context;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgr extends key {
    private final kwj f;

    public kgr(kec kec, kwj kwj, kwg kwg) {
        super("RemoveQueryResultListenerOperation", kec, kwg, 53);
        this.f = kwj;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid RemoveQueryResultListenerRequest: no callback");
        this.a.l.a(this.f);
        this.b.b();
    }
}
