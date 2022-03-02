package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewHiddenBirthday$SavedState;

/* renamed from: yyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyf extends yxw {
    private TextView d;

    public yyf(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return R.layout.plus_oob_field_hidden_birthday;
    }

    public final boolean b() {
        return true;
    }

    public final zea c() {
        String charSequence = this.d.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            if (!d()) {
                return null;
            }
            charSequence = (String) ysu.K.c();
        }
        zdq h = h();
        zdw zdw = new zdw();
        zdw.b = charSequence;
        zdw.d.add(3);
        h.a(zdw.a());
        return h.a();
    }

    public final boolean e() {
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewHiddenBirthday$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewHiddenBirthday$SavedState fieldViewHiddenBirthday$SavedState = (FieldViewHiddenBirthday$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewHiddenBirthday$SavedState.getSuperState());
        this.d.setText(fieldViewHiddenBirthday$SavedState.a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewHiddenBirthday$SavedState fieldViewHiddenBirthday$SavedState = new FieldViewHiddenBirthday$SavedState(super.onSaveInstanceState());
        fieldViewHiddenBirthday$SavedState.a = this.d.getText().toString();
        return fieldViewHiddenBirthday$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        this.d = (TextView) findViewWithTag(a(R.string.plus_oob_field_view_tag_hidden_birthday));
        if (zea.p()) {
            this.d.setText(zea.o().d());
        }
    }
}
