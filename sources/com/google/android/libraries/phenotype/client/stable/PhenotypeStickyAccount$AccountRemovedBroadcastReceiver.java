package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PhenotypeStickyAccount$AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && "android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && agwv.a(intent.getStringExtra("accountType"))) {
            String string = intent.getExtras().getString("authAccount");
            SharedPreferences sharedPreferences = context.getSharedPreferences("PhenotypeStickyAccount", 0);
            SharedPreferences.Editor editor = null;
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                if ((next.getValue() instanceof String) && next.getValue().equals(string)) {
                    if (editor == null) {
                        editor = sharedPreferences.edit();
                    }
                    editor.remove((String) next.getKey());
                }
            }
            if (editor != null) {
                editor.apply();
            }
        }
    }
}
