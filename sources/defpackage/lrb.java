package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: lrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrb extends lra {
    public final NinePatchDrawable A;
    public final RectF B;
    public final int y;
    public final Paint z = new Paint();

    public lrb(Context context, RecyclerView recyclerView, View view, lqy lqy) {
        super(context, recyclerView, view, lqy);
        Resources resources = context.getResources();
        this.A = (NinePatchDrawable) a(context, (int) R.drawable.drive_menu_submenu_background);
        this.z.setDither(true);
        this.z.setAntiAlias(true);
        this.z.setColor(-1);
        this.z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.z.setTextAlign(Paint.Align.CENTER);
        this.z.setTextSize((float) ((int) TypedValue.applyDimension(2, 26.0f, resources.getDisplayMetrics())));
        this.B = new RectF();
        this.y = (int) TypedValue.applyDimension(1, 300.0f, resources.getDisplayMetrics());
    }

    public final void a(int i) {
        int i2 = this.r;
        super.a(i);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.o = "";
        super.d();
    }
}
