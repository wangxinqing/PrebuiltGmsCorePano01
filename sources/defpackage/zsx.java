package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zsx implements Callable {
    final /* synthetic */ zsz a;
    private final aqxw b;
    private final zsy c;

    public zsx(zsz zsz, aqxx aqxx, zsy zsy) {
        this.a = zsz;
        aucd aucd = (aucd) aqxx.c(5);
        aucd.a((aucj) aqxx);
        this.b = (aqxw) aucd;
        this.c = zsy;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return (defpackage.aqxx) r14.b.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0139, code lost:
        if (r2 == 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013c, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        if (r2 != 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0156, code lost:
        if (r14.a.b((long) r3.length) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015c, code lost:
        if (defpackage.azfa.g() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015e, code lost:
        r14.a.g.b("Dropping contact thumbnail due to size for contact %d", r14.c.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0170, code lost:
        r14.a.g.c("ReadContactsHelper", "Dropping contact thumbnail due to size for contact %d", r14.c.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
        r0 = r14.b;
        r1 = defpackage.auay.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0196, code lost:
        if (r0.c != false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0199, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019e, code lost:
        r2 = defpackage.aqxx.E;
        r1.getClass();
        ((defpackage.aqxx) r0.b).p = r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC, Splitter:B:57:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r14 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x01f3
            zsz r0 = r14.a
            monitor-enter(r0)
            long r1 = r0.f     // Catch:{ all -> 0x01f0 }
            long r3 = defpackage.azfa.n()     // Catch:{ all -> 0x01f0 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f0 }
            r0 = 2
            r5 = 1
            r6 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x01ba
            zsy r1 = r14.c
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0050
            boolean r1 = defpackage.azfa.b()
            if (r1 == 0) goto L_0x003b
            java.util.Set r1 = defpackage.zsz.c
            zsy r2 = r14.c
            java.lang.String r2 = r2.d
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0050
            aqxw r0 = r14.b
            aucj r0 = r0.i()
            aqxx r0 = (defpackage.aqxx) r0
            goto L_0x01ef
        L_0x003b:
            zsy r1 = r14.c
            java.lang.String r1 = r1.d
            boolean r1 = defpackage.aekr.a(r1)
            if (r1 != 0) goto L_0x0046
            goto L_0x0050
        L_0x0046:
            aqxw r0 = r14.b
            aucj r0 = r0.i()
            aqxx r0 = (defpackage.aqxx) r0
            goto L_0x01ef
        L_0x0050:
            azfa r1 = defpackage.azfa.a
            azfb r1 = r1.a()
            boolean r1 = r1.e()
            r2 = 0
            if (r1 == 0) goto L_0x00e9
            aqxw r1 = r14.b
            zsz r3 = r14.a
            zsy r4 = r14.c
            java.lang.Long r4 = r4.b
            long r7 = r4.longValue()
            android.content.Context r4 = r3.e
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r9 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r9, r7)
            java.lang.String r10 = "display_photo"
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r9, r10)
            java.lang.String r10 = "r"
            android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r9, r10)     // Catch:{ IOException -> 0x00bc, all -> 0x00ba }
            if (r4 == 0) goto L_0x00b2
            long r9 = r4.getLength()     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            boolean r9 = r3.b((long) r9)     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            if (r9 != 0) goto L_0x00a4
            zsg r3 = r3.g     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            r9[r6] = r7     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            java.lang.String r7 = "Dropping high res contact photo due to size for contact %d"
            r3.b(r7, r9)     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            byte[] r3 = defpackage.zsz.d     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            r4.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00c5
        L_0x00a2:
            r4 = move-exception
            goto L_0x00c5
        L_0x00a4:
            java.io.FileInputStream r3 = r4.createInputStream()     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            byte[] r3 = defpackage.jjt.a((java.io.InputStream) r3)     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            r4.close()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00c5
        L_0x00b0:
            r4 = move-exception
        L_0x00b1:
            goto L_0x00c5
        L_0x00b2:
            byte[] r3 = defpackage.zsz.d     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            goto L_0x00c5
        L_0x00b5:
            r0 = move-exception
            r2 = r4
            goto L_0x00e1
        L_0x00b8:
            r3 = move-exception
            goto L_0x00be
        L_0x00ba:
            r0 = move-exception
            goto L_0x00e1
        L_0x00bc:
            r3 = move-exception
            r4 = r2
        L_0x00be:
            byte[] r3 = defpackage.zsz.d     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00b1
            r4.close()     // Catch:{ IOException -> 0x00b0 }
        L_0x00c5:
            auay r3 = defpackage.auay.a((byte[]) r3)
            boolean r4 = r1.c
            if (r4 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r1.c()
            r1.c = r6
        L_0x00d3:
            aucj r1 = r1.b
            aqxx r1 = (defpackage.aqxx) r1
            aqxx r4 = defpackage.aqxx.E
            r3.getClass()
            r1.q = r3
            goto L_0x00e9
        L_0x00df:
            r0 = move-exception
            r2 = r4
        L_0x00e1:
            if (r2 == 0) goto L_0x00e8
            r2.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00e8
        L_0x00e7:
            r1 = move-exception
        L_0x00e8:
            throw r0
        L_0x00e9:
            aqxw r1 = r14.b
            aucj r1 = r1.b
            aqxx r1 = (defpackage.aqxx) r1
            auay r1 = r1.q
            int r1 = r1.a()
            if (r1 != 0) goto L_0x01b1
            zsz r1 = r14.a
            zsy r3 = r14.c
            java.lang.Long r3 = r3.b
            long r3 = r3.longValue()
            android.content.Context r7 = r1.e
            android.content.ContentResolver r8 = r7.getContentResolver()
            android.net.Uri r7 = android.provider.ContactsContract.Contacts.CONTENT_URI
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r7, r3)
            java.lang.String r4 = "photo"
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r3, r4)
            byte[] r3 = defpackage.zsz.d
            java.lang.String[] r10 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            java.lang.String r4 = "data15"
            r10[r6] = r4     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0142, all -> 0x0140 }
            if (r2 == 0) goto L_0x0138
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0136 }
            if (r4 == 0) goto L_0x0138
            java.lang.Integer r4 = defpackage.zsz.a     // Catch:{ SQLiteException -> 0x0136 }
            int r4 = r4.intValue()     // Catch:{ SQLiteException -> 0x0136 }
            byte[] r1 = r2.getBlob(r4)     // Catch:{ SQLiteException -> 0x0136 }
            r3 = r1
            goto L_0x0139
        L_0x0136:
            r4 = move-exception
            goto L_0x0143
        L_0x0138:
        L_0x0139:
            if (r2 != 0) goto L_0x013c
            goto L_0x014e
        L_0x013c:
            r2.close()
            goto L_0x014e
        L_0x0140:
            r0 = move-exception
            goto L_0x01ab
        L_0x0142:
            r4 = move-exception
        L_0x0143:
            zsg r1 = r1.g     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = "ContentResolver.query threw an exception while fetching photo info."
            r1.a((java.lang.Throwable) r4, (java.lang.String) r7)     // Catch:{ all -> 0x01aa }
            if (r2 == 0) goto L_0x014d
            goto L_0x013c
        L_0x014d:
        L_0x014e:
            zsz r1 = r14.a
            int r2 = r3.length
            long r7 = (long) r2
            boolean r1 = r1.b((long) r7)
            if (r1 != 0) goto L_0x018e
            boolean r1 = defpackage.azfa.g()
            if (r1 == 0) goto L_0x0170
            zsz r0 = r14.a
            zsg r0 = r0.g
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zsy r2 = r14.c
            java.lang.Long r2 = r2.b
            r1[r6] = r2
            java.lang.String r2 = "Dropping contact thumbnail due to size for contact %d"
            r0.b(r2, r1)
            goto L_0x0185
        L_0x0170:
            zsz r1 = r14.a
            zsg r1 = r1.g
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Dropping contact thumbnail due to size for contact %d"
            r0[r6] = r2
            zsy r2 = r14.c
            java.lang.Long r2 = r2.b
            r0[r5] = r2
            java.lang.String r2 = "ReadContactsHelper"
            r1.c(r2, r0)
        L_0x0185:
            aqxw r0 = r14.b
            aucj r0 = r0.i()
            aqxx r0 = (defpackage.aqxx) r0
            goto L_0x01ef
        L_0x018e:
            aqxw r0 = r14.b
            auay r1 = defpackage.auay.a((byte[]) r3)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0199
            goto L_0x019e
        L_0x0199:
            r0.c()
            r0.c = r6
        L_0x019e:
            aucj r0 = r0.b
            aqxx r0 = (defpackage.aqxx) r0
            aqxx r2 = defpackage.aqxx.E
            r1.getClass()
            r0.p = r1
            goto L_0x01b1
        L_0x01aa:
            r0 = move-exception
        L_0x01ab:
            if (r2 == 0) goto L_0x01b0
            r2.close()
        L_0x01b0:
            throw r0
        L_0x01b1:
            aqxw r0 = r14.b
            aucj r0 = r0.i()
            aqxx r0 = (defpackage.aqxx) r0
            goto L_0x01ef
        L_0x01ba:
            boolean r1 = defpackage.azfa.g()
            if (r1 == 0) goto L_0x01d2
            zsz r0 = r14.a
            zsg r0 = r0.g
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zsy r2 = r14.c
            java.lang.Long r2 = r2.b
            r1[r6] = r2
            java.lang.String r2 = "Dropping contact thumbnail due to size for contact %d"
            r0.b(r2, r1)
            goto L_0x01e7
        L_0x01d2:
            zsz r1 = r14.a
            zsg r1 = r1.g
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Dropping contact thumbnail due to size for contact %d"
            r0[r6] = r2
            zsy r2 = r14.c
            java.lang.Long r2 = r2.b
            r0[r5] = r2
            java.lang.String r2 = "ReadContactsHelper"
            r1.c(r2, r0)
        L_0x01e7:
            aqxw r0 = r14.b
            aucj r0 = r0.i()
            aqxx r0 = (defpackage.aqxx) r0
        L_0x01ef:
            return r0
        L_0x01f0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01f0 }
            throw r1
        L_0x01f3:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            goto L_0x01fa
        L_0x01f9:
            throw r0
        L_0x01fa:
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsx.call():java.lang.Object");
    }
}
