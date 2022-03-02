package com.google.android.gms.location.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationOffWarningChimeraActivity extends Activity implements DialogInterface.OnClickListener {
    private hol a;
    private AlertDialog b;
    private int c;
    private Boolean d;

    private final void a(boolean z) {
        if (this.d == null) {
            this.d = Boolean.valueOf(z);
            int i = 4;
            if (Log.isLoggable("LOWD", 4)) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("dialog choice was ");
                sb.append(z);
                Log.i("LOWD", sb.toString());
            }
            if (!isFinishing()) {
                finish();
            }
            if (z) {
                rns.a((Context) this, this.c, rnu.a);
                rlt.f(this);
            }
            if (Math.random() <= aydl.a.a().logSamplingRate()) {
                aucd o = anyr.c.o();
                if (z) {
                    i = 3;
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anyr anyr = (anyr) o.b;
                anyr.b = i - 1;
                anyr.a |= 1;
                anyr anyr2 = (anyr) o.i();
                aucd o2 = anui.p.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anui anui = (anui) o2.b;
                anui.b = 7;
                anui.a |= 1;
                aucd o3 = anys.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anys anys = (anys) o3.b;
                anys.b = 1;
                int i2 = 1 | anys.a;
                anys.a = i2;
                anyr2.getClass();
                anys.c = anyr2;
                anys.a = i2 | 2;
                anys anys2 = (anys) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anui anui2 = (anui) o2.b;
                anys2.getClass();
                anui2.i = anys2;
                anui2.a |= 128;
                this.a.a((audx) (anui) o2.i()).b();
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hol hol = new hol(this, "LE", (String) null);
        this.a = hol;
        hol.a(avsd.UNMETERED_OR_DAILY);
        int intExtra = getIntent().getIntExtra("previousMode", 0);
        this.c = intExtra;
        if (intExtra == 0) {
            finish();
            return;
        }
        if (Log.isLoggable("LOWD", 4)) {
            Log.i("LOWD", "displaying dialog");
        }
        sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        AlertDialog create = new AlertDialog.Builder(this).setTitle(R.string.location_off_dialog_title).setMessage(R.string.location_off_dialog_message).setPositiveButton(R.string.location_off_dialog_button_turn_on_location, this).setNegativeButton(R.string.close_button_label, this).setOnCancelListener(new rnd(this)).create();
        this.b = create;
        create.show();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        a(false);
        super.onPause();
    }
}
