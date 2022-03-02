package defpackage;

import java.util.Set;

/* renamed from: afde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afde {
    private final char a;
    private final anax b;

    public afde(char c, Set set) {
        anav j = anax.j();
        j.b((Iterable) set);
        j.b(Character.valueOf(c));
        this.b = j.a();
        this.a = c;
    }

    public static afdd a() {
        return new afdd();
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (this.b.contains(Character.valueOf(charAt))) {
                sb.append(this.a);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
