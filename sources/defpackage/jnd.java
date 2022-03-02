package defpackage;

import android.content.Context;
import android.widget.Checkable;
import com.google.android.gms.R;

/* renamed from: jnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnd extends jnb implements Checkable {
    public boolean i;
    public final boolean j;

    public jnd(Context context) {
        this(context, true);
    }

    public int e() {
        return R.layout.common_settings_toggle_widget;
    }

    public jms f() {
        return jmq.a();
    }

    public final boolean isChecked() {
        return this.i;
    }

    public final void setChecked(boolean z) {
        this.i = z;
        h();
    }

    public final void toggle() {
        setChecked(!this.i);
    }

    public jnd(Context context, boolean z) {
        super(context);
        this.j = z;
    }
}
