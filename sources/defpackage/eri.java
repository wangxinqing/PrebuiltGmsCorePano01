package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: eri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eri {
    private final hol a;

    public eri(Context context) {
        this.a = new hol(context, "ANDROID_AUTH", (String) null);
    }

    public final void a(int i) {
        if (((double) new Random().nextFloat()) < ent.ap()) {
            aucd o = anpm.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpm anpm = (anpm) o.b;
            anpm.b = i - 1;
            anpm.a |= 1;
            anpm anpm2 = (anpm) o.i();
            aucd o2 = anon.v.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anon anon = (anon) o2.b;
            anon.c = 29;
            int i2 = anon.a | 1;
            anon.a = i2;
            anpm2.getClass();
            anon.r = anpm2;
            anon.a = 134217728 | i2;
            this.a.a(((anon) o2.i()).k()).b();
        }
    }
}
