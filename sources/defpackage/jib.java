package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: jib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jib implements Runnable {
    final /* synthetic */ jie a;

    public jib(jie jie) {
        this.a = jie;
    }

    public final void run() {
        synchronized (this.a.b) {
            jie jie = this.a;
            int i = jie.d;
            if (i > 0) {
                i--;
                jie.d = i;
            }
            SQLiteDatabase sQLiteDatabase = jie.c;
            if (sQLiteDatabase != null) {
                if (i == 0) {
                    if (sQLiteDatabase.isOpen()) {
                        jie.c.close();
                    }
                    jie.c = null;
                }
            }
        }
    }
}
