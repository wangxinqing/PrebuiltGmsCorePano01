package defpackage;

import android.text.TextUtils;
import java.util.TimeZone;

/* renamed from: jvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jvz implements jvh {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");
    public final atme b;

    public jvz(atme atme) {
        iva.a((Object) atme);
        this.b = atme;
    }

    public static atme a(atmd atmd, TimeZone timeZone, long j, long j2) {
        aucd o = atme.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atme atme = (atme) o.b;
        atme.b = atmd.n;
        atme.a |= 1;
        if (timeZone == null || TextUtils.isEmpty(timeZone.getID())) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atme atme2 = (atme) o.b;
            atme2.a |= 32;
            atme2.f = true;
        } else {
            String id = timeZone.getID();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atme atme3 = (atme) o.b;
            id.getClass();
            int i = atme3.a | 2;
            atme3.a = i;
            atme3.c = id;
            atme3.a = i | 32;
            atme3.f = false;
        }
        atme atme4 = (atme) o.b;
        int i2 = atme4.a | 4;
        atme4.a = i2;
        atme4.d = j;
        atme4.a = i2 | 8;
        atme4.e = j2;
        return (atme) o.i();
    }

    public final int a() {
        return !this.b.f ? -1 : 45;
    }

    public static jvz a(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        atmd atmd;
        boolean z5 = true;
        iva.b(true);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (j <= 86400000) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        if (j2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.b(z3);
        if (j2 <= 86400000) {
            z4 = true;
        } else {
            z4 = false;
        }
        iva.b(z4);
        if (j > j2) {
            z5 = false;
        }
        iva.b(z5);
        atmd a2 = atmd.a(2);
        if (a2 != null) {
            atmd = a2;
        } else {
            atmd = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        }
        return new jvz(a(atmd, (TimeZone) null, j, j2));
    }
}
