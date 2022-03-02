package com.google.android.gms.plus.audience;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceSelectionListPersonView extends ypo {
    private static Bitmap i;
    public TextView a;
    public TextView b;
    public ImageView c;
    public yom h;

    public AudienceSelectionListPersonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        yom yom = this.h;
        if (yom != null) {
            yom.a.b();
            this.h = null;
        }
        a(R.drawable.default_avatar);
        super.a();
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.audience_selection_person_name);
        this.b = (TextView) findViewById(R.id.audience_selection_secondary_text);
        this.c = (ImageView) findViewById(R.id.audience_selection_person_avatar);
    }

    public void a(int i2) {
        if (i2 == R.drawable.default_avatar) {
            ImageView imageView = this.c;
            if (i == null) {
                i = jju.a(((BitmapDrawable) getResources().getDrawable(R.drawable.default_avatar)).getBitmap());
            }
            imageView.setImageBitmap(i);
            return;
        }
        this.c.setImageResource(i2);
    }
}
