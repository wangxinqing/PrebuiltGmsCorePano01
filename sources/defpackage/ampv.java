package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ampv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ampv implements Iterator {
    public int a = 2;
    final CharSequence b;
    final amqm c;
    final boolean d;
    int e = 0;
    int f;
    private Object g;

    public abstract int a(int i);

    public abstract int b(int i);

    public final boolean hasNext() {
        String str;
        int i;
        int i2;
        amrl.b(this.a != 4);
        int i3 = this.a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        } else if (i4 == 0) {
            return true;
        } else {
            if (i4 == 2) {
                return false;
            }
            this.a = 4;
            int i5 = this.e;
            while (true) {
                int i6 = this.e;
                if (i6 == -1) {
                    this.a = 3;
                    str = null;
                    break;
                }
                int a2 = a(i6);
                if (a2 == -1) {
                    a2 = this.b.length();
                    this.e = -1;
                    i = -1;
                } else {
                    i = b(a2);
                    this.e = i;
                }
                if (i == i5) {
                    int i7 = i + 1;
                    this.e = i7;
                    if (i7 > this.b.length()) {
                        this.e = -1;
                    }
                } else {
                    while (i5 < a2 && this.c.a(this.b.charAt(i5))) {
                        i5++;
                    }
                    while (i2 > i5) {
                        int i8 = i2 - 1;
                        if (!this.c.a(this.b.charAt(i8))) {
                            break;
                        }
                        a2 = i8;
                    }
                    if (this.d && i5 == i2) {
                        i5 = this.e;
                    }
                }
            }
            int i9 = this.f;
            if (i9 == 1) {
                i2 = this.b.length();
                this.e = -1;
                while (i2 > i5) {
                    int i10 = i2 - 1;
                    if (!this.c.a(this.b.charAt(i10))) {
                        break;
                    }
                    i2 = i10;
                }
            } else {
                this.f = i9 - 1;
            }
            str = this.b.subSequence(i5, i2).toString();
            this.g = str;
            if (this.a == 3) {
                return false;
            }
            this.a = 1;
            return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            Object obj = this.g;
            this.g = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected ampv(amsk amsk, CharSequence charSequence) {
        this.c = amsk.a;
        this.d = amsk.b;
        this.f = amsk.c;
        this.b = charSequence;
    }
}
