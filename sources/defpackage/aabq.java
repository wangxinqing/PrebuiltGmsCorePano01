package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: aabq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabq {
    public final nxc a;
    public final nxf b;
    public final boolean c;
    public final long d;
    public long e;
    public boolean f;
    public long g;
    public int h;
    public int i;
    public nwi j;
    public boolean k;
    public volatile int l;
    public final nwq m;
    public final qxx n;
    public final int o;
    public boolean p;
    private final anfm q;
    private final Set r;
    private Set s;

    private aabq(aabq aabq, long j2) {
        this(aabq.n, aabq.o, aabq.a, j2);
        this.h = aabq.h;
        this.e = aabq.e;
        this.f = aabq.f;
        this.j = aabq.j;
        this.i = aabq.i;
        if (axbn.a.a().b()) {
            this.g = aabq.g;
        }
    }

    public static aabq a(aabq aabq, long j2) {
        return new aabq(aabq, j2);
    }

    public final void a(boolean z) {
        int i2 = this.o;
        if (i2 == 0 || i2 == 2) {
            this.p = z;
        }
    }

    public final synchronized Set b() {
        return Collections.unmodifiableSet(new ob((Collection) this.r));
    }

    public final synchronized void c() {
        if (this.s.isEmpty() && !this.r.isEmpty()) {
            this.s = Collections.unmodifiableSet(new ob((Collection) this.r));
            this.r.clear();
        }
    }

    public final synchronized Set d() {
        return this.s;
    }

    public final String e() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aabq) {
            return this.a.equals(((aabq) obj).a);
        }
        return false;
    }

    public final ComponentName f() {
        nxc nxc = this.a;
        return new ComponentName(nxc.b, nxc.c);
    }

    public final String g() {
        return this.a.c;
    }

    public final long h() {
        return ((Long) this.q.a()).longValue() + this.d;
    }

    public final int hashCode() {
        nxc nxc = this.a;
        int i2 = nxc.S;
        if (i2 != 0) {
            return i2;
        }
        int a2 = aueh.a.a((Object) nxc).a(nxc);
        nxc.S = a2;
        return a2;
    }

    public final long i() {
        return ((Long) this.q.b()).longValue() + this.d;
    }

    public final ntx j() {
        nxc nxc = this.a;
        return ntx.a(nxc.b, (int) nxc.e);
    }

    @Deprecated
    public final int k() {
        int a2 = nwh.a(this.j.b);
        int i2 = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 != 2) {
                if (i3 == 3) {
                    return 4;
                }
                if (i3 != 4) {
                    return i3 != 5 ? 0 : 16;
                }
                return 8;
            }
        }
        return i2;
    }

    public final int l() {
        try {
            return Integer.parseInt(this.j.c);
        } catch (NumberFormatException e2) {
            return 0;
        }
    }

    public final boolean m() {
        return !this.k;
    }

    public final boolean n() {
        return this.o == 1 && !this.k;
    }

    public final boolean o() {
        return this.a.b.equals("com.google.android.gms");
    }

    public final boolean p() {
        return this.b.b == 2;
    }

    public final boolean q() {
        return this.b.b == 3;
    }

    public final qyi r() {
        qyh qyh = new qyh();
        qyh.c = this.a.b;
        qyh.d = g();
        nxc nxc = this.a;
        qyh.e = nxc.d;
        qyh.b = nxc.e;
        qyh.a = k();
        return qyh.a();
    }

    public final qyl s() {
        qyk qyk = new qyk();
        qyk.a((int) this.a.e);
        qyk.b(f().getPackageName());
        qyk.a(f().getClassName());
        qyk.c(e());
        return qyk.a();
    }

    public final void t() {
        this.f = false;
    }

    public static aabq a(qxx qxx, ComponentName componentName, long j2, int i2) {
        int i3;
        if (qxx instanceof qxg) {
            i3 = 0;
        } else if (qxx instanceof qxj) {
            i3 = 1;
        } else if (qxx instanceof qwb) {
            i3 = 2;
        } else {
            throw new IllegalArgumentException("Unknown task instance.");
        }
        aucd o2 = nxc.f.o();
        String packageName = componentName.getPackageName();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nxc nxc = (nxc) o2.b;
        packageName.getClass();
        nxc.a = 1 | nxc.a;
        nxc.b = packageName;
        String className = componentName.getClassName();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nxc nxc2 = (nxc) o2.b;
        className.getClass();
        int i4 = 2 | nxc2.a;
        nxc2.a = i4;
        nxc2.c = className;
        String str = qxx.g;
        str.getClass();
        int i5 = i4 | 4;
        nxc2.a = i5;
        nxc2.d = str;
        nxc2.a = i5 | 8;
        nxc2.e = (long) i2;
        return new aabq(qxx, i3, (nxc) o2.i(), j2);
    }

    public final String toString() {
        String str;
        CharSequence charSequence;
        String str2;
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = (-(elapsedRealtime - this.d)) / 1000;
        long j3 = this.g;
        String str4 = "N/A";
        if (j3 != 0) {
            StringBuilder sb = new StringBuilder(21);
            sb.append((-(currentTimeMillis - j3)) / 1000);
            sb.append("s");
            str = sb.toString();
        } else {
            str = str4;
        }
        int i2 = this.i;
        if (i2 != -1) {
            str4 = Integer.toString(i2);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[13];
        objArr[0] = f().flattenToShortString();
        objArr[1] = Long.valueOf(this.a.e);
        objArr[2] = JSONObject.quote(this.n.g);
        if (p()) {
            long a2 = a(elapsedRealtime);
            long i3 = (i() - elapsedRealtime) / 1000;
            if (this.n instanceof qxj) {
                int a3 = nwh.a(this.j.b);
                if (a3 != 0 && a3 == 5) {
                    charSequence = ",";
                } else {
                    qxj qxj = (qxj) this.n;
                    charSequence = ",";
                    str2 = String.format(Locale.US, "window{period=%ds,flex=%ds,earliest=%ds,latest=%ds}", new Object[]{Long.valueOf(qxj.a), Long.valueOf(qxj.b), Long.valueOf(a2), Long.valueOf(i3)});
                }
            } else {
                charSequence = ",";
            }
            str2 = String.format(Locale.US, "window{start=%ds,end=%ds,earliest=%ds,latest=%ds}", new Object[]{Long.valueOf(((Long) this.q.a()).longValue() / 1000), Long.valueOf(((Long) this.q.b()).longValue() / 1000), Long.valueOf(a2), Long.valueOf(i3)});
        } else {
            charSequence = ",";
            if (this.o == 2) {
                Set<qvz> set = ((qwb) this.n).a;
                ArrayList arrayList = new ArrayList(set.size());
                for (qvz qvz : set) {
                    int i4 = qvz.b;
                    String valueOf = String.valueOf(qvz.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 14);
                    sb2.append(i4);
                    sb2.append("|<");
                    sb2.append(valueOf);
                    sb2.append(">");
                    arrayList.add(sb2.toString());
                }
                Set<Uri> b2 = b();
                ArrayList arrayList2 = new ArrayList(b2.size());
                for (Uri valueOf2 : b2) {
                    String valueOf3 = String.valueOf(valueOf2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 2);
                    sb3.append("<");
                    sb3.append(valueOf3);
                    sb3.append(">");
                    arrayList2.add(sb3.toString());
                }
                String join = TextUtils.join(charSequence, arrayList);
                String join2 = TextUtils.join(charSequence, arrayList2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(join).length() + 30 + String.valueOf(join2).length());
                sb4.append("uris{observed=[");
                sb4.append(join);
                sb4.append("] triggered=[");
                sb4.append(join2);
                sb4.append("]}");
                str2 = sb4.toString();
            } else {
                str2 = "unknown{}";
            }
        }
        objArr[3] = str2;
        ArrayList arrayList3 = new ArrayList();
        int i5 = this.n.n;
        if (i5 == 0) {
            arrayList3.add("NET_CONNECTED");
        } else if (i5 != 1) {
            arrayList3.add("NET_ANY");
        } else {
            arrayList3.add("NET_UNMETERED");
        }
        if (this.n.p == 1) {
            arrayList3.add("CHARGING");
        }
        if (this.n.a(qxr.a) == 1) {
            arrayList3.add("DEVICE_IDLE");
        }
        Set set2 = this.n.k;
        if (set2 != null && !set2.isEmpty()) {
            String valueOf4 = String.valueOf(TextUtils.join("|", this.n.k));
            arrayList3.add(valueOf4.length() == 0 ? new String("REACHABILITY_URIS:") : "REACHABILITY_URIS:".concat(valueOf4));
        }
        objArr[4] = TextUtils.join(charSequence, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        if (this.f) {
            arrayList4.add("PERSISTED");
        }
        if (this.o == 1) {
            arrayList4.add("RECURRING");
        }
        objArr[5] = TextUtils.join(charSequence, arrayList4);
        objArr[6] = Long.valueOf(j2);
        objArr[7] = str;
        objArr[8] = str4;
        objArr[9] = aabp.a[this.l];
        objArr[10] = Integer.valueOf(this.h);
        int a4 = nwh.a(this.j.b);
        if (a4 == 0) {
            a4 = 1;
        }
        if (a4 != 1) {
            str3 = a4 != 2 ? a4 != 3 ? a4 != 4 ? a4 != 5 ? "GMS_TASK_SCHEDULER" : "FIREBASE_JOB_DISPATCHER" : "MANCHEGO_GCM" : "LONGHORN_GCM" : "DEBUG_JOB";
        } else {
            str3 = "SOURCE_UNKNOWN";
        }
        objArr[11] = str3;
        objArr[12] = this.j.c;
        return String.format(locale, "%s{u=%d tag=%s trigger=%s requirements=[%s] attributes=[%s] scheduled=%ds last_run=%s jid=%s status=%s retries=%d client_lib=%s-%s}", objArr);
    }

    private aabq(qxx qxx, int i2, nxc nxc, long j2) {
        nxf nxf;
        this.i = -1;
        boolean z = false;
        this.k = false;
        this.r = new ob();
        this.s = anfv.a;
        this.p = false;
        this.n = qxx;
        this.o = i2;
        this.a = nxc;
        this.d = j2;
        this.l = 0;
        aucd o2 = nwq.i.o();
        int a2 = aadn.a(qxx.n);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq = (nwq) o2.b;
        nwq.c = a2 - 1;
        nwq.a |= 8;
        int a3 = aadn.a(qxx.o);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq2 = (nwq) o2.b;
        nwq2.e = a3 - 1;
        nwq2.a |= 32;
        int b2 = aadn.b(qxx.p);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq3 = (nwq) o2.b;
        nwq3.d = b2 - 1;
        nwq3.a |= 16;
        int b3 = aadn.b(qxx.q);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq4 = (nwq) o2.b;
        nwq4.f = b3 - 1;
        nwq4.a |= 64;
        int c2 = aadn.c(qxx.a(qxr.a));
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq5 = (nwq) o2.b;
        nwq5.g = c2 - 1;
        nwq5.a |= 128;
        int c3 = aadn.c(qxx.b(qxr.a));
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwq nwq6 = (nwq) o2.b;
        nwq6.h = c3 - 1;
        nwq6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        for (Uri uri : qxx.k) {
            o2.h(uri.toString());
        }
        this.m = (nwq) o2.i();
        if (i2 == 0) {
            qxg qxg = (qxg) qxx;
            nxf = aadn.a(qxg.a, qxg.b);
        } else if (i2 != 1) {
            aucd o3 = nws.b.o();
            for (qvz qvz : ((qwb) qxx).a) {
                aucd o4 = nwr.d.o();
                String uri2 = qvz.a.toString();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                nwr nwr = (nwr) o4.b;
                uri2.getClass();
                nwr.a |= 1;
                nwr.b = uri2;
                boolean a4 = qvz.a();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                nwr nwr2 = (nwr) o4.b;
                nwr2.a |= 2;
                nwr2.c = a4;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                nws nws = (nws) o3.b;
                nwr nwr3 = (nwr) o4.i();
                nwr3.getClass();
                nws.a();
                nws.a.add(nwr3);
            }
            aucd o5 = nxf.e.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            nxf nxf2 = (nxf) o5.b;
            nxf2.d = 3;
            nxf2.a |= 1;
            nws nws2 = (nws) o3.i();
            nws2.getClass();
            nxf2.c = nws2;
            nxf2.b = 3;
            nxf = (nxf) o5.i();
        } else {
            qxj qxj = (qxj) qxx;
            long j3 = qxj.a;
            nxf = aadn.a(j3 - qxj.b, j3);
        }
        this.b = nxf;
        this.f = qxx.j;
        this.e = -1;
        this.j = nwi.d;
        this.q = aabs.a(qxx);
        if (i2 == 0 && ((qxg) qxx).b <= 1) {
            z = true;
        }
        this.c = z;
    }

    /* access modifiers changed from: package-private */
    public final long a(long j2) {
        return (h() - j2) / 1000;
    }

    public final synchronized void a(Uri uri) {
        this.r.add(uri);
    }

    public final synchronized void a(Collection collection) {
        this.r.addAll(collection);
    }

    public final boolean a() {
        int a2 = nwh.a(this.j.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 != 1) {
            return i2 != 3 ? i2 != 4 ? i2 == 5 : (this.j.a & 2) != 0 : l() >= 10400000;
        }
        return true;
    }
}
