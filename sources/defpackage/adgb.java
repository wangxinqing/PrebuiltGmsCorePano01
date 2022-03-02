package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.udc.ui.UdcConsentChimeraActivity;

/* renamed from: adgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ UdcConsentChimeraActivity b;

    public adgb(UdcConsentChimeraActivity udcConsentChimeraActivity, View view) {
        this.b = udcConsentChimeraActivity;
        this.a = view;
    }

    public final void onGlobalLayout() {
        Activity containerActivity = this.b.getContainerActivity();
        jjg jjg = adez.a;
        try {
            Rect rect = new Rect();
            containerActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            ((anih) ((anih) adez.a.c()).a("adez", "a", 42, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Root view bounds: %s", (Object) rect.flattenToString());
            WindowManager.LayoutParams attributes = containerActivity.getWindow().getAttributes();
            attributes.width = rect.width();
            attributes.height = rect.height();
            attributes.gravity = 48;
            containerActivity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            anih anih = (anih) adez.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adez", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't hide caption bar");
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
