package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;

/* renamed from: acas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acas {
    private final Context a;
    private final aucd b = anwb.h.o();

    public acas(Context context) {
        amrl.a((Object) context);
        this.a = context;
    }

    public final anwb a() {
        return (anwb) this.b.i();
    }

    public final void b() {
        acqj acqj;
        PackageManager packageManager = this.a.getPackageManager();
        acqg a2 = acqg.a();
        if (a2 == null) {
            aucd aucd = this.b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anwb anwb = (anwb) aucd.b;
            anwb anwb2 = anwb.h;
            anwb.b = 1;
            anwb.a |= 1;
            aucd aucd2 = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anwb anwb3 = (anwb) aucd2.b;
            anwb3.c = 1;
            anwb3.a |= 2;
        } else if (a2.b()) {
            aucd aucd3 = this.b;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            anwb anwb4 = (anwb) aucd3.b;
            anwb anwb5 = anwb.h;
            anwb4.b = 3;
            anwb4.a |= 1;
        } else {
            aucd aucd4 = this.b;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            anwb anwb6 = (anwb) aucd4.b;
            anwb anwb7 = anwb.h;
            anwb6.b = 2;
            anwb6.a |= 1;
        }
        if (a2 != null) {
            if (!packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
                aucd aucd5 = this.b;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                anwb anwb8 = (anwb) aucd5.b;
                anwb8.c = 1;
                anwb8.a |= 2;
            } else if (a2.b()) {
                aucd aucd6 = this.b;
                if (aucd6.c) {
                    aucd6.c();
                    aucd6.c = false;
                }
                anwb anwb9 = (anwb) aucd6.b;
                anwb9.c = 3;
                anwb9.a |= 2;
            } else {
                aucd aucd7 = this.b;
                if (aucd7.c) {
                    aucd7.c();
                    aucd7.c = false;
                }
                anwb anwb10 = (anwb) aucd7.b;
                anwb10.c = 2;
                anwb10.a |= 2;
            }
        }
        Context context = this.a;
        abnb.e();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            acqj = new acqj(defaultAdapter);
        } else {
            acqj = null;
        }
        if (acqj == null) {
            aucd aucd8 = this.b;
            if (aucd8.c) {
                aucd8.c();
                aucd8.c = false;
            }
            anwb anwb11 = (anwb) aucd8.b;
            anwb11.d = 1;
            anwb11.a |= 4;
        } else if (acqj.a.isEnabled()) {
            aucd aucd9 = this.b;
            if (aucd9.c) {
                aucd9.c();
                aucd9.c = false;
            }
            anwb anwb12 = (anwb) aucd9.b;
            anwb12.d = 3;
            anwb12.a |= 4;
        } else {
            aucd aucd10 = this.b;
            if (aucd10.c) {
                aucd10.c();
                aucd10.c = false;
            }
            anwb anwb13 = (anwb) aucd10.b;
            anwb13.d = 2;
            anwb13.a |= 4;
        }
        WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            aucd aucd11 = this.b;
            if (aucd11.c) {
                aucd11.c();
                aucd11.c = false;
            }
            anwb anwb14 = (anwb) aucd11.b;
            anwb14.e = 1;
            anwb14.a |= 8;
        } else if (wifiManager.isWifiEnabled()) {
            aucd aucd12 = this.b;
            if (aucd12.c) {
                aucd12.c();
                aucd12.c = false;
            }
            anwb anwb15 = (anwb) aucd12.b;
            anwb15.e = 3;
            anwb15.a |= 8;
        } else {
            aucd aucd13 = this.b;
            if (aucd13.c) {
                aucd13.c();
                aucd13.c = false;
            }
            anwb anwb16 = (anwb) aucd13.b;
            anwb16.e = 2;
            anwb16.a |= 8;
        }
        if (jkr.b()) {
            FingerprintManager fingerprintManager = (FingerprintManager) this.a.getSystemService("fingerprint");
            if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
                aucd aucd14 = this.b;
                if (aucd14.c) {
                    aucd14.c();
                    aucd14.c = false;
                }
                anwb anwb17 = (anwb) aucd14.b;
                anwb17.g = 1;
                anwb17.a |= 32;
            } else if (fingerprintManager.hasEnrolledFingerprints()) {
                aucd aucd15 = this.b;
                if (aucd15.c) {
                    aucd15.c();
                    aucd15.c = false;
                }
                anwb anwb18 = (anwb) aucd15.b;
                anwb18.g = 3;
                anwb18.a |= 32;
            } else {
                aucd aucd16 = this.b;
                if (aucd16.c) {
                    aucd16.c();
                    aucd16.c = false;
                }
                anwb anwb19 = (anwb) aucd16.b;
                anwb19.g = 2;
                anwb19.a |= 32;
            }
        } else {
            aucd aucd17 = this.b;
            if (aucd17.c) {
                aucd17.c();
                aucd17.c = false;
            }
            anwb anwb20 = (anwb) aucd17.b;
            anwb20.g = 1;
            anwb20.a |= 32;
        }
        LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
        if (locationManager == null) {
            aucd aucd18 = this.b;
            if (aucd18.c) {
                aucd18.c();
                aucd18.c = false;
            }
            anwb anwb21 = (anwb) aucd18.b;
            anwb21.f = 1;
            anwb21.a |= 16;
        } else if (locationManager.isProviderEnabled("gps")) {
            aucd aucd19 = this.b;
            if (aucd19.c) {
                aucd19.c();
                aucd19.c = false;
            }
            anwb anwb22 = (anwb) aucd19.b;
            anwb22.f = 4;
            anwb22.a |= 16;
        } else if (locationManager.isProviderEnabled("network")) {
            aucd aucd20 = this.b;
            if (aucd20.c) {
                aucd20.c();
                aucd20.c = false;
            }
            anwb anwb23 = (anwb) aucd20.b;
            anwb23.f = 3;
            anwb23.a |= 16;
        } else {
            aucd aucd21 = this.b;
            if (aucd21.c) {
                aucd21.c();
                aucd21.c = false;
            }
            anwb anwb24 = (anwb) aucd21.b;
            anwb24.f = 2;
            anwb24.a |= 16;
        }
    }
}
