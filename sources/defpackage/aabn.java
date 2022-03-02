package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: aabn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabn {
    public static final /* synthetic */ int a = 0;
    private static final EnumMap b;
    private static final int c = nxn.values().length;
    private final anfc d = amzh.b(c);
    private final anfc e = amzh.b(c);
    private final Map f = new nz();
    private final long g = SystemClock.elapsedRealtime();
    private final aabl h;
    private final Context i;
    private final Random j;

    static {
        EnumMap enumMap = new EnumMap(nxn.class);
        b = enumMap;
        enumMap.put(nxn.ALARM_MANAGER, nxn.ALARM_MANAGER.name());
        b.put(nxn.CAUSE_UNKNOWN, nxn.CAUSE_UNKNOWN.name());
        b.put(nxn.CLIENT_LIB, nxn.CLIENT_LIB.name());
        b.put(nxn.CONTENT_URI_UPDATED, nxn.CONTENT_URI_UPDATED.name());
        b.put(nxn.DEVICE_CHARGING, nxn.DEVICE_CHARGING.name());
        b.put(nxn.EXECUTION_CALLBACK, nxn.EXECUTION_CALLBACK.name());
        b.put(nxn.GOOGLE_HTTP_CLIENT, nxn.GOOGLE_HTTP_CLIENT.name());
        b.put(nxn.DOZE_MAINTENANCE_WINDOW, nxn.DOZE_MAINTENANCE_WINDOW.name());
        b.put(nxn.DOZE_LIGHT_MAINTENANCE_WINDOW, nxn.DOZE_LIGHT_MAINTENANCE_WINDOW.name());
        b.put(nxn.CLOUD_MESSAGE_RECEIVED, "GCM_DOWNSTREAM");
        b.put(nxn.CLOUD_MESSAGE_SENT, "GCM_UPSTREAM");
        b.put(nxn.NETWORK_CONNECTED, "DEVICE_CONNECTED");
    }

    public aabn(Context context) {
        Random random = new Random();
        this.i = context;
        iva.a((Object) context);
        this.h = new aabl(context);
        this.j = random;
    }

    private final aabm a(nxc nxc) {
        aabm aabm = (aabm) this.f.get(nxc);
        if (aabm != null) {
            return aabm;
        }
        aabm aabm2 = new aabm();
        this.f.put(nxc, aabm2);
        return aabm2;
    }

    public final synchronized void b(nxn nxn) {
        this.e.add(nxn);
    }

    public final synchronized void c(nxn nxn) {
        this.d.add(nxn);
    }

    public static String a(nxn nxn) {
        return (String) b.get(nxn);
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return (SystemClock.elapsedRealtime() - this.g) / 1000;
    }

    public final synchronized void a(aabq aabq, int i2) {
        aabm a2 = a(aabq.a);
        if (i2 == 0) {
            a2.a++;
        } else if (i2 == 1) {
            a2.b++;
        } else if (i2 == 2) {
            a2.c++;
        } else if (i2 == 3) {
            a2.d++;
        } else if (i2 == 4) {
            a2.e++;
        }
    }

    public final synchronized void a(aabq aabq, int i2, int i3) {
        aabm a2 = a(aabq.a);
        a2.g += (long) i2;
        a2.f += (long) i3;
    }

    public final synchronized void a(aabq aabq, long j2) {
        a(aabq.a).h = j2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(PrintWriter printWriter) {
        long a2 = a();
        StringBuilder sb = new StringBuilder(51);
        sb.append("\nRunning for the last ");
        sb.append(a2);
        sb.append(" seconds.");
        printWriter.println(sb.toString());
        int i2 = 0;
        for (nxn nxn : nxn.values()) {
            int a3 = this.d.a(nxn);
            i2 += a3;
            String str = (String) b.get(nxn);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
            sb2.append(str);
            sb2.append(" ");
            sb2.append(a3);
            printWriter.println(sb2.toString());
        }
        int i3 = 0;
        for (nxn nxn2 : nxn.values()) {
            int a4 = this.e.a(nxn2);
            i3 += a4;
            String str2 = (String) b.get(nxn2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 26);
            sb3.append("TOTAL_WAKEUPS_");
            sb3.append(str2);
            sb3.append(" ");
            sb3.append(a4);
            printWriter.println(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(28);
        sb4.append("TOTAL_EXECUTIONS ");
        sb4.append(i2);
        printWriter.println(sb4.toString());
        StringBuilder sb5 = new StringBuilder(25);
        sb5.append("TOTAL_WAKEUPS ");
        sb5.append(i3);
        printWriter.println(sb5.toString());
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(PrintWriter printWriter, List list) {
        printWriter.println("Past executions:\n");
        HashMap hashMap = new HashMap();
        long j2 = 0;
        for (nxc nxc : this.f.keySet()) {
            ComponentName componentName = new ComponentName(nxc.b, nxc.c);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (componentName.flattenToShortString().contains((String) it.next())) {
                    int b2 = aoog.b(((aabm) this.f.get(nxc)).f);
                    j2 += (long) b2;
                    hashMap.put(nxc, Integer.valueOf(b2));
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new aabk(hashMap));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nxc nxc2 = (nxc) arrayList.get(i2);
            printWriter.printf("[cost:%d%%] (finished) [%s:%s,u%s]%n", new Object[]{Integer.valueOf(Math.round((((float) ((Integer) hashMap.get(nxc2)).intValue()) * 100.0f) / ((float) j2))), new ComponentName(nxc2.b, nxc2.c).flattenToShortString(), nxc2.d, Long.valueOf(nxc2.e)});
            a(printWriter, nxc2);
            printWriter.println();
        }
    }

    public final synchronized void a(PrintWriter printWriter, nxc nxc) {
        aabm aabm = (aabm) this.f.get(nxc);
        if (aabm == null) {
            printWriter.println("No stats recorded.");
            return;
        }
        printWriter.append("successes: ").print(aabm.a);
        printWriter.append(" reschedules: ").print(aabm.b);
        printWriter.append(" failures: ").print(aabm.c);
        printWriter.append(" timeouts: ").print(aabm.d);
        printWriter.append(" invalid_service: ").print(aabm.e);
        printWriter.append(" total_elapsed_millis: ").print(aabm.g);
        printWriter.append(" total_uptime_millis: ").print(aabm.f);
        printWriter.append(" last_exec_start_seconds: ").print(aabm.h);
        printWriter.println();
    }

    public final void a(nxk nxk, aabx aabx, int i2) {
        nxb nxb;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        nxc nxc;
        boolean z8;
        nws nws;
        nws nws2;
        nwr nwr;
        boolean z9;
        aabx aabx2 = aabx;
        if (a(axbo.a.a().c())) {
            if (!axbo.a.a().g()) {
                aabq aabq = aabx2.a;
                aucd o = nxb.l.o();
                boolean z10 = aabq.f;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nxb nxb2 = (nxb) o.b;
                int i3 = nxb2.a | 2;
                nxb2.a = i3;
                nxb2.c = z10;
                if (aabq.o == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i4 = i3 | 4;
                nxb2.a = i4;
                nxb2.d = z9;
                nxc nxc2 = aabq.a;
                nxc2.getClass();
                nxb2.b = nxc2;
                int i5 = i4 | 1;
                nxb2.a = i5;
                qxx qxx = aabq.n;
                boolean z11 = qxx.h;
                nxb2.a = i5 | 8;
                nxb2.e = z11;
                nwq a2 = aadn.a(qxx);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nxb nxb3 = (nxb) o.b;
                a2.getClass();
                nxb3.f = a2;
                int i6 = nxb3.a | 16;
                nxb3.a = i6;
                nwi nwi = aabq.j;
                nwi.getClass();
                nxb3.h = nwi;
                int i7 = i6 | 64;
                nxb3.a = i7;
                nxf nxf = aabq.b;
                nxf.getClass();
                nxb3.g = nxf;
                nxb3.a = i7 | 32;
                nwz a3 = aadn.a(aabq);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nxb nxb4 = (nxb) o.b;
                a3.getClass();
                nxb4.i = a3;
                nxb4.a |= 128;
                if (axmd.a.a().m() && !aabq.o()) {
                    nxc nxc3 = ((nxb) o.b).b;
                    if (nxc3 == null) {
                        nxc3 = nxc.f;
                    }
                    aucd aucd = (aucd) nxc3.c(5);
                    aucd.a((aucj) nxc3);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxc nxc4 = (nxc) aucd.b;
                    nxc4.a &= -5;
                    nxc4.d = nxc.f.d;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxc nxc5 = (nxc) aucd.b;
                    nxc5.a &= -2;
                    nxc5.b = nxc.f.b;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxc nxc6 = (nxc) aucd.b;
                    nxc6.a &= -3;
                    nxc6.c = nxc.f.c;
                    nxc nxc7 = (nxc) aucd.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    nxb nxb5 = (nxb) o.b;
                    nxc7.getClass();
                    nxb5.b = nxc7;
                    nxb5.a |= 1;
                }
                nxb = (nxb) o.i();
            } else {
                aabq aabq2 = aabx2.a;
                nxc nxc8 = aabq2.a;
                if (nxc8 == null) {
                    nxc = nxc.f;
                } else {
                    aucd aucd2 = (aucd) nxc8.c(5);
                    aucd2.a((aucj) nxc8);
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    nxc nxc9 = (nxc) aucd2.b;
                    nxc9.a &= -5;
                    nxc9.d = nxc.f.d;
                    if (!hya.a(this.i).b(nxc8.b)) {
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        nxc nxc10 = (nxc) aucd2.b;
                        nxc10.a &= -2;
                        nxc10.b = nxc.f.b;
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        nxc nxc11 = (nxc) aucd2.b;
                        nxc11.a &= -3;
                        nxc11.c = nxc.f.c;
                    }
                    nxc = (nxc) aucd2.i();
                }
                aucd o2 = nxb.l.o();
                boolean z12 = aabq2.f;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                nxb nxb6 = (nxb) o2.b;
                int i8 = nxb6.a | 2;
                nxb6.a = i8;
                nxb6.c = z12;
                if (aabq2.o == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i9 = i8 | 4;
                nxb6.a = i9;
                nxb6.d = z8;
                nxc.getClass();
                nxb6.b = nxc;
                int i10 = i9 | 1;
                nxb6.a = i10;
                qxx qxx2 = aabq2.n;
                boolean z13 = qxx2.h;
                nxb6.a = i10 | 8;
                nxb6.e = z13;
                nwq a4 = aadn.a(qxx2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                nxb nxb7 = (nxb) o2.b;
                a4.getClass();
                nxb7.f = a4;
                int i11 = nxb7.a | 16;
                nxb7.a = i11;
                nwi nwi2 = aabq2.j;
                nwi2.getClass();
                nxb7.h = nwi2;
                nxb7.a = i11 | 64;
                nwz a5 = aadn.a(aabq2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                nxb nxb8 = (nxb) o2.b;
                a5.getClass();
                nxb8.i = a5;
                int i12 = nxb8.a | 128;
                nxb8.a = i12;
                if (aabq2.o == 1) {
                    qxj qxj = (qxj) aabq2.n;
                    long j2 = qxj.a;
                    int i13 = i12 | 512;
                    nxb8.a = i13;
                    nxb8.j = j2;
                    long j3 = qxj.b;
                    nxb8.a = i13 | 1024;
                    nxb8.k = j3;
                }
                if (aabq2.q()) {
                    nxf nxf2 = aabq2.b;
                    if (nxf2.b == 3) {
                        nws = (nws) nxf2.c;
                    } else {
                        nws = nws.b;
                    }
                    if (nws != null) {
                        aucx aucx = nws.a;
                        aucd aucd3 = (aucd) nws.c(5);
                        aucd3.a((aucj) nws);
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        nws nws3 = nws.b;
                        ((nws) aucd3.b).a = aucj.s();
                        int size = aucx.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            nwr nwr2 = (nwr) aucx.get(i14);
                            if (nwr2 == null) {
                                nwr = nwr.d;
                            } else {
                                String authority = Uri.parse(nwr2.b).getAuthority();
                                if (authority == null) {
                                    Log.e("NetworkScheduler.Stats", "Task trigger contains malformed content URI");
                                    nwr = nwr.d;
                                } else {
                                    ProviderInfo resolveContentProvider = this.i.getPackageManager().resolveContentProvider(authority, 0);
                                    if (resolveContentProvider == null || resolveContentProvider.packageName == null) {
                                        nwr = nwr.d;
                                    } else {
                                        String builder = hya.a(this.i).b(resolveContentProvider.packageName) ? new Uri.Builder().authority(authority).scheme("content").toString() : "";
                                        aucd o3 = nwr.d.o();
                                        if (o3.c) {
                                            o3.c();
                                            o3.c = false;
                                        }
                                        nwr nwr3 = (nwr) o3.b;
                                        builder.getClass();
                                        int i15 = nwr3.a | 1;
                                        nwr3.a = i15;
                                        nwr3.b = builder;
                                        boolean z14 = nwr2.c;
                                        nwr3.a = i15 | 2;
                                        nwr3.c = z14;
                                        nwr = (nwr) o3.i();
                                    }
                                }
                            }
                            if (aucd3.c) {
                                aucd3.c();
                                aucd3.c = false;
                            }
                            nws nws4 = (nws) aucd3.b;
                            nwr.getClass();
                            nws4.a();
                            nws4.a.add(nwr);
                        }
                        nws2 = (nws) aucd3.i();
                    } else {
                        nws2 = nws.b;
                    }
                    aucd aucd4 = (aucd) nxf2.c(5);
                    aucd4.a((aucj) nxf2);
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    nxf nxf3 = (nxf) aucd4.b;
                    nxf nxf4 = nxf.e;
                    nws2.getClass();
                    nxf3.c = nws2;
                    nxf3.b = 3;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    nxb nxb9 = (nxb) o2.b;
                    nxf nxf5 = (nxf) aucd4.i();
                    nxf5.getClass();
                    nxb9.g = nxf5;
                    nxb9.a |= 32;
                } else {
                    nxf nxf6 = aabq2.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    nxb nxb10 = (nxb) o2.b;
                    nxf6.getClass();
                    nxb10.g = nxf6;
                    nxb10.a |= 32;
                }
                nxb = (nxb) o2.i();
            }
            int i16 = aabx2.c;
            aucd o4 = nwv.i.o();
            int i17 = i16 & 1;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            nwv nwv = (nwv) o4.b;
            int i18 = nwv.a | 1;
            nwv.a = i18;
            if (i17 == 0) {
                z = false;
            } else {
                z = true;
            }
            nwv.b = z;
            if ((i16 & 2) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i19 = i18 | 2;
            nwv.a = i19;
            nwv.c = z2;
            if ((i16 & 4) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i20 = i19 | 4;
            nwv.a = i20;
            nwv.d = z3;
            if ((i16 & 8) > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i21 = i20 | 8;
            nwv.a = i21;
            nwv.e = z4;
            if ((i16 & 16) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i22 = i21 | 16;
            nwv.a = i22;
            nwv.f = z5;
            if ((i16 & 32) > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            nwv.a = i22 | 32;
            nwv.g = z6;
            if (axbn.f()) {
                if ((i16 & 64) > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                nwv nwv2 = (nwv) o4.b;
                nwv2.a |= 64;
                nwv2.h = z7;
            }
            nwv nwv3 = (nwv) o4.i();
            aabq aabq3 = aabx2.a;
            aucd o5 = nwx.j.o();
            int i23 = aabx2.i;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            nwx nwx = (nwx) o5.b;
            nwx.e = i23 - 1;
            nwx.a |= 8;
            aubn e2 = aabx.e();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            nwx nwx2 = (nwx) o5.b;
            e2.getClass();
            nwx2.c = e2;
            int i24 = nwx2.a | 2;
            nwx2.a = i24;
            nwx2.f = i2 - 1;
            int i25 = i24 | 16;
            nwx2.a = i25;
            nxb.getClass();
            nwx2.b = nxb;
            nwx2.a = i25 | 1;
            aubn d2 = aabx.d();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            nwx nwx3 = (nwx) o5.b;
            d2.getClass();
            nwx3.d = d2;
            int i26 = nwx3.a | 4;
            nwx3.a = i26;
            nwx3.g = aabx2.b.p;
            int i27 = i26 | 64;
            nwx3.a = i27;
            nwv3.getClass();
            nwx3.h = nwv3;
            nwx3.a = i27 | 128;
            int a6 = (int) aabq3.a(aabx.f());
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            nwx nwx4 = (nwx) o5.b;
            nwx4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            nwx4.i = a6;
            aucd o6 = nxi.e.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            nxi nxi = (nxi) o6.b;
            nxk.getClass();
            nxi.d = nxk;
            nxi.a |= 1;
            nwx nwx5 = (nwx) o5.i();
            nwx5.getClass();
            nxi.c = nwx5;
            nxi.b = 6;
            this.h.a((nxi) o6.i());
        }
    }

    public final void a(nxk nxk, nxa nxa) {
        if (a(axbo.a.a().d())) {
            aucd o = nxi.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nxi nxi = (nxi) o.b;
            nxk.getClass();
            nxi.d = nxk;
            nxi.a |= 1;
            nxa.getClass();
            nxi.c = nxa;
            nxi.b = 5;
            this.h.a((nxi) o.i());
        }
    }

    public final void a(nxk nxk, nxp nxp) {
        if (a(axbo.a.a().h())) {
            aucd o = nxi.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nxi nxi = (nxi) o.b;
            nxk.getClass();
            nxi.d = nxk;
            nxi.a |= 1;
            nxp.getClass();
            nxi.c = nxp;
            nxi.b = 8;
            this.h.a((nxi) o.i());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(double d2) {
        if (axbo.a.a().a()) {
            double nextDouble = this.j.nextDouble();
            double e2 = axbo.a.a().e();
            double nextDouble2 = this.j.nextDouble();
            if (nextDouble >= e2 || nextDouble2 >= d2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
