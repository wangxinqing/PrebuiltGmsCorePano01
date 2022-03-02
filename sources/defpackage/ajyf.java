package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: ajyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyf {
    public static float a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return PorterDuff.Mode.MULTIPLY;
            case Service.START_CONTINUATION_MASK:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void a(View view, ajyd ajyd) {
        qb.a(view, (pq) new ajyb(ajyd, new ajye(qb.i(view), view.getPaddingTop(), qb.j(view), view.getPaddingBottom())));
        if (qb.D(view)) {
            qb.r(view);
        } else {
            view.addOnAttachStateChangeListener(new ajyc());
        }
    }
}
