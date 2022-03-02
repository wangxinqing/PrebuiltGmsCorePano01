package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewGender$SavedState;
import com.google.android.gms.plus.oob.GenderSpinner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyd extends yxw implements yys {
    public yyb d;
    public yyn e;
    private yyr f;
    private GenderSpinner g;
    private boolean h;
    private boolean i;
    private int j = -1;

    public yyd(Context context, boolean z) {
        super(context, z);
    }

    private final String c(int i2) {
        if (!this.b.m()) {
            return null;
        }
        List l = this.b.l();
        if (i2 >= 0 && i2 < l.size()) {
            return ((zdv) l.get(i2)).b();
        }
        String valueOf = String.valueOf(this.b.f());
        Log.e("FieldView", valueOf.length() == 0 ? new String("Invalid position for options field: id=") : "Invalid position for options field: id=".concat(valueOf));
        return null;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_gender : R.layout.plus_oob_field_gender_setup_wizard;
    }

    public final void b(int i2) {
        if (!this.h) {
            if (this.j == i2) {
                this.c.a(iaq.p);
            } else {
                this.c.a(iaq.o);
            }
            this.h = true;
        }
        this.f.a();
        this.j = i2;
        j();
        this.c.a();
    }

    public final void j() {
        int i2;
        if (!e()) {
            if (!"custom".equals(c(this.j))) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            yyb yyb = this.d;
            if (yyb != null) {
                yyb.setVisibility(i2);
                if (i2 == 8) {
                    EditText editText = yyb.d;
                    if (editText != null) {
                        editText.setText("");
                    }
                } else {
                    i2 = 0;
                }
            }
            yyn yyn = this.e;
            if (yyn != null) {
                yyn.setVisibility(i2);
                if (i2 == 8 && yyn.e != null) {
                    yyn.g = -1;
                    yyn.d = new yyr(yyn.getContext(), (CharSequence[]) yyn.f.toArray(new CharSequence[0]));
                    yyn.d.setDropDownViewResource(17367049);
                    yyn.d.a(yyn.e.getPrompt());
                    yyn.e.setAdapter(yyn.d);
                    yyn.j();
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        GenderSpinner genderSpinner = this.g;
        if (genderSpinner != null) {
            int i2 = this.j;
            if (i2 == -1) {
                this.f.a(genderSpinner.getPrompt());
            } else {
                genderSpinner.setSelection(i2);
            }
            j();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewGender$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewGender$SavedState fieldViewGender$SavedState = (FieldViewGender$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewGender$SavedState.getSuperState());
        this.h = fieldViewGender$SavedState.a;
        this.i = fieldViewGender$SavedState.b;
        int i2 = fieldViewGender$SavedState.c;
        this.j = i2;
        if (i2 != -1) {
            this.g.setSelection(i2);
        }
        j();
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewGender$SavedState fieldViewGender$SavedState = new FieldViewGender$SavedState(super.onSaveInstanceState());
        fieldViewGender$SavedState.a = this.h;
        fieldViewGender$SavedState.b = this.i;
        fieldViewGender$SavedState.c = !this.f.b() ? this.g.getSelectedItemPosition() : -1;
        return fieldViewGender$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        String str;
        super.a(zea, yxv);
        String str2 = null;
        if (this.b.p()) {
            str = this.b.o().g();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.b.m()) {
            List l = this.b.l();
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                zdv zdv = (zdv) l.get(i2);
                if (str != null && str.equals(zdv.b())) {
                    this.j = i2;
                    this.i = true;
                    if (!this.h) {
                        this.c.a(iaq.p);
                        this.h = true;
                    }
                }
                arrayList.add(zdv.c());
            }
        }
        yyr yyr = new yyr(getContext(), (CharSequence[]) arrayList.toArray(new CharSequence[0]));
        this.f = yyr;
        yyr.setDropDownViewResource(17367049);
        GenderSpinner genderSpinner = (GenderSpinner) findViewById(R.id.oob_field_gender_spinner);
        this.g = genderSpinner;
        genderSpinner.a = this;
        if (zea.i()) {
            str2 = zea.h().c();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getResources().getString(R.string.plus_gender_prompt);
        }
        this.g.setPrompt(str2);
        this.g.setAdapter(this.f);
        int i3 = this.j;
        if (i3 != -1) {
            this.g.setSelection(i3);
        }
        j();
    }

    public final zea c() {
        this.j = this.g.getSelectedItemPosition();
        zdq h2 = h();
        zdw zdw = new zdw();
        zdw.a(c(this.j));
        h2.a(zdw.a());
        return h2.a();
    }

    public final boolean b() {
        boolean z;
        yyb yyb;
        String str;
        int i2 = this.j;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        if ("custom".equals(c(i2))) {
            if (!(this.e == null || (yyb = this.d) == null || TextUtils.isEmpty(yyb.j()))) {
                yyn yyn = this.e;
                int i3 = yyn.g;
                if (i3 != -1) {
                    str = ((CharSequence) yyn.d.getItem(i3)).toString();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    z = true;
                }
            }
            z = false;
        }
        return f() || z;
    }
}
