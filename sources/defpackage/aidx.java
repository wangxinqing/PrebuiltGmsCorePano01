package defpackage;

import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: aidx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidx implements Runnable {
    private final aiei a;
    private final PrintWriter b;
    private final String[] c;
    private final FileDescriptor d;
    private final CountDownLatch e;

    public aidx(aiei aiei, PrintWriter printWriter, String[] strArr, FileDescriptor fileDescriptor, CountDownLatch countDownLatch) {
        this.a = aiei;
        this.b = printWriter;
        this.c = strArr;
        this.d = fileDescriptor;
        this.e = countDownLatch;
    }

    public final void run() {
        aiei aiei = this.a;
        PrintWriter printWriter = this.b;
        String[] strArr = this.c;
        FileDescriptor fileDescriptor = this.d;
        CountDownLatch countDownLatch = this.e;
        printWriter.println("\nFused Location Provider State:");
        String valueOf = String.valueOf(ajqm.a(System.currentTimeMillis()));
        printWriter.print(valueOf.length() == 0 ? new String("Current System Time: ") : "Current System Time: ".concat(valueOf));
        String valueOf2 = String.valueOf(ajqm.b(SystemClock.elapsedRealtime()));
        printWriter.println(valueOf2.length() == 0 ? new String(", Current Elapsed Time: ") : ", Current Elapsed Time: ".concat(valueOf2));
        int length = strArr.length;
        String str = null;
        if (length <= 0 || !"--clients".equals(strArr[0])) {
            int c2 = rns.c(aiei.f);
            StringBuilder sb = new StringBuilder(29);
            sb.append("Location Enabled: ");
            sb.append(c2);
            printWriter.println(sb.toString());
            boolean a2 = rns.a(aiei.f);
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("  NLP/GLS Consent: ");
            sb2.append(a2);
            printWriter.println(sb2.toString());
            printWriter.println();
            aiei.e.a(fileDescriptor, printWriter, strArr);
            printWriter.println();
            printWriter.println("Active Location Requests:");
            for (aidd a3 : aiei.j.c()) {
                aiei.a(a3, printWriter);
            }
            if (!aiei.j.d().isEmpty()) {
                printWriter.println();
                printWriter.println("Inactive Location Requests:");
                for (aidd a4 : aiei.j.d()) {
                    aiei.a(a4, printWriter);
                }
            }
            printWriter.println();
            aiei.a(printWriter, (String) null);
            printWriter.println();
            int i = 0;
            for (short s : aidg.b) {
                i += s;
            }
            StringBuilder sb3 = new StringBuilder("FLP WakeLock Count:");
            for (int i2 = 0; i2 < aidg.b.length; i2++) {
                short s2 = aidg.b[i2];
                if (s2 > 0) {
                    int round = Math.round((((float) s2) / ((float) i)) * 100.0f);
                    sb3.append("\n  ");
                    sb3.append(aidg.a[i2]);
                    sb3.append(": ");
                    sb3.append(s2);
                    sb3.append(" (");
                    sb3.append(round);
                    sb3.append("%)");
                }
            }
            printWriter.println(sb3.toString());
            printWriter.println();
            printWriter.println("Event Log:");
            ListIterator b2 = aiei.u.iterator();
            while (b2.hasNext()) {
                b2.next();
            }
            while (b2.hasPrevious()) {
                printWriter.println((String) b2.previous());
            }
            printWriter.println();
        } else {
            if (length > 1) {
                if (!"--reset".equals(strArr[1])) {
                    str = strArr[1];
                } else {
                    jkl jkl = aiei.q;
                    jkl.a = SystemClock.elapsedRealtime();
                    jkl.b.clear();
                }
            }
            aiei.a(printWriter, str);
        }
        aiei.r.a(printWriter);
        countDownLatch.countDown();
    }
}
