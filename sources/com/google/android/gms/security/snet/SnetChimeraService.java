package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetChimeraService extends Service {
    private static final String j = SnetChimeraService.class.getSimpleName();
    boolean a = false;
    public aase b;
    public aaal c;
    public int d;
    public aaww e;
    public String f;
    ExecutorService g;
    public String h;
    public Bundle i;

    public static Bundle a(File file) {
        JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(new FileInputStream(file), "US-ASCII")));
        Bundle bundle = new Bundle();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("url".equals(nextName)) {
                    bundle.putString(nextName, jsonReader.nextString());
                } else if (!"percent".equals(nextName)) {
                    bundle.putString(nextName, jsonReader.nextString());
                } else {
                    bundle.putInt(nextName, jsonReader.nextInt());
                }
            }
            jsonReader.endObject();
            return bundle;
        } finally {
            jsonReader.close();
        }
    }

    public final void a(int i2) {
        this.e.p = i2;
    }

    public final void b() {
        if (this.i == null) {
            File file = new File(this.b.b, "installed/snet_flags");
            aase aase = this.b;
            if (aase.b(new File(aase.b, "installed/metadata_flags"), file)) {
                this.i = a(file);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int i2;
        super.onCreate();
        this.g = jfm.b(10);
        try {
            i2 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            i2 = -1;
        }
        this.d = i2;
        this.c = new aaal(this);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (!this.a) {
            try {
                this.a = true;
                String action = intent.getAction();
                if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                    this.g.execute(new aaws(this));
                } else if (!"com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                    Log.e(j, "snet unknown action.");
                    a(false);
                } else {
                    this.g.execute(new aawt(this));
                }
            } catch (Throwable th) {
                if (this.e != null) {
                    aaww.a(th);
                }
                a(false);
            }
            return 2;
        }
        Log.e(j, "snet re-entered.");
        return 2;
    }

    public final void a() {
        this.b = new aase(this, this.d);
        this.e = new aaww((Context) this, this.b, this.d);
        String uuid = UUID.randomUUID().toString();
        this.f = uuid;
        this.e.m = uuid;
        this.h = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        if (!aasi.b(this)) {
            this.h = aasi.c(this);
        }
        if (TextUtils.isEmpty(this.h) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(this.h)) {
            this.h = aasi.d(this);
        }
        this.e.n = this.h;
    }

    public final void a(boolean z) {
        if (z) {
            try {
                if (this.e != null) {
                    aaww.g = aaal.b(this);
                    aaww.f = this.c.b();
                    this.e.a(2);
                }
            } catch (Throwable th) {
                this.a = false;
                stopSelf();
                throw th;
            }
        }
        this.a = false;
        stopSelf();
    }
}
