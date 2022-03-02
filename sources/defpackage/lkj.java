package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.io.File;
import java.util.HashSet;

/* renamed from: lkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkj {
    private static final ith a = new ith("RealtimeCacheCleanup", "");

    /* JADX INFO: finally extract failed */
    public static void a(Context context, kkf kkf) {
        a.a("RealtimeCacheCleanup", "Beginning Realtime garbage collection.");
        String[] strArr = {kph.DATABASE_NAME.n.a()};
        HashSet hashSet = new HashSet();
        Cursor a2 = ((kjp) kkf).a.a(kpi.a.b(), strArr, (kqy) null, (String) null);
        while (a2.moveToNext()) {
            try {
                hashSet.add(a2.getString(0));
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        lki lki = new lki(hashSet);
        lni.a(context, lsm.a());
        File[] listFiles = lkb.a(context).listFiles(lki);
        if (listFiles != null) {
            for (File file : listFiles) {
                a.a("RealtimeCacheCleanup", "Deleting Realtime cache database: %s", file.getName());
                file.delete();
            }
            a.a("RealtimeCacheCleanup", "Finished Realtime garbage collection.");
            return;
        }
        a.a("RealtimeCacheCleanup", "Realtime database directory does not exist; no need to clean up.");
    }
}
