package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.oob.FieldViewCheck$SavedState;

/* renamed from: yxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxy extends yxw implements CompoundButton.OnCheckedChangeListener {
    private CheckBox d;
    private zna e;

    public yxy(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return !this.a ? R.layout.plus_oob_field_check : R.layout.plus_oob_field_check_setup_wizard;
    }

    public final boolean b() {
        return f() || this.d.isChecked();
    }

    public final zea c() {
        if ("customAds".equals(this.b.f())) {
            this.c.a(this.d.isChecked() ? iaq.m : iaq.n);
        }
        zdq h = h();
        zdw zdw = new zdw();
        zdw.a = this.d.isChecked();
        zdw.d.add(2);
        h.a(zdw.a());
        return h.a();
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity g() {
        if ("picasa".equals(this.b.f())) {
            return iaq.i;
        }
        if ("customAds".equals(this.b.f())) {
            return iaq.l;
        }
        return null;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (d()) {
            this.c.a();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FieldViewCheck$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FieldViewCheck$SavedState fieldViewCheck$SavedState = (FieldViewCheck$SavedState) parcelable;
        super.onRestoreInstanceState(fieldViewCheck$SavedState.getSuperState());
        this.d.setChecked(fieldViewCheck$SavedState.a);
    }

    public final Parcelable onSaveInstanceState() {
        FieldViewCheck$SavedState fieldViewCheck$SavedState = new FieldViewCheck$SavedState(super.onSaveInstanceState());
        fieldViewCheck$SavedState.a = this.d.isChecked();
        return fieldViewCheck$SavedState;
    }

    public final void a(zea zea, yxv yxv) {
        super.a(zea, yxv);
        CheckBox checkBox = (CheckBox) findViewWithTag(a(R.string.plus_oob_field_view_tag_check));
        this.d = checkBox;
        checkBox.setText(i());
        this.d.setOnCheckedChangeListener(this);
        CheckBox checkBox2 = this.d;
        boolean z = false;
        if (this.b.p() && this.b.o().c()) {
            z = this.b.o().b();
        }
        checkBox2.setChecked(z);
        zna zna = new zna(this.d);
        this.e = zna;
        this.d.setMovementMethod(zna);
    }
}
