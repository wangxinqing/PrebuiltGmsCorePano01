package defpackage;

/* renamed from: bamz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamz extends badd {
    private final batd a;

    public bamz(batd batd) {
        this.a = batd;
    }

    public final int a() {
        return (int) this.a.b;
    }

    public final int b() {
        return this.a.e() & 255;
    }

    public final bakl c(int i) {
        batd batd = new batd();
        batd.a(this.a, (long) i);
        return new bamz(batd);
    }

    public final void close() {
        this.a.n();
    }

    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int a2 = this.a.a(bArr, i, i2);
            if (a2 != -1) {
                i2 -= a2;
                i += a2;
            } else {
                StringBuilder sb = new StringBuilder(36);
                sb.append("EOF trying to read ");
                sb.append(i2);
                sb.append(" bytes");
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
    }
}
