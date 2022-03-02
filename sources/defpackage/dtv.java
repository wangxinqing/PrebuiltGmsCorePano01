package defpackage;

/* renamed from: dtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtv {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[SYNTHETIC, Splitter:B:13:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.baza a(java.lang.String r7, com.google.android.gms.appdatasearch.UsageInfo r8) {
        /*
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0040
            com.google.android.gms.appdatasearch.DocumentContents r8 = r8.e
            if (r8 == 0) goto L_0x0040
            java.lang.String r2 = ".private:action"
            defpackage.iva.c(r2)
            com.google.android.gms.appdatasearch.DocumentSection[] r8 = r8.a
            if (r8 == 0) goto L_0x0024
            int r3 = r8.length
            r4 = 0
        L_0x0013:
            if (r4 >= r3) goto L_0x0024
            r5 = r8[r4]
            com.google.android.gms.appdatasearch.RegisterSectionInfo r6 = r5.d
            java.lang.String r6 = r6.a
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0024:
            r5 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x0040
            byte[] r8 = r5.f     // Catch:{ auda -> 0x0036 }
            aubs r2 = defpackage.aubs.c()     // Catch:{ auda -> 0x0036 }
            bazc r3 = defpackage.bazc.d     // Catch:{ auda -> 0x0036 }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r8, (defpackage.aubs) r2)     // Catch:{ auda -> 0x0036 }
            bazc r8 = (defpackage.bazc) r8     // Catch:{ auda -> 0x0036 }
            goto L_0x0041
        L_0x0036:
            r8 = move-exception
            java.lang.String r8 = "SchemaOrgUtils"
            java.lang.String r2 = "Unabled to parse the provided action."
            android.util.Log.e(r8, r2)
            r8 = r1
            goto L_0x0041
        L_0x0040:
            r8 = r1
        L_0x0041:
            if (r8 == 0) goto L_0x0069
            aucx r8 = r8.c
            int r2 = r8.size()
        L_0x0049:
            if (r0 >= r2) goto L_0x0069
            java.lang.Object r3 = r8.get(r0)
            baza r3 = (defpackage.baza) r3
            int r4 = r3.a
            r5 = r4 & 1
            if (r5 != 0) goto L_0x0058
        L_0x0057:
            goto L_0x0066
        L_0x0058:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0057
            java.lang.String r4 = r3.b
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0066
            r1 = r3
            goto L_0x006a
        L_0x0066:
            int r0 = r0 + 1
            goto L_0x0049
        L_0x0069:
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtv.a(java.lang.String, com.google.android.gms.appdatasearch.UsageInfo):baza");
    }
}
