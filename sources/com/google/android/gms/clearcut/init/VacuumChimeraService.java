package com.google.android.gms.clearcut.init;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VacuumChimeraService extends qwf {
    public static void b() {
        Log.i("VacuumService", "Turn off VacuumService");
        qwq.a((Context) ihs.b()).a("VacuumService", "com.google.android.gms.clearcut.service.VacuumService");
    }

    public final int a(qxz qxz) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String str = qxz.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append("Vacuum at: now=");
        sb.append(currentTimeMillis);
        sb.append(" tag=");
        sb.append(str);
        Log.i("VacuumService", sb.toString());
        if (awtf.h() == 0) {
            b();
            return 0;
        }
        hvk c = hvk.c();
        try {
            c.d();
            amzt j = amzy.j();
            if (!(c.b == null || c.b.a == null)) {
                j.c(c.b.a.getWritableDatabase());
            }
            if (!(c.c == null || c.c.a == null)) {
                j.c(c.c.a.getWritableDatabase());
            }
            anhk i = j.a().listIterator();
            z = true;
            while (i.hasNext()) {
                ((SQLiteDatabase) i.next()).execSQL("VACUUM");
            }
            if (c != null) {
                c.close();
            }
            if (!z) {
                return 2;
            }
            return 0;
        } catch (RuntimeException e) {
            Log.w("VacuumService", "Could not vacuum the database", e);
            z = false;
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
    }
}
