package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: gsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gsc {
    public static gsc a(String str, int i, byte[] bArr) {
        List list;
        int length = bArr.length;
        if (length == 0) {
            list = Collections.emptyList();
        } else {
            list = new aonz(bArr, 0, length);
        }
        return new grw(str, i, amzy.a((Collection) list));
    }

    public abstract String a();

    public abstract int b();

    public abstract List c();
}
