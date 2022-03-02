package defpackage;

import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: aivv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivv {
    public static aiag a(long j, CellInfoCdma cellInfoCdma, Collection collection) {
        int i;
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        if (cellSignalStrength != null) {
            i = cellSignalStrength.getDbm();
        } else {
            i = -9999;
        }
        return new aiag(j, 2, cellIdentity.getBasestationId(), 0, cellIdentity.getSystemId(), cellIdentity.getNetworkId(), i, collection, cellIdentity.getLatitude(), cellIdentity.getLongitude());
    }

    protected static aiaw a(long j, CellInfoLte cellInfoLte, Collection collection, Collection collection2) {
        int i;
        int i2;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        if (cellSignalStrength != null) {
            int dbm = cellSignalStrength.getDbm();
            i2 = cellSignalStrength.getTimingAdvance();
            i = dbm;
        } else {
            i2 = -1;
            i = -9999;
        }
        int mcc = cellIdentity.getMcc();
        int mnc = cellIdentity.getMnc();
        int ci = cellIdentity.getCi();
        int pci = cellIdentity.getPci();
        int tac = cellIdentity.getTac();
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.addAll(collection2);
        return new aiaw(j, mcc, mnc, ci, pci, tac, i2, i, hashSet);
    }

    static aiaz a(long j, CellInfoNr cellInfoNr, Collection collection) {
        CellIdentity cellIdentity = cellInfoNr.getCellIdentity();
        if (cellIdentity instanceof CellIdentityNr) {
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
            String mccString = cellIdentityNr.getMccString();
            String mncString = cellIdentityNr.getMncString();
            if (!(mccString == null || mncString == null)) {
                try {
                    int parseInt = Integer.parseInt(mccString);
                    int parseInt2 = Integer.parseInt(mncString);
                    CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
                    if (!(cellSignalStrength instanceof CellSignalStrengthNr)) {
                        return null;
                    }
                    return new aiaz(j, parseInt, parseInt2, cellIdentityNr.getNci(), cellIdentityNr.getPci(), cellIdentityNr.getTac(), ((CellSignalStrengthNr) cellSignalStrength).getSsRsrp(), collection);
                } catch (NumberFormatException e) {
                }
            }
        }
        return null;
    }
}
