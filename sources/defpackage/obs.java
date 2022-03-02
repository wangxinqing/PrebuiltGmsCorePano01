package defpackage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

/* renamed from: obs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class obs implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ obu a;

    public obs(obu obu) {
        this.a = obu;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        obu obu = this.a;
        obu.b.a(obu.a, i, i2, i3);
    }
}
