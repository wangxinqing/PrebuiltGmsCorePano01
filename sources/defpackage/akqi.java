package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: akqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqi implements Runnable {
    final /* synthetic */ akqk a;
    final /* synthetic */ Map b;
    final /* synthetic */ List c;

    public akqi(akqk akqk, Map map, List list) {
        this.a = akqk;
        this.b = map;
        this.c = list;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
