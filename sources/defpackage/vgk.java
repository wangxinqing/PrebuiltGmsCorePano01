package defpackage;

import android.widget.CompoundButton;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;

/* renamed from: vgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vgk implements CompoundButton.OnCheckedChangeListener {
    private final NearbyMessagesAppOptInChimeraActivity a;

    public vgk(NearbyMessagesAppOptInChimeraActivity nearbyMessagesAppOptInChimeraActivity) {
        this.a = nearbyMessagesAppOptInChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a.setEnabled(!z);
    }
}
