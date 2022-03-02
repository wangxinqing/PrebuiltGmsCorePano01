package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: ajys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajys extends Drawable.ConstantState {
    final ajzf a;
    boolean b;

    public ajys(ajys ajys) {
        this.a = (ajzf) ajys.a.s.newDrawable();
        this.b = ajys.b;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ Drawable newDrawable() {
        return new ajyt(new ajys(this));
    }

    public ajys(ajzf ajzf) {
        this.a = ajzf;
        this.b = false;
    }
}
