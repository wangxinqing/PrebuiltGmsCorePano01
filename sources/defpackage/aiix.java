package defpackage;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: aiix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiix extends aiit {
    public static final /* synthetic */ int q = 0;
    private static final long y = TimeUnit.SECONDS.toMillis(30);
    protected final jgy j;
    protected final jiq k;
    public final aiip l = new aiiv(this);
    public final aiip m = new aiiw(this);
    public long n = y;
    public int o = 4;
    public final int p = 10;
    private final long z = Long.MAX_VALUE;

    public aiix(ajpz ajpz, jgy jgy, jiq jiq, Looper looper, aidf aidf) {
        super(ajpz, looper, aidf);
        this.j = jgy;
        this.k = jiq;
    }

    /* access modifiers changed from: protected */
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(", minpulse=");
        long j2 = this.z;
        if (j2 != Long.MAX_VALUE) {
            sb.append(j2);
            sb.append("ms");
            return;
        }
        sb.append("MAX");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GpsPulse[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    public final boolean a(aiip aiip) {
        if (aiip == this.g && this.r > this.z) {
            aiip = this.s ? this.l : this.m;
        }
        return super.a(aiip);
    }
}
