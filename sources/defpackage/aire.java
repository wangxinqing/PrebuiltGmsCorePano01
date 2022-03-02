package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.internal.server.GoogleLocationChimeraService;
import com.google.android.location.internal.server.ServiceThread$LogRequestReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: aire  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aire extends qvr implements aixa, jki, jhk {
    private boolean A = false;
    private long B = -1;
    private ajrb C = null;
    private final List D = new ArrayList();
    private final ArrayList E;
    private final ContentObserver F;
    private final aizw G;
    public final GoogleLocationChimeraService a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public final Object f = new Object();
    public aicn g;
    public Boolean h;
    public boolean i = false;
    public aixc j;
    public long k = -1;
    public final aipv l;
    public final airk m;
    public final aiov n;
    public final airj o;
    public final airj p;
    public final airj q;
    public final rns r;
    public final PackageResetHelper s;
    public ServiceThread$LogRequestReceiver t;
    public final jhl u;
    private final arnf v;
    private final aibb w;
    private final ahzz x;
    private final rnh y;
    private final rni z;

    public aire(GoogleLocationChimeraService googleLocationChimeraService, arnf arnf, Looper looper, ikh ikh, ikh ikh2, ikh ikh3, ikh ikh4, aibb aibb, ahzz ahzz) {
        super(looper);
        this.a = googleLocationChimeraService;
        this.v = arnf;
        this.w = aibb;
        this.x = ahzz;
        ajqr ajqr = new ajqr(googleLocationChimeraService);
        this.l = new aipv();
        this.m = new airk();
        this.n = new aiov(googleLocationChimeraService, this, ikh, ajqr);
        airj airj = new airj(new aipl(ikh2), this.f);
        this.o = airj;
        this.D.add(airj);
        airj airj2 = new airj(new aioz(ikh4), this.f);
        this.p = airj2;
        this.D.add(airj2);
        airj airj3 = new airj(new airi(ikh3), this.f);
        this.q = airj3;
        this.D.add(airj3);
        this.F = new aird(this, this);
        this.r = rns.f(googleLocationChimeraService);
        this.G = aipg.a((Context) googleLocationChimeraService);
        this.E = new ArrayList();
        this.s = new PackageResetHelper(googleLocationChimeraService, this, true);
        this.u = jhl.a((Context) googleLocationChimeraService, (Handler) this);
        this.z = new aiqv(this);
        this.y = new aiqw(this);
    }

    public final aibl a(aiax aiax, aibr aibr) {
        aixc aixc = this.j;
        if (aixc != null) {
            return aixc.a(aiax, aibr);
        }
        return null;
    }

    public final void a(aibj aibj, boolean z2) {
        throw null;
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        throw null;
    }

    public final void a(List list) {
        throw null;
    }

    public final void a(List list, int i2) {
        throw null;
    }

    public final void b() {
        try {
            new atir(this.a.getPackageName()).a((Context) this.a);
            ContentResolver contentResolver = this.a.getContentResolver();
            contentResolver.registerContentObserver(aeed.b, true, this.F);
            contentResolver.registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, this.F);
            if (!this.i) {
                this.a.getContentResolver().unregisterContentObserver(this.F);
            }
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT >= 26 && ((amrk.a(this.a.getPackageName()) || this.a.getPackageName().equals("com.google.android.gms")) && awxl.a.a().b() && ((double) new Random().nextFloat()) < awxl.c())) {
                jhg.e();
            }
            throw e;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d7  */
    public final void c() {
        /*
            r23 = this;
            r8 = r23
            boolean r9 = r8.i
            java.lang.Object r1 = r8.f
            monitor-enter(r1)
            boolean r0 = r8.A     // Catch:{ all -> 0x0390 }
            monitor-exit(r1)     // Catch:{ all -> 0x0390 }
            com.google.android.location.internal.server.GoogleLocationChimeraService r1 = r8.a
            boolean r2 = r23.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 30
            r3.<init>(r4)
            java.lang.String r4 = "hasLocationPermission is "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
            rns r3 = r8.r
            java.lang.String r4 = "network"
            boolean r3 = r3.a((java.lang.String) r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 19
            r4.<init>(r5)
            java.lang.String r5 = "nlpEnabled is "
            r4.append(r5)
            r4.append(r3)
            r4.toString()
            boolean r1 = defpackage.rns.a((android.content.Context) r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 20
            r4.<init>(r5)
            java.lang.String r5 = "userConsent is "
            r4.append(r5)
            r4.append(r1)
            r4.toString()
            r10 = 1
            r11 = 0
            if (r2 != 0) goto L_0x0058
            r12 = 0
            goto L_0x005f
        L_0x0058:
            if (r3 != 0) goto L_0x005c
        L_0x005a:
            r12 = 0
            goto L_0x005f
        L_0x005c:
            if (r1 == 0) goto L_0x005a
            r12 = 1
        L_0x005f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 22
            r1.<init>(r2)
            java.lang.String r2 = "final result is: "
            r1.append(r2)
            r1.append(r12)
            r1.toString()
            if (r9 != 0) goto L_0x0075
            r13 = 0
            goto L_0x007d
        L_0x0075:
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r13 = 1
            goto L_0x007d
        L_0x0079:
            if (r12 == 0) goto L_0x007c
            goto L_0x0077
        L_0x007c:
            r13 = 0
        L_0x007d:
            java.lang.Object r2 = r8.f
            monitor-enter(r2)
            boolean r0 = r8.b     // Catch:{ all -> 0x038d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x038d }
            r3 = 56
            r1.<init>(r3)     // Catch:{ all -> 0x038d }
            java.lang.String r3 = "shouldBeRunning="
            r1.append(r3)     // Catch:{ all -> 0x038d }
            r1.append(r9)     // Catch:{ all -> 0x038d }
            java.lang.String r3 = " shouldBeEnabled="
            r1.append(r3)     // Catch:{ all -> 0x038d }
            r1.append(r13)     // Catch:{ all -> 0x038d }
            java.lang.String r3 = " enable="
            r1.append(r3)     // Catch:{ all -> 0x038d }
            r1.append(r0)     // Catch:{ all -> 0x038d }
            r1.toString()     // Catch:{ all -> 0x038d }
            if (r9 == 0) goto L_0x00ac
            aixc r0 = r8.j     // Catch:{ all -> 0x038d }
            if (r0 != 0) goto L_0x00ac
            r0 = 1
            goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            monitor-exit(r2)     // Catch:{ all -> 0x038d }
            r14 = 0
            if (r0 == 0) goto L_0x016c
            aixc r0 = new aixc
            com.google.android.location.internal.server.GoogleLocationChimeraService r2 = r8.a
            aicn r3 = r8.g
            aixi r5 = new aixi
            r5.<init>(r2)
            aizw r6 = r8.G
            arnf r7 = r8.v
            r1 = r0
            r4 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.location.internal.server.GoogleLocationChimeraService r1 = r8.a
            ajaa r2 = r0.g
            aizz r3 = r0.o
            aicn r4 = r0.b
            defpackage.ahoy.a(r1, r2, r3, r4)
            ahzz r1 = r8.x
            aivu r2 = r0.c
            boolean r3 = defpackage.aixc.q()
            r2.a((boolean) r3, (defpackage.ahzz) r1)
            aivu r1 = r0.c
            android.os.Handler r1 = r1.c()
            aixe r2 = r0.p
            java.lang.Object r3 = r2.a
            monitor-enter(r3)
            r2.f = r1     // Catch:{ all -> 0x0169 }
            monitor-exit(r3)     // Catch:{ all -> 0x0169 }
            aixp r2 = r0.h
            arnf r3 = r2.e
            boolean r4 = defpackage.axzd.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 32
            r5.<init>(r6)
            java.lang.String r6 = "wifi-scan nanoapp value is "
            r5.append(r6)
            r5.append(r4)
            r5.toString()
            boolean r4 = defpackage.axzd.b()
            if (r4 == 0) goto L_0x0141
            axzd r4 = defpackage.axzd.a
            axze r4 = r4.c()
            boolean r4 = r4.bugFixOnlyRunOnPrimaryProfile()
            if (r4 != 0) goto L_0x0117
            goto L_0x0120
        L_0x0117:
            android.content.Context r4 = r2.a
            boolean r4 = defpackage.jgu.f(r4)
            if (r4 != 0) goto L_0x0120
            goto L_0x0141
        L_0x0120:
            android.content.Context r4 = r2.a
            aixt r5 = r2.c
            aicn r6 = r2.b
            int r7 = android.os.Build.VERSION.SDK_INT
            r15 = 28
            if (r7 < r15) goto L_0x0138
            arnd r3 = r3.a(r4)
            if (r3 == 0) goto L_0x0138
            aizf r4 = new aizf
            r4.<init>(r3, r5, r6, r1)
            goto L_0x013d
        L_0x0138:
            aize r4 = new aize
            r4.<init>()
        L_0x013d:
            r4.e()
            goto L_0x0142
        L_0x0141:
            r4 = r14
        L_0x0142:
            r2.g = r4
            java.lang.Object r1 = r8.f
            monitor-enter(r1)
            r8.j = r0     // Catch:{ all -> 0x0166 }
            r8.b((boolean) r10)     // Catch:{ all -> 0x0166 }
            java.util.List r0 = r8.D     // Catch:{ all -> 0x0166 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0166 }
        L_0x0152:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0164
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0166 }
            aiph r2 = (defpackage.aiph) r2     // Catch:{ all -> 0x0166 }
            aixc r3 = r8.j     // Catch:{ all -> 0x0166 }
            r2.a((defpackage.aixc) r3)     // Catch:{ all -> 0x0166 }
            goto L_0x0152
        L_0x0164:
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x016c
        L_0x0166:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0166 }
            throw r0
        L_0x0169:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0169 }
            throw r0
        L_0x016c:
            java.lang.Object r1 = r8.f
            monitor-enter(r1)
            if (r13 != 0) goto L_0x017e
            boolean r0 = r8.b     // Catch:{ all -> 0x038a }
            if (r0 == 0) goto L_0x017e
            r8.b = r11     // Catch:{ all -> 0x038a }
            aipv r0 = r8.l     // Catch:{ all -> 0x038a }
            com.google.android.location.internal.server.GoogleLocationChimeraService r2 = r8.a     // Catch:{ all -> 0x038a }
            r0.a((android.content.Context) r2, (boolean) r11)     // Catch:{ all -> 0x038a }
        L_0x017e:
            monitor-exit(r1)     // Catch:{ all -> 0x038a }
            if (r13 == 0) goto L_0x0265
            int r0 = android.os.Build.VERSION.SDK_INT
            android.os.UserHandle r0 = android.os.Process.myUserHandle()
            boolean r0 = r0.isOwner()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r12 == 0) goto L_0x019b
            boolean r1 = defpackage.aixc.q()
            if (r1 == 0) goto L_0x0197
            r1 = 0
            goto L_0x019c
        L_0x0197:
            if (r0 == 0) goto L_0x019b
            r1 = 1
            goto L_0x019c
        L_0x019b:
            r1 = 0
        L_0x019c:
            aycj r2 = defpackage.aycj.a
            ayck r2 = r2.b()
            boolean r2 = r2.enableCollection()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 84
            r3.<init>(r4)
            java.lang.String r4 = "fullCollection: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", collectionEnabled: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", gServices collection enabled: "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
            aixc r3 = r8.j
            if (r1 != 0) goto L_0x01ce
            r4 = 0
            goto L_0x01d3
        L_0x01ce:
            if (r2 == 0) goto L_0x01d2
            r4 = 1
            goto L_0x01d3
        L_0x01d2:
            r4 = 0
        L_0x01d3:
            if (r0 != 0) goto L_0x01d7
            r0 = 0
            goto L_0x01dc
        L_0x01d7:
            if (r2 == 0) goto L_0x01db
            r0 = 1
            goto L_0x01dc
        L_0x01db:
            r0 = 0
        L_0x01dc:
            aibb r2 = r8.w
            aivu r3 = r3.c
            aicn r5 = r3.b
            aico r6 = defpackage.aico.INIT_NETWORK_PROVIDER
            r5.a((defpackage.aico) r6)
            ajcm r5 = r3.l
            r5.k()
            ajcp r5 = r5.b
            if (r5 != 0) goto L_0x01f1
            goto L_0x01fa
        L_0x01f1:
            boolean r5 = r5.g
            if (r5 == r4) goto L_0x01fa
            aixc r5 = r3.f
            r5.s()
        L_0x01fa:
            ajcm r5 = r3.l
            boolean r5 = r5.j()
            if (r5 != 0) goto L_0x0251
            aita r5 = new aita
            aixc r6 = r3.f
            r5.<init>(r6)
            r3.m = r5
            ajcm r6 = r3.l
            aixc r7 = r3.f
            ahqp r7 = r7.e
            aizk r12 = r3.n
            ajaa r15 = r5.h()
            java.io.File r20 = r15.d()
            r6.k()
            ajcp r15 = r6.b
            if (r15 != 0) goto L_0x0246
            ajcp r15 = new ajcp
            r22 = r15
            r16 = r5
            r17 = r7
            r18 = r2
            r19 = r12
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2 = r22
            r6.b = r2
            ajcp r2 = r6.b
            r2.i()
            java.util.List r2 = r6.a
            ajcp r4 = r6.b
            r2.add(r4)
            ajcp r2 = r6.b
            goto L_0x0247
        L_0x0246:
            r2 = r14
        L_0x0247:
            if (r2 != 0) goto L_0x024a
            goto L_0x0251
        L_0x024a:
            r3.a((defpackage.ajcl) r2, (boolean) r10)
            r2.h((boolean) r0)
        L_0x0251:
            java.lang.Object r2 = r8.f
            monitor-enter(r2)
            boolean r0 = r8.b     // Catch:{ all -> 0x0262 }
            r0 = r0 ^ r10
            r8.c(r0)     // Catch:{ all -> 0x0262 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0262 }
            r8.h = r0     // Catch:{ all -> 0x0262 }
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            goto L_0x02ae
        L_0x0262:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0262 }
            throw r0
        L_0x0265:
            aixc r0 = r8.j
            if (r0 == 0) goto L_0x02ae
            r0.s()
            java.lang.Object r1 = r8.f
            monitor-enter(r1)
            aipv r0 = r8.l     // Catch:{ all -> 0x02ab }
            java.util.HashMap r2 = r0.a     // Catch:{ all -> 0x02ab }
            int r2 = r2.size()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x02a5
            java.util.HashMap r2 = r0.a     // Catch:{ all -> 0x02ab }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x02ab }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02ab }
        L_0x0283:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02ab }
            if (r3 == 0) goto L_0x029c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02ab }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x02ab }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x02ab }
            aipt r3 = (defpackage.aipt) r3     // Catch:{ all -> 0x02ab }
            r3.a()     // Catch:{ all -> 0x02ab }
            r2.remove()     // Catch:{ all -> 0x02ab }
            goto L_0x0283
        L_0x029c:
            java.util.HashMap r2 = r0.a     // Catch:{ all -> 0x02ab }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x02ab }
            r0.a((java.util.Collection) r2)     // Catch:{ all -> 0x02ab }
        L_0x02a5:
            r2 = -1
            r8.k = r2     // Catch:{ all -> 0x02ab }
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            goto L_0x02ae
        L_0x02ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ab }
            throw r0
        L_0x02ae:
            java.lang.Object r2 = r8.f
            monitor-enter(r2)
            if (r13 == 0) goto L_0x02cc
            boolean r0 = r8.b     // Catch:{ all -> 0x0387 }
            if (r0 != 0) goto L_0x02cc
            r8.b = r10     // Catch:{ all -> 0x0387 }
            aipv r0 = r8.l     // Catch:{ all -> 0x0387 }
            com.google.android.location.internal.server.GoogleLocationChimeraService r1 = r8.a     // Catch:{ all -> 0x0387 }
            r0.a((android.content.Context) r1, (boolean) r10)     // Catch:{ all -> 0x0387 }
            com.google.android.location.internal.server.GoogleLocationChimeraService r0 = r8.a     // Catch:{ all -> 0x0387 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0387 }
            java.lang.String r3 = "com.google.android.location.internal.server.ACTION_RESTARTED"
            r1.<init>(r3)     // Catch:{ all -> 0x0387 }
            r0.sendBroadcast(r1)     // Catch:{ all -> 0x0387 }
        L_0x02cc:
            monitor-exit(r2)     // Catch:{ all -> 0x0387 }
            java.lang.Object r1 = r8.f
            monitor-enter(r1)
            boolean r0 = r8.b     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x031b
            com.google.android.location.internal.server.GoogleLocationChimeraService r2 = r8.a     // Catch:{ all -> 0x0384 }
            java.io.File r0 = r2.getFilesDir()     // Catch:{ SecurityException -> 0x0308 }
            if (r0 == 0) goto L_0x02e4
            java.io.File r3 = new java.io.File     // Catch:{ SecurityException -> 0x0308 }
            java.lang.String r4 = "nlp_state"
            r3.<init>(r0, r4)     // Catch:{ SecurityException -> 0x0308 }
            goto L_0x02e5
        L_0x02e4:
            r3 = r14
        L_0x02e5:
            if (r3 == 0) goto L_0x02ea
            r3.delete()     // Catch:{ SecurityException -> 0x0308 }
        L_0x02ea:
            java.io.File r0 = r2.getCacheDir()     // Catch:{ SecurityException -> 0x0308 }
            if (r0 == 0) goto L_0x02f8
            java.io.File r14 = new java.io.File     // Catch:{ SecurityException -> 0x0308 }
            java.lang.String r3 = "nlp_devices"
            r14.<init>(r0, r3)     // Catch:{ SecurityException -> 0x0308 }
            goto L_0x02f9
        L_0x02f8:
        L_0x02f9:
            if (r14 == 0) goto L_0x02fe
            r14.delete()     // Catch:{ SecurityException -> 0x0308 }
        L_0x02fe:
            java.io.File r0 = defpackage.aiwu.b(r2)     // Catch:{ SecurityException -> 0x0308 }
            if (r0 == 0) goto L_0x0309
            r0.delete()     // Catch:{ SecurityException -> 0x0308 }
            goto L_0x0309
        L_0x0308:
            r0 = move-exception
        L_0x0309:
            java.io.File r0 = defpackage.aiwu.a((android.content.Context) r2)     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x0314
            defpackage.ajre.a((java.io.File) r0)     // Catch:{ Exception -> 0x0313 }
            goto L_0x0314
        L_0x0313:
            r0 = move-exception
        L_0x0314:
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x0384 }
            defpackage.aiwa.a(r0)     // Catch:{ all -> 0x0384 }
        L_0x031b:
            monitor-exit(r1)     // Catch:{ all -> 0x0384 }
            if (r9 != 0) goto L_0x0383
            aixc r0 = r8.j
            if (r0 == 0) goto L_0x0376
            aivu r0 = r0.c
            r0.a((boolean) r13)
            aixc r1 = r8.j
            aixe r0 = r1.p
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            java.util.Map r3 = r0.c     // Catch:{ all -> 0x0373 }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x0373 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0373 }
        L_0x0338:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0373 }
            if (r4 == 0) goto L_0x034a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0373 }
            android.hardware.SensorEventListener r4 = (android.hardware.SensorEventListener) r4     // Catch:{ all -> 0x0373 }
            android.hardware.SensorManager r5 = r0.d     // Catch:{ all -> 0x0373 }
            r5.unregisterListener(r4)     // Catch:{ all -> 0x0373 }
            goto L_0x0338
        L_0x034a:
            java.util.Map r0 = r0.c     // Catch:{ all -> 0x0373 }
            r0.clear()     // Catch:{ all -> 0x0373 }
            monitor-exit(r2)     // Catch:{ all -> 0x0373 }
            aivu r0 = r1.c
            r0.b()
            ajaa r0 = r1.g
            aiwu r0 = (defpackage.aiwu) r0
            java.util.concurrent.ExecutorService r0 = r0.b
            r0.shutdown()
            ajaa r0 = r1.g     // Catch:{ InterruptedException -> 0x036c }
            aiwu r0 = (defpackage.aiwu) r0     // Catch:{ InterruptedException -> 0x036c }
            java.util.concurrent.ExecutorService r0 = r0.b     // Catch:{ InterruptedException -> 0x036c }
            r2 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x036c }
            r0.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x036c }
            goto L_0x036d
        L_0x036c:
            r0 = move-exception
        L_0x036d:
            aixh r0 = r1.k
            r0.a((boolean) r11)
            goto L_0x0376
        L_0x0373:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0373 }
            throw r0
        L_0x0376:
            com.google.android.location.internal.server.GoogleLocationChimeraService r0 = r8.a
            r0.a()
            r0 = 6
            android.os.Message r0 = android.os.Message.obtain(r8, r0)
            r0.sendToTarget()
        L_0x0383:
            return
        L_0x0384:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0384 }
            throw r0
        L_0x0387:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0387 }
            throw r0
        L_0x038a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x038a }
            throw r0
        L_0x038d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x038d }
            throw r0
        L_0x0390:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0393:
            throw r0
        L_0x0394:
            goto L_0x0393
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aire.c():void");
    }

    public final ajbg d() {
        aixc aixc = this.j;
        return aixc == null ? new ajba() : aixc.k;
    }

    public final void handleMessage(Message message) {
        aicj aicj;
        ModuleManager.ModuleInfo moduleInfo;
        String str;
        switch (message.what) {
            case 1:
                if (axzg.a.a().compactLogEnabled()) {
                    File file = new File(this.a.getCacheDir(), "compactlog");
                    file.mkdir();
                    aicj a2 = aicj.a(file, ajbt.e());
                    ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver = new ServiceThread$LogRequestReceiver(this, a2);
                    this.t = serviceThread$LogRequestReceiver;
                    GoogleLocationChimeraService googleLocationChimeraService = this.a;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.location.reporting.DUMP_LOG_BROADCAST_ACTION");
                    googleLocationChimeraService.registerReceiver(serviceThread$LogRequestReceiver, intentFilter, (String) null, serviceThread$LogRequestReceiver.b);
                    aicj = a2;
                } else {
                    aicj = null;
                }
                try {
                    moduleInfo = ModuleManager.get(this.a).getCurrentModule();
                } catch (IllegalStateException e) {
                    moduleInfo = null;
                }
                if (moduleInfo != null) {
                    int i2 = moduleInfo.moduleVersion;
                    long j2 = (long) moduleInfo.moduleApk.apkVersionCode;
                    str = String.format("%x,%x", new Object[]{Integer.valueOf(i2), Long.valueOf((j2 + j2) | 1)});
                } else {
                    str = null;
                }
                aicn aicn = new aicn(str, "com.google.android.gms", hxj.b, aiqx.a, aicj);
                synchronized (this.f) {
                    this.g = aicn;
                    this.l.c = aicn;
                    this.n.n = aicn;
                    for (aiph a3 : this.D) {
                        a3.a(aicn);
                    }
                }
                ajrf.a(new aiuf(aicn));
                return;
            case 2:
                if (ayap.n()) {
                    this.r.a(this.y, getLooper());
                    return;
                } else {
                    this.r.a(this.z, getLooper());
                    return;
                }
            case 3:
                c();
                return;
            case 4:
                if (ayap.n()) {
                    this.r.a(this.y);
                    return;
                } else {
                    this.r.a(this.z, getLooper());
                    return;
                }
            case 5:
                synchronized (this.f) {
                    b();
                }
                return;
            case 6:
                synchronized (this.f) {
                    this.c = true;
                    Looper.myLooper().quit();
                    this.j = null;
                }
                return;
            default:
                return;
        }
    }

    public final void a(int i2, boolean z2) {
        synchronized (this.f) {
            aiov aiov = this.n;
            if (axwx.f()) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("Received onImportanceChanged for uid = ");
                sb.append(i2);
                sb.append(", isForeground = ");
                sb.append(z2);
                sb.toString();
                Iterator it = aiov.g.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aiot aiot = (aiot) it.next();
                    if (ajqw.b(aiot.h) == i2) {
                        if (!z2) {
                            String str = aiot.j;
                            long j2 = aiot.q;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                            sb2.append("May be throttle period for package = ");
                            sb2.append(str);
                            sb2.append(" current period millis = ");
                            sb2.append(j2);
                            sb2.toString();
                            if (aiot.q < axxa.f()) {
                                aiot.a(axxa.f());
                                break;
                            }
                        } else {
                            long j3 = aiot.q;
                            int i3 = aiot.g;
                            long j4 = aiot.e;
                            if (j3 > j4) {
                                aiot.a(j4);
                                break;
                            }
                        }
                    }
                }
                aiov.g();
                b(false);
            }
        }
    }

    public final void b(List list, int i2) {
        boolean z2;
        Object obj;
        long j2;
        this.E.clear();
        int size = list.size();
        Location location = null;
        aiax aiax = null;
        for (int i3 = 0; i3 < size; i3++) {
            aiax aiax2 = (aiax) list.get(i3);
            aiav aiav = aiax2.a;
            if (aiav != null && aiav.d == aiau.OK) {
                this.E.add(aips.a(aiax2));
                aiax = aiax2;
            }
        }
        if (aiax != null) {
            location = aips.a(aiax);
        }
        synchronized (this.f) {
            aipv aipv = this.l;
            GoogleLocationChimeraService googleLocationChimeraService = this.a;
            ArrayList arrayList = this.E;
            if (aiax == null || !aiax.d) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = !this.r.a("network");
            if (arrayList != null) {
                obj = Integer.valueOf(arrayList.size());
            } else {
                obj = "null";
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
            sb.append("Delivering location to clients, historical location count is ");
            sb.append(valueOf);
            sb.toString();
            Intent a2 = aipv.a();
            if (location != null) {
                a2.putExtra("location", location);
            }
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    int i4 = Build.VERSION.SDK_INT;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        long elapsedRealtimeNanos = ((Location) it.next()).getElapsedRealtimeNanos();
                        StringBuilder sb2 = new StringBuilder(82);
                        sb2.append("Bundling historical location with since-boot millis timestamp ");
                        sb2.append(elapsedRealtimeNanos / 1000000);
                        sb2.toString();
                    }
                    a2.putParcelableArrayListExtra("com.google.android.location.internal.EXTRA_LOCATION_LIST", arrayList);
                }
            }
            Iterator it2 = aipv.a.values().iterator();
            boolean z4 = false;
            while (it2.hasNext()) {
                aipt aipt = (aipt) it2.next();
                if (!z2 || aipt.a) {
                    if (z3) {
                        if (aipt.l) {
                        }
                    }
                    long j3 = aipt.k;
                    StringBuilder sb3 = new StringBuilder(70);
                    sb3.append("Delivering a location to a listener registered at ");
                    sb3.append(j3);
                    sb3.toString();
                    if (!aipt.a(googleLocationChimeraService, a2)) {
                        String valueOf2 = String.valueOf(aipt);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                        sb4.append("dropping intent receiver");
                        sb4.append(valueOf2);
                        sb4.toString();
                        aicn aicn = aipv.c;
                        if (aicn != null) {
                            aicn.a(aico.LOCATION_PENDING_INTENT_DROPPED, aipt.h.hashCode(), aipt.h.getTargetPackage());
                        }
                        it2.remove();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                aipv.a(aipv.a.values());
            }
            String valueOf3 = String.valueOf(location);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 10);
            sb5.append("reporting ");
            sb5.append(valueOf3);
            sb5.toString();
            c(false);
            if (ahym.a(aydu.b())) {
                aipv aipv2 = this.l;
                HashMap hashMap = new HashMap(aipv2.a.size());
                for (aipt aipt2 : aipv2.a.values()) {
                    ajrb ajrb = aipt2.n;
                    if (ajrb != null) {
                        List<String> b2 = ajrb.b();
                        if (b2 != null) {
                            if (b2.size() <= 1) {
                                j2 = aipt2.q;
                            } else {
                                j2 = Long.MAX_VALUE;
                            }
                            for (String str : b2) {
                                if (!"com.google.android.gms".equals(str)) {
                                    Long l2 = (Long) hashMap.get(str);
                                    if (l2 == null) {
                                        l2 = Long.MAX_VALUE;
                                    }
                                    if (j2 < l2.longValue()) {
                                        l2 = Long.valueOf(j2);
                                    }
                                    hashMap.put(str, l2);
                                }
                            }
                        }
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    this.G.a(str2, ((Long) hashMap.get(str2)).longValue());
                }
                this.G.a();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0320 A[Catch:{ all -> 0x030e, all -> 0x0334 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahzw r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r2 = r1.f
            monitor-enter(r2)
            aiov r3 = r1.n     // Catch:{ all -> 0x0334 }
            com.google.android.location.internal.server.GoogleLocationChimeraService r0 = r1.a     // Catch:{ all -> 0x0334 }
            java.util.Map r4 = r3.g     // Catch:{ all -> 0x0312 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x0312 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0312 }
            r6 = 0
            r7 = 0
        L_0x0015:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x0312 }
            if (r8 == 0) goto L_0x0114
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x0312 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x0312 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x0312 }
            aiot r8 = (defpackage.aiot) r8     // Catch:{ all -> 0x0312 }
            boolean r9 = defpackage.axwf.b()     // Catch:{ all -> 0x0312 }
            if (r9 == 0) goto L_0x0039
            long r9 = r8.i     // Catch:{ all -> 0x0312 }
            long r11 = r8.q     // Catch:{ all -> 0x0312 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x0037
            r15 = 0
            goto L_0x003a
        L_0x0037:
            r15 = 1
            goto L_0x003a
        L_0x0039:
            r15 = 0
        L_0x003a:
            if (r15 != 0) goto L_0x0043
            r14 = r20
            java.util.List r9 = r14.a((defpackage.ahzv) r8)     // Catch:{ all -> 0x0312 }
            goto L_0x0052
        L_0x0043:
            r14 = r20
            int r9 = defpackage.aiot.g     // Catch:{ all -> 0x0312 }
            long r10 = r8.a     // Catch:{ all -> 0x0312 }
            long r12 = r8.q     // Catch:{ all -> 0x0312 }
            r9 = r20
            r14 = r8
            java.util.List r9 = r9.a(r10, r12, r14)     // Catch:{ all -> 0x0312 }
        L_0x0052:
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0312 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0312 }
            int r11 = r11.length()     // Catch:{ all -> 0x0312 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0312 }
            int r11 = r11 + 33
            r12.<init>(r11)     // Catch:{ all -> 0x0312 }
            java.lang.String r11 = "allResults: "
            r12.append(r11)     // Catch:{ all -> 0x0312 }
            r12.append(r10)     // Catch:{ all -> 0x0312 }
            java.lang.String r10 = " isBatchClient: "
            r12.append(r10)     // Catch:{ all -> 0x0312 }
            r12.append(r15)     // Catch:{ all -> 0x0312 }
            r12.toString()     // Catch:{ all -> 0x0312 }
            if (r15 == 0) goto L_0x00bb
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0312 }
            if (r10 != 0) goto L_0x00bb
            android.content.Intent r10 = defpackage.aiov.i()     // Catch:{ all -> 0x0312 }
            r11 = 1
        L_0x0085:
            int r12 = r9.size()     // Catch:{ all -> 0x0312 }
            if (r11 >= r12) goto L_0x00ac
            java.lang.Object r12 = r9.get(r11)     // Catch:{ all -> 0x0312 }
            com.google.android.gms.location.ActivityRecognitionResult r12 = (com.google.android.gms.location.ActivityRecognitionResult) r12     // Catch:{ all -> 0x0312 }
            long r12 = r12.c     // Catch:{ all -> 0x0312 }
            int r14 = r11 + -1
            java.lang.Object r14 = r9.get(r14)     // Catch:{ all -> 0x0312 }
            com.google.android.gms.location.ActivityRecognitionResult r14 = (com.google.android.gms.location.ActivityRecognitionResult) r14     // Catch:{ all -> 0x0312 }
            long r14 = r14.c     // Catch:{ all -> 0x0312 }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00a3
            r12 = 1
            goto L_0x00a4
        L_0x00a3:
            r12 = 0
        L_0x00a4:
            java.lang.String r13 = "ActivityRecognitionResult list are out of order in time."
            defpackage.iva.b(r12, r13)     // Catch:{ all -> 0x0312 }
            int r11 = r11 + 1
            goto L_0x0085
        L_0x00ac:
            java.lang.String r11 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST"
            defpackage.ivy.a((java.lang.Iterable) r9, (android.content.Intent) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0312 }
            boolean r10 = r3.a(r0, r10, r8)     // Catch:{ all -> 0x0312 }
            if (r10 != 0) goto L_0x00b9
            r10 = 1
            goto L_0x00df
        L_0x00b9:
            r10 = 0
            goto L_0x00df
        L_0x00bb:
            if (r15 != 0) goto L_0x00de
            java.util.Iterator r10 = r9.iterator()     // Catch:{ all -> 0x0312 }
        L_0x00c1:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0312 }
            if (r11 == 0) goto L_0x00de
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0312 }
            com.google.android.gms.location.ActivityRecognitionResult r11 = (com.google.android.gms.location.ActivityRecognitionResult) r11     // Catch:{ all -> 0x0312 }
            android.content.Intent r12 = defpackage.aiov.i()     // Catch:{ all -> 0x0312 }
            java.lang.String r13 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            r12.putExtra(r13, r11)     // Catch:{ all -> 0x0312 }
            boolean r11 = r3.a(r0, r12, r8)     // Catch:{ all -> 0x0312 }
            if (r11 != 0) goto L_0x00c1
            r10 = 1
            goto L_0x00df
        L_0x00de:
            r10 = 0
        L_0x00df:
            if (r9 == 0) goto L_0x00f9
            boolean r11 = r9.isEmpty()     // Catch:{ all -> 0x0312 }
            if (r11 != 0) goto L_0x00f9
            int r11 = r9.size()     // Catch:{ all -> 0x0312 }
            int r11 = r11 + -1
            java.lang.Object r11 = r9.get(r11)     // Catch:{ all -> 0x0312 }
            com.google.android.gms.location.ActivityRecognitionResult r11 = (com.google.android.gms.location.ActivityRecognitionResult) r11     // Catch:{ all -> 0x0312 }
            long r11 = r11.c     // Catch:{ all -> 0x0312 }
            int r13 = defpackage.aiot.g     // Catch:{ all -> 0x0312 }
            r8.a = r11     // Catch:{ all -> 0x0312 }
        L_0x00f9:
            if (r9 == 0) goto L_0x010c
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0312 }
            if (r9 != 0) goto L_0x010c
            boolean r9 = defpackage.axwu.f()     // Catch:{ all -> 0x0312 }
            if (r9 == 0) goto L_0x010c
            android.app.PendingIntent r8 = r8.h     // Catch:{ all -> 0x0312 }
            defpackage.ahjk.b((android.content.Context) r0, (android.app.PendingIntent) r8)     // Catch:{ all -> 0x0312 }
        L_0x010c:
            if (r10 == 0) goto L_0x0015
            r4.remove()     // Catch:{ all -> 0x0312 }
            r7 = 1
            goto L_0x0015
        L_0x0114:
            boolean r4 = defpackage.axwx.e()     // Catch:{ all -> 0x0312 }
            if (r4 == 0) goto L_0x02e1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02dd }
            r4.<init>()     // Catch:{ all -> 0x02dd }
            java.util.Map r8 = r3.g     // Catch:{ all -> 0x02dd }
            java.util.Collection r8 = r8.values()     // Catch:{ all -> 0x02dd }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x02dd }
        L_0x0129:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x02dd }
            if (r9 == 0) goto L_0x014b
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0312 }
            aiot r9 = (defpackage.aiot) r9     // Catch:{ all -> 0x0312 }
            android.app.PendingIntent r10 = r9.h     // Catch:{ all -> 0x0312 }
            java.lang.String r10 = r10.getTargetPackage()     // Catch:{ all -> 0x0312 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0312 }
            if (r10 != 0) goto L_0x0129
            android.app.PendingIntent r9 = r9.h     // Catch:{ all -> 0x0312 }
            java.lang.String r9 = r9.getTargetPackage()     // Catch:{ all -> 0x0312 }
            r4.add(r9)     // Catch:{ all -> 0x0312 }
            goto L_0x0129
        L_0x014b:
            ahol r0 = defpackage.ahol.a((android.content.Context) r0)     // Catch:{ all -> 0x02dd }
            java.util.List r8 = r20.b()     // Catch:{ all -> 0x02dd }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02dd }
            r11 = 0
            if (r8 == 0) goto L_0x02a7
            boolean r12 = r8.isEmpty()     // Catch:{ all -> 0x02dd }
            if (r12 != 0) goto L_0x02a7
            boolean r12 = r4.isEmpty()     // Catch:{ all -> 0x02dd }
            if (r12 != 0) goto L_0x02a7
            arej r12 = defpackage.arej.c     // Catch:{ all -> 0x02dd }
            aucd r12 = r12.o()     // Catch:{ all -> 0x02dd }
            r13 = 0
        L_0x016d:
            int r14 = r4.size()     // Catch:{ all -> 0x02dd }
            if (r13 >= r14) goto L_0x01a7
            java.lang.Object r14 = r4.get(r13)     // Catch:{ all -> 0x0312 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0312 }
            ares r14 = defpackage.ahol.a((java.lang.String) r14, (java.lang.String) r11)     // Catch:{ all -> 0x0312 }
            boolean r15 = r12.c     // Catch:{ all -> 0x0312 }
            if (r15 != 0) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            r12.c()     // Catch:{ all -> 0x0312 }
            r12.c = r6     // Catch:{ all -> 0x0312 }
        L_0x0187:
            aucj r15 = r12.b     // Catch:{ all -> 0x0312 }
            arej r15 = (defpackage.arej) r15     // Catch:{ all -> 0x0312 }
            r14.getClass()     // Catch:{ all -> 0x0312 }
            aucx r11 = r15.a     // Catch:{ all -> 0x0312 }
            boolean r11 = r11.a()     // Catch:{ all -> 0x0312 }
            if (r11 != 0) goto L_0x019e
            aucx r11 = r15.a     // Catch:{ all -> 0x0312 }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ all -> 0x0312 }
            r15.a = r11     // Catch:{ all -> 0x0312 }
        L_0x019e:
            aucx r11 = r15.a     // Catch:{ all -> 0x0312 }
            r11.add(r14)     // Catch:{ all -> 0x0312 }
            int r13 = r13 + 1
            r11 = 0
            goto L_0x016d
        L_0x01a7:
            r4 = 0
        L_0x01a8:
            int r11 = r8.size()     // Catch:{ all -> 0x02dd }
            if (r4 >= r11) goto L_0x029f
            java.lang.Object r11 = r8.get(r4)     // Catch:{ all -> 0x02dd }
            com.google.android.gms.location.ActivityRecognitionResult r11 = (com.google.android.gms.location.ActivityRecognitionResult) r11     // Catch:{ all -> 0x02dd }
            if (r11 == 0) goto L_0x0268
            java.util.List r13 = r11.a     // Catch:{ all -> 0x02dd }
            if (r13 == 0) goto L_0x0268
            boolean r14 = r13.isEmpty()     // Catch:{ all -> 0x02dd }
            if (r14 != 0) goto L_0x0268
            areu r14 = defpackage.areu.f     // Catch:{ all -> 0x02dd }
            aucd r14 = r14.o()     // Catch:{ all -> 0x02dd }
            r15 = 0
        L_0x01c7:
            int r5 = r13.size()     // Catch:{ all -> 0x02dd }
            if (r15 >= r5) goto L_0x0238
            java.lang.Object r5 = r13.get(r15)     // Catch:{ all -> 0x02dd }
            com.google.android.gms.location.DetectedActivity r5 = (com.google.android.gms.location.DetectedActivity) r5     // Catch:{ all -> 0x02dd }
            aret r17 = defpackage.aret.d     // Catch:{ all -> 0x02dd }
            aucd r6 = r17.o()     // Catch:{ all -> 0x02dd }
            r17 = r8
            int r8 = r5.a()     // Catch:{ all -> 0x02dd }
            r18 = r13
            boolean r13 = r6.c     // Catch:{ all -> 0x02dd }
            if (r13 != 0) goto L_0x01e6
            goto L_0x01ec
        L_0x01e6:
            r6.c()     // Catch:{ all -> 0x02dd }
            r13 = 0
            r6.c = r13     // Catch:{ all -> 0x02dd }
        L_0x01ec:
            aucj r13 = r6.b     // Catch:{ all -> 0x02dd }
            aret r13 = (defpackage.aret) r13     // Catch:{ all -> 0x02dd }
            int r1 = r13.a     // Catch:{ all -> 0x02dd }
            r1 = r1 | 4
            r13.a = r1     // Catch:{ all -> 0x02dd }
            r13.c = r8     // Catch:{ all -> 0x02dd }
            int r5 = r5.e     // Catch:{ all -> 0x02dd }
            float r5 = (float) r5     // Catch:{ all -> 0x02dd }
            r1 = r1 | 2
            r13.a = r1     // Catch:{ all -> 0x02dd }
            r13.b = r5     // Catch:{ all -> 0x02dd }
            aucj r1 = r6.i()     // Catch:{ all -> 0x02dd }
            aret r1 = (defpackage.aret) r1     // Catch:{ all -> 0x02dd }
            boolean r5 = r14.c     // Catch:{ all -> 0x02dd }
            if (r5 != 0) goto L_0x020c
            goto L_0x0212
        L_0x020c:
            r14.c()     // Catch:{ all -> 0x02dd }
            r5 = 0
            r14.c = r5     // Catch:{ all -> 0x02dd }
        L_0x0212:
            aucj r5 = r14.b     // Catch:{ all -> 0x02dd }
            areu r5 = (defpackage.areu) r5     // Catch:{ all -> 0x02dd }
            r1.getClass()     // Catch:{ all -> 0x02dd }
            aucx r6 = r5.b     // Catch:{ all -> 0x02dd }
            boolean r6 = r6.a()     // Catch:{ all -> 0x02dd }
            if (r6 != 0) goto L_0x0229
            aucx r6 = r5.b     // Catch:{ all -> 0x02dd }
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)     // Catch:{ all -> 0x02dd }
            r5.b = r6     // Catch:{ all -> 0x02dd }
        L_0x0229:
            aucx r5 = r5.b     // Catch:{ all -> 0x02dd }
            r5.add(r1)     // Catch:{ all -> 0x02dd }
            int r15 = r15 + 1
            r1 = r19
            r8 = r17
            r13 = r18
            r6 = 0
            goto L_0x01c7
        L_0x0238:
            r17 = r8
            long r5 = r11.b     // Catch:{ all -> 0x02dd }
            boolean r1 = r14.c     // Catch:{ all -> 0x02dd }
            if (r1 != 0) goto L_0x0241
            goto L_0x0247
        L_0x0241:
            r14.c()     // Catch:{ all -> 0x02dd }
            r1 = 0
            r14.c = r1     // Catch:{ all -> 0x02dd }
        L_0x0247:
            aucj r1 = r14.b     // Catch:{ all -> 0x02dd }
            areu r1 = (defpackage.areu) r1     // Catch:{ all -> 0x02dd }
            int r8 = r1.a     // Catch:{ all -> 0x02dd }
            r13 = 1
            r8 = r8 | r13
            r1.a = r8     // Catch:{ all -> 0x02dd }
            r1.c = r5     // Catch:{ all -> 0x02dd }
            r5 = r8 | 2
            r1.a = r5     // Catch:{ all -> 0x02dd }
            r1.d = r9     // Catch:{ all -> 0x02dd }
            int r6 = r11.d     // Catch:{ all -> 0x02dd }
            r5 = r5 | 4
            r1.a = r5     // Catch:{ all -> 0x02dd }
            r1.e = r6     // Catch:{ all -> 0x02dd }
            aucj r1 = r14.i()     // Catch:{ all -> 0x02dd }
            areu r1 = (defpackage.areu) r1     // Catch:{ all -> 0x02dd }
            goto L_0x026c
        L_0x0268:
            r17 = r8
            r13 = 1
            r1 = 0
        L_0x026c:
            if (r1 != 0) goto L_0x026f
            goto L_0x0296
        L_0x026f:
            boolean r5 = r12.c     // Catch:{ all -> 0x02dd }
            if (r5 != 0) goto L_0x0274
            goto L_0x027a
        L_0x0274:
            r12.c()     // Catch:{ all -> 0x02dd }
            r5 = 0
            r12.c = r5     // Catch:{ all -> 0x02dd }
        L_0x027a:
            aucj r5 = r12.b     // Catch:{ all -> 0x02dd }
            arej r5 = (defpackage.arej) r5     // Catch:{ all -> 0x02dd }
            r1.getClass()     // Catch:{ all -> 0x02dd }
            aucx r6 = r5.b     // Catch:{ all -> 0x02dd }
            boolean r6 = r6.a()     // Catch:{ all -> 0x02dd }
            if (r6 != 0) goto L_0x0291
            aucx r6 = r5.b     // Catch:{ all -> 0x02dd }
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)     // Catch:{ all -> 0x02dd }
            r5.b = r6     // Catch:{ all -> 0x02dd }
        L_0x0291:
            aucx r5 = r5.b     // Catch:{ all -> 0x02dd }
            r5.add(r1)     // Catch:{ all -> 0x02dd }
        L_0x0296:
            int r4 = r4 + 1
            r6 = 0
            r1 = r19
            r8 = r17
            goto L_0x01a8
        L_0x029f:
            aucj r1 = r12.i()     // Catch:{ all -> 0x02dd }
            r11 = r1
            arej r11 = (defpackage.arej) r11     // Catch:{ all -> 0x02dd }
            goto L_0x02a8
        L_0x02a7:
            r11 = 0
        L_0x02a8:
            if (r11 == 0) goto L_0x02e1
            arec r1 = defpackage.arec.q     // Catch:{ all -> 0x02dd }
            aucd r1 = r1.o()     // Catch:{ all -> 0x02dd }
            boolean r4 = r1.c     // Catch:{ all -> 0x02dd }
            if (r4 != 0) goto L_0x02b5
            goto L_0x02bb
        L_0x02b5:
            r1.c()     // Catch:{ all -> 0x02dd }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x02dd }
        L_0x02bb:
            aucj r4 = r1.b     // Catch:{ all -> 0x02dd }
            arec r4 = (defpackage.arec) r4     // Catch:{ all -> 0x02dd }
            r11.getClass()     // Catch:{ all -> 0x02dd }
            r4.c = r11     // Catch:{ all -> 0x02dd }
            int r5 = r4.a     // Catch:{ all -> 0x02dd }
            r6 = 2
            r5 = r5 | r6
            r4.a = r5     // Catch:{ all -> 0x02dd }
            aucj r1 = r1.i()     // Catch:{ all -> 0x02dd }
            arec r1 = (defpackage.arec) r1     // Catch:{ all -> 0x02dd }
            hol r0 = r0.a     // Catch:{ all -> 0x02dd }
            hoi r0 = r0.a((defpackage.audx) r1)     // Catch:{ all -> 0x02dd }
            r0.b((int) r6)     // Catch:{ all -> 0x02dd }
            r0.b()     // Catch:{ all -> 0x02dd }
            goto L_0x02e1
        L_0x02dd:
            r0 = move-exception
            r1 = r19
            goto L_0x0313
        L_0x02e1:
            if (r7 != 0) goto L_0x02e4
            goto L_0x02e7
        L_0x02e4:
            r3.g()     // Catch:{ all -> 0x02dd }
        L_0x02e7:
            java.util.List r0 = r3.i     // Catch:{ all -> 0x030e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x030e }
        L_0x02ed:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x030e }
            if (r0 == 0) goto L_0x0301
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x030e }
            ifu r0 = (defpackage.ifu) r0     // Catch:{ all -> 0x030e }
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x02ff }
            r0.a(r4)     // Catch:{ RemoteException -> 0x02ff }
            goto L_0x02ed
        L_0x02ff:
            r0 = move-exception
            goto L_0x02ed
        L_0x0301:
            java.util.List r0 = r3.i     // Catch:{ all -> 0x030e }
            r0.clear()     // Catch:{ all -> 0x030e }
            r3 = 0
            r1 = r19
            r1.b((boolean) r3)     // Catch:{ all -> 0x0334 }
            monitor-exit(r2)     // Catch:{ all -> 0x0334 }
            return
        L_0x030e:
            r0 = move-exception
            r1 = r19
            goto L_0x0335
        L_0x0312:
            r0 = move-exception
        L_0x0313:
            r4 = r0
            java.util.List r0 = r3.i     // Catch:{ all -> 0x0334 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0334 }
        L_0x031a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0334 }
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0334 }
            ifu r0 = (defpackage.ifu) r0     // Catch:{ all -> 0x0334 }
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x032c }
            r0.a(r6)     // Catch:{ RemoteException -> 0x032c }
            goto L_0x031a
        L_0x032c:
            r0 = move-exception
            goto L_0x031a
        L_0x032e:
            java.util.List r0 = r3.i     // Catch:{ all -> 0x0334 }
            r0.clear()     // Catch:{ all -> 0x0334 }
            throw r4     // Catch:{ all -> 0x0334 }
        L_0x0334:
            r0 = move-exception
        L_0x0335:
            monitor-exit(r2)     // Catch:{ all -> 0x0334 }
            goto L_0x0338
        L_0x0337:
            throw r0
        L_0x0338:
            goto L_0x0337
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aire.a(ahzw):void");
    }

    public final void b(boolean z2) {
        if (this.j != null) {
            ActivityRecognitionRequest activityRecognitionRequest = this.n.k;
            ahzx ahzx = new ahzx(activityRecognitionRequest.a, activityRecognitionRequest.f, activityRecognitionRequest.h);
            aixc aixc = this.j;
            int h2 = this.n.h();
            aiov aiov = this.n;
            aixc.c.a(20, 0, new aivh(h2, ahzx, z2, aiov.l, aiov.j, aiov.o), true);
        }
    }

    public final boolean b(String str) {
        boolean z2;
        synchronized (this.f) {
            z2 = true;
            if (this.n.c(str) == null && this.q.a(str) == null) {
                Iterator it = this.D.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((airj) it.next()).a(str) != null) {
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
            }
        }
        return z2;
    }

    public final void c(boolean z2) {
        long j2;
        long j3;
        boolean z3;
        boolean z4 = z2;
        aipv aipv = this.l;
        long j4 = aipv.d;
        long j5 = aipv.e;
        long j6 = aipv.f;
        boolean z5 = aipv.g;
        ajrb ajrb = aipv.h;
        long max = Math.max(j4, 5000);
        if (aydu.c()) {
            j2 = Math.max(j4, 1000);
        } else {
            j2 = Math.max(j4, 5000);
        }
        if (this.j != null) {
            boolean a2 = amqx.a(ajrb, this.C);
            if (z4) {
                z3 = z5;
            } else {
                z3 = z5;
                if (j2 == this.k && j5 == this.B && a2) {
                    j3 = j5;
                }
            }
            aixc aixc = this.j;
            aiat aiat = r5;
            j3 = j5;
            aiat aiat2 = new aiat(max, j5, j6, j2, z3, ajrb);
            aixc.c.a(3, z2 ? 1 : 0, aiat, false);
        } else {
            j3 = j5;
        }
        this.k = j2;
        this.B = j3;
        this.C = ajrb;
    }

    public final void a(aibl aibl) {
        aixc aixc = this.j;
        if (aixc != null) {
            aixc.a(aibl);
        }
    }

    public final void a(aibr aibr) {
        this.m.a((Context) this.a, aibr);
    }

    public final void a(aiph aiph, PendingIntent pendingIntent) {
        aiph.a(pendingIntent, this.j);
    }

    public final void a(aiph aiph, PendingIntent pendingIntent, Object obj, boolean z2, ajrb ajrb, String str, ifu ifu) {
        if (aydu.d()) {
            post(new aira(this, aiph, pendingIntent, obj, z2, ajrb, str, ifu));
            return;
        }
        aiph.a(this.a, d(), pendingIntent, obj, z2, ajrb, str, ifu, this.j);
    }

    public final void a(PendingIntent pendingIntent) {
        airb airb = new airb(this, pendingIntent);
        if (aydu.d()) {
            post(airb);
        } else {
            airb.run();
        }
    }

    public final void a(String str) {
        PendingIntent c2;
        PendingIntent a2;
        int i2;
        while (true) {
            synchronized (this.f) {
                c2 = this.n.c(str);
            }
            if (c2 != null) {
                String hexString = Integer.toHexString(c2.hashCode());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString).length());
                sb.append("remove reset package: packageName=");
                sb.append(str);
                sb.append(", pendingIntent=");
                sb.append(hexString);
                sb.toString();
                a(c2);
            } else {
                List list = this.D;
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    airj airj = (airj) list.get(i3);
                    while (true) {
                        PendingIntent a3 = airj.a(str);
                        i2 = i3 + 1;
                        if (a3 == null) {
                            break;
                        }
                        String hexString2 = Integer.toHexString(a3.hashCode());
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString2).length());
                        sb2.append("remove reset package: packageName=");
                        sb2.append(str);
                        sb2.append(", pendingIntent=");
                        sb2.append(hexString2);
                        sb2.toString();
                        airj.a(a3, this.j);
                    }
                    i3 = i2;
                }
                while (true) {
                    synchronized (this.f) {
                        a2 = this.q.a(str);
                    }
                    if (a2 != null) {
                        String hexString3 = Integer.toHexString(a2.hashCode());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(hexString3).length());
                        sb3.append("remove reset package: packageName=");
                        sb3.append(str);
                        sb3.append(", pendingIntent=");
                        sb3.append(hexString3);
                        sb3.toString();
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
        while (true) {
        }
    }

    public final void a(boolean z2) {
        if (z2 != this.A) {
            this.A = z2;
            if (z2) {
                Message.obtain(this, 3).sendToTarget();
            }
        }
    }

    public final void a(aiay[] aiayArr) {
        synchronized (this.f) {
            this.l.a((Context) this.a, aiayArr);
        }
    }

    public final boolean a() {
        return jni.b(this.a).a("android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid()) == 0;
    }
}
