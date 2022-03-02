package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;

/* renamed from: jnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jnc extends jna {
    private final CompoundButton y = ((CompoundButton) this.x.findViewById(R.id.toggle));

    public jnc(View view) {
        super(view);
    }

    public final void a(jmt jmt) {
        if (jmt instanceof jnd) {
            jnd jnd = (jnd) jmt;
            super.a(jnd);
            this.y.setEnabled(jnd.h);
            this.y.setChecked(jnd.i);
            this.v.setSingleLine(jnd.j);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultToggleSettingItem");
    }
}
