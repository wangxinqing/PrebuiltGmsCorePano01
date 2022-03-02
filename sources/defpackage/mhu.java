package defpackage;

import android.widget.Button;
import java.util.Calendar;

/* renamed from: mhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhu {
    final /* synthetic */ Button a;
    final /* synthetic */ mhz b;

    public mhu(mhz mhz, Button button) {
        this.b = mhz;
        this.a = button;
    }

    public final void a(Calendar calendar) {
        Button button = this.a;
        boolean z = false;
        if (calendar != null && mhz.a(calendar) >= 0 && mhz.a(calendar) <= 130) {
            z = true;
        }
        button.setEnabled(z);
        this.b.b = calendar;
    }
}
