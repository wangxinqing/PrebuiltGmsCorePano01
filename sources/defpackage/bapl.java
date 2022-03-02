package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bapl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bapl extends bapk {
    int a = this.c;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ bapm d;

    public bapl(bapm bapm, int i) {
        this.d = bapm;
        this.c = i;
    }

    public final long a() {
        if (hasNext()) {
            bapm bapm = this.d;
            baps baps = bapm.a;
            int i = bapm.b;
            int i2 = this.a;
            this.a = i2 + 1;
            this.b = i2;
            return baps.a(i + i2);
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        if (hasPrevious()) {
            bapm bapm = this.d;
            baps baps = bapm.a;
            int i = bapm.b;
            int i2 = this.a - 1;
            this.a = i2;
            this.b = i2;
            return baps.a(i + i2);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.a < this.d.size();
    }

    public final boolean hasPrevious() {
        return this.a > 0;
    }

    public final int nextIndex() {
        return this.a;
    }

    public final int previousIndex() {
        return this.a - 1;
    }

    public final void remove() {
        int i = this.b;
        if (i != -1) {
            this.d.b(i);
            int i2 = this.b;
            int i3 = this.a;
            if (i2 < i3) {
                this.a = i3 - 1;
            }
            this.b = -1;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(long j) {
        int i = this.b;
        if (i != -1) {
            this.d.b(i, j);
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(long j) {
        if (this.b != -1) {
            bapm bapm = this.d;
            int i = this.a;
            this.a = i + 1;
            bapm.a(i, j);
            this.b = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
