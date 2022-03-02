package defpackage;

import java.io.IOException;

/* renamed from: basy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class basy implements baua {
    final /* synthetic */ baua a;
    final /* synthetic */ bata b;

    public basy(bata bata, baua baua) {
        this.b = bata;
        this.a = baua;
    }

    public final bauc bu() {
        return this.b;
    }

    public final long c(batd batd, long j) {
        this.b.c();
        try {
            long c = this.a.c(batd, j);
            this.b.a(true);
            return c;
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
            throw th;
        }
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

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
