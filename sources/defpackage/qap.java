package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: qap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qap extends Fragment {
    public final qao a = new qao();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void onDetach() {
        super.onDetach();
        for (qat a2 : this.a.a.values()) {
            a2.a();
        }
    }
}
