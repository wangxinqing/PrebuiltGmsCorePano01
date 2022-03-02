package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bams  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bams implements Runnable {
    public final bamw a;
    banz b;
    public boolean c;
    public final /* synthetic */ bamt d;

    public bams(bamt bamt, banz banz) {
        this(bamt, banz, new bamw(Level.FINE, bamt.class));
    }

    public final void run() {
        IOException iOException;
        Logger logger;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.b.a(this)) {
            try {
                bamt bamt = this.d;
                Logger logger2 = bamt.a;
                baic baic = bamt.x;
                if (baic != null) {
                    baic.b();
                }
            } catch (Throwable th) {
                try {
                    this.b.close();
                } catch (IOException e) {
                    bamt.a.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", e);
                }
                bamt bamt2 = this.d;
                Logger logger3 = bamt.a;
                bamt2.g.b();
                Thread.currentThread().setName(name);
                throw th;
            }
        }
        bamt bamt3 = this.d;
        bany bany = bany.INTERNAL_ERROR;
        babj a2 = babj.o.a("End of stream or IOException");
        Logger logger4 = bamt.a;
        bamt3.a(0, bany, a2);
        try {
            this.b.close();
        } catch (IOException e2) {
            iOException = e2;
            logger = bamt.a;
        }
        this.d.g.b();
        Thread.currentThread().setName(name);
        logger.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", iOException);
        this.d.g.b();
        Thread.currentThread().setName(name);
    }

    public bams(bamt bamt, banz banz, bamw bamw) {
        this.d = bamt;
        this.c = true;
        this.b = banz;
        this.a = bamw;
    }
}
