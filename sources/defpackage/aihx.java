package defpackage;

import java.io.PrintWriter;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: aihx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aihx implements Runnable {
    private final aiib a;
    private final PrintWriter b;
    private final CountDownLatch c;

    public aihx(aiib aiib, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.a = aiib;
        this.b = printWriter;
        this.c = countDownLatch;
    }

    public final void run() {
        aiib aiib = this.a;
        PrintWriter printWriter = this.b;
        CountDownLatch countDownLatch = this.c;
        printWriter.println("\nFused Device Orientation Provider State:");
        aiii aiii = aiib.f;
        printWriter.println("--Start OrientationEngine Log--");
        aiii.a(printWriter);
        printWriter.println("Active Device Orientation Requests:");
        printWriter.println(aiii.f.toString());
        printWriter.println("--End OrientationEngine Log--");
        printWriter.println("\nActive Device Orientation Listener ");
        for (aihv a2 : aiib.c.c()) {
            aiib.a(a2, printWriter);
        }
        if (!aiib.c.d().isEmpty()) {
            printWriter.println("\nInactive Device Orientation Listener ");
            for (aihv a3 : aiib.c.d()) {
                aiib.a(a3, printWriter);
            }
        }
        printWriter.println();
        printWriter.println("Event Log:");
        ListIterator b2 = aiib.e.iterator();
        while (b2.hasNext()) {
            b2.next();
        }
        while (b2.hasPrevious()) {
            printWriter.println((String) b2.previous());
        }
        countDownLatch.countDown();
    }
}
