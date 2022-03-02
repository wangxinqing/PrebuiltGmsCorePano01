package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aguo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aguo implements Callable {
    private final agus a;
    private final List b;

    public aguo(agus agus, List list) {
        this.a = agus;
        this.b = list;
    }

    public final Object call() {
        this.a.b(this.b);
        return null;
    }
}
