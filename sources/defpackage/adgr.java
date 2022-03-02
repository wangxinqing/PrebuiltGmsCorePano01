package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.LoaderManager;

/* renamed from: adgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgr extends qvr {
    private final Activity a;

    public adgr(Activity activity) {
        super(Looper.getMainLooper());
        this.a = activity;
    }

    public final void a(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        sendMessage(obtainMessage(3, i, 0, loaderCallbacks));
    }

    public final void b(int i, LoaderManager.LoaderCallbacks loaderCallbacks) {
        sendMessage(obtainMessage(4, i, 0, loaderCallbacks));
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.getSupportFragmentManager().beginTransaction().replace(message.arg1, (Fragment) message.obj, Integer.toString(message.arg2)).commitAllowingStateLoss();
        } else if (i == 2) {
            ((DialogFragment) message.obj).dismiss();
        } else if (i == 3) {
            this.a.getSupportLoaderManager().initLoader(message.arg1, (Bundle) null, (LoaderManager.LoaderCallbacks) message.obj);
        } else if (i == 4) {
            this.a.getSupportLoaderManager().restartLoader(message.arg1, (Bundle) null, (LoaderManager.LoaderCallbacks) message.obj);
        } else if (i == 5) {
            ((DialogFragment) message.obj).show(this.a.getSupportFragmentManager(), "UdcDialog");
        }
    }

    public final void a(Fragment fragment) {
        sendMessage(obtainMessage(1, 16908290, 0, fragment));
    }
}
