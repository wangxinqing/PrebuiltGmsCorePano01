package defpackage;

import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: voj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class voj implements Runnable {
    private final ReceiveSurfaceChimeraActivity a;

    public voj(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void run() {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        receiveSurfaceChimeraActivity.invalidateOptionsMenu();
        receiveSurfaceChimeraActivity.h.animate().alpha(1.0f).setDuration(250);
    }
}
