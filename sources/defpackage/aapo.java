package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;

/* renamed from: aapo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapo extends jna {
    private final CompoundButton y;

    public aapo(View view) {
        super(view);
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.toggle);
        this.y = compoundButton;
        compoundButton.setVisibility(4);
    }

    public final void a(jmt jmt) {
        if (jmt instanceof aapq) {
            aapq aapq = (aapq) jmt;
            super.a(aapq);
            this.y.setEnabled(aapq.h);
            this.y.setChecked(aapq.i);
            return;
        }
        throw new IllegalArgumentException("settingItem must be FindMyDeviceToggleItem");
    }
}
