package defpackage;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* renamed from: ahsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahsc extends PhoneStateListener {
    final /* synthetic */ ahse a;

    public ahsc(ahse ahse) {
        this.a = ahse;
    }

    public final void onCellLocationChanged(CellLocation cellLocation) {
        this.a.a(cellLocation);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        CellLocation cellLocation;
        this.a.b = signalStrength.isGsm() ? signalStrength.getGsmSignalStrength() : signalStrength.getCdmaDbm();
        try {
            cellLocation = this.a.a.getCellLocation();
        } catch (SecurityException e) {
            ajrh ajrh = this.a.g;
            cellLocation = null;
        }
        if (cellLocation != null) {
            this.a.a(cellLocation);
        }
    }
}
