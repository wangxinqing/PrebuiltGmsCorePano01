package com.google.android.gms.ads.identifier.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.ads.identifier.settings.e;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a extends qvy {
    public final String a;
    public final Intent b;
    public final Context c;
    public final Semaphore d;
    private final e e;

    public a(String str, e eVar, Context context, Semaphore semaphore) {
        super("ads");
        this.a = str;
        this.b = new Intent("com.google.android.gms.ads.identifier.BIND_LISTENER").setPackage(str);
        this.e = eVar;
        this.c = context;
        this.d = semaphore;
    }

    public final void a(ComponentName componentName) {
        this.d.release();
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.ads.identifier.internal.a aVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdListener");
            aVar = queryLocalInterface instanceof com.google.android.gms.ads.identifier.internal.a ? (com.google.android.gms.ads.identifier.internal.a) queryLocalInterface : new com.google.android.gms.ads.identifier.internal.a(iBinder);
        } else {
            aVar = null;
        }
        try {
            String valueOf = String.valueOf(this.a);
            Log.d("AdvertisingIdNS", valueOf.length() == 0 ? new String("Notifying advertising info update event for package ") : "Notifying advertising info update event for package ".concat(valueOf));
            Bundle bundle = new Bundle();
            bundle.putString("ad_id", this.e.c());
            bundle.putBoolean("lat_enabled", this.e.i());
            Parcel aQ = aVar.aQ();
            bhx.a(aQ, (Parcelable) bundle);
            aVar.c(1, aQ);
        } catch (Throwable th) {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("Failed to notify listener service of ");
            sb.append(str);
            sb.append(".");
            Log.w("AdvertisingIdNS", sb.toString());
            Log.w("AdvertisingIdNS", th);
        }
        try {
            jca.a().a(this.c, (ServiceConnection) this);
        } catch (IllegalArgumentException e2) {
        }
        this.d.release();
    }
}
