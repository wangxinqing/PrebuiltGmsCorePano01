package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

/* renamed from: obz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obz extends RadioButton {
    public final EditText a;

    public obz(Context context, int i, avnl avnl) {
        super(context);
        setTag(avnl.b);
        if (!TextUtils.isEmpty(avnl.c)) {
            setText(avnl.c);
        }
        setId(i);
        this.a = avnl.e ? oay.a(context, (CompoundButton) this) : null;
    }

    public final boolean a() {
        return this.a != null;
    }
}
