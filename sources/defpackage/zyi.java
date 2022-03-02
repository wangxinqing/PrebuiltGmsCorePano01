package defpackage;

import java.util.ArrayList;

/* renamed from: zyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyi {
    public final String a;
    public final Long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ArrayList i;
    public final ArrayList j;
    public String k;
    public final gsj l;
    public long m;

    public zyi(zyh zyh) {
        this.a = zyh.a;
        this.k = zyh.c;
        this.c = zyh.d;
        this.m = zyh.e;
        int i2 = zyh.f;
        this.f = i2;
        int i3 = zyh.g;
        this.g = i3;
        int i4 = zyh.h;
        this.h = i4;
        this.i = zyh.i;
        this.j = zyh.j;
        this.d = i2 + i3 + i4;
        this.e = i3 + i4;
        this.l = zyh.k;
        this.b = zyh.b;
    }

    public static boolean a(gsj gsj) {
        if (!(gsj == null || (gsj.a & 1024) == 0)) {
            int a2 = gsi.a(gsj.f);
            if (a2 != 0 && a2 == 3) {
                return true;
            }
            int a3 = gsi.a(gsj.f);
            return a3 != 0 && a3 == 4;
        }
    }

    public final boolean a() {
        return this.l != null;
    }
}
