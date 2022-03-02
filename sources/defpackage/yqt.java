package defpackage;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.plus.audience.FaclSelectionChimeraActivity;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: yqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqt extends ypj implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, yqc {
    public static final /* synthetic */ int c = 0;
    public CheckBox a;
    public HashSet b = new HashSet();
    private CheckBox d;
    private View o;
    private TextView p;

    private final void k() {
        CheckBox checkBox = this.a;
        if (checkBox != null && !checkBox.isChecked()) {
            g().a(new iww().a(), this);
        }
        l();
    }

    private final void l() {
        b().C = false;
        ListView listView = getListView();
        this.p.setText(R.string.plus_auth_hide_circles_label);
        for (int i = 0; i < listView.getChildCount(); i++) {
            View childAt = listView.getChildAt(i);
            if (!(childAt == null || childAt == this.o)) {
                childAt.setVisibility(0);
            }
        }
    }

    private final void m() {
        b().C = true;
        ListView listView = getListView();
        this.p.setText(R.string.plus_auth_see_circles_label);
        for (int i = 0; i < listView.getChildCount(); i++) {
            View childAt = listView.getChildAt(i);
            if (!(childAt == null || childAt == this.o)) {
                childAt.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final View a() {
        View view = this.o;
        if (view != null) {
            return view;
        }
        this.o = LayoutInflater.from(getActivity()).inflate(R.layout.plus_audience_selection_facl_header, (ViewGroup) null);
        FaclSelectionChimeraActivity i = b();
        TextView textView = (TextView) this.o.findViewById(R.id.description);
        textView.setText(Html.fromHtml(i.D));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        this.p = (TextView) this.o.findViewById(R.id.see_circles_label);
        this.a = (CheckBox) this.o.findViewById(R.id.circles_select_all_checkbox);
        if (i.y) {
            CheckBox checkBox = (CheckBox) this.o.findViewById(R.id.contacts_select_all_checkbox);
            this.d = checkBox;
            checkBox.setOnCheckedChangeListener(this);
            this.d.setChecked(i.A);
            this.o.findViewById(R.id.contacts_select_all).setOnClickListener(this);
        } else {
            this.o.findViewById(R.id.contacts_select_all).setVisibility(8);
            this.o.findViewById(R.id.divider_contacts_circles).setVisibility(8);
        }
        if (!i.x || i.z) {
            this.a.setOnCheckedChangeListener(this);
            this.a.setOnClickListener(this);
            this.a.setChecked(i.B);
            this.p.setOnClickListener(this);
            this.p.setClickable(true);
            if (i.C) {
                m();
            } else {
                l();
            }
            this.o.findViewById(R.id.circles_select_all).setOnClickListener(this);
        } else {
            m();
            this.o.findViewById(R.id.divider_contacts_circles).setVisibility(8);
            this.o.findViewById(R.id.circles_select_all).setVisibility(8);
            this.o.findViewById(R.id.divider_circles).setVisibility(8);
            this.o.findViewById(R.id.see_circles_label).setVisibility(8);
        }
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final yoy d() {
        return new yqs(this, getActivity(), g(), this.l, this.m);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ BaseAdapter f() {
        return f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FaclSelectionChimeraActivity b() {
        return (FaclSelectionChimeraActivity) super.b();
    }

    public final void j() {
        CheckBox checkBox = this.a;
        if (checkBox != null && checkBox.isChecked()) {
            yqd g = g();
            iww iww = new iww(g().a);
            iww.a((Collection) this.b);
            g.a(iww.a(), this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof FaclSelectionChimeraActivity)) {
            throw new IllegalStateException("FaclSelectionFragment may only be used by FaclSelectionChimeraActivity");
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FaclSelectionChimeraActivity i = b();
        int id = compoundButton.getId();
        if (id == R.id.contacts_select_all_checkbox) {
            i.A = z;
        } else if (id == R.id.circles_select_all_checkbox) {
            i.B = z;
            j();
            if (!this.a.isChecked()) {
                l();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.contacts_select_all) {
            this.d.toggle();
        } else if (view.getId() == R.id.circles_select_all) {
            this.a.toggle();
            k();
        } else if (view.getId() == R.id.circles_select_all_checkbox) {
            k();
        } else if (view.getId() == R.id.see_circles_label) {
            if (b().C) {
                l();
            } else {
                m();
            }
            this.p.sendAccessibilityEvent(8);
        }
    }

    public final void onStart() {
        super.onStart();
        g().a(this);
    }

    public final void onStop() {
        g().b(this);
        super.onStop();
    }

    public final void a(Object obj) {
        if (obj == this) {
            return;
        }
        if (g().a.b.size() < this.b.size()) {
            this.a.setChecked(false);
        } else {
            this.a.setChecked(true);
        }
    }
}
