package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: aepw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepw implements Callable {
    private final aepp a;
    private final aeps b;

    public aepw(aepp aepp, aeps aeps) {
        this.a = aepp;
        this.b = aeps;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }

    public final void a() {
        try {
            this.a.a(this.b);
        } catch (IOException e) {
            throw new aepg(3, "Exception occurred while removing Broadcast subscription", e);
        }
    }
}
