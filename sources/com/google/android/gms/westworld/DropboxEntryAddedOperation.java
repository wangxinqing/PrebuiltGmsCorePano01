package com.google.android.gms.westworld;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DropboxEntryAddedOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        iby iby;
        if (!aecm.a()) {
            ihs b = ihs.b();
            aupy aupy = null;
            if (azwv.a.a().g()) {
                SharedPreferences sharedPreferences = b.getSharedPreferences("WestworldDropboxOp", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - sharedPreferences.getLong("WestworldDropboxOpLastRunMillis", -1) >= azwv.g() || "com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM".equals(intent.getAction())) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("WestworldDropboxOpLastRunMillis", currentTimeMillis);
                    if ("com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM".equals(intent.getAction())) {
                        edit.putBoolean("WestworldDropboxOpAlarmSet", false);
                    }
                    edit.apply();
                } else if (!sharedPreferences.getBoolean("WestworldDropboxOpAlarmSet", false)) {
                    new jbs(b).a("WestworldDropboxOp", 3, SystemClock.elapsedRealtime() + azwv.g(), IntentOperation.getPendingIntent((Context) b, DropboxEntryAddedOperation.class, new Intent("com.google.android.gms.westworld.action.WESTWORLD_DROPBOX_ALARM"), 0, 134217728), (String) null);
                    sharedPreferences.edit().putBoolean("WestworldDropboxOpAlarmSet", true).apply();
                    return;
                } else {
                    return;
                }
            }
            if (azvd.b()) {
                iby = adrz.a(ihs.b(), new adry());
            } else {
                aupy = aecq.a((Context) b);
                iby = null;
            }
            hph f = aecq.f(b);
            try {
                if (azwv.i() && azvq.a.a().a()) {
                    if (aecq.a(aupy, iby, azvq.b())) {
                        aech.a(b, iby, aupy, f);
                    }
                }
                if (azwv.i() && azvw.a.a().a()) {
                    if (aecq.a(aupy, iby, azwv.o())) {
                        aecl.a(b, iby, aupy, f);
                    }
                }
                if (azwv.i() && azvg.a.a().a()) {
                    if (aecq.a(aupy, iby, azwv.d())) {
                        aecf.a(b, iby, aupy, f);
                    }
                }
            } finally {
                f.d();
            }
        }
    }
}
