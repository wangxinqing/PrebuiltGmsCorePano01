package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgo extends key {
    public static final ith f = new ith("QueryOperation", "");
    private final QueryRequest g;

    public kgo(kec kec, QueryRequest queryRequest, kwg kwg) {
        super("QueryOperation", kec, kwg, 16, false);
        this.g = queryRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        Set set;
        njc.a((Object) this.g, "Invalid query request: no request");
        Query query = this.g.a;
        njc.a((Object) query, "Invalid query request: no query");
        if (!this.a.f()) {
            query.a();
            if (!query.a().isEmpty() || query.e || query.g || ljg.a((Filter) query.a)) {
                throw new nja(10, "Invalid query parameters.");
            }
        }
        Query a = this.a.a(query);
        kgn kgn = new kgn(this, a);
        kec kec = this.a;
        if (!a.e) {
            set = anfv.a;
        } else {
            set = Collections.singleton(((kyl) lce.a).a);
        }
        kec.a(a, set, (kwj) null, kgn);
    }
}
