package defpackage;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agtm implements amqy {
    private final agtt a;
    private final agod b;
    private final agny c;
    private final TimeUnit d;
    private final long e;
    private final int f;
    private final File g;

    public agtm(agtt agtt, agod agod, agny agny, TimeUnit timeUnit, long j, int i, File file) {
        this.a = agtt;
        this.b = agod;
        this.c = agny;
        this.d = timeUnit;
        this.e = j;
        this.f = i;
        this.g = file;
    }

    public final Object a(Object obj) {
        agtt agtt = this.a;
        agod agod = this.b;
        agny agny = this.c;
        TimeUnit timeUnit = this.d;
        long j = this.e;
        int i = this.f;
        File file = this.g;
        aekn aekn = agtt.a;
        Executor executor = agtt.b;
        long millis = timeUnit.toMillis(j);
        osi osi = agtt.e;
        amsv a2 = amta.a((amsv) new agtq(agtt, file));
        agop agop = agtt.f;
        agop.getClass();
        agtr agtr = new agtr(agop);
        agtt.e.getClass();
        return new aguj(agod, (agul) obj, executor, agny, millis, i, a2, new agot(agtr, new agts(), agny));
    }
}
