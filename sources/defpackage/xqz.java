package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;

/* renamed from: xqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqz extends Fragment {
    private xra a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xra xra = new xra(false);
        this.a = xra;
        xra.a((bjs) getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return this.a.a(layoutInflater, viewGroup);
    }
}
