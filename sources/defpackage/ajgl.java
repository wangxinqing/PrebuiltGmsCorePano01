package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: ajgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajgl {
    public final Executor a;
    public final ahfv b;

    public ajgl(Executor executor, String str) {
        agzz a2 = ahaa.a(ihs.b());
        a2.a("location");
        a2.b(str.concat(".pb"));
        Uri a3 = a2.a();
        ahee g = ahef.g();
        g.a(a3);
        g.a((audx) airl.b);
        this.b = qve.a.a(g.a());
        this.a = executor;
    }

    static final /* synthetic */ void a(aorr aorr) {
        try {
            aorl.a((Future) aorr);
        } catch (ExecutionException e) {
        } catch (CancellationException e2) {
        }
    }
}
