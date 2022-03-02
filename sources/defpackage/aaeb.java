package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.PrintWriter;

/* renamed from: aaeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaeb implements aaed {
    public int a;
    private final anaf b;
    private final Context c;

    public aaeb(Context context) {
        anab anab = new anab();
        anab.a(3, new aaea(this, 2, amzy.h()));
        anab.a(7, new aaea(this, 1, amzy.a((Object) 11)));
        this.b = anab.a();
        this.c = context;
    }

    public final ConnectivityManager a() {
        return (ConnectivityManager) this.c.getSystemService("connectivity");
    }

    public final synchronized void a(Context context, int i) {
        aaea aaea = (aaea) this.b.get(Integer.valueOf(i));
        if (aaea != null) {
            this.a |= aaea.a;
            aaea.a(a());
        }
    }

    public final synchronized void a(PrintWriter printWriter) {
        aaec.a(printWriter, this.a);
    }
}
