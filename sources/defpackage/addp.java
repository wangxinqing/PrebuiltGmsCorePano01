package defpackage;

import android.os.SystemClock;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: addp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addp {
    private static final jjg a = jjg.a();
    private final aorr b;
    private final adhv c;
    private final Random d = new Random();
    private long e;

    public addp(aorr aorr, adhv adhv) {
        this.b = aorr;
        this.c = adhv;
    }

    private final void a(String str, String str2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        int b2 = (int) azqy.a.a().b();
        if (this.c == null) {
            ((anih) ((anih) a.c()).a("addp", "a", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
        } else if (b2 > 0 && this.d.nextInt(b2) == 0) {
            adhv adhv = this.c;
            aucd o = aqna.d.o();
            aucf aucf = (aucf) aqmz.l.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz = (aqmz) aucf.b;
            aqmz.b = 39;
            int i = aqmz.a | 1;
            aqmz.a = i;
            aqmz.c = 29006;
            int i2 = i | 2;
            aqmz.a = i2;
            aqmz.a = i2 | 16;
            aqmz.f = true;
            aqmg a2 = adhv.a("com.google.android.gms", str, elapsedRealtime, str2);
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz2 = (aqmz) aucf.b;
            a2.getClass();
            aqmz2.i = a2;
            aqmz2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqna aqna = (aqna) o.b;
            aqmz aqmz3 = (aqmz) aucf.i();
            aqmz3.getClass();
            aqna.b = aqmz3;
            aqna.a |= 1;
            adhv.a((aqna) o.i());
        }
    }

    private final void c() {
        this.e = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    public final adeb b() {
        String str;
        try {
            c();
            return (adeb) this.b.get(azrk.q(), TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof UserRecoverableAuthException) {
                str = "UserRecoverableAuthException";
            } else {
                str = !(e2.getCause() instanceof IOException) ? "OtherException" : "IOException";
            }
            anih anih = (anih) a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("addp", "b", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception occurred while getting SettingsStore instance.");
            a("BlockingSettingsStore.getSettingsStore", str);
            return null;
        } catch (InterruptedException | TimeoutException e3) {
            anih anih2 = (anih) a.b();
            anih2.a(e3);
            ((anih) anih2.a("addp", "b", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out or interrupted while getting SettingsStore instance.");
            a("BlockingSettingsStore.getSettingsStore", "Timeout");
            return null;
        }
    }

    private final boolean a(int i) {
        if (this.c == null) {
            ((anih) ((anih) a.c()).a("addp", "a", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("UdcClearcutLogger is null.");
            return false;
        } else if (i <= 0 || this.d.nextInt(i) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public final acyb a() {
        String str;
        adeb b2 = b();
        if (b2 == null) {
            return null;
        }
        try {
            c();
            acyb acyb = (acyb) b2.a().get(azrk.q(), TimeUnit.MILLISECONDS);
            if (acyb == null) {
                ((anih) ((anih) a.c()).a("addp", "a", 79, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Empty content. Thus might mean that the settings are not synced down.");
                a("BlockingSettingsStore.retrieveSettings", "NoDataAvailable");
            }
            return acyb;
        } catch (ExecutionException e2) {
            anih anih = (anih) a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("addp", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception occurred while retrieving settings from storage.");
            if (!(e2.getCause() instanceof IOException)) {
                str = "OtherException";
            } else {
                str = "IOException";
            }
            a("BlockingSettingsStore.retrieveSettings", str);
            return null;
        } catch (InterruptedException | TimeoutException e3) {
            anih anih2 = (anih) a.c();
            anih2.a(e3);
            ((anih) anih2.a("addp", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out or interrupted while retrieving settings from storage.");
            a("BlockingSettingsStore.retrieveSettings", "Timeout");
            return null;
        }
    }

    public final acyb a(acyb acyb) {
        String str;
        adeb b2 = b();
        if (b2 == null) {
            return null;
        }
        try {
            c();
            AtomicReference atomicReference = new AtomicReference();
            return (acyb) aopr.a(b2.a.a((amqy) new addy(atomicReference, acyb), (Executor) aoqm.a), (amqy) new addz(atomicReference), (Executor) aoqm.a).get(azrk.q(), TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("addp", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception occurred while saving UDC settings to storage.");
            if (!(e2.getCause() instanceof IOException)) {
                str = "OtherException";
            } else {
                str = "IOException";
            }
            a("BlockingSettingsStore.saveSettings", str);
            return null;
        } catch (InterruptedException | TimeoutException e3) {
            anih anih2 = (anih) a.b();
            anih2.a(e3);
            ((anih) anih2.a("addp", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out or interrupted while saving UDC settings to storage.");
            a("BlockingSettingsStore.saveSettings", "Timeout");
            return null;
        }
    }
}
