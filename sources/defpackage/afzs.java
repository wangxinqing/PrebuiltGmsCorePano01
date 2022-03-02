package defpackage;

import java.io.File;
import java.util.Arrays;

/* renamed from: afzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzs {
    public final String a;
    public final File b;
    public final String c;
    public final afzq d;
    public final agae e;
    public final ancq f = amxc.p();
    final boolean g;
    final boolean h;
    int i = 0;
    public int j;
    public afnf k = null;
    private final agab l;
    private boolean m = false;
    private afzr n = afzr.WIFI_ONLY;

    public afzs(agab agab, String str, File file, String str2, afzq afzq, agae agae) {
        this.a = str;
        this.b = file;
        this.c = str2;
        this.d = afzq;
        this.l = agab;
        this.e = agae;
        this.g = afzm.a(str);
        boolean a2 = a(str);
        this.h = a2;
        if (a2 || this.g) {
            this.n = afzr.NONE;
        }
    }

    public static boolean a(String str) {
        return str.startsWith("file:");
    }

    public final synchronized afzr a() {
        return this.n;
    }

    public final void a(afzr afzr) {
        if (!this.h && !this.g) {
            this.n = afzr;
        }
    }

    public final synchronized boolean b() {
        return this.m;
    }

    public final void c() {
        this.l.a(this);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        this.m = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afzs) {
            afzs afzs = (afzs) obj;
            if (!amqx.a(this.a, afzs.a) || !amqx.a(this.b, afzs.b) || !amqx.a(this.c, afzs.c) || !amqx.a(this.n, afzs.n) || this.m != afzs.m) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.n, Boolean.valueOf(this.m)});
    }

    public final String toString() {
        amrg a2 = amrh.a(afzs.class);
        a2.a("", (Object) this.a);
        a2.a("targetDirectory", (Object) this.b);
        a2.a("fileName", (Object) this.c);
        a2.a("requiredConnectivity", (Object) this.n);
        a2.a("canceled", this.m);
        return a2.toString();
    }
}
