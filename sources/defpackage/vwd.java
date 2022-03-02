package defpackage;

import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;

/* renamed from: vwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vwd implements Runnable {
    private final FastInitiation$2 a;
    private final int b;

    public vwd(FastInitiation$2 fastInitiation$2, int i) {
        this.a = fastInitiation$2;
        this.b = i;
    }

    public final void run() {
        FastInitiation$2 fastInitiation$2 = this.a;
        fastInitiation$2.a.b(this.b);
    }
}
