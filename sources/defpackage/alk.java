package defpackage;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;

/* renamed from: alk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alk implements Runnable {
    final /* synthetic */ DatePicker a;

    public alk(DatePicker datePicker) {
        this.a = datePicker;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        DatePicker datePicker = this.a;
        int[] iArr = {datePicker.b, datePicker.a, datePicker.c};
        boolean z5 = true;
        boolean z6 = true;
        for (int length = DatePicker.g.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i = DatePicker.g[length];
                alp a2 = datePicker.a(iArr[length]);
                if (z6) {
                    z = DatePicker.a(a2, datePicker.d.get(i));
                } else {
                    z = DatePicker.a(a2, datePicker.f.getActualMinimum(i));
                }
                if (!z5) {
                    z2 = z | DatePicker.b(a2, datePicker.f.getActualMaximum(i));
                } else {
                    z2 = z | DatePicker.b(a2, datePicker.e.get(i));
                }
                if (datePicker.f.get(i) == datePicker.d.get(i)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z6 &= z3;
                if (datePicker.f.get(i) == datePicker.e.get(i)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 &= z4;
                if (z2) {
                    datePicker.a(iArr[length], a2);
                }
                int i2 = iArr[length];
                int i3 = datePicker.f.get(i);
                alp alp = (alp) datePicker.j.get(i2);
                if (alp.a != i3) {
                    alp.a = i3;
                    VerticalGridView verticalGridView = (VerticalGridView) datePicker.i.get(i2);
                    if (verticalGridView != null) {
                        verticalGridView.a(i3 - ((alp) datePicker.j.get(i2)).b);
                    }
                }
            }
        }
    }
}
