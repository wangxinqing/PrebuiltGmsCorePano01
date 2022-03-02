package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.plus.oob.FieldViewName$SavedState;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.List;

/* renamed from: yyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyl extends yxw implements View.OnClickListener, TextView.OnEditorActionListener, View.OnTouchListener, View.OnFocusChangeListener {
    private EditText d;
    private EditText e;
    private EditText f;
    private EditText g;
    private EditText h;
    private boolean i;
    private TextView j;
    private TextView k;
    private boolean l;
    private int m = 0;

    public yyl(Context context, boolean z) {
        super(context, z);
    }

    private final void b(View view) {
        view.postDelayed(new yyi(this, view), 250);
    }

    private final void l() {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(8);
        this.j.setVisibility(0);
        int i2 = this.m;
        if (i2 == 2) {
            EditText editText = this.e;
            editText.setSelection(editText.getText().length());
            this.e.requestFocus();
            b(this.e);
        } else if (i2 == 1) {
            EditText editText2 = this.d;
            editText2.setSelection(editText2.getText().length());
            this.d.requestFocus();
            b(this.d);
        } else if (yze.a()) {
            EditText editText3 = this.e;
            editText3.setSelection(editText3.getText().length());
            this.e.requestFocus();
            a(this.e);
        } else {
            EditText editText4 = this.d;
            editText4.setSelection(editText4.getText().length());
            this.d.requestFocus();
            a(this.d);
        }
    }

    private final String m() {
        if (o()) {
            return this.b.o().e().c();
        }
        return null;
    }

    private final String n() {
        if (o()) {
            return this.b.o().e().b();
        }
        return null;
    }

    private final boolean o() {
        return this.b.p() && this.b.o().f();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_name : R.layout.plus_oob_field_name_setup_wizard;
    }

    public final zea c() {
        zdq h2 = h();
        zdw zdw = new zdw();
        zdx zdx = new zdx();
        zdx.b = j();
        zdx.c.add(3);
        zdx.a = k();
        zdx.c.add(2);
        zdw.c = new AccountField.ValueEntity.NameEntity(zdx.c, zdx.a, zdx.b);
        zdw.d.add(4);
        h2.a(zdw.a());
        return h2.a();
    }

    /* access modifiers changed from: package-private */
    public final String j() {
        return this.d.getText().toString();
    }

    /* access modifiers changed from: package-private */
    public final String k() {
        return this.e.getText().toString();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.combined_name_edit && !this.l && !this.i) {
            l();
            this.l = true;
        }
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 5) {
            return false;
        }
        this.f.setEnabled(false);
        EditText editText = this.g;
        editText.setSelection(editText.getText().length());
        this.g.requestFocus();
        this.g.performClick();
        this.f.setEnabled(true);
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view.getId() == R.id.combined_name_edit && z) {
            onClick(view);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewName$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewName$SavedState fieldViewName$SavedState = (FieldViewName$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewName$SavedState.getSuperState());
        this.l = fieldViewName$SavedState.a;
        this.m = fieldViewName$SavedState.c;
        this.f.setText(fieldViewName$SavedState.d);
        this.g.setText(fieldViewName$SavedState.e);
        if (this.l) {
            l();
        }
        this.i = fieldViewName$SavedState.b;
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewName$SavedState fieldViewName$SavedState = new FieldViewName$SavedState(super.onSaveInstanceState());
        fieldViewName$SavedState.a = this.l;
        InputMethodManager a = jjw.a(getContext());
        int i2 = 0;
        if (a != null && a.isAcceptingText()) {
            if (this.d.isFocused()) {
                i2 = 1;
            } else if (this.e.isFocused()) {
                i2 = 2;
            }
        }
        fieldViewName$SavedState.c = i2;
        fieldViewName$SavedState.d = this.f.getText().toString();
        fieldViewName$SavedState.e = this.g.getText().toString();
        fieldViewName$SavedState.b = this.i;
        return fieldViewName$SavedState;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f.hasFocus()) {
            this.f.clearFocus();
            jjw.a(getContext(), view);
        }
        if (!this.g.hasFocus()) {
            return false;
        }
        this.g.clearFocus();
        jjw.a(getContext(), view);
        return false;
    }

    public final void a(View view) {
        jjw.b(getContext(), view);
    }

    public final boolean b() {
        return f() || (!TextUtils.isEmpty(j()) && !TextUtils.isEmpty(k()));
    }

    public final void a(zea zea, yxv yxv) {
        boolean z;
        int i2;
        super.a(zea, yxv);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.name_layout);
        if (yze.a()) {
            LayoutInflater.from(getContext()).inflate(!this.a ? R.layout.plus_oob_name_fields_last_first : R.layout.plus_oob_name_fields_last_first_setup_wizard, frameLayout);
        } else {
            LayoutInflater.from(getContext()).inflate(!this.a ? R.layout.plus_oob_name_fields_first_last : R.layout.plus_oob_name_fields_first_last_setup_wizard, frameLayout);
        }
        EditText editText = (EditText) findViewById(R.id.first_name_edit);
        this.d = editText;
        editText.setText(m());
        EditText editText2 = (EditText) findViewById(R.id.last_name_edit);
        this.e = editText2;
        editText2.setText(n());
        if (o()) {
            z = this.b.o().e().d();
        } else {
            z = false;
        }
        this.i = z;
        if (d()) {
            this.d.addTextChangedListener(new yyj(this));
            this.e.addTextChangedListener(new yyj(this));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        if (yze.a()) {
            this.f = this.e;
            this.g = this.d;
        } else {
            this.f = this.d;
            this.g = this.e;
        }
        this.f.setOnEditorActionListener(this);
        if (!this.a) {
            i2 = R.layout.plus_oob_name_fields_combined;
        } else {
            i2 = R.layout.plus_oob_name_fields_combined_setup_wizard;
        }
        LayoutInflater.from(getContext()).inflate(i2, frameLayout);
        this.h = (EditText) findViewById(R.id.combined_name_edit);
        if (!zea.c() && !this.i) {
            this.h.setOnClickListener(this);
            this.h.setOnFocusChangeListener(this);
        } else {
            this.h.setEnabled(false);
            this.h.setFocusable(false);
            this.h.setInputType(0);
        }
        this.h.setText(getContext().getString(R.string.plus_oob_first_and_last_name, new Object[]{m(), n()}));
        TextView textView = (TextView) findViewById(R.id.edit_name_warning);
        this.j = textView;
        textView.setVisibility(8);
        this.k = (TextView) findViewById(R.id.name_error);
        if (this.b.c()) {
            List b = zea.b();
            int size = b.size();
            for (int i3 = 0; i3 < size; i3++) {
                zds zds = (zds) b.get(i3);
                if (zds.c() && zds.g() && zds.e()) {
                    CharSequence a = yze.a(this.c, zds.f(), zds.b(), zds.d());
                    this.k.setVisibility(0);
                    this.k.setText(a);
                    this.k.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
    }
}
