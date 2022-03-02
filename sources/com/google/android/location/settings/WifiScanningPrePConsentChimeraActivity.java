package com.google.android.location.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiScanningPrePConsentChimeraActivity extends Activity implements DialogInterface.OnClickListener {
    private static long a = -1;
    private boolean b = false;
    private boolean c = false;
    private ajpa d;

    public final void finish() {
        super.finish();
        if (!this.b) {
            if (!this.c) {
                Settings.Global.putInt(getContentResolver(), "wifi_scan_always_enabled", 0);
            } else if (this.d != null && ayet.d()) {
                ajpa ajpa = this.d;
                egr egr = new egr();
                egr.a = 41;
                egr.b();
                aqnk aqnk = (aqnk) aqnl.g.o();
                aucd o = aqnt.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqnt aqnt = (aqnt) o.b;
                aqnt.b = 1;
                aqnt.a |= 1;
                aucd o2 = aqnt.d.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqnt aqnt2 = (aqnt) o2.b;
                aqnt2.b = 2;
                aqnt2.a |= 1;
                aucd o3 = aqnr.d.o();
                aucd o4 = aqnp.c.o();
                String hexString = Long.toHexString(((Long) jhg.b.c()).longValue());
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aqnp aqnp = (aqnp) o4.b;
                hexString.getClass();
                aqnp.a |= 1;
                aqnp.b = hexString;
                aqnp aqnp2 = (aqnp) o4.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqnr aqnr = (aqnr) o3.b;
                aqnp2.getClass();
                aqnr.c = aqnp2;
                aqnr.a |= 2;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqnt aqnt3 = (aqnt) o.b;
                aqnr aqnr2 = (aqnr) o3.i();
                aqnr2.getClass();
                aqnt3.c = aqnr2;
                aqnt3.a |= 2;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqnt aqnt4 = (aqnt) o2.b;
                aqnr aqnr3 = (aqnr) o3.i();
                aqnr3.getClass();
                aqnt4.c = aqnr3;
                aqnt4.a |= 2;
                List asList = Arrays.asList(new aqnt[]{(aqnt) o.i(), (aqnt) o2.i()});
                if (aqnk.c) {
                    aqnk.c();
                    aqnk.c = false;
                }
                aqnl aqnl = (aqnl) aqnk.b;
                aqnl.a();
                auab.a((Iterable) asList, (List) aqnl.b);
                aucd o5 = aqnu.d.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aqnu aqnu = (aqnu) o5.b;
                aqnu.b = 81;
                aqnu.a |= 1;
                aqnu aqnu2 = (aqnu) o5.i();
                if (aqnk.c) {
                    aqnk.c();
                    aqnk.c = false;
                }
                aqnl aqnl2 = (aqnl) aqnk.b;
                aqnu2.getClass();
                aqnl2.e = aqnu2;
                aqnl2.a |= 4;
                aucd o6 = aqob.d.o();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                aqob aqob = (aqob) o6.b;
                aqob.b = 129;
                aqob.a |= 1;
                aucd o7 = aqny.e.o();
                aucd o8 = aqnd.f.o();
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                aqnd.a((aqnd) o8.b);
                aqnj a2 = ajpa.a(R.string.wifi_scanning_consent_pre_p_message);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                aqnd aqnd = (aqnd) o8.b;
                a2.getClass();
                aqnd.c = a2;
                aqnd.a |= 4;
                aqnj a3 = ajpa.a(R.string.common_ok);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                aqnd aqnd2 = (aqnd) o8.b;
                a3.getClass();
                aqnd2.d = a3;
                aqnd2.a |= 8;
                aqnj a4 = ajpa.a(R.string.common_cancel);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                aqnd aqnd3 = (aqnd) o8.b;
                a4.getClass();
                aqnd3.e = a4;
                aqnd3.a |= 16;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                aqny aqny = (aqny) o7.b;
                aqnd aqnd4 = (aqnd) o8.i();
                aqnd4.getClass();
                aqny.b = aqnd4;
                aqny.a = 1 | aqny.a;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                aqob aqob2 = (aqob) o6.b;
                aqny aqny2 = (aqny) o7.i();
                aqny2.getClass();
                aqob2.c = aqny2;
                aqob2.a |= 8;
                aqob aqob3 = (aqob) o6.i();
                if (aqnk.c) {
                    aqnk.c();
                    aqnk.c = false;
                }
                aqnl aqnl3 = (aqnl) aqnk.b;
                aqob3.getClass();
                aqnl3.f = aqob3;
                aqnl3.a |= 8;
                egr.a(((aqnl) aqnk.i()).k());
                egj.a(ajpa.a).a(egr.a()).a(ajpc.a);
            }
            if (ayet.b() > 0) {
                a = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.c = true;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (a == -1 || SystemClock.elapsedRealtime() - a > ayet.b()) {
            this.b = false;
            if (ayet.d()) {
                this.d = new ajpa(this);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(R.string.wifi_scanning_consent_pre_p_message);
            builder.setPositiveButton(R.string.common_ok, this);
            builder.setNegativeButton(R.string.common_cancel, this);
            builder.setOnCancelListener(new ajpb(this));
            AlertDialog create = builder.create();
            setFinishOnTouchOutside(true);
            create.show();
            return;
        }
        this.b = true;
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!isFinishing()) {
            finish();
        }
    }
}
