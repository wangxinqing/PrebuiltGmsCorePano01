package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: aid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aid {
    public static final ThreadLocal a = new ThreadLocal();
    public final ou b = new ou();
    public final ArrayList c = new ArrayList();
    long d = 0;
    public boolean e = false;
    private final ahz f = new ahz(this);
    private aib g;

    public static aid a() {
        if (a.get() == null) {
            a.set(new aid());
        }
        return (aid) a.get();
    }

    public final aib b() {
        if (this.g == null) {
            int i = Build.VERSION.SDK_INT;
            this.g = new aib(this.f);
        }
        return this.g;
    }
}
