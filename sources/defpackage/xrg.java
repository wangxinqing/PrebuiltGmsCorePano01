package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: xrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xrg extends Fragment {
    private icc a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bjs bjs = (bjs) getActivity();
        bjs.setTitle((CharSequence) "Debug Data Uploaders");
        sg aE = bjs.aE();
        if (aE != null) {
            aE.b(true);
        }
        ibz ibz = new ibz(bjs.getApplicationContext());
        ibz.a(bjs, 0, (icb) null);
        xrh.a((Context) bjs, ibz);
        this.a = ibz.b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.debug_uploader_list_layout, viewGroup, false);
        xrh.a(viewGroup2, this.a);
        return viewGroup2;
    }
}
