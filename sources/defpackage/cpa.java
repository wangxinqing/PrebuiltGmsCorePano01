package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* renamed from: cpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cpa implements cpb {
    static final cpb a = new cpa();

    private cpa() {
    }

    public final Object a(Object obj) {
        clo clo = cpe.a;
        return (List) cpe.a(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), cor.a);
    }
}
