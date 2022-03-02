package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: baux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baux implements bawd {
    final /* synthetic */ boolean a;
    final /* synthetic */ bavb b;

    public baux(bavb bavb, boolean z) {
        this.b = bavb;
        this.a = z;
    }

    public final void a() {
        this.b.c.flip();
        bavb bavb = this.b;
        long j = bavb.d;
        if (j == -1 || j - bavb.e >= ((long) bavb.c.remaining())) {
            bavb bavb2 = this.b;
            ByteBuffer byteBuffer = bavb2.c;
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                i += bavb2.g.write(byteBuffer);
            }
            bavb2.h.flush();
            bavb2.e += (long) i;
            bavb bavb3 = this.b;
            long j2 = bavb3.e;
            long j3 = bavb3.d;
            if (j2 < j3 || (j3 == -1 && !this.a)) {
                bavb3.c.clear();
                this.b.a.set(0);
                this.b.a((bawd) new bauw(this));
            } else if (j3 == -1) {
                bavb3.c();
            } else if (j3 != j2) {
                bavb3.a((Throwable) new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.b.e), Long.valueOf(this.b.d)})));
            } else {
                bavb3.c();
            }
        } else {
            bavb bavb4 = this.b;
            Locale locale = Locale.getDefault();
            bavb bavb5 = this.b;
            bavb4.a((Throwable) new IllegalArgumentException(String.format(locale, "Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(bavb5.e + ((long) bavb5.c.remaining())), Long.valueOf(this.b.d)})));
        }
    }
}
