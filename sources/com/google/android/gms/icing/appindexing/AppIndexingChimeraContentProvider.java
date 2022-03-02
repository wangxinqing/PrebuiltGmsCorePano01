package com.google.android.gms.icing.appindexing;

import android.content.Context;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppIndexingChimeraContentProvider extends pli {
    private prm a;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0119, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r1 != null) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(android.net.Uri r22, java.lang.String[] r23) {
        /*
            r21 = this;
            r0 = r22
            android.content.Context r1 = r21.getContext()
            oxe r1 = defpackage.oxv.a(r1, r0)
            r2 = 0
            if (r1 == 0) goto L_0x014c
            dum r3 = defpackage.dum.a(r23)
            java.lang.String r4 = "AppIndexing: Queried by ContentFetcher uri=%s query=%s"
            defpackage.oso.d(r4, r0, r3)
            java.lang.String r4 = r1.b
            android.content.Context r5 = r21.getContext()
            android.content.Context r5 = r5.getApplicationContext()
            ovw r5 = defpackage.ovw.a((android.content.Context) r5, (java.lang.String) r4)
            if (r5 != 0) goto L_0x002c
            java.lang.String r1 = "3P AppIndexing disabled for uri %s"
            defpackage.oso.a((java.lang.String) r1, (java.lang.Object) r0)
            return r2
        L_0x002c:
            boolean r6 = r3.c()
            r7 = 0
            if (r6 == 0) goto L_0x007e
            java.lang.String r6 = "Request to rebuild index for uri %s"
            defpackage.oso.a((java.lang.String) r6, (java.lang.Object) r0)
            android.content.Context r0 = r21.getContext()     // Catch:{ NameNotFoundException -> 0x0077 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0077 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x0077 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r0.lastUpdateTime
            long r8 = r8 - r10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r6.convert(r8, r0)
            r10 = 24
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x007e
            agvx r0 = defpackage.ozx.aL
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "UPDATE_INDEX intent sending from content provider disabled."
            defpackage.oso.a(r0)
            goto L_0x007e
        L_0x006d:
            android.content.Context r0 = r21.getContext()
            aomb r6 = defpackage.aomb.ONE_OFF_REASON_REBUILD
            com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService.a((android.content.Context) r0, (java.lang.String) r4, (defpackage.aomb) r6)
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r0 = "Package %s is not present."
            defpackage.oso.a((java.lang.String) r0, (java.lang.Object) r4)
            return r2
        L_0x007e:
            boolean r0 = r3.a()
            r4 = 1
            if (r0 != 0) goto L_0x0094
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x008d
            r0 = 2
            goto L_0x0095
        L_0x008d:
            java.lang.String r0 = "Invalid query: %s"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r3)
            return r2
        L_0x0094:
            r0 = 1
        L_0x0095:
            long r8 = r3.a
            long r10 = r3.b
            android.database.sqlite.SQLiteDatabase r3 = r5.getReadableDatabase()
            if (r0 == r4) goto L_0x00a2
            java.lang.String r0 = " IS NOT NULL"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r0 = " IS NULL"
        L_0x00a4:
            java.lang.String r5 = "tag"
            int r6 = r0.length()
            if (r6 != 0) goto L_0x00b2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r0 = r5.concat(r0)
        L_0x00b6:
            java.lang.String r5 = r1.a()
            java.lang.String r13 = defpackage.oyc.a((java.lang.String) r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 31
            r6.<init>(r5)
            java.lang.String r5 = "seqno>"
            r6.append(r5)
            r6.append(r8)
            java.lang.String r5 = " AND "
            r6.append(r5)
            r6.append(r0)
            r14 = 0
            java.lang.String r15 = r6.toString()
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r20 = java.lang.Long.toString(r10)
            java.lang.String r19 = "seqno"
            r12 = r3
            android.database.Cursor r0 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r1.b
            java.lang.String[] r14 = new java.lang.String[r4]
            java.lang.String r5 = "incarnation"
            r14[r7] = r5
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r7] = r1
            r19 = 0
            java.lang.String r13 = "incarnation_indexapi"
            java.lang.String r15 = "app_name = ?"
            r16 = r4
            android.database.Cursor r1 = r12.query(r13, r14, r15, r16, r17, r18, r19)
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x011c
            int r2 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x0123
            goto L_0x011e
        L_0x011c:
            if (r1 == 0) goto L_0x0122
        L_0x011e:
            r1.close()
            goto L_0x0123
        L_0x0122:
        L_0x0123:
            if (r2 == 0) goto L_0x012a
            android.database.Cursor r0 = defpackage.dun.a(r0, r2)
            goto L_0x012b
        L_0x012a:
        L_0x012b:
            int r1 = r0.getCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = defpackage.dun.a(r0)
            java.lang.String r3 = "Returning document cursor with %d rows. Incarnation %s."
            defpackage.oso.d(r3, r1, r2)
            return r0
        L_0x013e:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x014b
            r1.close()     // Catch:{ all -> 0x0146 }
            goto L_0x014b
        L_0x0146:
            r0 = move-exception
            r1 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r1)
        L_0x014b:
            throw r2
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.appindexing.AppIndexingChimeraContentProvider.a(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (getContext() != null && a() != null) {
            pxd.a(getContext(), printWriter, strArr, a());
        }
    }

    public final String a(Uri uri) {
        oxe a2 = oxv.a(getContext(), uri);
        if (a2 == null) {
            return null;
        }
        String valueOf = String.valueOf(a2.a.b);
        return valueOf.length() == 0 ? new String("vnd.android.cursor.dir/vnd.") : "vnd.android.cursor.dir/vnd.".concat(valueOf);
    }

    /* access modifiers changed from: package-private */
    public final osf a() {
        prm prm = this.a;
        if (prm == null) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext != null && axsd.f()) {
                this.a = prm.a("main", applicationContext);
            }
            prm = this.a;
            if (prm == null) {
                return null;
            }
        }
        return prm.b();
    }
}
