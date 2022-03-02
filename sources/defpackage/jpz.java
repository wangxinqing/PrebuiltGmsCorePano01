package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: jpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpz implements ViewTreeObserver.OnPreDrawListener, ax {
    public boolean a;
    public final jtf b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final ViewGroup l;
    public final ViewGroup m;
    public final ViewGroup n;
    public final ViewGroup o;
    public final ViewGroup p;
    public final ViewGroup q;
    public final ViewGroup r;
    public final ViewGroup s;
    public final ViewGroup t;
    public final ViewGroup u;
    public final CardButton v;
    private int w;
    private final jsx x;
    private final TextView y;
    private final TextView z;

    public jpz(View view, jsx jsx, jtf jtf) {
        this.x = jsx;
        this.b = jtf;
        this.c = view;
        CardButton cardButton = (CardButton) view.findViewById(R.id.card_button);
        this.v = cardButton;
        cardButton.setOnClickListener(new jps(this));
        this.y = (TextView) view.findViewById(R.id.introduction_title);
        this.l = (ViewGroup) view.findViewById(R.id.introduction);
        this.d = (TextView) view.findViewById(R.id.birthday_title);
        this.m = (ViewGroup) view.findViewById(R.id.birthday);
        this.e = (TextView) view.findViewById(R.id.gender_title);
        this.n = (ViewGroup) view.findViewById(R.id.gender);
        this.f = (TextView) view.findViewById(R.id.events_title);
        this.o = (ViewGroup) view.findViewById(R.id.events);
        this.g = (TextView) view.findViewById(R.id.links_title);
        this.p = (ViewGroup) view.findViewById(R.id.links);
        this.h = (TextView) view.findViewById(R.id.relations_title);
        this.q = (ViewGroup) view.findViewById(R.id.relations);
        this.i = (TextView) view.findViewById(R.id.instant_messaging_title);
        this.r = (ViewGroup) view.findViewById(R.id.instant_messaging);
        this.j = (TextView) view.findViewById(R.id.sip_address_title);
        this.s = (ViewGroup) view.findViewById(R.id.sip_address);
        this.k = (TextView) view.findViewById(R.id.user_defined_fields_title);
        this.t = (ViewGroup) view.findViewById(R.id.user_defined_fields);
        this.z = (TextView) view.findViewById(R.id.notes_title);
        this.u = (ViewGroup) view.findViewById(R.id.notes);
        view.setVisibility(8);
    }

    private final View a(String str, ViewGroup viewGroup) {
        TextView textView = (TextView) LayoutInflater.from(this.c.getContext()).inflate(R.layout.gm_about_card_entry_text_only, viewGroup, false);
        if (azhr.a.a().c()) {
            TypedValue typedValue = new TypedValue();
            textView.getResources().getValue(R.dimen.text_view_line_spacing, typedValue, true);
            textView.setLineSpacing(0.0f, typedValue.getFloat());
        }
        textView.setText(str);
        textView.setOnLongClickListener(new jpw(this, str));
        return textView;
    }

    private final void b(TextView textView) {
        if (textView != null && textView.getLineCount() > 5) {
            this.v.setVisibility(0);
            a();
            textView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    public final boolean onPreDraw() {
        if (!azhr.e()) {
            return true;
        }
        b((TextView) this.u.findViewById(R.id.text));
        b((TextView) this.l.findViewById(R.id.text));
        return true;
    }

    private static final void b(TextView textView, ViewGroup viewGroup) {
        textView.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private final View a(jsr jsr) {
        jpy jpy = new jpy(this.c.getContext());
        jpy.a(jsr.a());
        if (jsr.b().a()) {
            jpy.b((String) jsr.b().b());
        }
        return jpy;
    }

    private final String a(avop avop) {
        DateFormat dateFormat;
        if (avop.a == 0) {
            dateFormat = jpp.a(this.c.getContext());
        } else {
            dateFormat = android.text.format.DateFormat.getLongDateFormat(this.c.getContext());
        }
        Calendar instance = Calendar.getInstance();
        instance.set(avop.a, avop.b - 1, avop.c);
        dateFormat.setCalendar(instance);
        return dateFormat.format(instance.getTime());
    }

    private final void a(TextView textView) {
        textView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public static final void a(TextView textView, ViewGroup viewGroup) {
        textView.setVisibility(0);
        viewGroup.setVisibility(0);
    }

    public final void a() {
        this.a = false;
        this.v.a();
        if (this.l.getChildCount() > 0) {
            ((TextView) this.l.getChildAt(0).findViewById(R.id.text)).setMaxLines(5);
        }
        if (this.u.getChildCount() > 0) {
            ((TextView) this.u.getChildAt(0).findViewById(R.id.text)).setMaxLines(5);
        }
        b(this.e, this.n);
        b(this.f, this.o);
        b(this.h, this.q);
        b(this.i, this.r);
        b(this.j, this.s);
        b(this.k, this.t);
    }

    public final void a(amri amri) {
        boolean z2;
        this.w = 200;
        this.l.removeAllViews();
        this.m.removeAllViews();
        this.n.removeAllViews();
        this.o.removeAllViews();
        this.p.removeAllViews();
        this.q.removeAllViews();
        this.r.removeAllViews();
        this.s.removeAllViews();
        this.t.removeAllViews();
        this.u.removeAllViews();
        b(this.d, this.m);
        b(this.y, this.l);
        b(this.e, this.n);
        b(this.f, this.o);
        b(this.g, this.p);
        b(this.h, this.q);
        b(this.i, this.r);
        b(this.j, this.s);
        b(this.k, this.t);
        b(this.z, this.u);
        this.c.setVisibility(8);
        if (amri.a()) {
            jsb jsb = (jsb) amri.b();
            if (jsb.a().a()) {
                this.l.addView(a(jpr.a((String) jsb.a().b()).toString().trim(), this.l));
                if (azhr.e()) {
                    a((TextView) this.l.findViewById(R.id.text));
                }
                a(this.y, this.l);
            }
            if (jsb.b().a()) {
                this.m.addView(a(a((avop) jsb.b().b()), this.m));
                a(this.d, this.m);
            }
            if (jsb.c().a()) {
                ViewGroup viewGroup = this.n;
                viewGroup.addView(a((String) jsb.c().b(), viewGroup));
                a(this.e, this.n);
            }
            if (!jsb.d().isEmpty()) {
                anhk i2 = jsb.d().listIterator();
                while (i2.hasNext()) {
                    avhc avhc = (avhc) i2.next();
                    jpy jpy = new jpy(this.c.getContext());
                    if ((avhc.a & 4) != 0) {
                        avop avop = avhc.c;
                        if (avop == null) {
                            avop = avop.d;
                        }
                        jpy.a(a(avop));
                    }
                    if (!avhc.d.isEmpty()) {
                        jpy.b(avhc.d);
                    }
                    this.o.addView(jpy);
                }
                a(this.f, this.o);
            }
            boolean z3 = true;
            if (!jsb.e().isEmpty()) {
                amzy e2 = jsb.e();
                int i3 = 0;
                while (i3 < e2.size()) {
                    ViewGroup viewGroup2 = this.p;
                    jsl jsl = (jsl) e2.get(i3);
                    i3++;
                    int size = e2.size();
                    TextView textView = (TextView) LayoutInflater.from(this.c.getContext()).inflate(R.layout.gm_single_link, this.p, false);
                    textView.setText(jsl.a());
                    textView.setContentDescription(this.c.getContext().getString(R.string.link_content_description, new Object[]{Integer.valueOf(i3), Integer.valueOf(size), jsl.a()}));
                    int dimensionPixelSize = this.c.getContext().getResources().getDimensionPixelSize(R.dimen.gm_link_icon_size);
                    jsx jsx = this.x;
                    String c2 = jsl.c();
                    int i4 = this.w;
                    this.w = i4 + 1;
                    jsx.a(c2, i4, new jpt(this, dimensionPixelSize, textView));
                    textView.setOnClickListener(new jpu(this, new Intent("android.intent.action.VIEW", Uri.parse(jpr.b(jsl.b())))));
                    textView.setOnLongClickListener(new jpv(this, jsl));
                    viewGroup2.addView(textView);
                }
                a(this.g, this.p);
            }
            if (!jsb.f().isEmpty()) {
                anhk i5 = jsb.f().listIterator();
                while (i5.hasNext()) {
                    this.q.addView(a((jsr) i5.next()));
                }
                a(this.h, this.q);
            }
            if (!jsb.g().isEmpty()) {
                anhk i6 = jsb.g().listIterator();
                while (i6.hasNext()) {
                    this.r.addView(a((jsr) i6.next()));
                }
                a(this.i, this.r);
            }
            if (!jsb.h().isEmpty()) {
                anhk i7 = jsb.h().listIterator();
                while (i7.hasNext()) {
                    this.s.addView(a((jsr) i7.next()));
                }
                a(this.j, this.s);
            }
            if (!jsb.i().isEmpty()) {
                anhk i8 = jsb.i().listIterator();
                while (i8.hasNext()) {
                    this.t.addView(a((jsr) i8.next()));
                }
                a(this.k, this.t);
            }
            if (jsb.j().a()) {
                this.u.addView(a(jpr.a((String) jsb.j().b()).toString().trim(), this.u));
                if (azhr.e()) {
                    a((TextView) this.u.findViewById(R.id.text));
                }
                a(this.z, this.u);
            }
            if (jsb.a().a() || jsb.b().a() || !jsb.e().isEmpty()) {
                z2 = true;
            } else {
                z2 = jsb.j().a();
            }
            if (!jsb.c().a() && jsb.d().isEmpty() && jsb.f().isEmpty() && jsb.g().isEmpty() && jsb.h().isEmpty() && jsb.i().isEmpty()) {
                z3 = false;
            }
            if (z2 && z3) {
                this.v.setVisibility(0);
                a();
            } else {
                this.v.setVisibility(8);
            }
            if (!z2 && !z3) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
            }
        }
    }
}
