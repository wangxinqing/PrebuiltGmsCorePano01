package defpackage;

import android.content.SharedPreferences;

/* renamed from: sve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sve {
    final /* synthetic */ svf a;
    private final String b;
    private boolean c;
    private String d;

    public sve(svf svf, String str) {
        this.a = svf;
        iva.c(str);
        this.b = str;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.a.c().getString(this.b, (String) null);
        }
        return this.d;
    }

    public final void a(String str) {
        if (this.a.v().a(sud.aD) || !szj.b(str, this.d)) {
            SharedPreferences.Editor edit = this.a.c().edit();
            edit.putString(this.b, str);
            edit.apply();
            this.d = str;
        }
    }
}
