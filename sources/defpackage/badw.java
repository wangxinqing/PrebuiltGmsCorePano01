package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: badw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badw implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ azxk b;
    final /* synthetic */ baee c;

    public badw(baee baee, long j, azxk azxk) {
        this.c = baee;
        this.a = j;
        this.b = azxk;
    }

    public final void run() {
        baee baee = this.c;
        long j = this.a;
        bahb bahb = new bahb();
        baee.f.a(bahb);
        long abs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1);
        long abs2 = Math.abs(j) % TimeUnit.SECONDS.toNanos(1);
        StringBuilder sb = new StringBuilder();
        sb.append("deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(".%09d", new Object[]{Long.valueOf(abs2)}));
        sb.append("s. ");
        sb.append(bahb);
        this.c.a(babj.f.b(sb.toString()), this.b);
    }
}
