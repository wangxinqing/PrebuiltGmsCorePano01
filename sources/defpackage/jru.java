package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: jru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jru {
    public String a;
    public String b;
    public String c;
    public Drawable d;
    public Drawable e;
    public String f;
    public String g;
    public String h;
    public View.OnClickListener i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    private boolean l;

    private jru() {
    }

    public static jru a() {
        return new jru();
    }

    public final void b() {
        this.l = true;
    }

    public final View a(Context context, ViewGroup viewGroup) {
        if (!azhr.c()) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.gm_card_entry, viewGroup, false);
            a(inflate);
            return inflate;
        } else if (azhu.b()) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.gm_card_entry_bugfix, viewGroup, false);
            a(inflate2);
            RelativeLayout relativeLayout = (RelativeLayout) inflate2;
            int dimensionPixelSize = relativeLayout.getResources().getDimensionPixelSize(R.dimen.gm_card_entry_padding);
            relativeLayout.getChildAt(1).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            return relativeLayout;
        } else {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.gm_card_entry_bugfix, viewGroup, false);
            a(inflate3);
            return inflate3;
        }
    }

    public final void a(View view) {
        if (!TextUtils.isEmpty(this.a)) {
            TextView textView = (TextView) view.findViewById(R.id.text);
            textView.setText(this.a);
            textView.setVisibility(0);
            view.setOnLongClickListener(new jrt(this, view));
        }
        if (!TextUtils.isEmpty(this.b)) {
            TextView textView2 = (TextView) view.findViewById(R.id.subtext);
            textView2.setText(this.b);
            textView2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.c)) {
            TextView textView3 = (TextView) view.findViewById(R.id.secondary_subtext);
            textView3.setText(this.c);
            textView3.setVisibility(0);
        }
        if (this.l) {
            view.findViewById(R.id.icon).setVisibility(4);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        Drawable drawable = this.d;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.alt_icon);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f)) {
            view.setContentDescription(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            imageView.setContentDescription(this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            imageView2.setContentDescription(this.h);
        }
        View.OnClickListener onClickListener = this.i;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
            view.setBackgroundResource(jsa.g(view.getContext()));
        }
        View.OnClickListener onClickListener2 = this.j;
        if (onClickListener2 != null) {
            imageView.setOnClickListener(onClickListener2);
        }
        View.OnClickListener onClickListener3 = this.k;
        if (onClickListener3 != null) {
            imageView2.setOnClickListener(onClickListener3);
        }
    }
}
