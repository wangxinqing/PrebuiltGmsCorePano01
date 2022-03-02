package defpackage;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: liq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class liq {
    public SortOrder a;
    public List b = Collections.emptyList();
    public boolean c;
    public Set d = Collections.emptySet();
    private final List e = new ArrayList();
    private String f;
    private boolean g;

    public liq() {
    }

    public final Query a() {
        LogicalFilter logicalFilter = new LogicalFilter(Operator.f, (Iterable) this.e);
        String str = this.f;
        SortOrder sortOrder = this.a;
        List list = this.b;
        boolean z = this.c;
        Set set = this.d;
        return new Query(logicalFilter, str, sortOrder, list, z, new ArrayList(set), this.g);
    }

    public final void a(Filter filter) {
        iva.a((Object) filter, (Object) "Filter may not be null.");
        if (!(filter instanceof MatchAllFilter)) {
            this.e.add(filter);
        }
    }

    public liq(Query query) {
        this.e.add(query.a);
        this.f = query.b;
        this.a = query.c;
        this.b = query.d;
        this.c = query.e;
        query.a();
        this.d = query.a();
        this.g = query.g;
    }
}
