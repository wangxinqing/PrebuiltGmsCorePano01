package defpackage;

import java.util.NoSuchElementException;

/* renamed from: anbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbx extends anhj {
    boolean a;
    final /* synthetic */ Object b;

    public anbx(Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.a;
    }

    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
