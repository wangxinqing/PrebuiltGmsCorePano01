package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewPronoun$SavedState;
import com.google.android.gms.plus.oob.GenderSpinner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: yyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyn extends yxw implements yys {
    public yyr d;
    public GenderSpinner e;
    public ArrayList f;
    public int g = -1;
    private TextView h;
    private ArrayList i;
    private Map j;
    private boolean k;

    public yyn(Context context, boolean z) {
        super(context, z);
    }

    private final String c(int i2) {
        if (!this.b.m()) {
            return null;
        }
        if (i2 >= 0 && i2 < this.i.size()) {
            return ((zdv) this.i.get(i2)).b();
        }
        String valueOf = String.valueOf(this.b.f());
        Log.e("FieldView", valueOf.length() == 0 ? new String("Invalid position for options field: id=") : "Invalid position for options field: id=".concat(valueOf));
        return null;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_pronoun : R.layout.plus_oob_field_pronoun_setup_wizard;
    }

    public final void b(int i2) {
        if (i2 != -1) {
            this.d.a();
            this.g = i2;
            this.c.a();
            j();
        }
    }

    public final void j() {
        int i2;
        String str = null;
        if (!(this.j.size() == 0 || (i2 = this.g) == -1)) {
            Map map = this.j;
            String valueOf = String.valueOf(c(i2));
            str = ((zdv) map.get(valueOf.length() == 0 ? new String("s_") : "s_".concat(valueOf))).c();
        }
        if (str == null) {
            this.h.setText("");
            this.h.setVisibility(8);
            return;
        }
        this.h.setText(str);
        this.h.setVisibility(0);
    }

    public final void onAttachedToWindow() {
        GenderSpinner genderSpinner = this.e;
        if (genderSpinner != null) {
            int i2 = this.g;
            if (i2 == -1) {
                this.d.a(genderSpinner.getPrompt());
            } else {
                genderSpinner.setSelection(i2);
            }
            j();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewPronoun$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewPronoun$SavedState fieldViewPronoun$SavedState = (FieldViewPronoun$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewPronoun$SavedState.getSuperState());
        this.k = fieldViewPronoun$SavedState.a;
        int i2 = fieldViewPronoun$SavedState.b;
        this.g = i2;
        if (i2 != -1) {
            this.e.setSelection(i2);
        }
        j();
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewPronoun$SavedState fieldViewPronoun$SavedState = new FieldViewPronoun$SavedState(super.onSaveInstanceState());
        fieldViewPronoun$SavedState.a = this.k;
        fieldViewPronoun$SavedState.b = !this.d.b() ? this.e.getSelectedItemPosition() : -1;
        return fieldViewPronoun$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        String str;
        super.a(zea, yxv);
        this.i = new ArrayList();
        this.j = new HashMap();
        if (this.b.m()) {
            List l = this.b.l();
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                zdv zdv = (zdv) l.get(i2);
                if (zdv.b().startsWith("s_")) {
                    this.j.put(zdv.b(), zdv);
                } else {
                    this.i.add(zdv);
                }
            }
        }
        String str2 = null;
        if (this.b.p()) {
            str = this.b.o().g();
        } else {
            str = null;
        }
        this.f = new ArrayList();
        int size2 = this.i.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zdv zdv2 = (zdv) this.i.get(i3);
            if (str != null && str.equals(zdv2.b())) {
                this.g = i3;
                this.k = true;
            }
            this.f.add(zdv2.c());
        }
        yyr yyr = new yyr(getContext(), (CharSequence[]) this.f.toArray(new CharSequence[0]));
        this.d = yyr;
        yyr.setDropDownViewResource(17367049);
        this.h = (TextView) findViewById(R.id.oob_field_pronoun_example_label);
        GenderSpinner genderSpinner = (GenderSpinner) findViewById(R.id.oob_field_pronoun_spinner);
        this.e = genderSpinner;
        genderSpinner.a = this;
        if (zea.i()) {
            str2 = zea.h().c();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getResources().getString(R.string.common_select);
        }
        this.e.setPrompt(str2);
        this.e.setAdapter(this.d);
        int i4 = this.g;
        if (i4 != -1) {
            this.e.setSelection(i4);
        }
        j();
    }

    public final boolean b() {
        return f() || this.g != -1;
    }

    public final zea c() {
        if (this.d.b()) {
            return h().a();
        }
        this.g = this.e.getSelectedItemPosition();
        zdq h2 = h();
        zdw zdw = new zdw();
        zdw.a(c(this.g));
        h2.a(zdw.a());
        return h2.a();
    }
}
