package defpackage;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;

/* renamed from: car  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class car {
    public final atkd a;
    public final int b;
    public final bsz c;

    public car(atkd atkd, int i, bsz bsz) {
        iva.a((Object) atkd);
        this.a = atkd;
        this.b = i;
        this.c = bsz;
    }

    public static car a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        aucd o = atkd.e.o();
        String str2 = contextManagerClientInfo.g;
        if (str2 == null) {
            str2 = contextManagerClientInfo.b;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atkd atkd = (atkd) o.b;
        str2.getClass();
        int i = atkd.a | 1;
        atkd.a = i;
        atkd.b = str2;
        String str3 = contextManagerClientInfo.h;
        if (str3 == null) {
            str3 = contextManagerClientInfo.d;
        }
        str3.getClass();
        int i2 = i | 2;
        atkd.a = i2;
        atkd.c = str3;
        str.getClass();
        atkd.a = i2 | 4;
        atkd.d = str;
        atkd atkd2 = (atkd) o.i();
        int i3 = contextManagerClientInfo.i;
        if (i3 == -1) {
            i3 = contextManagerClientInfo.c;
        }
        return new car(atkd2, i3, contextManagerClientInfo.a());
    }

    public final String a() {
        return this.a.b;
    }

    public final String b() {
        return this.a.c;
    }

    public final String c() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        car car;
        if (this == obj) {
            return true;
        }
        if (obj instanceof car) {
            car = (car) obj;
        } else if (!(obj instanceof cas)) {
            return false;
        } else {
            car = ((cas) obj).b;
        }
        return TextUtils.equals(a(), car.a()) && this.c.equals(car.c) && TextUtils.equals(b(), car.b()) && TextUtils.equals(c(), car.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), this.c, b(), c()});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a(a());
        a2.a(Integer.valueOf(this.b));
        a2.a(this.c);
        a2.a(b());
        a2.a(c());
        return a2.toString();
    }
}
