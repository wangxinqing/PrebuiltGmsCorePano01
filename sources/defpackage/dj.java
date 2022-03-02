package defpackage;

import android.database.DatabaseErrorHandler;

/* renamed from: dj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dj implements DatabaseErrorHandler {
    final /* synthetic */ di[] a;

    public dj(di[] diVarArr) {
        this.a = diVarArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r3) {
        /*
            r2 = this;
            di[] r0 = r2.a
            di r3 = defpackage.dk.a(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Corruption reported by sqlite on database: "
            r0.append(r1)
            java.lang.String r1 = r3.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.e(r1, r0)
            boolean r0 = r3.e()
            if (r0 == 0) goto L_0x007c
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.a     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
            java.util.List r0 = r1.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r1 = move-exception
            goto L_0x0036
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            r3.close()     // Catch:{ IOException -> 0x0058, all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r1 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x0050
            java.util.Iterator r3 = r0.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            defpackage.db.a((java.lang.String) r0)
            goto L_0x003c
        L_0x0050:
            java.lang.String r3 = r3.f()
            defpackage.db.a((java.lang.String) r3)
        L_0x0057:
            throw r1
        L_0x0058:
            r1 = move-exception
        L_0x0059:
            if (r0 == 0) goto L_0x0074
            java.util.Iterator r3 = r0.iterator()
        L_0x005f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r3.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            defpackage.db.a((java.lang.String) r0)
            goto L_0x005f
        L_0x0073:
            return
        L_0x0074:
            java.lang.String r3 = r3.f()
            defpackage.db.a((java.lang.String) r3)
            return
        L_0x007c:
            java.lang.String r3 = r3.f()
            defpackage.db.a((java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
