package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: akeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akeg extends Fragment implements akef {
    public akeb b = new akeb(this);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akeb akeb = this.b;
        View inflate = layoutInflater.inflate(R.layout.settings_list, viewGroup, false);
        akeb.i = null;
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b.b();
    }
}
