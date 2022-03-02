package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: aun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aun implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public aun(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x01f8=Splitter:B:60:0x01f8, B:71:0x023a=Splitter:B:71:0x023a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            android.content.Context r0 = r9.a
            java.lang.String r1 = r9.b
            azg r2 = new azg
            r2.<init>(r0, r1)
            azf r0 = r2.b
            r1 = 0
            r3 = 0
            java.lang.String r4 = r0.b     // Catch:{ FileNotFoundException -> 0x007f }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x007f }
            android.content.Context r6 = r0.a     // Catch:{ FileNotFoundException -> 0x007f }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ FileNotFoundException -> 0x007f }
            aze r7 = defpackage.aze.JSON     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r7 = defpackage.azf.a(r4, r7, r1)     // Catch:{ FileNotFoundException -> 0x007f }
            r5.<init>(r6, r7)     // Catch:{ FileNotFoundException -> 0x007f }
            boolean r6 = r5.exists()     // Catch:{ FileNotFoundException -> 0x007f }
            if (r6 != 0) goto L_0x0040
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x007f }
            android.content.Context r6 = r0.a     // Catch:{ FileNotFoundException -> 0x007f }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ FileNotFoundException -> 0x007f }
            aze r7 = defpackage.aze.ZIP     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r4 = defpackage.azf.a(r4, r7, r1)     // Catch:{ FileNotFoundException -> 0x007f }
            r5.<init>(r6, r4)     // Catch:{ FileNotFoundException -> 0x007f }
            boolean r4 = r5.exists()     // Catch:{ FileNotFoundException -> 0x007f }
            if (r4 == 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r5 = r3
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            if (r5 == 0) goto L_0x0080
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r6 = r5.getAbsolutePath()
            java.lang.String r7 = ".zip"
            boolean r6 = r6.endsWith(r7)
            if (r6 != 0) goto L_0x0057
            aze r6 = defpackage.aze.JSON
            goto L_0x0059
        L_0x0057:
            aze r6 = defpackage.aze.ZIP
        L_0x0059:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Cache hit for "
            r7.append(r8)
            java.lang.String r0 = r0.b
            r7.append(r0)
            java.lang.String r0 = " at "
            r7.append(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            r7.append(r0)
            r7.toString()
            int r0 = defpackage.bay.a
            oq r0 = new oq
            r0.<init>(r6, r4)
            goto L_0x0081
        L_0x007f:
            r0 = move-exception
        L_0x0080:
            r0 = r3
        L_0x0081:
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r4 = r0.a
            aze r4 = (defpackage.aze) r4
            java.lang.Object r0 = r0.b
            java.io.InputStream r0 = (java.io.InputStream) r0
            aze r5 = defpackage.aze.ZIP
            if (r4 != r5) goto L_0x009b
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream
            r4.<init>(r0)
            java.lang.String r0 = r2.a
            avi r0 = defpackage.aus.a((java.util.zip.ZipInputStream) r4, (java.lang.String) r0)
            goto L_0x00a1
        L_0x009b:
            java.lang.String r4 = r2.a
            avi r0 = defpackage.aus.a((java.io.InputStream) r0, (java.lang.String) r4)
        L_0x00a1:
            java.lang.Object r0 = r0.a
            if (r0 == 0) goto L_0x00a7
            r3 = r0
            goto L_0x00a9
        L_0x00a7:
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            if (r3 != 0) goto L_0x024f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Animation for "
            r0.append(r3)
            java.lang.String r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = " not found in cache. Fetching from network."
            r0.append(r3)
            r0.toString()
            int r0 = defpackage.bay.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0248 }
            r0.<init>()     // Catch:{ IOException -> 0x0248 }
            java.lang.String r3 = "Fetching "
            r0.append(r3)     // Catch:{ IOException -> 0x0248 }
            java.lang.String r3 = r2.a     // Catch:{ IOException -> 0x0248 }
            r0.append(r3)     // Catch:{ IOException -> 0x0248 }
            r0.toString()     // Catch:{ IOException -> 0x0248 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0248 }
            java.lang.String r3 = r2.a     // Catch:{ IOException -> 0x0248 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0248 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0248 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0248 }
            java.lang.String r3 = "GET"
            r0.setRequestMethod(r3)     // Catch:{ IOException -> 0x0248 }
            r0.connect()     // Catch:{ Exception -> 0x023d }
            java.io.InputStream r3 = r0.getErrorStream()     // Catch:{ Exception -> 0x023d }
            if (r3 == 0) goto L_0x00f3
        L_0x00f1:
            goto L_0x01ce
        L_0x00f3:
            int r3 = r0.getResponseCode()     // Catch:{ Exception -> 0x023d }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x00f1
            java.lang.String r3 = r0.getContentType()     // Catch:{ Exception -> 0x023d }
            if (r3 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            java.lang.String r3 = "application/json"
        L_0x0104:
            java.lang.String r4 = "application/zip"
            boolean r3 = r3.contains(r4)     // Catch:{ Exception -> 0x023d }
            if (r3 != 0) goto L_0x012d
            aze r3 = defpackage.aze.JSON     // Catch:{ Exception -> 0x023d }
            azf r4 = r2.b     // Catch:{ Exception -> 0x023d }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ Exception -> 0x023d }
            java.io.File r4 = r4.a(r5, r3)     // Catch:{ Exception -> 0x023d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x023d }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x023d }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x023d }
            r6.<init>(r4)     // Catch:{ Exception -> 0x023d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x023d }
            java.lang.String r4 = r2.a     // Catch:{ Exception -> 0x023d }
            avi r4 = defpackage.aus.a((java.io.InputStream) r5, (java.lang.String) r4)     // Catch:{ Exception -> 0x023d }
            goto L_0x0149
        L_0x012d:
            aze r3 = defpackage.aze.ZIP     // Catch:{ Exception -> 0x023d }
            azf r4 = r2.b     // Catch:{ Exception -> 0x023d }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ Exception -> 0x023d }
            java.io.File r4 = r4.a(r5, r3)     // Catch:{ Exception -> 0x023d }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x023d }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x023d }
            r6.<init>(r4)     // Catch:{ Exception -> 0x023d }
            r5.<init>(r6)     // Catch:{ Exception -> 0x023d }
            java.lang.String r4 = r2.a     // Catch:{ Exception -> 0x023d }
            avi r4 = defpackage.aus.a((java.util.zip.ZipInputStream) r5, (java.lang.String) r4)     // Catch:{ Exception -> 0x023d }
        L_0x0149:
            java.lang.Object r5 = r4.a     // Catch:{ Exception -> 0x023d }
            r6 = 1
            if (r5 == 0) goto L_0x01b6
            azf r2 = r2.b     // Catch:{ Exception -> 0x023d }
            java.lang.String r5 = r2.b     // Catch:{ Exception -> 0x023d }
            java.lang.String r3 = defpackage.azf.a(r5, r3, r6)     // Catch:{ Exception -> 0x023d }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x023d }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x023d }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x023d }
            r5.<init>(r2, r3)     // Catch:{ Exception -> 0x023d }
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x023d }
            java.lang.String r3 = ".temp"
            java.lang.String r7 = ""
            java.lang.String r2 = r2.replace(r3, r7)     // Catch:{ Exception -> 0x023d }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x023d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x023d }
            boolean r2 = r5.renameTo(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d }
            r7.<init>()     // Catch:{ Exception -> 0x023d }
            java.lang.String r8 = "Copying temp file to real file ("
            r7.append(r8)     // Catch:{ Exception -> 0x023d }
            r7.append(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.String r8 = ")"
            r7.append(r8)     // Catch:{ Exception -> 0x023d }
            r7.toString()     // Catch:{ Exception -> 0x023d }
            if (r2 != 0) goto L_0x01b6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d }
            r2.<init>()     // Catch:{ Exception -> 0x023d }
            java.lang.String r7 = "Unable to rename cache file "
            r2.append(r7)     // Catch:{ Exception -> 0x023d }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x023d }
            r2.append(r5)     // Catch:{ Exception -> 0x023d }
            java.lang.String r5 = " to "
            r2.append(r5)     // Catch:{ Exception -> 0x023d }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x023d }
            r2.append(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.String r3 = "."
            r2.append(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x023d }
            defpackage.bay.a(r2)     // Catch:{ Exception -> 0x023d }
        L_0x01b6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d }
            r2.<init>()     // Catch:{ Exception -> 0x023d }
            java.lang.String r3 = "Completed fetch from network. Success: "
            r2.append(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.Object r3 = r4.a     // Catch:{ Exception -> 0x023d }
            if (r3 == 0) goto L_0x01c6
            r1 = 1
            goto L_0x01c7
        L_0x01c6:
        L_0x01c7:
            r2.append(r1)     // Catch:{ Exception -> 0x023d }
            r2.toString()     // Catch:{ Exception -> 0x023d }
            goto L_0x022d
        L_0x01ce:
            r0.getResponseCode()     // Catch:{ Exception -> 0x023d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x023d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x023d }
            java.io.InputStream r4 = r0.getErrorStream()     // Catch:{ Exception -> 0x023d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x023d }
            r1.<init>(r3)     // Catch:{ Exception -> 0x023d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d }
            r3.<init>()     // Catch:{ Exception -> 0x023d }
        L_0x01e4:
            java.lang.String r4 = r1.readLine()     // Catch:{ Exception -> 0x0233 }
            if (r4 == 0) goto L_0x01f3
            r3.append(r4)     // Catch:{ Exception -> 0x0233 }
            r4 = 10
            r3.append(r4)     // Catch:{ Exception -> 0x0233 }
            goto L_0x01e4
        L_0x01f3:
            r1.close()     // Catch:{ Exception -> 0x01f7 }
            goto L_0x01f8
        L_0x01f7:
            r1 = move-exception
        L_0x01f8:
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x023d }
            avi r4 = new avi     // Catch:{ Exception -> 0x023d }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x023d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023d }
            r5.<init>()     // Catch:{ Exception -> 0x023d }
            java.lang.String r6 = "Unable to fetch "
            r5.append(r6)     // Catch:{ Exception -> 0x023d }
            java.lang.String r2 = r2.a     // Catch:{ Exception -> 0x023d }
            r5.append(r2)     // Catch:{ Exception -> 0x023d }
            java.lang.String r2 = ". Failed with "
            r5.append(r2)     // Catch:{ Exception -> 0x023d }
            int r2 = r0.getResponseCode()     // Catch:{ Exception -> 0x023d }
            r5.append(r2)     // Catch:{ Exception -> 0x023d }
            java.lang.String r2 = "\n"
            r5.append(r2)     // Catch:{ Exception -> 0x023d }
            r5.append(r1)     // Catch:{ Exception -> 0x023d }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x023d }
            r3.<init>(r1)     // Catch:{ Exception -> 0x023d }
            r4.<init>((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x023d }
        L_0x022d:
            r0.disconnect()     // Catch:{ IOException -> 0x0248 }
            goto L_0x0254
        L_0x0231:
            r2 = move-exception
            goto L_0x0235
        L_0x0233:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0231 }
        L_0x0235:
            r1.close()     // Catch:{ Exception -> 0x0239 }
            goto L_0x023a
        L_0x0239:
            r1 = move-exception
        L_0x023a:
            throw r2     // Catch:{ Exception -> 0x023d }
        L_0x023b:
            r1 = move-exception
            goto L_0x0244
        L_0x023d:
            r1 = move-exception
            avi r4 = new avi     // Catch:{ all -> 0x023b }
            r4.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x023b }
            goto L_0x022d
        L_0x0244:
            r0.disconnect()     // Catch:{ IOException -> 0x0248 }
            throw r1     // Catch:{ IOException -> 0x0248 }
        L_0x0248:
            r0 = move-exception
            avi r4 = new avi
            r4.<init>((java.lang.Throwable) r0)
            goto L_0x0254
        L_0x024f:
            avi r4 = new avi
            r4.<init>((java.lang.Object) r3)
        L_0x0254:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aun.call():java.lang.Object");
    }
}
