package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: om  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class om implements Iterator, Map.Entry {
    int a;
    int b;
    boolean c = false;
    final /* synthetic */ oo d;

    public om(oo ooVar) {
        this.d = ooVar;
        this.a = ooVar.a() - 1;
        this.b = -1;
    }

    public final boolean equals(Object obj) {
        if (this.c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!og.a(entry.getKey(), this.d.a(this.b, 0)) || !og.a(entry.getValue(), this.d.a(this.b, 1))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final int hashCode() {
        int i;
        if (this.c) {
            int i2 = 0;
            Object a2 = this.d.a(this.b, 0);
            Object a3 = this.d.a(this.b, 1);
            if (a2 != null) {
                i = a2.hashCode();
            } else {
                i = 0;
            }
            if (a3 != null) {
                i2 = a3.hashCode();
            }
            return i ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final void remove() {
        if (this.c) {
            this.d.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
