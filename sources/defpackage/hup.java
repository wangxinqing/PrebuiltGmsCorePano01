package defpackage;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hup implements Iterator {
    int a = 0;
    final /* synthetic */ huq b;

    public hup(huq huq) {
        this.b = huq;
    }

    /* renamed from: a */
    public final File next() {
        if (hasNext()) {
            huq huq = this.b;
            String[] strArr = huq.b;
            int i = this.a;
            String str = strArr[i];
            strArr[i] = null;
            this.a = i + 1;
            return new File(huq.a, str);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        String[] strArr = this.b.b;
        return strArr != null && this.a < strArr.length;
    }
}
