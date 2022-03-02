package defpackage;

import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/* renamed from: yix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yix implements yiz {
    private final yiw a;

    public yix(yiw yiw) {
        this.a = yiw;
    }

    public final yiy a(apfo apfo, String str, String str2) {
        yiy yiy;
        String valueOf = String.valueOf(this.a.a);
        int a2 = apfn.a(apfo.e);
        if (a2 == 0) {
            a2 = 1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append("?r=");
        sb.append(a2 - 1);
        String sb2 = sb.toString();
        if (azaf.h()) {
            String valueOf2 = String.valueOf(sb2);
            int i = apfo.g;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
            sb3.append(valueOf2);
            sb3.append("&c=");
            sb3.append(i);
            sb2 = sb3.toString();
        }
        URL url = new URL(sb2);
        if (ayzv.c() || "https".equals(url.getProtocol())) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setConnectTimeout(Math.max((int) azaf.b(), 30000));
                httpURLConnection.setReadTimeout(Math.max((int) azaf.a.a().n(), 30000));
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                if (str2 != null && !str2.isEmpty()) {
                    httpURLConnection.setRequestProperty("X-SERVER-TOKEN", str2);
                }
                if (str != null && !str.isEmpty()) {
                    httpURLConnection.setRequestProperty("Authorization", str.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str));
                }
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                apfo.a(gZIPOutputStream);
                gZIPOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    yiy = yiy.a((apfp) aucj.a((aucj) apfp.f, anmr.a(httpURLConnection.getInputStream()), aubs.c()), httpURLConnection.getHeaderFieldInt("Retry-After", 0), responseCode);
                } else if (responseCode != 401) {
                    yiy = yiy.a(responseCode);
                } else {
                    yiy = yiy.a();
                }
                return yiy;
            } finally {
                httpURLConnection.disconnect();
            }
        } else {
            String valueOf3 = String.valueOf(this.a.a);
            throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Cannot contact server without HTTPS: ") : "Cannot contact server without HTTPS: ".concat(valueOf3));
        }
    }
}
