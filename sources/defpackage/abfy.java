package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: abfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfy implements abkk, ablg, abga {
    private final FloatingActionButton a;
    private int b = 0;
    private boolean c;
    private boolean d;
    private boolean e;

    public abfy(FloatingActionButton floatingActionButton, abkl abkl, jtf jtf) {
        this.a = floatingActionButton;
        abkl.a((abkk) this);
        floatingActionButton.setOnClickListener(new abfx(abkl, jtf));
    }

    private final void a() {
        FloatingActionButton floatingActionButton = this.a;
        int i = 8;
        if (this.e && !this.d && !this.c && this.b == 2) {
            i = 0;
        }
        floatingActionButton.setVisibility(i);
    }

    public final void a(int i, int i2) {
        this.b = i;
        a();
    }

    public final void a(abgl abgl) {
        boolean z = false;
        if (abgl.c() && abgl.d.e) {
            z = true;
        }
        this.c = z;
        a();
    }

    public final void a(boolean z) {
        this.e = true;
        this.d = z;
        a();
    }
}
