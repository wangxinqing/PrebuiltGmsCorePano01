package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: jpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpn {
    private final Context a;

    public jpn(Context context) {
        this.a = context;
    }

    public final void a(int i, int i2, Integer num, Long l, Long l2, Long l3, Long l4) {
        if (((double) new Random().nextFloat()) <= awum.a.a().a()) {
            aucd o = aotg.i.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotg aotg = (aotg) o.b;
            aotg.b = i - 1;
            aotg.a |= 1;
            aotg aotg2 = (aotg) o.b;
            aotg2.c = i2 - 1;
            aotg2.a |= 2;
            if (num != null) {
                int intValue = num.intValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aotg aotg3 = (aotg) o.b;
                aotg3.a |= 4;
                aotg3.d = intValue;
            }
            long longValue = l.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotg aotg4 = (aotg) o.b;
            aotg4.a |= 8;
            aotg4.e = longValue;
            long longValue2 = l2.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotg aotg5 = (aotg) o.b;
            aotg5.a |= 16;
            aotg5.f = longValue2;
            long longValue3 = l3.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotg aotg6 = (aotg) o.b;
            aotg6.a |= 32;
            aotg6.g = longValue3;
            long longValue4 = l4.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotg aotg7 = (aotg) o.b;
            aotg7.a |= 64;
            aotg7.h = longValue4;
            new hol(this.a, "GMS_CORE_CONTACT_INTERACTIONS", (String) null).a(((aotg) o.i()).k()).b();
        }
    }
}
