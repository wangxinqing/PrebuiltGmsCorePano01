package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: arxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxv extends bhw implements arxw {
    private final Context a;
    private final txb b;
    private final ttf c;
    private arxt d;
    private tya e;

    public arxv() {
        super("com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    private final uaj a(tzi tzi) {
        tzj tzj;
        if ((tzi.a & 1024) != 0) {
            uaj uaj = tzi.n;
            return uaj == null ? uaj.K : uaj;
        }
        auay auay = tzi.c;
        try {
            List list = (List) this.d.a().get();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tzj = null;
                        break;
                    }
                    tzj = (tzj) it.next();
                    if (tzj.b.equals(auay)) {
                        break;
                    }
                }
                if (tzj == null) {
                    return null;
                }
                try {
                    return (uaj) aucj.a((aucj) uaj.K, tzj.c.k(), aubs.c());
                } catch (auda e2) {
                    anih anih = (anih) tsp.a.c();
                    anih.a((Throwable) e2);
                    anih.a("getStoredDiscoveryItem: Failed to parse device.");
                    return null;
                }
            } else {
                jjg jjg = tsp.a;
                return null;
            }
        } catch (InterruptedException | ExecutionException e3) {
            jjg jjg2 = tsp.a;
            return null;
        }
    }

    private static boolean b(tzi tzi) {
        return !tzi.g.isEmpty() && !tzi.g.equals(tzi.f);
    }

    public arxv(Context context) {
        super("com.google.location.nearby.common.fastpair.IDeviceStatusService");
        this.a = context;
        this.b = (txb) thl.a(context, txb.class);
        this.c = (ttf) thl.a(context, ttf.class);
        this.d = (arxt) thl.a(context, arxt.class);
        this.e = (tya) thl.a(context, tya.class);
    }

    public final DeviceDetailsLinks b(String str) {
        if (str == null) {
            ((anih) tsp.a.d()).a("address is null in getDeviceDetailsLinks.");
            return null;
        }
        tzi a2 = this.c.a(str);
        if (a2 == null || (a2.a & 2) == 0) {
            ((anih) tsp.a.d()).a("storedFastPairItem of DeviceStatusBinder is invalid. Address=%s", (Object) str);
            return null;
        }
        uaj a3 = a(a2);
        if (a3 == null) {
            ((anih) tsp.a.d()).a("storedDiscoveryItem of DeviceStatusBinder is null.");
            return null;
        }
        arzc h = DeviceDetailsLinks.h();
        h.a(a2.c.k());
        auzo auzo = a3.I;
        if (auzo == null) {
            auzo = auzo.j;
        }
        h.a(auzo.e);
        h.a(a3.f);
        h.b(str);
        h.b(b(a2));
        asqh asqh = a3.J;
        if (asqh == null) {
            asqh = asqh.c;
        }
        h.c(asqh.a);
        asqh asqh2 = a3.J;
        if (asqh2 == null) {
            asqh2 = asqh.c;
        }
        h.d(asqh2.b);
        return h.a();
    }

    public final TrueWirelessHeadset a(String str) {
        BatteryAdvertisement a2 = this.b.a(str);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    public final String a(byte[] bArr) {
        if (bArr == null) {
            ((anih) tsp.a.d()).a("FastPair: DetailPage: Account key is null");
            return null;
        }
        tzi a2 = this.c.a(auay.a(bArr));
        if (a2 != null) {
            return a2.b;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            switch(r12) {
                case 2: goto L_0x01f0;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01c7;
                case 6: goto L_0x016a;
                case 7: goto L_0x00de;
                case 8: goto L_0x009b;
                case 9: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r1
        L_0x0006:
            java.lang.String r12 = r13.readString()
            android.bluetooth.BluetoothAdapter r13 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            android.bluetooth.BluetoothDevice r13 = r13.getRemoteDevice(r12)
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "FastPair: send check active component data %s"
            r2.a((java.lang.String) r3, (java.lang.Object) r12)
            tya r12 = r11.e
            java.util.Map r2 = r12.b
            java.lang.Object r2 = r2.get(r13)
            tyb r2 = (defpackage.tyb) r2
            r3 = 5
            r4 = 3
            if (r2 == 0) goto L_0x003c
            boolean r5 = r2.b()
            if (r5 != 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            byte[] r12 = new byte[r1]
            r2.a(r4, r3, r12)
            r1 = 1
            goto L_0x0093
        L_0x003c:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r5 = "FindDevice: medium is null or is not connected"
            r2.a((java.lang.String) r5)
            aymw r2 = defpackage.aymw.a
            aymx r2 = r2.a()
            boolean r2 = r2.U()
            if (r2 == 0) goto L_0x0092
            java.lang.String r13 = r13.getAddress()
            java.util.Map r12 = r12.c
            java.lang.Object r12 = r12.get(r13)
            java.util.Map r12 = (java.util.Map) r12
            if (r12 != 0) goto L_0x0071
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.d()
            anih r12 = (defpackage.anih) r12
            java.lang.String r2 = "FindDevice: Response map for %s not found"
            r12.a((java.lang.String) r2, (java.lang.Object) r13)
            goto L_0x0093
        L_0x0071:
            java.lang.String r2 = defpackage.tya.a(r4, r3)
            java.lang.Object r12 = r12.remove(r2)
            if (r12 != 0) goto L_0x0092
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.d()
            anih r12 = (defpackage.anih) r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "FindDevice: Response for device %s, eventGroup %s, eventCode %s not found"
            r12.a((java.lang.String) r4, (java.lang.Object) r13, (java.lang.Object) r2, (java.lang.Object) r3)
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            r14.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r14, (boolean) r1)
            goto L_0x01fe
        L_0x009b:
            byte[] r12 = r13.createByteArray()
            r13 = 0
            if (r12 != 0) goto L_0x00b0
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.d()
            anih r12 = (defpackage.anih) r12
            java.lang.String r1 = "FastPair: getStoredDiscoveryItem: Account key is null"
            r12.a((java.lang.String) r1)
            goto L_0x00d6
        L_0x00b0:
            ttf r1 = r11.c
            auay r12 = defpackage.auay.a((byte[]) r12)
            tzi r12 = r1.a((defpackage.auay) r12)
            if (r12 != 0) goto L_0x00ca
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.d()
            anih r12 = (defpackage.anih) r12
            java.lang.String r1 = "FastPair: getStoredDiscoveryItem: can't find StoredFastPairItem."
            r12.a((java.lang.String) r1)
            goto L_0x00d6
        L_0x00ca:
            uaj r12 = r11.a((defpackage.tzi) r12)
            if (r12 == 0) goto L_0x00d5
            byte[] r13 = r12.k()
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            r14.writeNoException()
            r14.writeByteArray(r13)
            goto L_0x01fe
        L_0x00de:
            java.lang.String r12 = r13.readString()
            int r8 = r13.readInt()
            int r13 = r13.readInt()
            tya r9 = r11.e
            java.lang.String r10 = defpackage.tya.a(r8, r13)
            java.util.Map r2 = r9.c     // Catch:{ NullPointerException -> 0x013c }
            boolean r2 = r2.containsKey(r12)     // Catch:{ NullPointerException -> 0x013c }
            if (r2 != 0) goto L_0x00f9
            goto L_0x014d
        L_0x00f9:
            java.util.Map r2 = r9.c     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ NullPointerException -> 0x013c }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ NullPointerException -> 0x013c }
            boolean r2 = r2.containsKey(r10)     // Catch:{ NullPointerException -> 0x013c }
            if (r2 == 0) goto L_0x014d
            jjg r2 = defpackage.tsp.a     // Catch:{ NullPointerException -> 0x013c }
            anie r2 = r2.d()     // Catch:{ NullPointerException -> 0x013c }
            anih r2 = (defpackage.anih) r2     // Catch:{ NullPointerException -> 0x013c }
            java.lang.String r3 = "FindDevice: Device response contains information for %s: %s (eventGroup: %s, eventCode: %s)"
            java.util.Map r4 = r9.c     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Object r4 = r4.get(r12)     // Catch:{ NullPointerException -> 0x013c }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Object r5 = r4.get(r10)     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ NullPointerException -> 0x013c }
            r4 = r12
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ NullPointerException -> 0x013c }
            java.util.Map r2 = r9.c     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ NullPointerException -> 0x013c }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ NullPointerException -> 0x013c }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ NullPointerException -> 0x013c }
            int r1 = r2.intValue()     // Catch:{ NullPointerException -> 0x013c }
            goto L_0x0162
        L_0x013c:
            r2 = move-exception
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r2)
            java.lang.String r2 = "FindDevice: check active component through RFcomm failed"
            r3.a((java.lang.String) r2)
        L_0x014d:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r4 = "FindDevice: Device response did not contain information for %s and group %s code %s"
            r2.a((java.lang.String) r4, (java.lang.Object) r12, (java.lang.Object) r3, (java.lang.Object) r13)
        L_0x0162:
            r14.writeNoException()
            r14.writeInt(r1)
            goto L_0x01fe
        L_0x016a:
            java.lang.String r12 = r13.readString()
            boolean r2 = defpackage.bhx.a(r13)
            boolean r13 = defpackage.bhx.a(r13)
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            android.bluetooth.BluetoothDevice r12 = r3.getRemoteDevice(r12)
            if (r2 != 0) goto L_0x0182
            r2 = 0
            goto L_0x0183
        L_0x0182:
            r2 = 2
        L_0x0183:
            if (r13 != 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r2 = r2 | 1
        L_0x0188:
            byte r13 = (byte) r2
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "FastPair: sendRingEventStream data = %d"
            r2.a((java.lang.String) r3, (byte) r13)
            tya r2 = r11.e
            byte[] r3 = new byte[r0]
            r3[r1] = r13
            java.util.Map r13 = r2.b
            java.lang.Object r12 = r13.get(r12)
            tyb r12 = (defpackage.tyb) r12
            if (r12 == 0) goto L_0x01b3
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x01ad
            goto L_0x01b3
        L_0x01ad:
            r13 = 4
            r12.a(r13, r0, r3)
            r1 = 1
            goto L_0x01c0
        L_0x01b3:
            jjg r12 = defpackage.tsp.a
            anie r12 = r12.d()
            anih r12 = (defpackage.anih) r12
            java.lang.String r13 = "EventStreamManager: Failed to send ring, not connected."
            r12.a((java.lang.String) r13)
        L_0x01c0:
            r14.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r14, (boolean) r1)
            goto L_0x01fe
        L_0x01c7:
            java.util.List r12 = r11.b()
            r14.writeNoException()
            r14.writeTypedList(r12)
            goto L_0x01fe
        L_0x01d2:
            byte[] r12 = r13.createByteArray()
            java.lang.String r12 = r11.a((byte[]) r12)
            r14.writeNoException()
            r14.writeString(r12)
            goto L_0x01fe
        L_0x01e1:
            java.lang.String r12 = r13.readString()
            com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks r12 = r11.b((java.lang.String) r12)
            r14.writeNoException()
            defpackage.bhx.b(r14, r12)
            goto L_0x01fe
        L_0x01f0:
            java.lang.String r12 = r13.readString()
            com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset r12 = r11.a((java.lang.String) r12)
            r14.writeNoException()
            defpackage.bhx.b(r14, r12)
        L_0x01fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arxv.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final List b() {
        ((anih) tsp.a.d()).a("FastPair: getFirmwareUpdatableItems called");
        amzt amzt = new amzt();
        for (tzi tzi : this.c.d()) {
            if (b(tzi)) {
                uaj a2 = a(tzi);
                if (a2 == null) {
                    ((anih) tsp.a.d()).a("FastPair: Can't find StoredDiscoveryItem for address : %s ", (Object) tzi.b);
                } else {
                    String b2 = aryo.b(a2.f);
                    if (TextUtils.isEmpty(b2)) {
                        ((anih) tsp.a.d()).a("FastPair: Can't find companionPackageName from device : %s", (Object) a2.h);
                    } else {
                        ttg ttg = new ttg(this.a, a2);
                        String string = this.a.getString(R.string.common_firmware_update);
                        String str = tzi.b;
                        DiscoveryListItem discoveryListItem = r6;
                        DiscoveryListItem discoveryListItem2 = new DiscoveryListItem(ttg.i(), ttg.k(), string, (String) null, b2, -1.0f, (String) null, (String) null, false, ttg.j(), (Intent) null, ttg.A(), true, ttg.z(), str);
                        amzt.c(discoveryListItem);
                        ((anih) tsp.a.d()).a("FastPair: getFirmwareUpdatableItems add %s to list.", (Object) a2.h);
                    }
                }
            }
        }
        return amzt.a();
    }
}
