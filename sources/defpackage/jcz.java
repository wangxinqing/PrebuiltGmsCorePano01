package defpackage;

import com.google.android.gms.common.stats.StatsEvent;

/* renamed from: jcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jcz implements Runnable {
    final String a;
    final StatsEvent b;
    final /* synthetic */ jda c;

    public jcz(jda jda, String str, StatsEvent statsEvent) {
        this.c = jda;
        this.a = str;
        this.b = statsEvent;
    }

    public final void run() {
        StatsEvent statsEvent;
        this.b.g();
        jda jda = this.c;
        ((jfv) jda.e).submit((Runnable) new jcx(jda, this.a, this.b));
        synchronized (this.c.h) {
            jcy jcy = (jcy) this.c.h.get(this.b.c());
            if (jcy != null && jcy.a == (statsEvent = this.b)) {
                this.c.h.remove(statsEvent.c());
            }
        }
    }
}
