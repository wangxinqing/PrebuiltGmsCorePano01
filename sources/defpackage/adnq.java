package defpackage;

import android.os.UpdateEngine;
import android.os.UpdateEngineCallback;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

/* renamed from: adnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adnq extends UpdateEngineCallback {
    public static final iwd a = adnt.e("UpdateEngineDelegate");
    public static final adqz b = new adnp();
    public final adrn c = ((adrn) adrn.a.b());
    public final UpdateEngine d;
    public final Object e;
    public int f;
    public float g;
    public boolean h;
    public final Deque i;

    public adnq(UpdateEngine updateEngine) {
        this.d = updateEngine;
        this.e = new Object();
        this.h = false;
        this.i = new ArrayDeque();
        this.f = -1;
        this.g = 0.0f;
    }

    public final int a() {
        int i2;
        synchronized (this.e) {
            i2 = this.f;
        }
        return i2;
    }

    public final void onPayloadApplicationComplete(int i2) {
        amzy a2;
        synchronized (this.e) {
            a2 = amzy.a((Collection) this.i);
        }
        int size = a2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((UpdateEngineCallback) a2.get(i3)).onPayloadApplicationComplete(i2);
        }
    }

    public final void onStatusUpdate(int i2, float f2) {
        amzy a2;
        synchronized (this.e) {
            this.f = i2;
            this.g = f2;
            a2 = amzy.a((Collection) this.i);
        }
        int size = a2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((UpdateEngineCallback) a2.get(i3)).onStatusUpdate(i2, f2);
        }
    }
}
