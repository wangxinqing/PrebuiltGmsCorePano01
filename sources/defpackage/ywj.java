package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: ywj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ywj extends FrameLayout {
    public String[] a = null;
    public final TextView b;
    private final ImageView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ywj(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        this.c = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.b = textView;
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        bringChildToFront(this.b);
    }

    public final void a(float f) {
        this.b.setTextSize(0, f);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int measureText;
        int size = View.MeasureSpec.getSize(i);
        Paint paint = new Paint();
        paint.setTextSize(this.b.getTextSize());
        paint.setTypeface(this.b.getTypeface());
        String[] strArr = this.a;
        if (strArr != null) {
            i3 = strArr.length;
        } else {
            i3 = 0;
        }
        String str = null;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            String str2 = this.a[i5];
            if (str2 != null && (measureText = (int) paint.measureText(str2)) <= size && measureText >= i4) {
                str = this.a[i5];
                i4 = measureText;
            }
        }
        if (str == null || !str.equals(this.b.getText())) {
            this.b.setText(str);
        }
        super.onMeasure(i, i2);
    }

    public final void a(Uri uri) {
        this.c.setImageURI(uri);
    }
}
