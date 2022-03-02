package defpackage;

import java.text.DateFormat;
import java.util.Date;

/* renamed from: acxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxx extends Thread {
    private final acxa a;
    private final njy b = new njy((Class) getClass(), 16, "MetricsReaderCollector", "tron");
    private acxy c;
    private long d;
    private long e;

    public acxx(acxa acxa, acxy acxy, long j) {
        super("tron.oc.mrc.rt");
        this.d = j;
        this.a = acxa;
        this.c = acxy;
    }

    public final void run() {
        while (azqq.d()) {
            if (azqq.c()) {
                String valueOf = String.valueOf(DateFormat.getDateTimeInstance().format(new Date(this.d)));
                if (valueOf.length() == 0) {
                    new String("MetricsReader ReaderThread blocking at ");
                } else {
                    "MetricsReader ReaderThread blocking at ".concat(valueOf);
                }
            }
            acxy acxy = new acxy();
            this.c = acxy;
            long j = this.d;
            acxy.b.checkpoint();
            acxy.b.read(j);
            acxy.c = System.currentTimeMillis();
            acxy.b();
            long j2 = acxy.d;
            if (j2 == 0) {
                j2 = acxy.c;
            }
            this.d = j2;
            amky b2 = this.b.b("readLogs");
            try {
                azqq.c();
                acxy acxy2 = this.c;
                acxy2.b.reset();
                if (acxy2.b.hasNext()) {
                    this.e = 0;
                    acwy a2 = this.a.a((acwz) this.c);
                    a2.h = 2;
                    this.a.a(a2);
                } else {
                    azqq.c();
                    long j3 = this.e + 1;
                    this.e = j3;
                    if (j3 <= azqq.a.a().b()) {
                        try {
                            Thread.sleep(azqq.a.a().c());
                        } catch (Exception e2) {
                        }
                    } else {
                        azqq.c();
                        if (b2 != null) {
                            b2.close();
                            return;
                        }
                        return;
                    }
                }
                acxy.c(this.a);
                if (b2 != null) {
                    b2.close();
                }
                if (isInterrupted()) {
                    boolean c2 = azqq.c();
                    return;
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        boolean c3 = azqq.c();
        return;
        throw th;
    }
}
