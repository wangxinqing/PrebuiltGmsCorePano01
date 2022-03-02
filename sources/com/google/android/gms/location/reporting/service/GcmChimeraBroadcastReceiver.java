package com.google.android.gms.location.reporting.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        ajnw.a(context);
        if (jjy.a(context) && aztb.Q()) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("GCM message received ");
            sb.append(valueOf);
            ajix.a("GCoreUlr", sb.toString());
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    String valueOf2 = String.valueOf(intent.getExtras().get(str));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf2).length());
                    sb2.append("     ");
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(valueOf2);
                    sb2.toString();
                }
            }
            ajjb.a("UlrGcmNotificationReceived");
            String a = nsp.a(context).a(intent);
            if ("send_error".equals(a)) {
                String valueOf3 = String.valueOf(intent.getExtras());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb3.append("GCM send error: ");
                sb3.append(valueOf3);
                ajix.c("GCoreUlr", sb3.toString());
            } else if ("deleted_messages".equals(a)) {
                String valueOf4 = String.valueOf(intent.getExtras());
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 66);
                sb4.append("GCM server deleted pending messages because they were collapsible.");
                sb4.append(valueOf4);
                ajix.a("GCoreUlr", sb4.toString());
            } else if ("gcm".equals(a)) {
                ajjz ajjz = null;
                if (!intent.hasExtra("ulr_notification")) {
                    ajix.c("GCoreUlr", "Dropping non-ULR GCM message");
                } else {
                    String stringExtra = intent.getStringExtra("ulr_notification");
                    if (stringExtra == null || stringExtra.isEmpty()) {
                        Log.e("GCoreUlr", "Received GCM notification with empty data extra.");
                    } else {
                        try {
                            byte[] decode = Base64.decode(stringExtra, 0);
                            try {
                                ajjz ajjz2 = (ajjz) aucj.a((aucj) ajjz.e, decode, aubs.c());
                                if ((ajjz2.a & 1) != 0 && !ajjz2.b.isEmpty()) {
                                    ajjz = ajjz2;
                                } else {
                                    ajix.c("GCoreUlr", "Received notification missing account name");
                                }
                            } catch (auda e) {
                                ajix.b("GCoreUlr", "Error parsing notification", (Throwable) e);
                            }
                        } catch (IllegalArgumentException e2) {
                            ajix.b("GCoreUlr", "Error decoding notification", (Throwable) e2);
                        }
                    }
                }
                if (ajjz != null) {
                    Account account = new Account(ajjz.b, "com.google");
                    String a2 = rmp.a(account);
                    long j = ajjz.c;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(a2).length() + 61);
                    sb5.append("Received GCM notification for ");
                    sb5.append(a2);
                    sb5.append(" timestamp:");
                    sb5.append(j);
                    ajix.a("GCoreUlr", sb5.toString());
                    if ((ajjz.a & 4) != 0) {
                        ajjy ajjy = ajjz.d;
                        if (ajjy == null) {
                            ajjy = ajjy.c;
                        }
                        if ((ajjy.a & 1) == 0) {
                            ajix.c("GCoreUlr", "Received null value for primary device state");
                        } else {
                            String a3 = rmp.a(account);
                            boolean z = ajjy.b;
                            StringBuilder sb6 = new StringBuilder(String.valueOf(a3).length() + 43);
                            sb6.append("Changing primary device state for ");
                            sb6.append(a3);
                            sb6.append(" to ");
                            sb6.append(z);
                            ajix.a("GCoreUlr", sb6.toString());
                            boolean z2 = ajjy.b;
                            Intent a4 = ajme.a(context, "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE");
                            a4.putExtra("account", account);
                            a4.putExtra("isPrimaryDevice", z2);
                            ajnw.a(context, a4);
                        }
                        ajjb.a("UlrGcmPrimaryDeviceNotification");
                        return;
                    }
                    ajls.a(context, "GcmBroadcastReceiver", account);
                    ajmj ajmj = new ajmj(context);
                    Intent intent2 = new Intent("com.google.android.location.settings.REMOTE_CHANGED");
                    intent2.putExtra("account", account);
                    ajmj.a.sendBroadcast(intent2);
                    ajjb.a("UlrGcmSettingsNotification");
                }
            }
        }
    }
}
