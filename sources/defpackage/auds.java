package defpackage;

import java.util.Map;

/* renamed from: auds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auds {
    public static final boolean b(Object obj) {
        return !((audr) obj).a;
    }

    public static final int a(int i, Object obj, Object obj2) {
        audr audr = (audr) obj;
        audq audq = (audq) obj2;
        int i2 = 0;
        if (!audr.isEmpty()) {
            for (Map.Entry entry : audr.entrySet()) {
                i2 += aubk.i(i) + aubk.m(audq.a(audq.a, entry.getKey(), entry.getValue()));
            }
        }
        return i2;
    }

    public static final audp a(Object obj) {
        return ((audq) obj).a;
    }

    public static final Object a() {
        return audr.b.a();
    }

    public static final Object a(Object obj, Object obj2) {
        audr audr = (audr) obj;
        audr audr2 = (audr) obj2;
        if (!audr2.isEmpty()) {
            if (!audr.a) {
                audr = audr.a();
            }
            audr.c();
            if (!audr2.isEmpty()) {
                audr.putAll(audr2);
            }
        }
        return audr;
    }
}
