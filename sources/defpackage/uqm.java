package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.google.android.gms.beacon.BleSighting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: uqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uqm {
    private final Map a = new nz();
    private final Map b = new nz();
    private final Map c = new nz();
    private final Map d = new nz();
    private final Map e = new nz();
    private final Map f = new nz();
    private final Map g = new nz();
    private final Map h = new nz();

    private final Map a(List list, ParcelUuid parcelUuid) {
        byte[] bArr;
        Set c2 = c();
        nz nzVar = new nz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            uph a2 = uph.a(bArr2);
            if (a2 != null) {
                Iterator it2 = c2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = (String) it2.next();
                    if (!nzVar.containsKey(str) || ((uph) nzVar.get(str)).a <= a2.a) {
                        if (!a2.c || parcelUuid == null) {
                            byte[] a3 = ulu.a(str.getBytes(), 3);
                            if (!a2.c) {
                                byte[] bArr3 = a2.d;
                                bArr = Arrays.copyOf(bArr3, bArr3.length);
                            } else {
                                bArr = null;
                            }
                            if (Arrays.equals(a3, bArr)) {
                                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 713, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Matched service ID %s to GATT advertisement %s.", (Object) str, (Object) a2);
                                nzVar.put(str, a2);
                                break;
                            }
                        } else if (parcelUuid.equals(this.c.get(str))) {
                            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 701, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("This GATT advertisement %s is a Fast Advertisement and matched UUID %s in fastAdvertisementServiceUuids map with serviceID %s", (Object) a2, (Object) parcelUuid, (Object) str);
                            nzVar.put(str, a2);
                        }
                    }
                }
            } else {
                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 680, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to parse raw GATT advertisement %s", (Object) ulu.a(bArr2));
            }
        }
        return nzVar;
    }

    private final Set c() {
        return new ob((Collection) this.a.keySet());
    }

    public final synchronized void b() {
        for (String str : c()) {
            for (uph uph : ((uli) this.b.get(str)).a()) {
                a(uph);
                upv upv = new upv(uph.b(), 0);
                tpp tpp = ((tov) this.a.get(str)).a;
                tpp.f.a((Runnable) new tpo(tpp, upv));
            }
        }
    }

    private static upv a(uph uph, int i) {
        return new upv(uph.b(), i);
    }

    private final void a(uph uph) {
        this.f.remove(uph);
        this.h.remove(uph);
        upi upi = (upi) this.g.remove(uph);
        if (this.e.containsKey(upi)) {
            Set set = (Set) this.e.get(upi);
            set.remove(uph);
            this.d.remove(upi);
            if (set.isEmpty()) {
                this.e.remove(upi);
            }
        }
    }

    private final void a(upi upi, String str) {
        if (!this.e.containsKey(upi)) {
            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 727, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No GATT advertisements found for advertisement header %s.", (Object) upi);
            return;
        }
        for (uph uph : (Set) this.e.get(upi)) {
            String str2 = (String) this.f.get(uph);
            if (c().contains(str2)) {
                ((uli) this.b.get(str2)).a(uph);
                this.h.put(uph, str);
            }
        }
    }

    private final void a(upi upi, List list, boolean z, ParcelUuid parcelUuid) {
        byte[] bArr;
        Set c2 = c();
        nz nzVar = new nz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            uph a2 = uph.a(bArr2);
            if (a2 != null) {
                Iterator it2 = c2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = (String) it2.next();
                    if (!nzVar.containsKey(str) || ((uph) nzVar.get(str)).a <= a2.a) {
                        if (!a2.c || parcelUuid == null) {
                            byte[] a3 = ulu.a(str.getBytes(), 3);
                            if (!a2.c) {
                                byte[] bArr3 = a2.d;
                                bArr = Arrays.copyOf(bArr3, bArr3.length);
                            } else {
                                bArr = null;
                            }
                            if (Arrays.equals(a3, bArr)) {
                                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 713, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Matched service ID %s to GATT advertisement %s.", (Object) str, (Object) a2);
                                nzVar.put(str, a2);
                                break;
                            }
                        } else if (parcelUuid.equals(this.c.get(str))) {
                            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 701, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("This GATT advertisement %s is a Fast Advertisement and matched UUID %s in fastAdvertisementServiceUuids map with serviceID %s", (Object) a2, (Object) parcelUuid, (Object) str);
                            nzVar.put(str, a2);
                        }
                    }
                }
            } else {
                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 680, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to parse raw GATT advertisement %s", (Object) ulu.a(bArr2));
            }
        }
        for (String str2 : nzVar.keySet()) {
            uph uph = (uph) nzVar.get(str2);
            upi upi2 = (upi) this.g.get(uph);
            if (!aymi.v()) {
                if (!this.g.containsKey(uph)) {
                    ((tov) this.a.get(str2)).a(a(uph, upi.d), uph.a(), z);
                } else {
                    this.d.remove(upi2);
                    this.e.remove(upi2);
                }
            } else if (upi2 == null) {
                ((tov) this.a.get(str2)).a(a(uph, upi.d), uph.a(), z);
            } else if (!upi.equals(upi2)) {
                this.d.remove(upi2);
                this.e.remove(upi2);
            }
            this.g.put(uph, upi);
            this.f.put(uph, str2);
        }
        this.e.put(upi, new ob(nzVar.values()));
    }

    private final boolean a(upi upi) {
        if (!this.d.containsKey(upi)) {
            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 543, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s, but we have never seen it before. Will try reading its GATT advertisement.", (Object) upi);
            return true;
        }
        int c2 = ((upg) this.d.get(upi)).c() - 1;
        if (c2 == 1) {
            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 557, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s. Will retry reading its GATT advertisement.", (Object) upi);
            return true;
        } else if (c2 != 2) {
            ((anih) ((anih) ulh.a.d()).a("uqm", "a", 570, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s, but we have recently failed to read its GATT advertisement.", (Object) upi);
            return false;
        } else {
            jjg jjg = ulh.a;
            return false;
        }
    }

    private static byte[] a(byte[] bArr) {
        return ulu.a(bArr, 4);
    }

    public final synchronized uqe a(upv upv, ujv ujv) {
        long j;
        byte[] bArr = upv.a;
        uph a2 = uph.a(Arrays.copyOf(bArr, bArr.length));
        if (this.h.containsKey(a2)) {
            upi upi = (upi) this.g.get(a2);
            if (this.d.containsKey(upi)) {
                j = ((upg) this.d.get(upi)).b();
            } else {
                j = 0;
            }
            try {
                Thread.sleep(Math.max(0, aymi.a.a().S() - j));
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
            return ujv.a.a(a2.b, (String) this.h.get(a2), a2.e, ujv.b, ujv.c, ujv.d.b);
        }
        ((anih) ((anih) ulh.a.d()).a("uqm", "a", 271, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to connect to BLE peripheral %s because there is no MAC address associated with it.", (Object) upv);
        return null;
    }

    public final synchronized void a() {
        this.h.clear();
        this.g.clear();
        this.f.clear();
        this.e.clear();
        this.d.clear();
        this.c.clear();
        this.b.clear();
        this.a.clear();
    }

    public final synchronized void a(BleSighting bleSighting, uka uka) {
        BleSighting bleSighting2 = bleSighting;
        synchronized (this) {
            if (c().isEmpty()) {
                jjg jjg = ulh.a;
                return;
            }
            if (bleSighting2 != null) {
                if (!(bleSighting2.a == null || bleSighting2.b == null)) {
                    byte[] bArr = null;
                    for (String str : c()) {
                        ParcelUuid parcelUuid = (ParcelUuid) this.c.get(str);
                        if (parcelUuid != null && (bArr = bleSighting2.b.a(parcelUuid)) != null) {
                            break;
                        }
                    }
                    if (bArr != null) {
                        ParcelUuid parcelUuid2 = new ParcelUuid(urm.a);
                        List list = bleSighting2.b.a;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            uka uka2 = uka;
                            ParcelUuid parcelUuid3 = (ParcelUuid) list.get(i);
                            if (!parcelUuid2.equals(parcelUuid3)) {
                                parcelUuid2 = parcelUuid3;
                            }
                        }
                        upi upi = new upi(2, 1, new byte[10], a(bArr), 0);
                        this.d.put(upi, new upg());
                        a(upi, Collections.singletonList(bArr), true, parcelUuid2);
                        a(upi, bleSighting2.a.getAddress());
                    }
                    byte[] a2 = bleSighting2.b.a(new ParcelUuid(urm.a));
                    String name = bleSighting2.a.getName();
                    if (a2 != null) {
                        jjg jjg2 = ulh.a;
                        bleSighting2.a.getAddress();
                    } else if (name == null) {
                        jjg jjg3 = ulh.a;
                        bleSighting2.a.getAddress();
                        arwc arwc = new arwc(new byte[10], new uqp());
                        for (String a3 : c()) {
                            arwc.a(a3);
                        }
                        a2 = upi.a(2, 10, arwc.a(), a(bleSighting2.a.getAddress().getBytes(upi.a)), 0);
                    } else {
                        jjg jjg4 = ulh.a;
                        bleSighting2.a.getAddress();
                        a2 = name.getBytes();
                    }
                    upi a4 = upi.a(a2);
                    if (a4 == null) {
                        ulu.a(a2);
                        return;
                    }
                    arwc arwc2 = new arwc(a4.c, new uqp());
                    for (String bytes : c()) {
                        if (arwc2.a(bytes.getBytes(arwc.a))) {
                            if (!this.d.containsKey(a4)) {
                                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 543, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s, but we have never seen it before. Will try reading its GATT advertisement.", (Object) a4);
                            } else {
                                int c2 = ((upg) this.d.get(a4)).c() - 1;
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        ((anih) ((anih) ulh.a.d()).a("uqm", "a", 570, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s, but we have recently failed to read its GATT advertisement.", (Object) a4);
                                    }
                                    a(a4, bleSighting2.a.getAddress());
                                    return;
                                }
                                ((anih) ((anih) ulh.a.d()).a("uqm", "a", 557, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received advertisement header %s. Will retry reading its GATT advertisement.", (Object) a4);
                            }
                            BluetoothDevice bluetoothDevice = bleSighting2.a;
                            Set c3 = c();
                            Map map = this.d;
                            map.put(a4, uka.a.a(aejw.a(bluetoothDevice), a4.b, (upg) map.get(a4), a4.d, c3));
                            a(a4, new ArrayList(((upg) this.d.get(a4)).a()), false, (ParcelUuid) null);
                            a(a4, bleSighting2.a.getAddress());
                            return;
                        }
                        uka uka3 = uka;
                    }
                    return;
                }
            }
            jjg jjg5 = ulh.a;
        }
    }

    public final synchronized void a(String str) {
        this.c.remove(str);
        this.b.remove(str);
        this.a.remove(str);
    }

    public final synchronized void a(String str, tov tov, ParcelUuid parcelUuid) {
        this.a.put(str, tov);
        this.b.put(str, new uli());
        if (parcelUuid != null) {
            this.c.put(str, parcelUuid);
        }
        this.d.clear();
        for (uph uph : new ob((Collection) this.f.keySet())) {
            if (((String) this.f.get(uph)).equals(str)) {
                a(uph);
            }
        }
    }
}
