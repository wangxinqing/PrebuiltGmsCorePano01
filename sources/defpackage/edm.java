package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: edm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edm {
    public final AudioManager a;
    public volatile BluetoothHeadset b;
    public final Object c = new Object();

    public edm(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
        int i = Build.VERSION.SDK_INT;
        Context applicationContext = context.getApplicationContext();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(applicationContext, new edl(this), 1);
        }
    }
}
