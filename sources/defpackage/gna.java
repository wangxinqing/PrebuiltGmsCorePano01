package defpackage;

import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;

/* renamed from: gna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gna extends DialogFragment {
    public fzl a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = gnj.a((Fragment) this, bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        gnj.a(this.a, bundle);
        super.onSaveInstanceState(bundle);
    }
}
