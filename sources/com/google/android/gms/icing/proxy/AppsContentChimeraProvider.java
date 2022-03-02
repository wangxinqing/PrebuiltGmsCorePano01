package com.google.android.gms.icing.proxy;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppsContentChimeraProvider extends pli {
    private static final pod a = new pod();
    private static final String[] b = ((String[]) dul.a((Iterable) Arrays.asList(plp.a)).toArray(new String[0]));

    static {
        Uri.parse("content://com.google.android.gms.icing.proxy.apps");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(android.net.Uri r18, java.lang.String[] r19) {
        /*
            r17 = this;
            android.content.Context r0 = r17.getContext()
            plt r0 = defpackage.plt.a((android.content.Context) r0)
            if (r0 == 0) goto L_0x022e
            dum r2 = defpackage.dum.a(r19)
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x022c
            long r3 = r2.a
            long r5 = r2.b
            boolean r2 = r2.c()
            r7 = 2
            r8 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0098
            android.content.Context r2 = r0.a
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            amzy r2 = defpackage.plw.a((android.content.pm.PackageManager) r2)
            boolean r11 = r2.isEmpty()
            if (r11 != 0) goto L_0x0098
            long r11 = r0.e()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r2.size()
            r13.<init>(r14)
            anhk r14 = r2.listIterator()
        L_0x0043:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0087
            java.lang.Object r15 = r14.next()
            plv r15 = (defpackage.plv) r15
            long r11 = r11 + r8
            pln r16 = defpackage.pln.e
            aucd r1 = r16.o()
            java.lang.String r15 = r15.a
            boolean r8 = r1.c
            if (r8 == 0) goto L_0x0061
            r1.c()
            r1.c = r10
        L_0x0061:
            aucj r8 = r1.b
            pln r8 = (defpackage.pln) r8
            r15.getClass()
            int r9 = r8.a
            r9 = r9 | r7
            r8.a = r9
            r8.c = r15
            r15 = 1
            r8.b = r15
            r9 = r9 | r15
            r8.a = r9
            r9 = r9 | 4
            r8.a = r9
            r8.d = r11
            aucj r1 = r1.i()
            pln r1 = (defpackage.pln) r1
            r13.add(r1)
            r8 = 1
            goto L_0x0043
        L_0x0087:
            pnr r1 = r0.b
            java.util.List r2 = defpackage.plw.a((java.lang.Iterable) r2)
            r1.a((java.lang.Iterable) r2)
            pnr r1 = r0.b
            r1.a((java.util.List) r13)
            r0.a((long) r11)
        L_0x0098:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r2 = b
            r1.<init>(r2)
            pnr r0 = r0.b
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.String r9 = "getJournalEntries for lastSeqno = %d, limit = %d"
            defpackage.pnz.a((java.lang.String) r9, (java.lang.Object) r2, (java.lang.Object) r8)
            java.lang.Object r2 = defpackage.pnr.a
            monitor-enter(r2)
            java.util.List r0 = r0.a()     // Catch:{ all -> 0x0229 }
            r8 = 0
        L_0x00b6:
            int r9 = r0.size()     // Catch:{ all -> 0x0229 }
            if (r8 >= r9) goto L_0x00cb
            java.lang.Object r9 = r0.get(r8)     // Catch:{ all -> 0x0229 }
            pln r9 = (defpackage.pln) r9     // Catch:{ all -> 0x0229 }
            long r11 = r9.d     // Catch:{ all -> 0x0229 }
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00cb
            int r8 = r8 + 1
            goto L_0x00b6
        L_0x00cb:
            int r3 = r0.size()     // Catch:{ all -> 0x0229 }
            if (r8 < r3) goto L_0x00dc
            java.lang.String r0 = "Not found any entry"
            defpackage.pnz.a(r0)     // Catch:{ all -> 0x0229 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0229 }
            monitor-exit(r2)     // Catch:{ all -> 0x0229 }
            goto L_0x0112
        L_0x00dc:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0229 }
            r3.<init>()     // Catch:{ all -> 0x0229 }
            r4 = r8
            r13 = 0
        L_0x00e4:
            int r9 = r0.size()     // Catch:{ all -> 0x0229 }
            if (r4 < r9) goto L_0x00eb
            goto L_0x00fe
        L_0x00eb:
            int r9 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x00fe
            java.lang.Object r9 = r0.get(r4)     // Catch:{ all -> 0x0229 }
            pln r9 = (defpackage.pln) r9     // Catch:{ all -> 0x0229 }
            r3.add(r9)     // Catch:{ all -> 0x0229 }
            int r4 = r4 + 1
            r15 = 1
            long r13 = r13 + r15
            goto L_0x00e4
        L_0x00fe:
            java.lang.String r0 = "Returning Apps corpus docs [%d,%d]"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0229 }
            long r5 = (long) r8     // Catch:{ all -> 0x0229 }
            long r5 = r5 + r13
            r8 = -1
            long r5 = r5 + r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0229 }
            defpackage.pnz.a((java.lang.String) r0, (java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x0229 }
            monitor-exit(r2)     // Catch:{ all -> 0x0229 }
            r0 = r3
        L_0x0112:
            java.util.Iterator r0 = r0.iterator()
        L_0x0116:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0221
            java.lang.Object r2 = r0.next()
            pln r2 = (defpackage.pln) r2
            int r3 = r2.b
            int r3 = defpackage.plm.a(r3)
            if (r3 != 0) goto L_0x012c
            goto L_0x01ea
        L_0x012c:
            if (r3 != r7) goto L_0x01ea
            java.lang.String r3 = r2.c
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            if (r3 == 0) goto L_0x0143
            android.content.Context r4 = r17.getContext()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            plu r3 = defpackage.plw.a((android.content.pm.PackageManager) r4, (android.content.ComponentName) r3)
            goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            if (r3 == 0) goto L_0x01e7
            pod r4 = a
            android.content.ComponentName r5 = r3.c
            java.lang.String r5 = r5.getPackageName()
            java.security.MessageDigest r6 = r4.b
            r8 = -1
            if (r6 == 0) goto L_0x017e
            byte[] r5 = r5.getBytes()
            byte[] r5 = r6.digest(r5)
            r6 = 0
            r13 = 0
        L_0x015e:
            r9 = 8
            if (r6 >= r9) goto L_0x016d
            long r13 = r13 << r9
            byte r9 = r5[r6]
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r10 = (long) r9
            long r13 = r13 | r10
            int r6 = r6 + 1
            r10 = 0
            goto L_0x015e
        L_0x016d:
            r5 = 0
        L_0x016e:
            long[][] r6 = r4.c
            int r9 = r6.length
            if (r5 >= r9) goto L_0x017e
            r6 = r6[r5]
            int r6 = java.util.Arrays.binarySearch(r6, r13)
            if (r6 >= 0) goto L_0x017f
            int r5 = r5 + 1
            goto L_0x016e
        L_0x017e:
            r5 = -1
        L_0x017f:
            if (r5 == r8) goto L_0x0182
            goto L_0x0185
        L_0x0182:
            long[][] r4 = r4.c
            int r5 = r4.length
        L_0x0185:
            long[] r4 = defpackage.pod.a
            r5 = r4[r5]
            android.database.MatrixCursor$RowBuilder r4 = r1.newRow()
            long r8 = r2.d
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            android.database.MatrixCursor$RowBuilder r2 = r4.add(r2)
            java.lang.String r4 = "add"
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            java.lang.String r4 = r3.e
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            long r4 = r3.d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            java.lang.String r4 = r3.a
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            java.lang.String r4 = r3.b
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            android.content.ComponentName r4 = r3.c
            java.lang.String r4 = r4.getPackageName()
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            android.content.ComponentName r4 = r3.c
            java.lang.String r4 = r4.getClassName()
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            long r3 = r3.f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r3)
            java.lang.String r3 = ""
            r2.add(r3)
            r10 = 0
            goto L_0x0116
        L_0x01e7:
            r10 = 0
            goto L_0x0116
        L_0x01ea:
            int r3 = r2.b
            int r3 = defpackage.plm.a(r3)
            if (r3 == 0) goto L_0x021e
            r4 = 3
            if (r3 != r4) goto L_0x021e
            java.lang.String r3 = r2.c
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            if (r3 == 0) goto L_0x021b
            android.database.MatrixCursor$RowBuilder r4 = r1.newRow()
            long r5 = r2.d
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            android.database.MatrixCursor$RowBuilder r2 = r4.add(r2)
            java.lang.String r4 = "del"
            android.database.MatrixCursor$RowBuilder r2 = r2.add(r4)
            java.lang.String r3 = defpackage.plo.a((android.content.ComponentName) r3)
            r2.add(r3)
            r10 = 0
            goto L_0x0116
        L_0x021b:
            r10 = 0
            goto L_0x0116
        L_0x021e:
            r10 = 0
            goto L_0x0116
        L_0x0221:
            java.lang.String r0 = "-dummy-incarnation-"
            android.database.Cursor r0 = defpackage.dun.a(r1, r0)
            return r0
        L_0x0229:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0229 }
            throw r0
        L_0x022c:
            r0 = 0
            return r0
        L_0x022e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.proxy.AppsContentChimeraProvider.a(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }

    public final String a(Uri uri) {
        throw new UnsupportedOperationException();
    }
}
