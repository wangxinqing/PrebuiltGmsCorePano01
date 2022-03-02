package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Locale;

/* renamed from: ahrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrz extends BroadcastReceiver {
    final /* synthetic */ ahsa a;

    protected ahrz(ahsa ahsa) {
        this.a = ahsa;
    }

    public final void onReceive(Context context, Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ajrh ajrh = this.a.g;
        Locale locale = Locale.ENGLISH;
        new Object[1][0] = intent;
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            ahsa ahsa = this.a;
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr = {Integer.valueOf(intExtra), Integer.valueOf(intExtra2)};
            ahsa.h.a.a(ahsa.a(intExtra), ahsa.a(intExtra2), elapsedRealtime);
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (parcelableExtra != null) {
            int i = Build.VERSION.SDK_INT;
            ajbm ajbm = new ajbm((BluetoothDevice) parcelableExtra);
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction())) {
                this.a.a(ajbm, 1, elapsedRealtime);
            } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
                this.a.a(ajbm, 2, elapsedRealtime);
            } else if ("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED".equals(intent.getAction())) {
                this.a.a(ajbm, 3, elapsedRealtime);
            } else {
                ajrh ajrh2 = this.a.g;
                String action = intent.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 31);
                sb.append("Received unknown event ");
                sb.append(action);
                sb.append(", ignore");
                sb.toString();
            }
        }
    }
}
