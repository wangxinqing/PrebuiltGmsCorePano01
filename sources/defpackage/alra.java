package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;

/* renamed from: alra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alra implements Runnable {
    final CharBuffer a = CharBuffer.allocate(2000);
    BufferedReader b = null;
    final /* synthetic */ alrb c;

    public alra(alrb alrb) {
        this.c = alrb;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        try {
            this.b = new BufferedReader(new InputStreamReader(this.c.d.getInputStream(), alrb.c));
            while (true) {
                if (Thread.interrupted() || this.c.b != 4) {
                    BufferedReader bufferedReader = this.b;
                } else {
                    int read = this.b.read(this.a);
                    if (read > 0) {
                        this.a.flip();
                        alrb alrb = this.c;
                        CharBuffer charBuffer = this.a;
                        int position = charBuffer.position();
                        int limit = this.a.limit();
                        alqq alqq = alrb.a;
                        if (alqq != null) {
                            alqq.a(charBuffer, position, limit);
                        }
                        this.a.clear();
                    } else if (read == -1) {
                        this.c.b();
                        BufferedReader bufferedReader2 = this.b;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e) {
                            }
                        }
                        httpURLConnection = this.c.d;
                        if (httpURLConnection == null) {
                            return;
                        }
                    }
                }
            }
            BufferedReader bufferedReader3 = this.b;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (IOException e2) {
                }
            }
            httpURLConnection = this.c.d;
            if (httpURLConnection == null) {
                return;
            }
        } catch (IOException e3) {
            this.c.a(e3);
            BufferedReader bufferedReader4 = this.b;
            if (bufferedReader4 != null) {
                try {
                    bufferedReader4.close();
                } catch (IOException e4) {
                }
            }
            httpURLConnection = this.c.d;
            if (httpURLConnection == null) {
                return;
            }
        } catch (Throwable th) {
            BufferedReader bufferedReader5 = this.b;
            if (bufferedReader5 != null) {
                try {
                    bufferedReader5.close();
                } catch (IOException e5) {
                }
            }
            HttpURLConnection httpURLConnection2 = this.c.d;
            if (httpURLConnection2 != null) {
                jlk.a(httpURLConnection2);
            }
            throw th;
        }
        jlk.a(httpURLConnection);
    }
}
