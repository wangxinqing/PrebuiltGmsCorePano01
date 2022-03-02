package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: oak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oak extends BaseAdapter {
    private final LayoutInflater a;
    private final List b;
    private final Spinner c;
    private final Context d;

    public oak(Context context, Spinner spinner, String str) {
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
        ArrayList arrayList = new ArrayList();
        String language = Locale.getDefault().getLanguage();
        int i = 0;
        for (String locale : Locale.getISOCountries()) {
            arrayList.add(new Locale(language, locale));
        }
        Collections.sort(arrayList, new oaj());
        this.b = arrayList;
        this.c = spinner;
        spinner.setAdapter(this);
        Spinner spinner2 = this.c;
        int i2 = 0;
        while (true) {
            if (i2 < this.b.size()) {
                if (((Locale) this.b.get(i2)).getDisplayCountry().equals(str)) {
                    i = i2;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        spinner2.setSelection(i);
        this.d = context;
    }

    private final View a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(17367048, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i).getDisplayCountry());
        return view;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View a2 = a(i, view, viewGroup);
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.gh_contact_spinner_common_spacing);
        a2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, this.d.getResources().getDimensionPixelSize(R.dimen.gh_contact_spinner_bottom_spacing));
        ((TextView) a2).setSingleLine(false);
        return a2;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View a2 = a(i, view, viewGroup);
        a2.setPadding(this.d.getResources().getDimensionPixelSize(R.dimen.gh_control_inset_material), a2.getPaddingTop(), a2.getPaddingRight(), a2.getPaddingBottom());
        return a2;
    }

    public final Locale a() {
        return getItem(this.c.getSelectedItemPosition());
    }

    /* renamed from: a */
    public final Locale getItem(int i) {
        return (Locale) this.b.get(i);
    }
}
