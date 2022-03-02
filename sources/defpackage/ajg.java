package defpackage;

import android.view.View;

/* renamed from: ajg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajg extends ajj {
    public final float a(View view) {
        if (view.getLayoutDirection() == 1) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
        return view.getTranslationX() - ((float) view.getWidth());
    }
}
