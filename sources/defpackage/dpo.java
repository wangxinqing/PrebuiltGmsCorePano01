package defpackage;

import android.content.SharedPreferences;

/* renamed from: dpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpo {
    public final long a;
    final /* synthetic */ dpp b;
    private final String c;

    public dpo(dpp dpp, String str, long j) {
        this.b = dpp;
        iva.c(str);
        iva.b(j > 0);
        this.c = str;
        this.a = j;
    }

    private final String e() {
        return this.c.concat(":start");
    }

    public final void a() {
        long a2 = this.b.c().a();
        SharedPreferences.Editor edit = this.b.a.edit();
        edit.remove(c());
        edit.remove(d());
        edit.putLong(e(), a2);
        edit.commit();
    }

    public final long b() {
        return this.b.a.getLong(e(), 0);
    }

    public final String c() {
        return this.c.concat(":count");
    }

    /* access modifiers changed from: protected */
    public final String d() {
        return this.c.concat(":value");
    }
}
