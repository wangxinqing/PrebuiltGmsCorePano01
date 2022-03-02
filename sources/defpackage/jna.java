package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jna extends jmr {
    final View t;
    final ImageView u;
    final TextView v;
    final TextView w;
    final ViewGroup x;

    public jna(View view) {
        super(view);
        this.t = view.findViewById(R.id.icon_frame);
        this.u = (ImageView) view.findViewById(16908294);
        this.v = (TextView) view.findViewById(16908310);
        this.w = (TextView) view.findViewById(16908304);
        this.x = (ViewGroup) view.findViewById(16908312);
        view.setFocusable(true);
    }

    protected static void a(View view, ImageView imageView, Drawable drawable) {
        int i;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    protected static void a(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public void a(jmt jmt) {
        if (jmt instanceof jnb) {
            jnb jnb = (jnb) jmt;
            boolean z = jnb.h;
            this.u.setEnabled(z);
            a(this.t, this.u, jnb.e);
            this.v.setEnabled(z);
            a(this.v, jnb.b());
            this.w.setEnabled(z);
            a(this.w, jnb.g());
            this.a.setEnabled(jnb.h);
            View view = this.a;
            if (jnb.g == null && jnb.f == null) {
                jnb = null;
            }
            view.setOnClickListener(jnb);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultSimpleSettingItem");
    }
}
