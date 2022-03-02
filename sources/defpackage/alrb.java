package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: alrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrb extends alqn {
    public static final Charset c = Charset.forName("utf-8");
    public HttpURLConnection d;
    public final alqy e;
    public final ExecutorService f;
    public Future g;
    private final CountDownLatch h = new CountDownLatch(1);
    private Future i;

    public final void a(IOException iOException) {
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection = this.d;
        int i2 = 0;
        String str = "";
        if (httpURLConnection != null) {
            try {
                i2 = httpURLConnection.getResponseCode();
                InputStream errorStream = this.d.getErrorStream();
                if (errorStream != null) {
                    CharBuffer allocate = CharBuffer.allocate(2000);
                    StringBuilder sb = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream, c));
                    for (int read = bufferedReader.read(allocate); read > 0; read = bufferedReader.read(allocate)) {
                        allocate.flip();
                        sb.append(allocate.toString());
                        allocate.clear();
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                    }
                    str = sb2;
                }
            } catch (IOException e3) {
                try {
                    bufferedReader.close();
                } catch (IOException e4) {
                }
            } catch (IOException e5) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException e6) {
                }
                throw th;
            }
            try {
                a(new alqp(i2, this.d.getHeaderFields()));
            } catch (IOException e7) {
            }
        }
        alqo alqo = new alqo(new alqs(iOException, i2, str));
        alqq alqq = this.a;
        if (alqq != null) {
            alqq.a(alqo);
        }
        b();
    }

    public final void c() {
        this.i = ((jfz) this.f).submit((Runnable) new alqz(this));
    }

    /* access modifiers changed from: protected */
    public final void d() {
        Future future = this.g;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.i;
        if (future2 != null) {
            future2.cancel(true);
        }
        this.h.countDown();
    }

    public alrb(alqy alqy, ExecutorService executorService) {
        this.e = alqy;
        this.f = executorService;
    }
}
