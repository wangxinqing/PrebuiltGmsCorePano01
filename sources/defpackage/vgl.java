package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;

/* renamed from: vgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vgl implements DialogInterface.OnCancelListener {
    private final NearbyMessagesAppOptInChimeraActivity a;

    public vgl(NearbyMessagesAppOptInChimeraActivity nearbyMessagesAppOptInChimeraActivity) {
        this.a = nearbyMessagesAppOptInChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}
