package defpackage;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: uhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uhi {
    private static final WeakHashMap d = new WeakHashMap();
    public final Context a;
    public boolean b = true;
    public boolean c;
    private final WeakReference e;
    private final NfcAdapter f;
    private boolean g;

    private uhi(Activity activity) {
        this.a = activity.getApplicationContext();
        this.e = new WeakReference(activity);
        this.f = NfcAdapter.getDefaultAdapter(this.a);
        activity.getApplication().registerActivityLifecycleCallbacks(new uhh(this, this.e));
    }

    public static synchronized uhi a(Activity activity) {
        uhi uhi;
        synchronized (uhi.class) {
            if (!d.containsKey(activity)) {
                d.put(activity, new uhi(activity));
            }
            uhi = (uhi) d.get(activity);
        }
        return uhi;
    }

    public final void a() {
        NfcAdapter nfcAdapter;
        Activity activity;
        if (!this.b || !this.c) {
            if (this.g) {
                Activity activity2 = (Activity) this.e.get();
                if (activity2 != null) {
                    this.f.disableReaderMode(activity2);
                }
                this.g = false;
            }
        } else if (!this.g) {
            int i = Build.VERSION.SDK_INT;
            if (this.a.getPackageManager().hasSystemFeature("android.hardware.nfc") && kf.a(this.a, "android.permission.NFC") == 0 && (nfcAdapter = this.f) != null && nfcAdapter.isEnabled() && (activity = (Activity) this.e.get()) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("presence", 100);
                this.f.enableReaderMode(activity, new uhg(this), 385, bundle);
                this.g = true;
            }
        }
    }
}
