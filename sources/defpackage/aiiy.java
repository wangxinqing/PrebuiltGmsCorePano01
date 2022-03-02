package defpackage;

/* renamed from: aiiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aiiy extends aijc {
    public long r = Long.MAX_VALUE;
    public boolean s = false;
    public long t = 0;

    public final void a(long j) {
        if (this.r != j) {
            this.r = j;
            g();
        }
    }

    public final void b() {
        if (this.s) {
            g();
        }
        super.b();
    }

    /* access modifiers changed from: protected */
    public void a(StringBuilder sb) {
        super.a(sb);
        sb.append(", interval=");
        long j = this.r;
        if (j != Long.MAX_VALUE) {
            sb.append(j);
            sb.append("ms");
        } else {
            sb.append("MAX");
        }
        sb.append(", trigger=");
        sb.append(this.s);
    }

    public final void b(long j) {
        if (this.t != j) {
            this.t = j;
            g();
        }
    }
}
