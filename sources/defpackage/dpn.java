package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* renamed from: dpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class dpn extends dma {
    public static final byte[] b = "\n".getBytes();
    public final dpw a;
    private final String c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", dmb.a, Build.VERSION.RELEASE, dpx.a(Locale.getDefault()), Build.MODEL, Build.ID});

    public dpn(dmd dmd) {
        super(dmd);
        this.a = new dpw(dmd.c);
    }

    private static final void a(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final URL t() {
        f();
        String valueOf = String.valueOf(dmy.g());
        f();
        String valueOf2 = String.valueOf((String) doz.o.a());
        try {
            return new URL(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final boolean s() {
        NetworkInfo networkInfo;
        dkw.a();
        q();
        try {
            networkInfo = ((ConnectivityManager) d().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        b("No network connectivity");
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[SYNTHETIC, Splitter:B:33:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[SYNTHETIC, Splitter:B:44:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            defpackage.iva.a((java.lang.Object) r6)
            defpackage.iva.a((java.lang.Object) r7)
            int r1 = r7.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "POST bytes, url"
            r5.b(r3, r2, r6)
            boolean r2 = defpackage.dlz.o()
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            java.lang.String r3 = "Post payload\n"
            r5.a(r3, r2)
        L_0x0022:
            r2 = 0
            android.content.Context r3 = r5.d()     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            r5.a((java.lang.String) r3)     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            java.net.HttpURLConnection r6 = r5.a((java.net.URL) r6)     // Catch:{ IOException -> 0x007d, all -> 0x0079 }
            r3 = 1
            r6.setDoOutput(r3)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r6.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r6.connect()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r2.write(r7)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r5.a((java.net.HttpURLConnection) r6)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 == r1) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            dly r1 = r5.i()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r1.b()     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
        L_0x0056:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            r5.b(r1, r3)     // Catch:{ IOException -> 0x0074, all -> 0x0072 }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r1 = move-exception
            r5.e(r0, r1)
        L_0x0069:
            if (r6 == 0) goto L_0x006e
            r6.disconnect()
        L_0x006e:
            r5.b()
            return r7
        L_0x0072:
            r7 = move-exception
            goto L_0x009d
        L_0x0074:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x0080
        L_0x0079:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L_0x009d
        L_0x007d:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L_0x0080:
            java.lang.String r1 = "Network POST connection error"
            r5.d(r1, r7)     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x008f
            r6.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r6 = move-exception
            r5.e(r0, r6)
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r2.disconnect()
        L_0x0094:
            r5.b()
            r6 = 0
            return r6
        L_0x0099:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L_0x009d:
            if (r2 == 0) goto L_0x00a7
            r2.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r1 = move-exception
            r5.e(r0, r1)
        L_0x00a7:
            if (r6 == 0) goto L_0x00ac
            r6.disconnect()
        L_0x00ac:
            r5.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpn.a(java.net.URL, byte[]):int");
    }

    /* access modifiers changed from: package-private */
    public final String a(dpc dpc, boolean z) {
        String str;
        iva.a((Object) dpc);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : dpc.a.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    a(sb, str2, (String) entry.getValue());
                }
            }
            a(sb, "ht", String.valueOf(dpc.d));
            a(sb, "qt", String.valueOf(c().a() - dpc.d));
            f();
            a(sb, "_gmsv", dmb.a);
            if (z) {
                long b2 = dpx.b(dpc.a("_s", "0"));
                if (b2 == 0) {
                    str = String.valueOf(dpc.c);
                } else {
                    str = String.valueOf(b2);
                }
                a(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e("Failed to encode name or value", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            f();
            httpURLConnection.setConnectTimeout(((Integer) doz.y.a()).intValue());
            f();
            httpURLConnection.setReadTimeout(((Integer) doz.z.a()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public final URL a(dpc dpc) {
        String str;
        if (dpc.f) {
            f();
            String valueOf = String.valueOf(dmy.g());
            f();
            String valueOf2 = String.valueOf(dmy.h());
            str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        } else {
            f();
            String valueOf3 = String.valueOf(dmy.i());
            f();
            String valueOf4 = String.valueOf(dmy.h());
            str = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL a(dpc dpc, String str) {
        String str2;
        if (dpc.f) {
            f();
            String g = dmy.g();
            f();
            String h = dmy.h();
            int length = String.valueOf(g).length();
            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(h).length() + str.length());
            sb.append(g);
            sb.append(h);
            sb.append("?");
            sb.append(str);
            str2 = sb.toString();
        } else {
            f();
            String i = dmy.i();
            f();
            String h2 = dmy.h();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 1 + String.valueOf(h2).length() + str.length());
            sb2.append(i);
            sb2.append(h2);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a("Network initialized. User agent", this.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x001e }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x001c }
        L_0x000a:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x001c }
            if (r2 > 0) goto L_0x000a
            if (r4 == 0) goto L_0x001b
            r4.close()     // Catch:{ IOException -> 0x0016 }
            return
        L_0x0016:
            r4 = move-exception
            r3.e(r0, r4)
            return
        L_0x001b:
            return
        L_0x001c:
            r1 = move-exception
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            r4 = 0
        L_0x0020:
            if (r4 == 0) goto L_0x002a
            r4.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r4 = move-exception
            r3.e(r0, r4)
        L_0x002a:
            goto L_0x002c
        L_0x002b:
            throw r1
        L_0x002c:
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpn.a(java.net.HttpURLConnection):void");
    }
}
