package defpackage;

import android.content.SharedPreferences;

/* renamed from: wrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wrk implements Runnable {
    private final wrg a;
    private final SharedPreferences b;
    private final ydd c;
    private final wqz d;

    public wrk(SharedPreferences sharedPreferences, wrg wrg, wre wre, ydd ydd) {
        this.a = wrg;
        this.b = sharedPreferences;
        this.d = wre;
        this.c = ydd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: ampu} */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v40 */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x038a, code lost:
        if (r7 == null) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039b, code lost:
        if (r7 != null) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03a0, code lost:
        r17 = r17 & ((defpackage.wre) r5).a(r6, (defpackage.avdi) r9.i(), r13);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03b2 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x049b A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04b4 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "ContactsLogger"
            java.lang.String r3 = "data1"
            java.lang.String r4 = "raw_contact_id"
            wqz r5 = r1.d     // Catch:{ Exception -> 0x0522 }
            wrg r6 = r1.a     // Catch:{ Exception -> 0x0522 }
            r0 = r5
            wre r0 = (defpackage.wre) r0     // Catch:{ Exception -> 0x0522 }
            amsv r0 = r0.d     // Catch:{ Exception -> 0x0522 }
            wrc r0 = (defpackage.wrc) r0     // Catch:{ Exception -> 0x0522 }
            wqy r0 = r0.a()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0521
            java.util.List r7 = r0.a     // Catch:{ Exception -> 0x0522 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x0522 }
            if (r7 != 0) goto L_0x0022
        L_0x0021:
            goto L_0x002c
        L_0x0022:
            java.util.Set r7 = r0.b     // Catch:{ Exception -> 0x0522 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x0522 }
            if (r7 == 0) goto L_0x0021
            goto L_0x0521
        L_0x002c:
            java.util.List r7 = r0.a     // Catch:{ Exception -> 0x0522 }
            r7.size()     // Catch:{ Exception -> 0x0522 }
            java.util.Set r7 = r0.b     // Catch:{ Exception -> 0x0522 }
            r7.size()     // Catch:{ Exception -> 0x0522 }
            java.util.List r7 = r0.a     // Catch:{ Exception -> 0x0522 }
            java.util.Set r0 = r0.b     // Catch:{ Exception -> 0x0522 }
            r8 = r5
            wre r8 = (defpackage.wre) r8     // Catch:{ Exception -> 0x0522 }
            avdi r0 = r8.a((java.util.List) r7, (java.util.Set) r0, (defpackage.wrg) r6)     // Catch:{ Exception -> 0x0522 }
            r7 = 5
            java.lang.Object r8 = r0.c(r7)     // Catch:{ Exception -> 0x0522 }
            aucd r8 = (defpackage.aucd) r8     // Catch:{ Exception -> 0x0522 }
            r8.a((defpackage.aucj) r0)     // Catch:{ Exception -> 0x0522 }
            avdg r8 = (defpackage.avdg) r8     // Catch:{ Exception -> 0x0522 }
            if (r8 == 0) goto L_0x0521
            r0 = r5
            wre r0 = (defpackage.wre) r0     // Catch:{ Exception -> 0x0522 }
            xsc r0 = r0.b     // Catch:{ Exception -> 0x0522 }
            amri r9 = r0.a()     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r9.a()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x048e
            java.util.Set r12 = r6.b     // Catch:{ Exception -> 0x0522 }
            java.lang.String r13 = r6.a     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r12.isEmpty()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x048e
        L_0x006e:
            defpackage.xip.a()     // Catch:{ Exception -> 0x0522 }
            r0 = r5
            wre r0 = (defpackage.wre) r0     // Catch:{ Exception -> 0x0522 }
            xsc r0 = r0.b     // Catch:{ Exception -> 0x0522 }
            xsd r0 = (defpackage.xsd) r0     // Catch:{ Exception -> 0x0522 }
            amri r0 = r0.b()     // Catch:{ Exception -> 0x0522 }
            boolean r14 = r0.a()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r15 = "DeviceUsageSettingsHelper"
            if (r14 == 0) goto L_0x0094
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x0522 }
            ick r0 = (defpackage.ick) r0     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r0.f()     // Catch:{ Exception -> 0x0522 }
            amri r0 = defpackage.amri.c(r0)     // Catch:{ Exception -> 0x0522 }
            r14 = r0
            goto L_0x009c
        L_0x0094:
            java.lang.String r0 = "getSignedInAccountName: Falling back to default value"
            android.util.Log.w(r15, r0)     // Catch:{ Exception -> 0x0522 }
            ampu r0 = defpackage.ampu.a     // Catch:{ Exception -> 0x0522 }
            r14 = r0
        L_0x009c:
            java.util.Iterator r16 = r12.iterator()     // Catch:{ Exception -> 0x0522 }
            r17 = 1
            r18 = 0
        L_0x00a4:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r16.next()     // Catch:{ Exception -> 0x0522 }
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r7.equals(r13)     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x00ce
            xfs r0 = defpackage.xig.a     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x0522 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x00ca
            r18 = 1
            r20 = 1
            goto L_0x00d0
        L_0x00ca:
            r7 = 5
            r18 = 1
            goto L_0x00a4
        L_0x00ce:
            r20 = 0
        L_0x00d0:
            r0 = r5
            wre r0 = (defpackage.wre) r0     // Catch:{ Exception -> 0x0522 }
            xsc r10 = r0.b     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r9.a()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r9.b()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00ec }
            java.lang.String r0 = defpackage.aekm.b(r7, r0)     // Catch:{ Exception -> 0x00ec }
            amri r0 = defpackage.amri.b(r0)     // Catch:{ Exception -> 0x00ec }
            r21 = r12
            goto L_0x0117
        L_0x00ec:
            r0 = move-exception
            defpackage.xip.a()     // Catch:{ Exception -> 0x0522 }
            yde r11 = defpackage.yde.a     // Catch:{ Exception -> 0x0522 }
            xsd r10 = (defpackage.xsd) r10     // Catch:{ Exception -> 0x0522 }
            android.content.Context r10 = r10.b     // Catch:{ Exception -> 0x0522 }
            ydd r10 = r11.a(r10)     // Catch:{ Exception -> 0x0522 }
            xfs r11 = defpackage.xic.a     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r11 = r11.a()     // Catch:{ Exception -> 0x0522 }
            java.lang.Double r11 = (java.lang.Double) r11     // Catch:{ Exception -> 0x0522 }
            r21 = r12
            double r11 = r11.doubleValue()     // Catch:{ Exception -> 0x0522 }
            r10.a(r0, r11)     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = "getSignedInClientInstanceId: Unable to get clientInstanceId"
            android.util.Log.e(r15, r0)     // Catch:{ Exception -> 0x0522 }
            ampu r0 = defpackage.ampu.a     // Catch:{ Exception -> 0x0522 }
            goto L_0x0117
        L_0x0113:
            r21 = r12
            ampu r0 = defpackage.ampu.a     // Catch:{ Exception -> 0x0522 }
        L_0x0117:
            boolean r10 = r0.a()     // Catch:{ Exception -> 0x0522 }
            if (r10 == 0) goto L_0x01fb
            java.lang.Object r0 = r0.b()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0522 }
            boolean r10 = r8.c     // Catch:{ Exception -> 0x0522 }
            if (r10 != 0) goto L_0x0128
            goto L_0x012e
        L_0x0128:
            r8.c()     // Catch:{ Exception -> 0x0522 }
            r10 = 0
            r8.c = r10     // Catch:{ Exception -> 0x0522 }
        L_0x012e:
            aucj r10 = r8.b     // Catch:{ Exception -> 0x0522 }
            avdi r10 = (defpackage.avdi) r10     // Catch:{ Exception -> 0x0522 }
            avdi r11 = defpackage.avdi.h     // Catch:{ Exception -> 0x0522 }
            r0.getClass()     // Catch:{ Exception -> 0x0522 }
            int r11 = r10.a     // Catch:{ Exception -> 0x0522 }
            r12 = 1
            r11 = r11 | r12
            r10.a = r11     // Catch:{ Exception -> 0x0522 }
            r10.c = r0     // Catch:{ Exception -> 0x0522 }
            avdq r0 = r10.f     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            avdq r0 = defpackage.avdq.A     // Catch:{ Exception -> 0x0522 }
        L_0x0146:
            r10 = 5
            java.lang.Object r11 = r0.c(r10)     // Catch:{ Exception -> 0x0522 }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ Exception -> 0x0522 }
            r11.a((defpackage.aucj) r0)     // Catch:{ Exception -> 0x0522 }
            avdk r11 = (defpackage.avdk) r11     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r14.a()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r14.b()     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0522 }
            r12 = 1
            r0 = r0 ^ r12
            boolean r12 = r11.c     // Catch:{ Exception -> 0x0522 }
            if (r12 != 0) goto L_0x0168
            goto L_0x016e
        L_0x0168:
            r11.c()     // Catch:{ Exception -> 0x0522 }
            r12 = 0
            r11.c = r12     // Catch:{ Exception -> 0x0522 }
        L_0x016e:
            aucj r12 = r11.b     // Catch:{ Exception -> 0x0522 }
            avdq r12 = (defpackage.avdq) r12     // Catch:{ Exception -> 0x0522 }
            int r10 = r12.a     // Catch:{ Exception -> 0x0522 }
            r22 = 1048576(0x100000, float:1.469368E-39)
            r10 = r10 | r22
            r12.a = r10     // Catch:{ Exception -> 0x0522 }
            r12.r = r0     // Catch:{ Exception -> 0x0522 }
            goto L_0x0196
        L_0x017d:
            boolean r0 = r11.c     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x0182
            goto L_0x0188
        L_0x0182:
            r11.c()     // Catch:{ Exception -> 0x0522 }
            r10 = 0
            r11.c = r10     // Catch:{ Exception -> 0x0522 }
        L_0x0188:
            aucj r0 = r11.b     // Catch:{ Exception -> 0x0522 }
            avdq r0 = (defpackage.avdq) r0     // Catch:{ Exception -> 0x0522 }
            int r10 = r0.a     // Catch:{ Exception -> 0x0522 }
            r12 = 1048576(0x100000, float:1.469368E-39)
            r10 = r10 | r12
            r0.a = r10     // Catch:{ Exception -> 0x0522 }
            r10 = 1
            r0.r = r10     // Catch:{ Exception -> 0x0522 }
        L_0x0196:
            boolean r0 = r8.c     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x019b
            goto L_0x01a1
        L_0x019b:
            r8.c()     // Catch:{ Exception -> 0x0522 }
            r10 = 0
            r8.c = r10     // Catch:{ Exception -> 0x0522 }
        L_0x01a1:
            aucj r0 = r8.b     // Catch:{ Exception -> 0x0522 }
            avdi r0 = (defpackage.avdi) r0     // Catch:{ Exception -> 0x0522 }
            aucj r10 = r11.i()     // Catch:{ Exception -> 0x0522 }
            avdq r10 = (defpackage.avdq) r10     // Catch:{ Exception -> 0x0522 }
            r10.getClass()     // Catch:{ Exception -> 0x0522 }
            r0.f = r10     // Catch:{ Exception -> 0x0522 }
            int r10 = r0.a     // Catch:{ Exception -> 0x0522 }
            r10 = r10 | 16
            r0.a = r10     // Catch:{ Exception -> 0x0522 }
            r10 = r20
            r11 = 1
            defpackage.wre.a((boolean) r10, (boolean) r11, (defpackage.avdg) r8)     // Catch:{ Exception -> 0x0522 }
            aucj r0 = r8.i()     // Catch:{ Exception -> 0x0522 }
            avdi r0 = (defpackage.avdi) r0     // Catch:{ Exception -> 0x0522 }
            defpackage.xip.a()     // Catch:{ Exception -> 0x0522 }
            xfs r10 = defpackage.xig.a     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r10 = r10.a()     // Catch:{ Exception -> 0x0522 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x0522 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x0522 }
            if (r10 != 0) goto L_0x01db
            r10 = r5
            wre r10 = (defpackage.wre) r10     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r10.a((defpackage.wrg) r6, (defpackage.avdi) r0, (java.lang.String) r7)     // Catch:{ Exception -> 0x0522 }
            goto L_0x01f4
        L_0x01db:
            byte[] r0 = r0.k()     // Catch:{ IllegalArgumentException -> 0x01e9 }
            r10 = r5
            wre r10 = (defpackage.wre) r10     // Catch:{ IllegalArgumentException -> 0x01e9 }
            yda r10 = r10.g     // Catch:{ IllegalArgumentException -> 0x01e9 }
            defpackage.wqz.a(r6, r0, r7, r10)     // Catch:{ IllegalArgumentException -> 0x01e9 }
            r0 = 1
            goto L_0x01f4
        L_0x01e9:
            r0 = move-exception
            wml r0 = defpackage.wml.a()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r7 = "ContactsLogger.contact_list_serialize_failure"
            r0.a((java.lang.String) r7)     // Catch:{ Exception -> 0x0522 }
            r0 = 0
        L_0x01f4:
            r17 = r17 & r0
            r12 = r21
            r7 = 5
            goto L_0x00a4
        L_0x01fb:
            r12 = r21
            r7 = 5
            r17 = 0
            goto L_0x00a4
        L_0x0202:
            r21 = r12
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x03b6
            r10 = r18
            r9 = 1
            defpackage.wre.a((boolean) r9, (boolean) r10, (defpackage.avdg) r8)     // Catch:{ Exception -> 0x0522 }
            int r0 = defpackage.wqi.a     // Catch:{ Exception -> 0x0522 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0522 }
            r0.<init>()     // Catch:{ Exception -> 0x0522 }
            aucj r9 = r8.b     // Catch:{ Exception -> 0x0522 }
            avdi r9 = (defpackage.avdi) r9     // Catch:{ Exception -> 0x0522 }
            aucx r9 = r9.b     // Catch:{ Exception -> 0x0522 }
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)     // Catch:{ Exception -> 0x0522 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0522 }
        L_0x0225:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x0522 }
            if (r11 == 0) goto L_0x0253
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x0522 }
            avdf r11 = (defpackage.avdf) r11     // Catch:{ Exception -> 0x0522 }
            aucx r11 = r11.k     // Catch:{ Exception -> 0x0522 }
            int r12 = r11.size()     // Catch:{ Exception -> 0x0522 }
            r14 = 0
        L_0x0238:
            if (r14 >= r12) goto L_0x0250
            java.lang.Object r15 = r11.get(r14)     // Catch:{ Exception -> 0x0522 }
            avdz r15 = (defpackage.avdz) r15     // Catch:{ Exception -> 0x0522 }
            r16 = r8
            long r7 = r15.b     // Catch:{ Exception -> 0x0522 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0522 }
            r0.put(r7, r15)     // Catch:{ Exception -> 0x0522 }
            int r14 = r14 + 1
            r8 = r16
            goto L_0x0238
        L_0x0250:
            r16 = r8
            goto L_0x0225
        L_0x0253:
            r16 = r8
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0522 }
            r7 = 0
            r8[r7] = r4     // Catch:{ Exception -> 0x0522 }
            r7 = 1
            r8[r7] = r3     // Catch:{ Exception -> 0x0522 }
            r7 = 0
            java.util.Set r9 = r0.keySet()     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            java.lang.String r9 = defpackage.wre.a((java.lang.String) r4, (java.util.Collection) r9)     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            java.lang.String r11 = "mimetype"
            java.lang.String r12 = "vnd.android.cursor.item/note"
            java.lang.String r11 = defpackage.wre.a((java.lang.String) r11, (java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            r12 = r5
            wre r12 = (defpackage.wre) r12     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            android.content.Context r12 = r12.a     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            android.content.ContentResolver r22 = r12.getContentResolver()     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            android.net.Uri r23 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            r12 = 2
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            r12 = 0
            r14[r12] = r9     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            r9 = 1
            r14[r9] = r11     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            java.lang.String r25 = defpackage.wre.a((java.lang.String[]) r14)     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            r26 = 0
            r27 = 0
            r24 = r8
            android.database.Cursor r7 = r22.query(r23, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x0391, all -> 0x038f }
            if (r7 == 0) goto L_0x0381
        L_0x0293:
            boolean r8 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x037b }
            if (r8 == 0) goto L_0x02fc
            int r8 = r7.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x037b }
            long r8 = r7.getLong(r8)     // Catch:{ SQLiteException -> 0x037b }
            int r11 = r7.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x037b }
            boolean r12 = r7.isNull(r11)     // Catch:{ SQLiteException -> 0x037b }
            if (r12 != 0) goto L_0x0293
            java.lang.String r11 = r7.getString(r11)     // Catch:{ SQLiteException -> 0x037b }
            int r12 = r11.length()     // Catch:{ SQLiteException -> 0x037b }
            long r14 = (long) r12     // Catch:{ SQLiteException -> 0x037b }
            aywy r12 = defpackage.aywy.a     // Catch:{ SQLiteException -> 0x037b }
            ayxk r12 = r12.a()     // Catch:{ SQLiteException -> 0x037b }
            long r22 = r12.A()     // Catch:{ SQLiteException -> 0x037b }
            int r12 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r12 > 0) goto L_0x0293
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x037b }
            java.lang.Object r9 = r0.get(r8)     // Catch:{ SQLiteException -> 0x037b }
            avdz r9 = (defpackage.avdz) r9     // Catch:{ SQLiteException -> 0x037b }
            r12 = 5
            java.lang.Object r14 = r9.c(r12)     // Catch:{ SQLiteException -> 0x037b }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ SQLiteException -> 0x037b }
            r14.a((defpackage.aucj) r9)     // Catch:{ SQLiteException -> 0x037b }
            boolean r9 = r14.c     // Catch:{ SQLiteException -> 0x037b }
            if (r9 != 0) goto L_0x02db
            goto L_0x02e1
        L_0x02db:
            r14.c()     // Catch:{ SQLiteException -> 0x037b }
            r9 = 0
            r14.c = r9     // Catch:{ SQLiteException -> 0x037b }
        L_0x02e1:
            aucj r9 = r14.b     // Catch:{ SQLiteException -> 0x037b }
            avdz r9 = (defpackage.avdz) r9     // Catch:{ SQLiteException -> 0x037b }
            avdz r12 = defpackage.avdz.r     // Catch:{ SQLiteException -> 0x037b }
            r11.getClass()     // Catch:{ SQLiteException -> 0x037b }
            int r12 = r9.a     // Catch:{ SQLiteException -> 0x037b }
            r12 = r12 | 128(0x80, float:1.794E-43)
            r9.a = r12     // Catch:{ SQLiteException -> 0x037b }
            r9.f = r11     // Catch:{ SQLiteException -> 0x037b }
            aucj r9 = r14.i()     // Catch:{ SQLiteException -> 0x037b }
            avdz r9 = (defpackage.avdz) r9     // Catch:{ SQLiteException -> 0x037b }
            r0.put(r8, r9)     // Catch:{ SQLiteException -> 0x037b }
            goto L_0x0293
        L_0x02fc:
            aucj r3 = r16.i()     // Catch:{ SQLiteException -> 0x037b }
            avdi r3 = (defpackage.avdi) r3     // Catch:{ SQLiteException -> 0x037b }
            aucx r3 = r3.b     // Catch:{ SQLiteException -> 0x037b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SQLiteException -> 0x037b }
            r4 = 0
        L_0x0309:
            boolean r8 = r3.hasNext()     // Catch:{ SQLiteException -> 0x037b }
            if (r8 == 0) goto L_0x0376
            java.lang.Object r8 = r3.next()     // Catch:{ SQLiteException -> 0x037b }
            avdf r8 = (defpackage.avdf) r8     // Catch:{ SQLiteException -> 0x037b }
            r9 = 5
            java.lang.Object r11 = r8.c(r9)     // Catch:{ SQLiteException -> 0x037b }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ SQLiteException -> 0x037b }
            r11.a((defpackage.aucj) r8)     // Catch:{ SQLiteException -> 0x037b }
            avdd r11 = (defpackage.avdd) r11     // Catch:{ SQLiteException -> 0x037b }
            aucx r8 = r8.k     // Catch:{ SQLiteException -> 0x037b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x037b }
            r12 = 0
        L_0x0328:
            boolean r14 = r8.hasNext()     // Catch:{ SQLiteException -> 0x037b }
            if (r14 == 0) goto L_0x0367
            java.lang.Object r14 = r8.next()     // Catch:{ SQLiteException -> 0x037b }
            avdz r14 = (defpackage.avdz) r14     // Catch:{ SQLiteException -> 0x037b }
            int r15 = r12 + 1
            r19 = r10
            long r9 = r14.b     // Catch:{ SQLiteException -> 0x0365 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteException -> 0x0365 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ SQLiteException -> 0x0365 }
            avdz r9 = (defpackage.avdz) r9     // Catch:{ SQLiteException -> 0x0365 }
            boolean r10 = r11.c     // Catch:{ SQLiteException -> 0x0365 }
            if (r10 != 0) goto L_0x0349
            goto L_0x034f
        L_0x0349:
            r11.c()     // Catch:{ SQLiteException -> 0x0365 }
            r10 = 0
            r11.c = r10     // Catch:{ SQLiteException -> 0x0365 }
        L_0x034f:
            aucj r10 = r11.b     // Catch:{ SQLiteException -> 0x0365 }
            avdf r10 = (defpackage.avdf) r10     // Catch:{ SQLiteException -> 0x0365 }
            avdf r14 = defpackage.avdf.q     // Catch:{ SQLiteException -> 0x0365 }
            r9.getClass()     // Catch:{ SQLiteException -> 0x0365 }
            r10.g()     // Catch:{ SQLiteException -> 0x0365 }
            aucx r10 = r10.k     // Catch:{ SQLiteException -> 0x0365 }
            r10.set(r12, r9)     // Catch:{ SQLiteException -> 0x0365 }
            r12 = r15
            r10 = r19
            r9 = 5
            goto L_0x0328
        L_0x0365:
            r0 = move-exception
            goto L_0x037e
        L_0x0367:
            r19 = r10
            int r8 = r4 + 1
            r9 = r16
            r9.a(r4, r11)     // Catch:{ SQLiteException -> 0x038d }
            r4 = r8
            r16 = r9
            r10 = r19
            goto L_0x0309
        L_0x0376:
            r19 = r10
            r9 = r16
            goto L_0x038a
        L_0x037b:
            r0 = move-exception
            r19 = r10
        L_0x037e:
            r9 = r16
            goto L_0x0396
        L_0x0381:
            r19 = r10
            r9 = r16
            java.lang.String r0 = "CP2 failed to fetch Note info."
            android.util.Log.w(r2, r0)     // Catch:{ SQLiteException -> 0x038d }
        L_0x038a:
            if (r7 != 0) goto L_0x039d
            goto L_0x03a0
        L_0x038d:
            r0 = move-exception
            goto L_0x0396
        L_0x038f:
            r0 = move-exception
            goto L_0x03b0
        L_0x0391:
            r0 = move-exception
            r19 = r10
            r9 = r16
        L_0x0396:
            java.lang.String r3 = "CP2 Query Exception when fetching note info"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x03af }
            if (r7 == 0) goto L_0x03a0
        L_0x039d:
            r7.close()     // Catch:{ Exception -> 0x0522 }
        L_0x03a0:
            aucj r0 = r9.i()     // Catch:{ Exception -> 0x0522 }
            avdi r0 = (defpackage.avdi) r0     // Catch:{ Exception -> 0x0522 }
            wre r5 = (defpackage.wre) r5     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r5.a((defpackage.wrg) r6, (defpackage.avdi) r0, (java.lang.String) r13)     // Catch:{ Exception -> 0x0522 }
            r17 = r17 & r0
            goto L_0x03b8
        L_0x03af:
            r0 = move-exception
        L_0x03b0:
            if (r7 == 0) goto L_0x03b5
            r7.close()     // Catch:{ Exception -> 0x0522 }
        L_0x03b5:
            throw r0     // Catch:{ Exception -> 0x0522 }
        L_0x03b6:
            r19 = r18
        L_0x03b8:
            wml r0 = defpackage.wml.a()     // Catch:{ Exception -> 0x0522 }
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0522 }
            r3 = 1
            r2 = r2 ^ r3
            boolean r4 = r21.isEmpty()     // Catch:{ Exception -> 0x0522 }
            r4 = r4 ^ r3
            r5 = r19 ^ 1
            int r3 = r21.size()     // Catch:{ Exception -> 0x0522 }
            xlb r6 = defpackage.xlb.n     // Catch:{ Exception -> 0x0522 }
            aucd r6 = r6.o()     // Catch:{ Exception -> 0x0522 }
            boolean r7 = r6.c     // Catch:{ Exception -> 0x0522 }
            if (r7 != 0) goto L_0x03d8
            goto L_0x03de
        L_0x03d8:
            r6.c()     // Catch:{ Exception -> 0x0522 }
            r7 = 0
            r6.c = r7     // Catch:{ Exception -> 0x0522 }
        L_0x03de:
            aucj r7 = r6.b     // Catch:{ Exception -> 0x0522 }
            xlb r7 = (defpackage.xlb) r7     // Catch:{ Exception -> 0x0522 }
            int r8 = r7.a     // Catch:{ Exception -> 0x0522 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r7.a = r8     // Catch:{ Exception -> 0x0522 }
            r7.m = r3     // Catch:{ Exception -> 0x0522 }
            xlc r3 = defpackage.xlc.m     // Catch:{ Exception -> 0x0522 }
            aucd r3 = r3.o()     // Catch:{ Exception -> 0x0522 }
            if (r2 == 0) goto L_0x0427
            if (r4 == 0) goto L_0x0427
            if (r5 != 0) goto L_0x040e
            boolean r2 = r6.c     // Catch:{ Exception -> 0x0522 }
            if (r2 != 0) goto L_0x03fb
            goto L_0x0401
        L_0x03fb:
            r6.c()     // Catch:{ Exception -> 0x0522 }
            r2 = 0
            r6.c = r2     // Catch:{ Exception -> 0x0522 }
        L_0x0401:
            aucj r2 = r6.b     // Catch:{ Exception -> 0x0522 }
            xlb r2 = (defpackage.xlb) r2     // Catch:{ Exception -> 0x0522 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0522 }
            r5 = 1
            r4 = r4 | r5
            r2.a = r4     // Catch:{ Exception -> 0x0522 }
            r2.b = r5     // Catch:{ Exception -> 0x0522 }
            goto L_0x045e
        L_0x040e:
            boolean r2 = r6.c     // Catch:{ Exception -> 0x0522 }
            if (r2 != 0) goto L_0x0413
            goto L_0x0419
        L_0x0413:
            r6.c()     // Catch:{ Exception -> 0x0522 }
            r2 = 0
            r6.c = r2     // Catch:{ Exception -> 0x0522 }
        L_0x0419:
            aucj r2 = r6.b     // Catch:{ Exception -> 0x0522 }
            xlb r2 = (defpackage.xlb) r2     // Catch:{ Exception -> 0x0522 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0522 }
            r5 = 2
            r4 = r4 | r5
            r2.a = r4     // Catch:{ Exception -> 0x0522 }
            r4 = 1
            r2.c = r4     // Catch:{ Exception -> 0x0522 }
            goto L_0x045e
        L_0x0427:
            if (r2 != 0) goto L_0x0444
            if (r4 == 0) goto L_0x0444
            boolean r2 = r6.c     // Catch:{ Exception -> 0x0522 }
            if (r2 != 0) goto L_0x0430
            goto L_0x0436
        L_0x0430:
            r6.c()     // Catch:{ Exception -> 0x0522 }
            r2 = 0
            r6.c = r2     // Catch:{ Exception -> 0x0522 }
        L_0x0436:
            aucj r2 = r6.b     // Catch:{ Exception -> 0x0522 }
            xlb r2 = (defpackage.xlb) r2     // Catch:{ Exception -> 0x0522 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0522 }
            r4 = r4 | 8
            r2.a = r4     // Catch:{ Exception -> 0x0522 }
            r4 = 1
            r2.e = r4     // Catch:{ Exception -> 0x0522 }
            goto L_0x045e
        L_0x0444:
            if (r2 == 0) goto L_0x045e
            boolean r2 = r6.c     // Catch:{ Exception -> 0x0522 }
            if (r2 != 0) goto L_0x044b
            goto L_0x0451
        L_0x044b:
            r6.c()     // Catch:{ Exception -> 0x0522 }
            r2 = 0
            r6.c = r2     // Catch:{ Exception -> 0x0522 }
        L_0x0451:
            aucj r2 = r6.b     // Catch:{ Exception -> 0x0522 }
            xlb r2 = (defpackage.xlb) r2     // Catch:{ Exception -> 0x0522 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0522 }
            r4 = r4 | 4
            r2.a = r4     // Catch:{ Exception -> 0x0522 }
            r4 = 1
            r2.d = r4     // Catch:{ Exception -> 0x0522 }
        L_0x045e:
            boolean r2 = r3.c     // Catch:{ Exception -> 0x0522 }
            if (r2 != 0) goto L_0x0463
            goto L_0x0469
        L_0x0463:
            r3.c()     // Catch:{ Exception -> 0x0522 }
            r2 = 0
            r3.c = r2     // Catch:{ Exception -> 0x0522 }
        L_0x0469:
            aucj r2 = r3.b     // Catch:{ Exception -> 0x0522 }
            xlc r2 = (defpackage.xlc) r2     // Catch:{ Exception -> 0x0522 }
            aucj r4 = r6.i()     // Catch:{ Exception -> 0x0522 }
            xlb r4 = (defpackage.xlb) r4     // Catch:{ Exception -> 0x0522 }
            r4.getClass()     // Catch:{ Exception -> 0x0522 }
            r2.l = r4     // Catch:{ Exception -> 0x0522 }
            int r4 = r2.a     // Catch:{ Exception -> 0x0522 }
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r5
            r2.a = r4     // Catch:{ Exception -> 0x0522 }
            aucj r2 = r3.i()     // Catch:{ Exception -> 0x0522 }
            xlc r2 = (defpackage.xlc) r2     // Catch:{ Exception -> 0x0522 }
            r0.a((defpackage.xlc) r2)     // Catch:{ Exception -> 0x0522 }
            if (r17 == 0) goto L_0x048c
            r11 = 1
            goto L_0x048f
        L_0x048c:
            r11 = 0
            goto L_0x048f
        L_0x048e:
            r11 = 0
        L_0x048f:
            wml r0 = defpackage.wml.a()     // Catch:{ Exception -> 0x0522 }
            xlc r2 = defpackage.xlc.m     // Catch:{ Exception -> 0x0522 }
            aucd r2 = r2.o()     // Catch:{ Exception -> 0x0522 }
            if (r11 == 0) goto L_0x04b4
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0522 }
            if (r3 != 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            r2.c()     // Catch:{ Exception -> 0x0522 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0522 }
        L_0x04a6:
            aucj r3 = r2.b     // Catch:{ Exception -> 0x0522 }
            xlc r3 = (defpackage.xlc) r3     // Catch:{ Exception -> 0x0522 }
            int r4 = r3.a     // Catch:{ Exception -> 0x0522 }
            r4 = r4 | 64
            r3.a = r4     // Catch:{ Exception -> 0x0522 }
            r4 = 1
            r3.e = r4     // Catch:{ Exception -> 0x0522 }
            goto L_0x04cc
        L_0x04b4:
            boolean r3 = r2.c     // Catch:{ Exception -> 0x0522 }
            if (r3 != 0) goto L_0x04b9
            goto L_0x04bf
        L_0x04b9:
            r2.c()     // Catch:{ Exception -> 0x0522 }
            r3 = 0
            r2.c = r3     // Catch:{ Exception -> 0x0522 }
        L_0x04bf:
            aucj r3 = r2.b     // Catch:{ Exception -> 0x0522 }
            xlc r3 = (defpackage.xlc) r3     // Catch:{ Exception -> 0x0522 }
            int r4 = r3.a     // Catch:{ Exception -> 0x0522 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.a = r4     // Catch:{ Exception -> 0x0522 }
            r4 = 1
            r3.f = r4     // Catch:{ Exception -> 0x0522 }
        L_0x04cc:
            aucj r2 = r2.i()     // Catch:{ Exception -> 0x0522 }
            xlc r2 = (defpackage.xlc) r2     // Catch:{ Exception -> 0x0522 }
            r0.a((defpackage.xlc) r2)     // Catch:{ Exception -> 0x0522 }
            if (r11 == 0) goto L_0x0521
            android.content.SharedPreferences r0 = r1.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            wrg r2 = r1.a
            boolean r3 = r2.d
            if (r3 != 0) goto L_0x050c
            long r2 = r2.c
            java.lang.String r4 = "contacts-logger-full-upload-timestamp"
            r0.putLong(r4, r2)
            defpackage.xip.a()
            xfs r2 = defpackage.xij.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0509
            android.content.SharedPreferences r2 = r1.b
            java.lang.String r3 = "contacts-logger-batch-upload-version"
            r4 = 0
            int r2 = r2.getInt(r3, r4)
            r4 = 1
            int r2 = r2 + r4
            r0.putInt(r3, r2)
        L_0x0509:
            r0.apply()
        L_0x050c:
            wrg r2 = r1.a
            long r2 = r2.c
            java.lang.String r4 = "contacts-logger-incremental-upload-timestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)
            java.lang.String r2 = "contacts-logger-pending-significant-update"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
            return
        L_0x0521:
            return
        L_0x0522:
            r0 = move-exception
            wml r2 = defpackage.wml.a()
            java.lang.String r3 = "ContactsLoggerTask.logData_failure"
            r2.a((java.lang.String) r3)
            defpackage.xip.a()
            ydd r2 = r1.c
            xfs r3 = defpackage.xic.a
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrk.run():void");
    }
}
