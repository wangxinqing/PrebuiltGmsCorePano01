package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: jmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jmv extends jmr {
    private final TextView t;

    public jmv(View view) {
        super(view);
        this.t = (TextView) view.findViewById(16908310);
        if (awzr.a.a().a()) {
            view.setFocusable(false);
        } else {
            view.setFocusable(true);
        }
        view.setFocusableInTouchMode(false);
    }

    public final void a(jmt jmt) {
        if (jmt instanceof jmw) {
            this.t.setText(((jmw) jmt).c);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultSettingsCategory");
    }
}
