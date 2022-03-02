package defpackage;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* renamed from: aive  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aive implements Runnable {
    private final aivu a;
    private final PrintWriter b;
    private final CountDownLatch c;

    public aive(aivu aivu, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.a = aivu;
        this.b = printWriter;
        this.c = countDownLatch;
    }

    public final void run() {
        String str;
        aivu aivu = this.a;
        PrintWriter printWriter = this.b;
        CountDownLatch countDownLatch = this.c;
        aivu.l.a(printWriter);
        aivu.b.a();
        aizy aizy = aivu.f.f;
        aivu.b.a((Format) new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US), System.currentTimeMillis() - SystemClock.elapsedRealtime(), printWriter);
        if (aivu.i.a != 1) {
            str = "trusted";
        } else {
            str = "untrusted";
        }
        printWriter.println(str.length() == 0 ? new String("Wifi timestamps are currently ") : "Wifi timestamps are currently ".concat(str));
        countDownLatch.countDown();
    }
}
