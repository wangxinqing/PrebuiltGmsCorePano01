package com.google.android.gms.smartdevice.d2d.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceListItemView extends CardView {
    public ImageView g;
    public TextView h;
    public final boolean i = azjw.b();
    private int j;

    public DeviceListItemView(Context context) {
        super(context);
    }

    public final void a(String str) {
        this.h.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.i) {
            this.h = (TextView) findViewById(16908309);
            findViewById(R.id.center_aligned_layout).setVisibility(8);
        } else {
            findViewById(16908309).setVisibility(8);
            View findViewById = findViewById(R.id.center_aligned_layout);
            findViewById.setVisibility(0);
            this.g = (ImageView) findViewById.findViewById(16908294);
            this.h = (TextView) findViewById.findViewById(16908308);
        }
        if (this.h != null) {
            this.j = getResources().getDimensionPixelSize(R.dimen.smartdevice_device_item_padding);
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = this.h.getMeasuredWidth();
        if (this.i) {
            Layout layout = this.h.getLayout();
            layout.getLineCount();
            float dimension = getResources().getDimension(R.dimen.smartdevice_device_item_icon_padding);
            do {
                if (layout.getLineCount() > 1 || ((float) measuredWidth2) >= ((float) measuredWidth) - (dimension + dimension)) {
                    this.h.setTextSize(0, this.h.getTextSize() * 0.9f);
                    measureChild(this.h, i2, i3);
                    layout = this.h.getLayout();
                    measuredWidth2 = this.h.getMeasuredWidth();
                } else {
                    return;
                }
            } while (measuredWidth2 != 0);
            return;
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            int measuredWidth3 = imageView.getMeasuredWidth() + this.j;
            int i4 = measuredWidth - (measuredWidth3 + measuredWidth3);
            while (measuredWidth2 >= i4) {
                this.h.setTextSize(0, this.h.getTextSize() * 0.9f);
                measureChild(this.h, i2, i3);
                measuredWidth2 = this.h.getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    return;
                }
            }
        }
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeviceListItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
