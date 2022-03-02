package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ved  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ved implements uxc {
    public final SparseArray a;
    public final arwg b;
    private final uzb c;
    private final Context d;
    private final vav e;

    public ved(Context context) {
        SparseArray sparseArray = new SparseArray();
        this.e = (vav) thl.a(context, vav.class);
        this.d = context;
        this.c = (uzb) thl.a(context, uzb.class);
        this.a = sparseArray;
        this.b = (arwg) thl.a(context, arwg.class);
        ((uxd) thl.a(this.d, uxd.class)).a(this);
    }

    public final Set a() {
        this.b.b();
        HashSet hashSet = new HashSet();
        if (this.c.a.a()) {
            hashSet.add(avch.AUDIO_AUDIBLE_DTMF);
        }
        if (this.c.c.a()) {
            hashSet.add(avch.AUDIO_ULTRASOUND_PASSBAND);
        }
        if (this.e.j() && a(avch.BLUETOOTH_CLASSIC_NAME)) {
            hashSet.add(avch.BLUETOOTH_CLASSIC_NAME);
        }
        if (this.e.k() && a(avch.BLE_ADVERTISING_PACKET)) {
            hashSet.add(avch.BLE_ADVERTISING_PACKET);
        }
        return hashSet;
    }

    public final avaa[] b(int i) {
        this.b.b();
        return (avaa[]) this.a.get(i);
    }

    public final void a(int i) {
        int i2;
        this.b.b();
        this.b.b();
        jjg jjg = tgc.a;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            int keyAt = this.a.keyAt(i3);
            avaa[] b2 = b(keyAt);
            if (b2 == null) {
                i2 = 0;
            } else {
                i2 = 0;
                while (i2 < b2.length && b2[i2].d <= SystemClock.elapsedRealtime()) {
                    i2++;
                }
            }
            if (i2 > 0) {
                int length = b2.length - i2;
                avaa[] avaaArr = new avaa[length];
                System.arraycopy(b2, i2, avaaArr, 0, length);
                a(avch.a(keyAt), avaaArr);
            }
        }
    }

    public final void a(avch avch, avaa[] avaaArr) {
        this.b.b();
        this.a.put(avch.k, avaaArr);
    }

    /* access modifiers changed from: protected */
    public final boolean a(avch avch) {
        this.b.b();
        Context context = this.d;
        return uxu.a(context, (ased) thl.b(context, ased.class), avch);
    }
}
