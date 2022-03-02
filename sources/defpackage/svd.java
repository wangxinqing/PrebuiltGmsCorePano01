package defpackage;

import android.content.SharedPreferences;

/* renamed from: svd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svd {
    final String a;
    public final String b;
    public final String c;
    public final long d;
    final /* synthetic */ svf e;

    public svd(svf svf, String str, long j) {
        this.e = svf;
        iva.c(str);
        iva.b(j > 0);
        this.a = str.concat(":start");
        this.b = str.concat(":count");
        this.c = str.concat(":value");
        this.d = j;
    }

    public final void a() {
        this.e.h();
        long a2 = this.e.A().a();
        SharedPreferences.Editor edit = this.e.c().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a2);
        edit.apply();
    }

    public final long b() {
        return this.e.c().getLong(this.a, 0);
    }
}
