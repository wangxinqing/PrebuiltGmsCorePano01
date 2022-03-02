package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: ajbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbz {
    public final long a;
    public final ajcc b;
    public final ajcc c;
    public final ajcc d;
    public final ajcc e;
    public final ajaa f;

    public ajbz(ajaa ajaa, long j, long j2) {
        ajcc ajcc = new ajcc("bandwidth", ahqp.o(), j, j2);
        ajcc ajcc2 = new ajcc("general-gps", ahqp.p(), j, j2);
        ajcc ajcc3 = new ajcc("sensor-gps", ahqp.q(), j, j2);
        ajcc ajcc4 = new ajcc("burst-gps", ahqp.n(), j, j2);
        this.f = ajaa;
        this.a = j;
        this.b = ajcc;
        this.c = ajcc2;
        this.d = ajcc3;
        this.e = ajcc4;
        b(j2);
    }

    private static void a(ajcc ajcc, aqek aqek, int i) {
        aqek aqek2 = new aqek(ajck.bS);
        ajcc.a(aqek2);
        aqek.b(i, (Object) aqek2);
    }

    public final synchronized void b(long j) {
        this.b.a(j);
        this.c.a(j);
        this.d.a(j);
        this.e.a(j);
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }

    public final synchronized void a(long j) {
        this.f.f().submit(new ajby(this, j));
    }

    public final synchronized void a(long j, ByteArrayOutputStream byteArrayOutputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(1);
        aqek aqek = new aqek(ajck.bR);
        aqek.b(1, this.a);
        aqek.b(2, j);
        a(this.b, aqek, 3);
        a(this.c, aqek, 4);
        a(this.d, aqek, 5);
        a(this.e, aqek, 6);
        dataOutputStream.write(aqek.b());
        dataOutputStream.close();
    }
}
