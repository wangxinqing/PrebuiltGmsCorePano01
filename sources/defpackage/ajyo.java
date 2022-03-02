package defpackage;

import android.graphics.Typeface;

/* renamed from: ajyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajyo extends lg {
    final /* synthetic */ ajyr a;
    final /* synthetic */ ajyq b;

    public ajyo(ajyq ajyq, ajyr ajyr) {
        this.b = ajyq;
        this.a = ajyr;
    }

    public final void a(int i) {
        this.b.l = true;
        this.a.a(i);
    }

    public final void a(Typeface typeface) {
        ajyq ajyq = this.b;
        ajyq.j = Typeface.create(typeface, ajyq.c);
        this.b.l = true;
        this.a.a(this.b.j, false);
    }
}
