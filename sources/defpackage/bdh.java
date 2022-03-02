package defpackage;

import android.view.ViewTreeObserver;
import com.android.setupwizardlib.TemplateLayout;

/* renamed from: bdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bdh implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public bdh(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.c);
        TemplateLayout templateLayout = this.a;
        templateLayout.setXFraction(templateLayout.b);
        return true;
    }
}
