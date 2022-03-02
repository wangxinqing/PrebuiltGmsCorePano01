package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class sze implements swn {
    private static volatile sze q;
    public final svn a;
    public spj b;
    public suz c;
    public syv d;
    public spb e;
    public sxi f;
    public final svv g;
    public boolean h = false;
    long i;
    public List j;
    public int k;
    public int l;
    public boolean m;
    public List n;
    public List o;
    public long p;
    private final sux r;
    private final szg s;
    private boolean t;
    private boolean u;
    private boolean v;
    private FileLock w;
    private FileChannel x;

    public static sze a(Context context) {
        iva.a((Object) context);
        iva.a((Object) context.getApplicationContext());
        if (q == null) {
            synchronized (sze.class) {
                if (q == null) {
                    szf szf = null;
                    boolean z = true;
                    if (!spc.a(context)) {
                        z = false;
                    } else {
                        try {
                            szf = (szf) Class.forName("com.google.android.gms.measurement.internal.ModuleUploadFactory").asSubclass(szf.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                            z = false;
                        } catch (ClassNotFoundException e2) {
                        } catch (IllegalAccessException e3) {
                            throw new IllegalStateException(e3);
                        } catch (InstantiationException e4) {
                            throw new IllegalStateException(e4);
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException(e5);
                        } catch (InvocationTargetException e6) {
                            throw new IllegalStateException(e6);
                        }
                    }
                    if (spc.a(context)) {
                        if (!z) {
                            q = szf.a();
                        }
                    }
                    szf = new szf(context);
                    q = szf.a();
                }
            }
        }
        return q;
    }

    private final Boolean b(sou sou) {
        try {
            if (sou.j() == -2147483648L) {
                String str = jni.b(n()).b(sou.a(), 0).versionName;
                if (sou.i() != null && sou.i().equals(str)) {
                    return true;
                }
            } else {
                if (sou.j() == ((long) jni.b(n()).b(sou.a(), 0).versionCode)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    private static final boolean d(AppMetadata appMetadata) {
        ayjy.c();
        return !TextUtils.isEmpty(appMetadata.b) || !TextUtils.isEmpty(appMetadata.r);
    }

    public final sut E() {
        return this.g.E();
    }

    public final svs F() {
        return this.g.F();
    }

    public String a(String str, long j2) {
        return null;
    }

    public final spc a() {
        return this.g.f;
    }

    /* access modifiers changed from: package-private */
    public final String c(AppMetadata appMetadata) {
        try {
            return (String) F().a((Callable) new szc(this, appMetadata)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            E().c.a("Failed to get app instance id. appId", sut.a(appMetadata.a), e2);
            return null;
        }
    }

    public final spg d() {
        return this.g.g;
    }

    public final svf e() {
        return this.g.a();
    }

    public final svn f() {
        a((syx) this.a);
        return this.a;
    }

    public final sux g() {
        a((syx) this.r);
        return this.r;
    }

    public final spj h() {
        a((syx) this.b);
        return this.b;
    }

    public final suz i() {
        suz suz = this.c;
        if (suz != null) {
            return suz;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final syv j() {
        a((syx) this.d);
        return this.d;
    }

    public final spb k() {
        a((syx) this.e);
        return this.e;
    }

    public final szg l() {
        a((syx) this.s);
        return this.s;
    }

    public final suk m() {
        return this.g.g();
    }

    public final Context n() {
        return this.g.a;
    }

    public final jiq o() {
        return this.g.l;
    }

    public final szj p() {
        return this.g.f();
    }

    public final spn q() {
        return this.g.m();
    }

    public final void r() {
        F().h();
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        if (!this.h) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final long t() {
        long a2 = o().a();
        svf e2 = e();
        e2.k();
        e2.h();
        long a3 = e2.h.a();
        if (a3 == 0) {
            a3 = ((long) e2.x().e().nextInt(86400000)) + 1;
            e2.h.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v80, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v76, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v77 */
    /* JADX WARNING: type inference failed for: r9v78 */
    /* JADX WARNING: type inference failed for: r9v79, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v81 */
    /* JADX WARNING: type inference failed for: r9v82 */
    /* JADX WARNING: type inference failed for: r9v83 */
    /* JADX WARNING: type inference failed for: r9v85 */
    /* JADX WARNING: type inference failed for: r9v86 */
    /* JADX WARNING: type inference failed for: r9v87 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r1.p = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e4, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ef, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0315, code lost:
        if (r6 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x031c, code lost:
        if (r7.isEmpty() != false) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x031e, code lost:
        r2 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0326, code lost:
        if (r2.hasNext() == false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0328, code lost:
        r3 = (defpackage.tad) ((android.util.Pair) r2.next()).first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0338, code lost:
        if (android.text.TextUtils.isEmpty(r3.u) != false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x033a, code lost:
        r2 = r3.u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x033d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x033e, code lost:
        if (r2 != null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0341, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0346, code lost:
        if (r3 >= r7.size()) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0348, code lost:
        r6 = (defpackage.tad) ((android.util.Pair) r7.get(r3)).first;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0358, code lost:
        if (android.text.TextUtils.isEmpty(r6.u) == false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0361, code lost:
        if (r6.u.equals(r2) != false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0363, code lost:
        r7 = r7.subList(0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0369, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x036c, code lost:
        r2 = defpackage.tac.b.o();
        r3 = r7.size();
        r6 = new java.util.ArrayList(r7.size());
        r9 = d().d(r8);
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0388, code lost:
        if (r10 >= r3) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x038a, code lost:
        r13 = (defpackage.tad) ((android.util.Pair) r7.get(r10)).first;
        r14 = (defpackage.aucd) r13.c(5);
        r14.a((defpackage.aucj) r13);
        r6.add((java.lang.Long) ((android.util.Pair) r7.get(r10)).second);
        r11 = d().b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03b5, code lost:
        if (r14.c != false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03b8, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03be, code lost:
        r13 = (defpackage.tad) r14.b;
        r17 = defpackage.tad.P;
        r15 = r13.a | 32768;
        r13.a = r15;
        r13.t = r11;
        r13.a = r15 | 2;
        r13.f = r4;
        r11 = a().a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03dd, code lost:
        if (r14.c != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03e0, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03e6, code lost:
        r12 = (defpackage.tad) r14.b;
        r13 = r12.a | 8388608;
        r12.a = r13;
        r12.B = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03f3, code lost:
        if (r9 != false) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03f5, code lost:
        r12.a = Integer.MAX_VALUE & r13;
        r12.I = defpackage.tad.P.I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x040b, code lost:
        if (d().b(r8, defpackage.sud.Y) == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x040d, code lost:
        r11 = l().a(((defpackage.tad) r14.i()).k());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0421, code lost:
        if (r14.c != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0424, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x042a, code lost:
        r13 = (defpackage.tad) r14.b;
        r13.b |= 32;
        r13.O = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0436, code lost:
        r2.q(r14);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0446, code lost:
        if (E().a(2) == false) goto L_0x0836;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0448, code lost:
        r7 = l();
        r9 = (defpackage.tac) r2.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0452, code lost:
        if (r9 == null) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0454, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("\nbatch {\n");
        r9 = r9.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x046a, code lost:
        if (r9.hasNext() != false) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        r10.append("}\n");
        r9 = r10.toString();
        r26 = r4;
        r4 = r8;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0479, code lost:
        r11 = (defpackage.tad) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x047f, code lost:
        if (r11 == null) goto L_0x0820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0481, code lost:
        defpackage.szg.a(r10, 1);
        r10.append("bundle {\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x048e, code lost:
        if ((r11.a & 1) != 0) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0490, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0492, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "protocol_version", (java.lang.Object) java.lang.Integer.valueOf(r11.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x049e, code lost:
        defpackage.szg.a(r10, r15, "platform", (java.lang.Object) r11.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04a9, code lost:
        if ((r11.a & 16384) == 0) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04ab, code lost:
        defpackage.szg.a(r10, 1, "gmp_version", (java.lang.Object) java.lang.Long.valueOf(r11.s));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04bd, code lost:
        if ((r11.a & 32768) == 0) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04bf, code lost:
        defpackage.szg.a(r10, 1, "uploading_gmp_version", (java.lang.Object) java.lang.Long.valueOf(r11.t));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04cf, code lost:
        if ((r11.b & 16) == 0) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04d1, code lost:
        defpackage.szg.a(r10, 1, "dynamite_version", (java.lang.Object) java.lang.Long.valueOf(r11.N));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04e2, code lost:
        if ((r11.a & 536870912) != 0) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04e4, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04e6, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "config_version", (java.lang.Object) java.lang.Long.valueOf(r11.G));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04f2, code lost:
        defpackage.szg.a(r10, r15, "gmp_app_id", (java.lang.Object) r11.A);
        defpackage.szg.a(r10, r15, "admob_app_id", (java.lang.Object) r11.K);
        defpackage.szg.a(r10, r15, "app_id", (java.lang.Object) r11.q);
        defpackage.szg.a(r10, r15, "app_version", (java.lang.Object) r11.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0513, code lost:
        if ((r11.a & 33554432) != 0) goto L_0x0517;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0515, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0517, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "app_version_major", (java.lang.Object) java.lang.Integer.valueOf(r11.E));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0523, code lost:
        defpackage.szg.a(r10, r15, "firebase_instance_id", (java.lang.Object) r11.D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x052f, code lost:
        if ((r11.a & 524288) != 0) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0531, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0533, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "dev_cert_hash", (java.lang.Object) java.lang.Long.valueOf(r11.x));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x053f, code lost:
        defpackage.szg.a(r10, r15, "app_store", (java.lang.Object) r11.p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x054a, code lost:
        if ((r11.a & 2) == 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x054c, code lost:
        defpackage.szg.a(r10, 1, "upload_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r11.f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x055c, code lost:
        if ((r11.a & 4) == 0) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x055e, code lost:
        defpackage.szg.a(r10, 1, "start_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r11.g));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x056e, code lost:
        if ((r11.a & 8) == 0) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0570, code lost:
        defpackage.szg.a(r10, 1, "end_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r11.h));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0580, code lost:
        if ((r11.a & 16) == 0) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0582, code lost:
        defpackage.szg.a(r10, 1, "previous_bundle_start_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r11.i));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0592, code lost:
        if ((r11.a & 32) != 0) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0594, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0596, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "previous_bundle_end_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r11.j));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05a2, code lost:
        defpackage.szg.a(r10, r15, "app_instance_id", (java.lang.Object) r11.w);
        defpackage.szg.a(r10, r15, "resettable_device_id", (java.lang.Object) r11.u);
        defpackage.szg.a(r10, r15, "device_id", (java.lang.Object) r11.F);
        defpackage.szg.a(r10, r15, "ds_id", (java.lang.Object) r11.I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05c3, code lost:
        if ((r11.a & 131072) != 0) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05c5, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05c7, code lost:
        r15 = 1;
        defpackage.szg.a(r10, 1, "limited_ad_tracking", (java.lang.Object) java.lang.Boolean.valueOf(r11.v));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05d3, code lost:
        defpackage.szg.a(r10, r15, "os_version", (java.lang.Object) r11.l);
        defpackage.szg.a(r10, r15, "device_model", (java.lang.Object) r11.m);
        defpackage.szg.a(r10, r15, "user_default_language", (java.lang.Object) r11.n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05ed, code lost:
        if ((r11.a & 1024) == 0) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05ef, code lost:
        defpackage.szg.a(r10, 1, "time_zone_offset_minutes", (java.lang.Object) java.lang.Integer.valueOf(r11.o));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0600, code lost:
        if ((r11.a & 1048576) == 0) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0602, code lost:
        defpackage.szg.a(r10, 1, "bundle_sequential_index", (java.lang.Object) java.lang.Integer.valueOf(r11.y));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0613, code lost:
        if ((r11.a & 8388608) != 0) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0615, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0617, code lost:
        r14 = 1;
        defpackage.szg.a(r10, 1, "service_upload", (java.lang.Object) java.lang.Boolean.valueOf(r11.B));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0623, code lost:
        defpackage.szg.a(r10, r14, "health_monitor", (java.lang.Object) r11.z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0634, code lost:
        if (r7.v().a(defpackage.sud.aQ) != false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x063b, code lost:
        if ((r11.a & com.google.android.cast.JGCastService.FLAG_PRIVATE_DISPLAY) == 0) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x063d, code lost:
        r13 = r11.H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0643, code lost:
        if (r13 == 0) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0645, code lost:
        defpackage.szg.a(r10, 1, "android_id", (java.lang.Object) java.lang.Long.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0656, code lost:
        if ((r11.b & 2) == 0) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0658, code lost:
        defpackage.szg.a(r10, 1, "retry_counter", (java.lang.Object) java.lang.Integer.valueOf(r11.J));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0664, code lost:
        r13 = r11.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0666, code lost:
        r14 = "name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0668, code lost:
        if (r13 == null) goto L_0x0709;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0672, code lost:
        if (r13.hasNext() == false) goto L_0x0702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0674, code lost:
        r15 = (defpackage.tah) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x067a, code lost:
        if (r15 == null) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x067c, code lost:
        r24 = r9;
        defpackage.szg.a(r10, 2);
        r10.append("user_property {\n");
        r25 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0691, code lost:
        if ((r15.a & 1) == 0) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0693, code lost:
        r26 = r4;
        r5 = r3;
        r3 = java.lang.Long.valueOf(r15.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069d, code lost:
        r26 = r4;
        r5 = r3;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06a1, code lost:
        defpackage.szg.a(r10, 2, "set_timestamp_millis", (java.lang.Object) r3);
        defpackage.szg.a(r10, 2, r14, (java.lang.Object) r7.y().c(r15.c));
        defpackage.szg.a(r10, 2, "string_value", (java.lang.Object) r15.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06c1, code lost:
        if ((r15.a & 8) == 0) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06c3, code lost:
        r4 = r8;
        r8 = java.lang.Long.valueOf(r15.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06cb, code lost:
        r4 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06cd, code lost:
        defpackage.szg.a(r10, 2, "int_value", (java.lang.Object) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06d7, code lost:
        if ((r15.a & 32) == 0) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06d9, code lost:
        r8 = java.lang.Double.valueOf(r15.f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06e0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06e1, code lost:
        defpackage.szg.a(r10, 2, "double_value", (java.lang.Object) r8);
        defpackage.szg.a(r10, 2);
        r10.append("}\n");
        r8 = r4;
        r3 = r5;
        r9 = r24;
        r13 = r25;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06f6, code lost:
        r26 = r4;
        r4 = r8;
        r24 = r9;
        r25 = r13;
        r5 = r3;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0702, code lost:
        r26 = r4;
        r4 = r8;
        r24 = r9;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0709, code lost:
        r26 = r4;
        r4 = r8;
        r24 = r9;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x070f, code lost:
        r3 = r11.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0711, code lost:
        if (r3 == null) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0713, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x071b, code lost:
        if (r3.hasNext() == false) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x071d, code lost:
        r8 = (defpackage.szx) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0723, code lost:
        if (r8 == null) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0725, code lost:
        defpackage.szg.a(r10, 2);
        r10.append("audience_membership {\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0732, code lost:
        if ((r8.a & 1) == 0) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0734, code lost:
        defpackage.szg.a(r10, 2, "audience_id", (java.lang.Object) java.lang.Integer.valueOf(r8.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0744, code lost:
        if ((r8.a & 8) == 0) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0746, code lost:
        defpackage.szg.a(r10, 2, "new_audience", (java.lang.Object) java.lang.Boolean.valueOf(r8.e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0752, code lost:
        r13 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0756, code lost:
        if (r13 != null) goto L_0x075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0758, code lost:
        r13 = defpackage.taf.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x075a, code lost:
        defpackage.szg.a(r10, "current_data", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0761, code lost:
        if (defpackage.ayjn.b() != false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x076e, code lost:
        if (r7.v().a(defpackage.sud.aJ) == false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0774, code lost:
        if ((r8.a & 4) == 0) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0777, code lost:
        r8 = r8.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x077b, code lost:
        if (r8 != null) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x077d, code lost:
        r8 = defpackage.taf.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x077f, code lost:
        defpackage.szg.a(r10, "previous_data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0782, code lost:
        defpackage.szg.a(r10, 2);
        r10.append("}\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x078b, code lost:
        r3 = r11.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x078d, code lost:
        if (r3 != null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0792, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x079a, code lost:
        if (r3.hasNext() == false) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x079c, code lost:
        r8 = (defpackage.szz) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x07a2, code lost:
        if (r8 == null) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07a4, code lost:
        defpackage.szg.a(r10, 2);
        r10.append("event {\n");
        defpackage.szg.a(r10, 2, r14, (java.lang.Object) r7.y().a(r8.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07be, code lost:
        if ((r8.a & 2) == 0) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x07c0, code lost:
        r11 = r14;
        defpackage.szg.a(r10, 2, "timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r8.d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07ce, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07d3, code lost:
        if ((r8.a & 4) == 0) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x07d5, code lost:
        defpackage.szg.a(r10, 2, "previous_timestamp_millis", (java.lang.Object) java.lang.Long.valueOf(r8.e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07e5, code lost:
        if ((r8.a & 8) == 0) goto L_0x07f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07e7, code lost:
        defpackage.szg.a(r10, 2, "count", (java.lang.Object) java.lang.Integer.valueOf(r8.f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07f9, code lost:
        if (r8.b.size() != 0) goto L_0x07fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07fb, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07fd, code lost:
        r9 = 2;
        r7.a(r10, 2, (java.util.List) r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0803, code lost:
        defpackage.szg.a(r10, r9);
        r10.append("}\n");
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x080c, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0810, code lost:
        defpackage.szg.a(r10, 1);
        r10.append("}\n");
        r8 = r4;
        r3 = r5;
        r9 = r24;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0820, code lost:
        r26 = r4;
        r4 = r8;
        r5 = r3;
        r9 = r9;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x082f, code lost:
        r26 = r4;
        r4 = r8;
        r5 = r3;
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0836, code lost:
        r26 = r4;
        r4 = r8;
        r5 = r3;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x083b, code lost:
        l();
        r14 = ((defpackage.tac) r2.i()).k();
        d();
        r3 = (java.lang.String) defpackage.sud.q.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        r13 = new java.net.URL(r3);
        defpackage.iva.b(!r6.isEmpty());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0863, code lost:
        if (r1.n == null) goto L_0x0871;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0865, code lost:
        E().c.a("Set uploading progress before finishing the previous upload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0871, code lost:
        r1.n = new java.util.ArrayList(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0878, code lost:
        e().e.a(r26);
        r6 = "?";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0885, code lost:
        if (r5 <= 0) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0887, code lost:
        r6 = ((defpackage.tad) ((defpackage.tac) r2.b).a.get(0)).q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0896, code lost:
        E().k.a("Uploading data. app, uncompressed size, data", r6, java.lang.Integer.valueOf(r14.length), r9);
        r1.m = true;
        r11 = g();
        r2 = new defpackage.syz(r1);
        r11.h();
        r11.q();
        defpackage.iva.a((java.lang.Object) r13);
        defpackage.iva.a((java.lang.Object) r14);
        defpackage.iva.a((java.lang.Object) r2);
        r11.F().b(new defpackage.suw(r11, r4, r13, r14, (java.util.Map) null, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:?, code lost:
        E().c.a("Failed to parse upload URL. Not uploading. appId", defpackage.sut.a(r4), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r2 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (r2 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0175, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017b, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0197, code lost:
        if (r13 != null) goto L_0x0177;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a3 A[Catch:{ all -> 0x014e, all -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x08ed A[SYNTHETIC, Splitter:B:407:0x08ed] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d A[Catch:{ all -> 0x014e, all -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0153 A[Catch:{ all -> 0x014e, all -> 0x091c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r28 = this;
            r1 = r28
            r28.r()
            r28.s()
            r2 = 1
            r1.v = r2
            r3 = 0
            spc r4 = r28.a()     // Catch:{ all -> 0x091c }
            boolean r4 = r4.a     // Catch:{ all -> 0x091c }
            if (r4 != 0) goto L_0x0043
            svv r4 = r1.g     // Catch:{ all -> 0x091c }
            sye r4 = r4.l()     // Catch:{ all -> 0x091c }
            java.lang.Boolean r4 = r4.d     // Catch:{ all -> 0x091c }
            if (r4 != 0) goto L_0x002f
            sut r2 = r28.E()     // Catch:{ all -> 0x091c }
            sur r2 = r2.f     // Catch:{ all -> 0x091c }
            java.lang.String r4 = "Upload data called on the client side before use of service was decided"
            r2.a(r4)     // Catch:{ all -> 0x091c }
            r1.v = r3
        L_0x002b:
            r28.x()
            return
        L_0x002f:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x091c }
            if (r4 == 0) goto L_0x0043
            sut r2 = r28.E()     // Catch:{ all -> 0x091c }
            sur r2 = r2.c     // Catch:{ all -> 0x091c }
            java.lang.String r4 = "Upload called in the client side when service should be used"
            r2.a(r4)     // Catch:{ all -> 0x091c }
            r1.v = r3
            goto L_0x002b
        L_0x0043:
            long r4 = r1.i     // Catch:{ all -> 0x091c }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0914
            r28.r()     // Catch:{ all -> 0x091c }
            java.util.List r4 = r1.n     // Catch:{ all -> 0x091c }
            if (r4 != 0) goto L_0x0904
            sux r4 = r28.g()     // Catch:{ all -> 0x091c }
            boolean r4 = r4.c()     // Catch:{ all -> 0x091c }
            if (r4 == 0) goto L_0x08f1
            jiq r4 = r28.o()     // Catch:{ all -> 0x091c }
            long r4 = r4.a()     // Catch:{ all -> 0x091c }
            ayki r8 = defpackage.ayki.a     // Catch:{ all -> 0x091c }
            aykj r8 = r8.a()     // Catch:{ all -> 0x091c }
            boolean r8 = r8.a()     // Catch:{ all -> 0x091c }
            r9 = 0
            if (r8 == 0) goto L_0x007c
            spg r8 = r28.d()     // Catch:{ all -> 0x091c }
            suc r10 = defpackage.sud.I     // Catch:{ all -> 0x091c }
            int r8 = r8.a((java.lang.String) r9, (defpackage.suc) r10)     // Catch:{ all -> 0x091c }
            goto L_0x007d
        L_0x007c:
            r8 = 1
        L_0x007d:
            if (r8 > r2) goto L_0x008c
            r28.d()     // Catch:{ all -> 0x091c }
            long r10 = defpackage.spg.l()     // Catch:{ all -> 0x091c }
            long r10 = r4 - r10
            r1.a((long) r10)     // Catch:{ all -> 0x091c }
            goto L_0x00a1
        L_0x008c:
            r28.d()     // Catch:{ all -> 0x091c }
            long r10 = defpackage.spg.l()     // Catch:{ all -> 0x091c }
            long r10 = r4 - r10
            r12 = 0
        L_0x0096:
            if (r12 >= r8) goto L_0x00a1
            boolean r13 = r1.a((long) r10)     // Catch:{ all -> 0x091c }
            if (r13 == 0) goto L_0x00a1
            int r12 = r12 + 1
            goto L_0x0096
        L_0x00a1:
            svf r8 = r28.e()     // Catch:{ all -> 0x091c }
            svc r8 = r8.d     // Catch:{ all -> 0x091c }
            long r10 = r8.a()     // Catch:{ all -> 0x091c }
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00b0
            goto L_0x00c5
        L_0x00b0:
            sut r8 = r28.E()     // Catch:{ all -> 0x091c }
            sur r8 = r8.j     // Catch:{ all -> 0x091c }
            java.lang.String r12 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r10 = r4 - r10
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x091c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x091c }
            r8.a(r12, r10)     // Catch:{ all -> 0x091c }
        L_0x00c5:
            spj r8 = r28.h()     // Catch:{ all -> 0x091c }
            java.lang.String r8 = r8.g()     // Catch:{ all -> 0x091c }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x091c }
            r11 = -1
            if (r10 == 0) goto L_0x0157
            r1.p = r11     // Catch:{ all -> 0x091c }
            spj r6 = r28.h()     // Catch:{ all -> 0x091c }
            r28.d()     // Catch:{ all -> 0x091c }
            long r7 = defpackage.spg.l()     // Catch:{ all -> 0x091c }
            long r4 = r4 - r7
            r6.h()     // Catch:{ all -> 0x091c }
            r6.q()     // Catch:{ all -> 0x091c }
            android.database.sqlite.SQLiteDatabase r7 = r6.e()     // Catch:{ SQLiteException -> 0x0125, all -> 0x0122 }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0125, all -> 0x0122 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0122 }
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0125, all -> 0x0122 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r2 = r7.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0122 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x011f, all -> 0x011b }
            if (r4 != 0) goto L_0x0110
            sut r4 = r6.E()     // Catch:{ SQLiteException -> 0x011f, all -> 0x011b }
            sur r4 = r4.k     // Catch:{ SQLiteException -> 0x011f, all -> 0x011b }
            java.lang.String r5 = "No expired configs for apps with pending events"
            r4.a(r5)     // Catch:{ SQLiteException -> 0x011f, all -> 0x011b }
            if (r2 == 0) goto L_0x010f
            goto L_0x0135
        L_0x010f:
            goto L_0x0137
        L_0x0110:
            java.lang.String r9 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x011f, all -> 0x011b }
            if (r2 == 0) goto L_0x0137
        L_0x0117:
            r2.close()     // Catch:{ all -> 0x091c }
            goto L_0x0137
        L_0x011b:
            r0 = move-exception
            r4 = r0
            r9 = r2
            goto L_0x0151
        L_0x011f:
            r0 = move-exception
            r4 = r0
            goto L_0x0128
        L_0x0122:
            r0 = move-exception
            r4 = r0
            goto L_0x0151
        L_0x0125:
            r0 = move-exception
            r4 = r0
            r2 = r9
        L_0x0128:
            sut r5 = r6.E()     // Catch:{ all -> 0x014e }
            sur r5 = r5.c     // Catch:{ all -> 0x014e }
            java.lang.String r6 = "Error selecting expired configs"
            r5.a(r6, r4)     // Catch:{ all -> 0x014e }
            if (r2 == 0) goto L_0x0136
        L_0x0135:
            goto L_0x0117
        L_0x0136:
        L_0x0137:
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x091c }
            if (r2 != 0) goto L_0x08e3
            spj r2 = r28.h()     // Catch:{ all -> 0x091c }
            sou r2 = r2.b(r9)     // Catch:{ all -> 0x091c }
            if (r2 != 0) goto L_0x0149
            goto L_0x08e3
        L_0x0149:
            r1.a((defpackage.sou) r2)     // Catch:{ all -> 0x091c }
            goto L_0x08e3
        L_0x014e:
            r0 = move-exception
            r4 = r0
            r9 = r2
        L_0x0151:
            if (r9 == 0) goto L_0x0156
            r9.close()     // Catch:{ all -> 0x091c }
        L_0x0156:
            throw r4     // Catch:{ all -> 0x091c }
        L_0x0157:
            long r13 = r1.p     // Catch:{ all -> 0x091c }
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x01a7
            spj r10 = r28.h()     // Catch:{ all -> 0x091c }
            android.database.sqlite.SQLiteDatabase r13 = r10.e()     // Catch:{ SQLiteException -> 0x0189, all -> 0x0186 }
            java.lang.String r14 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r13 = r13.rawQuery(r14, r9)     // Catch:{ SQLiteException -> 0x0189, all -> 0x0186 }
            boolean r14 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0183, all -> 0x017f }
            if (r14 == 0) goto L_0x017b
            long r11 = r13.getLong(r3)     // Catch:{ SQLiteException -> 0x0183, all -> 0x017f }
            if (r13 == 0) goto L_0x019b
        L_0x0177:
            r13.close()     // Catch:{ all -> 0x091c }
            goto L_0x017e
        L_0x017b:
            if (r13 == 0) goto L_0x017e
            goto L_0x0177
        L_0x017e:
            goto L_0x019b
        L_0x017f:
            r0 = move-exception
            r2 = r0
            r9 = r13
            goto L_0x01a1
        L_0x0183:
            r0 = move-exception
            r14 = r0
            goto L_0x018c
        L_0x0186:
            r0 = move-exception
            r2 = r0
            goto L_0x01a1
        L_0x0189:
            r0 = move-exception
            r14 = r0
            r13 = r9
        L_0x018c:
            sut r10 = r10.E()     // Catch:{ all -> 0x019e }
            sur r10 = r10.c     // Catch:{ all -> 0x019e }
            java.lang.String r15 = "Error querying raw events"
            r10.a(r15, r14)     // Catch:{ all -> 0x019e }
            if (r13 == 0) goto L_0x019a
            goto L_0x0177
        L_0x019a:
        L_0x019b:
            r1.p = r11     // Catch:{ all -> 0x091c }
            goto L_0x01a7
        L_0x019e:
            r0 = move-exception
            r2 = r0
            r9 = r13
        L_0x01a1:
            if (r9 == 0) goto L_0x01a6
            r9.close()     // Catch:{ all -> 0x091c }
        L_0x01a6:
            throw r2     // Catch:{ all -> 0x091c }
        L_0x01a7:
            spg r10 = r28.d()     // Catch:{ all -> 0x091c }
            suc r11 = defpackage.sud.g     // Catch:{ all -> 0x091c }
            int r10 = r10.a((java.lang.String) r8, (defpackage.suc) r11)     // Catch:{ all -> 0x091c }
            spg r11 = r28.d()     // Catch:{ all -> 0x091c }
            suc r12 = defpackage.sud.h     // Catch:{ all -> 0x091c }
            int r11 = r11.a((java.lang.String) r8, (defpackage.suc) r12)     // Catch:{ all -> 0x091c }
            int r11 = java.lang.Math.max(r3, r11)     // Catch:{ all -> 0x091c }
            spj r12 = r28.h()     // Catch:{ all -> 0x091c }
            r12.h()     // Catch:{ all -> 0x091c }
            r12.q()     // Catch:{ all -> 0x091c }
            if (r10 <= 0) goto L_0x01cd
            r13 = 1
            goto L_0x01ce
        L_0x01cd:
            r13 = 0
        L_0x01ce:
            defpackage.iva.b((boolean) r13)     // Catch:{ all -> 0x091c }
            if (r11 <= 0) goto L_0x01d5
            r13 = 1
            goto L_0x01d6
        L_0x01d5:
            r13 = 0
        L_0x01d6:
            defpackage.iva.b((boolean) r13)     // Catch:{ all -> 0x091c }
            defpackage.iva.c(r8)     // Catch:{ all -> 0x091c }
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 2
            android.database.sqlite.SQLiteDatabase r15 = r12.e()     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            java.lang.String r16 = "rowid"
            r9[r3] = r16     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            java.lang.String r16 = "data"
            r9[r2] = r16     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            java.lang.String r16 = "retry_count"
            r9[r14] = r16     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            r6[r3] = r8     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            java.lang.String r16 = "queue"
            java.lang.String r18 = "app_id=?"
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            r17 = r9
            r19 = r6
            android.database.Cursor r6 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x02ff, all -> 0x02fa }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r7 == 0) goto L_0x02eb
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r9 = 0
        L_0x0218:
            long r15 = r6.getLong(r3)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            byte[] r10 = r6.getBlob(r2)     // Catch:{ IOException -> 0x02c3 }
            szg r17 = r12.o()     // Catch:{ IOException -> 0x02c3 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x02b5 }
            r2.<init>(r10)     // Catch:{ IOException -> 0x02b5 }
            java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x02b5 }
            r10.<init>(r2)     // Catch:{ IOException -> 0x02b5 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x02b5 }
            r3.<init>()     // Catch:{ IOException -> 0x02b5 }
            byte[] r14 = new byte[r13]     // Catch:{ IOException -> 0x02b5 }
        L_0x0236:
            int r13 = r10.read(r14)     // Catch:{ IOException -> 0x02b5 }
            if (r13 > 0) goto L_0x02a9
            r10.close()     // Catch:{ IOException -> 0x02b5 }
            r2.close()     // Catch:{ IOException -> 0x02b5 }
            byte[] r2 = r3.toByteArray()     // Catch:{ IOException -> 0x02b5 }
            boolean r3 = r7.isEmpty()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r3 == 0) goto L_0x024d
        L_0x024c:
            goto L_0x0253
        L_0x024d:
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            int r3 = r3 + r9
            if (r3 <= r11) goto L_0x024c
            goto L_0x02e4
        L_0x0253:
            tad r3 = defpackage.tad.P     // Catch:{ IOException -> 0x0297 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x0297 }
            audw r3 = defpackage.szg.a((defpackage.audw) r3, (byte[]) r2)     // Catch:{ IOException -> 0x0297 }
            aucd r3 = (defpackage.aucd) r3     // Catch:{ IOException -> 0x0297 }
            r10 = 2
            boolean r13 = r6.isNull(r10)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r13 != 0) goto L_0x0283
            int r13 = r6.getInt(r10)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            boolean r10 = r3.c     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r10 != 0) goto L_0x026f
            goto L_0x0275
        L_0x026f:
            r3.c()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r10 = 0
            r3.c = r10     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
        L_0x0275:
            aucj r10 = r3.b     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            tad r10 = (defpackage.tad) r10     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            int r14 = r10.b     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r17 = 2
            r14 = r14 | 2
            r10.b = r14     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r10.J = r13     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
        L_0x0283:
            int r2 = r2.length     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            int r9 = r9 + r2
            aucj r2 = r3.i()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            tad r2 = (defpackage.tad) r2     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r7.add(r2)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            goto L_0x02d4
        L_0x0297:
            r0 = move-exception
            r2 = r0
            sut r3 = r12.E()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            sur r3 = r3.c     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            java.lang.String r10 = "Failed to merge queued bundle. appId"
            java.lang.Object r13 = defpackage.sut.a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r3.a(r10, r13, r2)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            goto L_0x02d4
        L_0x02a9:
            r22 = r2
            r2 = 0
            r3.write(r14, r2, r13)     // Catch:{ IOException -> 0x02b5 }
            r2 = r22
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x0236
        L_0x02b5:
            r0 = move-exception
            r2 = r0
            sut r3 = r17.E()     // Catch:{ IOException -> 0x02c3 }
            sur r3 = r3.c     // Catch:{ IOException -> 0x02c3 }
            java.lang.String r10 = "Failed to ungzip content"
            r3.a(r10, r2)     // Catch:{ IOException -> 0x02c3 }
            throw r2     // Catch:{ IOException -> 0x02c3 }
        L_0x02c3:
            r0 = move-exception
            r2 = r0
            sut r3 = r12.E()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            sur r3 = r3.c     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            java.lang.String r10 = "Failed to unzip queued bundle. appId"
            java.lang.Object r13 = defpackage.sut.a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            r3.a(r10, r13, r2)     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
        L_0x02d4:
            boolean r2 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r2 == 0) goto L_0x02e4
            if (r9 <= r11) goto L_0x02dd
            goto L_0x02e4
        L_0x02dd:
            r2 = 1
            r3 = 0
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 2
            goto L_0x0218
        L_0x02e4:
            if (r6 == 0) goto L_0x02ea
        L_0x02e6:
            r6.close()     // Catch:{ all -> 0x091c }
            goto L_0x0318
        L_0x02ea:
            goto L_0x0318
        L_0x02eb:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x02f7, all -> 0x02f2 }
            if (r6 == 0) goto L_0x0318
            goto L_0x02e6
        L_0x02f2:
            r0 = move-exception
            r2 = r0
            r9 = r6
            goto L_0x08eb
        L_0x02f7:
            r0 = move-exception
            r2 = r0
            goto L_0x0302
        L_0x02fa:
            r0 = move-exception
            r2 = r0
            r9 = 0
            goto L_0x08eb
        L_0x02ff:
            r0 = move-exception
            r2 = r0
            r6 = 0
        L_0x0302:
            sut r3 = r12.E()     // Catch:{ all -> 0x08e8 }
            sur r3 = r3.c     // Catch:{ all -> 0x08e8 }
            java.lang.String r7 = "Error querying bundles. appId"
            java.lang.Object r9 = defpackage.sut.a((java.lang.String) r8)     // Catch:{ all -> 0x08e8 }
            r3.a(r7, r9, r2)     // Catch:{ all -> 0x08e8 }
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x08e8 }
            if (r6 == 0) goto L_0x0318
            goto L_0x02e6
        L_0x0318:
            boolean r2 = r7.isEmpty()     // Catch:{ all -> 0x091c }
            if (r2 != 0) goto L_0x08e3
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x091c }
        L_0x0322:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x091c }
            if (r3 == 0) goto L_0x033d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x091c }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x091c }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x091c }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x091c }
            java.lang.String r6 = r3.u     // Catch:{ all -> 0x091c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x091c }
            if (r6 != 0) goto L_0x0322
            java.lang.String r2 = r3.u     // Catch:{ all -> 0x091c }
            goto L_0x033e
        L_0x033d:
            r2 = 0
        L_0x033e:
            if (r2 != 0) goto L_0x0341
            goto L_0x036c
        L_0x0341:
            r3 = 0
        L_0x0342:
            int r6 = r7.size()     // Catch:{ all -> 0x091c }
            if (r3 >= r6) goto L_0x036c
            java.lang.Object r6 = r7.get(r3)     // Catch:{ all -> 0x091c }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x091c }
            java.lang.Object r6 = r6.first     // Catch:{ all -> 0x091c }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x091c }
            java.lang.String r9 = r6.u     // Catch:{ all -> 0x091c }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x091c }
            if (r9 == 0) goto L_0x035b
            goto L_0x0369
        L_0x035b:
            java.lang.String r6 = r6.u     // Catch:{ all -> 0x091c }
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x091c }
            if (r6 != 0) goto L_0x0369
            r2 = 0
            java.util.List r7 = r7.subList(r2, r3)     // Catch:{ all -> 0x091c }
            goto L_0x036c
        L_0x0369:
            int r3 = r3 + 1
            goto L_0x0342
        L_0x036c:
            tac r2 = defpackage.tac.b     // Catch:{ all -> 0x091c }
            aucd r2 = r2.o()     // Catch:{ all -> 0x091c }
            int r3 = r7.size()     // Catch:{ all -> 0x091c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x091c }
            int r9 = r7.size()     // Catch:{ all -> 0x091c }
            r6.<init>(r9)     // Catch:{ all -> 0x091c }
            spg r9 = r28.d()     // Catch:{ all -> 0x091c }
            boolean r9 = r9.d(r8)     // Catch:{ all -> 0x091c }
            r10 = 0
        L_0x0388:
            if (r10 >= r3) goto L_0x043d
            java.lang.Object r13 = r7.get(r10)     // Catch:{ all -> 0x091c }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x091c }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x091c }
            tad r13 = (defpackage.tad) r13     // Catch:{ all -> 0x091c }
            r14 = 5
            java.lang.Object r14 = r13.c(r14)     // Catch:{ all -> 0x091c }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ all -> 0x091c }
            r14.a((defpackage.aucj) r13)     // Catch:{ all -> 0x091c }
            java.lang.Object r13 = r7.get(r10)     // Catch:{ all -> 0x091c }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x091c }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x091c }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x091c }
            r6.add(r13)     // Catch:{ all -> 0x091c }
            spg r13 = r28.d()     // Catch:{ all -> 0x091c }
            long r11 = r13.b()     // Catch:{ all -> 0x091c }
            boolean r13 = r14.c     // Catch:{ all -> 0x091c }
            if (r13 != 0) goto L_0x03b8
            goto L_0x03be
        L_0x03b8:
            r14.c()     // Catch:{ all -> 0x091c }
            r13 = 0
            r14.c = r13     // Catch:{ all -> 0x091c }
        L_0x03be:
            aucj r13 = r14.b     // Catch:{ all -> 0x091c }
            tad r13 = (defpackage.tad) r13     // Catch:{ all -> 0x091c }
            tad r17 = defpackage.tad.P     // Catch:{ all -> 0x091c }
            int r15 = r13.a     // Catch:{ all -> 0x091c }
            r16 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 | r16
            r13.a = r15     // Catch:{ all -> 0x091c }
            r13.t = r11     // Catch:{ all -> 0x091c }
            r11 = r15 | 2
            r13.a = r11     // Catch:{ all -> 0x091c }
            r13.f = r4     // Catch:{ all -> 0x091c }
            spc r11 = r28.a()     // Catch:{ all -> 0x091c }
            boolean r11 = r11.a     // Catch:{ all -> 0x091c }
            boolean r12 = r14.c     // Catch:{ all -> 0x091c }
            if (r12 != 0) goto L_0x03e0
            goto L_0x03e6
        L_0x03e0:
            r14.c()     // Catch:{ all -> 0x091c }
            r12 = 0
            r14.c = r12     // Catch:{ all -> 0x091c }
        L_0x03e6:
            aucj r12 = r14.b     // Catch:{ all -> 0x091c }
            tad r12 = (defpackage.tad) r12     // Catch:{ all -> 0x091c }
            int r13 = r12.a     // Catch:{ all -> 0x091c }
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r13 | r15
            r12.a = r13     // Catch:{ all -> 0x091c }
            r12.B = r11     // Catch:{ all -> 0x091c }
            if (r9 != 0) goto L_0x0401
            r11 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r13
            r12.a = r11     // Catch:{ all -> 0x091c }
            tad r11 = defpackage.tad.P     // Catch:{ all -> 0x091c }
            java.lang.String r11 = r11.I     // Catch:{ all -> 0x091c }
            r12.I = r11     // Catch:{ all -> 0x091c }
        L_0x0401:
            spg r11 = r28.d()     // Catch:{ all -> 0x091c }
            suc r12 = defpackage.sud.Y     // Catch:{ all -> 0x091c }
            boolean r11 = r11.b(r8, r12)     // Catch:{ all -> 0x091c }
            if (r11 == 0) goto L_0x0436
            aucj r11 = r14.i()     // Catch:{ all -> 0x091c }
            tad r11 = (defpackage.tad) r11     // Catch:{ all -> 0x091c }
            byte[] r11 = r11.k()     // Catch:{ all -> 0x091c }
            szg r12 = r28.l()     // Catch:{ all -> 0x091c }
            long r11 = r12.a((byte[]) r11)     // Catch:{ all -> 0x091c }
            boolean r13 = r14.c     // Catch:{ all -> 0x091c }
            if (r13 != 0) goto L_0x0424
            goto L_0x042a
        L_0x0424:
            r14.c()     // Catch:{ all -> 0x091c }
            r13 = 0
            r14.c = r13     // Catch:{ all -> 0x091c }
        L_0x042a:
            aucj r13 = r14.b     // Catch:{ all -> 0x091c }
            tad r13 = (defpackage.tad) r13     // Catch:{ all -> 0x091c }
            int r15 = r13.b     // Catch:{ all -> 0x091c }
            r15 = r15 | 32
            r13.b = r15     // Catch:{ all -> 0x091c }
            r13.O = r11     // Catch:{ all -> 0x091c }
        L_0x0436:
            r2.q((defpackage.aucd) r14)     // Catch:{ all -> 0x091c }
            int r10 = r10 + 1
            goto L_0x0388
        L_0x043d:
            sut r7 = r28.E()     // Catch:{ all -> 0x091c }
            r9 = 2
            boolean r7 = r7.a((int) r9)     // Catch:{ all -> 0x091c }
            if (r7 == 0) goto L_0x0836
            szg r7 = r28.l()     // Catch:{ all -> 0x091c }
            aucj r9 = r2.i()     // Catch:{ all -> 0x091c }
            tac r9 = (defpackage.tac) r9     // Catch:{ all -> 0x091c }
            if (r9 == 0) goto L_0x082f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x091c }
            r10.<init>()     // Catch:{ all -> 0x091c }
            java.lang.String r11 = "\nbatch {\n"
            r10.append(r11)     // Catch:{ all -> 0x091c }
            aucx r9 = r9.a     // Catch:{ all -> 0x091c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x091c }
        L_0x0464:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x091c }
            java.lang.String r12 = "}\n"
            if (r11 != 0) goto L_0x0479
            r10.append(r12)     // Catch:{ all -> 0x091c }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x091c }
            r26 = r4
            r4 = r8
            r5 = r3
            goto L_0x083b
        L_0x0479:
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x091c }
            tad r11 = (defpackage.tad) r11     // Catch:{ all -> 0x091c }
            if (r11 == 0) goto L_0x0820
            r13 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r13)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "bundle {\n"
            r10.append(r13)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 1
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0492
            r15 = 1
            goto L_0x049e
        L_0x0492:
            java.lang.String r13 = "protocol_version"
            int r14 = r11.c     // Catch:{ all -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x049e:
            java.lang.String r13 = "platform"
            java.lang.String r14 = r11.k     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r13 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x04b7
            java.lang.String r13 = "gmp_version"
            long r14 = r11.s     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x04b7:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x04cb
            java.lang.String r13 = "uploading_gmp_version"
            long r14 = r11.t     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x04cb:
            int r13 = r11.b     // Catch:{ all -> 0x091c }
            r13 = r13 & 16
            if (r13 == 0) goto L_0x04dd
            java.lang.String r13 = "dynamite_version"
            long r14 = r11.N     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x04dd:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x04e6
            r15 = 1
            goto L_0x04f2
        L_0x04e6:
            java.lang.String r13 = "config_version"
            long r14 = r11.G     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x04f2:
            java.lang.String r13 = "gmp_app_id"
            java.lang.String r14 = r11.A     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "admob_app_id"
            java.lang.String r14 = r11.K     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "app_id"
            java.lang.String r14 = r11.q     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "app_version"
            java.lang.String r14 = r11.r     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 33554432(0x2000000, float:9.403955E-38)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0517
            r15 = 1
            goto L_0x0523
        L_0x0517:
            java.lang.String r13 = "app_version_major"
            int r14 = r11.E     // Catch:{ all -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x0523:
            java.lang.String r13 = "firebase_instance_id"
            java.lang.String r14 = r11.D     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 524288(0x80000, float:7.34684E-40)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0533
            r15 = 1
            goto L_0x053f
        L_0x0533:
            java.lang.String r13 = "dev_cert_hash"
            long r14 = r11.x     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x053f:
            java.lang.String r13 = "app_store"
            java.lang.String r14 = r11.p     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0558
            java.lang.String r13 = "upload_timestamp_millis"
            long r14 = r11.f     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x0558:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r13 = r13 & 4
            if (r13 == 0) goto L_0x056a
            java.lang.String r13 = "start_timestamp_millis"
            long r14 = r11.g     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x056a:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r13 = r13 & 8
            if (r13 == 0) goto L_0x057c
            java.lang.String r13 = "end_timestamp_millis"
            long r14 = r11.h     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x057c:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r13 = r13 & 16
            if (r13 == 0) goto L_0x058e
            java.lang.String r13 = "previous_bundle_start_timestamp_millis"
            long r14 = r11.i     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x058e:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r13 = r13 & 32
            if (r13 != 0) goto L_0x0596
            r15 = 1
            goto L_0x05a2
        L_0x0596:
            java.lang.String r13 = "previous_bundle_end_timestamp_millis"
            long r14 = r11.j     // Catch:{ all -> 0x091c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x05a2:
            java.lang.String r13 = "app_instance_id"
            java.lang.String r14 = r11.w     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "resettable_device_id"
            java.lang.String r14 = r11.u     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "device_id"
            java.lang.String r14 = r11.F     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "ds_id"
            java.lang.String r14 = r11.I     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 131072(0x20000, float:1.83671E-40)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x05c7
            r15 = 1
            goto L_0x05d3
        L_0x05c7:
            java.lang.String r13 = "limited_ad_tracking"
            boolean r14 = r11.v     // Catch:{ all -> 0x091c }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x05d3:
            java.lang.String r13 = "os_version"
            java.lang.String r14 = r11.l     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "device_model"
            java.lang.String r14 = r11.m     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            java.lang.String r13 = "user_default_language"
            java.lang.String r14 = r11.n     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 1024(0x400, float:1.435E-42)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x05fb
            java.lang.String r13 = "time_zone_offset_minutes"
            int r15 = r11.o     // Catch:{ all -> 0x091c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x091c }
            r14 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r13, (java.lang.Object) r15)     // Catch:{ all -> 0x091c }
        L_0x05fb:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 1048576(0x100000, float:1.469368E-39)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x060e
            java.lang.String r13 = "bundle_sequential_index"
            int r14 = r11.y     // Catch:{ all -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x060e:
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0617
            r14 = 1
            goto L_0x0623
        L_0x0617:
            java.lang.String r13 = "service_upload"
            boolean r15 = r11.B     // Catch:{ all -> 0x091c }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x091c }
            r14 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r13, (java.lang.Object) r15)     // Catch:{ all -> 0x091c }
        L_0x0623:
            java.lang.String r13 = "health_monitor"
            java.lang.String r15 = r11.z     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r13, (java.lang.Object) r15)     // Catch:{ all -> 0x091c }
            spg r13 = r7.v()     // Catch:{ all -> 0x091c }
            suc r14 = defpackage.sud.aQ     // Catch:{ all -> 0x091c }
            boolean r13 = r13.a((defpackage.suc) r14)     // Catch:{ all -> 0x091c }
            if (r13 != 0) goto L_0x0650
            int r13 = r11.a     // Catch:{ all -> 0x091c }
            r14 = 1073741824(0x40000000, float:2.0)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0650
            long r13 = r11.H     // Catch:{ all -> 0x091c }
            r22 = 0
            int r15 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r15 == 0) goto L_0x0652
            java.lang.String r15 = "android_id"
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x091c }
            r14 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r15, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
            goto L_0x0652
        L_0x0650:
            r22 = 0
        L_0x0652:
            int r13 = r11.b     // Catch:{ all -> 0x091c }
            r14 = 2
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0664
            java.lang.String r13 = "retry_counter"
            int r14 = r11.J     // Catch:{ all -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x091c }
            r15 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r13, (java.lang.Object) r14)     // Catch:{ all -> 0x091c }
        L_0x0664:
            aucx r13 = r11.e     // Catch:{ all -> 0x091c }
            java.lang.String r14 = "name"
            if (r13 == 0) goto L_0x0709
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x091c }
        L_0x066e:
            boolean r15 = r13.hasNext()     // Catch:{ all -> 0x091c }
            if (r15 == 0) goto L_0x0702
            java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x091c }
            tah r15 = (defpackage.tah) r15     // Catch:{ all -> 0x091c }
            if (r15 == 0) goto L_0x06f6
            r24 = r9
            r9 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9)     // Catch:{ all -> 0x091c }
            java.lang.String r9 = "user_property {\n"
            r10.append(r9)     // Catch:{ all -> 0x091c }
            java.lang.String r9 = "set_timestamp_millis"
            r25 = r13
            int r13 = r15.a     // Catch:{ all -> 0x091c }
            r18 = 1
            r13 = r13 & 1
            if (r13 == 0) goto L_0x069d
            r26 = r4
            r5 = r3
            long r3 = r15.b     // Catch:{ all -> 0x091c }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x091c }
            goto L_0x06a1
        L_0x069d:
            r26 = r4
            r5 = r3
            r3 = 0
        L_0x06a1:
            r4 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r4, (java.lang.String) r9, (java.lang.Object) r3)     // Catch:{ all -> 0x091c }
            suk r3 = r7.y()     // Catch:{ all -> 0x091c }
            java.lang.String r4 = r15.c     // Catch:{ all -> 0x091c }
            java.lang.String r3 = r3.c(r4)     // Catch:{ all -> 0x091c }
            r4 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r4, (java.lang.String) r14, (java.lang.Object) r3)     // Catch:{ all -> 0x091c }
            java.lang.String r3 = "string_value"
            java.lang.String r9 = r15.d     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r4, (java.lang.String) r3, (java.lang.Object) r9)     // Catch:{ all -> 0x091c }
            java.lang.String r3 = "int_value"
            int r4 = r15.a     // Catch:{ all -> 0x091c }
            r4 = r4 & 8
            if (r4 == 0) goto L_0x06cb
            r4 = r8
            long r8 = r15.e     // Catch:{ all -> 0x091c }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x091c }
            goto L_0x06cd
        L_0x06cb:
            r4 = r8
            r8 = 0
        L_0x06cd:
            r9 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9, (java.lang.String) r3, (java.lang.Object) r8)     // Catch:{ all -> 0x091c }
            java.lang.String r3 = "double_value"
            int r8 = r15.a     // Catch:{ all -> 0x091c }
            r8 = r8 & 32
            if (r8 == 0) goto L_0x06e0
            double r8 = r15.f     // Catch:{ all -> 0x091c }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ all -> 0x091c }
            goto L_0x06e1
        L_0x06e0:
            r8 = 0
        L_0x06e1:
            r9 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9, (java.lang.String) r3, (java.lang.Object) r8)     // Catch:{ all -> 0x091c }
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9)     // Catch:{ all -> 0x091c }
            r10.append(r12)     // Catch:{ all -> 0x091c }
            r8 = r4
            r3 = r5
            r9 = r24
            r13 = r25
            r4 = r26
            goto L_0x066e
        L_0x06f6:
            r26 = r4
            r4 = r8
            r24 = r9
            r25 = r13
            r5 = r3
            r4 = r26
            goto L_0x066e
        L_0x0702:
            r26 = r4
            r4 = r8
            r24 = r9
            r5 = r3
            goto L_0x070f
        L_0x0709:
            r26 = r4
            r4 = r8
            r24 = r9
            r5 = r3
        L_0x070f:
            aucx r3 = r11.C     // Catch:{ all -> 0x091c }
            if (r3 == 0) goto L_0x078b
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x091c }
        L_0x0717:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x091c }
            if (r8 == 0) goto L_0x078b
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x091c }
            szx r8 = (defpackage.szx) r8     // Catch:{ all -> 0x091c }
            if (r8 == 0) goto L_0x0717
            r9 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9)     // Catch:{ all -> 0x091c }
            java.lang.String r9 = "audience_membership {\n"
            r10.append(r9)     // Catch:{ all -> 0x091c }
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r13 = 1
            r9 = r9 & r13
            if (r9 == 0) goto L_0x0740
            java.lang.String r9 = "audience_id"
            int r13 = r8.b     // Catch:{ all -> 0x091c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x091c }
            r15 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
        L_0x0740:
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0752
            java.lang.String r9 = "new_audience"
            boolean r13 = r8.e     // Catch:{ all -> 0x091c }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x091c }
            r15 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r15, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
        L_0x0752:
            java.lang.String r9 = "current_data"
            taf r13 = r8.c     // Catch:{ all -> 0x091c }
            if (r13 != 0) goto L_0x075a
            taf r13 = defpackage.taf.e     // Catch:{ all -> 0x091c }
        L_0x075a:
            defpackage.szg.a((java.lang.StringBuilder) r10, (java.lang.String) r9, (defpackage.taf) r13)     // Catch:{ all -> 0x091c }
            boolean r9 = defpackage.ayjn.b()     // Catch:{ all -> 0x091c }
            if (r9 != 0) goto L_0x0764
        L_0x0763:
            goto L_0x0777
        L_0x0764:
            spg r9 = r7.v()     // Catch:{ all -> 0x091c }
            suc r13 = defpackage.sud.aJ     // Catch:{ all -> 0x091c }
            boolean r9 = r9.a((defpackage.suc) r13)     // Catch:{ all -> 0x091c }
            if (r9 == 0) goto L_0x0763
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r9 = r9 & 4
            if (r9 == 0) goto L_0x0782
            goto L_0x0763
        L_0x0777:
            java.lang.String r9 = "previous_data"
            taf r8 = r8.d     // Catch:{ all -> 0x091c }
            if (r8 != 0) goto L_0x077f
            taf r8 = defpackage.taf.e     // Catch:{ all -> 0x091c }
        L_0x077f:
            defpackage.szg.a((java.lang.StringBuilder) r10, (java.lang.String) r9, (defpackage.taf) r8)     // Catch:{ all -> 0x091c }
        L_0x0782:
            r8 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r8)     // Catch:{ all -> 0x091c }
            r10.append(r12)     // Catch:{ all -> 0x091c }
            goto L_0x0717
        L_0x078b:
            aucx r3 = r11.d     // Catch:{ all -> 0x091c }
            if (r3 != 0) goto L_0x0792
            r9 = 2
            goto L_0x0810
        L_0x0792:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x091c }
        L_0x0796:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x091c }
            if (r8 == 0) goto L_0x080f
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x091c }
            szz r8 = (defpackage.szz) r8     // Catch:{ all -> 0x091c }
            if (r8 == 0) goto L_0x080c
            r9 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9)     // Catch:{ all -> 0x091c }
            java.lang.String r9 = "event {\n"
            r10.append(r9)     // Catch:{ all -> 0x091c }
            suk r9 = r7.y()     // Catch:{ all -> 0x091c }
            java.lang.String r11 = r8.c     // Catch:{ all -> 0x091c }
            java.lang.String r9 = r9.a((java.lang.String) r11)     // Catch:{ all -> 0x091c }
            r11 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r11, (java.lang.String) r14, (java.lang.Object) r9)     // Catch:{ all -> 0x091c }
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r9 = r9 & r11
            if (r9 == 0) goto L_0x07ce
            java.lang.String r9 = "timestamp_millis"
            r11 = r14
            long r13 = r8.d     // Catch:{ all -> 0x091c }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x091c }
            r14 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
            goto L_0x07cf
        L_0x07ce:
            r11 = r14
        L_0x07cf:
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r9 = r9 & 4
            if (r9 == 0) goto L_0x07e1
            java.lang.String r9 = "previous_timestamp_millis"
            long r13 = r8.e     // Catch:{ all -> 0x091c }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x091c }
            r14 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
        L_0x07e1:
            int r9 = r8.a     // Catch:{ all -> 0x091c }
            r9 = r9 & 8
            if (r9 == 0) goto L_0x07f3
            java.lang.String r9 = "count"
            int r13 = r8.f     // Catch:{ all -> 0x091c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x091c }
            r14 = 2
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r14, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x091c }
        L_0x07f3:
            aucx r9 = r8.b     // Catch:{ all -> 0x091c }
            int r9 = r9.size()     // Catch:{ all -> 0x091c }
            if (r9 != 0) goto L_0x07fd
            r9 = 2
            goto L_0x0803
        L_0x07fd:
            aucx r8 = r8.b     // Catch:{ all -> 0x091c }
            r9 = 2
            r7.a((java.lang.StringBuilder) r10, (int) r9, (java.util.List) r8)     // Catch:{ all -> 0x091c }
        L_0x0803:
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r9)     // Catch:{ all -> 0x091c }
            r10.append(r12)     // Catch:{ all -> 0x091c }
            r14 = r11
            goto L_0x0796
        L_0x080c:
            r11 = r14
            r9 = 2
            goto L_0x0796
        L_0x080f:
            r9 = 2
        L_0x0810:
            r3 = 1
            defpackage.szg.a((java.lang.StringBuilder) r10, (int) r3)     // Catch:{ all -> 0x091c }
            r10.append(r12)     // Catch:{ all -> 0x091c }
            r8 = r4
            r3 = r5
            r9 = r24
            r4 = r26
            goto L_0x0464
        L_0x0820:
            r26 = r4
            r4 = r8
            r24 = r9
            r9 = 2
            r22 = 0
            r5 = r3
            r9 = r24
            r4 = r26
            goto L_0x0464
        L_0x082f:
            r26 = r4
            r4 = r8
            r5 = r3
            java.lang.String r9 = ""
            goto L_0x083b
        L_0x0836:
            r26 = r4
            r4 = r8
            r5 = r3
            r9 = 0
        L_0x083b:
            r28.l()     // Catch:{ all -> 0x091c }
            aucj r3 = r2.i()     // Catch:{ all -> 0x091c }
            tac r3 = (defpackage.tac) r3     // Catch:{ all -> 0x091c }
            byte[] r14 = r3.k()     // Catch:{ all -> 0x091c }
            r28.d()     // Catch:{ all -> 0x091c }
            suc r3 = defpackage.sud.q     // Catch:{ all -> 0x091c }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x091c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x091c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x08d3 }
            r13.<init>(r3)     // Catch:{ MalformedURLException -> 0x08d3 }
            boolean r7 = r6.isEmpty()     // Catch:{ MalformedURLException -> 0x08d3 }
            r8 = 1
            r7 = r7 ^ r8
            defpackage.iva.b((boolean) r7)     // Catch:{ MalformedURLException -> 0x08d3 }
            java.util.List r7 = r1.n     // Catch:{ MalformedURLException -> 0x08d3 }
            if (r7 == 0) goto L_0x0871
            sut r6 = r28.E()     // Catch:{ MalformedURLException -> 0x08d3 }
            sur r6 = r6.c     // Catch:{ MalformedURLException -> 0x08d3 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r6.a(r7)     // Catch:{ MalformedURLException -> 0x08d3 }
            goto L_0x0878
        L_0x0871:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x08d3 }
            r7.<init>(r6)     // Catch:{ MalformedURLException -> 0x08d3 }
            r1.n = r7     // Catch:{ MalformedURLException -> 0x08d3 }
        L_0x0878:
            svf r6 = r28.e()     // Catch:{ MalformedURLException -> 0x08d3 }
            svc r6 = r6.e     // Catch:{ MalformedURLException -> 0x08d3 }
            r7 = r26
            r6.a(r7)     // Catch:{ MalformedURLException -> 0x08d3 }
            java.lang.String r6 = "?"
            if (r5 <= 0) goto L_0x0896
            aucj r2 = r2.b     // Catch:{ MalformedURLException -> 0x08d3 }
            tac r2 = (defpackage.tac) r2     // Catch:{ MalformedURLException -> 0x08d3 }
            aucx r2 = r2.a     // Catch:{ MalformedURLException -> 0x08d3 }
            r5 = 0
            java.lang.Object r2 = r2.get(r5)     // Catch:{ MalformedURLException -> 0x08d3 }
            tad r2 = (defpackage.tad) r2     // Catch:{ MalformedURLException -> 0x08d3 }
            java.lang.String r6 = r2.q     // Catch:{ MalformedURLException -> 0x08d3 }
        L_0x0896:
            sut r2 = r28.E()     // Catch:{ MalformedURLException -> 0x08d3 }
            sur r2 = r2.k     // Catch:{ MalformedURLException -> 0x08d3 }
            java.lang.String r5 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x08d3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x08d3 }
            r2.a(r5, r6, r7, r9)     // Catch:{ MalformedURLException -> 0x08d3 }
            r2 = 1
            r1.m = r2     // Catch:{ MalformedURLException -> 0x08d3 }
            sux r11 = r28.g()     // Catch:{ MalformedURLException -> 0x08d3 }
            syz r2 = new syz     // Catch:{ MalformedURLException -> 0x08d3 }
            r2.<init>(r1)     // Catch:{ MalformedURLException -> 0x08d3 }
            r11.h()     // Catch:{ MalformedURLException -> 0x08d3 }
            r11.q()     // Catch:{ MalformedURLException -> 0x08d3 }
            defpackage.iva.a((java.lang.Object) r13)     // Catch:{ MalformedURLException -> 0x08d3 }
            defpackage.iva.a((java.lang.Object) r14)     // Catch:{ MalformedURLException -> 0x08d3 }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ MalformedURLException -> 0x08d3 }
            svs r5 = r11.F()     // Catch:{ MalformedURLException -> 0x08d3 }
            suw r6 = new suw     // Catch:{ MalformedURLException -> 0x08d3 }
            r15 = 0
            r10 = r6
            r12 = r4
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x08d3 }
            r5.b(r6)     // Catch:{ MalformedURLException -> 0x08d3 }
            goto L_0x08e3
        L_0x08d3:
            r0 = move-exception
            sut r2 = r28.E()     // Catch:{ all -> 0x091c }
            sur r2 = r2.c     // Catch:{ all -> 0x091c }
            java.lang.String r5 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x091c }
            r2.a(r5, r4, r3)     // Catch:{ all -> 0x091c }
        L_0x08e3:
            r2 = 0
            r1.v = r2
            goto L_0x002b
        L_0x08e8:
            r0 = move-exception
            r2 = r0
            r9 = r6
        L_0x08eb:
            if (r9 == 0) goto L_0x08f0
            r9.close()     // Catch:{ all -> 0x091c }
        L_0x08f0:
            throw r2     // Catch:{ all -> 0x091c }
        L_0x08f1:
            sut r2 = r28.E()     // Catch:{ all -> 0x091c }
            sur r2 = r2.k     // Catch:{ all -> 0x091c }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r2.a(r3)     // Catch:{ all -> 0x091c }
            r28.w()     // Catch:{ all -> 0x091c }
            r2 = 0
            r1.v = r2
            goto L_0x002b
        L_0x0904:
            sut r2 = r28.E()     // Catch:{ all -> 0x091c }
            sur r2 = r2.k     // Catch:{ all -> 0x091c }
            java.lang.String r3 = "Uploading requested multiple times"
            r2.a(r3)     // Catch:{ all -> 0x091c }
            r2 = 0
            r1.v = r2
            goto L_0x002b
        L_0x0914:
            r28.w()     // Catch:{ all -> 0x091c }
            r2 = 0
            r1.v = r2
            goto L_0x002b
        L_0x091c:
            r0 = move-exception
            r2 = r0
            r3 = 0
            r1.v = r3
            r28.x()
            goto L_0x0926
        L_0x0925:
            throw r2
        L_0x0926:
            goto L_0x0925
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.u():void");
    }

    public final boolean v() {
        r();
        s();
        return h().a("select count(1) > 0 from raw_events", (String[]) null) != 0 || !TextUtils.isEmpty(h().g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r18 = this;
            r0 = r18
            r18.r()
            r18.s()
            long r1 = r0.i
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0047
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            jiq r5 = r18.o()
            long r5 = r5.b()
            long r7 = r0.i
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0045
            sut r3 = r18.E()
            sur r3 = r3.k
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.a(r2, r1)
            suz r1 = r18.i()
            r1.a()
            syv r1 = r18.j()
            r1.b()
            return
        L_0x0045:
            r0.i = r3
        L_0x0047:
            svv r1 = r0.g
            boolean r1 = r1.v()
            if (r1 == 0) goto L_0x03bf
            boolean r1 = r18.v()
            if (r1 != 0) goto L_0x0057
            goto L_0x03bf
        L_0x0057:
            jiq r1 = r18.o()
            long r1 = r1.a()
            r18.d()
            suc r5 = defpackage.sud.A
            java.lang.Object r5 = r5.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            spj r7 = r18.h()
            java.lang.String r8 = "select count(1) > 0 from raw_events where realtime = 1"
            r9 = 0
            long r7 = r7.a((java.lang.String) r8, (java.lang.String[]) r9)
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0091
            spj r7 = r18.h()
            java.lang.String r8 = "select count(1) > 0 from queue where has_realtime = 1"
            long r7 = r7.a((java.lang.String) r8, (java.lang.String[]) r9)
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x0091
            r7 = 0
            goto L_0x0092
        L_0x0091:
            r7 = 1
        L_0x0092:
            if (r7 != 0) goto L_0x00a8
            r18.d()
            suc r8 = defpackage.sud.t
            java.lang.Object r8 = r8.a()
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            goto L_0x00e6
        L_0x00a8:
            spg r8 = r18.d()
            java.lang.String r8 = r8.g()
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x00d3
            java.lang.String r12 = ".none."
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x00bf
            goto L_0x00d3
        L_0x00bf:
            r18.d()
            suc r8 = defpackage.sud.v
            java.lang.Object r8 = r8.a()
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            goto L_0x00e6
        L_0x00d3:
            r18.d()
            suc r8 = defpackage.sud.u
            java.lang.Object r8 = r8.a()
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            long r12 = java.lang.Math.max(r3, r12)
        L_0x00e6:
            svf r8 = r18.e()
            svc r8 = r8.d
            long r14 = r8.a()
            svf r8 = r18.e()
            svc r8 = r8.e
            long r16 = r8.a()
            spj r8 = r18.h()
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r8.a((java.lang.String) r11, (java.lang.String[]) r9, (long) r3)
            spj r8 = r18.h()
            java.lang.String r0 = "select max(timestamp) from raw_events"
            long r8 = r8.a((java.lang.String) r0, (java.lang.String[]) r9, (long) r3)
            long r8 = java.lang.Math.max(r10, r8)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0191
            long r8 = r8 - r1
            long r8 = java.lang.Math.abs(r8)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r16 = r16 - r1
            long r14 = java.lang.Math.abs(r16)
            long r14 = r1 - r14
            long r1 = r1 - r10
            long r0 = java.lang.Math.max(r1, r14)
            long r5 = r5 + r8
            if (r7 == 0) goto L_0x013c
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x013c
            long r5 = java.lang.Math.min(r8, r0)
            long r5 = r5 + r12
            goto L_0x013d
        L_0x013c:
        L_0x013d:
            szg r2 = r18.l()
            boolean r2 = r2.a((long) r0, (long) r12)
            if (r2 != 0) goto L_0x014a
            long r5 = r0 + r12
            goto L_0x014b
        L_0x014a:
        L_0x014b:
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0190
            r0 = 0
        L_0x0154:
            r18.d()
            r1 = 20
            suc r2 = defpackage.sud.C
            java.lang.Object r2 = r2.a()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            int r1 = java.lang.Math.min(r1, r2)
            if (r0 >= r1) goto L_0x0191
            r18.d()
            suc r1 = defpackage.sud.B
            java.lang.Object r1 = r1.a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.max(r3, r1)
            r8 = 1
            long r8 = r8 << r0
            long r1 = r1 * r8
            long r5 = r5 + r1
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x0192
            int r0 = r0 + 1
            goto L_0x0154
        L_0x0190:
            goto L_0x0192
        L_0x0191:
            r5 = r3
        L_0x0192:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            sut r0 = r18.E()
            sur r0 = r0.k
            java.lang.String r1 = "Next upload time is 0"
            r0.a(r1)
            suz r0 = r18.i()
            r0.a()
            syv r0 = r18.j()
            r0.b()
            return
        L_0x01b0:
            sux r0 = r18.g()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x020d
            sut r0 = r18.E()
            sur r0 = r0.k
            java.lang.String r1 = "No network"
            r0.a(r1)
            suz r0 = r18.i()
            sze r1 = r0.a
            r1.s()
            sze r1 = r0.a
            r1.r()
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0205
            android.content.Context r1 = r0.b()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            sze r1 = r0.a
            sux r1 = r1.g()
            boolean r1 = r1.c()
            r0.c = r1
            sut r1 = r0.c()
            sur r1 = r1.k
            boolean r2 = r0.c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "Registering connectivity change receiver. Network connected"
            r1.a(r3, r2)
            r1 = 1
            r0.b = r1
        L_0x0205:
            syv r0 = r18.j()
            r0.b()
            return
        L_0x020d:
            svf r0 = r18.e()
            svc r0 = r0.f
            long r0 = r0.a()
            r18.d()
            suc r2 = defpackage.sud.r
            java.lang.Object r2 = r2.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r7 = r2.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            szg r2 = r18.l()
            boolean r2 = r2.a((long) r0, (long) r7)
            if (r2 != 0) goto L_0x023a
            long r0 = r0 + r7
            long r5 = java.lang.Math.max(r5, r0)
            goto L_0x023b
        L_0x023a:
        L_0x023b:
            suz r0 = r18.i()
            r0.a()
            jiq r0 = r18.o()
            long r0 = r0.a()
            long r5 = r5 - r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0274
            r18.d()
            suc r0 = defpackage.sud.w
            java.lang.Object r0 = r0.a()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r5 = java.lang.Math.max(r3, r0)
            svf r0 = r18.e()
            svc r0 = r0.d
            jiq r1 = r18.o()
            long r1 = r1.a()
            r0.a(r1)
            goto L_0x0275
        L_0x0274:
        L_0x0275:
            sut r0 = r18.E()
            sur r0 = r0.k
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "Upload scheduled in approximately ms"
            r0.a(r2, r1)
            syv r0 = r18.j()
            r0.q()
            spc r2 = r0.u()
            boolean r2 = r2.a
            if (r2 != 0) goto L_0x02b9
            android.content.Context r2 = r0.z()
            boolean r7 = defpackage.svm.a(r2)
            if (r7 != 0) goto L_0x02a8
            sut r7 = r0.E()
            sur r7 = r7.j
            java.lang.String r8 = "Receiver not registered/enabled"
            r7.a(r8)
        L_0x02a8:
            boolean r2 = defpackage.szj.a((android.content.Context) r2)
            if (r2 != 0) goto L_0x02b9
            sut r2 = r0.E()
            sur r2 = r2.j
            java.lang.String r7 = "Service not registered/enabled"
            r2.a(r7)
        L_0x02b9:
            r0.b()
            boolean r2 = r0.f()
            if (r2 == 0) goto L_0x02cd
            sut r2 = r0.E()
            sur r2 = r2.k
            java.lang.String r7 = "Scheduling upload, millis"
            r2.a(r7, r1)
        L_0x02cd:
            jiq r1 = r0.A()
            long r1 = r1.b()
            long r9 = r1 + r5
            r0.v()
            suc r1 = defpackage.sud.x
            java.lang.Object r1 = r1.a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.max(r3, r1)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x030c
            spm r1 = r0.b
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x030c
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0307
            sut r1 = r0.E()
            sur r1 = r1.k
            java.lang.String r2 = "Scheduling upload with DelayedRunnable"
            r1.a(r2)
        L_0x0307:
            spm r1 = r0.b
            r1.a(r5)
        L_0x030c:
            spc r1 = r0.u()
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0329
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0325
            sut r1 = r0.E()
            sur r1 = r1.k
            java.lang.String r2 = "Scheduling upload with GcmTaskService"
            r1.a(r2)
        L_0x0325:
            r0.a(r5)
            return
        L_0x0329:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L_0x038f
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0340
            sut r1 = r0.E()
            sur r1 = r1.k
            java.lang.String r2 = "Scheduling upload with JobScheduler"
            r1.a(r2)
        L_0x0340:
            android.content.Context r1 = r0.z()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r2.<init>(r1, r3)
            int r3 = r0.d()
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r4.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r3, r2)
            android.app.job.JobInfo$Builder r2 = r7.setMinimumLatency(r5)
            long r5 = r5 + r5
            android.app.job.JobInfo$Builder r2 = r2.setOverrideDeadline(r5)
            android.app.job.JobInfo$Builder r2 = r2.setExtras(r4)
            android.app.job.JobInfo r2 = r2.build()
            boolean r4 = r0.f()
            if (r4 != 0) goto L_0x0386
            sut r0 = r0.E()
            sur r0 = r0.k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Scheduling job. JobID"
            r0.a(r4, r3)
        L_0x0386:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r3 = "UploadAlarm"
            defpackage.qvg.a((android.content.Context) r1, (android.app.job.JobInfo) r2, (java.lang.String) r0, (java.lang.String) r3)
            return
        L_0x038f:
            boolean r1 = r0.f()
            if (r1 == 0) goto L_0x0396
            goto L_0x03a1
        L_0x0396:
            sut r1 = r0.E()
            sur r1 = r1.k
            java.lang.String r2 = "Scheduling upload with AlarmManager"
            r1.a(r2)
        L_0x03a1:
            android.app.AlarmManager r7 = r0.a
            r0.v()
            r8 = 2
            suc r1 = defpackage.sud.s
            java.lang.Object r1 = r1.a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r11 = java.lang.Math.max(r1, r5)
            android.app.PendingIntent r13 = r0.e()
            r7.setInexactRepeating(r8, r9, r11, r13)
            return
        L_0x03bf:
            sut r0 = r18.E()
            sur r0 = r0.k
            java.lang.String r1 = "Nothing to upload or uploading impossible"
            r0.a(r1)
            suz r0 = r18.i()
            r0.a()
            syv r0 = r18.j()
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.w():void");
    }

    public final void x() {
        r();
        if (!this.u && !this.m && !this.v) {
            E().k.a("Stopping uploading service(s)");
            List list = this.j;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Runnable) list.get(i2)).run();
                }
                this.j.clear();
                return;
            }
            return;
        }
        E().k.a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.u), Boolean.valueOf(this.m), Boolean.valueOf(this.v));
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        r();
        s();
        if (!this.t) {
            this.t = true;
            if (z()) {
                FileChannel fileChannel = this.x;
                r();
                int i2 = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    E().c.a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i2 = allocate.getInt();
                        } else if (read != -1) {
                            E().f.a("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e2) {
                        E().c.a("Failed to read from channel", e2);
                    }
                }
                int r2 = this.g.n().r();
                r();
                if (i2 > r2) {
                    E().c.a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i2), Integer.valueOf(r2));
                } else if (i2 < r2) {
                    FileChannel fileChannel2 = this.x;
                    r();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        E().c.a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(r2);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            if (d().a(sud.aF)) {
                                int i3 = Build.VERSION.SDK_INT;
                            }
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                E().c.a("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            E().k.a("Storage version upgraded. Previous, current version", Integer.valueOf(i2), Integer.valueOf(r2));
                            return;
                        } catch (IOException e3) {
                            E().c.a("Failed to write to channel", e3);
                        }
                    }
                    E().c.a("Storage version upgrade failed. Previous, current version", Integer.valueOf(i2), Integer.valueOf(r2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean z() {
        FileLock fileLock;
        r();
        if (d().a(sud.au) && (fileLock = this.w) != null && fileLock.isValid()) {
            E().k.a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(n().getFilesDir(), this.b.f()), "rw").getChannel();
            this.x = channel;
            FileLock tryLock = channel.tryLock();
            this.w = tryLock;
            if (tryLock == null) {
                E().c.a("Storage concurrent data access panic");
                return false;
            }
            E().k.a("Storage concurrent access okay");
            return true;
        } catch (FileNotFoundException e2) {
            E().c.a("Failed to acquire storage lock", e2);
            return false;
        } catch (IOException e3) {
            E().c.a("Failed to access storage lock file", e3);
            return false;
        } catch (OverlappingFileLockException e4) {
            E().f.a("Storage lock already acquired", e4);
            return false;
        }
    }

    public sze(szf szf) {
        iva.a((Object) szf);
        this.g = svv.a(szf.a);
        this.p = -1;
        szg szg = new szg(this);
        szg.r();
        this.s = szg;
        sux a2 = szf.a(this);
        a2.r();
        this.r = a2;
        svn svn = new svn(this);
        svn.r();
        this.a = svn;
        F().a((Runnable) new syy(this, szf));
    }

    private final void b(aucd aucd, aucd aucd2) {
        iva.b("_e".equals(((szz) aucd.b).c));
        l();
        tab b2 = szg.b((szz) aucd.i(), "_et");
        if ((b2.a & 4) != 0) {
            long j2 = b2.d;
            if (j2 > 0) {
                l();
                tab b3 = szg.b((szz) aucd2.i(), "_et");
                if (b3 != null) {
                    long j3 = b3.d;
                    if (j3 > 0) {
                        j2 += j3;
                    }
                }
                l().a(aucd2, "_et", (Object) Long.valueOf(j2));
                l().a(aucd, "_fr", (Object) 1L);
            }
        }
    }

    private static final void a(aucd aucd) {
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        tad tad = (tad) aucd.b;
        tad tad2 = tad.P;
        int i2 = tad.a | 4;
        tad.a = i2;
        tad.g = Long.MAX_VALUE;
        tad.a = i2 | 8;
        tad.h = Long.MIN_VALUE;
        for (int i3 = 0; i3 < ((tad) aucd.b).d.size(); i3++) {
            szz x2 = aucd.x(i3);
            long j2 = x2.d;
            if (j2 < ((tad) aucd.b).g) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tad tad3 = (tad) aucd.b;
                tad3.a |= 4;
                tad3.g = j2;
            }
            long j3 = x2.d;
            if (j3 > ((tad) aucd.b).h) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tad tad4 = (tad) aucd.b;
                tad4.a |= 8;
                tad4.h = j3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b1, code lost:
        if (r3 != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sou b(com.google.android.gms.measurement.internal.AppMetadata r12) {
        /*
            r11 = this;
            r11.r()
            r11.s()
            defpackage.iva.a((java.lang.Object) r12)
            java.lang.String r0 = r12.a
            defpackage.iva.c(r0)
            spj r0 = r11.h()
            java.lang.String r1 = r12.a
            sou r0 = r0.b(r1)
            svf r1 = r11.e()
            java.lang.String r2 = r12.a
            java.lang.String r1 = r1.b(r2)
            ayji r2 = defpackage.ayji.a
            r2.a()
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0044
            sou r0 = new sou
            svv r4 = r11.g
            java.lang.String r5 = r12.a
            r0.<init>(r4, r5)
            szj r4 = r11.p()
            java.lang.String r4 = r4.o()
            r0.a((java.lang.String) r4)
            r0.d((java.lang.String) r1)
            r1 = 1
            goto L_0x005f
        L_0x0044:
            java.lang.String r4 = r0.e()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005e
            r0.d((java.lang.String) r1)
            szj r1 = r11.p()
            java.lang.String r1 = r1.o()
            r0.a((java.lang.String) r1)
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            java.lang.String r4 = r12.b
            java.lang.String r5 = r0.c()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x0071
            java.lang.String r1 = r12.b
            r0.b((java.lang.String) r1)
            r1 = 1
        L_0x0071:
            java.lang.String r4 = r12.r
            java.lang.String r5 = r0.d()
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x0083
            java.lang.String r1 = r12.r
            r0.c((java.lang.String) r1)
            r1 = 1
        L_0x0083:
            defpackage.ayjy.c()
            java.lang.String r4 = r12.k
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = r12.k
            java.lang.String r5 = r0.f()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a0
            java.lang.String r1 = r12.k
            r0.e((java.lang.String) r1)
            r1 = 1
        L_0x00a0:
            long r4 = r12.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00b6
            long r8 = r0.l()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00b6
            long r4 = r12.e
            r0.d((long) r4)
            r1 = 1
        L_0x00b6:
            java.lang.String r4 = r12.c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00d0
            java.lang.String r4 = r12.c
            java.lang.String r5 = r0.i()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00d0
            java.lang.String r1 = r12.c
            r0.f((java.lang.String) r1)
            r1 = 1
        L_0x00d0:
            long r4 = r12.j
            long r8 = r0.j()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00e0
            long r4 = r12.j
            r0.c((long) r4)
            r1 = 1
        L_0x00e0:
            java.lang.String r4 = r12.d
            if (r4 == 0) goto L_0x00f4
            java.lang.String r5 = r0.k()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00f4
            java.lang.String r1 = r12.d
            r0.g((java.lang.String) r1)
            r1 = 1
        L_0x00f4:
            long r4 = r12.f
            long r8 = r0.m()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0104
            long r4 = r12.f
            r0.e((long) r4)
            r1 = 1
        L_0x0104:
            boolean r4 = r12.h
            boolean r5 = r0.o()
            if (r4 == r5) goto L_0x0112
            boolean r1 = r12.h
            r0.a((boolean) r1)
            r1 = 1
        L_0x0112:
            java.lang.String r4 = r12.g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x012c
            java.lang.String r4 = r12.g
            java.lang.String r5 = r0.t()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x012c
            java.lang.String r1 = r12.g
            r0.h((java.lang.String) r1)
            r1 = 1
        L_0x012c:
            spg r4 = r11.d()
            suc r5 = defpackage.sud.aQ
            boolean r4 = r4.a((defpackage.suc) r5)
            if (r4 != 0) goto L_0x0148
            long r4 = r12.l
            long r8 = r0.u()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0148
            long r4 = r12.l
            r0.j(r4)
            r1 = 1
        L_0x0148:
            boolean r4 = r12.o
            boolean r5 = r0.v()
            if (r4 == r5) goto L_0x0156
            boolean r1 = r12.o
            r0.b((boolean) r1)
            r1 = 1
        L_0x0156:
            boolean r4 = r12.p
            boolean r5 = r0.w()
            if (r4 == r5) goto L_0x0164
            boolean r1 = r12.p
            r0.c((boolean) r1)
            r1 = 1
        L_0x0164:
            spg r4 = r11.d()
            java.lang.String r5 = r12.a
            suc r8 = defpackage.sud.U
            boolean r4 = r4.b(r5, r8)
            if (r4 == 0) goto L_0x019c
            java.lang.Boolean r4 = r12.s
            java.lang.Boolean r5 = r0.x()
            if (r4 == r5) goto L_0x019c
            java.lang.Boolean r1 = r12.s
            svv r4 = r0.a
            r4.p()
            boolean r4 = r0.k
            java.lang.Boolean r5 = r0.b
            int r8 = defpackage.szj.a
            if (r5 != 0) goto L_0x018d
            if (r1 != 0) goto L_0x018d
            r2 = 1
            goto L_0x0195
        L_0x018d:
            if (r5 == 0) goto L_0x0194
            boolean r2 = r5.equals(r1)
            goto L_0x0195
        L_0x0194:
        L_0x0195:
            r2 = r2 ^ r3
            r2 = r2 | r4
            r0.k = r2
            r0.b = r1
            goto L_0x019d
        L_0x019c:
            r3 = r1
        L_0x019d:
            long r1 = r12.t
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01b1
            long r4 = r0.n()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x01b1
            long r1 = r12.t
            r0.f((long) r1)
            goto L_0x01b3
        L_0x01b1:
            if (r3 == 0) goto L_0x01ba
        L_0x01b3:
            spj r12 = r11.h()
            r12.a((defpackage.sou) r0)
        L_0x01ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.b(com.google.android.gms.measurement.internal.AppMetadata):sou");
    }

    static final void a(aucd aucd, int i2, String str) {
        List unmodifiableList = Collections.unmodifiableList(((szz) aucd.b).b);
        int i3 = 0;
        while (i3 < unmodifiableList.size()) {
            if (!"_err".equals(((tab) unmodifiableList.get(i3)).b)) {
                i3++;
            } else {
                return;
            }
        }
        aucd o2 = tab.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tab tab = (tab) o2.b;
        "_err".getClass();
        tab.a |= 1;
        tab.b = "_err";
        long longValue = Long.valueOf((long) i2).longValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tab tab2 = (tab) o2.b;
        tab2.a |= 4;
        tab2.d = longValue;
        tab tab3 = (tab) o2.i();
        aucd o3 = tab.g.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        tab tab4 = (tab) o3.b;
        "_ev".getClass();
        int i4 = tab4.a | 1;
        tab4.a = i4;
        tab4.b = "_ev";
        str.getClass();
        tab4.a = i4 | 2;
        tab4.c = str;
        aucd.a(tab3);
        aucd.a((tab) o3.i());
    }

    private final void a(aucd aucd, long j2, boolean z) {
        String str;
        szi szi;
        String str2;
        if (!z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        szi c2 = h().c(((tad) aucd.b).q, str);
        if (c2 == null || c2.e == null) {
            szi = new szi(((tad) aucd.b).q, "auto", str, o().a(), Long.valueOf(j2));
        } else {
            szi = new szi(((tad) aucd.b).q, "auto", str, o().a(), Long.valueOf(((Long) c2.e).longValue() + j2));
        }
        aucd o2 = tah.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tah tah = (tah) o2.b;
        str.getClass();
        tah.a |= 2;
        tah.c = str;
        long a2 = o().a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tah tah2 = (tah) o2.b;
        tah2.a |= 1;
        tah2.b = a2;
        long longValue = ((Long) szi.e).longValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tah tah3 = (tah) o2.b;
        tah3.a |= 8;
        tah3.e = longValue;
        tah tah4 = (tah) o2.i();
        int a3 = szg.a(aucd, str);
        if (a3 >= 0) {
            aucd.a(a3, tah4);
        } else {
            aucd.a(tah4);
        }
        if (j2 > 0) {
            h().a(szi);
            if (z) {
                str2 = "session-scoped";
            } else {
                str2 = "lifetime";
            }
            if (!ayjn.b() || !d().b(((tad) aucd.b).q, sud.aJ)) {
                E().j.a("Updated engagement user property. scope, value", str2, szi.e);
            } else {
                E().k.a("Updated engagement user property. scope, value", str2, szi.e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Bundle bundle;
        iva.a((Object) conditionalUserPropertyParcel);
        iva.c(conditionalUserPropertyParcel.a);
        iva.a((Object) conditionalUserPropertyParcel.c);
        iva.c(conditionalUserPropertyParcel.c.b);
        r();
        s();
        if (!d(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            b(appMetadata);
            return;
        }
        h().b();
        try {
            b(appMetadata);
            ConditionalUserPropertyParcel d2 = h().d(conditionalUserPropertyParcel.a, conditionalUserPropertyParcel.c.b);
            if (d2 != null) {
                E().j.a("Removing conditional user property", conditionalUserPropertyParcel.a, m().c(conditionalUserPropertyParcel.c.b));
                h().f(conditionalUserPropertyParcel.a, conditionalUserPropertyParcel.c.b);
                if (d2.e) {
                    h().b(conditionalUserPropertyParcel.a, conditionalUserPropertyParcel.c.b);
                }
                EventParcel eventParcel = conditionalUserPropertyParcel.k;
                if (eventParcel != null) {
                    EventParams eventParams = eventParcel.b;
                    if (eventParams != null) {
                        bundle = eventParams.a();
                    } else {
                        bundle = null;
                    }
                    szj p2 = p();
                    String str = conditionalUserPropertyParcel.a;
                    EventParcel eventParcel2 = conditionalUserPropertyParcel.k;
                    b(p2.a(str, eventParcel2.a, bundle, d2.b, eventParcel2.d), appMetadata);
                }
            } else {
                E().f.a("Conditional user property doesn't exist", sut.a(conditionalUserPropertyParcel.a), m().c(conditionalUserPropertyParcel.c.b));
            }
            h().c();
        } finally {
            h().d();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e5 A[Catch:{ SQLiteException -> 0x0524, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0340 A[Catch:{ SQLiteException -> 0x0524, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x036e A[Catch:{ SQLiteException -> 0x0524, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03a0 A[Catch:{ SQLiteException -> 0x0524, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03c3 A[Catch:{ SQLiteException -> 0x0524, all -> 0x0d12 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.measurement.internal.EventParcel r29, com.google.android.gms.measurement.internal.AppMetadata r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "_s"
            defpackage.iva.a((java.lang.Object) r30)
            java.lang.String r5 = r3.a
            defpackage.iva.c(r5)
            long r5 = java.lang.System.nanoTime()
            r28.r()
            r28.s()
            java.lang.String r15 = r3.a
            szg r7 = r28.l()
            boolean r7 = r7.a((com.google.android.gms.measurement.internal.EventParcel) r2, (com.google.android.gms.measurement.internal.AppMetadata) r3)
            if (r7 == 0) goto L_0x0d1c
            boolean r7 = r3.h
            if (r7 != 0) goto L_0x002e
            r1.b((com.google.android.gms.measurement.internal.AppMetadata) r3)
            return
        L_0x002e:
            svn r7 = r28.f()
            java.lang.String r8 = r2.a
            boolean r7 = r7.b(r15, r8)
            java.lang.String r14 = "_err"
            if (r7 == 0) goto L_0x00c8
            sut r3 = r28.E()
            sur r3 = r3.f
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r15)
            suk r5 = r28.m()
            java.lang.String r6 = r2.a
            java.lang.String r5 = r5.a((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.a(r6, r4, r5)
            svn r3 = r28.f()
            boolean r3 = r3.e(r15)
            if (r3 != 0) goto L_0x0083
            svn r3 = r28.f()
            boolean r3 = r3.f(r15)
            if (r3 == 0) goto L_0x006a
            goto L_0x0083
        L_0x006a:
            java.lang.String r3 = r2.a
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L_0x00c7
            szj r7 = r28.p()
            r9 = 11
            java.lang.String r11 = r2.a
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
            return
        L_0x0083:
            spj r2 = r28.h()
            sou r2 = r2.b(r15)
            if (r2 == 0) goto L_0x00c7
            long r3 = r2.r()
            long r5 = r2.q()
            long r3 = java.lang.Math.max(r3, r5)
            jiq r5 = r28.o()
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r28.d()
            suc r5 = defpackage.sud.z
            java.lang.Object r5 = r5.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c7
            sut r3 = r28.E()
            sur r3 = r3.j
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.a((defpackage.sou) r2)
        L_0x00c7:
            return
        L_0x00c8:
            defpackage.ayib.c()
            sut r7 = r28.E()
            r13 = 2
            boolean r7 = r7.a((int) r13)
            if (r7 == 0) goto L_0x0124
            sut r7 = r28.E()
            sur r7 = r7.k
            suk r8 = r28.m()
            if (r2 == 0) goto L_0x011d
            boolean r9 = r8.b()
            if (r9 != 0) goto L_0x00ed
            java.lang.String r8 = r29.toString()
            goto L_0x011e
        L_0x00ed:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "origin="
            r9.append(r10)
            java.lang.String r10 = r2.c
            r9.append(r10)
            java.lang.String r10 = ",name="
            r9.append(r10)
            java.lang.String r10 = r2.a
            java.lang.String r10 = r8.a((java.lang.String) r10)
            r9.append(r10)
            java.lang.String r10 = ",params="
            r9.append(r10)
            com.google.android.gms.measurement.internal.EventParams r10 = r2.b
            java.lang.String r8 = r8.a((com.google.android.gms.measurement.internal.EventParams) r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            goto L_0x011e
        L_0x011d:
            r8 = 0
        L_0x011e:
            java.lang.String r9 = "Logging event"
            r7.a(r9, r8)
        L_0x0124:
            spj r7 = r28.h()
            r7.b()
            r1.b((com.google.android.gms.measurement.internal.AppMetadata) r3)     // Catch:{ all -> 0x0d12 }
            boolean r7 = defpackage.ayij.b()     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x0142
            spg r7 = r28.d()     // Catch:{ all -> 0x0d12 }
            suc r8 = defpackage.sud.aP     // Catch:{ all -> 0x0d12 }
            boolean r7 = r7.a((defpackage.suc) r8)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x0142
            r7 = 1
            goto L_0x0143
        L_0x0142:
            r7 = 0
        L_0x0143:
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "refund"
            if (r8 == 0) goto L_0x0151
            r7 = 1
            goto L_0x0169
        L_0x0151:
            if (r7 == 0) goto L_0x0168
            java.lang.String r7 = "purchase"
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0166
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r7 = 1
            goto L_0x0169
        L_0x0168:
            r7 = 0
        L_0x0169:
            java.lang.String r8 = "_iap"
            java.lang.String r10 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r8 = r8.equals(r10)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            if (r7 == 0) goto L_0x0318
        L_0x0176:
            com.google.android.gms.measurement.internal.EventParams r8 = r2.b     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = "currency"
            java.lang.String r8 = r8.c(r10)     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = "value"
            if (r7 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.EventParams r7 = r2.b     // Catch:{ all -> 0x0d12 }
            android.os.Bundle r7 = r7.a     // Catch:{ all -> 0x0d12 }
            double r17 = r7.getDouble(r10)     // Catch:{ all -> 0x0d12 }
            java.lang.Double r7 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0d12 }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x0d12 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b0
            com.google.android.gms.measurement.internal.EventParams r7 = r2.b     // Catch:{ all -> 0x0d12 }
            java.lang.Long r7 = r7.b(r10)     // Catch:{ all -> 0x0d12 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x0d12 }
            double r10 = (double) r11
            java.lang.Double.isNaN(r10)
            double r17 = r10 * r19
            goto L_0x01b1
        L_0x01b0:
        L_0x01b1:
            r10 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x01b8
            goto L_0x01e0
        L_0x01b8:
            r10 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x01e0
            long r10 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0d12 }
            boolean r7 = defpackage.ayij.b()     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x01de
            spg r7 = r28.d()     // Catch:{ all -> 0x0d12 }
            suc r12 = defpackage.sud.aP     // Catch:{ all -> 0x0d12 }
            boolean r7 = r7.a((defpackage.suc) r12)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x01de
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x01de
            long r10 = -r10
            goto L_0x01df
        L_0x01de:
        L_0x01df:
            goto L_0x020c
        L_0x01e0:
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r15)     // Catch:{ all -> 0x0d12 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0d12 }
            spj r2 = r28.h()     // Catch:{ all -> 0x0d12 }
            r2.c()     // Catch:{ all -> 0x0d12 }
        L_0x01fa:
            spj r2 = r28.h()
            r2.d()
            return
        L_0x0202:
            com.google.android.gms.measurement.internal.EventParams r7 = r2.b     // Catch:{ all -> 0x0d12 }
            java.lang.Long r7 = r7.b(r10)     // Catch:{ all -> 0x0d12 }
            long r10 = r7.longValue()     // Catch:{ all -> 0x0d12 }
        L_0x020c:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0313
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r8.toUpperCase(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r7.matches(r8)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x030e
            java.lang.String r8 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            int r9 = r7.length()     // Catch:{ all -> 0x0d12 }
            if (r9 != 0) goto L_0x0232
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0d12 }
            r7.<init>(r8)     // Catch:{ all -> 0x0d12 }
            goto L_0x0236
        L_0x0232:
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0d12 }
        L_0x0236:
            r12 = r7
            spj r7 = r28.h()     // Catch:{ all -> 0x0d12 }
            szi r7 = r7.c(r15, r12)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x0277
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x0d12 }
            boolean r8 = r7 instanceof java.lang.Long     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0272
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d12 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d12 }
            szi r17 = new szi     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x0d12 }
            jiq r18 = r28.o()     // Catch:{ all -> 0x0d12 }
            long r18 = r18.a()     // Catch:{ all -> 0x0d12 }
            long r7 = r7 + r10
            java.lang.Long r20 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            r7 = r17
            r8 = r15
            r11 = 0
            r10 = r12
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r13 = r20
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0d12 }
            r7 = r17
            r6 = 2
            goto L_0x02db
        L_0x0272:
            r23 = r5
            r5 = 0
            r6 = 1
            goto L_0x027b
        L_0x0277:
            r23 = r5
            r5 = 0
            r6 = 1
        L_0x027b:
            spj r7 = r28.h()     // Catch:{ all -> 0x0d12 }
            spg r8 = r28.d()     // Catch:{ all -> 0x0d12 }
            suc r9 = defpackage.sud.E     // Catch:{ all -> 0x0d12 }
            int r8 = r8.a((java.lang.String) r15, (defpackage.suc) r9)     // Catch:{ all -> 0x0d12 }
            int r8 = r8 + -1
            defpackage.iva.c(r15)     // Catch:{ all -> 0x0d12 }
            r7.h()     // Catch:{ all -> 0x0d12 }
            r7.q()     // Catch:{ all -> 0x0d12 }
            android.database.sqlite.SQLiteDatabase r9 = r7.e()     // Catch:{ SQLiteException -> 0x02ae }
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02ae }
            r13[r5] = r15     // Catch:{ SQLiteException -> 0x02ae }
            r13[r6] = r15     // Catch:{ SQLiteException -> 0x02ae }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02ae }
            r6 = 2
            r13[r6] = r8     // Catch:{ SQLiteException -> 0x02ac }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r9.execSQL(r8, r13)     // Catch:{ SQLiteException -> 0x02ac }
            goto L_0x02c0
        L_0x02ac:
            r0 = move-exception
            goto L_0x02b0
        L_0x02ae:
            r0 = move-exception
            r6 = 2
        L_0x02b0:
            r8 = r0
            sut r7 = r7.E()     // Catch:{ all -> 0x0d12 }
            sur r7 = r7.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "Error pruning currencies. appId"
            java.lang.Object r13 = defpackage.sut.a((java.lang.String) r15)     // Catch:{ all -> 0x0d12 }
            r7.a(r9, r13, r8)     // Catch:{ all -> 0x0d12 }
        L_0x02c0:
            szi r17 = new szi     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x0d12 }
            jiq r7 = r28.o()     // Catch:{ all -> 0x0d12 }
            long r18 = r7.a()     // Catch:{ all -> 0x0d12 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d12 }
            r7 = r17
            r8 = r15
            r10 = r12
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0d12 }
            r7 = r17
        L_0x02db:
            spj r8 = r28.h()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r8.a((defpackage.szi) r7)     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x031c
            sut r8 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r8 = r8.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r15)     // Catch:{ all -> 0x0d12 }
            suk r11 = r28.m()     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = r7.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r11 = r11.c(r12)     // Catch:{ all -> 0x0d12 }
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x0d12 }
            r8.a(r9, r10, r11, r7)     // Catch:{ all -> 0x0d12 }
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0d12 }
            goto L_0x031c
        L_0x030e:
            r23 = r5
            r5 = 0
            r6 = 2
            goto L_0x031c
        L_0x0313:
            r23 = r5
            r5 = 0
            r6 = 2
            goto L_0x031c
        L_0x0318:
            r23 = r5
            r5 = 0
            r6 = 2
        L_0x031c:
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r18 = defpackage.szj.a((java.lang.String) r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r19 = r14.equals(r7)     // Catch:{ all -> 0x0d12 }
            boolean r7 = defpackage.ayij.b()     // Catch:{ all -> 0x0d12 }
            r25 = 1
            r13 = 0
            if (r7 == 0) goto L_0x036e
            spg r7 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r9 = defpackage.sud.aL     // Catch:{ all -> 0x0d12 }
            boolean r7 = r7.b(r8, r9)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x036e
            r28.p()     // Catch:{ all -> 0x0d12 }
            com.google.android.gms.measurement.internal.EventParams r7 = r2.b     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x0369
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x0d12 }
            r9 = r13
        L_0x034c:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x0d12 }
            if (r11 == 0) goto L_0x0368
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x0d12 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0d12 }
            java.lang.Object r11 = r7.a(r11)     // Catch:{ all -> 0x0d12 }
            boolean r12 = r11 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0d12 }
            if (r12 == 0) goto L_0x0366
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11     // Catch:{ all -> 0x0d12 }
            int r11 = r11.length     // Catch:{ all -> 0x0d12 }
            long r11 = (long) r11     // Catch:{ all -> 0x0d12 }
            long r9 = r9 + r11
            goto L_0x034c
        L_0x0366:
            goto L_0x034c
        L_0x0368:
            goto L_0x036a
        L_0x0369:
            r9 = r13
        L_0x036a:
            long r9 = r9 + r25
            r11 = r9
            goto L_0x0370
        L_0x036e:
            r11 = r25
        L_0x0370:
            spj r7 = r28.h()     // Catch:{ all -> 0x0d12 }
            long r8 = r28.t()     // Catch:{ all -> 0x0d12 }
            r16 = 1
            r17 = 0
            r20 = 0
            r10 = r15
            r5 = r13
            r13 = r16
            r14 = r18
            r27 = r15
            r15 = r17
            r16 = r19
            r17 = r20
            sph r7 = r7.a(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0d12 }
            long r8 = r7.b     // Catch:{ all -> 0x0d12 }
            r28.d()     // Catch:{ all -> 0x0d12 }
            long r10 = defpackage.spg.m()     // Catch:{ all -> 0x0d12 }
            long r8 = r8 - r10
            r14 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x03c3
            long r8 = r8 % r14
            int r2 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x03ba
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r27)     // Catch:{ all -> 0x0d12 }
            long r5 = r7.b     // Catch:{ all -> 0x0d12 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0d12 }
        L_0x03ba:
            spj r2 = r28.h()     // Catch:{ all -> 0x0d12 }
            r2.c()     // Catch:{ all -> 0x0d12 }
            goto L_0x01fa
        L_0x03c3:
            if (r18 == 0) goto L_0x0410
            long r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r28.d()     // Catch:{ all -> 0x0d12 }
            suc r10 = defpackage.sud.m     // Catch:{ all -> 0x0d12 }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x0d12 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0d12 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0d12 }
            long r10 = (long) r10     // Catch:{ all -> 0x0d12 }
            long r8 = r8 - r10
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0410
            long r8 = r8 % r14
            int r3 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            if (r3 == 0) goto L_0x03e2
            goto L_0x03f7
        L_0x03e2:
            sut r3 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r3 = r3.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r27)     // Catch:{ all -> 0x0d12 }
            long r6 = r7.a     // Catch:{ all -> 0x0d12 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d12 }
            r3.a(r4, r5, r6)     // Catch:{ all -> 0x0d12 }
        L_0x03f7:
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.a     // Catch:{ all -> 0x0d12 }
            r12 = 0
            r8 = r27
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0d12 }
            spj r2 = r28.h()     // Catch:{ all -> 0x0d12 }
            r2.c()     // Catch:{ all -> 0x0d12 }
            goto L_0x01fa
        L_0x0410:
            r8 = 1000000(0xf4240, float:1.401298E-39)
            if (r19 != 0) goto L_0x0416
            goto L_0x0455
        L_0x0416:
            long r9 = r7.d     // Catch:{ all -> 0x0d12 }
            spg r11 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r13 = defpackage.sud.l     // Catch:{ all -> 0x0d12 }
            int r11 = r11.a((java.lang.String) r12, (defpackage.suc) r13)     // Catch:{ all -> 0x0d12 }
            int r11 = java.lang.Math.min(r8, r11)     // Catch:{ all -> 0x0d12 }
            r12 = 0
            int r11 = java.lang.Math.max(r12, r11)     // Catch:{ all -> 0x0d12 }
            long r11 = (long) r11     // Catch:{ all -> 0x0d12 }
            long r9 = r9 - r11
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0455
            int r2 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x044c
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r27)     // Catch:{ all -> 0x0d12 }
            long r5 = r7.d     // Catch:{ all -> 0x0d12 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0d12 }
        L_0x044c:
            spj r2 = r28.h()     // Catch:{ all -> 0x0d12 }
            r2.c()     // Catch:{ all -> 0x0d12 }
            goto L_0x01fa
        L_0x0455:
            com.google.android.gms.measurement.internal.EventParams r7 = r2.b     // Catch:{ all -> 0x0d12 }
            android.os.Bundle r12 = r7.a()     // Catch:{ all -> 0x0d12 }
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "_o"
            java.lang.String r10 = r2.c     // Catch:{ all -> 0x0d12 }
            r7.a((android.os.Bundle) r12, (java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x0d12 }
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            r13 = r27
            boolean r7 = r7.g(r13)     // Catch:{ all -> 0x0d12 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0488
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            java.lang.Long r9 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = "_dbg"
            r7.a((android.os.Bundle) r12, (java.lang.String) r10, (java.lang.Object) r9)     // Catch:{ all -> 0x0d12 }
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            r7.a((android.os.Bundle) r12, (java.lang.String) r11, (java.lang.Object) r9)     // Catch:{ all -> 0x0d12 }
        L_0x0488:
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "_sno"
            if (r7 == 0) goto L_0x04bd
            spg r7 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r14 = defpackage.sud.M     // Catch:{ all -> 0x0d12 }
            boolean r7 = r7.b(r10, r14)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x04bd
            spj r7 = r28.h()     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = r3.a     // Catch:{ all -> 0x0d12 }
            szi r7 = r7.c(r10, r9)     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x04ae
            goto L_0x04bd
        L_0x04ae:
            java.lang.Object r10 = r7.e     // Catch:{ all -> 0x0d12 }
            boolean r10 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x0d12 }
            if (r10 == 0) goto L_0x04bd
            szj r10 = r28.p()     // Catch:{ all -> 0x0d12 }
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x0d12 }
            r10.a((android.os.Bundle) r12, (java.lang.String) r9, (java.lang.Object) r7)     // Catch:{ all -> 0x0d12 }
        L_0x04bd:
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0d12 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0d12 }
            if (r4 == 0) goto L_0x04ea
            spg r4 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r10 = defpackage.sud.Q     // Catch:{ all -> 0x0d12 }
            boolean r4 = r4.b(r7, r10)     // Catch:{ all -> 0x0d12 }
            if (r4 == 0) goto L_0x04ea
            spg r4 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r10 = defpackage.sud.M     // Catch:{ all -> 0x0d12 }
            boolean r4 = r4.b(r7, r10)     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x04ea
            com.google.android.gms.measurement.internal.UserAttributeParcel r4 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0d12 }
            r4.<init>((java.lang.String) r9)     // Catch:{ all -> 0x0d12 }
            r1.b((com.google.android.gms.measurement.internal.UserAttributeParcel) r4, (com.google.android.gms.measurement.internal.AppMetadata) r3)     // Catch:{ all -> 0x0d12 }
        L_0x04ea:
            spj r4 = r28.h()     // Catch:{ all -> 0x0d12 }
            defpackage.iva.c(r13)     // Catch:{ all -> 0x0d12 }
            r4.h()     // Catch:{ all -> 0x0d12 }
            r4.q()     // Catch:{ all -> 0x0d12 }
            android.database.sqlite.SQLiteDatabase r7 = r4.e()     // Catch:{ SQLiteException -> 0x0524 }
            spg r9 = r4.v()     // Catch:{ SQLiteException -> 0x0524 }
            suc r10 = defpackage.sud.p     // Catch:{ SQLiteException -> 0x0524 }
            int r9 = r9.a((java.lang.String) r13, (defpackage.suc) r10)     // Catch:{ SQLiteException -> 0x0524 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ SQLiteException -> 0x0524 }
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)     // Catch:{ SQLiteException -> 0x0524 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x0524 }
            r10 = 2
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0524 }
            r14[r9] = r13     // Catch:{ SQLiteException -> 0x0524 }
            r9 = 1
            r14[r9] = r8     // Catch:{ SQLiteException -> 0x0524 }
            java.lang.String r8 = "raw_events"
            java.lang.String r9 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r4 = r7.delete(r8, r9, r14)     // Catch:{ SQLiteException -> 0x0524 }
            long r7 = (long) r4
            goto L_0x0536
        L_0x0524:
            r0 = move-exception
            r7 = r0
            sut r4 = r4.E()     // Catch:{ all -> 0x0d12 }
            sur r4 = r4.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = "Error deleting over the limit events. appId"
            java.lang.Object r9 = defpackage.sut.a((java.lang.String) r13)     // Catch:{ all -> 0x0d12 }
            r4.a(r8, r9, r7)     // Catch:{ all -> 0x0d12 }
            r7 = r5
        L_0x0536:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x053b
            goto L_0x054e
        L_0x053b:
            sut r4 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r4 = r4.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r13)     // Catch:{ all -> 0x0d12 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            r4.a(r9, r10, r7)     // Catch:{ all -> 0x0d12 }
        L_0x054e:
            spo r4 = new spo     // Catch:{ all -> 0x0d12 }
            svv r8 = r1.g     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r14 = r2.a     // Catch:{ all -> 0x0d12 }
            long r5 = r2.d     // Catch:{ all -> 0x0d12 }
            r25 = 0
            r7 = r4
            r10 = r13
            r2 = r11
            r11 = r14
            r27 = r12
            r14 = r13
            r12 = r5
            r5 = r14
            r14 = r25
            r16 = r27
            r7.<init>((defpackage.svv) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x0d12 }
            spj r6 = r28.h()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r4.b     // Catch:{ all -> 0x0d12 }
            spp r6 = r6.a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0593
            svv r8 = r1.g     // Catch:{ all -> 0x0d12 }
            long r14 = r6.f     // Catch:{ all -> 0x0d12 }
            spo r5 = new spo     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r4.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = r4.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r11 = r4.b     // Catch:{ all -> 0x0d12 }
            long r12 = r4.d     // Catch:{ all -> 0x0d12 }
            com.google.android.gms.measurement.internal.EventParams r4 = r4.f     // Catch:{ all -> 0x0d12 }
            r7 = r5
            r16 = r4
            r7.<init>((defpackage.svv) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (com.google.android.gms.measurement.internal.EventParams) r16)     // Catch:{ all -> 0x0d12 }
            long r7 = r5.d     // Catch:{ all -> 0x0d12 }
            spp r4 = r6.a(r7)     // Catch:{ all -> 0x0d12 }
            goto L_0x05fc
        L_0x0593:
            spj r6 = r28.h()     // Catch:{ all -> 0x0d12 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0d12 }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r8[r7] = r5     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "select count(1) from events where app_id=? and name not like '!_%' escape '!'"
            r9 = 0
            long r6 = r6.a((java.lang.String) r7, (java.lang.String[]) r8, (long) r9)     // Catch:{ all -> 0x0d12 }
            r28.d()     // Catch:{ all -> 0x0d12 }
            defpackage.spg.o()     // Catch:{ all -> 0x0d12 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x05b5
            goto L_0x05eb
        L_0x05b5:
            if (r18 == 0) goto L_0x05eb
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            suk r6 = r28.m()     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r6.a((java.lang.String) r4)     // Catch:{ all -> 0x0d12 }
            r28.d()     // Catch:{ all -> 0x0d12 }
            defpackage.spg.o()     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = "Too many event names used, ignoring event. appId, name, supported count"
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            r2.a(r6, r3, r4, r7)     // Catch:{ all -> 0x0d12 }
            szj r7 = r28.p()     // Catch:{ all -> 0x0d12 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r5
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0d12 }
            goto L_0x01fa
        L_0x05eb:
            spp r6 = new spp     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r4.b     // Catch:{ all -> 0x0d12 }
            r10 = 0
            r12 = 0
            long r14 = r4.d     // Catch:{ all -> 0x0d12 }
            r7 = r6
            r8 = r5
            r7.<init>(r8, r9, r10, r12, r14)     // Catch:{ all -> 0x0d12 }
            r5 = r4
            r4 = r6
        L_0x05fc:
            spj r6 = r28.h()     // Catch:{ all -> 0x0d12 }
            r6.a((defpackage.spp) r4)     // Catch:{ all -> 0x0d12 }
            r28.r()     // Catch:{ all -> 0x0d12 }
            r28.s()     // Catch:{ all -> 0x0d12 }
            defpackage.iva.a((java.lang.Object) r5)     // Catch:{ all -> 0x0d12 }
            defpackage.iva.a((java.lang.Object) r30)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r5.a     // Catch:{ all -> 0x0d12 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r5.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r3.a     // Catch:{ all -> 0x0d12 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0d12 }
            defpackage.iva.b((boolean) r4)     // Catch:{ all -> 0x0d12 }
            tad r4 = defpackage.tad.P     // Catch:{ all -> 0x0d12 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0d12 }
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x062a
            goto L_0x0630
        L_0x062a:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x0630:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            defpackage.tad.a(r6)     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = "android"
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x063e
            goto L_0x0644
        L_0x063e:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0644:
            aucj r7 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 64
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.k = r6     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r3.a     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x065c
            goto L_0x0678
        L_0x065c:
            java.lang.String r6 = r3.a     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0663
            goto L_0x0669
        L_0x0663:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0669:
            aucj r7 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.q = r6     // Catch:{ all -> 0x0d12 }
        L_0x0678:
            java.lang.String r6 = r3.d     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0681
            goto L_0x069d
        L_0x0681:
            java.lang.String r6 = r3.d     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0688
            goto L_0x068e
        L_0x0688:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x068e:
            aucj r7 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.p = r6     // Catch:{ all -> 0x0d12 }
        L_0x069d:
            java.lang.String r6 = r3.c     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x06c1
            java.lang.String r6 = r3.c     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x06ac
            goto L_0x06b2
        L_0x06ac:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x06b2:
            aucj r7 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.r = r6     // Catch:{ all -> 0x0d12 }
        L_0x06c1:
            long r6 = r3.j     // Catch:{ all -> 0x0d12 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x06e3
            int r7 = (int) r6     // Catch:{ all -> 0x0d12 }
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x06d0
            goto L_0x06d6
        L_0x06d0:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x06d6:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            int r8 = r6.a     // Catch:{ all -> 0x0d12 }
            r9 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r9
            r6.a = r8     // Catch:{ all -> 0x0d12 }
            r6.E = r7     // Catch:{ all -> 0x0d12 }
        L_0x06e3:
            long r6 = r3.e     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x06ea
            goto L_0x06f0
        L_0x06ea:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x06f0:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            int r9 = r8.a     // Catch:{ all -> 0x0d12 }
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.s = r6     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0705
            goto L_0x0722
        L_0x0705:
            java.lang.String r6 = r3.b     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x070c
            goto L_0x0712
        L_0x070c:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0712:
            aucj r7 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r9 = 4194304(0x400000, float:5.877472E-39)
            r8 = r8 | r9
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.A = r6     // Catch:{ all -> 0x0d12 }
        L_0x0722:
            defpackage.ayjy.c()     // Catch:{ all -> 0x0d12 }
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r6.A     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            r7 = 4
            if (r6 == 0) goto L_0x0755
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0d12 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x0755
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0741
            goto L_0x0747
        L_0x0741:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0747:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r9 = r8.b     // Catch:{ all -> 0x0d12 }
            r9 = r9 | r7
            r8.b = r9     // Catch:{ all -> 0x0d12 }
            r8.K = r6     // Catch:{ all -> 0x0d12 }
        L_0x0755:
            long r8 = r3.f     // Catch:{ all -> 0x0d12 }
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0775
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x0762
            goto L_0x0768
        L_0x0762:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x0768:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            int r10 = r6.a     // Catch:{ all -> 0x0d12 }
            r11 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r11
            r6.a = r10     // Catch:{ all -> 0x0d12 }
            r6.x = r8     // Catch:{ all -> 0x0d12 }
        L_0x0775:
            long r8 = r3.t     // Catch:{ all -> 0x0d12 }
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x077c
            goto L_0x0782
        L_0x077c:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x0782:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            int r10 = r6.b     // Catch:{ all -> 0x0d12 }
            r10 = r10 | 16
            r6.b = r10     // Catch:{ all -> 0x0d12 }
            r6.N = r8     // Catch:{ all -> 0x0d12 }
            spg r6 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r9 = defpackage.sud.W     // Catch:{ all -> 0x0d12 }
            boolean r6 = r6.b(r8, r9)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0851
            szg r6 = r28.l()     // Catch:{ all -> 0x0d12 }
            sze r8 = r6.j     // Catch:{ all -> 0x0d12 }
            android.content.Context r8 = r8.n()     // Catch:{ all -> 0x0d12 }
            java.util.Map r8 = defpackage.sud.a(r8)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0829
            int r9 = r8.size()     // Catch:{ all -> 0x0d12 }
            if (r9 == 0) goto L_0x0829
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0d12 }
            r11.<init>()     // Catch:{ all -> 0x0d12 }
            suc r9 = defpackage.sud.H     // Catch:{ all -> 0x0d12 }
            java.lang.Object r9 = r9.a()     // Catch:{ all -> 0x0d12 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0d12 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0d12 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x0d12 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0d12 }
        L_0x07cb:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0d12 }
            if (r10 == 0) goto L_0x0820
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0d12 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0d12 }
            java.lang.Object r12 = r10.getKey()     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d12 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0d12 }
            if (r12 == 0) goto L_0x07cb
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x0812 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0812 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0812 }
            if (r10 == 0) goto L_0x07cb
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0812 }
            r11.add(r10)     // Catch:{ NumberFormatException -> 0x0812 }
            int r10 = r11.size()     // Catch:{ NumberFormatException -> 0x0812 }
            if (r10 < r9) goto L_0x07cb
            sut r10 = r6.E()     // Catch:{ NumberFormatException -> 0x0812 }
            sur r10 = r10.f     // Catch:{ NumberFormatException -> 0x0812 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r11.size()     // Catch:{ NumberFormatException -> 0x0812 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0812 }
            r10.a(r12, r13)     // Catch:{ NumberFormatException -> 0x0812 }
            goto L_0x0820
        L_0x0812:
            r0 = move-exception
            r10 = r0
            sut r12 = r6.E()     // Catch:{ all -> 0x0d12 }
            sur r12 = r12.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.a(r13, r10)     // Catch:{ all -> 0x0d12 }
            goto L_0x07cb
        L_0x0820:
            int r6 = r11.size()     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x0828
            r11 = 0
            goto L_0x082a
        L_0x0828:
            goto L_0x082a
        L_0x0829:
            r11 = 0
        L_0x082a:
            if (r11 != 0) goto L_0x082d
            goto L_0x0851
        L_0x082d:
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x0832
            goto L_0x0838
        L_0x0832:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x0838:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            aucs r8 = r6.M     // Catch:{ all -> 0x0d12 }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x084c
            aucs r8 = r6.M     // Catch:{ all -> 0x0d12 }
            aucs r8 = defpackage.aucj.a((defpackage.aucs) r8)     // Catch:{ all -> 0x0d12 }
            r6.M = r8     // Catch:{ all -> 0x0d12 }
        L_0x084c:
            aucs r6 = r6.M     // Catch:{ all -> 0x0d12 }
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r6)     // Catch:{ all -> 0x0d12 }
        L_0x0851:
            svf r6 = r28.e()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x0d12 }
            android.util.Pair r6 = r6.a((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.Object r8 = r6.first     // Catch:{ all -> 0x0d12 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0d12 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d12 }
            r9 = 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x090d
            spn r6 = r28.q()     // Catch:{ all -> 0x0d12 }
            android.content.Context r8 = r28.n()     // Catch:{ all -> 0x0d12 }
            java.lang.Boolean r10 = r6.a     // Catch:{ all -> 0x0d12 }
            if (r10 != 0) goto L_0x089f
            spc r10 = r6.u()     // Catch:{ all -> 0x0d12 }
            boolean r10 = r10.a     // Catch:{ all -> 0x0d12 }
            if (r10 != 0) goto L_0x0897
            r10 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0d12 }
            r6.a = r11     // Catch:{ all -> 0x0d12 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0895 }
            if (r8 == 0) goto L_0x089f
            java.lang.String r10 = "com.google.android.gms"
            r8.getPackageInfo(r10, r9)     // Catch:{ NameNotFoundException -> 0x0895 }
            r8 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ NameNotFoundException -> 0x0895 }
            r6.a = r10     // Catch:{ NameNotFoundException -> 0x0895 }
            goto L_0x089f
        L_0x0895:
            r0 = move-exception
            goto L_0x089f
        L_0x0897:
            r8 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0d12 }
            r6.a = r10     // Catch:{ all -> 0x0d12 }
        L_0x089f:
            java.lang.Boolean r6 = r6.a     // Catch:{ all -> 0x0d12 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x08a9
            goto L_0x0954
        L_0x08a9:
            boolean r6 = r3.p     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0954
            android.content.Context r6 = r28.n()     // Catch:{ all -> 0x0d12 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r8)     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x08d5
            sut r6 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r6 = r6.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = "null secure ID. appId"
            aucj r10 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r10 = (defpackage.tad) r10     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = r10.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r10)     // Catch:{ all -> 0x0d12 }
            r6.a(r8, r10)     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = "null"
            goto L_0x08f1
        L_0x08d5:
            boolean r8 = r6.isEmpty()     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x08f0
            sut r8 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r8 = r8.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r10 = "empty secure ID. appId"
            aucj r11 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r11 = (defpackage.tad) r11     // Catch:{ all -> 0x0d12 }
            java.lang.String r11 = r11.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r11)     // Catch:{ all -> 0x0d12 }
            r8.a(r10, r11)     // Catch:{ all -> 0x0d12 }
        L_0x08f0:
        L_0x08f1:
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x08f6
            goto L_0x08fc
        L_0x08f6:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x08fc:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r10 = r8.a     // Catch:{ all -> 0x0d12 }
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 | r11
            r8.a = r10     // Catch:{ all -> 0x0d12 }
            r8.F = r6     // Catch:{ all -> 0x0d12 }
            goto L_0x0954
        L_0x090d:
            boolean r8 = r3.o     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0954
            java.lang.Object r8 = r6.first     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0d12 }
            boolean r10 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r10 != 0) goto L_0x091a
            goto L_0x0920
        L_0x091a:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r10 = 0
            r4.c = r10     // Catch:{ all -> 0x0d12 }
        L_0x0920:
            aucj r10 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r10 = (defpackage.tad) r10     // Catch:{ all -> 0x0d12 }
            r8.getClass()     // Catch:{ all -> 0x0d12 }
            int r11 = r10.a     // Catch:{ all -> 0x0d12 }
            r12 = 65536(0x10000, float:9.18355E-41)
            r11 = r11 | r12
            r10.a = r11     // Catch:{ all -> 0x0d12 }
            r10.u = r8     // Catch:{ all -> 0x0d12 }
            java.lang.Object r8 = r6.second     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0954
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0d12 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0d12 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0941
            goto L_0x0947
        L_0x0941:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0947:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            int r10 = r8.a     // Catch:{ all -> 0x0d12 }
            r11 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r11
            r8.a = r10     // Catch:{ all -> 0x0d12 }
            r8.v = r6     // Catch:{ all -> 0x0d12 }
        L_0x0954:
            spn r6 = r28.q()     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0961
            goto L_0x0967
        L_0x0961:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0967:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r10 = r8.a     // Catch:{ all -> 0x0d12 }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r8.a = r10     // Catch:{ all -> 0x0d12 }
            r8.m = r6     // Catch:{ all -> 0x0d12 }
            spn r6 = r28.q()     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r6.c()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0983
            goto L_0x0989
        L_0x0983:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0989:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r10 = r8.a     // Catch:{ all -> 0x0d12 }
            r9 = r9 | r10
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.l = r6     // Catch:{ all -> 0x0d12 }
            spn r6 = r28.q()     // Catch:{ all -> 0x0d12 }
            long r8 = r6.d()     // Catch:{ all -> 0x0d12 }
            int r6 = (int) r8     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x09a5
            goto L_0x09ab
        L_0x09a5:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x09ab:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            int r9 = r8.a     // Catch:{ all -> 0x0d12 }
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.o = r6     // Catch:{ all -> 0x0d12 }
            spn r6 = r28.q()     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r6.e()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x09c4
            goto L_0x09ca
        L_0x09c4:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x09ca:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r9 = r8.a     // Catch:{ all -> 0x0d12 }
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.n = r6     // Catch:{ all -> 0x0d12 }
            spg r6 = r28.d()     // Catch:{ all -> 0x0d12 }
            suc r8 = defpackage.sud.aQ     // Catch:{ all -> 0x0d12 }
            boolean r6 = r6.a((defpackage.suc) r8)     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x09e6
            goto L_0x0a00
        L_0x09e6:
            long r8 = r3.l     // Catch:{ all -> 0x0d12 }
            boolean r6 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x09ed
            goto L_0x09f3
        L_0x09ed:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x0d12 }
        L_0x09f3:
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            int r10 = r6.a     // Catch:{ all -> 0x0d12 }
            r11 = 1073741824(0x40000000, float:2.0)
            r10 = r10 | r11
            r6.a = r10     // Catch:{ all -> 0x0d12 }
            r6.H = r8     // Catch:{ all -> 0x0d12 }
        L_0x0a00:
            svv r6 = r1.g     // Catch:{ all -> 0x0d12 }
            boolean r6 = r6.q()     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0a36
            aucj r6 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r6 = (defpackage.tad) r6     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x0d12 }
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r6 = r1.a((java.lang.String) r6, (long) r8)     // Catch:{ all -> 0x0d12 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0a1b
            goto L_0x0a36
        L_0x0a1b:
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0a20
            goto L_0x0a26
        L_0x0a20:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0a26:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r9 = r8.a     // Catch:{ all -> 0x0d12 }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r10
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.I = r6     // Catch:{ all -> 0x0d12 }
        L_0x0a36:
            spj r6 = r28.h()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x0d12 }
            sou r6 = r6.b(r8)     // Catch:{ all -> 0x0d12 }
            if (r6 != 0) goto L_0x0ab5
            sou r6 = new sou     // Catch:{ all -> 0x0d12 }
            svv r8 = r1.g     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r3.a     // Catch:{ all -> 0x0d12 }
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0d12 }
            szj r8 = r28.p()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r8.o()     // Catch:{ all -> 0x0d12 }
            r6.a((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.k     // Catch:{ all -> 0x0d12 }
            r6.e((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.b     // Catch:{ all -> 0x0d12 }
            r6.b((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            svf r8 = r28.e()     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r3.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r8.b(r9)     // Catch:{ all -> 0x0d12 }
            r6.d((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r6.g((long) r8)     // Catch:{ all -> 0x0d12 }
            r6.a((long) r8)     // Catch:{ all -> 0x0d12 }
            r6.b((long) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.c     // Catch:{ all -> 0x0d12 }
            r6.f((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            long r8 = r3.j     // Catch:{ all -> 0x0d12 }
            r6.c((long) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.d     // Catch:{ all -> 0x0d12 }
            r6.g((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            long r8 = r3.e     // Catch:{ all -> 0x0d12 }
            r6.d((long) r8)     // Catch:{ all -> 0x0d12 }
            long r8 = r3.f     // Catch:{ all -> 0x0d12 }
            r6.e((long) r8)     // Catch:{ all -> 0x0d12 }
            boolean r8 = r3.h     // Catch:{ all -> 0x0d12 }
            r6.a((boolean) r8)     // Catch:{ all -> 0x0d12 }
            spg r8 = r28.d()     // Catch:{ all -> 0x0d12 }
            suc r9 = defpackage.sud.aQ     // Catch:{ all -> 0x0d12 }
            boolean r8 = r8.a((defpackage.suc) r9)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0aa3
            goto L_0x0aa8
        L_0x0aa3:
            long r8 = r3.l     // Catch:{ all -> 0x0d12 }
            r6.j(r8)     // Catch:{ all -> 0x0d12 }
        L_0x0aa8:
            long r8 = r3.t     // Catch:{ all -> 0x0d12 }
            r6.f((long) r8)     // Catch:{ all -> 0x0d12 }
            spj r8 = r28.h()     // Catch:{ all -> 0x0d12 }
            r8.a((defpackage.sou) r6)     // Catch:{ all -> 0x0d12 }
            goto L_0x0ab6
        L_0x0ab5:
        L_0x0ab6:
            java.lang.String r8 = r6.b()     // Catch:{ all -> 0x0d12 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0ac1
            goto L_0x0ae0
        L_0x0ac1:
            java.lang.String r8 = r6.b()     // Catch:{ all -> 0x0d12 }
            boolean r9 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r9 != 0) goto L_0x0aca
            goto L_0x0ad0
        L_0x0aca:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r9 = 0
            r4.c = r9     // Catch:{ all -> 0x0d12 }
        L_0x0ad0:
            aucj r9 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r9 = (defpackage.tad) r9     // Catch:{ all -> 0x0d12 }
            r8.getClass()     // Catch:{ all -> 0x0d12 }
            int r10 = r9.a     // Catch:{ all -> 0x0d12 }
            r11 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 | r11
            r9.a = r10     // Catch:{ all -> 0x0d12 }
            r9.w = r8     // Catch:{ all -> 0x0d12 }
        L_0x0ae0:
            java.lang.String r8 = r6.f()     // Catch:{ all -> 0x0d12 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0d12 }
            if (r8 == 0) goto L_0x0aeb
            goto L_0x0b0a
        L_0x0aeb:
            java.lang.String r6 = r6.f()     // Catch:{ all -> 0x0d12 }
            boolean r8 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r8 != 0) goto L_0x0af4
            goto L_0x0afa
        L_0x0af4:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r4.c = r8     // Catch:{ all -> 0x0d12 }
        L_0x0afa:
            aucj r8 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r8 = (defpackage.tad) r8     // Catch:{ all -> 0x0d12 }
            r6.getClass()     // Catch:{ all -> 0x0d12 }
            int r9 = r8.a     // Catch:{ all -> 0x0d12 }
            r10 = 16777216(0x1000000, float:2.3509887E-38)
            r9 = r9 | r10
            r8.a = r9     // Catch:{ all -> 0x0d12 }
            r8.D = r6     // Catch:{ all -> 0x0d12 }
        L_0x0b0a:
            spj r6 = r28.h()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x0d12 }
            java.util.List r6 = r6.a((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            r10 = 0
        L_0x0b15:
            int r8 = r6.size()     // Catch:{ all -> 0x0d12 }
            if (r10 < r8) goto L_0x0c8f
            spj r6 = r28.h()     // Catch:{ IOException -> 0x0bdb }
            aucj r8 = r4.i()     // Catch:{ IOException -> 0x0bdb }
            tad r8 = (defpackage.tad) r8     // Catch:{ IOException -> 0x0bdb }
            r6.h()     // Catch:{ IOException -> 0x0bdb }
            r6.q()     // Catch:{ IOException -> 0x0bdb }
            defpackage.iva.a((java.lang.Object) r8)     // Catch:{ IOException -> 0x0bdb }
            java.lang.String r9 = r8.q     // Catch:{ IOException -> 0x0bdb }
            defpackage.iva.c(r9)     // Catch:{ IOException -> 0x0bdb }
            byte[] r9 = r8.k()     // Catch:{ IOException -> 0x0bdb }
            szg r10 = r6.o()     // Catch:{ IOException -> 0x0bdb }
            long r10 = r10.a((byte[]) r9)     // Catch:{ IOException -> 0x0bdb }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0bdb }
            r12.<init>()     // Catch:{ IOException -> 0x0bdb }
            java.lang.String r13 = "app_id"
            java.lang.String r14 = r8.q     // Catch:{ IOException -> 0x0bdb }
            r12.put(r13, r14)     // Catch:{ IOException -> 0x0bdb }
            java.lang.String r13 = "metadata_fingerprint"
            java.lang.Long r14 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0bdb }
            r12.put(r13, r14)     // Catch:{ IOException -> 0x0bdb }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0bdb }
            android.database.sqlite.SQLiteDatabase r9 = r6.e()     // Catch:{ SQLiteException -> 0x0bc7 }
            java.lang.String r13 = "raw_events_metadata"
            r14 = 0
            r9.insertWithOnConflict(r13, r14, r12, r7)     // Catch:{ SQLiteException -> 0x0bc7 }
            spj r4 = r28.h()     // Catch:{ all -> 0x0d12 }
            com.google.android.gms.measurement.internal.EventParams r6 = r5.f     // Catch:{ all -> 0x0d12 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0d12 }
        L_0x0b6d:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0baa
            svn r2 = r28.f()     // Catch:{ all -> 0x0d12 }
            java.lang.String r6 = r5.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.c(r6, r7)     // Catch:{ all -> 0x0d12 }
            spj r12 = r28.h()     // Catch:{ all -> 0x0d12 }
            long r13 = r28.t()     // Catch:{ all -> 0x0d12 }
            java.lang.String r15 = r5.a     // Catch:{ all -> 0x0d12 }
            r16 = 0
            r17 = 0
            sph r6 = r12.a((long) r13, (java.lang.String) r15, (boolean) r16, (boolean) r17)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0ba8
            long r6 = r6.e     // Catch:{ all -> 0x0d12 }
            spg r2 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = r5.a     // Catch:{ all -> 0x0d12 }
            int r2 = r2.a((java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            long r8 = (long) r2     // Catch:{ all -> 0x0d12 }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0ba6
            r12 = 0
            goto L_0x0bb8
        L_0x0ba6:
            r12 = 1
            goto L_0x0bb8
        L_0x0ba8:
            r12 = 0
            goto L_0x0bb8
        L_0x0baa:
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0d12 }
            boolean r7 = r2.equals(r7)     // Catch:{ all -> 0x0d12 }
            if (r7 == 0) goto L_0x0bc4
            r12 = 1
        L_0x0bb8:
            boolean r2 = r4.a((defpackage.spo) r5, (long) r10, (boolean) r12)     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0bbf
            goto L_0x0bf2
        L_0x0bbf:
            r8 = 0
            r1.i = r8     // Catch:{ all -> 0x0d12 }
            goto L_0x0bf2
        L_0x0bc4:
            r8 = 0
            goto L_0x0b6d
        L_0x0bc7:
            r0 = move-exception
            r2 = r0
            sut r6 = r6.E()     // Catch:{ IOException -> 0x0bdb }
            sur r6 = r6.c     // Catch:{ IOException -> 0x0bdb }
            java.lang.String r7 = "Error storing raw event metadata. appId"
            java.lang.String r8 = r8.q     // Catch:{ IOException -> 0x0bdb }
            java.lang.Object r8 = defpackage.sut.a((java.lang.String) r8)     // Catch:{ IOException -> 0x0bdb }
            r6.a(r7, r8, r2)     // Catch:{ IOException -> 0x0bdb }
            throw r2     // Catch:{ IOException -> 0x0bdb }
        L_0x0bdb:
            r0 = move-exception
            r2 = r0
            sut r6 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r6 = r6.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "Data loss. Failed to insert raw event metadata. appId"
            aucj r4 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r4.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x0d12 }
            r6.a(r7, r4, r2)     // Catch:{ all -> 0x0d12 }
        L_0x0bf2:
            spj r2 = r28.h()     // Catch:{ all -> 0x0d12 }
            r2.c()     // Catch:{ all -> 0x0d12 }
            boolean r2 = defpackage.ayjn.b()     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0c0d
            spg r2 = r28.d()     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0d12 }
            suc r4 = defpackage.sud.aJ     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.b(r3, r4)     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0c67
        L_0x0c0d:
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            r3 = 2
            boolean r2 = r2.a((int) r3)     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0c19
            goto L_0x0c67
        L_0x0c19:
            sut r2 = r28.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.k     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Event recorded"
            suk r4 = r28.m()     // Catch:{ all -> 0x0d12 }
            boolean r6 = r4.b()     // Catch:{ all -> 0x0d12 }
            if (r6 == 0) goto L_0x0c60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d12 }
            r6.<init>()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "Event{appId='"
            r6.append(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r5.a     // Catch:{ all -> 0x0d12 }
            r6.append(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "', name='"
            r6.append(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r4.a((java.lang.String) r7)     // Catch:{ all -> 0x0d12 }
            r6.append(r7)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "', params="
            r6.append(r7)     // Catch:{ all -> 0x0d12 }
            com.google.android.gms.measurement.internal.EventParams r5 = r5.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r4.a((com.google.android.gms.measurement.internal.EventParams) r5)     // Catch:{ all -> 0x0d12 }
            r6.append(r4)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "}"
            r6.append(r4)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0d12 }
            goto L_0x0c64
        L_0x0c60:
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0d12 }
        L_0x0c64:
            r2.a(r3, r4)     // Catch:{ all -> 0x0d12 }
        L_0x0c67:
            spj r2 = r28.h()
            r2.d()
            r28.w()
            sut r2 = r28.E()
            sur r2 = r2.k
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.a(r4, r3)
            return
        L_0x0c8f:
            r8 = 0
            r14 = 0
            tah r11 = defpackage.tah.g     // Catch:{ all -> 0x0d12 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x0d12 }
            java.lang.Object r12 = r6.get(r10)     // Catch:{ all -> 0x0d12 }
            szi r12 = (defpackage.szi) r12     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x0d12 }
            boolean r13 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r13 != 0) goto L_0x0ca5
            goto L_0x0cab
        L_0x0ca5:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r13 = 0
            r11.c = r13     // Catch:{ all -> 0x0d12 }
        L_0x0cab:
            aucj r13 = r11.b     // Catch:{ all -> 0x0d12 }
            tah r13 = (defpackage.tah) r13     // Catch:{ all -> 0x0d12 }
            r12.getClass()     // Catch:{ all -> 0x0d12 }
            int r15 = r13.a     // Catch:{ all -> 0x0d12 }
            r16 = 2
            r15 = r15 | 2
            r13.a = r15     // Catch:{ all -> 0x0d12 }
            r13.c = r12     // Catch:{ all -> 0x0d12 }
            java.lang.Object r12 = r6.get(r10)     // Catch:{ all -> 0x0d12 }
            szi r12 = (defpackage.szi) r12     // Catch:{ all -> 0x0d12 }
            long r12 = r12.d     // Catch:{ all -> 0x0d12 }
            boolean r15 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r15 != 0) goto L_0x0cc9
            goto L_0x0ccf
        L_0x0cc9:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r15 = 0
            r11.c = r15     // Catch:{ all -> 0x0d12 }
        L_0x0ccf:
            aucj r15 = r11.b     // Catch:{ all -> 0x0d12 }
            tah r15 = (defpackage.tah) r15     // Catch:{ all -> 0x0d12 }
            int r7 = r15.a     // Catch:{ all -> 0x0d12 }
            r17 = 1
            r7 = r7 | 1
            r15.a = r7     // Catch:{ all -> 0x0d12 }
            r15.b = r12     // Catch:{ all -> 0x0d12 }
            szg r7 = r28.l()     // Catch:{ all -> 0x0d12 }
            java.lang.Object r12 = r6.get(r10)     // Catch:{ all -> 0x0d12 }
            szi r12 = (defpackage.szi) r12     // Catch:{ all -> 0x0d12 }
            java.lang.Object r12 = r12.e     // Catch:{ all -> 0x0d12 }
            r7.a((defpackage.aucd) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x0d12 }
            boolean r7 = r4.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0cf2
            r7 = 0
            goto L_0x0cf8
        L_0x0cf2:
            r4.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0cf8:
            aucj r12 = r4.b     // Catch:{ all -> 0x0d12 }
            tad r12 = (defpackage.tad) r12     // Catch:{ all -> 0x0d12 }
            aucj r11 = r11.i()     // Catch:{ all -> 0x0d12 }
            tah r11 = (defpackage.tah) r11     // Catch:{ all -> 0x0d12 }
            r11.getClass()     // Catch:{ all -> 0x0d12 }
            r12.b()     // Catch:{ all -> 0x0d12 }
            aucx r12 = r12.e     // Catch:{ all -> 0x0d12 }
            r12.add(r11)     // Catch:{ all -> 0x0d12 }
            int r10 = r10 + 1
            r7 = 4
            goto L_0x0b15
        L_0x0d12:
            r0 = move-exception
            r2 = r0
            spj r3 = r28.h()
            r3.d()
            throw r2
        L_0x0d1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.b(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    static final void a(aucd aucd, String str) {
        List unmodifiableList = Collections.unmodifiableList(((szz) aucd.b).b);
        int i2 = 0;
        while (i2 < unmodifiableList.size()) {
            if (!str.equals(((tab) unmodifiableList.get(i2)).b)) {
                i2++;
            } else {
                aucd.w(i2);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0154, code lost:
        r0 = (java.lang.Integer) r0.get(r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aucd r50, defpackage.szd r51) {
        /*
            r49 = this;
            r1 = r50
            r2 = r51
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            szj r0 = r49.p()
            java.security.SecureRandom r5 = r0.e()
            r7 = 0
        L_0x0017:
            aucj r0 = r1.b
            tad r0 = (defpackage.tad) r0
            aucx r0 = r0.d
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x033a
            szz r0 = r1.x((int) r7)
            r8 = 5
            java.lang.Object r8 = r0.c(r8)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r0)
            aucj r0 = r8.b
            szz r0 = (defpackage.szz) r0
            java.lang.String r0 = r0.c
            java.lang.String r9 = "_ep"
            boolean r0 = r0.equals(r9)
            java.lang.String r9 = "_efs"
            java.lang.String r10 = "_sr"
            r11 = 1
            if (r0 == 0) goto L_0x00ac
            szg r0 = r49.l()
            aucj r13 = r8.i()
            szz r13 = (defpackage.szz) r13
            java.lang.String r14 = "_en"
            java.lang.Object r0 = r0.a((defpackage.szz) r13, (java.lang.String) r14)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r13 = r3.get(r0)
            spp r13 = (defpackage.spp) r13
            if (r13 != 0) goto L_0x006f
            spj r13 = r49.h()
            tad r14 = r2.a
            java.lang.String r14 = r14.q
            spp r13 = r13.a((java.lang.String) r14, (java.lang.String) r0)
            r3.put(r0, r13)
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            java.lang.Long r0 = r13.i
            if (r0 != 0) goto L_0x00a5
            java.lang.Long r0 = r13.j
            long r14 = r0.longValue()
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            szg r0 = r49.l()
            java.lang.Long r14 = r13.j
            r0.a((defpackage.aucd) r8, (java.lang.String) r10, (java.lang.Object) r14)
        L_0x0087:
            java.lang.Boolean r0 = r13.k
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009c
            szg r0 = r49.l()
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r0.a((defpackage.aucd) r8, (java.lang.String) r9, (java.lang.Object) r10)
        L_0x009c:
            aucj r0 = r8.i()
            szz r0 = (defpackage.szz) r0
            r4.add(r0)
        L_0x00a5:
            r1.b((int) r7, (defpackage.aucd) r8)
            r12 = r5
            r9 = r7
            goto L_0x0333
        L_0x00ac:
            svn r13 = r49.f()
            tad r0 = r2.a
            java.lang.String r14 = r0.q
            java.lang.String r0 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r0 = r13.a((java.lang.String) r14, (java.lang.String) r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            r16 = 0
            if (r15 != 0) goto L_0x00dd
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00c9 }
            r13 = r16
            goto L_0x00df
        L_0x00c9:
            r0 = move-exception
            r15 = r0
            sut r0 = r13.E()
            sur r0 = r0.f
            java.lang.Object r13 = defpackage.sut.a((java.lang.String) r14)
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            r0.a(r14, r13, r15)
            r13 = r16
            goto L_0x00df
        L_0x00dd:
            r13 = r16
        L_0x00df:
            szj r0 = r49.p()
            aucj r15 = r8.b
            szz r15 = (defpackage.szz) r15
            r17 = r7
            long r6 = r15.d
            long r6 = r0.a((long) r6, (long) r13)
            aucj r0 = r8.i()
            szz r0 = (defpackage.szz) r0
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "_dbg"
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            r18 = r9
            if (r12 != 0) goto L_0x0136
            aucx r0 = r0.b
            int r12 = r0.size()
            r9 = 0
        L_0x010a:
            if (r9 < r12) goto L_0x010d
            goto L_0x0136
        L_0x010d:
            java.lang.Object r19 = r0.get(r9)
            r20 = r0
            r0 = r19
            tab r0 = (defpackage.tab) r0
            int r9 = r9 + 1
            r19 = r9
            java.lang.String r9 = r0.b
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x0131
            long r11 = r0.d
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0136
            r0 = 1
            goto L_0x0162
        L_0x0131:
            r9 = r19
            r0 = r20
            goto L_0x010a
        L_0x0136:
            svn r0 = r49.f()
            tad r9 = r2.a
            java.lang.String r9 = r9.q
            aucj r11 = r8.b
            szz r11 = (defpackage.szz) r11
            java.lang.String r11 = r11.c
            r0.h()
            r0.a((java.lang.String) r9)
            java.util.Map r0 = r0.b
            java.lang.Object r0 = r0.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r0.get(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0161
            int r0 = r0.intValue()
            goto L_0x0162
        L_0x0161:
            r0 = 1
        L_0x0162:
            if (r0 > 0) goto L_0x018a
            sut r6 = r49.E()
            sur r6 = r6.f
            aucj r7 = r8.b
            szz r7 = (defpackage.szz) r7
            java.lang.String r7 = r7.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = "Sample rate must be positive. event, rate"
            r6.a(r9, r7, r0)
            aucj r0 = r8.i()
            szz r0 = (defpackage.szz) r0
            r4.add(r0)
            r9 = r17
            r1.b((int) r9, (defpackage.aucd) r8)
            r12 = r5
            goto L_0x0333
        L_0x018a:
            r9 = r17
            aucj r11 = r8.b
            szz r11 = (defpackage.szz) r11
            java.lang.String r11 = r11.c
            java.lang.Object r11 = r3.get(r11)
            spp r11 = (defpackage.spp) r11
            if (r11 != 0) goto L_0x0221
            spj r11 = r49.h()
            tad r12 = r2.a
            java.lang.String r12 = r12.q
            aucj r15 = r8.b
            szz r15 = (defpackage.szz) r15
            java.lang.String r15 = r15.c
            spp r11 = r11.a((java.lang.String) r12, (java.lang.String) r15)
            if (r11 != 0) goto L_0x0221
            sut r11 = r49.E()
            sur r11 = r11.f
            tad r12 = r2.a
            java.lang.String r12 = r12.q
            aucj r15 = r8.b
            szz r15 = (defpackage.szz) r15
            java.lang.String r15 = r15.c
            r19 = r13
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            r11.a(r13, r12, r15)
            spg r11 = r49.d()
            tad r12 = r2.a
            java.lang.String r12 = r12.q
            suc r13 = defpackage.sud.ae
            boolean r11 = r11.b(r12, r13)
            if (r11 != 0) goto L_0x01f5
            spp r11 = new spp
            tad r12 = r2.a
            java.lang.String r12 = r12.q
            aucj r13 = r8.b
            szz r13 = (defpackage.szz) r13
            java.lang.String r14 = r13.c
            r24 = 1
            r26 = 1
            r30 = r6
            long r6 = r13.d
            r21 = r11
            r22 = r12
            r23 = r14
            r28 = r6
            r21.<init>(r22, r23, r24, r26, r28)
            goto L_0x0225
        L_0x01f5:
            r30 = r6
            spp r11 = new spp
            r32 = r11
            tad r6 = r2.a
            java.lang.String r6 = r6.q
            r33 = r6
            aucj r6 = r8.b
            szz r6 = (defpackage.szz) r6
            java.lang.String r7 = r6.c
            r34 = r7
            r35 = 1
            r37 = 1
            r39 = 1
            long r6 = r6.d
            r41 = r6
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r32.<init>(r33, r34, r35, r37, r39, r41, r43, r45, r46, r47, r48)
            goto L_0x0225
        L_0x0221:
            r30 = r6
            r19 = r13
        L_0x0225:
            szg r6 = r49.l()
            aucj r7 = r8.i()
            szz r7 = (defpackage.szz) r7
            java.lang.String r12 = "_eid"
            java.lang.Object r6 = r6.a((defpackage.szz) r7, (java.lang.String) r12)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L_0x023b
            r7 = 1
            goto L_0x023c
        L_0x023b:
            r7 = 0
        L_0x023c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r12 = 0
            r13 = 1
            if (r0 != r13) goto L_0x0272
            aucj r0 = r8.i()
            szz r0 = (defpackage.szz) r0
            r4.add(r0)
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x026c
            java.lang.Long r0 = r11.i
            if (r0 != 0) goto L_0x025f
            java.lang.Long r0 = r11.j
            if (r0 != 0) goto L_0x025f
            java.lang.Boolean r0 = r11.k
            if (r0 == 0) goto L_0x026c
        L_0x025f:
            spp r0 = r11.a(r12, r12, r12)
            aucj r6 = r8.b
            szz r6 = (defpackage.szz) r6
            java.lang.String r6 = r6.c
            r3.put(r6, r0)
        L_0x026c:
            r1.b((int) r9, (defpackage.aucd) r8)
            r12 = r5
            goto L_0x0333
        L_0x0272:
            int r13 = r5.nextInt(r0)
            if (r13 != 0) goto L_0x02ad
            szg r6 = r49.l()
            long r13 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r6.a((defpackage.aucd) r8, (java.lang.String) r10, (java.lang.Object) r0)
            aucj r6 = r8.i()
            szz r6 = (defpackage.szz) r6
            r4.add(r6)
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L_0x0298
            spp r11 = r11.a(r12, r0, r12)
            goto L_0x0299
        L_0x0298:
        L_0x0299:
            aucj r0 = r8.b
            szz r0 = (defpackage.szz) r0
            java.lang.String r6 = r0.c
            long r12 = r0.d
            r14 = r30
            spp r0 = r11.a(r12, r14)
            r3.put(r6, r0)
            r12 = r5
            goto L_0x032e
        L_0x02ad:
            r14 = r30
            java.lang.Long r13 = r11.h
            if (r13 == 0) goto L_0x02bb
            long r19 = r13.longValue()
            r12 = r5
            r21 = r6
            goto L_0x02ce
        L_0x02bb:
            szj r13 = r49.p()
            aucj r12 = r8.b
            szz r12 = (defpackage.szz) r12
            long r1 = r12.e
            r12 = r5
            r21 = r6
            r5 = r19
            long r19 = r13.a((long) r1, (long) r5)
        L_0x02ce:
            int r1 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0318
            szg r1 = r49.l()
            r5 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = r18
            r1.a((defpackage.aucd) r8, (java.lang.String) r5, (java.lang.Object) r2)
            szg r1 = r49.l()
            long r5 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.a((defpackage.aucd) r8, (java.lang.String) r10, (java.lang.Object) r0)
            aucj r1 = r8.i()
            szz r1 = (defpackage.szz) r1
            r4.add(r1)
            boolean r1 = r7.booleanValue()
            if (r1 == 0) goto L_0x0307
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            spp r11 = r11.a(r2, r0, r1)
            goto L_0x0308
        L_0x0307:
        L_0x0308:
            aucj r0 = r8.b
            szz r0 = (defpackage.szz) r0
            java.lang.String r1 = r0.c
            long r5 = r0.d
            spp r0 = r11.a(r5, r14)
            r3.put(r1, r0)
            goto L_0x032e
        L_0x0318:
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x032e
            aucj r0 = r8.b
            szz r0 = (defpackage.szz) r0
            java.lang.String r0 = r0.c
            r6 = r21
            r1 = 0
            spp r1 = r11.a(r6, r1, r1)
            r3.put(r0, r1)
        L_0x032e:
            r1 = r50
            r1.b((int) r9, (defpackage.aucd) r8)
        L_0x0333:
            int r7 = r9 + 1
            r2 = r51
            r5 = r12
            goto L_0x0017
        L_0x033a:
            int r0 = r4.size()
            aucj r2 = r1.b
            tad r2 = (defpackage.tad) r2
            aucx r2 = r2.d
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0378
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x034f
            goto L_0x0355
        L_0x034f:
            r50.c()
            r2 = 0
            r1.c = r2
        L_0x0355:
            aucj r0 = r1.b
            tad r0 = (defpackage.tad) r0
            tad r2 = defpackage.tad.P
            aucx r2 = defpackage.aucj.s()
            r0.d = r2
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x0366
            goto L_0x036c
        L_0x0366:
            r50.c()
            r2 = 0
            r1.c = r2
        L_0x036c:
            aucj r0 = r1.b
            tad r0 = (defpackage.tad) r0
            r0.a()
            aucx r0 = r0.d
            defpackage.auab.a((java.lang.Iterable) r4, (java.util.List) r0)
        L_0x0378:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0380:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x039a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            spj r2 = r49.h()
            java.lang.Object r1 = r1.getValue()
            spp r1 = (defpackage.spp) r1
            r2.a((defpackage.spp) r1)
            goto L_0x0380
        L_0x039a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.a(aucd, szd):void");
    }

    public static final void a(syx syx) {
        if (syx == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!syx.p()) {
            String valueOf = String.valueOf(syx.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final boolean a(aucd aucd, aucd aucd2) {
        String str;
        iva.b("_e".equals(((szz) aucd.b).c));
        l();
        tab b2 = szg.b((szz) aucd.i(), "_sc");
        String str2 = null;
        if (b2 != null) {
            str = b2.c;
        } else {
            str = null;
        }
        l();
        tab b3 = szg.b((szz) aucd2.i(), "_pc");
        if (b3 != null) {
            str2 = b3.c;
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        b(aucd, aucd2);
        return true;
    }

    public final AppMetadata a(String str) {
        String str2 = str;
        sou b2 = h().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            E().j.a("No app data available; dropping", str2);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            String c2 = b2.c();
            String i2 = b2.i();
            long j2 = b2.j();
            String k2 = b2.k();
            long l2 = b2.l();
            long m2 = b2.m();
            boolean o2 = b2.o();
            String f2 = b2.f();
            long u2 = b2.u();
            boolean v2 = b2.v();
            boolean w2 = b2.w();
            String d2 = b2.d();
            Boolean x2 = b2.x();
            long n2 = b2.n();
            List y = b2.y();
            ayjy.c();
            return new AppMetadata(str, c2, i2, j2, k2, l2, m2, (String) null, o2, false, f2, u2, 0, 0, v2, w2, false, d2, x2, n2, y);
        }
        E().c.a("App version does not match; dropping. appId", sut.a(str));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: android.content.pm.ApplicationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: android.content.pm.PackageInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: android.content.pm.PackageInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: sou} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: android.content.pm.PackageInfo} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0351 A[Catch:{ NameNotFoundException -> 0x03b7, all -> 0x0453 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03cd A[Catch:{ NameNotFoundException -> 0x03b7, all -> 0x0453 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e9 A[Catch:{ NameNotFoundException -> 0x03b7, all -> 0x0453 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x040e A[Catch:{ NameNotFoundException -> 0x03b7, all -> 0x0453 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.measurement.internal.AppMetadata r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            r23.r()
            r23.s()
            defpackage.iva.a((java.lang.Object) r24)
            java.lang.String r0 = r2.a
            defpackage.iva.c(r0)
            boolean r0 = d(r24)
            if (r0 == 0) goto L_0x045c
            spj r0 = r23.h()
            java.lang.String r7 = r2.a
            sou r0 = r0.b(r7)
            r7 = 0
            if (r0 == 0) goto L_0x0058
            java.lang.String r9 = r0.c()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0058
            java.lang.String r9 = r2.b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0058
            r0.h((long) r7)
            spj r9 = r23.h()
            r9.a((defpackage.sou) r0)
            svn r0 = r23.f()
            java.lang.String r9 = r2.a
            r0.h()
            java.util.Map r0 = r0.a
            r0.remove(r9)
        L_0x0058:
            boolean r0 = r2.h
            if (r0 != 0) goto L_0x0060
            r23.b((com.google.android.gms.measurement.internal.AppMetadata) r24)
            return
        L_0x0060:
            long r9 = r2.m
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            jiq r0 = r23.o()
            long r9 = r0.a()
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            spg r0 = r23.d()
            java.lang.String r11 = r2.a
            suc r12 = defpackage.sud.U
            boolean r0 = r0.b(r11, r12)
            r15 = 0
            if (r0 == 0) goto L_0x008a
            spn r0 = r23.q()
            r0.h()
            r0.b = r15
            r0.c = r7
        L_0x008a:
            int r0 = r2.n
            r13 = 1
            r14 = 0
            if (r0 != 0) goto L_0x0091
            goto L_0x00ab
        L_0x0091:
            if (r0 == r13) goto L_0x00aa
            sut r11 = r23.E()
            sur r11 = r11.f
            java.lang.String r12 = r2.a
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r13 = "Incorrect app type, assuming installed app. appId, appType"
            r11.a(r13, r12, r0)
            r0 = 0
            goto L_0x00ab
        L_0x00aa:
        L_0x00ab:
            spj r11 = r23.h()
            r11.b()
            spg r11 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = r2.a     // Catch:{ all -> 0x0453 }
            suc r13 = defpackage.sud.U     // Catch:{ all -> 0x0453 }
            boolean r11 = r11.b(r12, r13)     // Catch:{ all -> 0x0453 }
            if (r11 == 0) goto L_0x0128
            spj r11 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.String r13 = "_npa"
            szi r13 = r11.c(r12, r13)     // Catch:{ all -> 0x0453 }
            if (r13 == 0) goto L_0x00db
            java.lang.String r11 = "auto"
            java.lang.String r12 = r13.b     // Catch:{ all -> 0x0453 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0453 }
            if (r11 != 0) goto L_0x00db
            r20 = r15
            goto L_0x012a
        L_0x00db:
            java.lang.Boolean r11 = r2.s     // Catch:{ all -> 0x0453 }
            if (r11 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.UserAttributeParcel r12 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0453 }
            java.lang.String r17 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0453 }
            if (r11 != 0) goto L_0x00ec
            r18 = r7
            goto L_0x00ee
        L_0x00ec:
            r18 = 1
        L_0x00ee:
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0453 }
            java.lang.String r19 = "auto"
            r11 = r12
            r7 = r12
            r12 = r17
            r8 = r13
            r13 = r9
            r20 = r15
            r15 = r18
            r16 = r19
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x0453 }
            if (r8 == 0) goto L_0x010f
            java.lang.Object r8 = r8.e     // Catch:{ all -> 0x0453 }
            java.lang.Long r11 = r7.d     // Catch:{ all -> 0x0453 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0453 }
            if (r8 != 0) goto L_0x012a
        L_0x010f:
            r1.a((com.google.android.gms.measurement.internal.UserAttributeParcel) r7, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            goto L_0x012a
        L_0x0113:
            r8 = r13
            r20 = r15
            if (r8 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.UserAttributeParcel r7 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x0453 }
            r1.b((com.google.android.gms.measurement.internal.UserAttributeParcel) r7, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            goto L_0x012a
        L_0x0128:
            r20 = r15
        L_0x012a:
            spj r7 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x0453 }
            sou r15 = r7.b(r8)     // Catch:{ all -> 0x0453 }
            if (r15 == 0) goto L_0x016d
            szj r7 = r23.p()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = r2.b     // Catch:{ all -> 0x0453 }
            java.lang.String r11 = r15.c()     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = r2.r     // Catch:{ all -> 0x0453 }
            java.lang.String r13 = r15.d()     // Catch:{ all -> 0x0453 }
            boolean r7 = r7.a((java.lang.String) r8, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0453 }
            if (r7 == 0) goto L_0x016d
            sut r7 = r23.E()     // Catch:{ all -> 0x0453 }
            sur r7 = r7.f     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r11 = r15.a()     // Catch:{ all -> 0x0453 }
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r11)     // Catch:{ all -> 0x0453 }
            r7.a(r8, r11)     // Catch:{ all -> 0x0453 }
            spj r7 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = r15.a()     // Catch:{ all -> 0x0453 }
            r7.c(r8)     // Catch:{ all -> 0x0453 }
            r15 = r20
            goto L_0x016e
        L_0x016d:
        L_0x016e:
            if (r15 == 0) goto L_0x01c9
            long r7 = r15.j()     // Catch:{ all -> 0x0453 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0187
            long r7 = r15.j()     // Catch:{ all -> 0x0453 }
            long r13 = r2.j     // Catch:{ all -> 0x0453 }
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x0187
            r13 = 1
            goto L_0x0188
        L_0x0187:
            r13 = 0
        L_0x0188:
            long r7 = r15.j()     // Catch:{ all -> 0x0453 }
            int r14 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x01a4
            java.lang.String r7 = r15.i()     // Catch:{ all -> 0x0453 }
            if (r7 == 0) goto L_0x01a4
            java.lang.String r7 = r15.i()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = r2.c     // Catch:{ all -> 0x0453 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0453 }
            if (r7 != 0) goto L_0x01a4
            r7 = 1
            goto L_0x01a5
        L_0x01a4:
            r7 = 0
        L_0x01a5:
            r7 = r7 | r13
            if (r7 == 0) goto L_0x01c9
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0453 }
            r7.<init>()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = "_pv"
            java.lang.String r11 = r15.i()     // Catch:{ all -> 0x0453 }
            r7.putString(r8, r11)     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParcel r8 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParams r13 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0453 }
            r13.<init>(r7)     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_au"
            java.lang.String r14 = "auto"
            r11 = r8
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.EventParcel) r8, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
        L_0x01c9:
            r23.b((com.google.android.gms.measurement.internal.AppMetadata) r24)     // Catch:{ all -> 0x0453 }
            if (r0 == 0) goto L_0x01dc
            spj r0 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = "_v"
            spp r0 = r0.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0453 }
            r13 = 1
            goto L_0x01ea
        L_0x01dc:
            spj r7 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.String r11 = "_f"
            spp r7 = r7.a((java.lang.String) r8, (java.lang.String) r11)     // Catch:{ all -> 0x0453 }
            r13 = r0
            r0 = r7
        L_0x01ea:
            if (r0 == 0) goto L_0x020a
            boolean r0 = r2.i     // Catch:{ all -> 0x0453 }
            if (r0 == 0) goto L_0x0444
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0453 }
            r0.<init>()     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParcel r3 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParams r13 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0453 }
            r13.<init>(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_cd"
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.EventParcel) r3, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            goto L_0x0444
        L_0x020a:
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r9 / r7
            r14 = 1
            long r11 = r11 + r14
            long r11 = r11 * r7
            java.lang.String r0 = "_dac"
            java.lang.String r7 = "_r"
            java.lang.String r8 = "_c"
            java.lang.String r15 = "_et"
            if (r13 == 0) goto L_0x027b
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0453 }
            java.lang.String r4 = "_fvt"
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0453 }
            java.lang.String r16 = "auto"
            r11 = r3
            r12 = r4
            r13 = r9
            r4 = r15
            r15 = r5
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.UserAttributeParcel) r3, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            r23.r()     // Catch:{ all -> 0x0453 }
            r23.s()     // Catch:{ all -> 0x0453 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0453 }
            r3.<init>()     // Catch:{ all -> 0x0453 }
            r5 = 1
            r3.putLong(r8, r5)     // Catch:{ all -> 0x0453 }
            r3.putLong(r7, r5)     // Catch:{ all -> 0x0453 }
            spg r5 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0453 }
            suc r7 = defpackage.sud.S     // Catch:{ all -> 0x0453 }
            boolean r5 = r5.b(r6, r7)     // Catch:{ all -> 0x0453 }
            if (r5 == 0) goto L_0x0259
            r5 = 1
            r3.putLong(r4, r5)     // Catch:{ all -> 0x0453 }
        L_0x0259:
            boolean r5 = r2.q     // Catch:{ all -> 0x0453 }
            if (r5 == 0) goto L_0x0262
            r5 = 1
            r3.putLong(r0, r5)     // Catch:{ all -> 0x0453 }
        L_0x0262:
            com.google.android.gms.measurement.internal.EventParcel r0 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParams r13 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0453 }
            r13.<init>(r3)     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_v"
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.EventParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            r18 = r4
            r21 = r9
            goto L_0x0400
        L_0x027b:
            com.google.android.gms.measurement.internal.UserAttributeParcel r13 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0453 }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0453 }
            java.lang.String r18 = "auto"
            r11 = r13
            r12 = r14
            r19 = r0
            r0 = r13
            r13 = r9
            r21 = r9
            r9 = r15
            r15 = r16
            r16 = r18
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.UserAttributeParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            spg r0 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r10 = r2.b     // Catch:{ all -> 0x0453 }
            suc r11 = defpackage.sud.K     // Catch:{ all -> 0x0453 }
            boolean r0 = r0.b(r10, r11)     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x02a7
            goto L_0x02b3
        L_0x02a7:
            r23.r()     // Catch:{ all -> 0x0453 }
            svv r0 = r1.g     // Catch:{ all -> 0x0453 }
            svi r0 = r0.r     // Catch:{ all -> 0x0453 }
            java.lang.String r10 = r2.a     // Catch:{ all -> 0x0453 }
            r0.a(r10)     // Catch:{ all -> 0x0453 }
        L_0x02b3:
            r23.r()     // Catch:{ all -> 0x0453 }
            r23.s()     // Catch:{ all -> 0x0453 }
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ all -> 0x0453 }
            r10.<init>()     // Catch:{ all -> 0x0453 }
            r11 = 1
            r10.putLong(r8, r11)     // Catch:{ all -> 0x0453 }
            r10.putLong(r7, r11)     // Catch:{ all -> 0x0453 }
            r7 = 0
            r10.putLong(r6, r7)     // Catch:{ all -> 0x0453 }
            r10.putLong(r5, r7)     // Catch:{ all -> 0x0453 }
            r10.putLong(r4, r7)     // Catch:{ all -> 0x0453 }
            r10.putLong(r3, r7)     // Catch:{ all -> 0x0453 }
            spg r0 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0453 }
            suc r8 = defpackage.sud.S     // Catch:{ all -> 0x0453 }
            boolean r0 = r0.b(r7, r8)     // Catch:{ all -> 0x0453 }
            if (r0 == 0) goto L_0x02e7
            r7 = 1
            r10.putLong(r9, r7)     // Catch:{ all -> 0x0453 }
        L_0x02e7:
            boolean r0 = r2.q     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            r0 = r19
            r7 = 1
            r10.putLong(r0, r7)     // Catch:{ all -> 0x0453 }
        L_0x02f4:
            spj r0 = r23.h()     // Catch:{ all -> 0x0453 }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x0453 }
            defpackage.iva.c(r7)     // Catch:{ all -> 0x0453 }
            r0.h()     // Catch:{ all -> 0x0453 }
            r0.q()     // Catch:{ all -> 0x0453 }
            java.lang.String r8 = "first_open_count"
            long r7 = r0.e(r7, r8)     // Catch:{ all -> 0x0453 }
            android.content.Context r0 = r23.n()     // Catch:{ all -> 0x0453 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x0328
            sut r0 = r23.E()     // Catch:{ all -> 0x0453 }
            sur r0 = r0.c     // Catch:{ all -> 0x0453 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x0453 }
            r0.a(r3, r4)     // Catch:{ all -> 0x0453 }
            r18 = r9
            goto L_0x03e3
        L_0x0328:
            android.content.Context r0 = r23.n()     // Catch:{ NameNotFoundException -> 0x033a }
            jnh r0 = defpackage.jni.b(r0)     // Catch:{ NameNotFoundException -> 0x033a }
            java.lang.String r11 = r2.a     // Catch:{ NameNotFoundException -> 0x033a }
            r15 = 0
            android.content.pm.PackageInfo r0 = r0.b(r11, r15)     // Catch:{ NameNotFoundException -> 0x0338 }
            goto L_0x034f
        L_0x0338:
            r0 = move-exception
            goto L_0x033c
        L_0x033a:
            r0 = move-exception
            r15 = 0
        L_0x033c:
            sut r11 = r23.E()     // Catch:{ all -> 0x0453 }
            sur r11 = r11.c     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.Object r13 = defpackage.sut.a((java.lang.String) r13)     // Catch:{ all -> 0x0453 }
            r11.a(r12, r13, r0)     // Catch:{ all -> 0x0453 }
            r0 = r20
        L_0x034f:
            if (r0 == 0) goto L_0x03a5
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x0453 }
            r13 = 0
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x03a1
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x0453 }
            long r13 = r0.lastUpdateTime     // Catch:{ all -> 0x0453 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0381
            spg r0 = r23.d()     // Catch:{ all -> 0x0453 }
            suc r11 = defpackage.sud.aA     // Catch:{ all -> 0x0453 }
            boolean r0 = r0.a((defpackage.suc) r11)     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x0374
            r11 = 1
            r10.putLong(r6, r11)     // Catch:{ all -> 0x0453 }
            r13 = 0
            goto L_0x0382
        L_0x0374:
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x037f
            r11 = 1
            r10.putLong(r6, r11)     // Catch:{ all -> 0x0453 }
        L_0x037f:
            r13 = 0
            goto L_0x0382
        L_0x0381:
            r13 = 1
        L_0x0382:
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_fi"
            if (r13 != 0) goto L_0x038b
            r13 = 0
            goto L_0x038d
        L_0x038b:
            r13 = 1
        L_0x038d:
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0453 }
            java.lang.String r16 = "auto"
            r11 = r0
            r13 = r21
            r18 = r9
            r9 = 0
            r15 = r6
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.UserAttributeParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
            goto L_0x03a8
        L_0x03a1:
            r18 = r9
            r9 = 0
            goto L_0x03a8
        L_0x03a5:
            r18 = r9
            r9 = 0
        L_0x03a8:
            android.content.Context r0 = r23.n()     // Catch:{ NameNotFoundException -> 0x03b7 }
            jnh r0 = defpackage.jni.b(r0)     // Catch:{ NameNotFoundException -> 0x03b7 }
            java.lang.String r6 = r2.a     // Catch:{ NameNotFoundException -> 0x03b7 }
            android.content.pm.ApplicationInfo r15 = r0.a((java.lang.String) r6, (int) r9)     // Catch:{ NameNotFoundException -> 0x03b7 }
            goto L_0x03cb
        L_0x03b7:
            r0 = move-exception
            sut r6 = r23.E()     // Catch:{ all -> 0x0453 }
            sur r6 = r6.c     // Catch:{ all -> 0x0453 }
            java.lang.String r9 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.a     // Catch:{ all -> 0x0453 }
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r11)     // Catch:{ all -> 0x0453 }
            r6.a(r9, r11, r0)     // Catch:{ all -> 0x0453 }
            r15 = r20
        L_0x03cb:
            if (r15 == 0) goto L_0x03e3
            int r0 = r15.flags     // Catch:{ all -> 0x0453 }
            r6 = 1
            r0 = r0 & r6
            if (r0 == 0) goto L_0x03d8
            r11 = 1
            r10.putLong(r4, r11)     // Catch:{ all -> 0x0453 }
        L_0x03d8:
            int r0 = r15.flags     // Catch:{ all -> 0x0453 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03e3
            r11 = 1
            r10.putLong(r3, r11)     // Catch:{ all -> 0x0453 }
        L_0x03e3:
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x03ec
            r10.putLong(r5, r7)     // Catch:{ all -> 0x0453 }
        L_0x03ec:
            com.google.android.gms.measurement.internal.EventParcel r0 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParams r13 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0453 }
            r13.<init>(r10)     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_f"
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r21
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.EventParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
        L_0x0400:
            spg r0 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x0453 }
            suc r4 = defpackage.sud.T     // Catch:{ all -> 0x0453 }
            boolean r0 = r0.b(r3, r4)     // Catch:{ all -> 0x0453 }
            if (r0 != 0) goto L_0x0444
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0453 }
            r0.<init>()     // Catch:{ all -> 0x0453 }
            r3 = r18
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0453 }
            spg r3 = r23.d()     // Catch:{ all -> 0x0453 }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x0453 }
            suc r5 = defpackage.sud.S     // Catch:{ all -> 0x0453 }
            boolean r3 = r3.b(r4, r5)     // Catch:{ all -> 0x0453 }
            if (r3 != 0) goto L_0x0429
            goto L_0x0430
        L_0x0429:
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0453 }
        L_0x0430:
            com.google.android.gms.measurement.internal.EventParcel r3 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0453 }
            com.google.android.gms.measurement.internal.EventParams r13 = new com.google.android.gms.measurement.internal.EventParams     // Catch:{ all -> 0x0453 }
            r13.<init>(r0)     // Catch:{ all -> 0x0453 }
            java.lang.String r12 = "_e"
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r21
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x0453 }
            r1.a((com.google.android.gms.measurement.internal.EventParcel) r3, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0453 }
        L_0x0444:
            spj r0 = r23.h()     // Catch:{ all -> 0x0453 }
            r0.c()     // Catch:{ all -> 0x0453 }
            spj r0 = r23.h()
            r0.d()
            return
        L_0x0453:
            r0 = move-exception
            spj r2 = r23.h()
            r2.d()
            throw r0
        L_0x045c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.a(com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cf A[Catch:{ all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013f A[Catch:{ all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163 A[Catch:{ all -> 0x0191 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r11, com.google.android.gms.measurement.internal.AppMetadata r12) {
        /*
            r10 = this;
            defpackage.iva.a((java.lang.Object) r11)
            java.lang.String r0 = r11.a
            defpackage.iva.c(r0)
            java.lang.String r0 = r11.b
            defpackage.iva.a((java.lang.Object) r0)
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = r11.c
            defpackage.iva.a((java.lang.Object) r0)
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = r11.c
            java.lang.String r0 = r0.b
            defpackage.iva.c(r0)
            r10.r()
            r10.s()
            boolean r0 = d(r12)
            if (r0 == 0) goto L_0x019a
            boolean r0 = r12.h
            if (r0 != 0) goto L_0x002d
            r10.b((com.google.android.gms.measurement.internal.AppMetadata) r12)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r0 = new com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel
            r0.<init>(r11)
            r11 = 0
            r0.e = r11
            spj r1 = r10.h()
            r1.b()
            spj r1 = r10.h()     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r1 = r1.d(r2, r3)     // Catch:{ all -> 0x0191 }
            if (r1 == 0) goto L_0x0071
            java.lang.String r2 = r1.b     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.b     // Catch:{ all -> 0x0191 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0191 }
            if (r2 != 0) goto L_0x0071
            sut r2 = r10.E()     // Catch:{ all -> 0x0191 }
            sur r2 = r2.f     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = "Updating a conditional user property with different origin. name, origin, origin (from DB)"
            suk r4 = r10.m()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r5 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = r4.c(r5)     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r0.b     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = r1.b     // Catch:{ all -> 0x0191 }
            r2.a(r3, r4, r5, r6)     // Catch:{ all -> 0x0191 }
        L_0x0071:
            r2 = 1
            if (r1 != 0) goto L_0x0075
            goto L_0x00a8
        L_0x0075:
            boolean r3 = r1.e     // Catch:{ all -> 0x0191 }
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = r1.b     // Catch:{ all -> 0x0191 }
            r0.b = r3     // Catch:{ all -> 0x0191 }
            long r3 = r1.d     // Catch:{ all -> 0x0191 }
            r0.d = r3     // Catch:{ all -> 0x0191 }
            long r3 = r1.h     // Catch:{ all -> 0x0191 }
            r0.h = r3     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r1.f     // Catch:{ all -> 0x0191 }
            r0.f = r3     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.EventParcel r3 = r1.i     // Catch:{ all -> 0x0191 }
            r0.i = r3     // Catch:{ all -> 0x0191 }
            r0.e = r2     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r2 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r3.b     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r4 = r1.c     // Catch:{ all -> 0x0191 }
            long r6 = r4.c     // Catch:{ all -> 0x0191 }
            java.lang.Object r8 = r3.a()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r1 = r1.c     // Catch:{ all -> 0x0191 }
            java.lang.String r9 = r1.f     // Catch:{ all -> 0x0191 }
            r4 = r2
            r4.<init>(r5, r6, r8, r9)     // Catch:{ all -> 0x0191 }
            r0.c = r2     // Catch:{ all -> 0x0191 }
            goto L_0x00cb
        L_0x00a8:
            java.lang.String r1 = r0.f     // Catch:{ all -> 0x0191 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0191 }
            if (r1 == 0) goto L_0x00ca
            com.google.android.gms.measurement.internal.UserAttributeParcel r11 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r1 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = r1.b     // Catch:{ all -> 0x0191 }
            long r5 = r0.d     // Catch:{ all -> 0x0191 }
            java.lang.Object r7 = r1.a()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r1 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r8 = r1.f     // Catch:{ all -> 0x0191 }
            r3 = r11
            r3.<init>(r4, r5, r7, r8)     // Catch:{ all -> 0x0191 }
            r0.c = r11     // Catch:{ all -> 0x0191 }
            r0.e = r2     // Catch:{ all -> 0x0191 }
            r11 = 1
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            boolean r1 = r0.e     // Catch:{ all -> 0x0191 }
            if (r1 == 0) goto L_0x0135
            com.google.android.gms.measurement.internal.UserAttributeParcel r1 = r0.c     // Catch:{ all -> 0x0191 }
            szi r9 = new szi     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r1.b     // Catch:{ all -> 0x0191 }
            long r6 = r1.c     // Catch:{ all -> 0x0191 }
            java.lang.Object r8 = r1.a()     // Catch:{ all -> 0x0191 }
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0191 }
            spj r1 = r10.h()     // Catch:{ all -> 0x0191 }
            boolean r1 = r1.a((defpackage.szi) r9)     // Catch:{ all -> 0x0191 }
            if (r1 != 0) goto L_0x010b
            sut r1 = r10.E()     // Catch:{ all -> 0x0191 }
            sur r1 = r1.c     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = "(2)Too many active user properties, ignoring"
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0191 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
            suk r4 = r10.m()     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r9.c     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = r4.c(r5)     // Catch:{ all -> 0x0191 }
            java.lang.Object r5 = r9.e     // Catch:{ all -> 0x0191 }
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x0191 }
            goto L_0x0124
        L_0x010b:
            sut r1 = r10.E()     // Catch:{ all -> 0x0191 }
            sur r1 = r1.j     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = "User property updated immediately"
            java.lang.String r3 = r0.a     // Catch:{ all -> 0x0191 }
            suk r4 = r10.m()     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r9.c     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = r4.c(r5)     // Catch:{ all -> 0x0191 }
            java.lang.Object r5 = r9.e     // Catch:{ all -> 0x0191 }
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x0191 }
        L_0x0124:
            if (r11 != 0) goto L_0x0127
            goto L_0x0135
        L_0x0127:
            com.google.android.gms.measurement.internal.EventParcel r11 = r0.i     // Catch:{ all -> 0x0191 }
            if (r11 == 0) goto L_0x0135
            com.google.android.gms.measurement.internal.EventParcel r1 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0191 }
            long r2 = r0.d     // Catch:{ all -> 0x0191 }
            r1.<init>(r11, r2)     // Catch:{ all -> 0x0191 }
            r10.b((com.google.android.gms.measurement.internal.EventParcel) r1, (com.google.android.gms.measurement.internal.AppMetadata) r12)     // Catch:{ all -> 0x0191 }
        L_0x0135:
            spj r11 = r10.h()     // Catch:{ all -> 0x0191 }
            boolean r11 = r11.a((com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r0)     // Catch:{ all -> 0x0191 }
            if (r11 != 0) goto L_0x0163
            sut r11 = r10.E()     // Catch:{ all -> 0x0191 }
            sur r11 = r11.c     // Catch:{ all -> 0x0191 }
            java.lang.String r12 = "Too many conditional properties, ignoring"
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x0191 }
            java.lang.Object r1 = defpackage.sut.a((java.lang.String) r1)     // Catch:{ all -> 0x0191 }
            suk r2 = r10.m()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r2.c(r3)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0191 }
            r11.a(r12, r1, r2, r0)     // Catch:{ all -> 0x0191 }
            goto L_0x0182
        L_0x0163:
            sut r11 = r10.E()     // Catch:{ all -> 0x0191 }
            sur r11 = r11.j     // Catch:{ all -> 0x0191 }
            java.lang.String r12 = "Conditional property added"
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x0191 }
            suk r2 = r10.m()     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r3 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r2.c(r3)     // Catch:{ all -> 0x0191 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r0 = r0.c     // Catch:{ all -> 0x0191 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0191 }
            r11.a(r12, r1, r2, r0)     // Catch:{ all -> 0x0191 }
        L_0x0182:
            spj r11 = r10.h()     // Catch:{ all -> 0x0191 }
            r11.c()     // Catch:{ all -> 0x0191 }
            spj r11 = r10.h()
            r11.d()
            return
        L_0x0191:
            r11 = move-exception
            spj r12 = r10.h()
            r12.d()
            throw r11
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0122 A[Catch:{ all -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123 A[Catch:{ all -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f2 A[Catch:{ all -> 0x0354 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f3 A[Catch:{ all -> 0x0354 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.measurement.internal.EventParcel r20, com.google.android.gms.measurement.internal.AppMetadata r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            defpackage.iva.a((java.lang.Object) r21)
            java.lang.String r3 = r2.a
            defpackage.iva.c(r3)
            r19.r()
            r19.s()
            java.lang.String r3 = r2.a
            long r11 = r0.d
            szg r4 = r19.l()
            boolean r4 = r4.a((com.google.android.gms.measurement.internal.EventParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)
            if (r4 == 0) goto L_0x035d
            boolean r4 = r2.h
            if (r4 != 0) goto L_0x002a
            r1.b((com.google.android.gms.measurement.internal.AppMetadata) r2)
            return
        L_0x002a:
            spg r4 = r19.d()
            suc r5 = defpackage.sud.ac
            boolean r4 = r4.b(r3, r5)
            if (r4 == 0) goto L_0x0076
            java.util.List r4 = r2.u
            if (r4 == 0) goto L_0x0076
            java.lang.String r5 = r0.a
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0066
            com.google.android.gms.measurement.internal.EventParams r4 = r0.b
            android.os.Bundle r4 = r4.a()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            com.google.android.gms.measurement.internal.EventParcel r5 = new com.google.android.gms.measurement.internal.EventParcel
            java.lang.String r14 = r0.a
            com.google.android.gms.measurement.internal.EventParams r15 = new com.google.android.gms.measurement.internal.EventParams
            r15.<init>(r4)
            java.lang.String r4 = r0.c
            long r6 = r0.d
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            r0 = r5
            goto L_0x0076
        L_0x0066:
            sut r2 = r19.E()
            sur r2 = r2.j
            java.lang.String r4 = r0.a
            java.lang.String r0 = r0.c
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r2.a(r5, r3, r4, r0)
            return
        L_0x0076:
            spj r4 = r19.h()
            r4.b()
            spj r4 = r19.h()     // Catch:{ all -> 0x0354 }
            defpackage.iva.c(r3)     // Catch:{ all -> 0x0354 }
            r4.h()     // Catch:{ all -> 0x0354 }
            r4.q()     // Catch:{ all -> 0x0354 }
            r5 = 0
            r6 = 2
            r7 = 0
            r13 = 1
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ab
            sut r4 = r4.E()     // Catch:{ all -> 0x0354 }
            sur r4 = r4.f     // Catch:{ all -> 0x0354 }
            java.lang.String r9 = "Invalid time querying timed out conditional properties"
            java.lang.Object r10 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0354 }
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r4.a(r9, r10, r14)     // Catch:{ all -> 0x0354 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0354 }
            goto L_0x00bb
        L_0x00ab:
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0354 }
            r9[r5] = r3     // Catch:{ all -> 0x0354 }
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r9[r13] = r10     // Catch:{ all -> 0x0354 }
            java.lang.String r10 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.util.List r4 = r4.b((java.lang.String) r10, (java.lang.String[]) r9)     // Catch:{ all -> 0x0354 }
        L_0x00bb:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0354 }
        L_0x00bf:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x0354 }
            if (r9 == 0) goto L_0x013c
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r9 = (com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r9     // Catch:{ all -> 0x0354 }
            if (r9 == 0) goto L_0x0139
            boolean r10 = defpackage.ayjn.b()     // Catch:{ all -> 0x0354 }
            java.lang.String r14 = "User property timed out"
            if (r10 == 0) goto L_0x0101
            spg r10 = r19.d()     // Catch:{ all -> 0x0354 }
            java.lang.String r15 = r2.a     // Catch:{ all -> 0x0354 }
            suc r13 = defpackage.sud.aJ     // Catch:{ all -> 0x0354 }
            boolean r10 = r10.b(r15, r13)     // Catch:{ all -> 0x0354 }
            if (r10 == 0) goto L_0x0101
            sut r10 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r10 = r10.k     // Catch:{ all -> 0x0354 }
            java.lang.String r13 = r9.a     // Catch:{ all -> 0x0354 }
            suk r15 = r19.m()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r5 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = r15.c(r5)     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0354 }
            r10.a(r14, r13, r5, r15)     // Catch:{ all -> 0x0354 }
            goto L_0x011e
        L_0x0101:
            sut r5 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r5 = r5.j     // Catch:{ all -> 0x0354 }
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x0354 }
            suk r13 = r19.m()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r15 = r15.b     // Catch:{ all -> 0x0354 }
            java.lang.String r13 = r13.c(r15)     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0354 }
            r5.a(r14, r10, r13, r15)     // Catch:{ all -> 0x0354 }
        L_0x011e:
            com.google.android.gms.measurement.internal.EventParcel r5 = r9.g     // Catch:{ all -> 0x0354 }
            if (r5 != 0) goto L_0x0123
            goto L_0x012b
        L_0x0123:
            com.google.android.gms.measurement.internal.EventParcel r10 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0354 }
            r10.<init>(r5, r11)     // Catch:{ all -> 0x0354 }
            r1.b((com.google.android.gms.measurement.internal.EventParcel) r10, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0354 }
        L_0x012b:
            spj r5 = r19.h()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r9 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x0354 }
            r5.f(r3, r9)     // Catch:{ all -> 0x0354 }
            r5 = 0
            r13 = 1
            goto L_0x00bf
        L_0x0139:
            r5 = 0
            r13 = 1
            goto L_0x00bf
        L_0x013c:
            spj r4 = r19.h()     // Catch:{ all -> 0x0354 }
            defpackage.iva.c(r3)     // Catch:{ all -> 0x0354 }
            r4.h()     // Catch:{ all -> 0x0354 }
            r4.q()     // Catch:{ all -> 0x0354 }
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0165
            sut r4 = r4.E()     // Catch:{ all -> 0x0354 }
            sur r4 = r4.f     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Object r9 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0354 }
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r4.a(r5, r9, r10)     // Catch:{ all -> 0x0354 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0354 }
            goto L_0x0177
        L_0x0165:
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x0354 }
            r9 = 0
            r5[r9] = r3     // Catch:{ all -> 0x0354 }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0354 }
            java.lang.String r9 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.util.List r4 = r4.b((java.lang.String) r9, (java.lang.String[]) r5)     // Catch:{ all -> 0x0354 }
        L_0x0177:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0354 }
            int r9 = r4.size()     // Catch:{ all -> 0x0354 }
            r5.<init>(r9)     // Catch:{ all -> 0x0354 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0354 }
        L_0x0184:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x0354 }
            if (r9 == 0) goto L_0x0206
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r9 = (com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r9     // Catch:{ all -> 0x0354 }
            if (r9 == 0) goto L_0x0203
            boolean r10 = defpackage.ayjn.b()     // Catch:{ all -> 0x0354 }
            java.lang.String r13 = "User property expired"
            if (r10 == 0) goto L_0x01c6
            spg r10 = r19.d()     // Catch:{ all -> 0x0354 }
            java.lang.String r14 = r2.a     // Catch:{ all -> 0x0354 }
            suc r15 = defpackage.sud.aJ     // Catch:{ all -> 0x0354 }
            boolean r10 = r10.b(r14, r15)     // Catch:{ all -> 0x0354 }
            if (r10 == 0) goto L_0x01c6
            sut r10 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r10 = r10.k     // Catch:{ all -> 0x0354 }
            java.lang.String r14 = r9.a     // Catch:{ all -> 0x0354 }
            suk r15 = r19.m()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r6 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r15.c(r6)     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0354 }
            r10.a(r13, r14, r6, r15)     // Catch:{ all -> 0x0354 }
            goto L_0x01e3
        L_0x01c6:
            sut r6 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r6 = r6.j     // Catch:{ all -> 0x0354 }
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x0354 }
            suk r14 = r19.m()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r15 = r15.b     // Catch:{ all -> 0x0354 }
            java.lang.String r14 = r14.c(r15)     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r15 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0354 }
            r6.a(r13, r10, r14, r15)     // Catch:{ all -> 0x0354 }
        L_0x01e3:
            spj r6 = r19.h()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r10 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x0354 }
            r6.b((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.EventParcel r6 = r9.k     // Catch:{ all -> 0x0354 }
            if (r6 != 0) goto L_0x01f3
            goto L_0x01f6
        L_0x01f3:
            r5.add(r6)     // Catch:{ all -> 0x0354 }
        L_0x01f6:
            spj r6 = r19.h()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.UserAttributeParcel r9 = r9.c     // Catch:{ all -> 0x0354 }
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x0354 }
            r6.f(r3, r9)     // Catch:{ all -> 0x0354 }
            r6 = 2
            goto L_0x0184
        L_0x0203:
            r6 = 2
            goto L_0x0184
        L_0x0206:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x0354 }
        L_0x020a:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0354 }
            if (r5 != 0) goto L_0x0341
            spj r4 = r19.h()     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = r0.a     // Catch:{ all -> 0x0354 }
            defpackage.iva.c(r3)     // Catch:{ all -> 0x0354 }
            defpackage.iva.c(r5)     // Catch:{ all -> 0x0354 }
            r4.h()     // Catch:{ all -> 0x0354 }
            r4.q()     // Catch:{ all -> 0x0354 }
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0246
            sut r6 = r4.E()     // Catch:{ all -> 0x0354 }
            sur r6 = r6.f     // Catch:{ all -> 0x0354 }
            java.lang.String r7 = "Invalid time querying triggered conditional properties"
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0354 }
            suk r4 = r4.y()     // Catch:{ all -> 0x0354 }
            java.lang.String r4 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0354 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r6.a(r7, r3, r4, r5)     // Catch:{ all -> 0x0354 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0354 }
            goto L_0x025c
        L_0x0246:
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0354 }
            r9 = 0
            r6[r9] = r3     // Catch:{ all -> 0x0354 }
            r3 = 1
            r6[r3] = r5     // Catch:{ all -> 0x0354 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0354 }
            r5 = 2
            r6[r5] = r3     // Catch:{ all -> 0x0354 }
            java.lang.String r3 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            java.util.List r3 = r4.b((java.lang.String) r3, (java.lang.String[]) r6)     // Catch:{ all -> 0x0354 }
        L_0x025c:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0354 }
            int r4 = r3.size()     // Catch:{ all -> 0x0354 }
            r13.<init>(r4)     // Catch:{ all -> 0x0354 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0354 }
        L_0x0269:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0354 }
            if (r4 != 0) goto L_0x029a
            r1.b((com.google.android.gms.measurement.internal.EventParcel) r0, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0354 }
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x0354 }
        L_0x0276:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0354 }
            if (r3 == 0) goto L_0x028b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.EventParcel r3 = (com.google.android.gms.measurement.internal.EventParcel) r3     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.EventParcel r4 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0354 }
            r4.<init>(r3, r11)     // Catch:{ all -> 0x0354 }
            r1.b((com.google.android.gms.measurement.internal.EventParcel) r4, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0354 }
            goto L_0x0276
        L_0x028b:
            spj r0 = r19.h()     // Catch:{ all -> 0x0354 }
            r0.c()     // Catch:{ all -> 0x0354 }
            spj r0 = r19.h()
            r0.d()
            return
        L_0x029a:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0354 }
            r14 = r4
            com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel r14 = (com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r14     // Catch:{ all -> 0x0354 }
            if (r14 == 0) goto L_0x033e
            com.google.android.gms.measurement.internal.UserAttributeParcel r4 = r14.c     // Catch:{ all -> 0x0354 }
            szi r15 = new szi     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = r14.a     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r14.b     // Catch:{ all -> 0x0354 }
            java.lang.String r7 = r4.b     // Catch:{ all -> 0x0354 }
            java.lang.Object r10 = r4.a()     // Catch:{ all -> 0x0354 }
            r4 = r15
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x0354 }
            spj r4 = r19.h()     // Catch:{ all -> 0x0354 }
            boolean r4 = r4.a((defpackage.szi) r15)     // Catch:{ all -> 0x0354 }
            if (r4 != 0) goto L_0x02de
            sut r4 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r4 = r4.c     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = "Too many active user properties, ignoring"
            java.lang.String r6 = r14.a     // Catch:{ all -> 0x0354 }
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r6)     // Catch:{ all -> 0x0354 }
            suk r7 = r19.m()     // Catch:{ all -> 0x0354 }
            java.lang.String r8 = r15.c     // Catch:{ all -> 0x0354 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0354 }
            java.lang.Object r8 = r15.e     // Catch:{ all -> 0x0354 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0354 }
            goto L_0x0323
        L_0x02de:
            boolean r4 = defpackage.ayjn.b()     // Catch:{ all -> 0x0354 }
            java.lang.String r5 = "User property triggered"
            if (r4 == 0) goto L_0x030c
            spg r4 = r19.d()     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0354 }
            suc r7 = defpackage.sud.aJ     // Catch:{ all -> 0x0354 }
            boolean r4 = r4.b(r6, r7)     // Catch:{ all -> 0x0354 }
            if (r4 == 0) goto L_0x030c
            sut r4 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r4 = r4.k     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r14.a     // Catch:{ all -> 0x0354 }
            suk r7 = r19.m()     // Catch:{ all -> 0x0354 }
            java.lang.String r8 = r15.c     // Catch:{ all -> 0x0354 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0354 }
            java.lang.Object r8 = r15.e     // Catch:{ all -> 0x0354 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0354 }
            goto L_0x0323
        L_0x030c:
            sut r4 = r19.E()     // Catch:{ all -> 0x0354 }
            sur r4 = r4.j     // Catch:{ all -> 0x0354 }
            java.lang.String r6 = r14.a     // Catch:{ all -> 0x0354 }
            suk r7 = r19.m()     // Catch:{ all -> 0x0354 }
            java.lang.String r8 = r15.c     // Catch:{ all -> 0x0354 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0354 }
            java.lang.Object r8 = r15.e     // Catch:{ all -> 0x0354 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0354 }
        L_0x0323:
            com.google.android.gms.measurement.internal.EventParcel r4 = r14.i     // Catch:{ all -> 0x0354 }
            if (r4 != 0) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            r13.add(r4)     // Catch:{ all -> 0x0354 }
        L_0x032b:
            com.google.android.gms.measurement.internal.UserAttributeParcel r4 = new com.google.android.gms.measurement.internal.UserAttributeParcel     // Catch:{ all -> 0x0354 }
            r4.<init>((defpackage.szi) r15)     // Catch:{ all -> 0x0354 }
            r14.c = r4     // Catch:{ all -> 0x0354 }
            r6 = 1
            r14.e = r6     // Catch:{ all -> 0x0354 }
            spj r4 = r19.h()     // Catch:{ all -> 0x0354 }
            r4.a((com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel) r14)     // Catch:{ all -> 0x0354 }
            goto L_0x0269
        L_0x033e:
            r6 = 1
            goto L_0x0269
        L_0x0341:
            r5 = 2
            r6 = 1
            r9 = 0
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.EventParcel r10 = (com.google.android.gms.measurement.internal.EventParcel) r10     // Catch:{ all -> 0x0354 }
            com.google.android.gms.measurement.internal.EventParcel r13 = new com.google.android.gms.measurement.internal.EventParcel     // Catch:{ all -> 0x0354 }
            r13.<init>(r10, r11)     // Catch:{ all -> 0x0354 }
            r1.b((com.google.android.gms.measurement.internal.EventParcel) r13, (com.google.android.gms.measurement.internal.AppMetadata) r2)     // Catch:{ all -> 0x0354 }
            goto L_0x020a
        L_0x0354:
            r0 = move-exception
            spj r2 = r19.h()
            r2.d()
            throw r0
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        long j2;
        r();
        s();
        if (!d(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            b(appMetadata);
        } else if (!d().b(appMetadata.a, sud.U)) {
            E().j.a("Removing user property", m().c(userAttributeParcel.b));
            h().b();
            try {
                b(appMetadata);
                h().b(appMetadata.a, userAttributeParcel.b);
                h().c();
                E().j.a("User property removed", m().c(userAttributeParcel.b));
            } finally {
                h().d();
            }
        } else if (!"_npa".equals(userAttributeParcel.b) || appMetadata.s == null) {
            E().j.a("Removing user property", m().c(userAttributeParcel.b));
            h().b();
            try {
                b(appMetadata);
                h().b(appMetadata.a, userAttributeParcel.b);
                h().c();
                E().j.a("User property removed", m().c(userAttributeParcel.b));
            } finally {
                h().d();
            }
        } else {
            E().j.a("Falling back to manifest metadata value for ad personalization");
            long a2 = o().a();
            if (!appMetadata.s.booleanValue()) {
                j2 = 0;
            } else {
                j2 = 1;
            }
            a(new UserAttributeParcel("_npa", a2, Long.valueOf(j2), "auto"), appMetadata);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0c05, code lost:
        if (r7 > (defpackage.spg.n() + r4)) goto L_0x0c07;
     */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x062a A[Catch:{ SQLiteException -> 0x0c97, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0657 A[Catch:{ SQLiteException -> 0x0c97, all -> 0x0d12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x01cc A[EDGE_INSN: B:496:0x01cc->B:76:0x01cc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012d A[SYNTHETIC, Splitter:B:53:0x012d] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f7 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f8 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021b A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0288 A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028c A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029a A[Catch:{ all -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029d A[Catch:{ all -> 0x01c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.String r37, long r38) {
        /*
            r36 = this;
            r1 = r36
            java.lang.String r2 = "_npa"
            spj r3 = r36.h()
            r3.b()
            szd r3 = new szd     // Catch:{ all -> 0x0d14 }
            r3.<init>(r1)     // Catch:{ all -> 0x0d14 }
            spj r4 = r36.h()     // Catch:{ all -> 0x0d14 }
            long r8 = r1.p     // Catch:{ all -> 0x0d14 }
            r5 = r37
            r6 = r38
            r10 = r3
            r4.a((java.lang.String) r5, (long) r6, (long) r8, (defpackage.szd) r10)     // Catch:{ all -> 0x0d14 }
            java.util.List r4 = r3.c     // Catch:{ all -> 0x0d14 }
            r5 = 0
            if (r4 == 0) goto L_0x0d01
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0d14 }
            if (r4 != 0) goto L_0x0cff
            tad r4 = r3.a     // Catch:{ all -> 0x0d14 }
            r6 = 5
            java.lang.Object r7 = r4.c(r6)     // Catch:{ all -> 0x0d14 }
            aucd r7 = (defpackage.aucd) r7     // Catch:{ all -> 0x0d14 }
            r7.a((defpackage.aucj) r4)     // Catch:{ all -> 0x0d14 }
            boolean r4 = r7.c     // Catch:{ all -> 0x0d14 }
            if (r4 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7.c()     // Catch:{ all -> 0x0d14 }
            r7.c = r5     // Catch:{ all -> 0x0d14 }
        L_0x003f:
            aucj r4 = r7.b     // Catch:{ all -> 0x0d14 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d14 }
            tad r8 = defpackage.tad.P     // Catch:{ all -> 0x0d14 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ all -> 0x0d14 }
            r4.d = r8     // Catch:{ all -> 0x0d14 }
            spg r4 = r36.d()     // Catch:{ all -> 0x0d14 }
            tad r8 = r3.a     // Catch:{ all -> 0x0d14 }
            java.lang.String r8 = r8.q     // Catch:{ all -> 0x0d14 }
            suc r9 = defpackage.sud.T     // Catch:{ all -> 0x0d14 }
            boolean r4 = r4.b(r8, r9)     // Catch:{ all -> 0x0d14 }
            r8 = 0
            r9 = -1
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = -1
            r17 = 0
        L_0x0064:
            java.util.List r10 = r3.c     // Catch:{ all -> 0x0d14 }
            int r10 = r10.size()     // Catch:{ all -> 0x0d14 }
            java.lang.String r5 = "_fr"
            java.lang.String r6 = "_et"
            r18 = r2
            java.lang.String r2 = "_e"
            r19 = r13
            if (r12 >= r10) goto L_0x070b
            java.util.List r10 = r3.c     // Catch:{ all -> 0x0d14 }
            java.lang.Object r10 = r10.get(r12)     // Catch:{ all -> 0x0d14 }
            szz r10 = (defpackage.szz) r10     // Catch:{ all -> 0x0d14 }
            r13 = 5
            java.lang.Object r22 = r10.c(r13)     // Catch:{ all -> 0x0d14 }
            r13 = r22
            aucd r13 = (defpackage.aucd) r13     // Catch:{ all -> 0x0d14 }
            r13.a((defpackage.aucj) r10)     // Catch:{ all -> 0x0d14 }
            svn r10 = r36.f()     // Catch:{ all -> 0x0d14 }
            tad r14 = r3.a     // Catch:{ all -> 0x0d14 }
            java.lang.String r14 = r14.q     // Catch:{ all -> 0x0d14 }
            r23 = r15
            aucj r15 = r13.b     // Catch:{ all -> 0x0d14 }
            szz r15 = (defpackage.szz) r15     // Catch:{ all -> 0x0d14 }
            java.lang.String r15 = r15.c     // Catch:{ all -> 0x0d14 }
            boolean r10 = r10.b(r14, r15)     // Catch:{ all -> 0x0d14 }
            java.lang.String r14 = "_err"
            if (r10 != 0) goto L_0x0682
            svn r10 = r36.f()     // Catch:{ all -> 0x0d14 }
            tad r15 = r3.a     // Catch:{ all -> 0x0d14 }
            java.lang.String r15 = r15.q     // Catch:{ all -> 0x0d14 }
            r24 = r12
            aucj r12 = r13.b     // Catch:{ all -> 0x0d14 }
            szz r12 = (defpackage.szz) r12     // Catch:{ all -> 0x0d14 }
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x0d14 }
            boolean r10 = r10.c(r15, r12)     // Catch:{ all -> 0x0d14 }
            java.lang.String r12 = "_c"
            if (r10 != 0) goto L_0x0114
            r36.l()     // Catch:{ all -> 0x0d14 }
            aucj r15 = r13.b     // Catch:{ all -> 0x0d14 }
            szz r15 = (defpackage.szz) r15     // Catch:{ all -> 0x0d14 }
            java.lang.String r15 = r15.c     // Catch:{ all -> 0x0d14 }
            defpackage.iva.c(r15)     // Catch:{ all -> 0x0d14 }
            r25 = r4
            int r4 = r15.hashCode()
            r26 = r9
            r9 = 94660(0x171c4, float:1.32647E-40)
            if (r4 == r9) goto L_0x00f2
            r9 = 95025(0x17331, float:1.33158E-40)
            if (r4 == r9) goto L_0x00e8
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r4 == r9) goto L_0x00de
            goto L_0x00fc
        L_0x00de:
            java.lang.String r4 = "_ui"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x00fc
            r4 = 1
            goto L_0x00fd
        L_0x00e8:
            java.lang.String r4 = "_ug"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x00fc
            r4 = 2
            goto L_0x00fd
        L_0x00f2:
            java.lang.String r4 = "_in"
            boolean r4 = r15.equals(r4)
            if (r4 == 0) goto L_0x00fc
            r4 = 0
            goto L_0x00fd
        L_0x00fc:
            r4 = -1
        L_0x00fd:
            if (r4 == 0) goto L_0x0110
            r9 = 1
            if (r4 == r9) goto L_0x0110
            r9 = 2
            if (r4 == r9) goto L_0x0110
            r27 = r6
            r28 = r8
            r21 = r11
            r9 = 5
            r11 = r7
            r7 = r2
            goto L_0x0366
        L_0x0110:
            r4 = 0
            r9 = 0
            r15 = 0
            goto L_0x011b
        L_0x0114:
            r25 = r4
            r26 = r9
            r4 = 0
            r9 = 0
            r15 = 0
        L_0x011b:
            r21 = r11
            aucj r11 = r13.b     // Catch:{ all -> 0x0d14 }
            szz r11 = (defpackage.szz) r11     // Catch:{ all -> 0x0d14 }
            aucx r11 = r11.b     // Catch:{ all -> 0x0d14 }
            int r11 = r11.size()     // Catch:{ all -> 0x0d14 }
            r27 = r6
            java.lang.String r6 = "_r"
            if (r4 >= r11) goto L_0x01cc
            tab r11 = r13.v((int) r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r11 = r11.b     // Catch:{ all -> 0x01c7 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x01c7 }
            if (r11 != 0) goto L_0x0182
            tab r11 = r13.v((int) r4)     // Catch:{ all -> 0x0d14 }
            java.lang.String r11 = r11.b     // Catch:{ all -> 0x0d14 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x0d14 }
            if (r6 == 0) goto L_0x017d
            tab r6 = r13.v((int) r4)     // Catch:{ all -> 0x0d14 }
            r11 = 5
            java.lang.Object r15 = r6.c(r11)     // Catch:{ all -> 0x0d14 }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ all -> 0x0d14 }
            r15.a((defpackage.aucj) r6)     // Catch:{ all -> 0x0d14 }
            boolean r6 = r15.c     // Catch:{ all -> 0x0d14 }
            if (r6 != 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            r15.c()     // Catch:{ all -> 0x0d14 }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0d14 }
        L_0x015e:
            aucj r6 = r15.b     // Catch:{ all -> 0x0d14 }
            tab r6 = (defpackage.tab) r6     // Catch:{ all -> 0x0d14 }
            tab r11 = defpackage.tab.g     // Catch:{ all -> 0x0d14 }
            int r11 = r6.a     // Catch:{ all -> 0x0d14 }
            r11 = r11 | 4
            r6.a = r11     // Catch:{ all -> 0x0d14 }
            r11 = r7
            r28 = r8
            r7 = 1
            r6.d = r7     // Catch:{ all -> 0x0d14 }
            aucj r6 = r15.i()     // Catch:{ all -> 0x0d14 }
            tab r6 = (defpackage.tab) r6     // Catch:{ all -> 0x0d14 }
            r13.a((int) r4, (defpackage.tab) r6)     // Catch:{ all -> 0x0d14 }
            r7 = r2
            r15 = 1
            goto L_0x01b9
        L_0x017d:
            r11 = r7
            r28 = r8
            r7 = r2
            goto L_0x01b9
        L_0x0182:
            r11 = r7
            r28 = r8
            tab r6 = r13.v((int) r4)     // Catch:{ all -> 0x01c7 }
            r7 = 5
            java.lang.Object r8 = r6.c(r7)     // Catch:{ all -> 0x01c7 }
            aucd r8 = (defpackage.aucd) r8     // Catch:{ all -> 0x01c7 }
            r8.a((defpackage.aucj) r6)     // Catch:{ all -> 0x01c7 }
            boolean r6 = r8.c     // Catch:{ all -> 0x01c7 }
            if (r6 != 0) goto L_0x0198
            goto L_0x019e
        L_0x0198:
            r8.c()     // Catch:{ all -> 0x01c7 }
            r6 = 0
            r8.c = r6     // Catch:{ all -> 0x01c7 }
        L_0x019e:
            aucj r6 = r8.b     // Catch:{ all -> 0x01c7 }
            tab r6 = (defpackage.tab) r6     // Catch:{ all -> 0x01c7 }
            tab r7 = defpackage.tab.g     // Catch:{ all -> 0x01c7 }
            int r7 = r6.a     // Catch:{ all -> 0x01c7 }
            r7 = r7 | 4
            r6.a = r7     // Catch:{ all -> 0x01c7 }
            r7 = r2
            r1 = 1
            r6.d = r1     // Catch:{ all -> 0x01c7 }
            aucj r1 = r8.i()     // Catch:{ all -> 0x01c7 }
            tab r1 = (defpackage.tab) r1     // Catch:{ all -> 0x01c7 }
            r13.a((int) r4, (defpackage.tab) r1)     // Catch:{ all -> 0x01c7 }
            r9 = 1
        L_0x01b9:
            int r4 = r4 + 1
            r1 = r36
            r2 = r7
            r7 = r11
            r11 = r21
            r6 = r27
            r8 = r28
            goto L_0x011b
        L_0x01c7:
            r0 = move-exception
            r6 = r36
            goto L_0x0d16
        L_0x01cc:
            r11 = r7
            r28 = r8
            r7 = r2
            if (r9 != 0) goto L_0x0218
            if (r10 == 0) goto L_0x0218
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.k     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "Marking event as conversion"
            suk r4 = r36.m()     // Catch:{ all -> 0x01c7 }
            aucj r8 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r8 = (defpackage.szz) r8     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r4.a((java.lang.String) r8)     // Catch:{ all -> 0x01c7 }
            r1.a(r2, r4)     // Catch:{ all -> 0x01c7 }
            tab r1 = defpackage.tab.g     // Catch:{ all -> 0x01c7 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x01c7 }
            boolean r2 = r1.c     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x01f8
            goto L_0x01fe
        L_0x01f8:
            r1.c()     // Catch:{ all -> 0x01c7 }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x01c7 }
        L_0x01fe:
            aucj r2 = r1.b     // Catch:{ all -> 0x01c7 }
            tab r2 = (defpackage.tab) r2     // Catch:{ all -> 0x01c7 }
            r12.getClass()     // Catch:{ all -> 0x01c7 }
            int r4 = r2.a     // Catch:{ all -> 0x01c7 }
            r8 = 1
            r4 = r4 | r8
            r2.a = r4     // Catch:{ all -> 0x01c7 }
            r2.b = r12     // Catch:{ all -> 0x01c7 }
            r4 = r4 | 4
            r2.a = r4     // Catch:{ all -> 0x01c7 }
            r8 = 1
            r2.d = r8     // Catch:{ all -> 0x01c7 }
            r13.p((defpackage.aucd) r1)     // Catch:{ all -> 0x01c7 }
        L_0x0218:
            if (r15 == 0) goto L_0x021b
            goto L_0x025f
        L_0x021b:
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.k     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "Marking event as real-time"
            suk r4 = r36.m()     // Catch:{ all -> 0x01c7 }
            aucj r8 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r8 = (defpackage.szz) r8     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r4.a((java.lang.String) r8)     // Catch:{ all -> 0x01c7 }
            r1.a(r2, r4)     // Catch:{ all -> 0x01c7 }
            tab r1 = defpackage.tab.g     // Catch:{ all -> 0x01c7 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x01c7 }
            boolean r2 = r1.c     // Catch:{ all -> 0x01c7 }
            if (r2 != 0) goto L_0x023f
            goto L_0x0245
        L_0x023f:
            r1.c()     // Catch:{ all -> 0x01c7 }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x01c7 }
        L_0x0245:
            aucj r2 = r1.b     // Catch:{ all -> 0x01c7 }
            tab r2 = (defpackage.tab) r2     // Catch:{ all -> 0x01c7 }
            r6.getClass()     // Catch:{ all -> 0x01c7 }
            int r4 = r2.a     // Catch:{ all -> 0x01c7 }
            r8 = 1
            r4 = r4 | r8
            r2.a = r4     // Catch:{ all -> 0x01c7 }
            r2.b = r6     // Catch:{ all -> 0x01c7 }
            r4 = r4 | 4
            r2.a = r4     // Catch:{ all -> 0x01c7 }
            r8 = 1
            r2.d = r8     // Catch:{ all -> 0x01c7 }
            r13.p((defpackage.aucd) r1)     // Catch:{ all -> 0x01c7 }
        L_0x025f:
            spj r29 = r36.h()     // Catch:{ all -> 0x01c7 }
            long r30 = r36.t()     // Catch:{ all -> 0x01c7 }
            tad r1 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r1.q     // Catch:{ all -> 0x01c7 }
            r33 = 0
            r34 = 1
            r32 = r1
            sph r1 = r29.a((long) r30, (java.lang.String) r32, (boolean) r33, (boolean) r34)     // Catch:{ all -> 0x01c7 }
            long r1 = r1.e     // Catch:{ all -> 0x01c7 }
            spg r4 = r36.d()     // Catch:{ all -> 0x01c7 }
            tad r8 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r8.q     // Catch:{ all -> 0x01c7 }
            int r4 = r4.a((java.lang.String) r8)     // Catch:{ all -> 0x01c7 }
            long r8 = (long) r4     // Catch:{ all -> 0x01c7 }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x028c
            a((defpackage.aucd) r13, (java.lang.String) r6)     // Catch:{ all -> 0x01c7 }
            goto L_0x028e
        L_0x028c:
            r17 = 1
        L_0x028e:
            aucj r1 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01c7 }
            boolean r1 = defpackage.szj.a((java.lang.String) r1)     // Catch:{ all -> 0x01c7 }
            if (r1 != 0) goto L_0x029d
            r9 = 5
            goto L_0x0366
        L_0x029d:
            if (r10 == 0) goto L_0x0365
            spj r29 = r36.h()     // Catch:{ all -> 0x01c7 }
            long r30 = r36.t()     // Catch:{ all -> 0x01c7 }
            tad r1 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r1.q     // Catch:{ all -> 0x01c7 }
            r33 = 1
            r34 = 0
            r32 = r1
            sph r1 = r29.a((long) r30, (java.lang.String) r32, (boolean) r33, (boolean) r34)     // Catch:{ all -> 0x01c7 }
            long r1 = r1.c     // Catch:{ all -> 0x01c7 }
            spg r4 = r36.d()     // Catch:{ all -> 0x01c7 }
            tad r6 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r6 = r6.q     // Catch:{ all -> 0x01c7 }
            suc r8 = defpackage.sud.n     // Catch:{ all -> 0x01c7 }
            int r4 = r4.a((java.lang.String) r6, (defpackage.suc) r8)     // Catch:{ all -> 0x01c7 }
            long r8 = (long) r4     // Catch:{ all -> 0x01c7 }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0363
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.f     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "Too many conversions. Not logging as conversion. appId"
            tad r4 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r4.q     // Catch:{ all -> 0x01c7 }
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x01c7 }
            r1.a(r2, r4)     // Catch:{ all -> 0x01c7 }
            r1 = 0
            r2 = -1
            r4 = 0
            r6 = 0
        L_0x02e1:
            aucj r8 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r8 = (defpackage.szz) r8     // Catch:{ all -> 0x01c7 }
            aucx r8 = r8.b     // Catch:{ all -> 0x01c7 }
            int r8 = r8.size()     // Catch:{ all -> 0x01c7 }
            if (r4 >= r8) goto L_0x0312
            tab r8 = r13.v((int) r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = r8.b     // Catch:{ all -> 0x01c7 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x01c7 }
            if (r9 == 0) goto L_0x0305
            r9 = 5
            java.lang.Object r1 = r8.c(r9)     // Catch:{ all -> 0x01c7 }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ all -> 0x01c7 }
            r1.a((defpackage.aucj) r8)     // Catch:{ all -> 0x01c7 }
            r2 = r4
            goto L_0x030f
        L_0x0305:
            r9 = 5
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x01c7 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x030f
            r6 = 1
        L_0x030f:
            int r4 = r4 + 1
            goto L_0x02e1
        L_0x0312:
            r9 = 5
            if (r6 == 0) goto L_0x031b
            if (r1 == 0) goto L_0x031b
            r13.w((int) r2)     // Catch:{ all -> 0x01c7 }
            goto L_0x0366
        L_0x031b:
            if (r1 == 0) goto L_0x034f
            aucd r1 = r1.clone()     // Catch:{ all -> 0x01c7 }
            boolean r4 = r1.c     // Catch:{ all -> 0x01c7 }
            if (r4 != 0) goto L_0x0326
            goto L_0x032c
        L_0x0326:
            r1.c()     // Catch:{ all -> 0x01c7 }
            r4 = 0
            r1.c = r4     // Catch:{ all -> 0x01c7 }
        L_0x032c:
            aucj r4 = r1.b     // Catch:{ all -> 0x01c7 }
            tab r4 = (defpackage.tab) r4     // Catch:{ all -> 0x01c7 }
            tab r6 = defpackage.tab.g     // Catch:{ all -> 0x01c7 }
            r14.getClass()     // Catch:{ all -> 0x01c7 }
            int r6 = r4.a     // Catch:{ all -> 0x01c7 }
            r8 = 1
            r6 = r6 | r8
            r4.a = r6     // Catch:{ all -> 0x01c7 }
            r4.b = r14     // Catch:{ all -> 0x01c7 }
            r6 = r6 | 4
            r4.a = r6     // Catch:{ all -> 0x01c7 }
            r14 = 10
            r4.d = r14     // Catch:{ all -> 0x01c7 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x01c7 }
            tab r1 = (defpackage.tab) r1     // Catch:{ all -> 0x01c7 }
            r13.a((int) r2, (defpackage.tab) r1)     // Catch:{ all -> 0x01c7 }
            goto L_0x0366
        L_0x034f:
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.c     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "Did not find conversion parameter. appId"
            tad r4 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r4.q     // Catch:{ all -> 0x01c7 }
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x01c7 }
            r1.a(r2, r4)     // Catch:{ all -> 0x01c7 }
            goto L_0x0366
        L_0x0363:
            r9 = 5
            goto L_0x0366
        L_0x0365:
            r9 = 5
        L_0x0366:
            if (r10 == 0) goto L_0x041a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01c7 }
            aucj r2 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r2 = (defpackage.szz) r2     // Catch:{ all -> 0x01c7 }
            aucx r2 = r2.b     // Catch:{ all -> 0x01c7 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x01c7 }
            r1.<init>(r2)     // Catch:{ all -> 0x01c7 }
            r2 = 0
            r4 = -1
            r6 = -1
        L_0x037a:
            int r8 = r1.size()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = "currency"
            java.lang.String r14 = "value"
            if (r2 >= r8) goto L_0x03a6
            java.lang.Object r8 = r1.get(r2)     // Catch:{ all -> 0x01c7 }
            tab r8 = (defpackage.tab) r8     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x01c7 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x01c7 }
            if (r8 != 0) goto L_0x03a2
            java.lang.Object r8 = r1.get(r2)     // Catch:{ all -> 0x01c7 }
            tab r8 = (defpackage.tab) r8     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x01c7 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x01c7 }
            if (r8 == 0) goto L_0x03a3
            r6 = r2
            goto L_0x03a3
        L_0x03a2:
            r4 = r2
        L_0x03a3:
            int r2 = r2 + 1
            goto L_0x037a
        L_0x03a6:
            r2 = -1
            if (r4 == r2) goto L_0x041b
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x01c7 }
            tab r2 = (defpackage.tab) r2     // Catch:{ all -> 0x01c7 }
            int r2 = r2.a     // Catch:{ all -> 0x01c7 }
            r2 = r2 & 4
            if (r2 != 0) goto L_0x03d9
            java.lang.Object r2 = r1.get(r4)     // Catch:{ all -> 0x01c7 }
            tab r2 = (defpackage.tab) r2     // Catch:{ all -> 0x01c7 }
            int r2 = r2.a     // Catch:{ all -> 0x01c7 }
            r2 = r2 & 16
            if (r2 != 0) goto L_0x03d9
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.h     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "Value must be specified with a numeric type."
            r1.a(r2)     // Catch:{ all -> 0x01c7 }
            r13.w((int) r4)     // Catch:{ all -> 0x01c7 }
            a((defpackage.aucd) r13, (java.lang.String) r12)     // Catch:{ all -> 0x01c7 }
            r1 = 18
            a((defpackage.aucd) r13, (int) r1, (java.lang.String) r14)     // Catch:{ all -> 0x01c7 }
            r2 = -1
            goto L_0x041b
        L_0x03d9:
            r2 = -1
            if (r6 != r2) goto L_0x03dd
            goto L_0x0403
        L_0x03dd:
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x01c7 }
            tab r1 = (defpackage.tab) r1     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01c7 }
            int r6 = r1.length()     // Catch:{ all -> 0x01c7 }
            r8 = 3
            if (r6 != r8) goto L_0x0403
            r6 = 0
        L_0x03ed:
            int r8 = r1.length()     // Catch:{ all -> 0x01c7 }
            if (r6 >= r8) goto L_0x041b
            int r8 = r1.codePointAt(r6)     // Catch:{ all -> 0x01c7 }
            boolean r14 = java.lang.Character.isLetter(r8)     // Catch:{ all -> 0x01c7 }
            if (r14 == 0) goto L_0x0403
            int r8 = java.lang.Character.charCount(r8)     // Catch:{ all -> 0x01c7 }
            int r6 = r6 + r8
            goto L_0x03ed
        L_0x0403:
            sut r1 = r36.E()     // Catch:{ all -> 0x01c7 }
            sur r1 = r1.h     // Catch:{ all -> 0x01c7 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r1.a(r6)     // Catch:{ all -> 0x01c7 }
            r13.w((int) r4)     // Catch:{ all -> 0x01c7 }
            a((defpackage.aucd) r13, (java.lang.String) r12)     // Catch:{ all -> 0x01c7 }
            r1 = 19
            a((defpackage.aucd) r13, (int) r1, (java.lang.String) r10)     // Catch:{ all -> 0x01c7 }
            goto L_0x041b
        L_0x041a:
            r2 = -1
        L_0x041b:
            spg r1 = r36.d()     // Catch:{ all -> 0x01c7 }
            tad r4 = r3.a     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = r4.q     // Catch:{ all -> 0x01c7 }
            suc r6 = defpackage.sud.S     // Catch:{ all -> 0x01c7 }
            boolean r1 = r1.b(r4, r6)     // Catch:{ all -> 0x01c7 }
            if (r1 != 0) goto L_0x043a
            r6 = r36
            r12 = r3
            r5 = r16
            r4 = r21
            r10 = r26
            r8 = r27
            r1 = r28
            goto L_0x060d
        L_0x043a:
            aucj r1 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x01c7 }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x01c7 }
            if (r1 == 0) goto L_0x04bc
            r36.l()     // Catch:{ all -> 0x01c7 }
            aucj r1 = r13.i()     // Catch:{ all -> 0x01c7 }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x01c7 }
            tab r1 = defpackage.szg.b((defpackage.szz) r1, (java.lang.String) r5)     // Catch:{ all -> 0x01c7 }
            if (r1 == 0) goto L_0x0464
            r6 = r36
            r12 = r3
            r5 = r16
            r4 = r21
            r10 = r26
            r8 = r27
            r1 = r28
            goto L_0x060d
        L_0x0464:
            if (r28 == 0) goto L_0x04ac
            r1 = r28
            aucj r4 = r1.b     // Catch:{ all -> 0x01c7 }
            szz r4 = (defpackage.szz) r4     // Catch:{ all -> 0x01c7 }
            long r4 = r4.d     // Catch:{ all -> 0x01c7 }
            aucj r6 = r13.b     // Catch:{ all -> 0x01c7 }
            szz r6 = (defpackage.szz) r6     // Catch:{ all -> 0x01c7 }
            long r14 = r6.d     // Catch:{ all -> 0x01c7 }
            long r4 = r4 - r14
            long r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x01c7 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0484
            r6 = r36
            r10 = r16
            goto L_0x04b2
        L_0x0484:
            aucd r4 = r1.clone()     // Catch:{ all -> 0x01c7 }
            r6 = r36
            boolean r5 = r6.a((defpackage.aucd) r13, (defpackage.aucd) r4)     // Catch:{ all -> 0x0d12 }
            if (r5 != 0) goto L_0x0497
            r4 = r1
            r1 = r13
            r10 = r16
            r26 = r23
            goto L_0x049e
        L_0x0497:
            r10 = r16
            r11.b((int) r10, (defpackage.aucd) r4)     // Catch:{ all -> 0x0d12 }
            r1 = 0
            r4 = 0
        L_0x049e:
            r12 = r3
            r16 = r10
            r9 = r26
            r8 = r27
            r35 = r4
            r4 = r1
            r1 = r35
            goto L_0x0610
        L_0x04ac:
            r6 = r36
            r10 = r16
            r1 = r28
        L_0x04b2:
            r12 = r3
            r16 = r10
            r4 = r13
            r9 = r23
            r8 = r27
            goto L_0x0610
        L_0x04bc:
            r6 = r36
            r10 = r16
            r1 = r28
            java.lang.String r4 = "_vs"
            aucj r5 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r5 = (defpackage.szz) r5     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = r5.c     // Catch:{ all -> 0x0d12 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0d12 }
            if (r4 == 0) goto L_0x0530
            r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r4 = r13.i()     // Catch:{ all -> 0x0d12 }
            szz r4 = (defpackage.szz) r4     // Catch:{ all -> 0x0d12 }
            r8 = r27
            tab r4 = defpackage.szg.b((defpackage.szz) r4, (java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            if (r4 == 0) goto L_0x04e9
            r12 = r3
            r5 = r10
            r4 = r21
            r10 = r26
            goto L_0x060d
        L_0x04e9:
            if (r21 == 0) goto L_0x0525
            r4 = r21
            aucj r1 = r4.b     // Catch:{ all -> 0x0d12 }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x0d12 }
            long r14 = r1.d     // Catch:{ all -> 0x0d12 }
            aucj r1 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r1 = (defpackage.szz) r1     // Catch:{ all -> 0x0d12 }
            r5 = r10
            long r9 = r1.d     // Catch:{ all -> 0x0d12 }
            long r14 = r14 - r9
            long r9 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0d12 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0508
            r10 = r26
            goto L_0x0529
        L_0x0508:
            aucd r1 = r4.clone()     // Catch:{ all -> 0x0d12 }
            boolean r9 = r6.a((defpackage.aucd) r1, (defpackage.aucd) r13)     // Catch:{ all -> 0x0d12 }
            if (r9 != 0) goto L_0x0518
            r1 = r13
            r16 = r23
            r10 = r26
            goto L_0x0521
        L_0x0518:
            r10 = r26
            r11.b((int) r10, (defpackage.aucd) r1)     // Catch:{ all -> 0x0d12 }
            r16 = r5
            r1 = 0
            r4 = 0
        L_0x0521:
            r12 = r3
            r9 = r10
            goto L_0x0610
        L_0x0525:
            r4 = r21
            r10 = r26
        L_0x0529:
            r12 = r3
            r9 = r10
            r1 = r13
            r16 = r23
            goto L_0x0610
        L_0x0530:
            r5 = r10
            r4 = r21
            r10 = r26
            r8 = r27
            spg r9 = r36.d()     // Catch:{ all -> 0x0d12 }
            tad r12 = r3.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = r12.q     // Catch:{ all -> 0x0d12 }
            suc r14 = defpackage.sud.ay     // Catch:{ all -> 0x0d12 }
            boolean r9 = r9.b(r12, r14)     // Catch:{ all -> 0x0d12 }
            if (r9 != 0) goto L_0x054a
            r12 = r3
            goto L_0x060d
        L_0x054a:
            java.lang.String r9 = "_ab"
            aucj r12 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r12 = (defpackage.szz) r12     // Catch:{ all -> 0x0d12 }
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x0d12 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0d12 }
            if (r9 == 0) goto L_0x060c
            r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r9 = r13.i()     // Catch:{ all -> 0x0d12 }
            szz r9 = (defpackage.szz) r9     // Catch:{ all -> 0x0d12 }
            tab r9 = defpackage.szg.b((defpackage.szz) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            if (r9 == 0) goto L_0x056a
            r12 = r3
            goto L_0x060d
        L_0x056a:
            if (r4 == 0) goto L_0x060c
            aucj r9 = r4.b     // Catch:{ all -> 0x0d12 }
            szz r9 = (defpackage.szz) r9     // Catch:{ all -> 0x0d12 }
            long r14 = r9.d     // Catch:{ all -> 0x0d12 }
            aucj r9 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r9 = (defpackage.szz) r9     // Catch:{ all -> 0x0d12 }
            r12 = r3
            long r2 = r9.d     // Catch:{ all -> 0x0d12 }
            long r14 = r14 - r2
            long r2 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x0d12 }
            r14 = 4000(0xfa0, double:1.9763E-320)
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0586
            goto L_0x060d
        L_0x0586:
            aucd r2 = r4.clone()     // Catch:{ all -> 0x0d12 }
            r6.b((defpackage.aucd) r2, (defpackage.aucd) r13)     // Catch:{ all -> 0x0d12 }
            aucj r3 = r2.b     // Catch:{ all -> 0x0d12 }
            szz r3 = (defpackage.szz) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.c     // Catch:{ all -> 0x0d12 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0d12 }
            defpackage.iva.b((boolean) r3)     // Catch:{ all -> 0x0d12 }
            r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r2.i()     // Catch:{ all -> 0x0d12 }
            szz r3 = (defpackage.szz) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "_sn"
            tab r3 = defpackage.szg.b((defpackage.szz) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0d12 }
            r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r4 = r2.i()     // Catch:{ all -> 0x0d12 }
            szz r4 = (defpackage.szz) r4     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = "_sc"
            tab r4 = defpackage.szg.b((defpackage.szz) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0d12 }
            r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r9 = r2.i()     // Catch:{ all -> 0x0d12 }
            szz r9 = (defpackage.szz) r9     // Catch:{ all -> 0x0d12 }
            java.lang.String r14 = "_si"
            tab r9 = defpackage.szg.b((defpackage.szz) r9, (java.lang.String) r14)     // Catch:{ all -> 0x0d12 }
            if (r3 != 0) goto L_0x05cc
            java.lang.String r3 = ""
            goto L_0x05ce
        L_0x05cc:
            java.lang.String r3 = r3.c     // Catch:{ all -> 0x0d12 }
        L_0x05ce:
            boolean r14 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0d12 }
            if (r14 != 0) goto L_0x05dd
            szg r14 = r36.l()     // Catch:{ all -> 0x0d12 }
            java.lang.String r15 = "_sn"
            r14.a((defpackage.aucd) r13, (java.lang.String) r15, (java.lang.Object) r3)     // Catch:{ all -> 0x0d12 }
        L_0x05dd:
            if (r4 != 0) goto L_0x05e2
            java.lang.String r3 = ""
            goto L_0x05e4
        L_0x05e2:
            java.lang.String r3 = r4.c     // Catch:{ all -> 0x0d12 }
        L_0x05e4:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x05f3
            szg r4 = r36.l()     // Catch:{ all -> 0x0d12 }
            java.lang.String r14 = "_sc"
            r4.a((defpackage.aucd) r13, (java.lang.String) r14, (java.lang.Object) r3)     // Catch:{ all -> 0x0d12 }
        L_0x05f3:
            if (r9 == 0) goto L_0x0604
            szg r3 = r36.l()     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "_si"
            long r14 = r9.d     // Catch:{ all -> 0x0d12 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d12 }
            r3.a((defpackage.aucd) r13, (java.lang.String) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x0d12 }
        L_0x0604:
            r11.b((int) r10, (defpackage.aucd) r2)     // Catch:{ all -> 0x0d12 }
            r16 = r5
            r9 = r10
            r4 = 0
            goto L_0x0610
        L_0x060c:
            r12 = r3
        L_0x060d:
            r16 = r5
            r9 = r10
        L_0x0610:
            if (r25 != 0) goto L_0x066a
            aucj r2 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r2 = (defpackage.szz) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0d12 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x066a
            aucj r2 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r2 = (defpackage.szz) r2     // Catch:{ all -> 0x0d12 }
            aucx r2 = r2.b     // Catch:{ all -> 0x0d12 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0657
            szg r2 = r36.l()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r13.i()     // Catch:{ all -> 0x0d12 }
            szz r3 = (defpackage.szz) r3     // Catch:{ all -> 0x0d12 }
            java.lang.Object r2 = r2.a((defpackage.szz) r3, (java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0650
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            tad r5 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = r5.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r5)     // Catch:{ all -> 0x0d12 }
            goto L_0x066b
        L_0x0650:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d12 }
            long r2 = r19 + r2
            goto L_0x066d
        L_0x0657:
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            tad r5 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = r5.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r5)     // Catch:{ all -> 0x0d12 }
        L_0x066a:
        L_0x066b:
            r2 = r19
        L_0x066d:
            java.util.List r5 = r12.c     // Catch:{ all -> 0x0d12 }
            aucj r7 = r13.i()     // Catch:{ all -> 0x0d12 }
            szz r7 = (defpackage.szz) r7     // Catch:{ all -> 0x0d12 }
            r8 = r24
            r5.set(r8, r7)     // Catch:{ all -> 0x0d12 }
            int r15 = r23 + 1
            r11.r((defpackage.aucd) r13)     // Catch:{ all -> 0x0d12 }
            r13 = r2
            goto L_0x06fb
        L_0x0682:
            r6 = r1
            r25 = r4
            r1 = r8
            r10 = r9
            r4 = r11
            r8 = r12
            r5 = r16
            r12 = r3
            r11 = r7
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Dropping blacklisted raw event. appId"
            tad r7 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = r7.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r7)     // Catch:{ all -> 0x0d12 }
            suk r9 = r36.m()     // Catch:{ all -> 0x0d12 }
            aucj r15 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r15 = (defpackage.szz) r15     // Catch:{ all -> 0x0d12 }
            java.lang.String r15 = r15.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r9 = r9.a((java.lang.String) r15)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r7, r9)     // Catch:{ all -> 0x0d12 }
            svn r2 = r36.f()     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.e(r3)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x06bd
            goto L_0x06f4
        L_0x06bd:
            svn r2 = r36.f()     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.f(r3)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x06cc
            goto L_0x06f4
        L_0x06cc:
            aucj r2 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r2 = (defpackage.szz) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0d12 }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x06d9
            goto L_0x06f4
        L_0x06d9:
            szj r26 = r36.p()     // Catch:{ all -> 0x0d12 }
            tad r2 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            java.lang.String r29 = "_ev"
            aucj r3 = r13.b     // Catch:{ all -> 0x0d12 }
            szz r3 = (defpackage.szz) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.c     // Catch:{ all -> 0x0d12 }
            r28 = 11
            r31 = 0
            r27 = r2
            r30 = r3
            r26.a((java.lang.String) r27, (int) r28, (java.lang.String) r29, (java.lang.String) r30, (int) r31)     // Catch:{ all -> 0x0d12 }
        L_0x06f4:
            r16 = r5
            r9 = r10
            r13 = r19
            r15 = r23
        L_0x06fb:
            int r2 = r8 + 1
            r8 = r1
            r1 = r6
            r7 = r11
            r3 = r12
            r5 = 0
            r6 = 5
            r12 = r2
            r11 = r4
            r2 = r18
            r4 = r25
            goto L_0x0064
        L_0x070b:
            r12 = r3
            r25 = r4
            r8 = r6
            r11 = r7
            r23 = r15
            r6 = r1
            r7 = r2
            if (r25 == 0) goto L_0x077e
            r13 = r19
            r15 = r23
            r1 = 0
        L_0x071b:
            if (r1 >= r15) goto L_0x077d
            szz r2 = r11.x((int) r1)     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r2.c     // Catch:{ all -> 0x0d12 }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0d12 }
            if (r3 == 0) goto L_0x074f
            r36.l()     // Catch:{ all -> 0x0d12 }
            tab r3 = defpackage.szg.b((defpackage.szz) r2, (java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            if (r3 != 0) goto L_0x0733
            goto L_0x074f
        L_0x0733:
            boolean r2 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0738
            goto L_0x073e
        L_0x0738:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0d12 }
        L_0x073e:
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            r2.a()     // Catch:{ all -> 0x0d12 }
            aucx r2 = r2.d     // Catch:{ all -> 0x0d12 }
            r2.remove(r1)     // Catch:{ all -> 0x0d12 }
            int r15 = r15 + -1
            int r1 = r1 + -1
            goto L_0x077a
        L_0x074f:
            r36.l()     // Catch:{ all -> 0x0d12 }
            tab r2 = defpackage.szg.b((defpackage.szz) r2, (java.lang.String) r8)     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0759
            goto L_0x077a
        L_0x0759:
            int r3 = r2.a     // Catch:{ all -> 0x0d12 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0766
            long r2 = r2.d     // Catch:{ all -> 0x0d12 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d12 }
            goto L_0x0767
        L_0x0766:
            r2 = 0
        L_0x0767:
            if (r2 != 0) goto L_0x076a
            goto L_0x077a
        L_0x076a:
            long r3 = r2.longValue()     // Catch:{ all -> 0x0d12 }
            r9 = 0
            int r16 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r16 > 0) goto L_0x0775
            goto L_0x077a
        L_0x0775:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0d12 }
            long r13 = r13 + r2
        L_0x077a:
            r2 = 1
            int r1 = r1 + r2
            goto L_0x071b
        L_0x077d:
            goto L_0x0780
        L_0x077e:
            r13 = r19
        L_0x0780:
            r1 = 0
            r6.a((defpackage.aucd) r11, (long) r13, (boolean) r1)     // Catch:{ all -> 0x0d12 }
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            suc r3 = defpackage.sud.af     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r2, r3)     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = "_se"
            if (r1 == 0) goto L_0x084f
            aucj r1 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x0d12 }
            aucx r1 = r1.d     // Catch:{ all -> 0x0d12 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0d12 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0d12 }
        L_0x07a7:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0d12 }
            if (r3 == 0) goto L_0x07ca
            java.lang.String r3 = "_s"
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0d12 }
            szz r4 = (defpackage.szz) r4     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x0d12 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0d12 }
            if (r3 == 0) goto L_0x07a7
            spj r1 = r36.h()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            r1.b((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0d12 }
        L_0x07ca:
            boolean r1 = defpackage.aylg.b()     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x0849
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            suc r4 = defpackage.sud.ag     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r3, r4)     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x0849
            java.lang.String r1 = "_sid"
            int r1 = defpackage.szg.a((defpackage.aucd) r11, (java.lang.String) r1)     // Catch:{ all -> 0x0d12 }
            if (r1 >= 0) goto L_0x0843
            int r1 = defpackage.szg.a((defpackage.aucd) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0d12 }
            if (r1 < 0) goto L_0x086e
            boolean r2 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x07f5
            goto L_0x07fb
        L_0x07f5:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0d12 }
        L_0x07fb:
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            r2.b()     // Catch:{ all -> 0x0d12 }
            aucx r2 = r2.e     // Catch:{ all -> 0x0d12 }
            r2.remove(r1)     // Catch:{ all -> 0x0d12 }
            boolean r1 = defpackage.ayjn.b()     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = "Session engagement user property is in the bundle without session ID. appId"
            if (r1 == 0) goto L_0x0831
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            suc r4 = defpackage.sud.aJ     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r3, r4)     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x0831
            sut r1 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r1 = r1.c     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0d12 }
            r1.a(r2, r3)     // Catch:{ all -> 0x0d12 }
            goto L_0x086e
        L_0x0831:
            sut r1 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r1 = r1.f     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0d12 }
            r1.a(r2, r3)     // Catch:{ all -> 0x0d12 }
            goto L_0x086e
        L_0x0843:
            r1 = 1
            r6.a((defpackage.aucd) r11, (long) r13, (boolean) r1)     // Catch:{ all -> 0x0d12 }
            goto L_0x086e
        L_0x0849:
            r1 = 1
            r6.a((defpackage.aucd) r11, (long) r13, (boolean) r1)     // Catch:{ all -> 0x0d12 }
            goto L_0x086e
        L_0x084f:
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            suc r4 = defpackage.sud.ai     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r3, r4)     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x086e
            spj r1 = r36.h()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            r1.b((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x0d12 }
        L_0x086e:
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            suc r3 = defpackage.sud.U     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r2, r3)     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x093d
            szg r1 = r36.l()     // Catch:{ all -> 0x0d12 }
            sut r2 = r1.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.k     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Checking account type status for ad personalization signals"
            r2.a(r3)     // Catch:{ all -> 0x0d12 }
            svn r2 = r1.m()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x093d
            spj r2 = r1.n()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            sou r2 = r2.b(r3)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x093d
            boolean r2 = r2.v()     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x093d
            spn r2 = r1.B()     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.f()     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x093d
            sut r2 = r1.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.j     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Turning off ad personalization due to account type"
            r2.a(r3)     // Catch:{ all -> 0x0d12 }
            tah r2 = defpackage.tah.g     // Catch:{ all -> 0x0d12 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0d12 }
            boolean r3 = r2.c     // Catch:{ all -> 0x0d12 }
            if (r3 != 0) goto L_0x08d5
            goto L_0x08db
        L_0x08d5:
            r2.c()     // Catch:{ all -> 0x0d12 }
            r3 = 0
            r2.c = r3     // Catch:{ all -> 0x0d12 }
        L_0x08db:
            aucj r3 = r2.b     // Catch:{ all -> 0x0d12 }
            tah r3 = (defpackage.tah) r3     // Catch:{ all -> 0x0d12 }
            r18.getClass()     // Catch:{ all -> 0x0d12 }
            int r4 = r3.a     // Catch:{ all -> 0x0d12 }
            r5 = 2
            r4 = r4 | r5
            r3.a = r4     // Catch:{ all -> 0x0d12 }
            r4 = r18
            r3.c = r4     // Catch:{ all -> 0x0d12 }
            spn r1 = r1.B()     // Catch:{ all -> 0x0d12 }
            r1.h()     // Catch:{ all -> 0x0d12 }
            long r7 = r1.c     // Catch:{ all -> 0x0d12 }
            boolean r1 = r2.c     // Catch:{ all -> 0x0d12 }
            if (r1 != 0) goto L_0x08fa
            goto L_0x0900
        L_0x08fa:
            r2.c()     // Catch:{ all -> 0x0d12 }
            r1 = 0
            r2.c = r1     // Catch:{ all -> 0x0d12 }
        L_0x0900:
            aucj r1 = r2.b     // Catch:{ all -> 0x0d12 }
            tah r1 = (defpackage.tah) r1     // Catch:{ all -> 0x0d12 }
            int r3 = r1.a     // Catch:{ all -> 0x0d12 }
            r5 = 1
            r3 = r3 | r5
            r1.a = r3     // Catch:{ all -> 0x0d12 }
            r1.b = r7     // Catch:{ all -> 0x0d12 }
            r3 = r3 | 8
            r1.a = r3     // Catch:{ all -> 0x0d12 }
            r7 = 1
            r1.e = r7     // Catch:{ all -> 0x0d12 }
            aucj r1 = r2.i()     // Catch:{ all -> 0x0d12 }
            tah r1 = (defpackage.tah) r1     // Catch:{ all -> 0x0d12 }
            r2 = 0
        L_0x091b:
            aucj r3 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            aucx r3 = r3.e     // Catch:{ all -> 0x0d12 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d12 }
            if (r2 >= r3) goto L_0x093a
            tah r3 = r11.y((int) r2)     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.c     // Catch:{ all -> 0x0d12 }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0d12 }
            if (r3 != 0) goto L_0x0936
            int r2 = r2 + 1
            goto L_0x091b
        L_0x0936:
            r11.a((int) r2, (defpackage.tah) r1)     // Catch:{ all -> 0x0d12 }
            goto L_0x093d
        L_0x093a:
            r11.a((defpackage.tah) r1)     // Catch:{ all -> 0x0d12 }
        L_0x093d:
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            suc r3 = defpackage.sud.av     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r2, r3)     // Catch:{ all -> 0x0d12 }
            if (r1 != 0) goto L_0x0950
            goto L_0x0953
        L_0x0950:
            a((defpackage.aucd) r11)     // Catch:{ all -> 0x0d12 }
        L_0x0953:
            boolean r1 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r1 != 0) goto L_0x0958
            goto L_0x095e
        L_0x0958:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r1 = 0
            r11.c = r1     // Catch:{ all -> 0x0d12 }
        L_0x095e:
            aucj r1 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r1 = (defpackage.tad) r1     // Catch:{ all -> 0x0d12 }
            aucx r2 = defpackage.aucj.s()     // Catch:{ all -> 0x0d12 }
            r1.C = r2     // Catch:{ all -> 0x0d12 }
            spb r1 = r36.k()     // Catch:{ all -> 0x0d12 }
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r2.q     // Catch:{ all -> 0x0d12 }
            aucx r2 = r2.d     // Catch:{ all -> 0x0d12 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0d12 }
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            aucx r4 = r4.e     // Catch:{ all -> 0x0d12 }
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch:{ all -> 0x0d12 }
            aucj r5 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x0d12 }
            long r7 = r5.g     // Catch:{ all -> 0x0d12 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            aucj r7 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            long r7 = r7.h     // Catch:{ all -> 0x0d12 }
            java.util.List r1 = r1.a(r3, r2, r4, r5)     // Catch:{ all -> 0x0d12 }
            r11.V(r1)     // Catch:{ all -> 0x0d12 }
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            tad r2 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "1"
            spf r1 = r1.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "measurement.event_sampling_enabled"
            java.lang.String r1 = r1.a(r2, r4)     // Catch:{ all -> 0x0d12 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0d12 }
            if (r1 != 0) goto L_0x09b2
            goto L_0x09b5
        L_0x09b2:
            r6.a((defpackage.aucd) r11, (defpackage.szd) r12)     // Catch:{ all -> 0x0d12 }
        L_0x09b5:
            spg r1 = r36.d()     // Catch:{ all -> 0x0d12 }
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.q     // Catch:{ all -> 0x0d12 }
            suc r3 = defpackage.sud.av     // Catch:{ all -> 0x0d12 }
            boolean r1 = r1.b(r2, r3)     // Catch:{ all -> 0x0d12 }
            if (r1 == 0) goto L_0x09c8
            goto L_0x09cb
        L_0x09c8:
            a((defpackage.aucd) r11)     // Catch:{ all -> 0x0d12 }
        L_0x09cb:
            tad r1 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r1 = r1.q     // Catch:{ all -> 0x0d12 }
            spj r2 = r36.h()     // Catch:{ all -> 0x0d12 }
            sou r2 = r2.b(r1)     // Catch:{ all -> 0x0d12 }
            r3 = 2097152(0x200000, float:2.938736E-39)
            if (r2 == 0) goto L_0x0adf
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            aucx r4 = r4.d     // Catch:{ all -> 0x0d12 }
            int r4 = r4.size()     // Catch:{ all -> 0x0d12 }
            if (r4 > 0) goto L_0x09e9
            goto L_0x0af2
        L_0x09e9:
            long r4 = r2.h()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0a0d
            boolean r7 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x09f8
            goto L_0x09fe
        L_0x09f8:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r11.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x09fe:
            aucj r7 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 32
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.j = r4     // Catch:{ all -> 0x0d12 }
            r8 = 0
            goto L_0x0a26
        L_0x0a0d:
            boolean r7 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0a12
            goto L_0x0a18
        L_0x0a12:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r11.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0a18:
            aucj r7 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 & -33
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r8 = 0
            r7.j = r8     // Catch:{ all -> 0x0d12 }
        L_0x0a26:
            long r13 = r2.g()     // Catch:{ all -> 0x0d12 }
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0a2f
            goto L_0x0a30
        L_0x0a2f:
            r4 = r13
        L_0x0a30:
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0a4c
            boolean r7 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r7 != 0) goto L_0x0a39
            goto L_0x0a3f
        L_0x0a39:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r11.c = r7     // Catch:{ all -> 0x0d12 }
        L_0x0a3f:
            aucj r7 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r7 = (defpackage.tad) r7     // Catch:{ all -> 0x0d12 }
            int r8 = r7.a     // Catch:{ all -> 0x0d12 }
            r8 = r8 | 16
            r7.a = r8     // Catch:{ all -> 0x0d12 }
            r7.i = r4     // Catch:{ all -> 0x0d12 }
            goto L_0x0a65
        L_0x0a4c:
            boolean r4 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x0a51
            goto L_0x0a57
        L_0x0a51:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0d12 }
        L_0x0a57:
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            int r5 = r4.a     // Catch:{ all -> 0x0d12 }
            r5 = r5 & -17
            r4.a = r5     // Catch:{ all -> 0x0d12 }
            r7 = 0
            r4.i = r7     // Catch:{ all -> 0x0d12 }
        L_0x0a65:
            r2.s()     // Catch:{ all -> 0x0d12 }
            long r4 = r2.p()     // Catch:{ all -> 0x0d12 }
            int r5 = (int) r4     // Catch:{ all -> 0x0d12 }
            boolean r4 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x0a72
            goto L_0x0a78
        L_0x0a72:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0d12 }
        L_0x0a78:
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            int r7 = r4.a     // Catch:{ all -> 0x0d12 }
            r8 = 1048576(0x100000, float:1.469368E-39)
            r7 = r7 | r8
            r4.a = r7     // Catch:{ all -> 0x0d12 }
            r4.y = r5     // Catch:{ all -> 0x0d12 }
            long r4 = r4.g     // Catch:{ all -> 0x0d12 }
            r2.a((long) r4)     // Catch:{ all -> 0x0d12 }
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            long r4 = r4.h     // Catch:{ all -> 0x0d12 }
            r2.b((long) r4)     // Catch:{ all -> 0x0d12 }
            svv r4 = r2.a     // Catch:{ all -> 0x0d12 }
            r4.p()     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r2.j     // Catch:{ all -> 0x0d12 }
            r5 = 0
            r2.h((java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            if (r4 == 0) goto L_0x0aba
            boolean r5 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r5 != 0) goto L_0x0aa5
            goto L_0x0aab
        L_0x0aa5:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r5 = 0
            r11.c = r5     // Catch:{ all -> 0x0d12 }
        L_0x0aab:
            aucj r5 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r5 = (defpackage.tad) r5     // Catch:{ all -> 0x0d12 }
            r4.getClass()     // Catch:{ all -> 0x0d12 }
            int r7 = r5.a     // Catch:{ all -> 0x0d12 }
            r7 = r7 | r3
            r5.a = r7     // Catch:{ all -> 0x0d12 }
            r5.z = r4     // Catch:{ all -> 0x0d12 }
            goto L_0x0ad7
        L_0x0aba:
            boolean r4 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x0abf
            goto L_0x0ac5
        L_0x0abf:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0d12 }
        L_0x0ac5:
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            int r5 = r4.a     // Catch:{ all -> 0x0d12 }
            r7 = -2097153(0xffffffffffdfffff, float:NaN)
            r5 = r5 & r7
            r4.a = r5     // Catch:{ all -> 0x0d12 }
            tad r5 = defpackage.tad.P     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = r5.z     // Catch:{ all -> 0x0d12 }
            r4.z = r5     // Catch:{ all -> 0x0d12 }
        L_0x0ad7:
            spj r4 = r36.h()     // Catch:{ all -> 0x0d12 }
            r4.a((defpackage.sou) r2)     // Catch:{ all -> 0x0d12 }
            goto L_0x0af2
        L_0x0adf:
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "Bundling raw events w/o app info. appId"
            tad r5 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = r5.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r5)     // Catch:{ all -> 0x0d12 }
            r2.a(r4, r5)     // Catch:{ all -> 0x0d12 }
        L_0x0af2:
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            aucx r2 = r2.d     // Catch:{ all -> 0x0d12 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d12 }
            if (r2 > 0) goto L_0x0b00
            goto L_0x0cbe
        L_0x0b00:
            spc r2 = r36.a()     // Catch:{ all -> 0x0d12 }
            boolean r2 = r2.a     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0b53
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            int r2 = r2.a     // Catch:{ all -> 0x0d12 }
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0b12
            goto L_0x0b53
        L_0x0b12:
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.c()     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0b36
            boolean r4 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x0b21
            goto L_0x0b27
        L_0x0b21:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0d12 }
        L_0x0b27:
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            r2.getClass()     // Catch:{ all -> 0x0d12 }
            int r5 = r4.a     // Catch:{ all -> 0x0d12 }
            r3 = r3 | r5
            r4.a = r3     // Catch:{ all -> 0x0d12 }
            r4.z = r2     // Catch:{ all -> 0x0d12 }
            goto L_0x0b53
        L_0x0b36:
            boolean r2 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0b3b
            goto L_0x0b41
        L_0x0b3b:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0d12 }
        L_0x0b41:
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            int r3 = r2.a     // Catch:{ all -> 0x0d12 }
            r4 = -2097153(0xffffffffffdfffff, float:NaN)
            r3 = r3 & r4
            r2.a = r3     // Catch:{ all -> 0x0d12 }
            tad r3 = defpackage.tad.P     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.z     // Catch:{ all -> 0x0d12 }
            r2.z = r3     // Catch:{ all -> 0x0d12 }
        L_0x0b53:
            svn r2 = r36.f()     // Catch:{ all -> 0x0d12 }
            tad r3 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            szv r2 = r2.b(r3)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0b82
            int r3 = r2.a     // Catch:{ all -> 0x0d12 }
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0b82
            long r2 = r2.b     // Catch:{ all -> 0x0d12 }
            boolean r4 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r4 != 0) goto L_0x0b6e
            goto L_0x0b74
        L_0x0b6e:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r4 = 0
            r11.c = r4     // Catch:{ all -> 0x0d12 }
        L_0x0b74:
            aucj r4 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r4 = (defpackage.tad) r4     // Catch:{ all -> 0x0d12 }
            int r5 = r4.a     // Catch:{ all -> 0x0d12 }
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 | r7
            r4.a = r5     // Catch:{ all -> 0x0d12 }
            r4.G = r2     // Catch:{ all -> 0x0d12 }
            goto L_0x0bba
        L_0x0b82:
            tad r2 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r2 = r2.A     // Catch:{ all -> 0x0d12 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d12 }
            if (r2 == 0) goto L_0x0ba7
            boolean r2 = r11.c     // Catch:{ all -> 0x0d12 }
            if (r2 != 0) goto L_0x0b91
            goto L_0x0b97
        L_0x0b91:
            r11.c()     // Catch:{ all -> 0x0d12 }
            r2 = 0
            r11.c = r2     // Catch:{ all -> 0x0d12 }
        L_0x0b97:
            aucj r2 = r11.b     // Catch:{ all -> 0x0d12 }
            tad r2 = (defpackage.tad) r2     // Catch:{ all -> 0x0d12 }
            int r3 = r2.a     // Catch:{ all -> 0x0d12 }
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 | r4
            r2.a = r3     // Catch:{ all -> 0x0d12 }
            r3 = -1
            r2.G = r3     // Catch:{ all -> 0x0d12 }
            goto L_0x0bba
        L_0x0ba7:
            sut r2 = r36.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r3 = "Did not find measurement config or missing version info. appId"
            tad r4 = r12.a     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r4.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r4)     // Catch:{ all -> 0x0d12 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0d12 }
        L_0x0bba:
            spj r2 = r36.h()     // Catch:{ all -> 0x0d12 }
            aucj r3 = r11.i()     // Catch:{ all -> 0x0d12 }
            tad r3 = (defpackage.tad) r3     // Catch:{ all -> 0x0d12 }
            r2.h()     // Catch:{ all -> 0x0d12 }
            r2.q()     // Catch:{ all -> 0x0d12 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = r3.q     // Catch:{ all -> 0x0d12 }
            defpackage.iva.c(r4)     // Catch:{ all -> 0x0d12 }
            int r4 = r3.a     // Catch:{ all -> 0x0d12 }
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0bda
            r4 = 1
            goto L_0x0bdb
        L_0x0bda:
            r4 = 0
        L_0x0bdb:
            defpackage.iva.a((boolean) r4)     // Catch:{ all -> 0x0d12 }
            r2.k()     // Catch:{ all -> 0x0d12 }
            jiq r4 = r2.A()     // Catch:{ all -> 0x0d12 }
            long r4 = r4.a()     // Catch:{ all -> 0x0d12 }
            long r7 = r3.h     // Catch:{ all -> 0x0d12 }
            r2.v()     // Catch:{ all -> 0x0d12 }
            long r9 = defpackage.spg.n()     // Catch:{ all -> 0x0d12 }
            long r9 = r4 - r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0bf9
            goto L_0x0c07
        L_0x0bf9:
            long r7 = r3.h     // Catch:{ all -> 0x0d12 }
            r2.v()     // Catch:{ all -> 0x0d12 }
            long r9 = defpackage.spg.n()     // Catch:{ all -> 0x0d12 }
            long r9 = r9 + r4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0c22
        L_0x0c07:
            sut r7 = r2.E()     // Catch:{ all -> 0x0d12 }
            sur r7 = r7.f     // Catch:{ all -> 0x0d12 }
            java.lang.String r8 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r9 = r3.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r9 = defpackage.sut.a((java.lang.String) r9)     // Catch:{ all -> 0x0d12 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d12 }
            long r10 = r3.h     // Catch:{ all -> 0x0d12 }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d12 }
            r7.a(r8, r9, r4, r5)     // Catch:{ all -> 0x0d12 }
        L_0x0c22:
            byte[] r4 = r3.k()     // Catch:{ all -> 0x0d12 }
            szg r5 = r2.o()     // Catch:{ IOException -> 0x0cab }
            byte[] r4 = r5.b(r4)     // Catch:{ IOException -> 0x0cab }
            sut r5 = r2.E()     // Catch:{ all -> 0x0d12 }
            sur r5 = r5.k     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "Saving bundle, size"
            int r8 = r4.length     // Catch:{ all -> 0x0d12 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0d12 }
            r5.a(r7, r8)     // Catch:{ all -> 0x0d12 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0d12 }
            r5.<init>()     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "app_id"
            java.lang.String r8 = r3.q     // Catch:{ all -> 0x0d12 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "bundle_end_timestamp"
            long r8 = r3.h     // Catch:{ all -> 0x0d12 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d12 }
            r5.put(r7, r8)     // Catch:{ all -> 0x0d12 }
            java.lang.String r7 = "data"
            r5.put(r7, r4)     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "has_realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0d12 }
            r5.put(r4, r7)     // Catch:{ all -> 0x0d12 }
            int r4 = r3.b     // Catch:{ all -> 0x0d12 }
            r7 = 2
            r4 = r4 & r7
            if (r4 == 0) goto L_0x0c74
            java.lang.String r4 = "retry_count"
            int r7 = r3.J     // Catch:{ all -> 0x0d12 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0d12 }
            r5.put(r4, r7)     // Catch:{ all -> 0x0d12 }
        L_0x0c74:
            android.database.sqlite.SQLiteDatabase r4 = r2.e()     // Catch:{ SQLiteException -> 0x0c97 }
            java.lang.String r7 = "queue"
            r8 = 0
            long r4 = r4.insert(r7, r8, r5)     // Catch:{ SQLiteException -> 0x0c97 }
            r7 = -1
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0cbe
            sut r4 = r2.E()     // Catch:{ SQLiteException -> 0x0c97 }
            sur r4 = r4.c     // Catch:{ SQLiteException -> 0x0c97 }
            java.lang.String r5 = "Failed to insert bundle (got -1). appId"
            java.lang.String r7 = r3.q     // Catch:{ SQLiteException -> 0x0c97 }
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r7)     // Catch:{ SQLiteException -> 0x0c97 }
            r4.a(r5, r7)     // Catch:{ SQLiteException -> 0x0c97 }
            goto L_0x0cbe
        L_0x0c97:
            r0 = move-exception
            r4 = r0
            sut r2 = r2.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = "Error storing bundle. appId"
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0d12 }
            r2.a(r5, r3, r4)     // Catch:{ all -> 0x0d12 }
            goto L_0x0cbe
        L_0x0cab:
            r0 = move-exception
            r4 = r0
            sut r2 = r2.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r5 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r3 = r3.q     // Catch:{ all -> 0x0d12 }
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r3)     // Catch:{ all -> 0x0d12 }
            r2.a(r5, r3, r4)     // Catch:{ all -> 0x0d12 }
        L_0x0cbe:
            spj r2 = r36.h()     // Catch:{ all -> 0x0d12 }
            java.util.List r3 = r12.b     // Catch:{ all -> 0x0d12 }
            r2.a((java.util.List) r3)     // Catch:{ all -> 0x0d12 }
            spj r2 = r36.h()     // Catch:{ all -> 0x0d12 }
            android.database.sqlite.SQLiteDatabase r3 = r2.e()     // Catch:{ all -> 0x0d12 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0cde }
            r5 = 0
            r4[r5] = r1     // Catch:{ SQLiteException -> 0x0cde }
            r5 = 1
            r4[r5] = r1     // Catch:{ SQLiteException -> 0x0cde }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r5, r4)     // Catch:{ SQLiteException -> 0x0cde }
            goto L_0x0cef
        L_0x0cde:
            r0 = move-exception
            r3 = r0
            sut r2 = r2.E()     // Catch:{ all -> 0x0d12 }
            sur r2 = r2.c     // Catch:{ all -> 0x0d12 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r1 = defpackage.sut.a((java.lang.String) r1)     // Catch:{ all -> 0x0d12 }
            r2.a(r4, r1, r3)     // Catch:{ all -> 0x0d12 }
        L_0x0cef:
            spj r1 = r36.h()     // Catch:{ all -> 0x0d12 }
            r1.c()     // Catch:{ all -> 0x0d12 }
            spj r1 = r36.h()
            r1.d()
            r1 = 1
            return r1
        L_0x0cff:
            r6 = r1
            goto L_0x0d02
        L_0x0d01:
            r6 = r1
        L_0x0d02:
            spj r1 = r36.h()     // Catch:{ all -> 0x0d12 }
            r1.c()     // Catch:{ all -> 0x0d12 }
            spj r1 = r36.h()
            r1.d()
            r1 = 0
            return r1
        L_0x0d12:
            r0 = move-exception
            goto L_0x0d16
        L_0x0d14:
            r0 = move-exception
            r6 = r1
        L_0x0d16:
            r1 = r0
            spj r2 = r36.h()
            r2.d()
            goto L_0x0d20
        L_0x0d1f:
            throw r1
        L_0x0d20:
            goto L_0x0d1f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.b(java.lang.String, long):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(EventParcel eventParcel, String str) {
        EventParcel eventParcel2 = eventParcel;
        String str2 = str;
        sou b2 = h().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            E().j.a("No app data available; dropping event", str2);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(eventParcel2.a)) {
                E().f.a("Could not find package. appId", sut.a(str));
            }
        } else if (!b3.booleanValue()) {
            E().c.a("App version does not match; dropping event. appId", sut.a(str));
            return;
        }
        String c2 = b2.c();
        String i2 = b2.i();
        long j2 = b2.j();
        String k2 = b2.k();
        long l2 = b2.l();
        long m2 = b2.m();
        boolean o2 = b2.o();
        String f2 = b2.f();
        long u2 = b2.u();
        boolean v2 = b2.v();
        boolean w2 = b2.w();
        String d2 = b2.d();
        Boolean x2 = b2.x();
        long n2 = b2.n();
        List y = b2.y();
        ayjy.c();
        AppMetadata appMetadata = r2;
        AppMetadata appMetadata2 = new AppMetadata(str, c2, i2, j2, k2, l2, m2, (String) null, o2, false, f2, u2, 0, 0, v2, w2, false, d2, x2, n2, y);
        a(eventParcel2, appMetadata);
    }

    /* access modifiers changed from: package-private */
    public final void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        spp a2;
        int i2;
        r();
        s();
        if (!d(appMetadata)) {
            return;
        }
        if (!appMetadata.h) {
            b(appMetadata);
            return;
        }
        int c2 = p().c(userAttributeParcel.b);
        if (c2 != 0) {
            szj p2 = p();
            String str = userAttributeParcel.b;
            d();
            String a3 = p2.a(str, 24, true);
            String str2 = userAttributeParcel.b;
            p().a(appMetadata.a, c2, "_ev", a3, str2 != null ? str2.length() : 0);
            return;
        }
        int b2 = p().b(userAttributeParcel.b, userAttributeParcel.a());
        if (b2 != 0) {
            szj p3 = p();
            String str3 = userAttributeParcel.b;
            d();
            String a4 = p3.a(str3, 24, true);
            Object a5 = userAttributeParcel.a();
            if (a5 == null || (!(a5 instanceof String) && !(a5 instanceof CharSequence))) {
                i2 = 0;
            } else {
                i2 = String.valueOf(a5).length();
            }
            p().a(appMetadata.a, b2, "_ev", a4, i2);
            return;
        }
        Object c3 = p().c(userAttributeParcel.b, userAttributeParcel.a());
        if (c3 != null) {
            if ("_sid".equals(userAttributeParcel.b) && d().b(appMetadata.a, sud.M)) {
                long j2 = userAttributeParcel.c;
                String str4 = userAttributeParcel.f;
                szi c4 = h().c(appMetadata.a, "_sno");
                long j3 = 0;
                if (c4 != null) {
                    Object obj = c4.e;
                    if (obj instanceof Long) {
                        j3 = ((Long) obj).longValue();
                        a(new UserAttributeParcel("_sno", j2, Long.valueOf(j3 + 1), str4), appMetadata);
                    }
                }
                if (c4 != null) {
                    E().f.a("Retrieved last session number from database does not contain a valid (long) value", c4.e);
                }
                if (d().b(appMetadata.a, sud.P) && (a2 = h().a(appMetadata.a, "_s")) != null) {
                    j3 = a2.c;
                    E().k.a("Backfill the session number. Last used session number", Long.valueOf(j3));
                }
                a(new UserAttributeParcel("_sno", j2, Long.valueOf(j3 + 1), str4), appMetadata);
            }
            szi szi = new szi(appMetadata.a, userAttributeParcel.f, userAttributeParcel.b, userAttributeParcel.c, c3);
            if (!ayjn.b() || !d().b(appMetadata.a, sud.aJ)) {
                E().j.a("Setting user property", m().c(szi.c), c3);
            } else {
                E().k.a("Setting user property", m().c(szi.c), c3);
            }
            h().b();
            try {
                b(appMetadata);
                boolean a6 = h().a(szi);
                h().c();
                if (!a6) {
                    E().c.a("Too many unique user properties are set. Ignoring user property", m().c(szi.c), szi.e);
                    p().a(appMetadata.a, 9, (String) null, (String) null, 0);
                } else if (!ayjn.b() || !d().b(appMetadata.a, sud.aJ)) {
                    E().j.a("User property set", m().c(szi.c), szi.e);
                }
            } finally {
                h().d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r8 == 429) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0147 A[Catch:{ all -> 0x0156, all -> 0x015f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            r6.r()
            r6.s()
            defpackage.iva.c(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x015f }
        L_0x000e:
            sut r1 = r6.E()     // Catch:{ all -> 0x015f }
            sur r1 = r1.k     // Catch:{ all -> 0x015f }
            int r2 = r10.length     // Catch:{ all -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x015f }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.a(r3, r2)     // Catch:{ all -> 0x015f }
            spj r1 = r6.h()     // Catch:{ all -> 0x015f }
            r1.b()     // Catch:{ all -> 0x015f }
            spj r1 = r6.h()     // Catch:{ all -> 0x0156 }
            sou r1 = r1.b(r7)     // Catch:{ all -> 0x0156 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x003b
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x003b
            if (r8 == r4) goto L_0x003b
            r3 = 0
            goto L_0x0040
        L_0x003b:
            if (r9 != 0) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r1 != 0) goto L_0x0053
            sut r8 = r6.E()     // Catch:{ all -> 0x0156 }
            sur r8 = r8.f     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r7)     // Catch:{ all -> 0x0156 }
            r8.a(r9, r7)     // Catch:{ all -> 0x0156 }
            goto L_0x014a
        L_0x0053:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00b1
            if (r8 == r5) goto L_0x00b1
            jiq r10 = r6.o()     // Catch:{ all -> 0x0156 }
            long r10 = r10.a()     // Catch:{ all -> 0x0156 }
            r1.i(r10)     // Catch:{ all -> 0x0156 }
            spj r10 = r6.h()     // Catch:{ all -> 0x0156 }
            r10.a((defpackage.sou) r1)     // Catch:{ all -> 0x0156 }
            sut r10 = r6.E()     // Catch:{ all -> 0x0156 }
            sur r10 = r10.k     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0156 }
            r10.a(r11, r1, r9)     // Catch:{ all -> 0x0156 }
            svn r9 = r6.f()     // Catch:{ all -> 0x0156 }
            r9.c(r7)     // Catch:{ all -> 0x0156 }
            svf r7 = r6.e()     // Catch:{ all -> 0x0156 }
            svc r7 = r7.e     // Catch:{ all -> 0x0156 }
            jiq r9 = r6.o()     // Catch:{ all -> 0x0156 }
            long r9 = r9.a()     // Catch:{ all -> 0x0156 }
            r7.a(r9)     // Catch:{ all -> 0x0156 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 != r7) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ac
        L_0x009b:
            svf r7 = r6.e()     // Catch:{ all -> 0x0156 }
            svc r7 = r7.f     // Catch:{ all -> 0x0156 }
            jiq r8 = r6.o()     // Catch:{ all -> 0x0156 }
            long r8 = r8.a()     // Catch:{ all -> 0x0156 }
            r7.a(r8)     // Catch:{ all -> 0x0156 }
        L_0x00ac:
            r6.w()     // Catch:{ all -> 0x0156 }
            goto L_0x014a
        L_0x00b1:
            r9 = 0
            if (r11 == 0) goto L_0x00bd
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0156 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0156 }
            goto L_0x00be
        L_0x00bd:
            r11 = r9
        L_0x00be:
            if (r11 == 0) goto L_0x00cd
            int r3 = r11.size()     // Catch:{ all -> 0x0156 }
            if (r3 <= 0) goto L_0x00cd
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0156 }
            goto L_0x00ce
        L_0x00cd:
            r11 = r9
        L_0x00ce:
            if (r8 != r5) goto L_0x00d1
            goto L_0x00ea
        L_0x00d1:
            if (r8 == r4) goto L_0x00ea
            svn r9 = r6.f()     // Catch:{ all -> 0x0156 }
            boolean r9 = r9.a(r7, r10, r11)     // Catch:{ all -> 0x0156 }
            if (r9 != 0) goto L_0x0104
            spj r7 = r6.h()     // Catch:{ all -> 0x015f }
        L_0x00e1:
            r7.d()     // Catch:{ all -> 0x015f }
            r6.u = r0
            r6.x()
            return
        L_0x00ea:
            svn r10 = r6.f()     // Catch:{ all -> 0x0156 }
            szv r10 = r10.b(r7)     // Catch:{ all -> 0x0156 }
            if (r10 == 0) goto L_0x00f5
            goto L_0x0104
        L_0x00f5:
            svn r10 = r6.f()     // Catch:{ all -> 0x0156 }
            boolean r9 = r10.a(r7, r9, r9)     // Catch:{ all -> 0x0156 }
            if (r9 != 0) goto L_0x0104
            spj r7 = r6.h()     // Catch:{ all -> 0x015f }
            goto L_0x00e1
        L_0x0104:
            jiq r9 = r6.o()     // Catch:{ all -> 0x0156 }
            long r9 = r9.a()     // Catch:{ all -> 0x0156 }
            r1.h((long) r9)     // Catch:{ all -> 0x0156 }
            spj r9 = r6.h()     // Catch:{ all -> 0x0156 }
            r9.a((defpackage.sou) r1)     // Catch:{ all -> 0x0156 }
            if (r8 == r5) goto L_0x0128
            sut r7 = r6.E()     // Catch:{ all -> 0x0156 }
            sur r7 = r7.k     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0156 }
            r7.a(r9, r8, r2)     // Catch:{ all -> 0x0156 }
            goto L_0x0133
        L_0x0128:
            sut r8 = r6.E()     // Catch:{ all -> 0x0156 }
            sur r8 = r8.h     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.a(r9, r7)     // Catch:{ all -> 0x0156 }
        L_0x0133:
            sux r7 = r6.g()     // Catch:{ all -> 0x0156 }
            boolean r7 = r7.c()     // Catch:{ all -> 0x0156 }
            if (r7 == 0) goto L_0x0147
            boolean r7 = r6.v()     // Catch:{ all -> 0x0156 }
            if (r7 == 0) goto L_0x0147
            r6.u()     // Catch:{ all -> 0x0156 }
            goto L_0x014a
        L_0x0147:
            r6.w()     // Catch:{ all -> 0x0156 }
        L_0x014a:
            spj r7 = r6.h()     // Catch:{ all -> 0x0156 }
            r7.c()     // Catch:{ all -> 0x0156 }
            spj r7 = r6.h()     // Catch:{ all -> 0x015f }
            goto L_0x00e1
        L_0x0156:
            r7 = move-exception
            spj r8 = r6.h()     // Catch:{ all -> 0x015f }
            r8.d()     // Catch:{ all -> 0x015f }
            throw r7     // Catch:{ all -> 0x015f }
        L_0x015f:
            r7 = move-exception
            r6.u = r0
            r6.x()
            goto L_0x0167
        L_0x0166:
            throw r7
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(sou sou) {
        nz nzVar;
        r();
        ayjy.c();
        if (!TextUtils.isEmpty(sou.c()) || !TextUtils.isEmpty(sou.d())) {
            spg d2 = d();
            Uri.Builder builder = new Uri.Builder();
            String c2 = sou.c();
            if (TextUtils.isEmpty(c2)) {
                ayjy.c();
                c2 = sou.d();
            }
            Uri.Builder encodedAuthority = builder.scheme((String) sud.e.a()).encodedAuthority((String) sud.f.a());
            String valueOf = String.valueOf(c2);
            encodedAuthority.path(valueOf.length() == 0 ? new String("config/app/") : "config/app/".concat(valueOf)).appendQueryParameter("app_instance_id", sou.b()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(d2.b()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                E().k.a("Fetching remote configuration", sou.a());
                szv b2 = f().b(sou.a());
                svn f2 = f();
                String a2 = sou.a();
                f2.h();
                String str = (String) f2.c.get(a2);
                if (b2 == null || TextUtils.isEmpty(str)) {
                    nzVar = null;
                } else {
                    nz nzVar2 = new nz();
                    nzVar2.put("If-Modified-Since", str);
                    nzVar = nzVar2;
                }
                this.u = true;
                sux g2 = g();
                String a3 = sou.a();
                sza sza = new sza(this);
                g2.h();
                g2.q();
                iva.a((Object) url);
                iva.a((Object) sza);
                g2.F().b(new suw(g2, a3, url, (byte[]) null, nzVar, sza));
            } catch (MalformedURLException e2) {
                E().c.a("Failed to parse config URL. Not fetching. appId", sut.a(sou.a()), uri);
            }
        } else {
            a(sou.a(), 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2) {
        return b((String) null, j2);
    }
}
