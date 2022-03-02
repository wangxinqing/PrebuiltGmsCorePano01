package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: alal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alal extends Fragment implements AdapterView.OnItemClickListener, TextView.OnEditorActionListener, View.OnKeyListener, TextWatcher, akzw, akzt, akzq {
    public ProgressBar a;
    public ListView b;
    public List c;
    public ListAdapter d;
    public alai e;
    public akyr f;
    public akzz g;
    public alah h;
    public int i = 3;
    private ViewGroup j;
    private View k;
    private EditText l;
    private ImageButton m;
    private String n;
    private boolean o;
    private int p;
    private int q;
    private boolean r = false;
    private final AdapterView.OnItemClickListener s = new alaf(this);
    private final View.OnTouchListener t = new alag(this);

    public static alal a(int i2, int i3, String str) {
        alal alal = new alal();
        Bundle bundle = new Bundle();
        bundle.putInt("primary_color", i2);
        bundle.putInt("primary_color_dark", i3);
        bundle.putString("search_term_key", str);
        alal.setArguments(bundle);
        return alal;
    }

    public final void a(Map map) {
        throw null;
    }

    public final void afterTextChanged(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.b.setVisibility(8);
        g();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void c() {
        if (this.d != null) {
            this.b.setOnItemClickListener(this.s);
            this.b.setAdapter(this.d);
            if (this.d instanceof rlr) {
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
        }
    }

    public final void d() {
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.l.requestFocus();
        Activity activity = getActivity();
        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(this.l, 0);
    }

    public final void f() {
        this.l.clearFocus();
        alan.a((Context) getActivity(), (View) this.l);
    }

    public final void g() {
        View view = this.k;
        if (view != null) {
            this.j.removeView(view);
            this.k = null;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.o = true;
        sg aE = ((bjs) getActivity()).aE();
        aE.d(20);
        aE.a((int) R.layout.places_ui_search_plate);
        View a2 = aE.a();
        this.l = (EditText) a2.findViewById(R.id.input);
        this.a = (ProgressBar) a2.findViewById(R.id.progress_bar);
        this.m = (ImageButton) a2.findViewById(R.id.clear);
        if (azcc.a.a().h()) {
            this.d = new rlr(this.g.a);
        } else {
            this.c = new ArrayList();
            this.d = new alak(this, getActivity(), this.c);
        }
        ListView listView = (ListView) getView().findViewById(R.id.list);
        this.b = listView;
        listView.setDivider((Drawable) null);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setOnTouchListener(this.t);
        this.l.setOnEditorActionListener(this);
        this.l.setOnKeyListener(this);
        this.l.addTextChangedListener(this);
        this.m.setOnClickListener(new alab(this));
        e();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof bjs)) {
            throw new RuntimeException(String.valueOf(activity.toString()).concat(" must be an instance of AppCompatActivity."));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null) {
            this.n = bundle.getString("search_term_key");
            this.i = bundle.getInt("ime_action_key");
            this.p = bundle.getInt("primary_color");
            this.q = bundle.getInt("primary_color_dark");
            this.r = bundle.getBoolean("input_received_key");
        } else if (getArguments() != null) {
            this.n = getArguments().getString("search_term_key");
            this.p = getArguments().getInt("primary_color");
            this.q = getArguments().getInt("primary_color_dark");
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.places_ui_menu_main, menu);
        MenuItem findItem = menu.findItem(R.id.places_ui_menu_main_search);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.places_ui_search, viewGroup, false);
        this.j = (ViewGroup) inflate.findViewById(R.id.container);
        akyp.a(getActivity(), getResources().getColor(R.color.places_ui_search_primary), getResources().getColor(R.color.places_ui_search_primary_dark), getResources().getColor(R.color.places_ui_search_text));
        return inflate;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != this.i) {
            return false;
        }
        a(textView.getText().toString());
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        String str = (String) adapterView.getItemAtPosition(i2);
        if (str != null) {
            a(str, true);
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        String obj = this.l.getText().toString();
        if (keyEvent.getAction() != 1 || i2 != 66) {
            return false;
        }
        view.cancelLongPress();
        a(obj);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        EditText editText = this.l;
        if (editText != null && !editText.getText().toString().isEmpty()) {
            bundle.putString("search_term_key", this.l.getText().toString());
        }
        bundle.putInt("ime_action_key", this.i);
        bundle.putInt("primary_color", this.p);
        bundle.putInt("primary_color_dark", this.q);
        bundle.putBoolean("input_received_key", this.r);
    }

    public final void onStart() {
        super.onStart();
        this.g.d = this;
        if (this.o) {
            if (this.n != null) {
                c();
                this.l.setText(this.n);
            } else {
                c();
            }
            this.l.setImeOptions(this.i | 268435456);
            this.o = false;
        }
    }

    public final void onStop() {
        akzz akzz = this.g;
        akzz.d = null;
        akzz.h = null;
        akzz.a();
        super.onStop();
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.r = true;
        String charSequence2 = charSequence.toString();
        if (charSequence2.isEmpty()) {
            this.a.setVisibility(8);
            this.m.setVisibility(8);
            ListAdapter listAdapter = this.d;
            if (listAdapter instanceof rlr) {
                ((rlr) listAdapter).a.filter((CharSequence) null);
                return;
            }
            this.b.setVisibility(8);
            icf icf = this.g.i;
            if (icf != null) {
                icf.b();
                return;
            }
            return;
        }
        akzz akzz = this.g;
        icf icf2 = akzz.n;
        if (icf2 != null) {
            icf2.b();
        }
        icf icf3 = akzz.o;
        if (icf3 != null) {
            icf3.b();
        }
        this.m.setVisibility(0);
        if (this.g != null && this.l.hasFocus()) {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 instanceof rlr) {
                ((rlr) listAdapter2).a.filter(charSequence2);
            } else {
                akzz akzz2 = this.g;
                LatLngBounds d2 = this.h.d();
                icf icf4 = akzz2.j;
                if (icf4 != null) {
                    icf4.b();
                }
                icf icf5 = akzz2.i;
                if (icf5 != null) {
                    icf5.b();
                }
                icf icf6 = akzz2.k;
                if (icf6 != null) {
                    icf6.b();
                }
                ibq ibq = rij.a;
                akzz2.i = rjl.a(akzz2.a, charSequence2, d2, akzz2.c);
                akzz2.i.a(new akzn(akzz2), azcc.d(), TimeUnit.MILLISECONDS);
            }
        }
        c();
    }

    public final void a() {
        a(this.l.getText().toString());
    }

    public final void onDestroyView() {
        Activity activity = getActivity();
        akyp.a(activity, this.p, this.q, activity.getResources().getColor(R.color.places_ui_default_text));
        f();
        super.onDestroyView();
    }

    public final void a(int i2, String str, Runnable runnable) {
        if (isVisible()) {
            View inflate = getActivity().getLayoutInflater().inflate(i2, this.j, false);
            this.k = inflate;
            if (runnable != null) {
                ((Button) inflate.findViewById(R.id.action)).setText(str);
                this.k.findViewById(R.id.action).setOnClickListener(new alae(runnable));
            } else {
                inflate.findViewById(R.id.action).setVisibility(8);
            }
            ViewGroup viewGroup = this.j;
            viewGroup.addView(this.k, viewGroup.getChildCount() - 1);
            this.k.sendAccessibilityEvent(32);
        }
    }

    public final void a(String str) {
        f();
        if (!(this.d instanceof rlr)) {
            b();
            if (!str.isEmpty() && this.g != null) {
                this.a.setVisibility(0);
                akzz akzz = this.g;
                LatLngBounds d2 = this.h.d();
                icf icf = akzz.j;
                if (icf != null) {
                    icf.b();
                }
                icf icf2 = akzz.i;
                if (icf2 != null) {
                    icf2.b();
                }
                icf icf3 = akzz.k;
                if (icf3 != null) {
                    icf3.b();
                }
                ibq ibq = rij.a;
                akzz.j = rjl.a(akzz.a, d2, (int) azcc.c(), str, akzz.b);
                akzz.j.a(new akzx(akzz, str), azcc.d(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void a(String str, boolean z) {
        this.l.setText(str);
        if (z) {
            a(str);
        }
    }

    public final void a(rhq[] rhqArr) {
        if (rhqArr.length <= 0) {
            a();
        } else if (isVisible()) {
            this.a.setVisibility(8);
            alai alai = this.e;
            if (alai != null) {
                this.l.getText().toString();
                alai.b(rhqArr);
            }
        }
    }
}
