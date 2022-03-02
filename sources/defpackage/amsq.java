package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: amsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsq {
    private final Map a = new HashMap();
    private int b = -1;

    public final void a() {
        char[][] cArr = new char[(this.b + 1)][];
        for (Map.Entry entry : this.a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
    }

    public final void a(char c, String str) {
        this.a.put(Character.valueOf(c), str);
        if (c > this.b) {
            this.b = c;
        }
    }
}
