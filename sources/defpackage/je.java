package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: je  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class je {
    public long A;
    boolean B;
    public Notification C;
    @Deprecated
    public ArrayList D;
    public Context a;
    public ArrayList b;
    ArrayList c;
    CharSequence d;
    CharSequence e;
    public PendingIntent f;
    PendingIntent g;
    Bitmap h;
    public int i;
    public int j;
    public boolean k;
    jh l;
    CharSequence m;
    int n;
    int o;
    boolean p;
    public String q;
    public boolean r;
    public String s;
    Bundle t;
    public int u;
    public int v;
    public Notification w;
    public RemoteViews x;
    public RemoteViews y;
    public String z;

    @Deprecated
    public je(Context context) {
        this(context, (String) null);
    }

    protected static CharSequence a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }
        return null;
    }

    public void a(int i2, int i3, boolean z2) {
        this.n = i2;
        this.o = i3;
        this.p = z2;
    }

    public final void a(long j2) {
        this.C.when = j2;
    }

    public void a(PendingIntent pendingIntent) {
        this.f = pendingIntent;
    }

    public final void a(long[] jArr) {
        this.C.vibrate = jArr;
    }

    public Notification b() {
        Notification notification;
        Bundle a2;
        jj jjVar = new jj(this);
        jh jhVar = jjVar.b.l;
        if (jhVar != null) {
            jhVar.a((ja) jjVar);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = jjVar.a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            notification = jjVar.a.build();
        } else {
            int i2 = Build.VERSION.SDK_INT;
            jjVar.a.setExtras(jjVar.d);
            notification = jjVar.a.build();
            RemoteViews remoteViews = jjVar.c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = jjVar.e;
            if (remoteViews2 != null) {
                notification.headsUpContentView = remoteViews2;
            }
        }
        RemoteViews remoteViews3 = jjVar.b.x;
        if (remoteViews3 != null) {
            notification.contentView = remoteViews3;
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        if (!(jhVar == null || (a2 = ji.a(notification)) == null)) {
            jhVar.a(a2);
        }
        return notification;
    }

    public final void b(int i2) {
        this.C.icon = i2;
    }

    public final void b(PendingIntent pendingIntent) {
        this.C.deleteIntent = pendingIntent;
    }

    public void c() {
        this.r = true;
    }

    public final void d() {
        this.k = false;
    }

    public final void e() {
        this.v = 1;
    }

    public je(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.k = true;
        this.r = false;
        this.u = 0;
        this.v = 0;
        Notification notification = new Notification();
        this.C = notification;
        this.a = context;
        this.z = str;
        notification.when = System.currentTimeMillis();
        this.C.audioStreamType = -1;
        this.j = 0;
        this.D = new ArrayList();
        this.B = true;
    }

    private final void a(int i2, boolean z2) {
        if (!z2) {
            Notification notification = this.C;
            notification.flags = (i2 ^ -1) & notification.flags;
            return;
        }
        Notification notification2 = this.C;
        notification2.flags = i2 | notification2.flags;
    }

    public final void c(PendingIntent pendingIntent) {
        this.g = pendingIntent;
        a(128, true);
    }

    public final void d(CharSequence charSequence) {
        this.C.tickerText = a(charSequence);
    }

    public void e(CharSequence charSequence) {
        this.d = a(charSequence);
    }

    public void c(CharSequence charSequence) {
        this.m = a(charSequence);
    }

    public final Bundle a() {
        if (this.t == null) {
            this.t = new Bundle();
        }
        return this.t;
    }

    public final void c(boolean z2) {
        a(8, z2);
    }

    public final void a(int i2) {
        this.C.defaults = i2;
        if ((i2 & 4) != 0) {
            this.C.flags |= 1;
        }
    }

    public void a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new jc(i2, charSequence, pendingIntent));
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d2 = (double) dimensionPixelSize;
                double max = (double) Math.max(1, bitmap.getWidth());
                Double.isNaN(d2);
                Double.isNaN(max);
                double d3 = d2 / max;
                double d4 = (double) dimensionPixelSize2;
                double max2 = (double) Math.max(1, bitmap.getHeight());
                Double.isNaN(d4);
                Double.isNaN(max2);
                double min = Math.min(d3, d4 / max2);
                double width = (double) bitmap.getWidth();
                Double.isNaN(width);
                double height = (double) bitmap.getHeight();
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * min), (int) Math.ceil(height * min), true);
            }
        }
        this.h = bitmap;
    }

    public void b(CharSequence charSequence) {
        this.e = a(charSequence);
    }

    public final void b(boolean z2) {
        a(2, z2);
    }

    public final void a(Uri uri) {
        this.C.sound = uri;
        this.C.audioStreamType = -1;
        int i2 = Build.VERSION.SDK_INT;
        this.C.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = this.t;
        if (bundle2 == null) {
            this.t = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    public final void a(jc jcVar) {
        this.b.add(jcVar);
    }

    public final void a(jh jhVar) {
        if (this.l != jhVar) {
            this.l = jhVar;
            if (jhVar != null && jhVar.a != this) {
                jhVar.a = this;
                je jeVar = jhVar.a;
                if (jeVar != null) {
                    jeVar.a(jhVar);
                }
            }
        }
    }

    public final void a(boolean z2) {
        a(16, z2);
    }
}
