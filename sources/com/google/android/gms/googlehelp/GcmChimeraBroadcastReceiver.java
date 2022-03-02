package com.google.android.gms.googlehelp;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    private static final boolean b(Context context, Intent intent) {
        Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(805306368);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("gH_GcmBroadcastReceiver", "Received screenshare invite with no bundle");
            return false;
        } else if (!"MOBILE_SCREENSHARE".equals(extras.getString("type"))) {
            return false;
        } else {
            String a = OpenHelpRtcChimeraActivity.a(extras);
            if (TextUtils.isEmpty(a)) {
                Log.e("gH_GcmBroadcastReceiver", "Received screenshare invite with no invitation ID");
                return false;
            }
            String a2 = okg.a(a);
            a(context, a2, "com.google.android.apps.helprtc", 151);
            addFlags.putExtra("launch_source_key", "launch_source_gcm_value");
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj != null) {
                    addFlags.putExtra(str, obj.toString());
                }
            }
            try {
                context.startActivity(addFlags);
                return true;
            } catch (ActivityNotFoundException | SecurityException e) {
                a(context, a2, "com.google.android.apps.helprtc", 152);
                Log.e("gH_GcmBroadcastReceiver", "Unable to start the screenshare activity.", e);
                return true;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "gcm".equals(nsp.a(context).a(intent)) && !b(context, intent)) {
            String stringExtra = intent.getStringExtra("type");
            if ("CHAT_TYPING".equals(stringExtra)) {
                a(context, ChatRequestAndConversationChimeraService.a(context, intent));
            } else if ("CHAT_MESSAGE".equals(stringExtra)) {
                a(context, ChatRequestAndConversationChimeraService.a(context));
            } else if ("CHAT_QUEUE".equals(stringExtra)) {
                a(context, ChatRequestAndConversationChimeraService.a(context, intent.getStringExtra("version")));
            }
        }
    }

    private final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    static final void a(Context context, String str, String str2, int i) {
        MetricsIntentOperation.a(context, str, str2, 88, i, true);
    }
}
