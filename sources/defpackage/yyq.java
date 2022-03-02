package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewString$SavedState;

/* renamed from: yyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyq extends yxw {
    private TextView d;
    private EditText e;

    public yyq(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_string : R.layout.plus_oob_field_string_setup_wizard;
    }

    public final boolean b() {
        return f() || !TextUtils.isEmpty(this.e.getText().toString());
    }

    public final zea c() {
        zdq h = h();
        zdw zdw = new zdw();
        zdw.b(this.e.getText().toString());
        h.a(zdw.a());
        return h.a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewString$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewString$SavedState fieldViewString$SavedState = (FieldViewString$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewString$SavedState.getSuperState());
        this.e.setText(fieldViewString$SavedState.a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewString$SavedState fieldViewString$SavedState = new FieldViewString$SavedState(super.onSaveInstanceState());
        fieldViewString$SavedState.a = this.e.getText().toString();
        return fieldViewString$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        TextView textView = (TextView) findViewWithTag(a(R.string.plus_oob_field_view_tag_string_label));
        this.d = textView;
        textView.setText(i());
        EditText editText = (EditText) findViewWithTag(a(R.string.plus_oob_field_view_tag_string));
        this.e = editText;
        String str = null;
        if (this.b.p() && this.b.o().i()) {
            str = this.b.o().h();
        }
        editText.setText(str);
        this.e.setContentDescription(getContentDescription());
        if (d()) {
            this.e.addTextChangedListener(new yyp(this));
        }
    }
}
