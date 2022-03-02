package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: slt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class slt implements Callable {
    private final amzy a;

    public slt(amzy amzy) {
        this.a = amzy;
    }

    public final Object call() {
        anhk i = this.a.listIterator();
        while (i.hasNext()) {
            try {
                ((aorr) i.next()).get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                amrl.a((Object) cause);
                amtb.a(cause);
                amtb.a(cause, InterruptedException.class);
                throw new sln(cause);
            }
        }
        return null;
    }
}
