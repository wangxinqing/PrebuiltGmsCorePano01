package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: imv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class imv implements Callable {
    private final imz a;
    private final inb b;
    private final ilw c;
    private final Set d;

    public imv(imz imz, inb inb, ilw ilw, Set set) {
        this.a = imz;
        this.b = inb;
        this.c = ilw;
        this.d = set;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d);
    }
}
