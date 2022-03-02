package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.Arrays;

/* renamed from: jmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jmf extends BaseAdapter implements AdapterView.OnItemSelectedListener {
    public AdapterView.OnItemSelectedListener a;
    private final Object b = new Object();
    private final String c;
    private final Context d;
    private final LayoutInflater e;
    private final SharedPreferences f;
    private String[] g;
    private final CharSequence h;
    private int i;
    private sg j;
    private Spinner k;

    public jmf(Context context, String str, CharSequence charSequence, String[] strArr) {
        this.d = context;
        this.e = LayoutInflater.from(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("common.google_account_spinner", 0);
        this.f = sharedPreferences;
        this.c = str;
        this.h = charSequence;
        this.g = strArr;
        this.i = a(sharedPreferences.getString("common.google_account_spinner.selected_account", (String) null));
    }

    private final void b(String str) {
        if (!TextUtils.equals(this.f.getString("common.google_account_spinner.selected_account", (String) null), str)) {
            SharedPreferences.Editor edit = this.f.edit();
            if (str != null) {
                edit.putString("common.google_account_spinner.selected_account", str);
            } else {
                edit.remove("common.google_account_spinner.selected_account");
            }
            edit.apply();
        }
    }

    private final void c() {
        this.j.a((int) R.layout.common_action_bar_spinner);
        this.j.a(16, 24);
        Spinner spinner = (Spinner) this.j.a().findViewById(R.id.action_bar_spinner);
        this.k = spinner;
        spinner.setAdapter(this);
        this.k.setOnItemSelectedListener(this);
        int i2 = this.i;
        if (i2 >= 0) {
            this.k.setSelection(i2);
        }
        this.k.setVisibility(0);
    }

    public final int a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = this.g;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (str.equals(strArr[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final int getCount() {
        return this.g.length;
    }

    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(R.layout.support_simple_spinner_dropdown_item, viewGroup, false);
        }
        try {
            ((TextView) view).setText(getItem(i2));
        } catch (ClassCastException e2) {
            Log.wtf("GoogleAccountSpinnerAdapter", "drop down view didn't cast to TextView");
        }
        return view;
    }

    public final long getItemId(int i2) {
        String b2 = getItem(i2);
        if (b2 != null) {
            return (long) b2.hashCode();
        }
        return -1;
    }

    public final int getItemViewType(int i2) {
        return 0;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(R.layout.common_action_bar_title_item, viewGroup, false);
        }
        try {
            TextView textView = (TextView) view.findViewById(R.id.action_bar_title);
            textView.setTextAppearance(this.d, 2132018222);
            textView.setText(this.h);
        } catch (ClassCastException e2) {
            Log.wtf("GoogleAccountSpinnerAdapter", "title field didn't cast to TextView");
        }
        try {
            TextView textView2 = (TextView) view.findViewById(R.id.action_bar_subtitle);
            textView2.setTextAppearance(this.d, 2132018220);
            textView2.setText(getItem(i2));
            textView2.setVisibility(0);
        } catch (ClassCastException e3) {
            Log.wtf("GoogleAccountSpinnerAdapter", "subtitle field didn't cast to TextView");
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        this.i = i2;
        b(this.g[i2]);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.a;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i2, j2);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.i = -1;
        b((String) null);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.a;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    public final String a() {
        return getItem(this.i);
    }

    public final void a(int i2) {
        if (i2 < -1 || i2 >= this.g.length) {
            i2 = -1;
        }
        this.i = i2;
        b(getItem(i2));
        Spinner spinner = this.k;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }

    /* renamed from: b */
    public final String getItem(int i2) {
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.g;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public final void a(sg sgVar) {
        this.j = sgVar;
        Spinner spinner = this.k;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) null);
            this.k.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
        if (this.g.length == 0) {
            this.j.a(this.h);
        } else {
            c();
        }
    }

    public final void b() {
        boolean z;
        boolean z2;
        String[] b2 = jgu.b(jgu.d(this.d, this.c));
        synchronized (this.b) {
            z = true;
            z2 = false;
            if (!Arrays.equals(b2, this.g)) {
                if (this.g.length == 0 && b2.length > 0) {
                    z2 = true;
                }
                this.g = b2;
            } else {
                z = false;
            }
        }
        if (z2) {
            c();
        }
        if (z) {
            notifyDataSetChanged();
        }
    }
}
