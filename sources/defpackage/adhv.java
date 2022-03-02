package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: adhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhv {
    private static final Random a = new Random(System.currentTimeMillis());
    private final hol b;

    public adhv(Context context, String str) {
        this.b = new hol(context, "IDENTITY_FRONTEND", str);
    }

    public static int a() {
        int nextInt;
        do {
            nextInt = a.nextInt();
        } while (nextInt == 0);
        return nextInt;
    }

    public final aqmg a(String str, String str2, long j, String str3) {
        aucd o = aqmg.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmg aqmg = (aqmg) o.b;
        str.getClass();
        int i = aqmg.a | 1;
        aqmg.a = i;
        aqmg.b = str;
        str2.getClass();
        int i2 = i | 2;
        aqmg.a = i2;
        aqmg.c = str2;
        int i3 = i2 | 4;
        aqmg.a = i3;
        aqmg.d = (int) j;
        str3.getClass();
        aqmg.a = i3 | 8;
        aqmg.e = str3;
        return (aqmg) o.i();
    }

    public final void a(int i) {
        a(29020, i);
    }

    public final void a(int i, int i2) {
        aucd o = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 39;
        int i3 = aqmz.a | 1;
        aqmz.a = i3;
        aqmz.c = i - 1;
        int i4 = i3 | 2;
        aqmz.a = i4;
        aqmz.a = i4 | 16;
        aqmz.f = false;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz2 = (aqmz) aucf.i();
        aqmz2.getClass();
        aqna.b = aqmz2;
        aqna.a |= 1;
        a((aqna) o.i(), i2);
    }

    public final void a(int i, aqms aqms) {
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 39;
        int i2 = aqmz.a | 1;
        aqmz.a = i2;
        aqmz.c = 29005;
        int i3 = i2 | 2;
        aqmz.a = i3;
        int i4 = i3 | 16;
        aqmz.a = i4;
        aqmz.f = true;
        if (aqms != null) {
            aqms.getClass();
            aqmz.j = aqms;
            aqmz.a = i4 | 1024;
        }
        aucd o = aqna.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz2 = (aqmz) aucf.i();
        aqmz2.getClass();
        aqna.b = aqmz2;
        aqna.a |= 1;
        a((aqna) o.i(), i);
    }

    public final void a(aqna aqna) {
        this.b.a(aqna.k()).b();
    }

    public final void a(aqna aqna, int i) {
        hoi a2 = this.b.a(aqna.k());
        a2.a((long) i);
        a2.b();
    }

    public final void a(String str, String str2, long j, int i, boolean z) {
        int i2;
        aucd o = aqna.d.o();
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 39;
        int i3 = aqmz.a | 1;
        aqmz.a = i3;
        if (!z) {
            i2 = 29003;
        } else {
            i2 = 29002;
        }
        aqmz.c = i2 - 1;
        int i4 = i3 | 2;
        aqmz.a = i4;
        aqmz.a = i4 | 16;
        aqmz.f = true;
        aqmg a2 = a(str, str2, j, Integer.toString(i));
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a2.getClass();
        aqmz2.i = a2;
        aqmz2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        a((aqna) o.i());
    }
}
