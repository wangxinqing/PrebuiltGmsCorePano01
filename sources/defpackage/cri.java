package defpackage;

import android.content.SharedPreferences;

/* renamed from: cri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cri {
    final String b;
    final crj c;

    protected cri(crj crj, String str) {
        this.c = crj;
        this.b = str;
    }

    public final Object a() {
        return a(this.c.a());
    }

    /* access modifiers changed from: protected */
    public abstract Object a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract void a(SharedPreferences.Editor editor, Object obj);

    public final void b() {
        crj.a(this.c.a().edit().remove(this.b));
    }

    public final void a(Object obj) {
        SharedPreferences.Editor edit = this.c.a().edit();
        a(edit, obj);
        crj.a(edit);
    }
}
