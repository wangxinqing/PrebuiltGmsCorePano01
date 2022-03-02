package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Attachment;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContentView extends FrameLayout {
    private Context a;
    private TextView b;
    private LinearLayout c;

    public ContentView(Context context) {
        super(context);
        a(context);
    }

    private final void a(int i) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private final void a(Context context) {
        this.a = context;
        LayoutInflater.from(context).inflate(R.layout.sharing_view_content_preview, this);
    }

    public ContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Uri uri, int i) {
        a(uri, i, 0);
    }

    private final void a(Uri uri, int i, int i2) {
        RoundedCornerRectImageView roundedCornerRectImageView = (RoundedCornerRectImageView) this.c.findViewById(i);
        if (roundedCornerRectImageView.getVisibility() != 0) {
            roundedCornerRectImageView.setVisibility(0);
        }
        if (i2 > 0) {
            roundedCornerRectImageView.a = i2;
        }
        Uri uri2 = (Uri) roundedCornerRectImageView.getTag(R.layout.sharing_view_content_preview);
        if (uri2 == null || !uri2.equals(uri)) {
            ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(R.color.sharing_color_waiting));
            Context context = this.a;
            if (wiv.a == null) {
                wiv.a = new wiv(context);
            }
            wiu wiu = new wiu(wiv.a, uri);
            wiu.b = colorDrawable;
            if (wiu.b == null) {
                wiu.b = new ColorDrawable(0);
            }
            roundedCornerRectImageView.setImageDrawable(wiu.b);
            wil.a((View) roundedCornerRectImageView);
            int measuredHeight = roundedCornerRectImageView.getMeasuredHeight();
            int measuredWidth = roundedCornerRectImageView.getMeasuredWidth();
            new wit(wiu.c.b, new wis(roundedCornerRectImageView), wiu.a, measuredWidth, measuredHeight).start();
            roundedCornerRectImageView.setTag(R.layout.sharing_view_content_preview, uri);
        }
    }

    public final void a(List list) {
        boolean z;
        this.b = (TextView) findViewById(R.id.file_and_text_preview_title);
        if (list.isEmpty() || !((Attachment) list.get(0)).d()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.b;
        if (textView != null) {
            if (z) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                this.b.setMaxLines(2);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.b.setMaxLines(1);
            }
        }
        this.b.setText(wig.a(getContext(), list));
        this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(wig.b(getContext(), list), (Drawable) null, (Drawable) null, (Drawable) null);
        a(0);
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void a(Uri[] uriArr) {
        int length = uriArr.length;
        if (length < 3) {
            this.c = (LinearLayout) findViewById(R.id.media_preview_less_than_3);
            a(uriArr[0], R.id.media_preview_image_1_large);
            if (length == 2) {
                a(uriArr[1], R.id.media_preview_image_2_large);
            }
        } else {
            this.c = (LinearLayout) findViewById(R.id.media_preview_multiple);
            a(uriArr[0], R.id.media_preview_image_1_large_in_multiple);
            a(uriArr[1], R.id.media_preview_image_2_small);
            a(uriArr[2], R.id.media_preview_image_3_small, length - 3);
        }
        this.c.setVisibility(0);
        a(8);
    }
}
