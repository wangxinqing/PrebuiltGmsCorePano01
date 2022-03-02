package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewCustomGender$SavedState;

/* renamed from: yyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyb extends yxw {
    public EditText d;

    public yyb(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_custom_gender : R.layout.plus_oob_field_custom_gender_setup_wizard;
    }

    public final boolean b() {
        return f() || !TextUtils.isEmpty(j());
    }

    public final zea c() {
        String j = j();
        if (TextUtils.isEmpty(j)) {
            return h().a();
        }
        zdq h = h();
        zdw zdw = new zdw();
        zdw.b(j);
        h.a(zdw.a());
        return h.a();
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        return this.d.getText().toString();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewCustomGender$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewCustomGender$SavedState fieldViewCustomGender$SavedState = (FieldViewCustomGender$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewCustomGender$SavedState.getSuperState());
        this.d.setText(fieldViewCustomGender$SavedState.a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewCustomGender$SavedState fieldViewCustomGender$SavedState = new FieldViewCustomGender$SavedState(super.onSaveInstanceState());
        fieldViewCustomGender$SavedState.a = this.d.getText().toString();
        return fieldViewCustomGender$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        EditText editText = (EditText) findViewById(R.id.oob_field_custom_gender);
        this.d = editText;
        editText.setHint(i());
        EditText editText2 = this.d;
        String str = null;
        if (this.b.p() && this.b.o().i()) {
            str = this.b.o().h();
        }
        editText2.setText(str);
        this.d.setContentDescription(getContentDescription());
        this.d.addTextChangedListener(new yya(this));
        this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
    }
}
