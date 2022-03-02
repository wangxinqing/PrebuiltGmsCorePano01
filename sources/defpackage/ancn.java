package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: ancn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancn implements ListIterator {
    int a;
    ancm b;
    ancm c;
    ancm d;
    int e = this.f.e;
    final /* synthetic */ ancp f;

    public ancn(ancp ancp, int i) {
        this.f = ancp;
        int i2 = ancp.d;
        amrl.b(i, i2);
        if (i < i2 / 2) {
            this.b = ancp.a;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.d = ancp.b;
            this.a = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final ancm next() {
        c();
        ancp.g(this.b);
        ancm ancm = this.b;
        this.c = ancm;
        this.d = ancm;
        this.b = ancm.c;
        this.a++;
        return this.c;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ancm previous() {
        c();
        ancp.g(this.d);
        ancm ancm = this.d;
        this.c = ancm;
        this.b = ancm;
        this.d = ancm.d;
        this.a--;
        return this.c;
    }

    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    public final int nextIndex() {
        return this.a;
    }

    public final int previousIndex() {
        return this.a - 1;
    }

    public final void remove() {
        boolean z;
        c();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        ancm ancm = this.c;
        if (ancm != this.b) {
            this.d = ancm.d;
            this.a--;
        } else {
            this.b = ancm.c;
        }
        this.f.a(ancm);
        this.c = null;
        this.e = this.f.e;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }
}
