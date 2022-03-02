package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: rp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rp extends qv {
    final /* synthetic */ rq b;

    public rp(rq rqVar) {
        this.b = rqVar;
    }

    public final qs a(int i) {
        return qs.a(AccessibilityNodeInfo.obtain(this.b.a(i).a));
    }

    public final qs b(int i) {
        int i2 = i != 2 ? this.b.e : this.b.d;
        if (i2 != Integer.MIN_VALUE) {
            return a(i2);
        }
        return null;
    }

    public final boolean a(int i, int i2, Bundle bundle) {
        int i3;
        rq rqVar = this.b;
        if (i == -1) {
            return qb.a(rqVar.c, i2, bundle);
        }
        if (i2 == 1) {
            return rqVar.c(i);
        }
        if (i2 == 2) {
            return rqVar.d(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return rqVar.a(i, i2);
            }
            return rqVar.b(i);
        } else if (!rqVar.b.isEnabled() || !rqVar.b.isTouchExplorationEnabled() || (i3 = rqVar.d) == i) {
            return false;
        } else {
            if (i3 != Integer.MIN_VALUE) {
                rqVar.b(i3);
            }
            rqVar.d = i;
            rqVar.c.invalidate();
            rqVar.b(i, 32768);
            return true;
        }
    }
}
