package defpackage;

import android.content.Context;
import android.os.Binder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: lyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyq {
    private static final String a;

    static {
        StringBuilder sb = new StringBuilder(22);
        sb.append("DroidGuard/201216073");
        a = sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auay a(java.lang.String r1, defpackage.auay r2) {
        /*
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            r1 = 6147(0x1803, float:8.614E-42)
            java.net.URLConnection r1 = defpackage.jlk.a(r0, r1)     // Catch:{ all -> 0x0019 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0019 }
            auay r2 = a((java.net.HttpURLConnection) r1, (defpackage.auay) r2)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0016
            defpackage.jlk.a(r1)
        L_0x0016:
            return r2
        L_0x0017:
            r2 = move-exception
            goto L_0x001c
        L_0x0019:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0021
            defpackage.jlk.a(r1)
        L_0x0021:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyq.a(java.lang.String, auay):auay");
    }

    public static String b(Context context) {
        if (jix.a(context)) {
            String a2 = jli.a("gms.droidguard.sw_domain", "");
            if (a2.length() > 0) {
                String valueOf = String.valueOf(a2);
                return valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
            }
        }
        return axeq.a.a().a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auay a(java.lang.String r2, defpackage.auay r3, defpackage.opp r4) {
        /*
            if (r4 != 0) goto L_0x0010
            java.net.URL r4 = new java.net.URL     // Catch:{ all -> 0x0032 }
            r4.<init>(r2)     // Catch:{ all -> 0x0032 }
            r2 = 6147(0x1803, float:8.614E-42)
            java.net.URLConnection r2 = defpackage.jlk.a(r4, r2)     // Catch:{ all -> 0x0032 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0032 }
            goto L_0x001f
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            android.net.Network r4 = r4.a     // Catch:{ all -> 0x0032 }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0032 }
            r0.<init>(r2)     // Catch:{ all -> 0x0032 }
            java.net.URLConnection r2 = r4.openConnection(r0)     // Catch:{ all -> 0x0032 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0032 }
        L_0x001f:
            java.lang.String r4 = "Content-Type"
            java.lang.String r0 = "application/x-protobuf"
            r2.setRequestProperty(r4, r0)     // Catch:{ all -> 0x0030 }
            auay r3 = a((java.net.HttpURLConnection) r2, (defpackage.auay) r3)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002f
            defpackage.jlk.a(r2)
        L_0x002f:
            return r3
        L_0x0030:
            r3 = move-exception
            goto L_0x0037
        L_0x0032:
            r2 = move-exception
            r3 = 0
            r1 = r3
            r3 = r2
            r2 = r1
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            defpackage.jlk.a(r2)
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyq.a(java.lang.String, auay, opp):auay");
    }

    private static auay a(HttpURLConnection httpURLConnection, auay auay) {
        InputStream inputStream;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(auay.a());
        httpURLConnection.setRequestProperty("User-Agent", a);
        httpURLConnection.setConnectTimeout((int) axew.a.a().b());
        httpURLConnection.setReadTimeout((int) axew.a.a().c());
        izj.b(6147);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            auay.a(outputStream);
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                inputStream = httpURLConnection.getInputStream();
                auay a2 = auay.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                izj.a();
                return a2;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Received status code [");
            sb.append(responseCode);
            sb.append("] instead of [");
            sb.append(200);
            sb.append("].");
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            izj.a();
            throw th;
        }
        throw th;
    }

    public static void a(Context context) {
        context.getSystemService("connectivity");
    }
}
