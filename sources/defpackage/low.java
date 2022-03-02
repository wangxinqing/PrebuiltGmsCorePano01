package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.ui.select.SelectFilePreferences;
import com.google.android.gms.drive.ui.select.Selection;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/* renamed from: low  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class low extends acg implements lqf, lpw, lpu {
    public static final ith a = new ith("FileListAdapter", "");
    public static final SectionIndexer e = new lor();
    private static final anax r = anax.a(lce.a, lce.g, lce.M, lce.q, lce.N, lce.P, lce.Q, lch.b, lch.c, lch.d, lch.e);
    public lqr f;
    public Query g;
    public boolean h;
    public boolean i = true;
    public icc j;
    public lou k;
    public final PathStack l;
    public final Selection m;
    public final Context n;
    public final lpc o;
    public lph p;
    public lpl q;
    private Filter s;
    private lqs t;
    private lqw u;
    private final SelectFilePreferences v;
    private final lpc w;
    private final lpc x;
    private final Set y;
    private final boolean z;

    public low(PathStack pathStack, Selection selection, SelectFilePreferences selectFilePreferences, Context context) {
        iva.a((Object) pathStack);
        this.l = pathStack;
        iva.a((Object) selection);
        this.m = selection;
        iva.a((Object) selectFilePreferences);
        this.v = selectFilePreferences;
        iva.a((Object) context);
        this.n = context;
        this.w = new lpc();
        this.o = new lpc();
        this.x = new lpc();
        this.k = null;
        Set set = (Set) selection.b.a(new lis());
        this.y = iko.a(r, set);
        this.z = set.contains(lce.z);
    }

    private final void g() {
        if (this.k != null && this.j.i()) {
            Scope scope = jzf.a;
            icc icc = this.j;
            lou lou = this.k;
            if (lou != null) {
                icc.b((idf) new kvc(icc, kux.a((kvf) icc.a(jzf.f), lou)));
            } else {
                throw new IllegalArgumentException("Query result listener must be specified to stop a live query.");
            }
        }
        this.k = null;
    }

    public final void c() {
        h(0, a());
    }

    public final void d() {
        if (this.x.a()) {
            a.b("A sync is already in progress; not requesting another one");
            return;
        }
        a.b("Requesting sync");
        lpc lpc = this.x;
        Scope scope = jzf.a;
        icc icc = this.j;
        lpc.a(icc.b((idf) new kuo(icc)), new lot(this));
    }

    public final void e() {
        f();
        this.w.b();
        this.o.b();
        this.x.b();
        g();
    }

    public final void f() {
        lqr lqr = this.f;
        if (lqr != null) {
            lqr.c();
            this.f = null;
        }
    }

    /* access modifiers changed from: private */
    public final void a(boolean z2, boolean z3) {
        this.u = this.t.a(this.n);
        liq liq = new liq();
        liq.a(this.s);
        liq.a(lim.a(liu.c, (Object) false));
        Set<kyq> set = this.y;
        liq.b = new ArrayList();
        for (kyq a2 : set) {
            liq.b.add(a2.a());
        }
        liq.a = this.t.c();
        liq.c = this.z;
        this.g = liq.a();
        if (z2) {
            this.o.b();
            this.x.b();
            g();
        }
        if (axds.b() && !this.j.i()) {
            return;
        }
        if (!ljg.a(this.s)) {
            lpc lpc = this.w;
            Scope scope = jzf.a;
            icc icc = this.j;
            Query query = this.g;
            if (query != null) {
                lpc.a(icc.a((idf) new kun(icc, query)), new los(this, z2, z3));
                return;
            }
            throw new IllegalArgumentException("Query must be provided.");
        }
        g();
        this.k = new lou(this);
        Scope scope2 = jzf.a;
        icc icc2 = this.j;
        Query query2 = this.g;
        lou lou = this.k;
        if (query2 == null) {
            throw new IllegalArgumentException("Query must be provided.");
        } else if (lou != null) {
            icc2.b((idf) new kvb(icc2, query2, kux.a((kvf) icc2.a(jzf.f), lou))).a((icm) new loq(this));
        } else {
            throw new IllegalArgumentException("Query result listener must be specified to start a live query.");
        }
    }

    public final int a() {
        lqr lqr = this.f;
        if (lqr == null) {
            return 1;
        }
        int a2 = lqr.a();
        if (a2 == 0 && !this.h) {
            return 1;
        }
        return a2 + (this.h ? 1 : 0);
    }

    public final int a(int i2) {
        lqr lqr = this.f;
        if (lqr == null) {
            return this.i ? R.layout.drive_file_list_loading_spinner : R.layout.drive_file_list_failure_message;
        }
        int a2 = lqr.a();
        if (a2 == 0 && !this.h) {
            return R.layout.drive_file_list_empty_message;
        }
        if (i2 != a2) {
            return !this.f.a(i2).a() ? R.layout.drive_file_list_item : R.layout.drive_file_list_group_header;
        }
        return R.layout.drive_file_list_load_more_spinner;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i2 == R.layout.drive_file_list_item) {
            return new loz(inflate);
        }
        if (i2 == R.layout.drive_file_list_group_header) {
            return new lox(inflate);
        }
        if (i2 == R.layout.drive_file_list_empty_message || i2 == R.layout.drive_file_list_failure_message || i2 == R.layout.drive_file_list_load_more_spinner || i2 == R.layout.drive_file_list_loading_spinner) {
            return new adl(inflate);
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unrecognized viewType: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i2) {
        boolean z2;
        lph lph;
        PathElement pathElement;
        String str;
        float f2;
        String str2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        adl adl2 = adl;
        int i6 = i2;
        if (adl2 instanceof lox) {
            lqq a2 = this.f.a(i6);
            iva.a(a2.a(), (Object) "Cannot use as group header");
            ((lox) adl2).s.setText(a2.a.a);
        } else if (adl2 instanceof loz) {
            loz loz = (loz) adl2;
            lqq a3 = this.f.a(i6);
            iva.a(!a3.a(), (Object) "Cannot use as metadata");
            jzr jzr = a3.b;
            Selection selection = this.m;
            lqw lqw = this.u;
            PathElement b = this.l.b();
            lph lph2 = this.p;
            if (!jzr.c().equals("application/vnd.google-apps.folder")) {
                z2 = selection.a(jzr);
            } else {
                z2 = true;
            }
            boolean equals = jzr.a().equals(selection.c);
            loz.a.setEnabled(z2);
            loz.a.setSelected(equals);
            loz.s.setText(jzr.d());
            TextView textView = loz.t;
            Date date = (Date) jzr.a(lqw.c);
            if (date == null) {
                date = new Date(0);
            }
            Context context = lqw.a;
            int i7 = lqw.d;
            Object[] objArr = new Object[1];
            lsl lsl = lqw.b;
            TextView textView2 = textView;
            long time = date.getTime();
            lsl.d.set(time);
            if (!Time.isEpoch(lsl.d)) {
                pathElement = b;
                lph = lph2;
                if (time <= lsl.a - lsl.f) {
                    if (lsl.d.year != lsl.b.year) {
                        i5 = 68116;
                    } else if (lsl.d.yearDay != lsl.b.yearDay) {
                        i5 = 68120;
                    }
                    str = DateUtils.formatDateTime(lsl.c, time, i5);
                }
                i5 = 68097;
                str = DateUtils.formatDateTime(lsl.c, time, i5);
            } else {
                pathElement = b;
                lph = lph2;
                str = lsl.e;
            }
            objArr[0] = str;
            textView2.setText(context.getString(i7, objArr));
            if (equals) {
                TextView textView3 = loz.s;
                String valueOf = String.valueOf(textView3.getText());
                String string = loz.a.getContext().getString(R.string.drive_file_list_selected_item);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
                sb.append(valueOf);
                sb.append(",");
                sb.append(string);
                textView3.setContentDescription(sb.toString());
            }
            String c = jzr.c();
            lod a4 = loe.a(c);
            loz.u.setImageResource(a4.a(jzr.f()));
            ImageView imageView = loz.u;
            if (!z2) {
                f2 = 0.6f;
            } else {
                f2 = 1.0f;
            }
            imageView.setAlpha(f2);
            loy loy = null;
            if ("application/vnd.google-apps.folder".equals(c)) {
                if (((Boolean) jzq.N.c()).booleanValue()) {
                    if (((Boolean) jzq.M.c()).booleanValue()) {
                        if (jzr.b() != null) {
                            String b2 = jzr.b();
                            int parseColor = Color.parseColor(b2);
                            loz.u.setColorFilter(parseColor);
                            str2 = !b2.equals(jzq.V.c()) ? loz.a.getContext().getString(R.string.drive_document_type_folder_with_color, new Object[]{loz.a.getContext().getString(lpa.a.get(parseColor, R.string.drive_folder_color_unknown))}) : null;
                        }
                    }
                }
                loz.u.setColorFilter(Color.parseColor((String) jzq.V.c()));
                str2 = null;
            } else {
                loz.u.clearColorFilter();
                str2 = null;
            }
            ImageView imageView2 = loz.u;
            if (str2 == null) {
                str2 = loz.a.getContext().getString(a4.a);
            }
            imageView2.setContentDescription(str2);
            ImageView imageView3 = loz.v;
            Boolean bool = (Boolean) jzr.a(lce.M);
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                z3 = false;
            }
            if (!z3) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView3.setVisibility(i3);
            ImageView imageView4 = loz.w;
            if (!jzr.f() || pathElement == lqj.b) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            imageView4.setVisibility(i4);
            loz.x.setVisibility((!jzr.g() || pathElement == lqj.c) ? 8 : 0);
            int color = loz.a.getContext().getResources().getColor(!z2 ? R.color.drive_DisabledText : R.color.drive_SecondaryText);
            loz.v.setColorFilter(color);
            loz.w.setColorFilter(color);
            loz.x.setColorFilter(color);
            View view = loz.a;
            if (lph != null) {
                loy = new loy(lph, jzr);
            }
            view.setOnClickListener(loy);
        }
    }

    public final void a(PathElement pathElement) {
        if (pathElement != PathStack.b) {
            this.s = pathElement.b();
            this.t = this.v.a(pathElement.c());
            a(true, false);
        }
    }

    public final void a(jzt jzt, boolean z2) {
        f();
        this.f = this.t.a(jzt, this.n);
        as();
        lpl lpl = this.q;
        if (lpl != null) {
            lpl.a(z2);
        }
    }

    public final void a(lqu lqu, lqs lqs) {
        this.t = lqs;
        a(false, false);
    }
}
