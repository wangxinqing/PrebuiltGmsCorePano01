package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: adkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkv {
    public static final adrh a = new adrh("control.event.pending_events");
    public static final adqz b = new adku();
    public final adrn c = ((adrn) adrn.a.b());
    public final Object d = new Object();
    public final Deque e = new ArrayDeque((Collection) this.c.b(a));
    private final Context f;

    public adkv(Context context) {
        this.f = context;
    }

    public final void a(int i) {
        amzy amzy;
        String str;
        boolean z;
        int i2;
        String channelId;
        int i3 = i;
        synchronized (this.d) {
            this.e.add(Integer.valueOf(i));
            this.c.a(a.b(amzy.a((Collection) this.e)));
        }
        if (i3 == 1) {
            adkt adkt = (adkt) adkt.e.b();
            adkt.g();
            adkt.g.a(adkt.c);
            adlc adlc = (adlc) adlc.a.b();
            adlc.a();
            adlc.d();
            ((adky) adky.a.b()).a();
            adla adla = (adla) adla.h.b();
            if (!adla.g()) {
                if (!((String) adla.k.b(adla.b)).isEmpty() && ((Integer) adla.k.b(adla.e)).intValue() == 0) {
                    adla.a.c("Detected no update status with pending OTA. Reset.", new Object[0]);
                    adla.a();
                    adla.c(!amrk.a((String) adke.d.a()));
                } else if (!((String) adla.k.b(adla.b)).isEmpty() && adla.h() && !adla.l.e()) {
                    try {
                        ((adkt) adkt.e.b()).a(ReceiverIntentOperation.b(adla.j));
                    } catch (IOException e2) {
                        adla.a.d("Unable to prepare resume on reboot.", e2, new Object[0]);
                    }
                }
            }
            if (ayor.b()) {
                adkr adkr = (adkr) adkr.b.b();
                adkr.c();
                adkr.b();
            }
        } else if (i3 == 2) {
            ((adky) adky.a.b()).a();
            ((adla) adla.h.b()).g();
            if (ayor.b()) {
                adkr adkr2 = (adkr) adkr.b.b();
                adkr2.c();
                adkr2.c.execute(new adkp(adkr2));
            }
            ((adlc) adlc.a.b()).d();
        } else if (i3 == 5) {
            ((adkt) adkt.e.b()).g.a(adkt.c.b(Long.valueOf(SystemClock.elapsedRealtime())));
        } else if (i3 == 6) {
            adla adla2 = (adla) adla.h.b();
            if (((Long) adla2.k.b(adla.c)).longValue() == -1) {
                adla2.k.a(adla.c.b(Long.valueOf(System.currentTimeMillis())));
            }
        } else if (i3 == 7) {
            ((adkt) adkt.e.b()).g.a(adkt.c);
        } else if (i3 == 10) {
            ((adla) adla.h.b()).g();
        } else if (i3 == 12) {
            adkt adkt2 = (adkt) adkt.e.b();
            adkt2.g.a(adkt.d.b(Long.valueOf(adkt2.d())));
        } else if (i3 != 112) {
            if (i3 == 100) {
                adla adla3 = (adla) adla.h.b();
                try {
                    adla3.b(false);
                } catch (IOException e3) {
                    adla.a.e("Unable to handle install night.", e3, new Object[0]);
                }
                int d2 = jhg.d(adla3.j, "com.google.android.gms.update.OtaSuggestionActivity");
                if (ayps.a.a().a()) {
                    if (!((Integer) adla3.k.b(adla.e)).equals(0) && d2 != 1) {
                        jhg.a(adla3.j, "com.google.android.gms.update.OtaSuggestionActivity", true);
                    } else if (((Integer) adla3.k.b(adla.e)).equals(0) && d2 == 1) {
                        jhg.a(adla3.j, "com.google.android.gms.update.OtaSuggestionActivity", false);
                    }
                } else if (d2 == 1) {
                    jhg.a(adla3.j, "com.google.android.gms.update.OtaSuggestionActivity", false);
                }
                ((adlc) adlc.a.b()).c();
            } else if (i3 == 101) {
                adlc adlc2 = (adlc) adlc.a.b();
                SystemUpdateStatus d3 = ((adla) adla.h.b()).d();
                aucd o = anqi.d.o();
                int i4 = d3.d;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anqi anqi = (anqi) o.b;
                int i5 = anqi.a | 2;
                anqi.a = i5;
                anqi.b = i4;
                int i6 = d3.e;
                anqi.a = i5 | 4;
                anqi.c = i6;
                anqi anqi2 = (anqi) o.i();
                adns adns = adlc2.b;
                aucd a2 = adns.a(4);
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                anqb anqb = (anqb) a2.b;
                anqb anqb2 = anqb.l;
                anqi2.getClass();
                anqb.g = anqi2;
                anqb.a |= 32;
                adns.a((anqb) a2.i());
            }
        } else if (ayor.b()) {
            ((adkr) adkr.b.b()).b();
        } else {
            ((adky) adky.a.b()).a();
            ((adla) adla.h.b()).g();
        }
        Context context = this.f;
        context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationEventIntentOperation", "com.google.android.gms.update.INSTALLATION_EVENT"));
        adli adli = (adli) adli.d.b();
        SystemUpdateStatus d4 = ((adla) adla.h.b()).d();
        if (((Integer) adli.g.b(adli.c)).intValue() == d4.c) {
            amzy = (amzy) adli.g.b(adli.b);
        } else {
            amzy h = amzy.h();
            adli.g.a(adli.c, adli.b);
            amzy = h;
        }
        if (adkf.a(adli.e, d4.n).a != 0) {
            adli.a.a("OTA is managed by policy. No need to show the notification.", new Object[0]);
            adli.a();
        } else if (!d4.r.a) {
            long j = Long.MAX_VALUE;
            switch (d4.c) {
                case 2:
                    if (aypd.a.a().j()) {
                        j = d4.n;
                        break;
                    }
                    break;
                case 263:
                case 274:
                case 775:
                case 1031:
                case 1042:
                case 1298:
                    j = d4.n + ayox.a.a().r();
                    break;
                case 272:
                case 1803:
                    if (!((adla) adla.h.b()).e()) {
                        j = d4.n + ayox.a.a().o();
                        break;
                    }
                    break;
                case 275:
                case 1040:
                case 2315:
                    j = d4.n + ayox.a.a().t();
                    break;
                case 518:
                    j = d4.n + ayox.a.a().s();
                    break;
                case 528:
                    if (!((adla) adla.h.b()).e()) {
                        if (!((Boolean) adke.h.a()).booleanValue()) {
                            j = d4.n + ayox.a.a().u();
                            break;
                        } else {
                            j = adjw.c() + ayox.a.a().v();
                            break;
                        }
                    }
                    break;
                case 1043:
                    j = d4.n + ayox.a.a().p();
                    break;
                case 1296:
                    j = d4.n + aypd.a.a().g();
                    break;
                case 1547:
                    j = d4.n + ayox.a.a().q();
                    break;
                case 2059:
                    j = d4.n + ayox.a.a().w();
                    break;
            }
            if (j <= System.currentTimeMillis()) {
                long currentTimeMillis = System.currentTimeMillis();
                switch (d4.c) {
                    case 2:
                        str = "0";
                        break;
                    case 263:
                    case 274:
                    case 775:
                    case 1031:
                    case 1042:
                    case 1298:
                        str = aypd.a.a().d();
                        break;
                    case 272:
                    case 1803:
                        str = aypd.a.a().a();
                        break;
                    case 275:
                    case 1040:
                    case 2315:
                        str = aypd.a.a().f();
                        break;
                    case 518:
                        str = aypd.a.a().e();
                        break;
                    case 528:
                        str = aypd.a.a().i();
                        break;
                    case 1043:
                        str = aypd.a.a().b();
                        break;
                    case 1296:
                        str = aypd.a.a().h();
                        break;
                    case 1547:
                        str = aypd.a.a().c();
                        break;
                    case 2059:
                        str = aypd.a.a().k();
                        break;
                    default:
                        throw new IllegalStateException(String.format(Locale.US, "Unable to handle the status: %d.", new Object[]{Integer.valueOf(d4.c)}));
                }
                if (adkh.b.matcher(str).matches()) {
                    z = true;
                } else if (adkh.c.matcher(str).matches()) {
                    Matcher matcher = adkh.c.matcher(str);
                    matcher.find();
                    long parseLong = Long.parseLong(matcher.group(1));
                    long longValue = ((Long) anbs.b((Iterable) amzy, (Object) 0L)).longValue() + parseLong;
                    if (longValue > currentTimeMillis) {
                        adli.a.a("The notification shouldn't be shown or cancelled right now for status 0x%03X at the current moment (%d ms) for update received at %d. Earliest re-notify time is %d. ", Integer.valueOf(d4.c), Long.valueOf(currentTimeMillis), Long.valueOf(d4.n), Long.valueOf(longValue));
                        adli.a(longValue);
                        return;
                    }
                    adli.a(parseLong + currentTimeMillis);
                    z = false;
                } else {
                    adli.a.e("Unable to handle the notification strategy: %s.", str);
                    return;
                }
                adrn adrn = adli.g;
                adrc[] adrcArr = new adrc[2];
                adrcArr[0] = adli.c.b(Integer.valueOf(d4.c));
                adrl adrl = adli.b;
                amzt j2 = amzy.j();
                int i7 = (((long) amzy.size()) > 10 ? 1 : (((long) amzy.size()) == 10 ? 0 : -1));
                Iterable iterable = amzy;
                if (i7 >= 0) {
                    iterable = anbs.b((Iterable) amzy, 1);
                }
                j2.b(iterable);
                j2.c(Long.valueOf(currentTimeMillis));
                adrcArr[1] = adrl.b(j2.a());
                adrn.a(adrcArr);
                adli.f.a(hdg.a(adli.e, !jkr.d() ? R.drawable.notification_system_update_available : R.drawable.quantum_ic_system_update_white_24));
                iwq iwq = adli.f;
                Context context2 = adli.e;
                if (!jkr.a()) {
                    i2 = R.drawable.notification_system_update_download_failure;
                } else {
                    i2 = R.drawable.ic_space_error;
                }
                iwq.a(hdg.a(context2, i2));
                Notification a3 = adli.a(d4, z);
                adlj adlj = adli.h;
                if (jkr.e() && (channelId = a3.getChannelId()) != null && adlj.a.a(channelId) == null) {
                    String string = adlj.b.getString(R.string.system_update_module_name);
                    adjw.i(adlj.b);
                    adlj.a.a(new NotificationChannel(channelId, string, 5));
                }
                adlj.a.a("com.google.android.gms.update.control.NotificationControl", 1, a3);
                return;
            }
            adli.a.a("The notification shouldn't be shown for status 0x%03X at the current moment (%d ms) for update received at %d ms. Earliest show notify time is %d ms.", Integer.valueOf(d4.c), Long.valueOf(System.currentTimeMillis()), Long.valueOf(d4.n), Long.valueOf(j));
            adli.a();
            adli.a(j);
        } else {
            adli.a.a("The activity is running. No need to show the notification.", new Object[0]);
            adli.a();
        }
    }
}
