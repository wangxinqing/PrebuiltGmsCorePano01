package defpackage;

import java.util.Map;

/* renamed from: agwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwg implements Runnable {
    private final agwj a;
    private final Map b;

    public agwg(agwj agwj, Map map) {
        this.a = agwj;
        this.b = map;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
