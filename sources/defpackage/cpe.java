package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: cpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cpe implements coh, cpo {
    public static final clo a = clo.a("proto");
    public final coj b;
    private final cpk c;

    public cpe(coj coj, cpk cpk) {
        this.c = cpk;
        this.b = coj;
    }

    public static final Long a(SQLiteDatabase sQLiteDatabase, cmm cmm) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        cme cme = (cme) cmm;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{cme.a, String.valueOf(cpu.a(cme.c))}));
        if (cme.b != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(cme.b, 0));
        }
        return (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), cou.a);
    }

    private static String c(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((cok) it.next()).a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void close() {
        this.c.close();
    }

    public final int b() {
        return ((Integer) a((cpb) new com(System.currentTimeMillis() - this.b.d()))).intValue();
    }

    public final SQLiteDatabase c() {
        cpk cpk = this.c;
        cpk.getClass();
        return (SQLiteDatabase) a((cpd) new col(cpk), cot.a);
    }

    public final void b(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String valueOf = String.valueOf(c(iterable));
            c().compileStatement(valueOf.length() == 0 ? new String("DELETE FROM events WHERE _id in ") : "DELETE FROM events WHERE _id in ".concat(valueOf)).execute();
        }
    }

    public final Iterable c(cmm cmm) {
        return (Iterable) a((cpb) new coz(this, cmm));
    }

    public final boolean b(cmm cmm) {
        return ((Boolean) a((cpb) new cox(this, cmm))).booleanValue();
    }

    public static Object a(Cursor cursor, cpb cpb) {
        try {
            return cpb.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private final Object a(cpb cpb) {
        SQLiteDatabase c2 = c();
        c2.beginTransaction();
        try {
            Object a2 = cpb.a(c2);
            c2.setTransactionSuccessful();
            return a2;
        } finally {
            c2.endTransaction();
        }
    }

    private final Object a(cpd cpd, cpb cpb) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                return cpd.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (SystemClock.elapsedRealtime() >= ((long) this.b.c()) + elapsedRealtime) {
                    return cpb.a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final long a(cmm cmm) {
        return ((Long) a(c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{cmm.a(), String.valueOf(cpu.a(cmm.c()))}), cow.a)).longValue();
    }

    public final Iterable a() {
        return (Iterable) a(cpa.a);
    }

    public final Object a(cpn cpn) {
        SQLiteDatabase c2 = c();
        a((cpd) new cop(c2), coq.a);
        try {
            Object a2 = cpn.a();
            c2.setTransactionSuccessful();
            return a2;
        } finally {
            c2.endTransaction();
        }
    }

    public final void a(cmm cmm, long j) {
        a((cpb) new coy(j, cmm));
    }

    public final void a(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String valueOf = String.valueOf(c(iterable));
            a((cpb) new cov(valueOf.length() == 0 ? new String("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ") : "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(valueOf)));
        }
    }
}
