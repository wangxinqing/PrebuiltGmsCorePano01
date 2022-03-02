package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: rnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnm implements Runnable {
    private final rnn a;
    private final rni b;
    private final Executor c;
    private final Set d;

    public rnm(rnn rnn, rni rni, Executor executor, Set set) {
        this.a = rnn;
        this.b = rni;
        this.c = executor;
        this.d = set;
    }

    public final void run() {
        rnn rnn = this.a;
        rni rni = this.b;
        Executor executor = this.c;
        Set set = this.d;
        synchronized (rnn.a) {
            if (rnn.a.get(rni) == executor) {
                rni.a(set);
            }
        }
    }
}
