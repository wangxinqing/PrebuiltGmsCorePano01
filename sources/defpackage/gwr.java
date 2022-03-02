package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: gwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwr {
    public final DropBoxManager a;
    public final SharedPreferences b;
    public final boolean c;
    public final boolean d;
    public final gwq e;
    public final String f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final amri l;
    public final Context m;
    public final boolean n;
    public String o = null;
    public final hag p;
    public final String q;
    public final boolean r;
    public final amri s;
    private final int t;

    public gwr(gwp gwp) {
        this.m = gwp.a;
        this.a = gwp.b;
        this.b = gwp.c;
        this.q = gwp.k;
        this.p = gwp.d;
        this.n = gwp.e;
        this.c = gwp.f;
        this.d = gwp.g;
        this.e = gwp.h;
        this.f = gwp.i;
        this.g = gwp.l;
        this.h = gwp.m;
        this.i = gwp.n;
        this.j = gwp.p;
        this.r = gwp.q;
        this.t = gwp.u;
        this.k = gwp.r;
        this.s = gwp.s;
        this.l = gwp.t;
    }

    public static gwp a(Context context) {
        boolean z;
        if (hxk.d.b(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        return new gwp(context, z);
    }

    private final boolean a(int i2) {
        return (this.t & i2) == i2;
    }

    public final boolean b() {
        return a(2);
    }

    public final boolean c() {
        return a(4);
    }

    public final boolean d() {
        return a(8);
    }

    public final boolean e() {
        return a(16);
    }

    public final boolean f() {
        return a(32);
    }

    public final boolean g() {
        return a(64);
    }

    public final boolean h() {
        return a(128);
    }

    public final boolean i() {
        return a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public final boolean j() {
        return a(512);
    }

    public final boolean k() {
        return a(1024);
    }

    public final boolean l() {
        return a(2048);
    }

    public final boolean m() {
        return a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
    }

    public final boolean n() {
        return a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
    }

    public final boolean a() {
        return a(1);
    }
}
