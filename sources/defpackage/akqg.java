package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: akqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqg implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ List b;
    final /* synthetic */ akpw c;

    public akqg(akpw akpw, Map map, List list) {
        this.c = akpw;
        this.a = map;
        this.b = list;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
