package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.Response;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MetricsIntentOperation extends IntentOperation {
    private okc a;

    public static void a(Context context, String str, String str2, int i, int i2, boolean z) {
        aucd o = olo.I.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo = (olo) o.b;
        olo.j = i - 1;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i2 - 1;
        int i4 = i3 | 1024;
        olo.a = i4;
        str2.getClass();
        olo.a = i4 | 2;
        olo.d = str2;
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str.getClass();
            olo2.a |= 64;
            olo2.i = str;
        }
        a(context, (olo) o.i(), z);
    }

    public final void onDestroy() {
        okc okc = this.a;
        if (okc != null) {
            okc.close();
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.e("gH_MetricsIntentOp", "Null intent received.");
        } else if (intent.hasExtra("EXTRA_METRIC_DATA")) {
            try {
                aucd o = olo.I.o();
                o.b(intent.getByteArrayExtra("EXTRA_METRIC_DATA"), aubs.c());
                okg.a(o, (Context) this);
                olo olo = (olo) o.i();
                HelpConfig helpConfig = new HelpConfig();
                helpConfig.b = olo.d;
                helpConfig.e = olo.i;
                helpConfig.D = olo.y;
                helpConfig.c = olo.f;
                if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                    helpConfig = HelpConfig.a((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), (Context) this);
                    okg.a(o, helpConfig);
                }
                if (helpConfig.h) {
                    axmv.c();
                    okc okc = new okc(this);
                    this.a = okc;
                    okc.a((olo) o.i());
                    ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, helpConfig);
                    axmv.c();
                }
            } catch (auda e) {
                Log.e("gH_MetricsIntentOp", "Could not parse metric data.", e);
            }
        } else {
            Log.e("gH_MetricsIntentOp", "No metric data sent!");
        }
    }

    public static void a(Context context, olo olo, boolean z) {
        GoogleHelp googleHelp = new GoogleHelp("gms:googlehelp");
        if (!TextUtils.isEmpty(olo.i)) {
            new nyt(googleHelp).a(olo.i);
        }
        googleHelp.e = olo.d;
        aucd aucd = (aucd) olo.c(5);
        aucd.a((aucj) olo);
        if (((olo) aucd.b).t <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo2 = (olo) aucd.b;
            olo olo3 = olo.I;
            olo2.a |= 16777216;
            olo2.t = currentTimeMillis;
        }
        axmv.c();
        if (z) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo4 = (olo) aucd.b;
            olo olo5 = olo.I;
            olo4.a |= 33554432;
            olo4.u = -2;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add((olo) aucd.i());
            if (ofq.a(axpd.b())) {
                aoru a2 = jfm.a(10);
                a2.execute(new okd(context, googleHelp, a2, arrayList));
                return;
            }
            okk.a(context, HelpConfig.a(googleHelp, context), (Account) null, arrayList, (Response.Listener) null);
            return;
        }
        ojx.a(context, ((olo) aucd.i()).k(), googleHelp);
    }
}
