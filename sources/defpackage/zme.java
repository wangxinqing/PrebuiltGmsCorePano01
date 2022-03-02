package defpackage;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.data.internal.PlusImageView;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import java.util.List;

/* renamed from: zme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zme extends Fragment implements TextView.OnEditorActionListener, iin, yqc {
    public boolean a;
    public boolean b;
    public boolean c;
    public zmd d;
    public zkt e;
    public View f;
    public ScrollView g;
    public Audience h;
    public MentionMultiAutoCompleteTextView i;
    protected ViewGroup j;
    public CheckBox k;
    public boolean l;
    protected Settings m;
    private boolean n;
    private boolean o;
    private boolean p;
    private ypc q;
    private AddToCircleData r;
    private AudienceView s;
    private ImageView t;
    private boolean u;
    private ysw v;

    public final void b() {
        Settings settings;
        Audience audience;
        if (!this.p && (settings = this.m) != null && (audience = this.h) != null && settings.d) {
            iva.a((Object) audience, (Object) "Audience must not be null.");
            List list = audience.b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = ((AudienceMember) list.get(i2)).c;
                if (i3 == 1 || i3 == 4) {
                    this.d.o();
                    this.p = true;
                    return;
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        if (this.d.g().n == null) {
            return false;
        }
        if ((!this.d.j().f() || !this.d.j().o.b()) && !this.d.j().e()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = this.d.j().f() && this.d.j().o.d();
        int length = this.i.getText().length();
        if (z || z2 || length > 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        zkt zkt = this.e;
        if (zkt != null && zkt.isVisible()) {
            getChildFragmentManager().beginTransaction().hide(this.e).commitAllowingStateLoss();
        }
    }

    public final void e() {
        zkt zkt = this.e;
        if (zkt != null) {
            Spinner spinner = zkt.h;
            int i2 = zkt.b;
            if (i2 < 0) {
                i2 = 0;
            }
            spinner.setSelection(i2);
        }
    }

    public final boolean f() {
        zkt zkt = this.e;
        if (zkt != null && zkt.isVisible()) {
            zkt zkt2 = this.e;
            if (!zkt2.e.isChecked() || !zkt2.e.isEnabled() || TextUtils.isEmpty(((Circle) zkt2.h.getSelectedItem()).d) || zkt2.a.f().b.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.d.h() != null) {
            this.d.h().a(true);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null) {
            this.i.setText(this.d.j().s);
        }
        if (!TextUtils.isEmpty(this.i.getText())) {
            MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.i;
            mentionMultiAutoCompleteTextView.setSelection(mentionMultiAutoCompleteTextView.getText().length());
        }
        boolean a2 = zmf.a(getActivity(), this.d.j().f);
        this.l = a2;
        if (a2) {
            boolean booleanExtra = getActivity().getIntent().getBooleanExtra("com.google.android.gms.plus.intent.extra.SHARE_ON_PLUS", true);
            CheckBox checkBox = (CheckBox) this.f.findViewById(R.id.share_gplus_checkbox);
            this.k = checkBox;
            checkBox.setChecked(booleanExtra);
            this.j.setVisibility(8);
            this.f.findViewById(R.id.share_gplus_checkbox_container).setVisibility(0);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zmd)) {
            String valueOf = String.valueOf(zmd.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.d = (zmd) activity;
        if (activity instanceof ypc) {
            this.q = (ypc) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.n = bundle.getBoolean("logged_expand_sharebox", false);
            this.a = bundle.getBoolean("logged_comment_added", false);
            this.o = bundle.getBoolean("logged_preview_shown", false);
            this.b = bundle.getBoolean("user_edited", false);
            this.c = bundle.getBoolean("saw_domain_restriction", false);
            this.p = bundle.getBoolean("saw_underage_warning", false);
            this.r = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
            this.h = (Audience) bundle.getParcelable("audience");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.plus_sharebox_fragment, viewGroup, false);
        this.f = inflate;
        this.g = (ScrollView) inflate.findViewById(R.id.mention_scroll_view);
        AudienceView audienceView = (AudienceView) this.f.findViewById(R.id.audience_view);
        this.s = audienceView;
        boolean z = true;
        audienceView.b(true);
        if (bundle == null || !bundle.getBoolean("audience_view_enabled", false)) {
            z = false;
        }
        a(z);
        View findViewById = this.f.findViewById(R.id.audience_view_editable);
        if (findViewById != null) {
            findViewById.setBackgroundResource(0);
        }
        ImageView imageView = (ImageView) this.f.findViewById(R.id.avatar);
        this.t = imageView;
        imageView.setImageBitmap(jju.a(BitmapFactory.decodeResource(getResources(), R.drawable.default_avatar)));
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = (MentionMultiAutoCompleteTextView) this.f.findViewById(R.id.compose_text);
        this.i = mentionMultiAutoCompleteTextView;
        mentionMultiAutoCompleteTextView.addTextChangedListener(new zmc(this, getResources()));
        this.i.setOnEditorActionListener(this);
        this.j = (ViewGroup) this.f.findViewById(R.id.link_preview_container);
        return this.f;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (textView.getId() != R.id.compose_text || i2 != 6) {
            return false;
        }
        jjw.a(getActivity(), textView);
        return true;
    }

    public final void onHiddenChanged(boolean z) {
        yqd m2;
        super.onHiddenChanged(z);
        if (!z) {
            this.d.h().a(1);
            this.i.a(false);
            this.i.requestFocusFromTouch();
            jjw.b(getActivity(), this.i);
        }
        ypc ypc = this.q;
        if (ypc != null && (m2 = ypc.m()) != null) {
            if (!z) {
                m2.a(this);
            } else {
                m2.b(this);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("logged_expand_sharebox", this.n);
        bundle.putBoolean("logged_comment_added", this.a);
        bundle.putBoolean("logged_preview_shown", this.o);
        bundle.putBoolean("user_edited", this.b);
        bundle.putBoolean("saw_domain_restriction", this.c);
        bundle.putBoolean("saw_underage_warning", this.p);
        bundle.putBoolean("audience_view_enabled", this.u);
        bundle.putParcelable("add_to_circle_data", this.r);
        bundle.putParcelable("audience", this.h);
    }

    public final void onStart() {
        super.onStart();
        if (this.d.g().n != null) {
            a(this.d.g().n);
        }
        if (this.d.g().p != null) {
            a(this.d.g().p);
        }
        if (this.d.g().r != null) {
            a(this.d.g().r);
        }
        if (!this.d.j().l) {
            d();
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        zkt zkt = (zkt) childFragmentManager.findFragmentByTag("add_to_circle_fragment");
        this.e = zkt;
        if (zkt == null) {
            zkt zkt2 = new zkt();
            this.e = zkt2;
            beginTransaction.add(R.id.add_to_circle_container, zkt2, "add_to_circle_fragment");
        }
        if (!this.d.f().a() || this.d.f().e()) {
            beginTransaction.hide(this.e);
        }
        if (this.l) {
            beginTransaction.hide(this.e);
        }
        if (!beginTransaction.isEmpty()) {
            beginTransaction.commitAllowingStateLoss();
        }
        ypc ypc = this.q;
        if (ypc != null && ypc.m() != null) {
            this.q.m().a(this);
        }
    }

    private final void a(boolean z) {
        this.u = z;
        if (!z) {
            this.s.a(1, (iin) null, (iip) null);
        } else {
            this.s.a((iin) this);
        }
    }

    public final void a() {
        if (!this.h.e) {
            this.d.g().a(iax.l);
            this.d.n();
        }
    }

    public final void a(Bitmap bitmap) {
        this.t.setImageBitmap(bitmap);
    }

    public final void a(Audience audience) {
        if (!ius.a(this.h, audience)) {
            this.b = true;
        }
        this.s.a(audience);
        this.h = audience;
        a(!audience.e);
        if (this.l) {
            return;
        }
        if (this.d.j().l) {
            this.d.b(audience);
        } else {
            d();
        }
    }

    public final void a(Settings settings) {
        this.m = settings;
        if (this.h == null) {
            Audience audience = settings.c;
            if (audience == null) {
                Audience audience2 = settings.b;
                if (audience2 == null) {
                    this.d.a(iww.a);
                } else {
                    this.d.a(audience2);
                }
            } else {
                this.d.a(audience);
            }
        }
        b();
        this.s.a(this.m.d);
        this.i.a(getLoaderManager(), this.d.g().j, this.d.j().b(), "80", this.d.getCallingPackage(), this.d.m());
        this.d.p();
        if (!this.n) {
            this.d.g().a(iax.b);
            this.n = true;
        }
    }

    public final void a(AddToCircleData addToCircleData, boolean z) {
        if (addToCircleData.e()) {
            d();
        } else if (this.e != null) {
            getChildFragmentManager().beginTransaction().show(this.e).commitAllowingStateLoss();
            this.e.a(addToCircleData, z);
        }
    }

    public final void a(Object obj) {
        if (obj != this) {
            a(this.q.m().a);
        }
        b();
    }

    public final void a(ysw ysw) {
        String str;
        this.v = ysw;
        if (this.l) {
            return;
        }
        if ((this.d.j().e() && this.v != null) || !this.d.j().f() || !this.d.j().o.f()) {
            if (this.v == null) {
                String str2 = this.d.j().n;
                zmx zmx = this.d.j().o;
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", str2);
                contentValues.put("url", str2);
                contentValues.put("type", "article");
                if (str2 == null && zmx != null && zmx.f()) {
                    if (zmx.h()) {
                        contentValues.put("title", zmx.g());
                    }
                    if (zmx.l()) {
                        contentValues.put("thumbnailUrl", zmx.k());
                    }
                    if (zmx.j()) {
                        contentValues.put("description", zmx.i());
                    }
                }
                this.v = new ysw(contentValues);
                if (!this.o) {
                    this.d.g().a(iax.j);
                    this.o = true;
                }
            }
            this.j.removeAllViews();
            zln zln = new zln(getActivity());
            zln.c = this.d.g().b;
            ysw ysw2 = this.v;
            String asString = ysw2.b.getAsString("callToActionDisplayName");
            amrl.a((Object) zln.c, (Object) "Call initialize first");
            zln.a = ysw2;
            zln.b = asString;
            zln.removeAllViews();
            ysw ysw3 = zln.a;
            if (ysw3 != null) {
                String a2 = ysw3.a();
                if ("article".equals(a2) || "action".equals(a2) || "video".equals(a2)) {
                    View inflate = LayoutInflater.from(zln.getContext()).inflate(R.layout.plus_sharebox_article_preview_view, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.article_title);
                    PlusImageView plusImageView = (PlusImageView) inflate.findViewById(R.id.article_image);
                    plusImageView.a(zln.c);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(zln.b)) {
                        spannableStringBuilder.append(zln.b).append(": ");
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216), 0, spannableStringBuilder.length(), 0);
                    }
                    String b2 = zln.a.b();
                    if (b2 != null) {
                        str = Html.fromHtml(b2).toString();
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        spannableStringBuilder.append(str);
                    }
                    String c2 = zln.a.c();
                    if (!TextUtils.isEmpty(spannableStringBuilder)) {
                        textView.setVisibility(0);
                        textView.setText(spannableStringBuilder);
                    } else {
                        textView.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(c2)) {
                        plusImageView.setVisibility(0);
                        plusImageView.a(ytz.a(c2));
                    } else {
                        plusImageView.setVisibility(8);
                    }
                    inflate.setVisibility(0);
                    zln.addView(inflate);
                    zln.invalidate();
                    zln.requestLayout();
                } else {
                    String valueOf = String.valueOf(a2);
                    Log.e("ShareBox", valueOf.length() == 0 ? new String("Unsupported content type:") : "Unsupported content type:".concat(valueOf));
                }
            }
            this.j.addView(zln);
            if (!this.o) {
                this.d.g().a(iax.i);
                this.o = true;
            }
        }
    }
}
