package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: bnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bnh {
    public int a = 1;
    public long b;
    public final SparseArray c;
    public final ComponentName d;
    public int e = 0;

    public bnh(ComponentName componentName) {
        this.d = componentName;
        this.c = new SparseArray();
        a();
    }

    /* access modifiers changed from: protected */
    public Object a(Context context, String str, long j) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(j);
        return newWakeLock;
    }

    public final void a() {
        this.b = SystemClock.uptimeMillis();
        do {
        } while (SystemClock.uptimeMillis() == this.b);
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
        if (obj != null) {
            amrl.a(obj instanceof PowerManager.WakeLock);
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        }
    }
}
