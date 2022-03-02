package defpackage;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.people.sync.focus.notification.NotificationReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xxi {
    protected final String a;
    protected final je b;
    protected final iwq c;
    protected final Context d;
    protected final String e;
    protected final int f;
    protected final boolean g;
    protected final wss h;
    protected final String i;
    protected final yaz j;
    protected int k = -1;
    protected int l = -1;
    protected String m;
    protected String n;
    protected long o;
    private xkm p;
    private final int q;
    private final String r;
    private boolean s;
    private long t;
    private int u;

    protected xxi(Context context, Account account, wss wss, yaz yaz, int i2, int i3, String str) {
        PendingIntent pendingIntent = null;
        this.m = null;
        this.n = null;
        this.o = 0;
        this.p = xkm.UNKNOWN_STAGE;
        this.u = 1;
        this.s = false;
        this.t = 0;
        this.d = context;
        this.h = wss;
        this.i = account.name;
        this.j = yaz;
        this.q = i2;
        this.f = i3;
        this.a = str;
        this.g = ayug.a.a().P();
        this.e = "com.google.android.gms.people.sync.focus.notification.sync_progress.tag.".concat(this.i);
        this.c = iwq.a(context);
        je jeVar = new je(context);
        jeVar.c((CharSequence) account.name);
        jeVar.b(!ayug.k() ? R.drawable.quantum_ic_google_white_24 : R.drawable.quantum_ic_contacts_product_white_24);
        jeVar.a(ayug.a.a().D());
        jeVar.c(true);
        jeVar.a(System.currentTimeMillis());
        if (!ayug.e()) {
            context.registerReceiver(new NotificationReceiver(this.h, this), new IntentFilter(a()));
        }
        jeVar.b(a(context, a()));
        this.b = jeVar;
        if (ayug.k()) {
            this.b.u = kf.b(context, R.color.quantum_googblue);
        }
        if (ayug.a.a().B()) {
            this.b.b(true);
        }
        if (!ayug.a.a().W()) {
            Intent c2 = c();
            if (c2 != null) {
                pendingIntent = PendingIntent.getActivity(this.d, 0, c2, 134217728);
            }
        } else {
            pendingIntent = a(this.d, b());
        }
        if (pendingIntent != null) {
            this.b.f = pendingIntent;
        }
        if (ayug.a.a().H()) {
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", context.getResources().getString(!ayug.a.a().G() ? R.string.people_fsa_notification_channel_group_name : R.string.common_asm_google_account_title));
            this.b.a(bundle);
        }
        this.r = xxc.a();
        if (Build.VERSION.SDK_INT >= 26) {
            if (ayug.j()) {
                int h2 = (int) ayug.h();
                if (h2 > 0) {
                    int i4 = h2 - 1;
                    while (true) {
                        if (i4 >= 0) {
                            String str2 = "com.google.android.gms.people.sync.focus.notification.fsa2_channel.id";
                            str2 = i4 != 0 ? str2.concat(Integer.toString(i4)) : str2;
                            if (this.c.a(str2) != null) {
                                this.c.b(str2);
                                break;
                            }
                            i4--;
                        } else {
                            break;
                        }
                    }
                    if (this.c.a(this.r) == null) {
                        f((int) ayug.a.a().x());
                    }
                } else {
                    Log.e(str, "Flag next_channel_version should be positive.");
                }
            } else if (this.c.a(this.r) == null) {
                f(3);
            }
            this.b.z = this.r;
        }
    }

    static final PendingIntent a(Context context, String str) {
        return PendingIntent.getBroadcast(context, 0, new Intent(str).setPackage(context.getPackageName()), 134217728);
    }

    private final void f(int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.r, this.d.getString(R.string.people_fsa_notification_channel_name), i2);
            if (this.c.c("com.google.android.gms.people.sync.focus.notification.channel_group.id") == null) {
                this.c.a(new NotificationChannelGroup("com.google.android.gms.people.sync.focus.notification.channel_group.id", this.d.getResources().getString(R.string.people_fsa_notification_channel_group_name)));
            }
            notificationChannel.setGroup("com.google.android.gms.people.sync.focus.notification.channel_group.id");
            this.c.a(notificationChannel);
        }
    }

    private final void g(int i2) {
        int i3;
        aucd o2 = xni.f.o();
        if (this.u == 1) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        xni xni = (xni) o2.b;
        xni.b = i3 - 1;
        int i4 = xni.a | 1;
        xni.a = i4;
        xni.c = this.p.h;
        int i5 = i4 | 2;
        xni.a = i5;
        int i6 = this.u;
        int i7 = i6 - 1;
        if (i6 != 0) {
            xni.d = i7;
            int i8 = i5 | 4;
            xni.a = i8;
            xni.e = i2 - 1;
            xni.a = i8 | 8;
            xni xni2 = (xni) o2.i();
            yaz yaz = this.j;
            ybf ybf = new ybf(this.f, this.e);
            ybh ybh = (ybh) yaz;
            if (!ybh.z.containsKey(ybf)) {
                ybh.z.put(ybf, new ArrayList());
            }
            ((List) ybh.z.get(ybf)).add(xni2);
            return;
        }
        throw null;
    }

    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract xkm a(xjo xjo);

    /* access modifiers changed from: protected */
    public abstract void a(int i2, boolean z);

    public abstract String b();

    public final void b(int i2) {
        if (i2 >= 0) {
            this.p = a(xjo.GROUP);
            this.n = this.d.getResources().getQuantityString(R.plurals.people_fsa_progress_notification_format_for_groups_sync, i2, new Object[]{Integer.valueOf(i2)});
            this.m = this.d.getResources().getString(this.q, new Object[]{this.n});
            d(i2);
        }
    }

    public abstract Intent c();

    public final void c(int i2) {
        boolean z;
        boolean z2;
        if (i2 >= 0) {
            this.p = a(xjo.PHOTO);
            Resources resources = this.d.getResources();
            Integer valueOf = Integer.valueOf(i2);
            this.n = resources.getQuantityString(R.plurals.people_fsa_progress_notification_format_for_photos_sync, i2, new Object[]{valueOf});
            if (this.g) {
                int i3 = this.k / 2;
                if (!ayug.a.a().O() || i3 != 0 || i2 <= 0) {
                    if (i3 > i2) {
                        this.k = i3 + i2;
                    }
                    z = false;
                } else {
                    this.m = this.d.getResources().getString(this.q, new Object[]{this.d.getResources().getQuantityString(R.plurals.people_fsa_progress_notification_format_for_contacts_sync, i2, new Object[]{valueOf})});
                    this.k = i2;
                    z = true;
                }
                if (i2 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a(0, z, true, true, z2);
                return;
            }
            this.m = this.d.getResources().getString(this.q, new Object[]{this.n});
            d(i2);
        }
    }

    public final xxd d() {
        return new xxd(((ybh) this.j).q, this.i, this.f, this.p, this.u);
    }

    /* access modifiers changed from: package-private */
    public final Intent e() {
        Intent putExtra = new Intent("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS").putExtra("authAccount", this.i);
        if (ayqs.b() && Build.VERSION.SDK_INT >= 22) {
            putExtra.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.people.notification").build());
        }
        return putExtra;
    }

    public final void h() {
        xip.a();
        if (Boolean.valueOf(ayrj.a.a().ax()).booleanValue()) {
            return;
        }
        if (!ayug.a.a().e() || this.s) {
            long Q = ayug.a.a().Q();
            if (ayug.i()) {
                long y = ayug.a.a().y() - ((System.currentTimeMillis() - this.t) + Q);
                if (y > 0) {
                    Q += y;
                }
            }
            if (Q > 0) {
                try {
                    Thread.sleep(Q);
                } catch (InterruptedException e2) {
                }
            }
            this.c.a(this.e, this.f);
            if (ayug.g()) {
                g(9);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void d(int i2) {
        this.k = i2;
        this.l = 0;
        if (!ayug.c()) {
            a(0, true, true, true, true);
        }
    }

    public void a(int i2) {
        if (i2 >= 0) {
            this.p = a(xjo.CONTACT);
            this.n = this.d.getResources().getQuantityString(R.plurals.people_fsa_progress_notification_format_for_contacts_sync, i2, new Object[]{Integer.valueOf(i2)});
            this.m = this.d.getResources().getString(this.q, new Object[]{this.n});
            if (this.g) {
                i2 += i2;
            }
            d(i2);
        }
    }

    public final void e(int i2) {
        if (i2 > 0) {
            if (ayug.c() && this.l == 0) {
                a(0, true, true, true, true);
            }
            a(i2, false, false, false, false);
        }
    }

    public final void b(int i2, boolean z) {
        int i3;
        this.p = xkm.UNKNOWN_STAGE;
        if (!z) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        this.u = i3;
        this.b.a(ayug.a.a().E());
        this.b.b(false);
        a(i2, z);
    }

    public static boolean f() {
        xip.a();
        return Boolean.valueOf(ayrj.a.a().ad()).booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = this.k;
        if (i3 > 0) {
            int i4 = this.l + i2;
            this.l = i4;
            if (i4 > i3) {
                xdt.b(this.a, "Current progress %d exceeds max progress %d", Integer.valueOf(i4), Integer.valueOf(this.k));
                this.l = this.k;
            }
            if (z) {
                je jeVar = this.b;
                jeVar.e(this.m);
                jeVar.d(this.m);
            }
            if (ayug.a.a().J() && z2) {
                this.b.b((CharSequence) this.n);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.o;
            if (!z3) {
                xip.a();
                if (currentTimeMillis - j2 < Long.valueOf(ayrj.a.a().by()).longValue()) {
                    return;
                }
            }
            a(z4);
        }
    }

    public final void g() {
        if (this.l > 0) {
            a(0, false, false, true, false);
        }
    }

    public final void a(xxi xxi) {
        this.b.a(this.k, this.l, false);
        if (ayug.e() && !this.s) {
            xxe.a(this.d, this.h, xxi);
        }
        this.c.a(this.e, this.f, this.b.b());
        if (ayug.i() && !this.s) {
            this.t = System.currentTimeMillis();
        }
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (this.c.c("com.google.android.gms.people.sync.focus.notification.channel_group.id") == null || this.c.c("com.google.android.gms.people.sync.focus.notification.channel_group.id").isBlocked())) {
            Log.i(this.a, "Notifications are disabled for channel group.");
            i2 = 3;
        } else if (Build.VERSION.SDK_INT >= 26 && (this.c.a(this.r) == null || this.c.a(this.r).getImportance() == 0)) {
            Log.i(this.a, "Notifications are disabled for the channel.");
            i2 = 4;
        } else if (Build.VERSION.SDK_INT < 24 || this.c.a.areNotificationsEnabled()) {
            i2 = 5;
        } else {
            Log.i(this.a, "Notifications are disabled for GmsCore.");
            i2 = 2;
        }
        if (i2 == 5) {
            if (!ayug.a.a().R()) {
                a(this);
            } else {
                new qvr(Looper.getMainLooper()).post(new xxh(this, this));
            }
            this.o = System.currentTimeMillis();
        }
        if (ayug.g() && z) {
            g(i2);
        }
    }
}
