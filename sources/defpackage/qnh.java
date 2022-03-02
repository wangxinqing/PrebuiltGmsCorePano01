package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: qnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class qnh extends Fragment {
    protected qng d;
    protected qne e;
    protected qnf f;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.d = (qng) activity;
            this.e = (qne) activity;
            this.f = (qnf) activity;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append(valueOf);
            sb.append(" must implement SetupFragment callbacks");
            throw new ClassCastException(sb.toString());
        }
    }
}
