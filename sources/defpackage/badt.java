package defpackage;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* renamed from: badt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badt extends azxj {
    private final badu a;
    private final balq b;

    public badt(badu badu, balq balq) {
        amrl.a((Object) badu, (Object) "tracer");
        this.a = badu;
        amrl.a((Object) balq, (Object) "time");
        this.b = balq;
    }

    public static Level a(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return Level.FINER;
        }
        if (i2 != 3) {
            return Level.FINEST;
        }
        return Level.FINE;
    }

    private final boolean b(int i) {
        if (i == 1) {
            return false;
        }
        badu badu = this.a;
        synchronized (badu.b) {
            Collection collection = badu.d;
        }
        return false;
    }

    public final void a(int i, String str) {
        azyx azyx = this.a.c;
        Level a2 = a(i);
        if (badu.a.isLoggable(a2)) {
            badu.a(azyx, a2, str);
        }
        b(i);
    }

    public final void a(int i, String str, Object... objArr) {
        String str2;
        Level a2 = a(i);
        b(i);
        if (badu.a.isLoggable(a2)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        a(i, str2);
    }
}
