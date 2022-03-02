package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: aaqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqk extends jna {
    private final TextView A;
    private final TextView B;
    private final TextView C;
    private final ImageView D;
    private final ProgressBar E;
    private final ImageView y;
    private final ImageView z;

    public aaqk(View view) {
        super(view);
        this.y = (ImageView) view.findViewById(R.id.top_icon);
        this.z = (ImageView) view.findViewById(R.id.button_icon);
        this.A = (TextView) view.findViewById(R.id.description);
        this.B = (TextView) view.findViewById(R.id.action_link);
        this.C = (TextView) view.findViewById(R.id.more_details);
        this.D = (ImageView) view.findViewById(R.id.more_or_less_icon);
        this.E = (ProgressBar) view.findViewById(R.id.loading_spinner);
        ((TextView) view.findViewById(16908310)).setSingleLine(false);
        view.findViewById(R.id.simple_setting).setBackgroundResource(0);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(imageView.getLayoutParams());
        layoutParams.width = view.getResources().getDimensionPixelSize(R.dimen.verify_apps_icon_size);
        layoutParams.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(layoutParams);
    }

    public final void a(jmt jmt) {
        CharSequence charSequence;
        int i;
        aaqh aaqh;
        aaqi aaqi;
        aaqm aaqm = (aaqm) jmt;
        super.a(aaqm);
        aaqj aaqj = null;
        jna.a((View) null, this.y, aaqm.j);
        jna.a((View) null, this.z, aaqm.k);
        jna.a(this.A, aaqm.n);
        boolean z2 = true;
        if (aaqm.p != null && !aaqm.q) {
            z2 = false;
        }
        jna.a(this.B, z2 ? aaqm.o : null);
        TextView textView = this.C;
        if (aaqm.q) {
            charSequence = aaqm.p;
        } else {
            charSequence = null;
        }
        jna.a(textView, charSequence);
        ProgressBar progressBar = this.E;
        if (!aaqm.r) {
            i = 8;
        } else {
            i = 0;
        }
        progressBar.setVisibility(i);
        if (aaqm.k != null) {
            aaqh = new aaqh(aaqm);
        } else {
            aaqh = null;
        }
        this.z.setOnClickListener(aaqh);
        if (aaqm.o != null) {
            aaqi = new aaqi(aaqm);
        } else {
            aaqi = null;
        }
        this.B.setOnClickListener(aaqi);
        Drawable drawable = aaqm.p != null ? aaqm.q ? aaqm.l : aaqm.m : null;
        jna.a((View) null, this.D, drawable);
        if (drawable != null) {
            aaqj = new aaqj(aaqm);
        }
        this.a.setOnClickListener(aaqj);
        if (aaqj == null) {
            this.a.setClickable(false);
        }
    }
}
