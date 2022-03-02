package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.gms.mdm.util.BaseDeviceRinger$1;
import com.google.android.gms.mdm.util.BaseDeviceRinger$3;
import java.io.IOException;

/* renamed from: sng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sng implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener {
    public static final int[] a = {1, 4, 2};
    private static final IntentFilter l = new BaseDeviceRinger$1();
    public final AudioManager b;
    public MediaPlayer c;
    public snf d;
    public snd e;
    public final Runnable f = new snc(this);
    public final BroadcastReceiver g = new BaseDeviceRinger$3(this, "security");
    public int h = -1;
    public int i = -1;
    public final sne j;
    public final Context k;

    public sng(Context context, sne sne) {
        this.k = context;
        this.j = sne;
        this.b = (AudioManager) context.getSystemService("audio");
        context.registerReceiver(this.g, l);
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            this.c.setDataSource(this.k, uri);
            return true;
        } catch (IOException | IllegalStateException e2) {
            snn.a("Failed to play requested ringtone", e2);
            this.c.reset();
            return false;
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        snn.a("Error playing ringtone, what: %s extra: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        this.j.b();
        return true;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.start();
        } catch (IllegalStateException e2) {
            snn.a("Error starting playing ringtone.", new Object[0]);
            this.j.b();
        }
    }
}
