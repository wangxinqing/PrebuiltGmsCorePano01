package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: akqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqd implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ akqj b;

    public akqd(akqj akqj, Map map) {
        this.b = akqj;
        this.a = map;
    }

    public final void run() {
        akqj akqj = this.b;
        Map map = this.a;
        if (akqj.c != null) {
            for (Map.Entry entry : map.entrySet()) {
                akqj.c.a((akqm) entry.getKey(), (List) entry.getValue());
            }
        }
    }
}
