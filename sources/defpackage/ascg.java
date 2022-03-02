package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSighting;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: ascg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ascg extends arwm {
    final /* synthetic */ BleSighting a;
    final /* synthetic */ ascj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ascg(ascj ascj, String str, BleSighting bleSighting) {
        super(str);
        this.b = ascj;
        this.a = bleSighting;
    }

    public final void run() {
        BluetoothDevice bluetoothDevice;
        Iterator it;
        ascn ascn;
        UUID uuid;
        ascn ascn2 = this.b.a;
        BleSighting bleSighting = this.a;
        if (ascn2.j) {
            if (bleSighting != null && (bluetoothDevice = bleSighting.a) != null && bluetoothDevice.getAddress() != null) {
                if (bleSighting.b != null) {
                    Iterator it2 = ascn2.e.keySet().iterator();
                    while (it2.hasNext()) {
                        ascl ascl = (ascl) it2.next();
                        Iterator it3 = ((ascm) ascn2.e.get(ascl)).a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                ascn ascn3 = ascn2;
                                Iterator it4 = it2;
                                break;
                            }
                            BleFilter bleFilter = (BleFilter) it3.next();
                            BluetoothDevice bluetoothDevice2 = bleSighting.a;
                            String str = bleFilter.b;
                            if (str != null) {
                                if (bluetoothDevice2 != null) {
                                    if (!str.equals(bluetoothDevice2.getAddress())) {
                                        continue;
                                    }
                                }
                                ascn ascn4 = ascn2;
                                Iterator it5 = it2;
                            }
                            gti gti = bleSighting.b;
                            if (gti == null) {
                                if (bleFilter.a == null && bleFilter.c == null && bleFilter.i == null) {
                                    if (bleFilter.f != null) {
                                        continue;
                                    }
                                }
                                ascn ascn42 = ascn2;
                                Iterator it52 = it2;
                            }
                            String str2 = bleFilter.a;
                            if (str2 == null || str2.equals(gti.d)) {
                                ParcelUuid parcelUuid = bleFilter.c;
                                if (parcelUuid != null) {
                                    ParcelUuid parcelUuid2 = bleFilter.d;
                                    List list = gti.a;
                                    if (list != null) {
                                        if (parcelUuid2 != null) {
                                            uuid = parcelUuid2.getUuid();
                                        } else {
                                            uuid = null;
                                        }
                                        int size = list.size();
                                        int i = 0;
                                        while (true) {
                                            if (i >= size) {
                                                ascn ascn5 = ascn2;
                                                Iterator it6 = it2;
                                                break;
                                            }
                                            ascn = ascn2;
                                            UUID uuid2 = parcelUuid.getUuid();
                                            it = it2;
                                            UUID uuid3 = ((ParcelUuid) list.get(i)).getUuid();
                                            if (uuid != null) {
                                                if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                                                    break;
                                                }
                                            } else if (uuid2.equals(uuid3)) {
                                                break;
                                            }
                                            i++;
                                            ascn2 = ascn;
                                            it2 = it;
                                        }
                                    } else {
                                        ascn ascn6 = ascn2;
                                        Iterator it7 = it2;
                                    }
                                } else {
                                    ascn = ascn2;
                                    it = it2;
                                }
                                ParcelUuid parcelUuid3 = bleFilter.e;
                                if (parcelUuid3 == null || BleFilter.a(bleFilter.f, bleFilter.g, gti.a(parcelUuid3))) {
                                    int i2 = bleFilter.h;
                                    if (i2 < 0 || BleFilter.a(bleFilter.i, bleFilter.j, gti.a(i2))) {
                                        ascl.a(bleSighting);
                                        ascn2 = ascn;
                                        it2 = it;
                                    } else {
                                        ascn2 = ascn;
                                        it2 = it;
                                    }
                                } else {
                                    ascn2 = ascn;
                                    it2 = it;
                                }
                            }
                        }
                    }
                } else {
                    anih anih = (anih) asil.a.c();
                    anih.a((Throwable) new IllegalStateException());
                    ((anih) anih.a("ascn", "a", 658, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Scan record with null bytes: %s", (Object) bleSighting);
                }
            } else {
                anih anih2 = (anih) asil.a.c();
                anih2.a((Throwable) new IllegalStateException());
                ((anih) anih2.a("ascn", "a", 645, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Invalid scan result: %s", (Object) bleSighting);
            }
        }
        if (ascn.b(this.b.a.f().c) && !this.b.a.e()) {
            ascn ascn7 = this.b.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long b2 = aymn.a.a().b();
            long a2 = aymn.a.a().a();
            long j = ascn7.m;
            if (j + b2 < elapsedRealtime) {
                ascn7.m = elapsedRealtime;
            } else if (!ascn7.k && j + a2 < elapsedRealtime) {
                ((anih) ((anih) asil.a.d()).a("ascn", "a", 399, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Wake up rate too high, pausing for %tM:%tS.", b2, b2);
                ascn7.k = true;
                ascn7.f.a("NearbyDirect_BackgroundBleScanner_Unpause", 2, elapsedRealtime + b2, ascn7.c(), ascn7.f().b);
                ascn7.d();
            }
        }
    }
}
