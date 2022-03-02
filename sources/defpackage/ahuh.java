package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ahuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahuh extends qvr implements ahsb {
    final /* synthetic */ ahui a;
    private final ReentrantLock b;
    private final Condition c;
    private volatile int d = 0;
    private volatile boolean f = false;
    private final ahuf g = new ahuf();
    private final ahsv h = new ahsv();
    private volatile boolean i = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahuh(ahui ahui, Looper looper) {
        super(looper);
        this.a = ahui;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    private final void a(aqek aqek, ahul ahul) {
        try {
            int b2 = aqek.e(6).b(3);
            if (ahul.a) {
                ajrh ajrh = this.a.i;
                Locale locale = Locale.ENGLISH;
                ahui ahui = this.a;
                Object[] objArr = {Integer.valueOf(b2), ahui.d};
                if (ahui.h != null) {
                    aqek aqek2 = ahul.b;
                    amrl.a((Object) aqek2);
                    ahui ahui2 = this.a;
                    ahui2.h.a(ahui2.d, b2, aqek2);
                }
            } else {
                this.h.a();
                if (this.h.b() > 3) {
                    ajrh ajrh2 = this.a.i;
                    this.i = true;
                }
                String str = ahul.d;
                ajrh ajrh3 = this.a.i;
                Locale locale2 = Locale.ENGLISH;
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(b2);
                if (str == null) {
                    str = "none";
                }
                objArr2[1] = str;
                ahui ahui3 = this.a;
                ahui3.a(aqek, ahul, b2, ahui3.d);
            }
            this.b.lock();
            try {
                this.d--;
                b();
                this.c.signalAll();
            } finally {
                this.b.unlock();
            }
        } catch (Throwable th) {
            this.b.lock();
            this.d--;
            b();
            this.c.signalAll();
            throw th;
        } finally {
            this.b.unlock();
        }
    }

    private final boolean b() {
        if (this.d != 0 || !this.f) {
            return false;
        }
        sendEmptyMessage(3);
        return true;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        boolean z = false;
        if (i2 == 1) {
            Pair pair = (Pair) message.obj;
            aqek aqek = (aqek) pair.first;
            aqek aqek2 = (aqek) pair.second;
            ahui.a(aqek, aqek2, this.a.d);
            if (this.i || this.a.c) {
                String str = !this.i ? "Interrupted by client." : "Too many server errors.";
                a(aqek, new ahul((aqek) null, str.length() == 0 ? new String("Will not send to MASF: ") : "Will not send to MASF: ".concat(str)));
                return;
            }
            ajrh ajrh = this.a.i;
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {Integer.valueOf(aqek.c()), Integer.valueOf(aqek2.b(3)), Long.valueOf(SystemClock.uptimeMillis())};
            ahtu ahtu = this.a.b;
            if (ahtu.a != null) {
                atih a2 = ahtu.a("g:loc/uil", aqek);
                synchronized (ahtu.c) {
                    amrl.b(!ahtu.c.containsKey(a2), (Object) "Duplicated request.");
                    ahtu.c.put(a2, aiba.a(aqek, this));
                }
                ahtu.a.a(a2);
                return;
            }
            a(aqek, new ahul((aqek) null, "Can not send to MASF."));
        } else if (i2 == 2) {
            Pair pair2 = (Pair) message.obj;
            aqek aqek3 = (aqek) pair2.first;
            ahul ahul = (ahul) pair2.second;
            if (this.a.d != null) {
                z = true;
            }
            amrl.b(z, (Object) "session ID should not be null in asynchronized mode.");
            a(aqek3, ahul);
        } else if (i2 != 3) {
            ajrh ajrh2 = this.a.i;
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(38);
            sb.append("Message with unexpected tag");
            sb.append(i3);
            sb.toString();
        } else {
            if (this.d == 0) {
                z = true;
            }
            amrl.b(z, (Object) "pending requests are not 0 before quiting.");
            if (this.a.e != null) {
                this.a.e.a(this.a.k);
                this.a.e.c();
            }
            ahss ahss = this.a.h;
            if (ahss != null) {
                ahss.k();
            }
            Looper looper = getLooper();
            ajrh ajrh3 = this.a.i;
            String.valueOf(looper.getThread().getName()).concat(" terminated.");
            looper.quit();
        }
    }

    public final synchronized void a() {
        this.f = true;
        this.b.lock();
        try {
            if (!b()) {
                ajrh ajrh = this.a.i;
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = Integer.valueOf(this.d);
            }
        } finally {
            this.b.unlock();
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        amrl.b(sendMessageAtFrontOfQueue(Message.obtain(this, 2, new Pair(obj, obj2))), (Object) "There is pending result before handler thread exits.");
    }

    public final synchronized boolean a(aqek aqek, aqek aqek2, boolean z) {
        ReentrantLock reentrantLock;
        this.b.lock();
        while (!this.f) {
            try {
                if (!this.i) {
                    if (this.d >= 20) {
                        if (!z) {
                            ajrh ajrh = this.a.i;
                            Locale locale = Locale.ENGLISH;
                            new Object[1][0] = Integer.valueOf(aqek2.b(3));
                            reentrantLock = this.b;
                            break;
                        }
                        ajrh ajrh2 = this.a.i;
                        Locale locale2 = Locale.ENGLISH;
                        new Object[1][0] = Integer.valueOf(this.d);
                        this.c.await();
                    } else {
                        Message obtain = Message.obtain(this, 1, new Pair(aqek, aqek2));
                        long a2 = this.g.a();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        ajrh ajrh3 = this.a.i;
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("upTimeNow=");
                        sb.append(uptimeMillis);
                        sb.append(" scheduledUpTimeMillis=");
                        sb.append(a2);
                        sb.toString();
                        boolean sendMessageAtTime = this.a.f.sendMessageAtTime(obtain, a2);
                        if (sendMessageAtTime) {
                            this.d++;
                            this.g.b();
                        }
                        this.b.unlock();
                        return sendMessageAtTime;
                    }
                } else {
                    ajrh ajrh4 = this.a.i;
                    reentrantLock = this.b;
                    break;
                }
            } catch (InterruptedException e) {
                reentrantLock = this.b;
            } catch (Throwable th) {
                this.b.unlock();
                throw th;
            }
        }
        ajrh ajrh5 = this.a.i;
        reentrantLock = this.b;
        reentrantLock.unlock();
        return false;
    }
}
