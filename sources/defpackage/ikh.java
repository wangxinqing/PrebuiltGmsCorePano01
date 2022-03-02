package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: ikh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ikh {
    public final Object a = new Object();
    public final List b = new ArrayList();
    private final Context c;
    private final String d;
    private final ikd e;
    private boolean f = false;
    private ArrayList g = null;
    private String h;
    private final int i;

    private ikh(Context context, String str, ikd ikd, int i2) {
        this.c = context;
        iva.a((Object) str);
        this.d = str;
        this.e = ikd;
        this.i = i2;
        f();
    }

    public static ikh a(Context context, String str, int i2, ikd ikd) {
        return new ikh(context, str, ikd, i2);
    }

    public static int b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.location.cache.cache_type")) {
            return -1;
        }
        return extras.getInt("com.google.android.location.cache.cache_type");
    }

    private final void f() {
        PendingIntent service = PendingIntent.getService(this.c, this.i, g(), 0);
        try {
            new jbs(this.c).a("SystemMemoryCache", 2, SystemClock.elapsedRealtime() + 315360000000L, service, "com.google.android.gms");
        } catch (BadParcelableException e2) {
            if (Log.isLoggable("SystemMemoryCache", 6)) {
                Log.e("SystemMemoryCache", "Cache malformed.", e2);
            }
        }
        a(service);
    }

    private final Intent g() {
        Intent className = new Intent().setClassName(this.c, this.d);
        className.putExtra("com.google.android.location.cache.is_cache", true);
        className.putExtra("com.google.android.location.cache.cache_type", this.i);
        return className;
    }

    public final void c() {
        this.g.clear();
    }

    public final List d() {
        synchronized (this.a) {
            ArrayList arrayList = this.g;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            return arrayList3;
        }
    }

    public final void e() {
        Intent g2 = g();
        g2.putParcelableArrayListExtra("com.google.android.location.cache.cache_data", this.g);
        g2.putExtra("com.google.android.location.cache.cache_id", this.h);
        PendingIntent.getService(this.c, this.i, g2, 134217728);
    }

    @Deprecated
    public static ikh a(Context context, String str, ikd ikd) {
        return new ikh(context, str, ikd, 1);
    }

    public final void c(Intent intent) {
        boolean z;
        synchronized (this.a) {
            if (a()) {
                return;
            }
            if (a(intent)) {
                ArrayList parcelableArrayList = intent.getExtras().getParcelableArrayList("com.google.android.location.cache.cache_data");
                this.g = parcelableArrayList;
                if (parcelableArrayList == null) {
                    this.g = new ArrayList();
                }
                if (this.b.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string = intent.getExtras().getString("com.google.android.location.cache.cache_id");
                this.h = string;
                if (string == null) {
                    this.h = UUID.randomUUID().toString();
                    z = true;
                }
                for (ikb a2 : this.b) {
                    a2.a();
                }
                this.b.clear();
                if (z) {
                    e();
                }
                this.f = true;
            }
        }
    }

    private static final void a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e2) {
            }
        }
    }

    public static ikh b(Context context, String str, int i2, ikd ikd) {
        return new ikh(context, str, ikd, i2);
    }

    public final void d(Parcelable parcelable) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (this.e.a((Parcelable) it.next(), parcelable)) {
                it.remove();
            }
        }
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            Bundle extras = intent.getExtras();
            return extras != null && extras.containsKey("com.google.android.location.cache.is_cache");
        } catch (BadParcelableException e2) {
            if (Log.isLoggable("SystemMemoryCache", 6)) {
                Log.e("SystemMemoryCache", "Cache malformed.", e2);
            }
            return false;
        }
    }

    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.h;
        }
        return str;
    }

    public final void b(Parcelable parcelable) {
        synchronized (this.a) {
            if (!a()) {
                this.b.add(new ikf(this, parcelable));
            } else {
                d(parcelable);
                e();
            }
        }
    }

    public final void a(Parcelable parcelable) {
        synchronized (this.a) {
            if (!a()) {
                this.b.add(new ika(this, parcelable));
            } else {
                c(parcelable);
                e();
            }
        }
    }

    public final void b(Collection collection) {
        this.g.clear();
        this.g.addAll(collection);
    }

    public final void a(PrintWriter printWriter) {
        String valueOf = String.valueOf(this.d);
        printWriter.println(valueOf.length() == 0 ? new String("SystemMemoryCache for ") : "SystemMemoryCache for ".concat(valueOf));
        int i2 = this.i;
        StringBuilder sb = new StringBuilder(19);
        sb.append(" type = ");
        sb.append(i2);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(this.h);
        printWriter.println(valueOf2.length() == 0 ? new String(" id = ") : " id = ".concat(valueOf2));
        String valueOf3 = String.valueOf(this.g);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 13);
        sb2.append(" cacheData = ");
        sb2.append(valueOf3);
        printWriter.println(sb2.toString());
    }

    public final void a(Collection collection) {
        synchronized (this.a) {
            if (!a()) {
                this.b.add(new ikg(this, collection));
            } else {
                b(collection);
                e();
            }
        }
    }

    public final void c(Parcelable parcelable) {
        d(parcelable);
        this.g.add(parcelable);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.f;
        }
        return z;
    }
}
