package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StateWatcher extends nla {
    public final Context a;
    public int b = 0;
    private final Runnable c;
    private boolean d = false;
    private int e = 100;
    private boolean f = false;

    public StateWatcher(Context context, Runnable runnable) {
        super("ota");
        this.a = context;
        this.c = runnable;
        this.b = context.getSharedPreferences("update", 0).getInt("battery_state", 0);
    }

    public final void a(Context context, Intent intent) {
        int i;
        boolean z;
        boolean z2;
        String action = intent.getAction();
        boolean z3 = true;
        boolean z4 = false;
        if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            this.e = intent.getIntExtra("level", -1);
            if (intent.getIntExtra("plugged", 0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
        }
        if (this.f) {
            i = this.e < ((Long) adka.c.a()).intValue() ? 1 : 0;
        } else {
            i = this.e < ((Long) adka.b.a()).intValue() ? 2 : 0;
        }
        if (i != this.b) {
            this.b = i;
            z = true;
        } else {
            z = false;
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            boolean z5 = this.d;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.w("StateWatcher", "couldn't get connectivity manager");
                z4 = z5;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isRoaming()) {
                    z4 = true;
                }
            }
            if (z4 != this.d) {
                this.d = z4;
                if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE") || z3) {
                    this.c.run();
                }
                return;
            }
        }
        z3 = z;
        if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE")) {
            return;
        }
        this.c.run();
    }
}
