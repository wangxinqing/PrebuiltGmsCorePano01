package defpackage;

import android.content.SharedPreferences;

/* renamed from: svb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svb {
    final /* synthetic */ svf a;
    private final String b;
    private final boolean c;
    private boolean d;
    private boolean e;

    public svb(svf svf, String str, boolean z) {
        this.a = svf;
        iva.c(str);
        this.b = str;
        this.c = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.a.c().edit();
        edit.putBoolean(this.b, z);
        edit.apply();
        this.e = z;
    }

    public final boolean a() {
        if (!this.d) {
            this.d = true;
            this.e = this.a.c().getBoolean(this.b, this.c);
        }
        return this.e;
    }
}
