package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: cwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cwv extends cvz {
    public cwv(aqpx aqpx, LinearLayout linearLayout, cyg cyg, djk djk) {
        super(aqpx, linearLayout, cyg, djk);
    }

    public static final void a(TextView textView, boolean z) {
        if (!z) {
            textView.setGravity(8388611);
            textView.setTextAlignment(2);
            return;
        }
        textView.setGravity(17);
        textView.setTextAlignment(4);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.as_card_carousel_block;
    }

    public static final boolean a(aqqn aqqn) {
        return (aqqn.a & 2) == 0 && aqqn.d.size() == 0 && aqqn.e.size() == 0 && (aqqn.a & 4) == 0 && aqqn.j.size() == 0;
    }
}
