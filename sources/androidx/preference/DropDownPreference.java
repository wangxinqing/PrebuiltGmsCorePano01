package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DropDownPreference extends ListPreference {
    private final ArrayAdapter G;
    private Spinner H;
    private final AdapterView.OnItemSelectedListener I = new ama(this);
    public final Context g;

    /* access modifiers changed from: protected */
    public final void a() {
        this.H.performClick();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        ArrayAdapter arrayAdapter = this.G;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.g = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.g, 17367049);
        this.G = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.G.add(charSequence.toString());
            }
        }
    }

    public final void a(anb anb) {
        Spinner spinner = (Spinner) anb.a.findViewById(R.id.spinner);
        this.H = spinner;
        spinner.setAdapter(this.G);
        this.H.setOnItemSelectedListener(this.I);
        Spinner spinner2 = this.H;
        String str = this.j;
        CharSequence[] charSequenceArr = this.i;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.a(anb);
    }
}
