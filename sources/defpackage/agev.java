package defpackage;

import android.os.SystemClock;

/* renamed from: agev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agev {
    final long a;
    long b;
    long c;
    int d;
    int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    String k;
    String[] l;
    basc m;
    barb n;
    int o;
    int p;
    public int q;
    public int r;
    int s;
    int t;
    int u;
    int v;

    public agev(String str) {
        this(str, false);
    }

    public final void a(int i2) {
        if (i2 >= 0) {
            this.j = i2;
        }
    }

    public agev(String str, boolean z) {
        this.v = 1;
        this.g = null;
        if (str == null) {
            str = null;
        } else if (str.isEmpty()) {
            str = null;
        }
        this.f = str;
        this.h = z;
        this.a = SystemClock.elapsedRealtime();
    }

    public final void a() {
        this.b = SystemClock.elapsedRealtime() - this.a;
    }

    public final void a(int i2, int i3) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = i2;
        this.e = i3;
    }

    public final void a(String str) {
        if (str != null && !str.isEmpty()) {
            this.k = str;
        }
    }
}
