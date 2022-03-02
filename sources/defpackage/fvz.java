package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvz implements Runnable {
    private static final iwd a = new iwd("RevokeAccessOperation", new String[0]);
    private final String b;
    private final igv c = new igv((icc) null);

    public fvz(String str) {
        iva.c(str);
        this.b = str;
    }

    public static icf a(String str) {
        if (str == null) {
            Status status = new Status(4);
            iva.a((Object) status, (Object) "Result must not be null");
            iva.b(!status.c(), "Status code must not be SUCCESS");
            icg icg = new icg(status);
            icg.a((icl) status);
            return icg;
        }
        fvz fvz = new fvz(str);
        new Thread(fvz).start();
        return fvz.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            java.lang.String r3 = "https://accounts.google.com/o/oauth2/revoke?token="
            java.lang.String r4 = r6.b     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            int r5 = r4.length()     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            if (r5 != 0) goto L_0x0015
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            r4.<init>(r3)     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            goto L_0x0019
        L_0x0015:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
        L_0x0019:
            r2.<init>(r4)     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            int r2 = r2.getResponseCode()     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x003b
            iwd r3 = a     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            java.lang.String r4 = "Unable to revoke access!"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            r3.e(r4, r5)     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
            goto L_0x003d
        L_0x003b:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ IOException -> 0x007f, Exception -> 0x005c }
        L_0x003d:
            iwd r3 = a     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            r5 = 26
            r4.<init>(r5)     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            java.lang.String r5 = "Response Code: "
            r4.append(r5)     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            r4.append(r2)     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            r3.b(r2, r4)     // Catch:{ IOException -> 0x005a, Exception -> 0x0058 }
            goto L_0x00a1
        L_0x0058:
            r2 = move-exception
            goto L_0x005d
        L_0x005a:
            r2 = move-exception
            goto L_0x0080
        L_0x005c:
            r2 = move-exception
        L_0x005d:
            iwd r3 = a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Exception when revoking access: "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0075
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x0079
        L_0x0075:
            java.lang.String r2 = r4.concat(r2)
        L_0x0079:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3.e(r2, r1)
            goto L_0x00a1
        L_0x007f:
            r2 = move-exception
        L_0x0080:
            iwd r3 = a
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "IOException when revoking access: "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0098
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x009c
        L_0x0098:
            java.lang.String r2 = r4.concat(r2)
        L_0x009c:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3.e(r2, r1)
        L_0x00a1:
            igv r1 = r6.c
            r1.a((defpackage.icl) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvz.run():void");
    }
}
