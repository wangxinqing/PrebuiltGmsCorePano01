package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: arpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpj {
    public int a;
    private int b;
    private int c;
    private int d;
    private final Map e = new HashMap();

    public arpj() {
        a();
    }

    public static void a(double d2) {
        Math.min(((int) (d2 / 11.0d)) * 11, 88);
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.a = 0;
    }

    public final void b() {
        this.b++;
    }

    public final void c() {
        this.d++;
    }

    public final void d() {
        this.c++;
    }

    public final arpi a(String str) {
        arpi arpi;
        synchronized (this.e) {
            arpi = (arpi) this.e.get(str);
            if (arpi == null) {
                arpi = new arpi();
                this.e.put(str, arpi);
            }
        }
        return arpi;
    }
}
