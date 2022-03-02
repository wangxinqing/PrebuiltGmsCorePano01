package defpackage;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aaww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaww {
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static long h;
    public static String i;
    public static String j;
    public static final List k = new ArrayList();
    public static final Object l = new Object();
    public aatz a = null;
    public final Context b;
    public String m;
    public String n;
    public String o;
    public int p;
    public aucd q = aatz.l.o();
    private final aase r;
    private final int s;
    private long t;

    static {
        aaww.class.getCanonicalName();
    }

    public aaww(Context context, int i2) {
        this.b = context;
        this.s = i2;
        this.r = new aase(context, i2);
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }

    public static void a(Throwable th) {
        synchronized (l) {
            k.add(th.toString());
        }
    }

    public final void a() {
        if (this.a != null) {
            throw new IllegalStateException("Message already finalized");
        }
    }

    public final void a(int i2) {
        aucd o2 = aaty.r.o();
        int i3 = this.s;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aaty aaty = (aaty) o2.b;
        int i4 = aaty.a | 2;
        aaty.a = i4;
        aaty.c = i3;
        aase aase = this.r;
        if (aase == null) {
            long j2 = this.t;
            aaty.a = i4 | 4;
            aaty.d = j2;
        } else {
            long b2 = aase.b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty2 = (aaty) o2.b;
            aaty2.a |= 4;
            aaty2.d = b2;
        }
        boolean z = c;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aaty aaty3 = (aaty) o2.b;
        aaty3.a |= 8;
        aaty3.e = z;
        boolean a2 = jix.a(this.b);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aaty aaty4 = (aaty) o2.b;
        aaty4.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        aaty4.n = a2;
        if (d) {
            long j3 = h;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty5 = (aaty) o2.b;
            aaty5.a |= 32;
            aaty5.g = j3;
            String str = i;
            if (str != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aaty aaty6 = (aaty) o2.b;
                str.getClass();
                aaty6.a |= 128;
                aaty6.h = str;
            }
            d = false;
            i = null;
        }
        if (e) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty7 = (aaty) o2.b;
            aaty7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aaty7.i = true;
            e = false;
        }
        if (!TextUtils.isEmpty(j)) {
            String substring = j.substring(0, Math.min(128, j.length()));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty8 = (aaty) o2.b;
            substring.getClass();
            aaty8.a |= 512;
            aaty8.k = substring;
            j = null;
        }
        if (!TextUtils.isEmpty(this.m)) {
            String str2 = this.m;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty9 = (aaty) o2.b;
            str2.getClass();
            aaty9.a |= 1024;
            aaty9.l = str2;
        }
        if (!TextUtils.isEmpty(this.n)) {
            String str3 = this.n;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty10 = (aaty) o2.b;
            str3.getClass();
            aaty10.a |= 2048;
            aaty10.m = str3;
        }
        if (!TextUtils.isEmpty(this.o)) {
            String str4 = this.o;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aaty aaty11 = (aaty) o2.b;
            str4.getClass();
            aaty11.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            aaty11.o = str4;
        }
        synchronized (l) {
            if (k.size() > 0) {
                List list = k;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aaty aaty12 = (aaty) o2.b;
                if (!aaty12.j.a()) {
                    aaty12.j = aucj.a(aaty12.j);
                }
                auab.a((Iterable) list, (List) aaty12.j);
                k.clear();
            }
        }
        boolean z2 = f;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aaty aaty13 = (aaty) o2.b;
        aaty13.a |= 16384;
        aaty13.p = z2;
        boolean z3 = g;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aaty aaty14 = (aaty) o2.b;
        int i5 = aaty14.a | 32768;
        aaty14.a = i5;
        aaty14.q = z3;
        aaty14.b = i2 - 1;
        int i6 = i5 | 1;
        aaty14.a = i6;
        int i7 = this.p;
        if (!(i7 == 0 || i7 == 1)) {
            aaty14.f = i7 - 1;
            aaty14.a = i6 | 16;
        }
        aaty aaty15 = (aaty) o2.i();
        hol a3 = hol.a(this.b, "ANDROID_SNET_GCORE");
        if (azfv.m()) {
            a3.a(avsd.UNMETERED_OR_DAILY);
        }
        a3.a(aaty15.k()).b();
    }

    public aaww(Context context, long j2, int i2) {
        this.b = context;
        this.t = j2;
        this.s = i2;
        this.r = null;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }

    public aaww(Context context, aase aase, int i2) {
        this.b = context;
        this.s = i2;
        this.r = aase;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }
}
