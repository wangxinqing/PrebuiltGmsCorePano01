package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: zou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zou implements Callable {
    private final String a;
    private final String b;

    public zou(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final Object call() {
        String str = this.a;
        String str2 = this.b;
        aucd o = auqc.c.o();
        aucd o2 = auqe.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auqe auqe = (auqe) o2.b;
        str.getClass();
        auqe.a = str;
        str2.getClass();
        auqe.b = str2;
        auqe auqe2 = (auqe) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auqc auqc = (auqc) o.b;
        auqe2.getClass();
        auqc.b = auqe2;
        auqc.a = 2;
        byte[] k = ((auqc) o.i()).k();
        HttpsURLConnection httpsURLConnection = null;
        try {
            String d = azdk.d();
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
            sb.append(d);
            sb.append("/recaptcha/api3/ac");
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) jlk.a(new URL(sb.toString()), 21505);
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
                    auqd auqd = (auqd) aucj.a((aucj) auqd.c, httpsURLConnection2.getInputStream(), aubs.c());
                    jlk.a(httpsURLConnection2);
                    return auqd;
                }
                throw new zor("Failed to fetch landing token", responseCode);
            } catch (IOException e) {
                e = e;
                httpsURLConnection = httpsURLConnection2;
                try {
                    throw new zpv("Failed to connect to reCAPTCHA challenge endpoint", e);
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
        } catch (IOException e2) {
            e = e2;
            throw new zpv("Failed to connect to reCAPTCHA challenge endpoint", e);
        } catch (Throwable th3) {
            th = th3;
            jlk.a(httpsURLConnection);
            throw th;
        }
    }
}
