package defpackage;

import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: nzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzi {
    public static void a(jjj jjj) {
        try {
            jjj.close();
        } catch (SQLiteException e) {
            Log.e("gH_DatabaseUtil", "Sql error closing database", e);
        } catch (IllegalStateException e2) {
            Log.e("gH_DatabaseUtil", "Error closing database", e2);
        }
    }
}
