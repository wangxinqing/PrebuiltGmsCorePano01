package defpackage;

import java.util.Iterator;

@Deprecated
/* renamed from: ium  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ium {
    private final String a;

    private ium(String str) {
        this.a = str;
    }

    public static ium a(String str) {
        return new ium(str);
    }

    static final CharSequence a(Object obj) {
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }

    public final String a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append(a(it.next()));
            while (it.hasNext()) {
                sb.append(this.a);
                sb.append(a(it.next()));
            }
        }
        return sb.toString();
    }
}
