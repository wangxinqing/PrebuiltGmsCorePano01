package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: amre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amre {
    public final String b;

    public amre(amre amre) {
        this.b = amre.b;
    }

    public static amre a(char c) {
        return new amre(String.valueOf(c));
    }

    private amre(String str) {
        amrl.a((Object) str);
        this.b = str;
    }

    public static amre a(String str) {
        return new amre(str);
    }

    static CharSequence a(Object obj) {
        amrl.a(obj);
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }

    public final amre a() {
        return new amrc(this, this);
    }

    public final String a(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public final String a(Object obj, Object obj2, Object... objArr) {
        amrl.a((Object) objArr);
        return a((Iterable) new amrd(objArr, obj, obj2));
    }

    public final String a(Object[] objArr) {
        return a((Iterable) Arrays.asList(objArr));
    }

    public void a(Appendable appendable, Iterator it) {
        amrl.a((Object) appendable);
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.b);
                appendable.append(a(it.next()));
            }
        }
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            a((Appendable) sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
