package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxp {
    static final AtomicInteger a = new AtomicInteger();
    private static final String[] j = {"query", "query_universal", "suggest"};
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public String h;
    public int i = 2;
    private long k;
    private long l;
    private long m;
    private int n;
    private long o;
    private final aucd p;

    public pxp(aolo aolo, int i2) {
        aucd o2 = aojk.C.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojk aojk = (aojk) o2.b;
        aojk.b = aolo.a();
        aojk.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojk aojk2 = (aojk) o2.b;
        aojk2.f = i2 - 2;
        aojk2.a |= 64;
        boolean booleanValue = ((Boolean) ozx.bl.c()).booleanValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojk aojk3 = (aojk) o2.b;
        aojk3.a |= 4194304;
        aojk3.v = booleanValue;
        this.p = o2;
    }

    private final void b(String str, String str2, String str3) {
        int i2 = this.n;
        if (!(i2 == 3 || i2 == 4)) {
            this.i = 24;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd aucd = this.p;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        str2.getClass();
        int i3 = aojk.a | 4;
        aojk.a = i3;
        aojk.c = str2;
        str3.getClass();
        aojk.a = i3 | 16;
        aojk.d = str3;
        String str4 = this.h;
        if (str4 == null) {
            aucd aucd2 = this.p;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aojk aojk3 = (aojk) aucd2.b;
            aojk3.a &= -33;
            aojk3.e = aojk.C.e;
        } else {
            aucd aucd3 = this.p;
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            aojk aojk4 = (aojk) aucd3.b;
            str4.getClass();
            aojk4.a |= 32;
            aojk4.e = str4;
        }
        aucd aucd4 = this.p;
        int i4 = (int) (elapsedRealtime - this.k);
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        aojk aojk5 = (aojk) aucd4.b;
        int i5 = aojk5.a | 65536;
        aojk5.a = i5;
        aojk5.q = i4;
        aojk aojk6 = (aojk) this.p.b;
        int i6 = aojk6.o;
        int i7 = aojk6.q;
        aojk5.a = i5 | 16384;
        aojk5.o = i6 + i7;
        int length = str.length();
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        aojk aojk7 = (aojk) aucd4.b;
        int i8 = aojk7.a | 128;
        aojk7.a = i8;
        aojk7.g = length;
        int i9 = this.b;
        int i10 = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aojk7.a = i10;
        aojk7.h = i9;
        int i11 = this.c;
        int i12 = i10 | 512;
        aojk7.a = i12;
        aojk7.i = i11;
        int i13 = this.d;
        int i14 = i12 | 1024;
        aojk7.a = i14;
        aojk7.j = i13;
        int i15 = this.e;
        int i16 = i14 | 2048;
        aojk7.a = i16;
        aojk7.k = i15;
        boolean z = this.f;
        int i17 = i16 | 16777216;
        aojk7.a = i17;
        aojk7.x = z;
        boolean z2 = this.g;
        aojk7.a = i17 | 33554432;
        aojk7.y = z2;
        aojk7.B = aonf.a(this.i);
        aojk7.a |= 268435456;
        this.n = 4;
    }

    public final void c() {
        boolean z = true;
        if (this.n != 1) {
            z = false;
        }
        iva.b(z);
        this.m = SystemClock.elapsedRealtime();
        this.n = 5;
    }

    public final void d() {
        boolean z;
        if (this.n == 5) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd aucd = this.p;
        int i2 = (int) (elapsedRealtime - this.m);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        aojk.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        aojk.n = i2;
        this.n = 6;
    }

    public final void e() {
        boolean z;
        if (this.n == 6) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd aucd = this.p;
        int i2 = (int) (elapsedRealtime - this.l);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        aojk.a |= 32768;
        aojk.p = i2;
        aucd aucd2 = this.p;
        int i3 = ((aojk) aucd2.b).p;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aojk aojk3 = (aojk) aucd2.b;
        aojk3.a |= 16384;
        aojk3.o = i3;
        this.k = elapsedRealtime;
        this.n = 2;
    }

    public final void f() {
        boolean z;
        if (this.n == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd aucd = this.p;
        int i2 = (int) (elapsedRealtime - this.k);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        aojk.a |= 131072;
        aojk.r = i2;
        this.k = elapsedRealtime;
        this.n = 3;
    }

    public final aojk a(String str, String str2, String str3) {
        b(str, str2, amrk.b(str3));
        Object[] objArr = new Object[13];
        objArr[0] = Integer.valueOf(((aojk) this.p.b).z);
        objArr[1] = Integer.valueOf(((aojk) this.p.b).A);
        String[] strArr = j;
        aolo a2 = aolo.a(((aojk) this.p.b).b);
        if (a2 == null) {
            a2 = aolo.QUERY;
        }
        objArr[2] = strArr[a2.a()];
        objArr[3] = str;
        objArr[4] = Integer.valueOf(((aojk) this.p.b).h);
        objArr[5] = Integer.valueOf(((aojk) this.p.b).i);
        objArr[6] = Integer.valueOf(((aojk) this.p.b).j);
        objArr[7] = Integer.valueOf(((aojk) this.p.b).m);
        objArr[8] = Integer.valueOf(((aojk) this.p.b).n);
        objArr[9] = Integer.valueOf(((aojk) this.p.b).p);
        objArr[10] = Integer.valueOf(((aojk) this.p.b).q);
        objArr[11] = Integer.valueOf(((aojk) this.p.b).r);
        aojk aojk = (aojk) this.p.b;
        objArr[12] = Integer.valueOf(aojk.m + aojk.o + aojk.r);
        oso.b("#%d (%d ms): %s [%s] req/res/sco %d/%d/%d in init:%d + lock_wait:%d + prepBefore:%d + prepAfter:%d + execute:%d = %d ms", objArr);
        return (aojk) this.p.i();
    }

    public final void b() {
        boolean z;
        if (this.n == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aucd aucd = this.p;
        int i2 = (int) (elapsedRealtime - this.k);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        aojk.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        aojk.m = i2;
        this.l = elapsedRealtime;
        this.n = 1;
    }

    public final void a() {
        aucd aucd = this.p;
        int incrementAndGet = a.incrementAndGet();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk = (aojk) aucd.b;
        aojk aojk2 = aojk.C;
        aojk.a |= 67108864;
        aojk.z = incrementAndGet;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - osf.a);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojk aojk3 = (aojk) aucd.b;
        aojk3.a |= 134217728;
        aojk3.A = elapsedRealtime;
        this.o = System.currentTimeMillis();
        this.k = SystemClock.elapsedRealtime();
        this.n = 0;
    }

    public final void a(Exception exc) {
        if (exc == null) {
            return;
        }
        if (exc instanceof TransactionTooLargeException) {
            this.i = 21;
        } else if (exc instanceof DeadObjectException) {
            this.i = 22;
        } else if (exc instanceof RemoteException) {
            this.i = 23;
        } else {
            this.i = exc instanceof RuntimeException ? 25 : 26;
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        b(str, str2, amrk.b(str3));
        if (bundle != null) {
            aucd aucd = this.p;
            int i2 = (int) (this.o - bundle.getLong("request_timestamp_ms"));
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojk aojk = (aojk) aucd.b;
            aojk aojk2 = aojk.C;
            aojk.a |= 262144;
            aojk.s = i2;
            bundle.putByteArray("IcingQueryStatsLog", ((aojk) this.p.i()).k());
            bundle.putBoolean("should_log_stats", true);
            bundle.putLong("query_task_done_timestamp_ms", System.currentTimeMillis());
        }
    }

    public final void a(otv otv) {
        if (otv != null) {
            aucd aucd = this.p;
            aola aola = otv.b;
            if (aola == null) {
                aola = aola.a;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojk aojk = (aojk) aucd.b;
            aojk aojk2 = aojk.C;
            aola.getClass();
            aojk.u = aola;
            aojk.a |= 2097152;
            aokr aokr = otv.a;
            if (aokr == null) {
                aokr = aokr.a;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojk aojk3 = (aojk) aucd.b;
            aokr.getClass();
            aojk3.w = aokr;
            aojk3.a |= 8388608;
        }
    }

    public final void a(String[] strArr) {
        HashSet<aolm> hashSet = new HashSet<>();
        for (String str : strArr) {
            if ("com.google.android.gms-apps".equals(str)) {
                hashSet.add(aolm.APPS);
            } else if ("com.google.android.gms-contacts_contact_id".equals(str)) {
                hashSet.add(aolm.CONTACTS);
            } else if ("com.google.android.gms-phones_data_id".equals(str)) {
                hashSet.add(aolm.PHONES);
            } else if ("com.google.android.gms-emails_data_id".equals(str)) {
                hashSet.add(aolm.EMAILS);
            } else if ("com.google.android.gms-postals_data_id".equals(str)) {
                hashSet.add(aolm.POSTALS);
            } else if ("com.google.android.gms-sms".equals(str)) {
                hashSet.add(aolm.SMS);
            }
        }
        if (!hashSet.isEmpty()) {
            aucd aucd = this.p;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojk aojk = (aojk) aucd.b;
            aojk aojk2 = aojk.C;
            if (!aojk.l.a()) {
                aojk.l = aucj.a(aojk.l);
            }
            for (aolm a2 : hashSet) {
                aojk.l.d(a2.a());
            }
        }
    }
}
