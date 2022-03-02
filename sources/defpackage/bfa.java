package defpackage;

import android.os.SystemClock;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfa {
    public static final boolean a = VolleyLog.DEBUG;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str) {
        long j;
        this.c = true;
        if (this.b.size() != 0) {
            long j2 = ((bez) this.b.get(0)).c;
            List list = this.b;
            j = ((bez) list.get(list.size() - 1)).c - j2;
        } else {
            j = 0;
        }
        if (j > 0) {
            long j3 = ((bez) this.b.get(0)).c;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(j), str);
            List list2 = this.b;
            int size = list2.size();
            int i = 0;
            while (i < size) {
                bez bez = (bez) list2.get(i);
                long j4 = bez.c;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(bez.b), bez.a);
                i++;
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.c) {
            a("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void a(String str, long j) {
        if (!this.c) {
            this.b.add(new bez(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }
}
