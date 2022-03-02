package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* renamed from: lnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lnz extends Fragment {
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }
}
