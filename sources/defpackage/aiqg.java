package defpackage;

import java.util.Set;

/* renamed from: aiqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiqg implements Runnable {
    private final aiqo a;
    private final Set b;

    public aiqg(aiqo aiqo, Set set) {
        this.a = aiqo;
        this.b = set;
    }

    public final void run() {
        aiqo aiqo = this.a;
        aiqo.a(this.b);
        aiqo.d = true;
    }
}
