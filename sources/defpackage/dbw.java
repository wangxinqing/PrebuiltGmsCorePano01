package defpackage;

import java.util.List;

/* renamed from: dbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dbw implements ax {
    private final dch a;

    public dbw(dch dch) {
        this.a = dch;
    }

    public final void a(Object obj) {
        dch dch = this.a;
        List list = (List) obj;
        dbp dbp = dch.b;
        boolean z = !list.isEmpty();
        dbp.n = z;
        if (z && dbp.m == dbo.COMPACT) {
            dbp.a(dbp.u);
        }
        dch.setHasOptionsMenu(!list.isEmpty());
        dch.j = list;
        dch.getActivity().invalidateOptionsMenu();
    }
}
