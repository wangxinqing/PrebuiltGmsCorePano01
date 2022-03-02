package defpackage;

import java.io.IOException;

/* renamed from: basx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class basx implements batz {
    final /* synthetic */ batz a;
    final /* synthetic */ bata b;

    public basx(bata bata, batz batz) {
        this.b = bata;
        this.a = batz;
    }

    public final void a(batd batd, long j) {
        baud.a(batd.b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                batw batw = batd.a;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (batw.c - batw.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    batw = batw.f;
                }
                this.b.c();
                try {
                    this.a.a(batd, j2);
                    j -= j2;
                    this.b.a(true);
                } catch (IOException e) {
                    throw this.b.b(e);
                } catch (Throwable th) {
                    this.b.a(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final bauc bu() {
        return this.b;
    }

    public final void close() {
        this.b.c();
        try {
            this.a.close();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    public final void flush() {
        this.b.c();
        try {
            this.a.flush();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
