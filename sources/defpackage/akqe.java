package defpackage;

import java.util.Map;

/* renamed from: akqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqe implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ akqj b;

    public akqe(akqj akqj, Map map) {
        this.b = akqj;
        this.a = map;
    }

    public final void run() {
        akqj akqj = this.b;
        Map map = this.a;
        if (akqj.d != null) {
            for (Map.Entry entry : map.entrySet()) {
                akqj.d.a((String) entry.getKey(), (akrb) entry.getValue());
            }
        }
    }
}
