package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bamd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bamd implements baoa {
    private static final Logger d = Logger.getLogger(bamt.class.getName());
    public final bamc a;
    public final baoa b;
    public final bamw c;

    public bamd(bamc bamc, baoa baoa, bamw bamw) {
        amrl.a((Object) bamc, (Object) "transportExceptionHandler");
        this.a = bamc;
        amrl.a((Object) baoa, (Object) "frameWriter");
        this.b = baoa;
        amrl.a((Object) bamw, (Object) "frameLogger");
        this.c = bamw;
    }

    public final void a() {
        throw null;
    }

    public final void a(baom baom) {
        throw null;
    }

    public final void a(boolean z, int i, batd batd, int i2) {
        throw null;
    }

    public final void a(boolean z, int i, List list) {
        throw null;
    }

    public final void b() {
        try {
            this.b.b();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    public final void b(baom baom) {
        throw null;
    }

    public final void close() {
        Level level;
        try {
            this.b.close();
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger = d;
            if (iOException.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            logger.logp(level, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", iOException);
        }
    }

    public final void a(int i, long j) {
        this.c.a(2, i, j);
        try {
            this.b.a(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    public final void a(int i, bany bany) {
        this.c.a(2, i, bany);
        try {
            this.b.a(i, bany);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    public final void a(bany bany, byte[] bArr) {
        this.c.a(2, 0, bany, batg.a(bArr));
        try {
            this.b.a(bany, bArr);
            this.b.b();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    public final void a(boolean z, int i, int i2) {
        if (z) {
            bamw bamw = this.c;
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (bamw.a()) {
                Logger logger = bamw.a;
                Level level = bamw.b;
                String a2 = bamu.a(2);
                StringBuilder sb = new StringBuilder(a2.length() + 42);
                sb.append(a2);
                sb.append(" PING: ack=true bytes=");
                sb.append(j);
                logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb.toString());
            }
        } else {
            this.c.a(2, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.b.a(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }
}
