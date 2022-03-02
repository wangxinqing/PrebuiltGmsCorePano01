package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bapo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bapo extends bapk {
    int a = this.c;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ bapp d;

    public bapo(bapp bapp, int i) {
        this.d = bapp;
        this.c = i;
    }

    public final long a() {
        if (hasNext()) {
            long[] jArr = this.d.a;
            int i = this.a;
            this.a = i + 1;
            this.b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        if (hasPrevious()) {
            long[] jArr = this.d.a;
            int i = this.a - 1;
            this.a = i;
            this.b = i;
            return jArr[i];
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.a < this.d.b;
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
        bapp bapp = this.d;
        int i = this.a;
        this.a = i + 1;
        bapp.a(i, j);
        this.b = -1;
    }
}
