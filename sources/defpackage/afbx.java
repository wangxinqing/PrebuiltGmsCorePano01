package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: afbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afbx implements afdl {
    private final awdn a;

    public afbx(awdn awdn) {
        this.a = awdn;
    }

    public final void a() {
        for (Integer num : new TreeSet(((Map) this.a.a()).keySet())) {
            ((afdl) ((Map) this.a.a()).get(num)).a();
        }
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        for (Integer num : new TreeSet(((Map) this.a.a()).keySet())) {
            ((afdl) ((Map) this.a.a()).get(num)).a(sQLiteDatabase);
        }
    }
}
