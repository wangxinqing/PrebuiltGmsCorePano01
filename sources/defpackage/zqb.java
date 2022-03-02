package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: zqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zqb implements Callable {
    private final zqd a;
    private final String b;
    private final long c;
    private final String d;
    private final Map e;

    public zqb(zqd zqd, String str, long j, String str2, Map map) {
        this.a = zqd;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = map;
    }

    public final Object call() {
        zqd zqd = this.a;
        String str = this.b;
        long j = this.c;
        String str2 = this.d;
        Map map = this.e;
        String str3 = zqd.e;
        String str4 = zqd.f;
        aucd o = auqg.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auqg auqg = (auqg) o.b;
        str.getClass();
        auqg.a = str;
        str3.getClass();
        auqg.b = str3;
        auqg.c = j;
        str2.getClass();
        auqg.d = str2;
        str4.getClass();
        auqg.f = str4;
        audr audr = auqg.e;
        if (!audr.a) {
            auqg.e = audr.a();
        }
        auqg.e.putAll(map);
        byte[] k = ((auqg) o.i()).k();
        HttpsURLConnection httpsURLConnection = null;
        try {
            String d2 = azdk.d();
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 18);
            sb.append(d2);
            sb.append("/recaptcha/api3/ae");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) jlk.a(new URL(sb.toString()), 21506);
            try {
                httpsURLConnection2.setConnectTimeout((int) azdk.b());
                httpsURLConnection2.setReadTimeout((int) azdk.c());
                httpsURLConnection2.setRequestMethod("POST");
                httpsURLConnection2.setRequestProperty("Content-type", "application/x-protobuf");
                httpsURLConnection2.setRequestProperty("Content-Length", Integer.toString(k.length));
                httpsURLConnection2.setDoOutput(true);
                httpsURLConnection2.connect();
                OutputStream outputStream = httpsURLConnection2.getOutputStream();
                outputStream.write(k);
                outputStream.close();
                int responseCode = httpsURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    String str5 = ((auqh) aucj.a((aucj) auqh.b, httpsURLConnection2.getInputStream(), aubs.c())).a;
                    jlk.a(httpsURLConnection2);
                    return str5;
                }
                throw new zor("Failed to fetch verification data", responseCode);
            } catch (IOException e2) {
                e = e2;
                httpsURLConnection = httpsURLConnection2;
                try {
                    throw new zpv("Failed to connect to server to verify the action", e);
                } catch (Throwable th) {
                    th = th;
                    jlk.a(httpsURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnection2;
                jlk.a(httpsURLConnection);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            throw new zpv("Failed to connect to server to verify the action", e);
        } catch (Throwable th3) {
            th = th3;
            jlk.a(httpsURLConnection);
            throw th;
        }
    }
}
