package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;

/* renamed from: mnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mnn extends Fragment implements mfz {
    public mnj a;
    public View b;
    public WeakReference c = new WeakReference((Object) null);

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.b;
        if (view != null) {
            view.findViewById(R.id.fm_management_loading_screen).setVisibility(0);
            this.b.findViewById(R.id.fm_management_content_screen).setVisibility(8);
        }
        getLoaderManager().initLoader(1, (Bundle) null, new mnm(this));
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mnj) mfy.a(mnj.class, getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_v2_management_content, viewGroup, false);
        this.b = inflate;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
