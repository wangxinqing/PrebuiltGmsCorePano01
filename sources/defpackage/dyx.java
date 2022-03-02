package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.List;

/* renamed from: dyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyx extends dyj {
    public final dyy f;
    private final int g;
    private CharSequence h;
    private CharSequence i;
    private final boolean j;
    private final wli k;
    private final View.OnClickListener l = new dys(this);
    private final View.OnClickListener m = new dyt(this);
    private final View.OnClickListener n = new dyu(this);
    private EditText o;
    private final Object[] p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final boolean t;
    private boolean u;

    public dyx(dyy dyy, int i2, String str, CharSequence charSequence, boolean z, boolean z2) {
        this.f = dyy;
        this.g = i2;
        this.h = charSequence;
        this.j = z;
        this.t = z2;
        wlh wlh = new wlh();
        wlh.a = 1;
        wlh.b();
        this.k = wlh.a();
        this.p = new Object[]{str};
    }

    private final void a(TextView textView) {
        if (this.j && !this.a) {
            Resources resources = textView.getResources();
            textView.setText(resources.getString(R.string.appinvite_contextual_selection_number_of_recipients, new Object[]{Integer.valueOf(this.f.c()), Integer.valueOf(((dxx) this.f).d)}));
            textView.setContentDescription(resources.getString(R.string.appinvite_contextual_selection_num_recipients_content_description, new Object[]{Integer.valueOf(this.f.c()), Integer.valueOf(((dxx) this.f).d)}));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final long J(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.a) {
            return 2;
        }
        if (!this.q) {
            return 1;
        }
        int i3 = i2 - 1;
        List b = this.f.b();
        if (i3 < b.size()) {
            return (long) ((ContactPerson) b.get(i3)).hashCode();
        }
        return 2;
    }

    public final void b(ContactPerson contactPerson) {
        int indexOf;
        if (this.q && !this.a && (indexOf = this.f.b().indexOf(contactPerson)) >= 0) {
            K(indexOf + 1);
        }
    }

    public final void c(CharSequence charSequence) {
        CharSequence charSequence2;
        if (!ius.a(charSequence, this.i)) {
            this.i = charSequence;
            EditText editText = this.o;
            if (editText != null && this.a) {
                if (TextUtils.isEmpty(this.i)) {
                    charSequence2 = this.h;
                } else {
                    charSequence2 = this.i;
                }
                editText.setHint(charSequence2);
            }
        }
    }

    public final void c(boolean z) {
        this.r = z;
    }

    public final void d() {
        EditText editText = this.o;
        if (editText == null) {
            return;
        }
        if (!editText.isShown() || this.o.getParent() == null) {
            this.u = true;
        } else {
            g();
        }
    }

    public final CharSequence e() {
        EditText editText = this.o;
        if (editText == null || !editText.isShown() || this.o.getParent() == null) {
            return null;
        }
        return this.o.getText();
    }

    public final void e(boolean z) {
        this.s = z;
    }

    public final int f() {
        int length = this.p.length;
        return 1;
    }

    public final int g(int i2) {
        return this.g;
    }

    public final int getPositionForSection(int i2) {
        return 0;
    }

    public final int getSectionForPosition(int i2) {
        return 0;
    }

    public final Object[] getSections() {
        return this.p;
    }

    public final void g() {
        if (this.o.isShown() && this.o.getParent() != null) {
            this.o.requestFocus();
            jjw.b(this.o.getContext(), this.o);
        }
    }

    public final void b(CharSequence charSequence) {
        if (!ius.a(charSequence, this.h)) {
            this.h = charSequence;
            EditText editText = this.o;
            if (editText != null && !this.a) {
                editText.setHint(charSequence);
            }
            if (!this.q && this.f.c() == 0) {
                K(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void g(boolean z) {
        if (z) {
            K(this.f.c() + 1);
            if (this.f.c() > 0) {
                d(1, this.f.c() + 1);
                return;
            }
            return;
        }
        K(1);
        if (this.f.c() > 0) {
            c(1, this.f.c() + 1);
        }
    }

    public final void b(boolean z) {
        EditText editText;
        if (z != this.q) {
            a((CharSequence) null);
            this.q = z;
            if (!z && (editText = this.o) != null) {
                editText.clearFocus();
                jjw.a(this.o.getContext(), this.o);
            }
            as();
        }
    }

    public final int a() {
        if (!this.q || this.a) {
            return 2;
        }
        return this.f.c() + 2;
    }

    public final int a(int i2) {
        if (i2 == 0) {
            return R.layout.appinvite_anchor;
        }
        if (this.a) {
            return !this.t ? R.layout.appinvite_contextual_selection_search : R.layout.appinvite_contextual_selection_search_docked;
        }
        if (!this.q) {
            return R.layout.appinvite_contextual_selection_recipients;
        }
        if (i2 - 1 >= this.f.c()) {
            return !this.t ? R.layout.appinvite_contextual_selection_search : R.layout.appinvite_contextual_selection_search_docked;
        }
        return R.layout.appinvite_contextual_selection_chip;
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i2 == R.layout.appinvite_contextual_selection_recipients) {
            return new dzs(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_chip) {
            return new dzo(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_search || i2 == R.layout.appinvite_contextual_selection_search_docked) {
            return new dzr(inflate);
        }
        if (i2 == R.layout.appinvite_anchor) {
            return new adl(inflate);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [dyy, android.view.View$OnFocusChangeListener, android.widget.TextView$OnEditorActionListener] */
    public final void a(adl adl, int i2) {
        CharSequence charSequence;
        if (i2 > 0) {
            int i3 = 0;
            if (!this.q) {
                dzs dzs = (dzs) adl;
                String string = dzs.a.getResources().getString(R.string.appinvite_contextual_selection_recipient_separator);
                List b = this.f.b();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= b.size()) {
                        break;
                    }
                    ContactPerson contactPerson = (ContactPerson) b.get(i4);
                    if (i5 >= 5) {
                        String format = String.format(dzs.a.getResources().getString(R.string.appinvite_contextual_selection_additional_recipient_format), new Object[]{Integer.valueOf(b.size() - i5)});
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(dzs.a.getResources().getColor(R.color.material_google_blue_500)), spannableStringBuilder.length(), spannableStringBuilder.length(), 18);
                        spannableStringBuilder.append(format);
                        break;
                    }
                    if (i5 > 0) {
                        spannableStringBuilder.append(string);
                    }
                    String a = eap.a(dzs.a.getContext(), contactPerson);
                    if (a != null) {
                        spannableStringBuilder.append(a);
                    }
                    i5++;
                    i4++;
                }
                TextView textView = dzs.s;
                if (i5 == 0) {
                    textView.setText(this.h);
                    textView.setTextColor(textView.getResources().getColor(R.color.appinvite_medium_black));
                } else {
                    textView.setText(spannableStringBuilder);
                    textView.setTextColor(textView.getResources().getColor(R.color.appinvite_dark_black));
                }
                a(dzs.t);
                dzs.a.setOnClickListener(new dyw(this));
                return;
            }
            int i6 = i2 - 1;
            if (!this.a && i6 < this.f.c()) {
                dzo dzo = (dzo) adl;
                ContactPerson contactPerson2 = (ContactPerson) this.f.b().get(i6);
                dxx dxx = (dxx) this.f;
                dym.a(dxx.b, this.k, dzo, contactPerson2, false, false, this.r, true, this.s, dxx.i, dxx.j, this.e);
                View view = dzo.a;
                view.setOnClickListener(this.m);
                if (i6 == 0) {
                    i3 = view.getResources().getDimensionPixelSize(R.dimen.appinvite_chip_spacing);
                }
                int i7 = Build.VERSION.SDK_INT;
                view.setPaddingRelative(view.getPaddingStart(), i3, view.getPaddingEnd(), view.getPaddingBottom());
                View view2 = dzo.s;
                view2.setOnClickListener(this.l);
                view2.setTag(R.id.appinvite_chip_view_holder_tag_person, contactPerson2);
                return;
            }
            dzr dzr = (dzr) adl;
            a(dzr.u);
            this.o = dzr.s;
            TextView textView2 = dzr.t;
            ImageView imageView = dzr.v;
            if (this.a) {
                this.o.setVisibility(0);
                EditText editText = this.o;
                if (TextUtils.isEmpty(this.i)) {
                    charSequence = this.h;
                } else {
                    charSequence = this.i;
                }
                editText.setHint(charSequence);
                ? r6 = this.f;
                AutoCompleteTextView autoCompleteTextView = dzr.s;
                dxx dxx2 = r6;
                if (dxx2.F == null) {
                    dxx2.F = new dxp(dxx2);
                }
                dxx2.E.u = autoCompleteTextView.getThreshold();
                autoCompleteTextView.setAdapter(dxx2.E);
                autoCompleteTextView.setOnEditorActionListener(r6);
                autoCompleteTextView.setOnFocusChangeListener(r6);
                autoCompleteTextView.setOnItemClickListener(dxx2.F);
                textView2.setVisibility(4);
                dzr.a.setContentDescription((CharSequence) null);
                imageView.setVisibility(0);
                imageView.setOnClickListener(this.n);
                Resources resources = dzr.a.getResources();
                Drawable mutate = resources.getDrawable(R.drawable.quantum_ic_close_white_24).mutate();
                mutate.setColorFilter(resources.getColor(R.color.appinvite_dark_black), PorterDuff.Mode.MULTIPLY);
                imageView.setImageDrawable(mutate);
                if (this.u) {
                    this.u = false;
                    this.o.post(new dyv(this));
                    return;
                }
                return;
            }
            this.o.setVisibility(4);
            textView2.setVisibility(0);
            textView2.setText(this.h);
            dzr.a.setOnClickListener(this.m);
            dzr.a.setContentDescription(this.h);
            imageView.setVisibility(8);
        }
    }

    public final void a(ContactPerson contactPerson) {
        if (!this.q || this.a) {
            K(1);
            return;
        }
        L(this.f.c());
        K(this.f.c() + 1);
    }

    public final void a(ContactPerson contactPerson, int i2) {
        if (this.q && !this.a) {
            as();
        } else {
            K(1);
        }
    }

    public final void a(CharSequence charSequence) {
        EditText editText = this.o;
        if (editText != null) {
            editText.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.o.setSelection(charSequence.length());
            }
        }
    }
}
