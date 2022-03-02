package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: anab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class anab {
    Object[] a;
    int b;

    public anab() {
        this(4);
    }

    private final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, amzm.a(length, i2));
        }
    }

    public anab(int i) {
        this.a = new Object[(i + i)];
        this.b = 0;
    }

    public anaf a() {
        return anfu.a(this.b, this.a);
    }

    public final void a(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
    }

    public void a(Object obj, Object obj2) {
        a(this.b + 1);
        amxg.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }
}
