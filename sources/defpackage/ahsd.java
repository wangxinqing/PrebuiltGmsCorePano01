package defpackage;

import android.telephony.CellLocation;

/* renamed from: ahsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahsd implements Runnable {
    final /* synthetic */ ahse a;

    public ahsd(ahse ahse) {
        this.a = ahse;
    }

    public final void run() {
        CellLocation cellLocation;
        this.a.j.a();
        this.a.h.removeCallbacks(this);
        try {
            cellLocation = this.a.a.getCellLocation();
        } catch (SecurityException e) {
            cellLocation = null;
        }
        if (cellLocation != null) {
            this.a.a(cellLocation);
        }
        this.a.h.postDelayed(this, 500);
    }
}
