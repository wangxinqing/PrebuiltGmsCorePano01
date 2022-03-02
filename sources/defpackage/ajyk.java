package defpackage;

import android.graphics.Typeface;

/* renamed from: ajyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyk extends ajyr {
    private final Typeface a;
    private final ajyj b;
    private boolean c;

    public ajyk(ajyj ajyj, Typeface typeface) {
        this.a = typeface;
        this.b = ajyj;
    }

    private final void a(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    public final void a() {
        this.c = true;
    }

    public final void a(int i) {
        a(this.a);
    }

    public final void a(Typeface typeface, boolean z) {
        a(typeface);
    }
}
