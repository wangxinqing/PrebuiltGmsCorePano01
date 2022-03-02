package com.google.location.nearby.direct.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothNameScan$1 extends nla {
    final /* synthetic */ asbx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothNameScan$1(asbx asbx, String str) {
        super(str);
        this.a = asbx;
    }

    public final void a(Context context, Intent intent) {
        if (intent != null && "android.bluetooth.device.action.FOUND".equals(intent.getAction()) && this.a.d != null) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getExtras().get("android.bluetooth.device.extra.DEVICE");
            Short sh = (Short) intent.getExtras().get("android.bluetooth.device.extra.RSSI");
            if (sh != null) {
                sh.shortValue();
            }
            jjg jjg = asil.a;
            bluetoothDevice.getName();
            asbx asbx = this.a;
            asfi asfi = asbx.c;
            String name = bluetoothDevice.getName();
            if (name != null) {
                asfh asfh = asfi.b;
                if (asfh == null) {
                    asfh = asfh.d;
                }
                if (name.startsWith(asfh.b)) {
                    asfh asfh2 = asfi.b;
                    if (asfh2 == null) {
                        asfh2 = asfh.d;
                    }
                    tgh a2 = tgh.a(name.substring(asfh2.b.length()));
                    asfh asfh3 = asfi.b;
                    if (asfh3 == null) {
                        asfh3 = asfh.d;
                    }
                    if ((asfh3.a & 2) != 0) {
                        asfh asfh4 = asfi.b;
                        if (asfh4 == null) {
                            asfh4 = asfh.d;
                        }
                        if (asfh4.c != 0) {
                            int length = a2.a.length;
                            asfh asfh5 = asfi.b;
                            if (asfh5 == null) {
                                asfh5 = asfh.d;
                            }
                            if (length != asfh5.c) {
                                return;
                            }
                        }
                    }
                    asgs asgs = asbx.d;
                    byte[] bArr = a2.a;
                    String address = bluetoothDevice.getAddress();
                    aucd o = asff.d.o();
                    aucd o2 = asfp.c.o();
                    auay a3 = auay.a(bArr);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asfp asfp = (asfp) o2.b;
                    a3.getClass();
                    asfp.a |= 1;
                    asfp.b = a3;
                    asfp asfp2 = (asfp) o2.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asff asff = (asff) o.b;
                    asfp2.getClass();
                    asff.b = asfp2;
                    asff.a |= 1;
                    aucd o3 = asfu.c.o();
                    auay a4 = auay.a(asgt.a(address));
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    asfu asfu = (asfu) o3.b;
                    a4.getClass();
                    asfu.a |= 1;
                    asfu.b = a4;
                    asfu asfu2 = (asfu) o3.i();
                    aucf aucf = (aucf) asgd.e.o();
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    asgd asgd = (asgd) aucf.b;
                    asgd.b = 3;
                    asgd.a |= 1;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asff asff2 = (asff) o.b;
                    asfu2.getClass();
                    asff2.c = asfu2;
                    asff2.a |= 2;
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    asgd asgd2 = (asgd) aucf.b;
                    asff asff3 = (asff) o.i();
                    asff3.getClass();
                    asgd2.c = asff3;
                    asgd2.a |= 2;
                    asgg asgg = (asgg) asgh.d.o();
                    asgg.a((asgd) aucf.i());
                    asgs.a((asgh) asgg.i());
                }
            }
        }
    }
}
