package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: aepu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepu implements Callable {
    private final aepp a;
    private final aeps b;
    private final aept c;

    public aepu(aepp aepp, aeps aeps, aept aept) {
        this.a = aepp;
        this.b = aeps;
        this.c = aept;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return null;
    }

    public final void a() {
        try {
            this.a.a(this.b, this.c);
        } catch (IOException e) {
            throw new aepg(3, "Exception occurred while adding Broadcast subscription", e);
        }
    }
}
