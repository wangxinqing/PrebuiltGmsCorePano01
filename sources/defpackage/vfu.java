package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfu implements jkm {
    final /* synthetic */ NearbyMessagesChimeraService a;

    public vfu(NearbyMessagesChimeraService nearbyMessagesChimeraService) {
        this.a = nearbyMessagesChimeraService;
    }

    public final void b(int i) {
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            this.a.i.c(new vft(this, "PermissionsChanged", packagesForUid));
        }
    }
}
