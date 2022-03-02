package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: cb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cb extends ct {
    final by a;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    boolean f = false;
    final boolean g;
    final cn h = new cn(this);

    public cb(by byVar, Executor executor, Executor executor2, cs csVar) {
        super(new cw(), executor, executor2, csVar);
        this.a = byVar;
        this.m = -1;
        if (this.a.c()) {
            i();
        } else {
            by byVar2 = this.a;
            cs csVar2 = this.k;
            int i = csVar2.e;
            int i2 = csVar2.a;
            boolean z = csVar2.c;
            byVar2.a(i, this.i, this.h);
        }
        if (this.a.a()) {
            int i3 = this.k.d;
        }
        this.g = false;
    }

    public final void a() {
        if (this.b == 0) {
            this.b = 1;
            cw cwVar = this.l;
            int i = cwVar.b;
            int i2 = cwVar.e;
            ((List) cwVar.c.get(0)).get(0);
            this.j.execute(new bz(this));
        }
    }

    public final void b() {
        if (this.c == 0) {
            this.c = 1;
            cw cwVar = this.l;
            int i = cwVar.b;
            int i2 = cwVar.g;
            int i3 = cwVar.e;
            ArrayList arrayList = cwVar.c;
            List list = (List) arrayList.get(arrayList.size() - 1);
            list.get(list.size() - 1);
            this.j.execute(new ca(this));
        }
    }

    public final boolean c() {
        return true;
    }

    public final cf d() {
        return this.a;
    }

    public final Object e() {
        return this.a.b();
    }

    public final void a(int i) {
        int i2 = this.k.b;
        cw cwVar = this.l;
        int i3 = cwVar.b;
        int i4 = (i + 11) - (cwVar.g + i3);
        int max = Math.max(10 - (i - i3), this.d);
        this.d = max;
        if (max > 0) {
            a();
        }
        int max2 = Math.max(i4, this.e);
        this.e = max2;
        if (max2 > 0) {
            b();
        }
    }

    public final void a(ct ctVar, cq cqVar) {
        cw cwVar = ctVar.l;
        cw cwVar2 = this.l;
        int i = cwVar2.j - cwVar.j;
        int i2 = cwVar2.i - cwVar.i;
        int i3 = cwVar.d;
        int i4 = cwVar.b;
        if (cwVar.isEmpty() || i < 0 || i2 < 0 || this.l.d != Math.max(i3 - i, 0) || this.l.b != Math.max(i4 - i2, 0) || this.l.g != cwVar.g + i + i2) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (i != 0) {
            int min = Math.min(i3, i);
            int i5 = i - min;
            int i6 = cwVar.b + cwVar.g;
            if (min != 0) {
                cqVar.b(i6, min);
            }
            if (i5 != 0) {
                cqVar.a(i6 + min, i5);
            }
        }
        if (i2 != 0) {
            int min2 = Math.min(i4, i2);
            int i7 = i2 - min2;
            if (min2 != 0) {
                cqVar.b(i4, min2);
            }
            if (i7 != 0) {
                cqVar.a(0, i7);
            }
        }
    }
}
