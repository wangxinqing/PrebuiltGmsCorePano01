package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: aluu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aluu {
    public static final amiw a(alsr alsr, amiw amiw) {
        amiv amiv = amiv.KIND_NOT_SET;
        int ordinal = amiw.b.ordinal();
        if (ordinal == 8) {
            amit f = amiw.f();
            String str = amiw.c;
            int i = f.b;
            String str2 = f.d;
            int i2 = f.c;
            if (str.equals(str2)) {
                if (i2 > i) {
                    i2--;
                } else if (i2 < i) {
                    i++;
                }
            }
            return aluv.a(str2, i2, str, i);
        } else if (ordinal != 10) {
            return ((alui) alsr).a(amiw.c).a(amiw);
        } else {
            amie h = amiw.h();
            LinkedList linkedList = new LinkedList();
            for (amiw a : h.a()) {
                linkedList.push(a(alsr, a));
            }
            return aluv.a((List) linkedList);
        }
    }
}
