package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: pag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pag extends ppr {
    private static final paf a = new paf(2, 0, false, false);
    private final Context b;
    private final ppp c;
    private final ozi d;
    private final ozb e;
    private final oyq f;
    private final pas n;
    private final NativeIndex o;
    private final ovk p;
    private final pao q;
    private final String r;
    private final long s;
    private pae t;
    private final pai u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pag(Context context, ppp ppp, ozi ozi, ozb ozb, oyq oyq, pas pas, NativeIndex nativeIndex, ovk ovk, String str, pao pao, String str2, long j, pai pai, pae pae) {
        super(aonk.CONTENT_FETCH, 2, 3, str, psd.b(context));
        this.b = context;
        this.c = ppp;
        this.d = ozi;
        this.e = ozb;
        this.f = oyq;
        this.n = pas;
        this.o = nativeIndex;
        this.p = ovk;
        this.q = pao;
        this.r = str2;
        this.s = j;
        this.u = pai;
        this.t = pae;
    }

    /* access modifiers changed from: package-private */
    public final aond a(osz osz, aojr aojr) {
        if (aojr == null) {
            return aond.PROTO_PARSE_ERROR;
        }
        aucd o2 = aojq.d.o();
        String str = osz.e;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojq aojq = (aojq) o2.b;
        str.getClass();
        aojq.a |= 1;
        aojq.b = str;
        String a2 = pxa.a(osz);
        if (a2 != null && !TextUtils.isEmpty(a2)) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojq aojq2 = (aojq) o2.b;
            a2.getClass();
            aojq2.a |= 2;
            aojq2.c = a2;
        }
        aucd aucd = (aucd) aojr.c(5);
        aucd.a((aucj) aojr);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojr aojr2 = (aojr) aucd.b;
        aojq aojq3 = (aojq) o2.i();
        aojq3.getClass();
        aojr2.b = aojq3;
        aojr2.a |= 64;
        this.f.a((aojr) aucd.i());
        aond a3 = aond.a(aojr.c);
        return a3 == null ? aond.OK : a3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        paf paf = (paf) obj;
        if (!paf.a() && this.t != null) {
            oso.c("Indexing done %s", (Object) this.q.b());
            try {
                this.t.a.a();
            } catch (pam e2) {
                oso.b("Cursor close call threw an exception: %s", (Object) e2.getMessage());
                this.f.a("cursor_close_exception");
            }
        }
        pai pai = this.u;
        pai.c |= paf.c;
        if (!paf.a()) {
            if (paf.a == 2) {
                oso.b("Aborting indexing of corpus %s", (Object) pai.d);
                if (paf.d) {
                    pai.e.c.d(new pah(pai, aonk.CLEAR_CORPUS_DATA, pai.a, psd.b(pai.e.a)));
                }
            }
            long j = paf.b;
            if (j > 0) {
                oso.c("Retrying indexing in %dms", (Object) Long.valueOf(j));
                Context context = pai.e.a;
                long j2 = paf.b;
                String str = pai.a;
                jbs jbs = new jbs(context);
                long currentTimeMillis = System.currentTimeMillis();
                Intent className = new Intent("com.google.android.gms.icing.INDEX_CONTENT_PROVIDER", new Uri.Builder().scheme("icing").authority("index-corpora").build()).setClassName(context, "com.google.android.gms.icing.service.IndexWorkerService");
                className.putExtra("delay", j2);
                jbs.a("Icing.ServiceAlarmsIndexContentProviders", 0, j2 + currentTimeMillis, PendingIntent.getService(context, 0, className, 134217728), str);
            }
            synchronized (pai.e.g) {
                if (pai.c) {
                    pai.e.f.add(pai.b);
                }
                pai.e.e.remove(pai.b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        ota b2 = this.d.b.b(this.q);
        if (b2 != null) {
            otg otg = b2.c;
            if (otg == null) {
                otg = otg.h;
            }
            int a2 = otf.a(otg.c);
            if ((a2 == 0 || a2 == 1) && this.d.b.a(this.q).equals(this.r)) {
                osz osz = b2.b;
                if (osz == null) {
                    osz = osz.s;
                }
                if (!ozq.a(osz)) {
                    oso.e("Cannot schedule indexing on non-synced corpus %s", (Object) this.q.b());
                    return a;
                }
                String str = osz.e;
                oyz d2 = this.e.d(str);
                if (d2 == null || !d2.e()) {
                    oso.c("Not indexing corpus from package %s as it has never connected", (Object) str);
                    return a;
                }
                if (this.t == null) {
                    oso.c("Indexing %s from %s", (Object) this.q.b(), (Object) str);
                    ContentResolver contentResolver = this.b.getContentResolver();
                    osz osz2 = b2.b;
                    if (osz2 == null) {
                        osz2 = osz.s;
                    }
                    Uri parse = Uri.parse(osz2.f);
                    otg otg2 = b2.c;
                    if (otg2 == null) {
                        otg2 = otg.h;
                    }
                    String str2 = otg2.g;
                    int size = osz.j.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        String valueOf = String.valueOf(((oqy) osz.j.get(i)).b);
                        strArr[i] = valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf);
                    }
                    this.t = new pae(new pad(contentResolver, parse, str2, strArr));
                }
                paf a3 = a(b2, this.t.a, this.s);
                if (!a3.a()) {
                    return a3;
                }
                ppp ppp = this.c;
                Context context = this.b;
                ozi ozi = this.d;
                ozb ozb = this.e;
                oyq oyq = this.f;
                pas pas = this.n;
                NativeIndex nativeIndex = this.o;
                ovk ovk = this.p;
                String str3 = this.j;
                pao pao = this.q;
                long j = this.s;
                pai pai = this.u;
                String str4 = this.r;
                pag pag = r3;
                pag pag2 = new pag(context, ppp, ozi, ozb, oyq, pas, nativeIndex, ovk, str3, pao, str4, j, pai, this.t);
                ppp.d(pag);
                return a3;
            }
        }
        oso.a("Corpus no longer exists %s", (Object) this.q.b());
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v4, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v75, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v85, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v87, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v6, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v94, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v95, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v96, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v41, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v98, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v101, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v102, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v103, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v104, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v105, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v59, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v62, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v108, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v109, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v111, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v112, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v113, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v114, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v115, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v116, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v117, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v70, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v75, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v76, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v81, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v118, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v120, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v121, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v127, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v128, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v129, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v130, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v131, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v132, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v133, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v134, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v135, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v136, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v84, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v85, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v86, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v87, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v88, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v89, resolved type: ota} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v137, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v138, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v139, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v140, resolved type: pxk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v141, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v142, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v143, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v144, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v145, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v146, resolved type: pxk} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0672, code lost:
        r3 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0674, code lost:
        r14 = r14;
        r14 = r14;
        r14 = r14;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r3.a = r6;
        r14 = r14;
        r14 = r14;
        r14 = r14;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0682, code lost:
        if (r1.o.a(r39.b, r6) != defpackage.aond.OK) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0684, code lost:
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r4 = r3.a;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0688, code lost:
        if (r4 <= r24) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x068a, code lost:
        r0 = 1;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x068d, code lost:
        r0 = 0;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0690, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0691, code lost:
        r7 = 0;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0694, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0695, code lost:
        r7 = 0;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0698, code lost:
        r14 = r14;
        r14 = r14;
        r14 = r14;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        defpackage.oso.b(r36);
        r1.f.a(r35);
        r14 = r14;
        r14 = r14;
        r14 = r14;
        r14 = r14;
        r3 = r3;
        r3 = r3;
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0740, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0742, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0745, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0748, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x074b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x074e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x074f, code lost:
        r24 = r12;
        r3 = r14;
        r14 = r5;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0754, code lost:
        defpackage.oso.a((java.lang.Throwable) r0, "Out of memory while indexing content provider.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        r0 = r1.f;
        r4 = r14.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x075d, code lost:
        if (r4 == null) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0760, code lost:
        r4 = defpackage.osz.s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0762, code lost:
        r4 = r4.e;
        r5 = r14.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0766, code lost:
        if (r5 == null) goto L_0x0769;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0769, code lost:
        r5 = defpackage.osz.s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x076b, code lost:
        r5 = defpackage.pxa.a(r5);
        r6 = defpackage.axrp.a.a().g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x077d, code lost:
        if (r0.a(r6) != false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x077f, code lost:
        r8 = defpackage.aojb.d.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0785, code lost:
        if (r4 != null) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0789, code lost:
        if (r8.c == false) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x078c, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0792, code lost:
        r9 = (defpackage.aojb) r8.b;
        r4.getClass();
        r9.a |= 1;
        r9.b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07a1, code lost:
        if (r5 == null) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07a6, code lost:
        if (r8.c == false) goto L_0x07a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07a9, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07af, code lost:
        r4 = (defpackage.aojb) r8.b;
        r5.getClass();
        r4.a |= 2;
        r4.c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07be, code lost:
        r4 = defpackage.aoji.R.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07c6, code lost:
        if (r4.c == false) goto L_0x07c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07c9, code lost:
        r4.c();
        r4.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07cf, code lost:
        r5 = (defpackage.aoji) r4.b;
        r8 = (defpackage.aojb) r8.i();
        r8.getClass();
        r5.x = r8;
        r5.a |= 67108864;
        r0.a(6006, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07ea, code lost:
        r7 = 0;
        r27 = 2;
        r31 = false;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07f3, code lost:
        defpackage.oso.a((java.lang.Throwable) r0, "Out of memory while logging.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0834, code lost:
        r1.f.a("cursor_died_exception");
        r13.a("cursor-died");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0840, code lost:
        if (r7 == 0) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0842, code lost:
        defpackage.oso.b("Indexing content provider failed; will retry %d times", (java.lang.Object) 3);
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x084e, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0850, code lost:
        if (r7 == 0) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0853, code lost:
        r1.f.a("cursor_retries_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x085a, code lost:
        defpackage.oso.b("Indexing content provider failed again; %d retries remaining", (java.lang.Object) java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0867, code lost:
        if ((r0 instanceof java.lang.SecurityException) != false) goto L_0x0869;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0869, code lost:
        r1.f.a("cursor_security_exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0871, code lost:
        r1.f.a("cursor_other_exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0878, code lost:
        r13.a("cursor-exception");
        r7 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0737 A[Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0740 A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), PHI: r3 r13 r14 r24 
      PHI: (r3v25 java.lang.String) = (r3v96 java.lang.String), (r3v109 java.lang.String), (r3v112 java.lang.String), (r3v115 java.lang.String), (r3v120 java.lang.String), (r3v123 java.lang.String), (r3v126 java.lang.String), (r3v130 java.lang.String), (r3v131 java.lang.String), (r3v134 java.lang.String), (r3v139 java.lang.String), (r3v143 java.lang.String) binds: [B:53:0x0122, B:56:0x012f, B:65:0x0152, B:68:0x015a, B:307:0x0674, B:308:?, B:320:0x0698, B:321:?, B:310:0x0684, B:311:?, B:327:0x06b6, B:333:0x06dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v11 pxh) = (r13v24 pxh), (r13v17 pxh), (r13v17 pxh), (r13v17 pxh), (r13v17 pxh), (r13v17 pxh), (r13v17 pxh), (r13v24 pxh), (r13v24 pxh), (r13v22 pxh), (r13v22 pxh) binds: [B:56:0x012f, B:307:0x0674, B:308:?, B:320:0x0698, B:321:?, B:310:0x0684, B:311:?, B:65:0x0152, B:68:0x015a, B:327:0x06b6, B:333:0x06dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v13 ota) = (r14v43 ota), (r14v56 ota), (r14v59 ota), (r14v62 ota), (r14v67 ota), (r14v70 ota), (r14v73 ota), (r14v77 ota), (r14v78 ota), (r14v81 ota), (r14v86 ota), (r14v89 ota) binds: [B:53:0x0122, B:56:0x012f, B:65:0x0152, B:68:0x015a, B:307:0x0674, B:308:?, B:320:0x0698, B:321:?, B:310:0x0684, B:311:?, B:327:0x06b6, B:333:0x06dd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v11 long) = (r24v19 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v19 long), (r24v19 long), (r24v19 long), (r24v19 long) binds: [B:56:0x012f, B:307:0x0674, B:308:?, B:320:0x0698, B:321:?, B:310:0x0684, B:311:?, B:65:0x0152, B:68:0x015a, B:327:0x06b6, B:333:0x06dd] A[DONT_GENERATE, DONT_INLINE], Splitter:B:307:0x0674] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x074e A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:44:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x075f A[Catch:{ OutOfMemoryError -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0760 A[Catch:{ OutOfMemoryError -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0768 A[Catch:{ OutOfMemoryError -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0769 A[Catch:{ OutOfMemoryError -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x077f A[Catch:{ OutOfMemoryError -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x08c0  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x08df  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0964  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0967  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.paf a(defpackage.ota r42, defpackage.pad r43, long r44) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            r2 = r43
            java.lang.String r3 = "advance_seqno_error"
            java.lang.String r4 = "Error advancing the last sequence number"
            otg r5 = r0.c
            if (r5 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            otg r5 = defpackage.otg.h
        L_0x0011:
            r6 = 5
            java.lang.Object r7 = r5.c(r6)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r5)
            ovk r5 = r1.p
            com.google.android.gms.icing.nativeindex.NativeIndex r8 = r1.o
            osz r9 = r0.b
            if (r9 != 0) goto L_0x0025
            osz r9 = defpackage.osz.s
        L_0x0025:
            boolean r9 = r9.g
            double r10 = r8.g()
            int r5 = r5.a((double) r10)
            r8 = 2
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L_0x0049
            int r9 = defpackage.aolr.a(r5)
            if (r9 > r10) goto L_0x003c
            r9 = 1
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 != 0) goto L_0x0059
            java.lang.String r5 = defpackage.ovk.a((int) r5)
            java.lang.String r12 = "Cannot sync untrimmable corpus: %s"
            defpackage.oso.c((java.lang.String) r12, (java.lang.Object) r5)
            goto L_0x0059
        L_0x0049:
            if (r5 != r8) goto L_0x004d
            r9 = 1
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            if (r9 != 0) goto L_0x0059
            java.lang.String r5 = defpackage.ovk.a((int) r5)
            java.lang.String r12 = "Cannot sync trimmable corpus: %s"
            defpackage.oso.c((java.lang.String) r12, (java.lang.Object) r5)
        L_0x0059:
            if (r9 != 0) goto L_0x008d
            aucj r0 = r7.b
            otg r0 = (defpackage.otg) r0
            boolean r0 = r0.d
            if (r0 != 0) goto L_0x008a
            boolean r0 = r7.c
            if (r0 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r7.c()
            r7.c = r11
        L_0x006d:
            aucj r0 = r7.b
            otg r0 = (defpackage.otg) r0
            int r2 = r0.a
            r2 = r2 | 8
            r0.a = r2
            r0.d = r10
            ozi r0 = r1.d
            ozq r0 = r0.a()
            pao r2 = r1.q
            aucj r3 = r7.i()
            otg r3 = (defpackage.otg) r3
            r0.c(r2, r3)
        L_0x008a:
            paf r0 = a
            return r0
        L_0x008d:
            aucj r5 = r7.b
            otg r5 = (defpackage.otg) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L_0x00bc
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            r7.c()
            r7.c = r11
        L_0x009f:
            aucj r5 = r7.b
            otg r5 = (defpackage.otg) r5
            int r9 = r5.a
            r9 = r9 | 8
            r5.a = r9
            r5.d = r11
            ozi r5 = r1.d
            ozq r5 = r5.a()
            pao r9 = r1.q
            aucj r12 = r7.i()
            otg r12 = (defpackage.otg) r12
            r5.c(r9, r12)
        L_0x00bc:
            java.lang.Object r5 = r0.c(r6)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r0)
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            r5.c()
            r5.c = r11
        L_0x00d0:
            aucj r0 = r5.b
            ota r0 = (defpackage.ota) r0
            aucj r9 = r7.i()
            otg r9 = (defpackage.otg) r9
            r9.getClass()
            r0.c = r9
            int r9 = r0.a
            r9 = r9 | r8
            r0.a = r9
            aucj r0 = r5.i()
            r5 = r0
            ota r5 = (defpackage.ota) r5
            aucj r0 = r7.b
            otg r0 = (defpackage.otg) r0
            int r7 = r0.e
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.o
            osz r9 = r5.b
            if (r9 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            osz r9 = defpackage.osz.s
        L_0x00fa:
            int r9 = r9.b
            long r12 = r0.a((int) r9, (boolean) r11)
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0108
            r12 = r14
            goto L_0x0109
        L_0x0108:
        L_0x0109:
            pxh r9 = new pxh
            r9.<init>()
            pxk r14 = new pxk
            r14.<init>(r12)
            osz r0 = r5.b     // Catch:{ pam -> 0x0819, pal -> 0x07ff, OutOfMemoryError -> 0x074e }
            if (r0 == 0) goto L_0x011a
            r42 = r0
            goto L_0x011e
        L_0x011a:
            osz r0 = defpackage.osz.s     // Catch:{ pam -> 0x0819, pal -> 0x07ff, OutOfMemoryError -> 0x074e }
            r42 = r0
        L_0x011e:
            r16 = r7
            long r6 = r14.a     // Catch:{ pam -> 0x074b, pal -> 0x0748, OutOfMemoryError -> 0x074e }
            r2.a((long) r6)     // Catch:{ all -> 0x071b }
            java.util.Map r0 = defpackage.ozq.b((defpackage.osz) r42)     // Catch:{ all -> 0x071b }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x071b }
            r19 = 0
        L_0x012f:
            pac r15 = r2.a     // Catch:{ all -> 0x070c }
            boolean r15 = r15.b()     // Catch:{ all -> 0x070c }
            if (r15 != 0) goto L_0x014e
            pac r15 = r2.b     // Catch:{ all -> 0x070c }
            boolean r15 = r15.b()     // Catch:{ all -> 0x070c }
            if (r15 == 0) goto L_0x0140
            goto L_0x014e
        L_0x0140:
            r39 = r42
            r35 = r3
            r36 = r4
            r24 = r12
            r42 = r14
            r14 = r5
            r13 = r9
            goto L_0x0672
        L_0x014e:
            pac r15 = r2.a     // Catch:{ all -> 0x070c }
            r22 = r9
            long r8 = r15.c()     // Catch:{ all -> 0x0702 }
            pac r15 = r2.b     // Catch:{ all -> 0x0702 }
            r24 = r12
            long r11 = r15.c()     // Catch:{ all -> 0x06fe }
            long r11 = java.lang.Math.min(r8, r11)     // Catch:{ all -> 0x06fe }
            java.lang.String r13 = "tags"
            java.lang.String r15 = "docs"
            int r26 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r26 != 0) goto L_0x01b0
            r26 = 1
            int r19 = r19 + 1
            java.lang.String r10 = "Dup seqno for %s pkg %s %d last %d"
            r27 = r13
            r28 = r15
            r13 = 4
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x06fe }
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x017e
            r13 = r27
            goto L_0x0180
        L_0x017e:
            r13 = r28
        L_0x0180:
            r23 = 0
            r15[r23] = r13     // Catch:{ all -> 0x06fe }
            r13 = r42
            r35 = r3
            java.lang.String r3 = r13.e     // Catch:{ all -> 0x01a4 }
            r29 = 1
            r15[r29] = r3     // Catch:{ all -> 0x01a4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01a4 }
            r21 = 2
            r15[r21] = r3     // Catch:{ all -> 0x01a4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01a4 }
            r20 = 3
            r15[r20] = r3     // Catch:{ all -> 0x01a4 }
            defpackage.oso.b((java.lang.String) r10, (java.lang.Object[]) r15)     // Catch:{ all -> 0x01a4 }
            r3 = r19
            goto L_0x01b9
        L_0x01a4:
            r0 = move-exception
            r36 = r4
            r4 = r13
            r3 = r14
            r13 = r22
            r14 = r5
            r5 = r35
            goto L_0x0729
        L_0x01b0:
            r35 = r3
            r27 = r13
            r28 = r15
            r13 = r42
            r3 = 0
        L_0x01b9:
            int r10 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c8
            r36 = r4
            r4 = r13
            r3 = r14
            r13 = r22
            r14 = r5
            r5 = r35
            goto L_0x06b3
        L_0x01c8:
            r10 = 10
            if (r3 > r10) goto L_0x06aa
            java.lang.String r10 = "bad action"
            java.lang.String r15 = "del"
            r19 = r3
            java.lang.String r3 = "add"
            r36 = r4
            java.lang.String r4 = "bad uri"
            r42 = r14
            java.lang.String r14 = "Uri"
            r37 = r0
            java.lang.String r0 = "uri"
            r38 = r5
            java.lang.String r5 = "action"
            int r28 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r28 == 0) goto L_0x02c6
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x02a4
            pac r8 = r2.b     // Catch:{ all -> 0x0298 }
            int r9 = r13.b     // Catch:{ all -> 0x0298 }
            java.lang.String r5 = r8.a(r5)     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = r8.a(r0)     // Catch:{ all -> 0x0298 }
            r39 = r13
            java.lang.String r13 = "tag"
            java.lang.String r8 = r8.a(r13)     // Catch:{ all -> 0x028d }
            r13 = 256(0x100, float:3.59E-43)
            java.lang.String r13 = defpackage.osn.d(r14, r0, r13)     // Catch:{ all -> 0x028d }
            if (r13 != 0) goto L_0x0275
            java.lang.String r4 = "Tag"
            r13 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r4 = defpackage.osn.d(r4, r8, r13)     // Catch:{ all -> 0x028d }
            if (r4 != 0) goto L_0x0268
            boolean r3 = android.text.TextUtils.equals(r5, r3)     // Catch:{ all -> 0x028d }
            if (r3 != 0) goto L_0x0229
            boolean r3 = android.text.TextUtils.equals(r5, r15)     // Catch:{ all -> 0x028d }
            if (r3 != 0) goto L_0x0224
            r3 = r22
            r3.a((java.lang.String) r10)     // Catch:{ all -> 0x0281 }
            goto L_0x027f
        L_0x0224:
            r3 = r22
            r34 = 0
            goto L_0x022d
        L_0x0229:
            r3 = r22
            r34 = 1
        L_0x022d:
            java.lang.String r4 = "tag "
            com.google.android.gms.icing.nativeindex.NativeIndex r5 = r1.o     // Catch:{ all -> 0x0281 }
            long r13 = r5.b     // Catch:{ all -> 0x0281 }
            byte[] r31 = com.google.android.gms.icing.nativeindex.NativeIndex.a((java.lang.String) r0)     // Catch:{ all -> 0x0281 }
            byte[] r32 = com.google.android.gms.icing.nativeindex.NativeIndex.a((java.lang.String) r8)     // Catch:{ all -> 0x0281 }
            r33 = 65534(0xfffe, float:9.1833E-41)
            r26 = r13
            r28 = r11
            r30 = r9
            int r0 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeTagDocument(r26, r28, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0281 }
            aond r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((int) r0)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0281 }
            int r5 = r0.length()     // Catch:{ all -> 0x0281 }
            if (r5 != 0) goto L_0x0260
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0281 }
            r0.<init>(r4)     // Catch:{ all -> 0x0281 }
            goto L_0x0264
        L_0x0260:
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0281 }
        L_0x0264:
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0281 }
            goto L_0x027f
        L_0x0268:
            r3 = r22
            java.lang.String r0 = "Invalid tag string: %s"
            defpackage.oso.b((java.lang.String) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "bad tag"
            r3.a((java.lang.String) r0)     // Catch:{ all -> 0x0281 }
            goto L_0x027f
        L_0x0275:
            r3 = r22
            java.lang.String r0 = "Invalid tag uri: %s"
            defpackage.oso.b((java.lang.String) r0, (java.lang.Object) r13)     // Catch:{ all -> 0x0281 }
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0281 }
        L_0x027f:
            r6 = r11
            goto L_0x02a8
        L_0x0281:
            r0 = move-exception
            r13 = r3
            r5 = r35
            r14 = r38
            r4 = r39
            r3 = r42
            goto L_0x0729
        L_0x028d:
            r0 = move-exception
            r3 = r42
            r13 = r22
            r5 = r35
            r14 = r38
            goto L_0x0641
        L_0x0298:
            r0 = move-exception
            r3 = r42
            r4 = r13
            r13 = r22
            r5 = r35
            r14 = r38
            goto L_0x0729
        L_0x02a4:
            r39 = r13
            r3 = r22
        L_0x02a8:
            pac r0 = r2.b     // Catch:{ all -> 0x02ba }
            boolean r0 = r0.d()     // Catch:{ all -> 0x02ba }
            if (r0 != 0) goto L_0x02b4
            r2.a((long) r11)     // Catch:{ all -> 0x02ba }
            goto L_0x02b5
        L_0x02b4:
        L_0x02b5:
            r13 = r3
            r14 = r38
            goto L_0x0653
        L_0x02ba:
            r0 = move-exception
            r13 = r3
            r5 = r35
            r14 = r38
            r4 = r39
            r3 = r42
            goto L_0x0729
        L_0x02c6:
            r39 = r13
            r13 = r22
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0645
            pac r8 = r2.a     // Catch:{ all -> 0x063a }
            java.lang.String r5 = r8.a(r5)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = r8.a(r0)     // Catch:{ all -> 0x063a }
            r9 = 256(0x100, float:3.59E-43)
            java.lang.String r9 = defpackage.osn.d(r14, r0, r9)     // Catch:{ all -> 0x063a }
            if (r9 != 0) goto L_0x0631
            boolean r3 = android.text.TextUtils.equals(r5, r3)     // Catch:{ all -> 0x063a }
            java.lang.String r4 = "section_thing_proto"
            if (r3 == 0) goto L_0x0596
            byte[] r29 = r8.b(r4)     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "index "
            if (r29 == 0) goto L_0x0354
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.o     // Catch:{ all -> 0x063a }
            plf r30 = defpackage.pap.a(r38)     // Catch:{ all -> 0x063a }
            r14 = r38
            osz r4 = r14.b     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x02ff
            r31 = r4
            goto L_0x0303
        L_0x02ff:
            osz r4 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
            r31 = r4
        L_0x0303:
            otr r32 = defpackage.ozy.a()     // Catch:{ all -> 0x0638 }
            r26 = r0
            r27 = r11
            aojr r0 = r26.a(r27, r29, r30, r31, r32)     // Catch:{ all -> 0x0638 }
            osz r4 = r14.b     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x0314
            goto L_0x0316
        L_0x0314:
            osz r4 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
        L_0x0316:
            aond r0 = r1.a(r4, r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0638 }
            int r5 = r4.length()     // Catch:{ all -> 0x0638 }
            if (r5 != 0) goto L_0x032e
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r4.<init>(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x0332
        L_0x032e:
            java.lang.String r4 = r3.concat(r4)     // Catch:{ all -> 0x0638 }
        L_0x0332:
            r13.a((java.lang.String) r4)     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "index-thing "
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0638 }
            int r4 = r0.length()     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x034b
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r0.<init>(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x034f
        L_0x034b:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0638 }
        L_0x034f:
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x0354:
            r14 = r38
            osz r4 = r14.b     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x035b
        L_0x035a:
            goto L_0x035e
        L_0x035b:
            osz r4 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
            goto L_0x035a
        L_0x035e:
            int r4 = r4.b     // Catch:{ all -> 0x0638 }
            oqo r5 = defpackage.oqo.g     // Catch:{ all -> 0x0638 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0638 }
            boolean r9 = r5.c     // Catch:{ all -> 0x0638 }
            if (r9 != 0) goto L_0x036b
            goto L_0x0371
        L_0x036b:
            r5.c()     // Catch:{ all -> 0x0638 }
            r9 = 0
            r5.c = r9     // Catch:{ all -> 0x0638 }
        L_0x0371:
            aucj r9 = r5.b     // Catch:{ all -> 0x0638 }
            oqo r9 = (defpackage.oqo) r9     // Catch:{ all -> 0x0638 }
            r0.getClass()     // Catch:{ all -> 0x0638 }
            int r10 = r9.a     // Catch:{ all -> 0x0638 }
            r15 = 2
            r10 = r10 | r15
            r9.a = r10     // Catch:{ all -> 0x0638 }
            r9.c = r0     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = "doc_score"
            pan r9 = r8.a     // Catch:{ all -> 0x0638 }
            if (r9 == 0) goto L_0x03a4
            java.util.Map r9 = r8.b     // Catch:{ all -> 0x0638 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x03a4
            pan r9 = r8.a     // Catch:{ all -> 0x0638 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0638 }
            android.database.Cursor r9 = r9.b     // Catch:{ all -> 0x039d }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x039d }
            goto L_0x03a5
        L_0x039d:
            r0 = move-exception
            pam r3 = new pam     // Catch:{ all -> 0x0638 }
            r3.<init>(r0)     // Catch:{ all -> 0x0638 }
            throw r3     // Catch:{ all -> 0x0638 }
        L_0x03a4:
            r0 = 0
        L_0x03a5:
            boolean r9 = r5.c     // Catch:{ all -> 0x0638 }
            if (r9 != 0) goto L_0x03aa
            goto L_0x03b0
        L_0x03aa:
            r5.c()     // Catch:{ all -> 0x0638 }
            r9 = 0
            r5.c = r9     // Catch:{ all -> 0x0638 }
        L_0x03b0:
            aucj r9 = r5.b     // Catch:{ all -> 0x0638 }
            oqo r9 = (defpackage.oqo) r9     // Catch:{ all -> 0x0638 }
            int r10 = r9.a     // Catch:{ all -> 0x0638 }
            r15 = 4
            r10 = r10 | r15
            r9.a = r10     // Catch:{ all -> 0x0638 }
            r9.d = r0     // Catch:{ all -> 0x0638 }
            r0 = r10 | 1
            r9.a = r0     // Catch:{ all -> 0x0638 }
            r9.b = r4     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = "created_timestamp"
            pan r4 = r8.a     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x03dd
            java.util.Map r4 = r8.b     // Catch:{ all -> 0x0638 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x03dd
            pan r4 = r8.a     // Catch:{ all -> 0x0638 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0638 }
            long r9 = r4.a((int) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x03df
        L_0x03dd:
            r9 = 0
        L_0x03df:
            boolean r0 = r5.c     // Catch:{ all -> 0x0638 }
            if (r0 != 0) goto L_0x03e4
            goto L_0x03ea
        L_0x03e4:
            r5.c()     // Catch:{ all -> 0x0638 }
            r4 = 0
            r5.c = r4     // Catch:{ all -> 0x0638 }
        L_0x03ea:
            aucj r0 = r5.b     // Catch:{ all -> 0x0638 }
            oqo r0 = (defpackage.oqo) r0     // Catch:{ all -> 0x0638 }
            int r4 = r0.a     // Catch:{ all -> 0x0638 }
            r4 = r4 | 8
            r0.a = r4     // Catch:{ all -> 0x0638 }
            r0.f = r9     // Catch:{ all -> 0x0638 }
            java.util.Set r0 = r37.entrySet()     // Catch:{ all -> 0x0638 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0638 }
        L_0x03fe:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x043c
            aucj r0 = r5.i()     // Catch:{ all -> 0x0638 }
            oqo r0 = (defpackage.oqo) r0     // Catch:{ all -> 0x0638 }
            com.google.android.gms.icing.nativeindex.NativeIndex r4 = r1.o     // Catch:{ all -> 0x0638 }
            otr r5 = defpackage.ozy.a()     // Catch:{ all -> 0x0638 }
            aojr r0 = r4.a((long) r11, (defpackage.oqo) r0, (defpackage.otr) r5)     // Catch:{ all -> 0x0638 }
            osz r4 = r14.b     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x0419
            goto L_0x041b
        L_0x0419:
            osz r4 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
        L_0x041b:
            aond r0 = r1.a(r4, r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0638 }
            int r4 = r0.length()     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x0433
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r0.<init>(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x0437
        L_0x0433:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0638 }
        L_0x0437:
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x043c:
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0638 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0638 }
            java.lang.String r9 = "section_"
            java.lang.Object r10 = r4.getKey()     // Catch:{ all -> 0x0638 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0638 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0638 }
            int r15 = r10.length()     // Catch:{ all -> 0x0638 }
            if (r15 != 0) goto L_0x045a
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r10.<init>(r9)     // Catch:{ all -> 0x0638 }
            goto L_0x045e
        L_0x045a:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ all -> 0x0638 }
        L_0x045e:
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0638 }
            ozm r4 = (defpackage.ozm) r4     // Catch:{ all -> 0x0638 }
            pan r9 = r8.a     // Catch:{ all -> 0x0638 }
            if (r9 == 0) goto L_0x0528
            java.util.Map r9 = r8.b     // Catch:{ all -> 0x0638 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0638 }
            if (r9 == 0) goto L_0x0523
            pan r15 = r8.a     // Catch:{ all -> 0x0638 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0638 }
            android.database.Cursor r15 = r15.b     // Catch:{ all -> 0x051c }
            int r9 = r15.getType(r9)     // Catch:{ all -> 0x051c }
            r15 = 4
            if (r9 != r15) goto L_0x0517
            oqy r9 = r4.b     // Catch:{ all -> 0x0638 }
            boolean r15 = r9.c     // Catch:{ all -> 0x0638 }
            if (r15 != 0) goto L_0x04ea
            oqn r9 = defpackage.oqn.e     // Catch:{ all -> 0x0638 }
            aucd r9 = r9.o()     // Catch:{ all -> 0x0638 }
            int r15 = r4.a     // Catch:{ all -> 0x0638 }
            r22 = r0
            boolean r0 = r9.c     // Catch:{ all -> 0x0638 }
            if (r0 != 0) goto L_0x0498
            r27 = r3
            goto L_0x04a0
        L_0x0498:
            r9.c()     // Catch:{ all -> 0x0638 }
            r27 = r3
            r3 = 0
            r9.c = r3     // Catch:{ all -> 0x0638 }
        L_0x04a0:
            aucj r0 = r9.b     // Catch:{ all -> 0x0638 }
            oqn r0 = (defpackage.oqn) r0     // Catch:{ all -> 0x0638 }
            int r3 = r0.a     // Catch:{ all -> 0x0638 }
            r28 = 1
            r3 = r3 | 1
            r0.a = r3     // Catch:{ all -> 0x0638 }
            r0.b = r15     // Catch:{ all -> 0x0638 }
            oqy r4 = r4.b     // Catch:{ all -> 0x0638 }
            r4.getClass()     // Catch:{ all -> 0x0638 }
            r0.d = r4     // Catch:{ all -> 0x0638 }
            r3 = r3 | 32
            r0.a = r3     // Catch:{ all -> 0x0638 }
            byte[] r0 = r8.b(r10)     // Catch:{ all -> 0x0638 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ all -> 0x0638 }
            boolean r3 = r9.c     // Catch:{ all -> 0x0638 }
            if (r3 != 0) goto L_0x04c6
            goto L_0x04cc
        L_0x04c6:
            r9.c()     // Catch:{ all -> 0x0638 }
            r3 = 0
            r9.c = r3     // Catch:{ all -> 0x0638 }
        L_0x04cc:
            aucj r3 = r9.b     // Catch:{ all -> 0x0638 }
            oqn r3 = (defpackage.oqn) r3     // Catch:{ all -> 0x0638 }
            r0.getClass()     // Catch:{ all -> 0x0638 }
            int r4 = r3.a     // Catch:{ all -> 0x0638 }
            r10 = 4
            r4 = r4 | r10
            r3.a = r4     // Catch:{ all -> 0x0638 }
            r3.c = r0     // Catch:{ all -> 0x0638 }
            aucj r0 = r9.i()     // Catch:{ all -> 0x0638 }
            oqn r0 = (defpackage.oqn) r0     // Catch:{ all -> 0x0638 }
            r5.a((defpackage.oqn) r0)     // Catch:{ all -> 0x0638 }
            r0 = r22
            r3 = r27
            goto L_0x03fe
        L_0x04ea:
            pam r0 = new pam     // Catch:{ all -> 0x0638 }
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = r9.b     // Catch:{ all -> 0x0638 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0638 }
            int r5 = r5.length()     // Catch:{ all -> 0x0638 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0638 }
            int r5 = r5 + 31
            r8.<init>(r5)     // Catch:{ all -> 0x0638 }
            java.lang.String r5 = "Blob section "
            r8.append(r5)     // Catch:{ all -> 0x0638 }
            r8.append(r4)     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = " cannot be indexed"
            r8.append(r4)     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0638 }
            r3.<init>(r4)     // Catch:{ all -> 0x0638 }
            r0.<init>(r3)     // Catch:{ all -> 0x0638 }
            throw r0     // Catch:{ all -> 0x0638 }
        L_0x0517:
            r22 = r0
            r27 = r3
            goto L_0x052c
        L_0x051c:
            r0 = move-exception
            pam r3 = new pam     // Catch:{ all -> 0x0638 }
            r3.<init>(r0)     // Catch:{ all -> 0x0638 }
            throw r3     // Catch:{ all -> 0x0638 }
        L_0x0523:
            r22 = r0
            r27 = r3
            goto L_0x052c
        L_0x0528:
            r22 = r0
            r27 = r3
        L_0x052c:
            java.lang.String r0 = r8.a(r10)     // Catch:{ all -> 0x0638 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0638 }
            if (r3 != 0) goto L_0x0590
            oqn r3 = defpackage.oqn.e     // Catch:{ all -> 0x0638 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x0638 }
            int r9 = r4.a     // Catch:{ all -> 0x0638 }
            boolean r10 = r3.c     // Catch:{ all -> 0x0638 }
            if (r10 != 0) goto L_0x0543
        L_0x0542:
            goto L_0x054a
        L_0x0543:
            r3.c()     // Catch:{ all -> 0x0638 }
            r10 = 0
            r3.c = r10     // Catch:{ all -> 0x0638 }
            goto L_0x0542
        L_0x054a:
            aucj r10 = r3.b     // Catch:{ all -> 0x0638 }
            oqn r10 = (defpackage.oqn) r10     // Catch:{ all -> 0x0638 }
            int r15 = r10.a     // Catch:{ all -> 0x0638 }
            r28 = 1
            r15 = r15 | 1
            r10.a = r15     // Catch:{ all -> 0x0638 }
            r10.b = r9     // Catch:{ all -> 0x0638 }
            oqy r4 = r4.b     // Catch:{ all -> 0x0638 }
            r4.getClass()     // Catch:{ all -> 0x0638 }
            r10.d = r4     // Catch:{ all -> 0x0638 }
            r4 = r15 | 32
            r10.a = r4     // Catch:{ all -> 0x0638 }
            auay r0 = defpackage.auay.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x056c
            goto L_0x0572
        L_0x056c:
            r3.c()     // Catch:{ all -> 0x0638 }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0638 }
        L_0x0572:
            aucj r4 = r3.b     // Catch:{ all -> 0x0638 }
            oqn r4 = (defpackage.oqn) r4     // Catch:{ all -> 0x0638 }
            r0.getClass()     // Catch:{ all -> 0x0638 }
            int r9 = r4.a     // Catch:{ all -> 0x0638 }
            r10 = 4
            r9 = r9 | r10
            r4.a = r9     // Catch:{ all -> 0x0638 }
            r4.c = r0     // Catch:{ all -> 0x0638 }
            aucj r0 = r3.i()     // Catch:{ all -> 0x0638 }
            oqn r0 = (defpackage.oqn) r0     // Catch:{ all -> 0x0638 }
            r5.a((defpackage.oqn) r0)     // Catch:{ all -> 0x0638 }
            r0 = r22
            r3 = r27
            goto L_0x03fe
        L_0x0590:
            r0 = r22
            r3 = r27
            goto L_0x03fe
        L_0x0596:
            r14 = r38
            boolean r3 = android.text.TextUtils.equals(r5, r15)     // Catch:{ all -> 0x0638 }
            if (r3 == 0) goto L_0x05cc
            java.lang.String r3 = "delete "
            com.google.android.gms.icing.nativeindex.NativeIndex r4 = r1.o     // Catch:{ all -> 0x0638 }
            osz r5 = r14.b     // Catch:{ all -> 0x0638 }
            if (r5 == 0) goto L_0x05a7
            goto L_0x05a9
        L_0x05a7:
            osz r5 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
        L_0x05a9:
            int r5 = r5.b     // Catch:{ all -> 0x0638 }
            aond r0 = r4.a((long) r11, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0638 }
            int r4 = r0.length()     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x05c3
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r0.<init>(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x05c7
        L_0x05c3:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0638 }
        L_0x05c7:
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x05cc:
            boolean r0 = defpackage.pba.h()     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x062c
            java.lang.String r0 = "mod"
            boolean r0 = android.text.TextUtils.equals(r5, r0)     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x062c
            byte[] r29 = r8.b(r4)     // Catch:{ all -> 0x0638 }
            if (r29 == 0) goto L_0x0626
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.o     // Catch:{ all -> 0x0638 }
            plf r30 = defpackage.pap.a(r14)     // Catch:{ all -> 0x0638 }
            osz r3 = r14.b     // Catch:{ all -> 0x0638 }
            if (r3 == 0) goto L_0x05ed
            r31 = r3
            goto L_0x05f1
        L_0x05ed:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
            r31 = r3
        L_0x05f1:
            otr r32 = defpackage.ozy.a()     // Catch:{ all -> 0x0638 }
            r26 = r0
            r27 = r11
            aojr r0 = r26.b(r27, r29, r30, r31, r32)     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "modify "
            osz r4 = r14.b     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x0604
            goto L_0x0606
        L_0x0604:
            osz r4 = defpackage.osz.s     // Catch:{ all -> 0x0638 }
        L_0x0606:
            aond r0 = r1.a(r4, r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0638 }
            int r4 = r0.length()     // Catch:{ all -> 0x0638 }
            if (r4 != 0) goto L_0x061e
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0638 }
            r0.<init>(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x0622
        L_0x061e:
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0638 }
        L_0x0622:
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x0626:
            java.lang.String r0 = "bad section_thing_proto"
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x062c:
            r13.a((java.lang.String) r10)     // Catch:{ all -> 0x0638 }
            goto L_0x0636
        L_0x0631:
            r14 = r38
            r13.a((java.lang.String) r4)     // Catch:{ all -> 0x0638 }
        L_0x0636:
            r6 = r11
            goto L_0x0647
        L_0x0638:
            r0 = move-exception
            goto L_0x063d
        L_0x063a:
            r0 = move-exception
            r14 = r38
        L_0x063d:
            r3 = r42
            r5 = r35
        L_0x0641:
            r4 = r39
            goto L_0x0729
        L_0x0645:
            r14 = r38
        L_0x0647:
            pac r0 = r2.a     // Catch:{ all -> 0x06a4 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x06a4 }
            if (r0 != 0) goto L_0x0652
            r2.a((long) r11)     // Catch:{ all -> 0x06a4 }
        L_0x0652:
        L_0x0653:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06a4 }
            long r3 = r3 - r17
            r8 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0672
            r9 = r13
            r5 = r14
            r12 = r24
            r3 = r35
            r4 = r36
            r0 = r37
            r8 = 2
            r10 = 1
            r11 = 0
            r14 = r42
            r42 = r39
            goto L_0x012f
        L_0x0672:
            r3 = r42
            r3.a = r6     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.o     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            r4 = r39
            int r4 = r4.b     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r0 = r0.a((int) r4, (long) r6)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r4 = defpackage.aond.OK     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            if (r0 != r4) goto L_0x0698
            long r4 = r3.a     // Catch:{ pam -> 0x0694, pal -> 0x0690, OutOfMemoryError -> 0x0740 }
            int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x068d
            r0 = 1
            goto L_0x06f5
        L_0x068d:
            r0 = 0
            goto L_0x06f5
        L_0x0690:
            r0 = move-exception
            r7 = 0
            goto L_0x0809
        L_0x0694:
            r0 = move-exception
            r7 = 0
            goto L_0x0823
        L_0x0698:
            defpackage.oso.b(r36)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            oyq r0 = r1.f     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            r5 = r35
            r0.a((java.lang.String) r5)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
        L_0x06a2:
            r0 = 2
            goto L_0x06f5
        L_0x06a4:
            r0 = move-exception
            r3 = r42
            r5 = r35
            goto L_0x0641
        L_0x06aa:
            r36 = r4
            r4 = r13
            r3 = r14
            r13 = r22
            r14 = r5
            r5 = r35
        L_0x06b3:
            java.lang.String r0 = "Out of order seqno for %s pkg %s %d last %d"
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x06fc }
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x06bd
            goto L_0x06bf
        L_0x06bd:
            r27 = r28
        L_0x06bf:
            r8 = 0
            r10[r8] = r27     // Catch:{ all -> 0x06fc }
            java.lang.String r8 = r4.e     // Catch:{ all -> 0x06fc }
            r9 = 1
            r10[r9] = r8     // Catch:{ all -> 0x06fc }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x06fc }
            r9 = 2
            r10[r9] = r8     // Catch:{ all -> 0x06fc }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x06fc }
            r9 = 3
            r10[r9] = r8     // Catch:{ all -> 0x06fc }
            defpackage.oso.c((java.lang.String) r0, (java.lang.Object[]) r10)     // Catch:{ all -> 0x06fc }
            java.lang.String r0 = "out of order seqno"
            r13.a((java.lang.String) r0)     // Catch:{ all -> 0x06fc }
            r3.a = r6     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.o     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            int r4 = r4.b     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r0 = r0.a((int) r4, (long) r6)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r4 = defpackage.aond.OK     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            if (r0 == r4) goto L_0x06f4
            defpackage.oso.b(r36)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            oyq r0 = r1.f     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            r0.a((java.lang.String) r5)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            goto L_0x06a2
        L_0x06f4:
            r0 = 2
        L_0x06f5:
            r27 = r0
            r7 = 0
            r31 = 0
            goto L_0x0883
        L_0x06fc:
            r0 = move-exception
            goto L_0x0729
        L_0x06fe:
            r0 = move-exception
            r36 = r4
            goto L_0x0707
        L_0x0702:
            r0 = move-exception
            r36 = r4
            r24 = r12
        L_0x0707:
            r13 = r22
            r4 = r42
            goto L_0x0714
        L_0x070c:
            r0 = move-exception
            r36 = r4
            r24 = r12
            r4 = r42
            r13 = r9
        L_0x0714:
            r40 = r5
            r5 = r3
            r3 = r14
            r14 = r40
            goto L_0x0729
        L_0x071b:
            r0 = move-exception
            r36 = r4
            r24 = r12
            r4 = r42
            r13 = r9
            r40 = r5
            r5 = r3
            r3 = r14
            r14 = r40
        L_0x0729:
            r3.a = r6     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            com.google.android.gms.icing.nativeindex.NativeIndex r8 = r1.o     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            int r4 = r4.b     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r4 = r8.a((int) r4, (long) r6)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            aond r6 = defpackage.aond.OK     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            if (r4 == r6) goto L_0x073f
            defpackage.oso.b(r36)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            oyq r4 = r1.f     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
            r4.a((java.lang.String) r5)     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
        L_0x073f:
            throw r0     // Catch:{ pam -> 0x0745, pal -> 0x0742, OutOfMemoryError -> 0x0740 }
        L_0x0740:
            r0 = move-exception
            goto L_0x0754
        L_0x0742:
            r0 = move-exception
            goto L_0x0807
        L_0x0745:
            r0 = move-exception
            goto L_0x0821
        L_0x0748:
            r0 = move-exception
            goto L_0x0802
        L_0x074b:
            r0 = move-exception
            goto L_0x081c
        L_0x074e:
            r0 = move-exception
            r24 = r12
            r3 = r14
            r14 = r5
            r13 = r9
        L_0x0754:
            java.lang.String r4 = "Out of memory while indexing content provider."
            defpackage.oso.a((java.lang.Throwable) r0, (java.lang.String) r4)
            oyq r0 = r1.f     // Catch:{ OutOfMemoryError -> 0x07f2 }
            osz r4 = r14.b     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r4 == 0) goto L_0x0760
            goto L_0x0762
        L_0x0760:
            osz r4 = defpackage.osz.s     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x0762:
            java.lang.String r4 = r4.e     // Catch:{ OutOfMemoryError -> 0x07f2 }
            osz r5 = r14.b     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r5 == 0) goto L_0x0769
            goto L_0x076b
        L_0x0769:
            osz r5 = defpackage.osz.s     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x076b:
            java.lang.String r5 = defpackage.pxa.a(r5)     // Catch:{ OutOfMemoryError -> 0x07f2 }
            axrp r6 = defpackage.axrp.a     // Catch:{ OutOfMemoryError -> 0x07f2 }
            axrq r6 = r6.a()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            long r6 = r6.g()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            boolean r8 = r0.a((long) r6)     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r8 == 0) goto L_0x07f1
            aojb r8 = defpackage.aojb.d     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aucd r8 = r8.o()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r4 == 0) goto L_0x07a1
            boolean r9 = r8.c     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r9 != 0) goto L_0x078c
            goto L_0x0792
        L_0x078c:
            r8.c()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r9 = 0
            r8.c = r9     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x0792:
            aucj r9 = r8.b     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aojb r9 = (defpackage.aojb) r9     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r4.getClass()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            int r10 = r9.a     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r11 = 1
            r10 = r10 | r11
            r9.a = r10     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r9.b = r4     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x07a1:
            if (r5 != 0) goto L_0x07a4
            goto L_0x07be
        L_0x07a4:
            boolean r4 = r8.c     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r4 != 0) goto L_0x07a9
            goto L_0x07af
        L_0x07a9:
            r8.c()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r4 = 0
            r8.c = r4     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x07af:
            aucj r4 = r8.b     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aojb r4 = (defpackage.aojb) r4     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r5.getClass()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            int r9 = r4.a     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r10 = 2
            r9 = r9 | r10
            r4.a = r9     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r4.c = r5     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x07be:
            aoji r4 = defpackage.aoji.R     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aucd r4 = r4.o()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            boolean r5 = r4.c     // Catch:{ OutOfMemoryError -> 0x07f2 }
            if (r5 != 0) goto L_0x07c9
            goto L_0x07cf
        L_0x07c9:
            r4.c()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r5 = 0
            r4.c = r5     // Catch:{ OutOfMemoryError -> 0x07f2 }
        L_0x07cf:
            aucj r5 = r4.b     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aoji r5 = (defpackage.aoji) r5     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aucj r8 = r8.i()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            aojb r8 = (defpackage.aojb) r8     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r8.getClass()     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r5.x = r8     // Catch:{ OutOfMemoryError -> 0x07f2 }
            int r8 = r5.a     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = r8 | r9
            r5.a = r8     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r5 = 6006(0x1776, float:8.416E-42)
            r0.a((int) r5, (defpackage.aucd) r4, (long) r6)     // Catch:{ OutOfMemoryError -> 0x07f2 }
            r7 = 0
            r27 = 2
            r31 = 0
            goto L_0x0883
        L_0x07f1:
            goto L_0x07f8
        L_0x07f2:
            r0 = move-exception
            java.lang.String r4 = "Out of memory while logging."
            defpackage.oso.a((java.lang.Throwable) r0, (java.lang.String) r4)
        L_0x07f8:
            r7 = 0
            r27 = 2
            r31 = 0
            goto L_0x0883
        L_0x07ff:
            r0 = move-exception
            r16 = r7
        L_0x0802:
            r24 = r12
            r3 = r14
            r14 = r5
            r13 = r9
        L_0x0807:
            r7 = r16
        L_0x0809:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "Content incarnation mismatch: %s"
            defpackage.oso.e((java.lang.String) r4, (java.lang.Object) r0)
            r27 = 2
            r31 = 1
            goto L_0x0883
        L_0x0819:
            r0 = move-exception
            r16 = r7
        L_0x081c:
            r24 = r12
            r3 = r14
            r14 = r5
            r13 = r9
        L_0x0821:
            r7 = r16
        L_0x0823:
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r4 = r0.getMessage()
            java.lang.String r5 = "Cursor call threw an exception: %s"
            defpackage.oso.b((java.lang.String) r5, (java.lang.Object) r4)
            boolean r4 = r0 instanceof android.os.DeadObjectException
            if (r4 == 0) goto L_0x0865
            oyq r0 = r1.f
            java.lang.String r4 = "cursor_died_exception"
            r0.a((java.lang.String) r4)
            java.lang.String r0 = "cursor-died"
            r13.a((java.lang.String) r0)
            if (r7 != 0) goto L_0x084e
            r4 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Indexing content provider failed; will retry %d times"
            defpackage.oso.b((java.lang.String) r4, (java.lang.Object) r0)
            r7 = 3
            goto L_0x087f
        L_0x084e:
            int r7 = r7 + -1
            if (r7 == 0) goto L_0x0853
            goto L_0x085a
        L_0x0853:
            oyq r0 = r1.f
            java.lang.String r4 = "cursor_retries_failed"
            r0.a((java.lang.String) r4)
        L_0x085a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r4 = "Indexing content provider failed again; %d retries remaining"
            defpackage.oso.b((java.lang.String) r4, (java.lang.Object) r0)
            goto L_0x087f
        L_0x0865:
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x0871
            oyq r0 = r1.f
            java.lang.String r4 = "cursor_security_exception"
            r0.a((java.lang.String) r4)
            goto L_0x0878
        L_0x0871:
            oyq r0 = r1.f
            java.lang.String r4 = "cursor_other_exception"
            r0.a((java.lang.String) r4)
        L_0x0878:
            java.lang.String r0 = "cursor-exception"
            r13.a((java.lang.String) r0)
            r7 = 0
        L_0x087f:
            r27 = 2
            r31 = 0
        L_0x0883:
            long r3 = r3.a
            int r0 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x088c
            r30 = 1
            goto L_0x088e
        L_0x088c:
            r30 = 0
        L_0x088e:
            if (r30 == 0) goto L_0x08b0
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            pao r5 = r1.q
            java.lang.String r5 = r5.b()
            r6 = 0
            r0[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            r6 = 1
            r0[r6] = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = "Indexed %s from %d to %d"
            defpackage.oso.b((java.lang.String) r3, (java.lang.Object[]) r0)
            goto L_0x08bb
        L_0x08b0:
            pao r0 = r1.q
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "Query from %s found nothing"
            defpackage.oso.a((java.lang.String) r3, (java.lang.Object) r0)
        L_0x08bb:
            otg r0 = r14.c
            if (r0 == 0) goto L_0x08c0
            goto L_0x08c2
        L_0x08c0:
            otg r0 = defpackage.otg.h
        L_0x08c2:
            r3 = 5
            java.lang.Object r3 = r0.c(r3)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r0)
            aucj r0 = r3.b
            otg r0 = (defpackage.otg) r0
            aucx r0 = r0.b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.List r0 = r13.a((java.util.List) r0)
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x08e5
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x08e5:
            aucj r4 = r3.b
            otg r4 = (defpackage.otg) r4
            aucx r5 = defpackage.aucj.s()
            r4.b = r5
            r3.L(r0)
            java.lang.String r0 = r2.c
            if (r0 == 0) goto L_0x093f
            aucj r2 = r3.b
            otg r2 = (defpackage.otg) r2
            java.lang.String r2 = r2.g
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x093f
            aucj r2 = r3.b
            otg r2 = (defpackage.otg) r2
            java.lang.String r2 = r2.g
            java.lang.String r4 = "Content incarnation changed from %s to %s, saving to prefs now"
            defpackage.oso.a((java.lang.String) r4, (java.lang.Object) r2, (java.lang.Object) r0)
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0912
            goto L_0x0918
        L_0x0912:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x0918:
            aucj r2 = r3.b
            otg r2 = (defpackage.otg) r2
            int r4 = r2.a
            r4 = r4 | 16
            r2.a = r4
            r2.e = r7
            r0.getClass()
            r4 = r4 | 64
            r2.a = r4
            r2.g = r0
            ozi r0 = r1.d
            ozq r0 = r0.a()
            pao r2 = r1.q
            aucj r3 = r3.i()
            otg r3 = (defpackage.otg) r3
            r0.c(r2, r3)
            goto L_0x0959
        L_0x093f:
            ozi r0 = r1.d
            ozq r0 = r0.a()
            pao r2 = r1.q
            aucj r3 = r3.b
            otg r3 = (defpackage.otg) r3
            aucx r3 = r3.b
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r0.a((defpackage.pao) r2, (java.util.List) r3, (java.lang.Integer) r4, (defpackage.otd) r5)
        L_0x0959:
            boolean r0 = r13.a()
            r2 = 1
            r0 = r0 ^ r2
            defpackage.iva.a((boolean) r0)
            if (r7 <= 0) goto L_0x0967
            r28 = r44
            goto L_0x0969
        L_0x0967:
            r28 = 0
        L_0x0969:
            paf r0 = new paf
            r26 = r0
            r26.<init>(r27, r28, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.a(ota, pad, long):paf");
    }
}
