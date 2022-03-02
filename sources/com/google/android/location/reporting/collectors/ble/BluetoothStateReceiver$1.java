package com.google.android.location.reporting.collectors.ble;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothStateReceiver$1 extends nla {
    final /* synthetic */ ajie a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothStateReceiver$1(ajie ajie, String str) {
        super(str);
        this.a = ajie;
    }

    public final void a(Context context, Intent intent) {
        ajie ajie = this.a;
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Bluetooth state Intent received with action: ");
        } else {
            "Bluetooth state Intent received with action: ".concat(valueOf);
        }
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int state = ajie.c.a.getState();
            StringBuilder sb = new StringBuilder(36);
            sb.append("Bluetooth: current state ");
            sb.append(state);
            sb.toString();
            if (state == 10) {
                int size = ajie.d.size();
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("onBluetoothDisabled to mListeners: ");
                sb2.append(size);
                sb2.toString();
                for (ajhy ajhy : ajie.d) {
                    if (ajhy.a.f) {
                        if (!ajhz.e()) {
                            ajhz ajhz = ajhy.a;
                            ajhw ajhw = ajhz.e;
                            if (ajhw != null) {
                                ajhz.b.a(ajhw.c());
                            }
                            ajhy.a.d();
                        } else {
                            ajhw ajhw2 = ajhy.a.e;
                            if (ajhw2 != null) {
                                ajhw2.d();
                            }
                        }
                    }
                }
            } else if (state != 12) {
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append("State not supported: ");
                sb3.append(state);
                sb3.toString();
            } else {
                int size2 = ajie.d.size();
                StringBuilder sb4 = new StringBuilder(45);
                sb4.append("onBluetoothEnabled to mListeners: ");
                sb4.append(size2);
                sb4.toString();
                for (ajhy ajhy2 : ajie.d) {
                    ajhz ajhz2 = ajhy2.a;
                    if (ajhz2.f) {
                        ajhw ajhw3 = ajhz2.e;
                        if (ajhw3 != null) {
                            ajhw3.d();
                        }
                        ajhy2.a.c();
                        ajhz ajhz3 = ajhy2.a;
                        ajhw ajhw4 = ajhz3.e;
                        if (ajhw4 != null) {
                            ajhz3.b.a(ajhw4.c());
                        }
                    }
                }
            }
        }
    }
}
