package defpackage;

import android.database.SQLException;

/* renamed from: ktd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ktd {
    private static final ith a = new ith("PersistedEventStore", "");

    public static void a(kkb kkb, long j, String str) {
        if (str != null) {
            new kow(kkb, j, str).t();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j) {
        kov a2 = a(j);
        if (a2 == null) {
            a.b("PersistedEventStore", "Trying to delete an already deleted PersistedEvent");
            return false;
        }
        try {
            a2.u();
            return true;
        } catch (SQLException e) {
            a.c("PersistedEventStore", "Error deleting PersistedEvent", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final kov a(long j) {
        return lsm.a().d.h(j);
    }
}
