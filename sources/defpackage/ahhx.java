package defpackage;

import android.os.StrictMode;
import java.util.concurrent.Executor;

/* renamed from: ahhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhx implements ahhv {
    public final amzy a;
    public final amzy b;
    private final Executor c;

    public ahhx(Executor executor, amzy amzy, amzy amzy2) {
        this.c = executor;
        this.a = amzy;
        this.b = amzy2;
    }

    public final void a() {
        StrictMode.ThreadPolicy b2 = ahhr.b(new StrictMode.ThreadPolicy.Builder().build());
        ahhw ahhw = new ahhw(this);
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder(b2);
        builder.penaltyListener(this.c, ahhw);
        ahhr.a(builder.build());
    }
}
