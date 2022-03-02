package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceAvatarImageView;

/* renamed from: yqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqq extends Fragment implements ica, icb {
    public View a;
    public View b;
    public EditText c;
    public ImageView d;
    public icc e;
    public AudienceMember f;
    public String g;
    public Bitmap h;
    private View i;
    private AudienceAvatarImageView j;

    private final int b(int i2) {
        return (int) TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
    }

    private static final int c(int i2) {
        return (i2 & -16777216) == 0 ? i2 | -16777216 : i2;
    }

    private final void f() {
        a(0, new iid(3, (AudienceMember) null, 3, (String) null).a(), (Status) null);
    }

    public final void d() {
        if (TextUtils.isEmpty(this.g)) {
            f();
        } else if (!this.e.i()) {
            a();
        } else {
            yqi e2 = e();
            if (e2 != null && !e2.b()) {
                Intent intent = getActivity().getIntent();
                String a2 = iic.a(intent);
                String c2 = iic.c(intent);
                ibq ibq = wlt.a;
                xcy.a(this.e, a2, c2, this.g).a((icm) new yql(this));
                e2.a();
            }
        }
    }

    public final yqi e() {
        return (yqi) getActivity();
    }

    public final void g(Bundle bundle) {
        String str;
        AudienceMember audienceMember = this.f;
        if (audienceMember != null) {
            str = audienceMember.g;
        } else {
            str = null;
        }
        if (str != null) {
            ibq ibq = wlt.a;
            xdh.a(this.e, str, 3, 0).a((icm) new yqh(this));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(getActivity() instanceof yqi)) {
            throw new IllegalStateException("Activity must implement CircleCreationFragmentHost.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f = iic.d(getActivity().getIntent());
        int b2 = iic.b(getActivity().getIntent());
        wlr wlr = new wlr();
        wlr.a = b2;
        wls a2 = wlr.a();
        ibz ibz = new ibz(getActivity(), this, this);
        ibz.a(wlt.a, (ibj) a2);
        icc b3 = ibz.b();
        this.e = b3;
        b3.e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.plus_circles_circle_creation_fragment, (ViewGroup) null);
        this.c = (EditText) inflate.findViewById(R.id.circle_name_edit_text);
        this.d = (ImageView) inflate.findViewById(R.id.create_circle_button);
        this.j = (AudienceAvatarImageView) inflate.findViewById(R.id.header_avatar);
        this.a = inflate.findViewById(R.id.dialog);
        this.i = inflate.findViewById(R.id.dialog_header);
        Configuration configuration = getResources().getConfiguration();
        if (configuration.orientation != 1) {
            int i2 = configuration.smallestScreenWidthDp;
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.width = b(i2 < 600 ? i2 - 32 : 427);
            this.a.setLayoutParams(layoutParams);
        }
        int c2 = c(getActivity().getIntent().getIntExtra("com.google.android.gms.common.audience.EXTRA_HEADER_TEXT_COLOR", getResources().getColor(R.color.plus_add_to_circles_header_text)));
        ((TextView) inflate.findViewById(R.id.header_text)).setTextColor(c2);
        ((GradientDrawable) this.i.getBackground()).setColor(c(getActivity().getIntent().getIntExtra("com.google.android.gms.common.audience.EXTRA_HEADER_BACKGROUND_COLOR", getResources().getColor(R.color.plus_add_to_circles_header_grey))));
        this.c.addTextChangedListener(new yqj(this));
        this.c.setOnEditorActionListener(new yqo(this));
        View findViewById = inflate.findViewById(R.id.transparent_background);
        this.b = findViewById;
        findViewById.setOnClickListener(new yqk(this, false));
        this.a.setOnClickListener((View.OnClickListener) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close_button);
        ((ViewGroup) imageView.getParent()).setOnClickListener(new yqk(this, false));
        imageView.setOnClickListener(new yqk(this, false));
        Drawable drawable = getResources().getDrawable(R.drawable.plus_iconic_ic_close_white_20);
        drawable.setColorFilter(c2, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(drawable);
        if (inflate != null) {
            int i3 = Build.VERSION.SDK_INT;
            boolean a2 = jjy.a();
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.create_circle_button_frame);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            if (a2) {
                layoutParams2.addRule(9, -1);
            } else {
                layoutParams2.addRule(11, -1);
            }
            linearLayout.setLayoutParams(layoutParams2);
            EditText editText = (EditText) inflate.findViewById(R.id.circle_name_edit_text);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            if (a2) {
                layoutParams3.addRule(1, R.id.create_circle_button_frame);
            } else {
                layoutParams3.addRule(0, R.id.create_circle_button_frame);
            }
            editText.setLayoutParams(layoutParams3);
            View findViewById2 = inflate.findViewById(R.id.circle_name_edit_text_underline);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
            if (a2) {
                layoutParams4.addRule(1, R.id.create_circle_button_frame);
            } else {
                layoutParams4.addRule(0, R.id.create_circle_button_frame);
            }
            findViewById2.setLayoutParams(layoutParams4);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.header_text);
        AudienceMember audienceMember = this.f;
        if (audienceMember == null || TextUtils.isEmpty(audienceMember.f)) {
            textView.setText(getResources().getString(R.string.plus_circle_creation_title_default));
        } else {
            textView.setText(getResources().getString(R.string.plus_circle_creation_title_with_user_name, new Object[]{this.f.f}));
        }
        c();
        b();
        if (!TextUtils.isEmpty(this.g)) {
            this.b.setVisibility(8);
            return inflate;
        }
        this.b.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), R.anim.circle_creation_dialog_slide_up);
        loadAnimation.setAnimationListener(new yqn(this));
        this.a.startAnimation(loadAnimation);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.e.g();
    }

    public final void a() {
        a(7, new iid(2, (AudienceMember) null, 3, (String) null).a(), (Status) null);
    }

    public final void c() {
        if (this.h == null || getResources().getDimension(R.dimen.circle_creation_dialog_header_height) < ((float) b(80))) {
            this.j.setVisibility(8);
            return;
        }
        this.j.setVisibility(0);
        this.j.a(this.h);
    }

    public final void b() {
        if (TextUtils.isEmpty(this.c.getText())) {
            this.d.setClickable(false);
            this.d.setImageResource(R.drawable.plus_iconic_ic_plus_grey_20);
            int i2 = Build.VERSION.SDK_INT;
            this.d.setAlpha(0.3f);
            ((ViewGroup) this.d.getParent()).setOnClickListener((View.OnClickListener) null);
            this.d.setOnClickListener((View.OnClickListener) null);
            return;
        }
        this.d.setClickable(true);
        this.d.setImageResource(R.drawable.plus_iconic_ic_plus_green_20);
        int i3 = Build.VERSION.SDK_INT;
        this.d.setAlpha(1.0f);
        ((ViewGroup) this.d.getParent()).setOnClickListener(new yqk(this, true));
        this.d.setOnClickListener(new yqk(this, true));
    }

    public final void a(int i2) {
        this.e.e();
    }

    public final void a(int i2, Intent intent, Status status) {
        yqi e2 = e();
        if (e2 != null) {
            e2.a(i2, intent, status);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        f();
    }
}
