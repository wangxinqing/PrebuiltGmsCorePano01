package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: afdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdd {
    public char a = '\\';
    private final Set b = new HashSet();

    public final afde a() {
        return new afde(this.a, this.b);
    }

    public final void a(char c) {
        this.b.add(Character.valueOf(c));
    }
}
