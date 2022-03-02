package com.google.android.gms.mdm.receivers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiStateChangedReceiver extends nla {
    private final aary a;

    static {
        WifiStateChangedReceiver.class.getSimpleName();
    }

    public WifiStateChangedReceiver() {
        super("security-wifi-state-changed");
        if (aary.a == null) {
            aary.a = new aary();
        }
        this.a = aary.a;
    }

    private static boolean a(int i) {
        return i == 3 || i == 2;
    }

    private static boolean b(int i) {
        return i == 1 || i == 0;
    }

    private static byte[] a(Context context, String str) {
        byte[] bArr = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            long j = packageManager.getPackageInfo(str, 0).lastUpdateTime;
            bArr = aasc.a(str, j);
            if (bArr == null) {
                bArr = aann.a(new File(packageManager.getApplicationInfo(str, 0).publicSourceDir));
                aucd o = aawy.d.o();
                auay a2 = auay.a(bArr);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aawy aawy = (aawy) o.b;
                a2.getClass();
                int i = aawy.a | 1;
                aawy.a = i;
                aawy.b = a2;
                aawy.a = i | 2;
                aawy.c = j;
                aawy aawy2 = (aawy) o.i();
                if (!aasc.a.containsKey(str)) {
                    if (aasc.a.size() == 100) {
                        aasc.a.remove((String) aasc.a.keySet().iterator().next());
                    }
                    aasc.a.put(str, aawy2);
                } else {
                    aasc.a.put(str, aawy2);
                }
            }
        } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
        }
        return bArr;
    }

    public final void a(Context context, Intent intent) {
        String str;
        String str2;
        ancq ancq;
        boolean z;
        aucd aucd;
        String str3;
        Context context2 = context;
        Intent intent2 = intent;
        if (intent2 == null) {
        } else if (!"android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
        } else if (!azfv.i()) {
        } else if (new aaal(context2).a()) {
            int intExtra = intent2.getIntExtra("wifi_state", 4);
            int intExtra2 = intent2.getIntExtra("previous_wifi_state", 4);
            boolean b = b(intExtra);
            boolean b2 = b(intExtra2);
            boolean a2 = a(intExtra);
            if (!a(intExtra2) || !b) {
                if (!b2) {
                    return;
                } else if (!a2) {
                    return;
                }
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            if (jkr.b()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return;
                } else if (!networkCapabilities.hasCapability(12)) {
                    return;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return;
                } else if (!activeNetworkInfo.isConnected()) {
                    return;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            SystemClock.sleep(Math.min(azfv.a.a().ac(), 60000));
            List a3 = sno.a(context2, currentTimeMillis);
            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
            String simOperator = telephonyManager.getSimOperator();
            boolean z2 = false;
            if (simOperator == null) {
                str2 = null;
                str = null;
            } else if (!simOperator.isEmpty()) {
                str = simOperator.substring(0, 3);
                str2 = simOperator.substring(3);
            } else {
                str2 = null;
                str = null;
            }
            ArrayList arrayList = new ArrayList();
            long j = currentTimeMillis - 300000;
            int i = Build.VERSION.SDK_INT;
            try {
                new aaxe(AppOpsManager.class);
                ancq = new aaxc(context2).a(j);
            } catch (Exception e) {
                ancq = null;
            }
            int size = a3.size();
            int i2 = 0;
            while (i2 < size) {
                sno sno = (sno) a3.get(i2);
                String str4 = sno.b;
                if (ancq != null) {
                    List<aaxb> a4 = ancq.a(str4);
                    if (a4 != null) {
                        aucd aucd2 = null;
                        for (aaxb aaxb : a4) {
                            Integer num = aaxb.a;
                            if (num == null || num.intValue() != 71) {
                                z = false;
                            } else {
                                aucd o = aaxa.k.o();
                                if (o.c) {
                                    o.c();
                                    o.c = z;
                                }
                                aaxa aaxa = (aaxa) o.b;
                                str4.getClass();
                                int i3 = aaxa.a | 1;
                                aaxa.a = i3;
                                aaxa.b = str4;
                                aaxa.a = i3 | 32;
                                aaxa.g = true;
                                aucd2 = o;
                                z = false;
                            }
                        }
                        aucd = aucd2;
                    } else {
                        aucd = null;
                    }
                } else {
                    aucd = aaxa.k.o();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aaxa aaxa2 = (aaxa) aucd.b;
                    str4.getClass();
                    int i4 = aaxa2.a | 1;
                    aaxa2.a = i4;
                    aaxa2.b = str4;
                    aaxa2.a = i4 | 32;
                    aaxa2.g = false;
                }
                if (aucd != null) {
                    String str5 = sno.b;
                    if (azfv.a.a().l()) {
                        str3 = sno.c;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        if (str3.contains("wap")) {
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            aaxa aaxa3 = (aaxa) aucd.b;
                            aaxa aaxa4 = aaxa.k;
                            aaxa3.a |= 512;
                            aaxa3.j = true;
                        }
                        if (jkr.e()) {
                            String meid = telephonyManager.getMeid();
                            String imei = telephonyManager.getImei();
                            if (meid != null && ampw.b(str3).contains(ampw.b(meid))) {
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                aaxa.a((aaxa) aucd.b);
                            }
                            if (imei != null && ampw.b(str3).contains(ampw.b(imei))) {
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                aaxa.a((aaxa) aucd.b);
                            }
                        } else {
                            String deviceId = telephonyManager.getDeviceId();
                            if (deviceId != null && ampw.b(str3).contains(ampw.b(deviceId))) {
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                aaxa.a((aaxa) aucd.b);
                            }
                        }
                    }
                    if (!a2) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aaxa aaxa5 = (aaxa) aucd.b;
                        aaxa aaxa6 = aaxa.k;
                        aaxa5.d = 2;
                        aaxa5.a |= 4;
                    } else {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aaxa aaxa7 = (aaxa) aucd.b;
                        aaxa aaxa8 = aaxa.k;
                        aaxa7.d = 1;
                        aaxa7.a |= 4;
                    }
                    byte[] a5 = a(context2, str5);
                    if (a5 != null) {
                        auay a6 = auay.a(a5);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aaxa aaxa9 = (aaxa) aucd.b;
                        a6.getClass();
                        aaxa9.a |= 2;
                        aaxa9.c = a6;
                    }
                    if (str != null) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aaxa aaxa10 = (aaxa) aucd.b;
                        str.getClass();
                        aaxa10.a |= 8;
                        aaxa10.e = str;
                        if (str3 != null && str3.contains(str)) {
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            aaxa aaxa11 = (aaxa) aucd.b;
                            aaxa11.a |= 64;
                            aaxa11.h = true;
                        }
                    }
                    if (str2 != null) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aaxa aaxa12 = (aaxa) aucd.b;
                        str2.getClass();
                        aaxa12.a |= 16;
                        aaxa12.f = str2;
                        if (str3 != null) {
                            if (str3.contains(str2)) {
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                aaxa aaxa13 = (aaxa) aucd.b;
                                aaxa13.a |= 128;
                                aaxa13.i = true;
                            }
                        }
                    }
                    arrayList.add((aaxa) aucd.i());
                }
                i2++;
                z2 = false;
            }
            if (!arrayList.isEmpty()) {
                aary aary = this.a;
                if (azfv.i()) {
                    aary.c.execute(new aarx(aary, arrayList));
                    return;
                }
                return;
            }
        }
    }
}
