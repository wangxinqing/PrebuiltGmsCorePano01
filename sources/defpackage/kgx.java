package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgx extends kez {
    private final QueryRequest f;
    private final kwj g;

    public kgx(kec kec, QueryRequest queryRequest, kwj kwj, kwg kwg) {
        super("StartLiveQueryOperation", kec, kwg, 52);
        this.f = queryRequest;
        this.g = kwj;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void d(Context context) {
        njc.a((Object) this.f, "Invalid query request: no request");
        njc.a((Object) this.f.a, "Invalid query request: no query");
        Query a = this.a.a(this.f.a);
        this.a.a(a, Collections.singleton(((kyl) lce.a).a), this.g, (kgn) null);
        this.b.b();
    }
}
