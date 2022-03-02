package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.android.setupwizardlib.GlifRecyclerLayout;
import com.google.android.gms.R;

/* renamed from: lwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lwc extends lvi {
    public bdp h;

    public abstract bdk a();

    public abstract void a(bdi bdi);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lww.a();
        this.g = lww.e(getContext());
        View inflate = layoutInflater.inflate(R.layout.car_driving_mode_frx_recycler, viewGroup, false);
        a(inflate);
        bdp bdp = new bdp(a());
        this.h = bdp;
        bdp.e = new lvz(this);
        ((GlifRecyclerLayout) inflate.findViewById(R.id.setup_wizard_layout)).a.a(this.h);
        Button button = (Button) inflate.findViewById(R.id.next_button);
        if (e() == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(e());
            button.setOnClickListener(new lwa(this));
        }
        Button button2 = (Button) inflate.findViewById(R.id.back_button);
        if (j() == null) {
            button2.setVisibility(8);
        } else {
            button2.setVisibility(0);
            button2.setText(j());
            button2.setOnClickListener(new lwb(this));
        }
        return inflate;
    }
}
