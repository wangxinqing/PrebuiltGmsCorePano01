package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* renamed from: acfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfs extends AdvertiseCallback {
    final /* synthetic */ acfu a;

    public acfs(acfu acfu) {
        this.a = acfu;
    }

    public final void onStartFailure(int i) {
        iwd iwd = acfu.j;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Start advertising failed: ");
        sb.append(i);
        iwd.b(sb.toString(), new Object[0]);
        this.a.i = null;
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        acfu.j.b("Start advertising succeed.", new Object[0]);
    }
}
