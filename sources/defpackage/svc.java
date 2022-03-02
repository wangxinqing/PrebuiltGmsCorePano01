package defpackage;

import android.content.SharedPreferences;

/* renamed from: svc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svc {
    final /* synthetic */ svf a;
    private final String b;
    private final long c;
    private boolean d;
    private long e;

    public svc(svf svf, String str, long j) {
        this.a = svf;
        iva.c(str);
        this.b = str;
        this.c = j;
    }

    public final long a() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.c().getLong(this.b, this.c);
        }
        return this.e;
    }

    public final void a(long j) {
        SharedPreferences.Editor edit = this.a.c().edit();
        edit.putLong(this.b, j);
        edit.apply();
        this.e = j;
    }
}
