package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acac {
    public final long a = System.currentTimeMillis();
    public final List b = new ArrayList();
    public final aucd c;
    private boolean d;
    private final SparseArray e = new SparseArray();

    public acac() {
        aucd o = anpa.u.o();
        this.c = o;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anpa anpa = (anpa) o.b;
        anpa.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        anpa.m = 2;
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpa anpa2 = (anpa) aucd.b;
        anpa2.a |= 65536;
        anpa2.p = 0;
        aucd aucd2 = this.c;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anpa anpa3 = (anpa) aucd2.b;
        anpa3.a |= 131072;
        anpa3.q = 0;
    }

    private final int b(int i) {
        ArrayList arrayList = (ArrayList) this.e.get(i);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final synchronized anpa a(Context context, long j) {
        if (this.d) {
            return null;
        }
        int b2 = b(9);
        int b3 = b(10) + b(11);
        int b4 = b(12);
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpa anpa = (anpa) aucd.b;
        anpa anpa2 = anpa.u;
        anpa.a |= 512;
        anpa.i = b3;
        aucd aucd2 = this.c;
        int i = b3 + b2;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        anpa anpa3 = (anpa) aucd2.b;
        anpa3.a |= 64;
        anpa3.f = i;
        aucd aucd3 = this.c;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        anpa anpa4 = (anpa) aucd3.b;
        anpa4.a |= 128;
        anpa4.g = b2;
        aucd aucd4 = this.c;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        anpa anpa5 = (anpa) aucd4.b;
        anpa5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        anpa5.h = b4;
        aucd aucd5 = this.c;
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        ((anpa) aucd5.b).j = aucj.q();
        List list = this.b;
        if (aucd5.c) {
            aucd5.c();
            aucd5.c = false;
        }
        anpa anpa6 = (anpa) aucd5.b;
        if (!anpa6.j.a()) {
            anpa6.j = aucj.a(anpa6.j);
        }
        auab.a((Iterable) list, (List) anpa6.j);
        aucd aucd6 = this.c;
        if (aucd6.c) {
            aucd6.c();
            aucd6.c = false;
        }
        anpa anpa7 = (anpa) aucd6.b;
        anpa7.a |= 32768;
        anpa7.o = j;
        if (b(15) <= 0) {
            aucd aucd7 = this.c;
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            anpa anpa8 = (anpa) aucd7.b;
            anpa8.a |= 1024;
            anpa8.k = false;
        } else {
            aucd aucd8 = this.c;
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            anpa anpa9 = (anpa) aucd8.b;
            anpa9.a |= 1024;
            anpa9.k = true;
            if (b(13) > 0) {
                aucd aucd9 = this.c;
                if (aucd9.c) {
                    aucd9.c();
                    aucd9.c = false;
                }
                anpa anpa10 = (anpa) aucd9.b;
                anpa10.a |= 2048;
                anpa10.l = 1;
            }
        }
        aucd aucd10 = this.c;
        long currentTimeMillis = System.currentTimeMillis() - this.a;
        if (aucd10.c) {
            aucd10.c();
            aucd10.c = false;
        }
        anpa anpa11 = (anpa) aucd10.b;
        anpa11.a |= 2;
        anpa11.b = currentTimeMillis;
        anpa anpa12 = (anpa) this.c.i();
        aucd o = anon.v.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anon anon = (anon) o.b;
        anon.c = 6;
        int i2 = anon.a | 1;
        anon.a = i2;
        anpa12.getClass();
        anon.g = anpa12;
        anon.a = i2 | 64;
        new hol(context, "ANDROID_AUTH", (String) null).a(((anon) o.i()).k()).b();
        this.d = true;
        return anpa12;
    }

    public final void b() {
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpa anpa = (anpa) aucd.b;
        anpa anpa2 = anpa.u;
        anpa.a |= 262144;
        anpa.r = true;
    }

    public final void a() {
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpa anpa = (anpa) aucd.b;
        anpa anpa2 = anpa.u;
        anpa.a |= 16;
        anpa.d = true;
    }

    public final void a(int i) {
        ArrayList arrayList = (ArrayList) this.e.get(i);
        if (arrayList != null) {
            arrayList.add(Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(SystemClock.elapsedRealtime()));
        this.e.put(i, arrayList2);
    }

    public final void a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(i);
        }
    }
}
