package com.google.android.location.wearable;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WearableLocationChimeraService extends adze implements jlc, ajrm {
    public final Object f = new Object();
    public Looper g;
    public ajrn h;
    public ou i;
    public ajrp j;
    public iby k;
    public iby l;
    private rom m;
    private jld n;
    private icc o;
    private adyg p;
    private aidf q;
    private adyo r;
    private ajro s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Set w;
    private Set x;
    private adzn y;

    public final rom a() {
        if (this.m == null) {
            this.m = new rom(this);
        }
        return this.m;
    }

    public final icc b() {
        if (this.o == null) {
            ibz ibz = new ibz(this);
            ibz.a(adyr.a);
            this.o = ibz.b();
        }
        this.o.e();
        return this.o;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.f) {
            boolean z = this.u;
            StringBuilder sb = new StringBuilder(23);
            sb.append("location capable: ");
            sb.append(z);
            printWriter.println(sb.toString());
            boolean z2 = this.t;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("service required: ");
            sb2.append(z2);
            printWriter.println(sb2.toString());
            printWriter.println("all nodes:");
            for (NodeParcelable valueOf : this.w) {
                String valueOf2 = String.valueOf(valueOf);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb3.append("  ");
                sb3.append(valueOf2);
                printWriter.println(sb3.toString());
            }
            printWriter.println("active requests:");
            int i2 = 0;
            while (true) {
                ou ouVar = this.i;
                if (i2 < ouVar.h) {
                    ajrq ajrq = (ajrq) ouVar.c(i2);
                    String valueOf3 = String.valueOf(ajrq.a);
                    printWriter.println(valueOf3.length() == 0 ? new String("  ") : "  ".concat(valueOf3));
                    if (!ajrq.b().isEmpty()) {
                        for (LocationRequestInternal valueOf4 : ajrq.b()) {
                            String valueOf5 = String.valueOf(valueOf4);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 4);
                            sb4.append("    ");
                            sb4.append(valueOf5);
                            printWriter.println(sb4.toString());
                        }
                    } else {
                        printWriter.println("    <none>");
                    }
                    i2++;
                }
            }
        }
    }

    public final void onCreate() {
        iby iby;
        super.onCreate();
        jix.i(this);
        Looper a = aieo.a();
        if (ayap.j()) {
            iby = ren.c(this);
        } else {
            iby = null;
        }
        adzn adzn = adyr.b;
        ajrn ajrn = ajrl.a;
        iby c = adyr.c(this);
        adyg a2 = adyr.a(this);
        aidf b = aieo.b();
        if (this.g == null) {
            this.g = a;
        }
        if (this.k == null) {
            this.k = iby;
        }
        if (this.m == null) {
            this.m = null;
        }
        if (this.n == null) {
            this.n = null;
        }
        if (this.o == null) {
            this.o = null;
        }
        if (this.y == null) {
            this.y = adzn;
        }
        if (this.h == null) {
            this.h = ajrn;
        }
        if (this.q == null) {
            this.q = b;
        }
        if (this.l == null) {
            this.l = c;
        }
        if (this.p == null) {
            this.p = a2;
        }
        this.j = new ajrp(this, this.g);
        this.i = new ou();
        this.r = new ajrk(this, this);
        this.s = new ajro(this);
        boolean z = false;
        this.t = false;
        this.u = false;
        if (!jkr.b() || checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            z = true;
        }
        this.v = z;
        this.w = Collections.emptySet();
        this.x = new ob(2);
    }

    public final void onDestroy() {
        synchronized (this.f) {
            int i2 = 0;
            while (true) {
                ou ouVar = this.i;
                if (i2 < ouVar.h) {
                    ((ajrq) ouVar.c(i2)).a();
                    i2++;
                } else {
                    ouVar.clear();
                    jld jld = this.n;
                    if (jld != null) {
                        jld.b();
                    }
                    rom rom = this.m;
                    if (rom != null) {
                        rom.b();
                    }
                    icc icc = this.o;
                    if (icc != null) {
                        icc.g();
                    }
                }
            }
            while (true) {
            }
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f) {
            this.t = true;
            if (this.n == null) {
                this.n = new jld(this, this.g);
            }
            this.n.a = this;
            this.n.a();
        }
        return 1;
    }

    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        int i2;
        if ("com.google.android.location.fused.wearable.LOCATION_REQUESTOR_CAPABILITY".equals(capabilityInfoParcelable.a)) {
            synchronized (this.f) {
                Set a = capabilityInfoParcelable.a();
                for (NodeParcelable nodeParcelable : iko.b(this.w, a)) {
                    aidf aidf = this.q;
                    aidf.a(25, aidf.l.a((Object) nodeParcelable.a));
                }
                for (NodeParcelable nodeParcelable2 : iko.b(a, this.w)) {
                    aidf aidf2 = this.q;
                    aidf2.a(24, aidf2.l.a((Object) nodeParcelable2.a));
                }
                Iterator it = a.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    NodeParcelable nodeParcelable3 = (NodeParcelable) it.next();
                    if (nodeParcelable3.d && !this.x.contains(nodeParcelable3)) {
                        if (!ayap.j()) {
                            ajrn ajrn = this.h;
                            icc b = b();
                            String str = nodeParcelable3.a;
                            aebd aebd = ((ajrl) ajrn).b;
                            aebd.a(b, str, "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", new byte[0]);
                        } else {
                            this.l.a(nodeParcelable3.a, "com/google/android/location/fused/wearable/LOCATION_REQUESTS_REFRESH", new byte[0]);
                        }
                    }
                }
                this.w = a;
                this.x.clear();
                for (NodeParcelable nodeParcelable4 : this.w) {
                    if (nodeParcelable4.d) {
                        this.x.add(nodeParcelable4);
                    }
                }
                while (true) {
                    ou ouVar = this.i;
                    if (i2 >= ouVar.h) {
                        break;
                    }
                    ajrq ajrq = (ajrq) ouVar.c(i2);
                    String str2 = ajrq.a;
                    NodeParcelable nodeParcelable5 = null;
                    if (str2 != null) {
                        Iterator it2 = this.w.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            NodeParcelable nodeParcelable6 = (NodeParcelable) it2.next();
                            if (atiu.a(nodeParcelable6.a, str2)) {
                                nodeParcelable5 = nodeParcelable6;
                                break;
                            }
                        }
                    }
                    if (nodeParcelable5 == null) {
                        ajrq.a();
                    }
                    i2++;
                }
                boolean z = !this.x.isEmpty();
                if (z != this.t) {
                    this.t = z;
                    if (z) {
                        startService(new Intent().setComponent(new ComponentName(this, "com.google.android.location.wearable.WearableLocationService")));
                    } else {
                        stopSelf();
                    }
                }
            }
        }
    }

    public final void a(MessageEventParcelable messageEventParcelable) {
        if (ayap.j()) {
            this.s.a(messageEventParcelable);
        } else {
            this.r.a(messageEventParcelable);
        }
    }

    public final void a(String str, Collection collection, boolean z) {
        synchronized (this.f) {
            ajrq ajrq = (ajrq) this.i.get(str);
            if (ajrq == null) {
                ajrq = new ajrq(this, str);
                this.i.put(str, ajrq);
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                LocationRequestInternal locationRequestInternal = (LocationRequestInternal) it.next();
                if (ayap.a.a().setWearableRequestModuleId()) {
                    locationRequestInternal.h = "com.google.android.gms.location__nonwearable";
                }
                locationRequestInternal.a();
                String str2 = locationRequestInternal.d;
                locationRequestInternal.d = String.valueOf(str2 != null ? str2.concat("_") : "").concat("wearable");
            }
            ajrq.a(collection, z);
        }
    }

    public final void a(boolean z, boolean z2) {
        synchronized (this.f) {
            boolean z3 = false;
            if (z || z2) {
                if (this.v) {
                    z3 = true;
                }
            }
            this.u = z3;
            aidf aidf = this.q;
            if (!z3) {
                aidf.a(30);
            } else {
                aidf.a(29);
            }
            if (!this.u) {
                if (ayap.j()) {
                    adyg adyg = this.p;
                    irk.a((Object) "com.google.android.location.fused.wearable.LOCATION_CAPABILITY", (Object) "capability must not be null");
                    adzn adzn = adyg.a;
                    iux.a(adzn.b(adyg.j, "com.google.android.location.fused.wearable.LOCATION_CAPABILITY"));
                } else {
                    adzn.b(b(), "com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
                }
            } else if (ayap.j()) {
                adyg adyg2 = this.p;
                irk.a((Object) "com.google.android.location.fused.wearable.LOCATION_CAPABILITY", (Object) "capability must not be null");
                adzn adzn2 = adyg2.a;
                iux.a(adzn.a(adyg2.j, "com.google.android.location.fused.wearable.LOCATION_CAPABILITY"));
            } else {
                adzn.a(b(), "com.google.android.location.fused.wearable.LOCATION_CAPABILITY");
            }
        }
    }
}
