package com.google.android.gms.auth.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProportionalOuterFrame extends RelativeLayout {
    public ProportionalOuterFrame(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        double size = (double) View.MeasureSpec.getSize(i);
        Double.isNaN(size);
        int i3 = (int) (size * 0.05d);
        double size2 = (double) View.MeasureSpec.getSize(i2);
        Double.isNaN(size2);
        setPadding(i3, 0, i3, (int) (size2 * 0.04d));
        View findViewById = findViewById(R.id.title_area);
        if (findViewById != null) {
            double height = (double) ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getHeight();
            Double.isNaN(height);
            findViewById.setMinimumHeight((int) (height * 0.15d));
        }
        super.onMeasure(i, i2);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
