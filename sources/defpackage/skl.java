package defpackage;

import java.util.concurrent.Callable;

/* renamed from: skl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class skl implements Callable {
    private final amzy a;

    public skl(amzy amzy) {
        this.a = amzy;
    }

    public final Object call() {
        amzy amzy = this.a;
        anij anij = skn.a;
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            ((aorr) i.next()).get();
        }
        return null;
    }
}
