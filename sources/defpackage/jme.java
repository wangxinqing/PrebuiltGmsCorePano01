package defpackage;

import android.content.Context;
import android.widget.AdapterView;

/* renamed from: jme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jme {
    public AdapterView.OnItemSelectedListener a;
    public String b;
    public String[] c;
    private final Context d;
    private final sg e;
    private String f;
    private CharSequence g;

    public jme(sg sgVar) {
        this.e = sgVar;
        Context g2 = sgVar.g();
        this.d = g2;
        this.f = g2.getPackageName();
    }

    public final jmf a() {
        if (this.c == null) {
            this.c = jgu.b(jgu.d(this.d, this.f));
        }
        jmf jmf = new jmf(this.d, this.f, this.g, this.c);
        int a2 = jmf.a(this.b);
        if (a2 != -1) {
            jmf.a(a2);
        }
        jmf.a = this.a;
        jmf.a(this.e);
        return jmf;
    }

    public jme(sg sgVar, CharSequence charSequence) {
        this(sgVar);
        this.g = charSequence;
    }

    public final void a(int i) {
        this.g = this.d.getText(i);
    }
}
