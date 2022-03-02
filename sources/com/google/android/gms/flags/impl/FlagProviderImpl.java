package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FlagProviderImpl extends nfe {
    private boolean a = false;
    private SharedPreferences b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) nfs.a(new nfh(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) nfs.a(new nfj(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) nfs.a(new nfl(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf2));
        }
        return valueOf.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) nfs.a(new nfn(this.b, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() == 0 ? new String("Flag value not available, returning default: ") : "Flag value not available, returning default: ".concat(valueOf));
            return str2;
        }
    }

    public void init(mby mby) {
        Context context = (Context) mbz.a(mby);
        if (!this.a) {
            try {
                this.b = nfr.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (PackageManager.NameNotFoundException e) {
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() == 0 ? new String("Could not retrieve sdk flags, continuing with defaults: ") : "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf));
            }
        }
    }
}
