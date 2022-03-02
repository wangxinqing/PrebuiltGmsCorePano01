package com.google.android.gms.gcm.gmsproc.cm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmReceiverChimeraService extends TracingIntentService {
    private nvx a;
    private nvy b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class MessageTriggeredService extends nvz {
    }

    public GcmReceiverChimeraService() {
        super("GCM");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        byte[] bArr;
        if (intent != null && intent.getExtras() != null) {
            String stringExtra = intent.getStringExtra("google.c.cm.cat");
            String stringExtra2 = intent.getStringExtra("google.c.cm.lt_start");
            String stringExtra3 = intent.getStringExtra("google.c.cm.lt_end");
            long a2 = this.a.a(stringExtra2);
            long a3 = this.a.a(stringExtra3);
            if (stringExtra == null || a2 == 0 || a3 == 0) {
                Log.e("GCM", "Discarded message with device-time due to lack of required fields");
            } else if (a3 < System.currentTimeMillis()) {
                Log.w("GCM", "Message with device-time received past its expiry time.");
            } else if (a2 <= System.currentTimeMillis()) {
                this.b.a(intent.getExtras());
            } else {
                nvx nvx = this.a;
                Bundle extras = intent.getExtras();
                synchronized (nvx.class) {
                    LevelDb b2 = nvx.b();
                    if (b2 != null) {
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder(String.valueOf(stringExtra2).length() + 22 + String.valueOf(stringExtra3).length());
                            sb.append(stringExtra2);
                            sb.append("@");
                            sb.append(stringExtra3);
                            sb.append("@");
                            sb.append(currentTimeMillis);
                            bArr = sb.toString().getBytes("UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            bArr = new byte[0];
                        }
                        try {
                            amnb amnb = (amnb) amnc.r.o();
                            if (amnb.c) {
                                amnb.c();
                                amnb.c = false;
                            }
                            amnc amnc = (amnc) amnb.b;
                            ".".getClass();
                            int i = amnc.a | 16;
                            amnc.a = i;
                            amnc.e = ".";
                            ".".getClass();
                            amnc.a = i | 4;
                            amnc.c = ".";
                            for (String str : extras.keySet()) {
                                Object obj = extras.get(str);
                                if (obj instanceof String) {
                                    aucd o = ammv.d.o();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    ammv ammv = (ammv) o.b;
                                    str.getClass();
                                    int i2 = ammv.a | 1;
                                    ammv.a = i2;
                                    ammv.b = str;
                                    String str2 = (String) obj;
                                    str2.getClass();
                                    ammv.a = i2 | 2;
                                    ammv.c = str2;
                                    amnb.a(o);
                                }
                            }
                            b2.put(bArr, ((amnc) amnb.i()).k());
                        } catch (LevelDbException e2) {
                            Log.e("GCM", "Failed to persist device-time message", e2);
                        }
                    }
                }
                this.a.a();
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.b = new nvy(this, qwq.a((Context) this));
        this.a = new nvx(this, new nvy(this, qwq.a((Context) this)));
    }

    public final void onDestroy() {
        super.onDestroy();
        nvx.c();
    }
}
