package defpackage;

/* renamed from: zuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zuj {
    private static final zsg a = zsg.a("CLCommonUtils");
    private static final String[] b = {"_id"};
    private static final String[] c = {"_id"};

    static double a() {
        try {
            return Double.parseDouble("20.12.16 (080306-{{cl}})".substring(0, "20.12.16 (080306-{{cl}})".indexOf(".", "20.12.16 (080306-{{cl}})".indexOf(".") + 1)));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            if (azfa.g()) {
                a.a(e, "Cannot parse GmsCore version.");
                return -1.0d;
            }
            a.e("Cannot parse GmsCore version.", e);
            return -1.0d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[SYNTHETIC, Splitter:B:16:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r7, android.net.Uri r8, java.lang.String[] r9) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r0 != 0) goto L_0x0018
            zsg r7 = a     // Catch:{ SQLiteException -> 0x0020 }
            java.lang.String r8 = "CP2 failed to fetch ReadOnlyRawContacts."
            r7.c(r8)     // Catch:{ SQLiteException -> 0x0020 }
            goto L_0x0043
        L_0x0018:
            int r7 = r0.getCount()     // Catch:{ SQLiteException -> 0x0020 }
            r0.close()
            return r7
        L_0x0020:
            r7 = move-exception
            goto L_0x0025
        L_0x0022:
            r7 = move-exception
            goto L_0x0046
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            boolean r8 = defpackage.azfa.g()     // Catch:{ all -> 0x0045 }
            java.lang.String r9 = "CP2 Query Exception when fetching read-only-raw-contacts."
            if (r8 != 0) goto L_0x0039
            zsg r8 = a     // Catch:{ all -> 0x0045 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0045 }
            r2 = 0
            r1[r2] = r7     // Catch:{ all -> 0x0045 }
            r8.e(r9, r1)     // Catch:{ all -> 0x0045 }
            goto L_0x003e
        L_0x0039:
            zsg r8 = a     // Catch:{ all -> 0x0045 }
            r8.a((java.lang.Throwable) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0045 }
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            r7 = -1
            return r7
        L_0x0045:
            r7 = move-exception
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            r0.close()
        L_0x004b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuj.a(android.content.Context, android.net.Uri, java.lang.String[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.avdq a(android.content.Context r10) {
        /*
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String[] r1 = c
            int r0 = a(r10, r0, r1)
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            java.lang.String[] r2 = b
            int r1 = a(r10, r1, r2)
            avdq r2 = defpackage.avdq.A
            aucd r2 = r2.o()
            avdk r2 = (defpackage.avdk) r2
            java.lang.String r3 = android.os.Build.MODEL
            boolean r4 = r2.c
            r5 = 0
            if (r4 == 0) goto L_0x0024
            r2.c()
            r2.c = r5
        L_0x0024:
            aucj r4 = r2.b
            avdq r4 = (defpackage.avdq) r4
            r3.getClass()
            int r6 = r4.a
            r7 = 1
            r6 = r6 | r7
            r4.a = r6
            r4.b = r3
            java.lang.String r3 = android.os.Build.BRAND
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r2.c()
            r2.c = r5
        L_0x003f:
            aucj r4 = r2.b
            avdq r4 = (defpackage.avdq) r4
            r3.getClass()
            int r6 = r4.a
            r6 = r6 | 2
            r4.a = r6
            r4.c = r3
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r2.c()
            r2.c = r5
        L_0x005a:
            aucj r4 = r2.b
            avdq r4 = (defpackage.avdq) r4
            r3.getClass()
            int r6 = r4.a
            r6 = r6 | 4
            r4.a = r6
            r4.d = r3
            java.lang.String r3 = android.os.Build.DISPLAY
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r2.c()
            r2.c = r5
        L_0x0075:
            aucj r4 = r2.b
            avdq r4 = (defpackage.avdq) r4
            r3.getClass()
            int r6 = r4.a
            r6 = r6 | 8
            r4.a = r6
            r4.e = r3
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r4 = r2.c
            if (r4 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r2.c()
            r2.c = r5
        L_0x0090:
            aucj r4 = r2.b
            avdq r4 = (defpackage.avdq) r4
            r3.getClass()
            int r6 = r4.a
            r6 = r6 | 16
            r4.a = r6
            r4.f = r3
            r3 = r6 | 512(0x200, float:7.175E-43)
            r4.a = r3
            long r8 = (long) r0
            r4.i = r8
            r0 = r3 | 1024(0x400, float:1.435E-42)
            r4.a = r0
            long r0 = (long) r1
            r4.j = r0
            defpackage.avdq.a(r4)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            r2.c()
            r2.c = r5
        L_0x00be:
            aucj r3 = r2.b
            avdq r3 = (defpackage.avdq) r3
            int r4 = r3.a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r3.a = r4
            r3.k = r0
            azdq r0 = defpackage.azdq.a
            azef r0 = r0.a()
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00f0
            double r0 = a()
            boolean r3 = r2.c
            if (r3 == 0) goto L_0x00e3
            r2.c()
            r2.c = r5
        L_0x00e3:
            aucj r3 = r2.b
            avdq r3 = (defpackage.avdq) r3
            int r4 = r3.a
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r3.a = r4
            r3.m = r0
            goto L_0x0108
        L_0x00f0:
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            r2.c()
            r2.c = r5
        L_0x00fa:
            aucj r0 = r2.b
            avdq r0 = (defpackage.avdq) r0
            int r1 = r0.a
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r0.a = r1
            r3 = 4628574517030027264(0x403c000000000000, double:28.0)
            r0.m = r3
        L_0x0108:
            aucj r0 = r2.b
            avdq r0 = (defpackage.avdq) r0
            r0.o = r7
            int r1 = r0.a
            r3 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r3
            r0.a = r1
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x011c
            goto L_0x0121
        L_0x011c:
            r2.c()
            r2.c = r5
        L_0x0121:
            aucj r1 = r2.b
            avdq r1 = (defpackage.avdq) r1
            int r3 = r1.a
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r4
            r1.a = r3
            r1.p = r0
            azdq r0 = defpackage.azdq.a
            azef r0 = r0.a()
            boolean r0 = r0.w()
            if (r0 == 0) goto L_0x0165
            amri r0 = defpackage.zru.a((android.content.Context) r10)
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x0165
            java.lang.Object r0 = r0.b()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            r2.c()
            r2.c = r5
        L_0x0158:
            aucj r3 = r2.b
            avdq r3 = (defpackage.avdq) r3
            int r4 = r3.a
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 | r6
            r3.a = r4
            r3.v = r0
        L_0x0165:
            azdq r0 = defpackage.azdq.a
            azef r0 = r0.a()
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x022b
            zsb r10 = defpackage.zsb.a(r10)
            android.telephony.TelephonyManager r0 = r10.a
            int r0 = r0.getPhoneType()
            if (r0 != r7) goto L_0x018e
            android.telephony.TelephonyManager r0 = r10.a
            java.lang.String r0 = r0.getNetworkCountryIso()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x018e
            amri r0 = defpackage.amri.b(r0)
            goto L_0x0190
        L_0x018e:
            ampu r0 = defpackage.ampu.a
        L_0x0190:
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r2.c
            if (r1 == 0) goto L_0x01a5
            r2.c()
            r2.c = r5
        L_0x01a5:
            aucj r1 = r2.b
            avdq r1 = (defpackage.avdq) r1
            r0.getClass()
            int r3 = r1.a
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r4
            r1.a = r3
            r1.w = r0
        L_0x01b5:
            android.telephony.TelephonyManager r10 = r10.a
            java.lang.String r10 = r10.getSimCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x01c4
            ampu r10 = defpackage.ampu.a
            goto L_0x01c8
        L_0x01c4:
            amri r10 = defpackage.amri.b(r10)
        L_0x01c8:
            boolean r0 = r10.a()
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r10 = r10.b()
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x01d9
            goto L_0x01de
        L_0x01d9:
            r2.c()
            r2.c = r5
        L_0x01de:
            aucj r0 = r2.b
            avdq r0 = (defpackage.avdq) r0
            r10.getClass()
            int r1 = r0.a
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r3
            r0.a = r1
            r0.x = r10
        L_0x01ee:
            java.util.Locale r10 = java.util.Locale.getDefault()
            if (r10 == 0) goto L_0x0203
            java.lang.String r10 = r10.getCountry()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0203
            amri r10 = defpackage.amri.b(r10)
            goto L_0x0205
        L_0x0203:
            ampu r10 = defpackage.ampu.a
        L_0x0205:
            boolean r0 = r10.a()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r10 = r10.b()
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            r2.c()
            r2.c = r5
        L_0x021b:
            aucj r0 = r2.b
            avdq r0 = (defpackage.avdq) r0
            r10.getClass()
            int r1 = r0.a
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r3
            r0.a = r1
            r0.y = r10
        L_0x022b:
            aucj r10 = r2.i()
            avdq r10 = (defpackage.avdq) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zuj.a(android.content.Context):avdq");
    }
}
