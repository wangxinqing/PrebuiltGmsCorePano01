package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.google.android.chimera.WebView;

/* renamed from: oox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oox implements View.OnTouchListener {
    final /* synthetic */ WebSettings a;
    final /* synthetic */ WebView b;

    public oox(WebSettings webSettings, WebView webView) {
        this.a = webSettings;
        this.b = webView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return false;
        }
        this.a.setSupportZoom(true);
        this.b.getParent().requestDisallowInterceptTouchEvent(true);
        this.a.setBuiltInZoomControls(true);
        return false;
    }
}
