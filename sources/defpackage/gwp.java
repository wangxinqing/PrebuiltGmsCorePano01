package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkRequest;
import android.os.DropBoxManager;

/* renamed from: gwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwp {
    public final Context a;
    public DropBoxManager b = null;
    public SharedPreferences c = null;
    public hag d;
    public boolean e = true;
    public boolean f = false;
    public boolean g = true;
    public gwq h = new gwq();
    public String i = "Unspecified task";
    public boolean j = false;
    public String k = awrn.b();
    public long l = 1256454000000L;
    public boolean m = false;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public boolean r = false;
    public amri s = ampu.a;
    public final amri t = ampu.a;
    public int u = 16383;

    public gwp(Context context, boolean z) {
        iva.a((Object) context);
        this.a = context;
        this.n = z;
    }

    public final gwr a() {
        boolean z;
        if (!jgu.f(this.a)) {
            this.e = false;
        }
        if (this.j) {
            this.e = false;
            if (!awrq.a.a().f() || !this.q) {
                z = false;
            } else {
                z = true;
            }
            this.q = z;
        }
        if (this.o) {
            this.e = false;
            this.p = true;
            this.q = false;
        }
        if (jix.c(this.a)) {
            this.q = false;
        }
        return new gwr(this);
    }

    public final void a(int i2, int i3, String str, String str2, boolean z) {
        aucd o2 = hag.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hag hag = (hag) o2.b;
        int i4 = i2 - 1;
        if (i2 != 0) {
            hag.b = i4;
            int i5 = hag.a | 1;
            hag.a = i5;
            int i6 = i5 | 2;
            hag.a = i6;
            hag.c = i3;
            str.getClass();
            int i7 = i6 | 4;
            hag.a = i7;
            hag.d = str;
            str2.getClass();
            int i8 = i7 | 8;
            hag.a = i8;
            hag.e = str2;
            hag.a = i8 | 16;
            hag.f = z;
            this.d = (hag) o2.i();
            return;
        }
        throw null;
    }

    public final void a(long j2) {
        this.l = Math.max(this.l, j2);
    }

    public final void a(NetworkRequest networkRequest) {
        this.s = amri.b(networkRequest);
    }

    public final void a(String str) {
        this.e = !str.equals("UPLOAD_NONE");
    }
}
