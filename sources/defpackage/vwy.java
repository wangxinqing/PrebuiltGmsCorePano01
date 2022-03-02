package defpackage;

import android.content.Context;

/* renamed from: vwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vwy {
    public final Context a;
    public final boolean b;
    public final vwz[] c;
    public boolean d = false;
    private boolean e = false;

    public vwy(Context context, boolean z, vwz... vwzArr) {
        this.a = context;
        this.b = z;
        this.c = vwzArr;
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        if (this.d) {
            vwz[] vwzArr = this.c;
            for (int i = 0; i < 2; i++) {
                vwz vwz = vwzArr[i];
                thp.a(vwz.a, vwz.b);
            }
            d();
            this.d = false;
            jjg jjg = vvj.a;
            return;
        }
        jjg jjg2 = vvj.a;
    }

    public final void d() {
        if (this.e) {
            b();
            this.e = false;
            jjg jjg = vvj.a;
            return;
        }
        jjg jjg2 = vvj.a;
    }

    public final void e() {
        jjg jjg = vvj.a;
        vwz[] vwzArr = this.c;
        int i = 0;
        while (i < 2) {
            if (vwzArr[i].a()) {
                i++;
            } else {
                d();
                return;
            }
        }
        if (!this.e) {
            a();
            this.e = true;
        }
    }
}
