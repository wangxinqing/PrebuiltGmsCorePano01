package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: ajyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajyp extends ajyr {
    final /* synthetic */ TextPaint a;
    final /* synthetic */ ajyr b;
    final /* synthetic */ ajyq c;

    public ajyp(ajyq ajyq, TextPaint textPaint, ajyr ajyr) {
        this.c = ajyq;
        this.a = textPaint;
        this.b = ajyr;
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(Typeface typeface, boolean z) {
        this.c.a(this.a, typeface);
        this.b.a(typeface, z);
    }
}
