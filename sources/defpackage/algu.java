package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: algu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public algu(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.f);
        TemplateLayout templateLayout = this.a;
        templateLayout.setXFraction(templateLayout.e);
        return true;
    }
}
