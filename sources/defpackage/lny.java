package defpackage;

import android.os.Bundle;
import android.os.Message;
import com.google.android.chimera.DialogFragment;

/* renamed from: lny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lny extends DialogFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132019198);
    }

    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }
}
