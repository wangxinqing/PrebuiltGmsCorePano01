package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: afdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdg {
    public final Set a;
    public final awdn b;
    private final afbx c;
    private final aeri d;

    public afdg(aeri aeri, Set set, afbx afbx, awdn awdn) {
        this.d = aeri;
        this.a = set;
        this.c = afbx;
        this.b = awdn;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        ((pia) this.b.a()).c("Creating database v%d", 2);
        if (!this.d.f()) {
            this.c.a(sQLiteDatabase);
        }
        for (afdf a2 : this.a) {
            a2.a(sQLiteDatabase);
        }
    }
}
