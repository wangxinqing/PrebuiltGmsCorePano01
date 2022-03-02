package defpackage;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: zkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zkt extends Fragment implements AdapterView.OnItemSelectedListener {
    public AddToCircleData a;
    public int b = -1;
    public boolean c;
    public boolean d;
    public CheckBox e;
    TextView f;
    public zkx g;
    public Spinner h;
    public zmd i;
    private boolean j;

    public final void a(AddToCircleData addToCircleData, boolean z) {
        int i2;
        this.a = addToCircleData;
        TextView textView = this.f;
        int size = addToCircleData.f().b.size();
        String quantityString = getResources().getQuantityString(R.plurals.plus_sharebox_circles_checkbox_number_of_people, size, new Object[]{Integer.valueOf(size)});
        String string = getResources().getString(R.string.plus_sharebox_circles_checkbox_label, new Object[]{quantityString});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        zks zks = new zks(this);
        int indexOf = string.indexOf(quantityString);
        spannableStringBuilder.setSpan(zks, indexOf, quantityString.length() + indexOf, spannableStringBuilder.getSpanFlags(zks));
        textView.setText(spannableStringBuilder);
        this.f.setMovementMethod(LinkMovementMethod.getInstance());
        if (z && this.j) {
            this.e.setChecked(this.c);
            this.e.setEnabled(this.d);
        } else {
            this.e.setChecked(this.a.d());
        }
        this.e.setEnabled(!this.a.f().b.isEmpty());
        zkx zkx = new zkx(getActivity(), this.a.f);
        this.g = zkx;
        this.h.setAdapter(zkx);
        this.h.setOnItemSelectedListener(this);
        if (z && (i2 = this.b) >= 0) {
            this.h.setSelection(i2);
        } else if (addToCircleData.g.intValue() >= 0 && addToCircleData.f != null && addToCircleData.g.intValue() < addToCircleData.f.size()) {
            this.h.setSelection(this.a.c());
        } else {
            this.h.setSelection(0);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof zmd)) {
            String valueOf = String.valueOf(zmd.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.i = (zmd) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
            this.b = bundle.getInt("last_position", -1);
            this.c = bundle.getBoolean("last_checked");
            this.d = bundle.getBoolean("last_enabled");
        }
        this.j = bundle != null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.plus_sharebox_add_to_circle_fragment, viewGroup, false);
        this.e = (CheckBox) inflate.findViewById(R.id.circles_checkbox);
        this.f = (TextView) inflate.findViewById(R.id.circles_checkbox_text);
        this.h = (Spinner) inflate.findViewById(R.id.circles_spinner);
        return inflate;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        Circle circle;
        if (view != null) {
            circle = (Circle) view.getTag();
        } else {
            circle = null;
        }
        if (circle == null) {
            return;
        }
        if (Circle.a(circle)) {
            this.i.k();
            return;
        }
        if (!this.e.isChecked() && this.b != i2 && !TextUtils.isEmpty(circle.e)) {
            this.e.setChecked(true);
        }
        this.b = i2;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("add_to_circle_data", this.a);
        bundle.putInt("last_position", this.b);
        CheckBox checkBox = this.e;
        boolean z = false;
        bundle.putBoolean("last_checked", checkBox != null ? checkBox.isChecked() : false);
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            z = checkBox2.isEnabled();
        }
        bundle.putBoolean("last_enabled", z);
    }

    public final void onStart() {
        super.onStart();
        AddToCircleData addToCircleData = this.a;
        if (addToCircleData != null) {
            a(addToCircleData, true);
        }
    }
}
