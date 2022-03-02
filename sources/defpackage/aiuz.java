package defpackage;

import java.util.Map;

/* renamed from: aiuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiuz implements Runnable {
    private final aivb a;
    private final Map b;

    public aiuz(aivb aivb, Map map) {
        this.a = aivb;
        this.b = map;
    }

    public final void run() {
        aivb aivb = this.a;
        aivb.a.a(this.b);
    }
}
