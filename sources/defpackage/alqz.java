package defpackage;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: alqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alqz implements Runnable {
    final /* synthetic */ alrb a;

    public alqz(alrb alrb) {
        this.a = alrb;
    }

    public final void run() {
        byte[] bArr;
        try {
            String str = this.a.e.d;
            if (str != null) {
                bArr = str.getBytes(alrb.c);
            } else {
                bArr = null;
            }
            alrb alrb = this.a;
            alrb.d = (HttpURLConnection) jlk.a(new URL(alrb.e.b), 2818);
            this.a.d.setConnectTimeout(30000);
            this.a.d.setReadTimeout(90000);
            alrb alrb2 = this.a;
            alrb2.d.setRequestMethod(alrb2.e.a.c);
            for (Map.Entry entry : this.a.e.c.entrySet()) {
                this.a.d.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (bArr != null) {
                this.a.d.setDoOutput(true);
                this.a.d.setFixedLengthStreamingMode(bArr.length);
            }
            this.a.d.connect();
            synchronized (this.a) {
                alrb alrb3 = this.a;
                if (alrb3.b == 2) {
                    alrb3.b = 4;
                } else {
                    throw new IllegalStateException("Expected connection state to be CONNECTING.");
                }
            }
            if (bArr != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.a.d.getOutputStream());
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
            }
            alrb alrb4 = this.a;
            alrb4.a(new alqp(alrb4.d.getResponseCode(), this.a.d.getHeaderFields()));
            alrb alrb5 = this.a;
            alrb5.g = ((jfz) alrb5.f).submit((Runnable) new alra(alrb5));
        } catch (IOException e) {
            this.a.a(e);
        }
    }
}
