package defpackage;

import java.util.NoSuchElementException;

/* renamed from: anbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbu extends anhj {
    int a = 0;
    final /* synthetic */ Object[] b;

    public anbu(Object[] objArr) {
        this.b = objArr;
    }

    public final boolean hasNext() {
        return this.a < 2;
    }

    public final Object next() {
        if (hasNext()) {
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
