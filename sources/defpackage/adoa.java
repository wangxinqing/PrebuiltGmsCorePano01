package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;

/* renamed from: adoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adoa implements Runnable {
    private final HttpURLConnection a;
    private final int b;

    public adoa(HttpURLConnection httpURLConnection, int i) {
        this.a = httpURLConnection;
        this.b = i;
    }

    public final void run() {
        try {
            int responseCode = this.a.getResponseCode();
            if (responseCode != this.b) {
                throw new RuntimeException("Execution exception", new adnw(this.a.getHeaderFields(), String.format(Locale.US, "Unexpected status code: %d.", new Object[]{Integer.valueOf(responseCode)})));
            }
        } catch (IOException e) {
            throw new RuntimeException("Execution exception", new adnw("Unable to get response code.", (Throwable) e));
        }
    }
}
