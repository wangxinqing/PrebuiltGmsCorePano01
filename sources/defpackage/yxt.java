package defpackage;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: yxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxt extends ClickableSpan {
    private final Activity a;
    private final yxr b;
    private final yxs c;

    public yxt(Activity activity, yxr yxr, yxs yxs) {
        this.a = activity;
        this.b = yxr;
        this.c = yxs;
    }

    public void onClick(View view) {
        yxs yxs = this.c;
        if (yxs != null) {
            izr.a(yxs.a, yxs.b, yxs.c, yxs.d, yxs.e);
        }
        this.a.startActivityForResult(this.b.a, 100);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Resources resources = this.a.getResources();
        textPaint.setUnderlineText(resources.getBoolean(R.bool.plus_links_underlined));
        textPaint.setColor(resources.getColor(R.color.plus_oob_link_color));
    }
}
