package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: cen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cen extends ccy {
    public static final ccj b = new ccj(new cek(), "PlacesProducer", new int[]{18, 60}, new int[]{7});
    private final cer k = new cer(awvb.aG, awvb.aF, awvb.aE);
    private final rir l;
    private PendingIntent m = null;
    private final HashSet n = new HashSet();
    private boolean o;
    private int p;
    private long q;
    private final Runnable r;
    private int s;
    private long t;

    public cen(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        riq riq = new riq();
        riq.b = "com.google.android.contextmanager.producer.module.PlacesProducer";
        riq.a();
        if (!bsz.b()) {
            riq.d = bsz.b;
        }
        this.l = riq.a();
        this.o = false;
        this.p = 0;
        this.q = -1;
        this.r = new cel(this);
        this.s = -1;
        this.t = Long.MAX_VALUE;
    }

    public static atts a(rhq rhq, double d, int i, double d2, List list) {
        if (rhq == null) {
            return null;
        }
        attr attr = (attr) atts.s.o();
        if (attr.c) {
            attr.c();
            attr.c = false;
        }
        atts atts = (atts) attr.b;
        int i2 = atts.a | 1;
        atts.a = i2;
        atts.b = d;
        int i3 = i2 | FragmentTransaction.TRANSIT_EXIT_MASK;
        atts.a = i3;
        atts.q = d2;
        atts.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
        atts.p = i;
        if (list != null) {
            attr.a(list);
        }
        CharSequence q2 = rhq.q();
        if (q2 != null) {
            String charSequence = q2.toString();
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts2 = (atts) attr.b;
            charSequence.getClass();
            atts2.a |= 2;
            atts2.c = charSequence;
        }
        String a = rhq.a();
        if (a != null) {
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts3 = (atts) attr.b;
            a.getClass();
            atts3.a |= 4;
            atts3.d = a;
        }
        Locale c = rhq.c();
        if (c != null) {
            String displayName = c.getDisplayName();
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts4 = (atts) attr.b;
            displayName.getClass();
            atts4.a |= 8;
            atts4.e = displayName;
        }
        CharSequence p2 = rhq.p();
        if (p2 != null) {
            String charSequence2 = p2.toString();
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts5 = (atts) attr.b;
            charSequence2.getClass();
            atts5.a |= 16;
            atts5.f = charSequence2;
        }
        CharSequence o2 = rhq.o();
        if (o2 != null) {
            String charSequence3 = o2.toString();
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts6 = (atts) attr.b;
            charSequence3.getClass();
            atts6.a |= 32;
            atts6.g = charSequence3;
        }
        int l2 = rhq.l();
        if (attr.c) {
            attr.c();
            attr.c = false;
        }
        atts atts7 = (atts) attr.b;
        atts7.a |= 128;
        atts7.i = l2;
        float k2 = rhq.k();
        if (attr.c) {
            attr.c();
            attr.c = false;
        }
        atts atts8 = (atts) attr.b;
        atts8.a |= 64;
        atts8.h = k2;
        boolean j = rhq.j();
        if (attr.c) {
            attr.c();
            attr.c = false;
        }
        atts atts9 = (atts) attr.b;
        atts9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        atts9.j = j;
        Uri h = rhq.h();
        if (h != null) {
            String encodedPath = h.getEncodedPath();
            if (attr.c) {
                attr.c();
                attr.c = false;
            }
            atts atts10 = (atts) attr.b;
            encodedPath.getClass();
            atts10.a |= 512;
            atts10.k = encodedPath;
        }
        List<Integer> b2 = rhq.b();
        if (b2 != null) {
            for (Integer intValue : b2) {
                asup a2 = asup.a(intValue.intValue());
                if (a2 == null) {
                    a2 = asup.OTHER;
                }
                if (attr.c) {
                    attr.c();
                    attr.c = false;
                }
                atts atts11 = (atts) attr.b;
                a2.getClass();
                if (!atts11.n.a()) {
                    atts11.n = aucj.a(atts11.n);
                }
                atts11.n.d(a2.bx);
            }
            LatLng d3 = rhq.d();
            if (d3 != null) {
                int b3 = aell.b(d3.a);
                if (attr.c) {
                    attr.c();
                    attr.c = false;
                }
                atts atts12 = (atts) attr.b;
                atts12.a |= 1024;
                atts12.l = b3;
                int b4 = aell.b(d3.b);
                if (attr.c) {
                    attr.c();
                    attr.c = false;
                }
                atts atts13 = (atts) attr.b;
                atts13.a |= 2048;
                atts13.m = b4;
            }
        }
        return (atts) attr.i();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.m != null) {
            rij.a(this.d, this.l).f(this.m).a((acvp) new bva("[PlacesProducer] removePlaceUpdates", new Object[0]));
        }
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.gms.contextmanager.PLACE_UPDATES");
        return intentFilter;
    }

    public final void j() {
        long a = cbi.i().a();
        if (!this.n.isEmpty() && this.o && this.p <= ((int) awuz.a.a().as())) {
            long j = this.q;
            if (j == -1 || a <= j + awuz.A()) {
                if (this.q == -1) {
                    this.q = cbi.i().a();
                }
                a((int) awuz.x(), awuz.z());
                cbi.k().a(this.r, awuz.A(), bvq.a("updatePlaceUpdatesIfNecessary"));
                return;
            }
        }
        this.q = -1;
        cer cer = this.k;
        a(cer.b, cer.c);
    }

    public final void b(ContextData contextData) {
        if (contextData.g() != 7) {
            ((anih) ((anih) bxk.a.c()).a("cen", "b", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer] Context %s is being received by producer %s and not handled.", (Object) Integer.toString(contextData.g()), (Object) "PlacesProducer");
        } else if (contextData.j().b()) {
            atuf atuf = (atuf) contextData.a((aubq) atuf.d);
            if (atuf == null) {
                ((anih) ((anih) bxk.a.b()).a("cen", "b", 298, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer] Could not get screen proto.");
                return;
            }
            int i = 1;
            Object[] objArr = new Object[1];
            int a = atue.a(atuf.b);
            if (a == 0) {
                a = 1;
            }
            objArr[0] = Integer.valueOf(a - 1);
            int a2 = atue.a(atuf.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    anih anih = (anih) ((anih) bxk.a.b()).a("cen", "a", 512, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    int a3 = atue.a(atuf.b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    anih.a("[PlacesProducer] Unknown screen state=%s", i - 1);
                } else if (!this.o) {
                    this.o = true;
                    this.p = 0;
                    j();
                }
            } else if (this.o) {
                this.o = false;
                j();
            }
        }
    }

    private final void a(int i, long j) {
        if (this.s != i || this.t != j) {
            Integer valueOf = Integer.valueOf(i);
            Long valueOf2 = Long.valueOf(j);
            Object[] objArr = {valueOf, valueOf2};
            if (this.m == null) {
                ((anih) ((anih) bxk.a.b()).a("cen", "a", 569, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer] NULL pendingIntent! dropping update request!");
                return;
            }
            this.s = i;
            this.t = j;
            rih rih = new rih();
            rih.a = new PlaceFilter();
            rih.b = this.t;
            rih.c = this.s;
            rij.a(this.d, this.l).a(rih.a(), this.m).a((acvp) new bva("[PlacesProducer] requestPlaceUpdates, priority=%s, interval=%s", valueOf, valueOf2));
        }
    }

    private final void a(atuf atuf) {
        if (atuf != null) {
            int i = 1;
            Object[] objArr = new Object[1];
            int a = atue.a(atuf.b);
            if (a == 0) {
                a = 1;
            }
            objArr[0] = Integer.valueOf(a - 1);
            int a2 = atue.a(atuf.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    anih anih = (anih) ((anih) bxk.a.b()).a("cen", "a", 512, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                    int a3 = atue.a(atuf.b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    anih.a("[PlacesProducer] Unknown screen state=%s", i - 1);
                } else if (!this.o) {
                    this.o = true;
                    this.p = 0;
                    j();
                }
            } else if (this.o) {
                this.o = false;
                j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(android.content.Intent r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            android.content.Context r2 = r1.d
            java.lang.String r3 = "context must not be null"
            defpackage.iva.a((java.lang.Object) r2, (java.lang.Object) r3)
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            java.lang.String r4 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY"
            boolean r5 = r0.hasExtra(r4)
            if (r5 == 0) goto L_0x00bc
            java.lang.String r5 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY"
            boolean r6 = r0.hasExtra(r5)
            if (r6 == 0) goto L_0x00bc
            java.lang.String r6 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY"
            boolean r7 = r0.hasExtra(r6)
            if (r7 == 0) goto L_0x00bc
            android.os.Parcelable$Creator r7 = com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity.CREATOR
            java.util.ArrayList r4 = defpackage.ivy.b(r0, r4, r7)
            if (r4 == 0) goto L_0x00bc
            android.os.Parcelable$Creator r7 = com.google.android.gms.common.api.Status.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r5 = defpackage.ivy.a((android.content.Intent) r0, (java.lang.String) r5, (android.os.Parcelable.Creator) r7)
            com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
            if (r5 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.c
        L_0x003b:
            r7 = -1
            int r6 = r0.getIntExtra(r6, r7)
            java.lang.String[] r7 = defpackage.rks.b
            ilm r7 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r7)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r9 = r4.size()
            r10 = 0
        L_0x0050:
            if (r10 >= r9) goto L_0x0095
            java.lang.Object r11 = r4.get(r10)
            com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity r11 = (com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity) r11
            com.google.android.gms.location.places.internal.PlaceEntity r12 = r11.b
            android.content.ContentValues r12 = r12.s()
            float r13 = r11.d
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.String r14 = "place_likelihood"
            r12.put(r14, r13)
            int r13 = r11.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "place_hierarchy_level"
            r12.put(r14, r13)
            java.util.List r13 = r11.f
            byte[] r13 = defpackage.ilj.c((java.util.List) r13)
            java.lang.String r14 = "place_contained_place_ids"
            r12.put(r14, r13)
            byte[] r13 = defpackage.ivy.a(r11)
            java.lang.String r14 = "data"
            r12.put(r14, r13)
            r7.a((android.content.ContentValues) r12)
            com.google.android.gms.location.places.internal.PlaceEntity r11 = r11.b
            java.util.List r11 = r11.n
            r8.addAll(r11)
            int r10 = r10 + 1
            goto L_0x0050
        L_0x0095:
            java.lang.String r4 = defpackage.rjd.a(r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x00a9
            java.lang.String r9 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY"
            r8.putString(r9, r4)
        L_0x00a9:
            java.lang.String r4 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            rhj r9 = new rhj
            int r5 = r5.i
            com.google.android.gms.common.data.DataHolder r5 = r7.a(r5, r8)
            r9.<init>(r5, r4, r6)
            goto L_0x00bd
        L_0x00bc:
            r9 = 0
        L_0x00bd:
            if (r9 == 0) goto L_0x026b
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x025f }
            int r5 = r9.a()     // Catch:{ all -> 0x025f }
            r4.<init>(r5)     // Catch:{ all -> 0x025f }
            java.util.Iterator r5 = r9.iterator()     // Catch:{ all -> 0x025f }
        L_0x00cc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x025f }
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r8 = "a"
            java.lang.String r10 = "cen"
            if (r6 == 0) goto L_0x0141
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x025f }
            rhi r6 = (defpackage.rhi) r6     // Catch:{ all -> 0x025f }
            if (r6 == 0) goto L_0x012b
            rhq r11 = r6.bb()     // Catch:{ all -> 0x025f }
            if (r11 == 0) goto L_0x0115
            java.lang.String r12 = r11.a()     // Catch:{ all -> 0x025f }
            if (r12 == 0) goto L_0x0115
            java.lang.String r12 = r11.a()     // Catch:{ all -> 0x025f }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x025f }
            if (r12 != 0) goto L_0x0115
            java.lang.String r7 = r11.a()     // Catch:{ all -> 0x025f }
            rhq r10 = r6.bb()     // Catch:{ all -> 0x025f }
            int r13 = r6.s()     // Catch:{ all -> 0x025f }
            float r8 = r6.ba()     // Catch:{ all -> 0x025f }
            double r14 = (double) r8     // Catch:{ all -> 0x025f }
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.List r16 = r6.t()     // Catch:{ all -> 0x025f }
            atts r6 = a(r10, r11, r13, r14, r16)     // Catch:{ all -> 0x025f }
            r4.put(r7, r6)     // Catch:{ all -> 0x025f }
            goto L_0x00cc
        L_0x0115:
            jjg r6 = defpackage.bxk.a     // Catch:{ all -> 0x025f }
            anie r6 = r6.c()     // Catch:{ all -> 0x025f }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x025f }
            r12 = 328(0x148, float:4.6E-43)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r8, (int) r12, (java.lang.String) r7)     // Catch:{ all -> 0x025f }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x025f }
            java.lang.String r7 = "[PlacesProducer] unable to find PlaceId for HierarchicalPlaceLikelihood place %s"
            r6.a((java.lang.String) r7, (java.lang.Object) r11)     // Catch:{ all -> 0x025f }
            goto L_0x00cc
        L_0x012b:
            jjg r6 = defpackage.bxk.a     // Catch:{ all -> 0x025f }
            anie r6 = r6.c()     // Catch:{ all -> 0x025f }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x025f }
            r11 = 321(0x141, float:4.5E-43)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r8, (int) r11, (java.lang.String) r7)     // Catch:{ all -> 0x025f }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x025f }
            java.lang.String r7 = "[PlacesProducer] hierarchicalPlaceLikelihood is null1"
            r6.a((java.lang.String) r7)     // Catch:{ all -> 0x025f }
            goto L_0x00cc
        L_0x0141:
            ria r5 = defpackage.ria.a((android.content.Intent) r18)     // Catch:{ all -> 0x025f }
            r0 = 1
            if (r5 == 0) goto L_0x01fb
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x025c }
        L_0x014c:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x025c }
            if (r11 == 0) goto L_0x0210
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x025c }
            rhy r11 = (defpackage.rhy) r11     // Catch:{ all -> 0x025c }
            if (r11 == 0) goto L_0x01e3
            rhq r12 = r11.bb()     // Catch:{ all -> 0x025c }
            if (r12 == 0) goto L_0x01cb
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x025c }
            if (r13 == 0) goto L_0x01c9
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x025c }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x025c }
            if (r13 != 0) goto L_0x01c9
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x025c }
            java.lang.Object r13 = r4.get(r13)     // Catch:{ all -> 0x025c }
            atts r13 = (defpackage.atts) r13     // Catch:{ all -> 0x025c }
            if (r13 == 0) goto L_0x01b2
            java.lang.String r12 = r12.a()     // Catch:{ all -> 0x025c }
            r14 = 5
            java.lang.Object r14 = r13.c(r14)     // Catch:{ all -> 0x025c }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ all -> 0x025c }
            r14.a((defpackage.aucj) r13)     // Catch:{ all -> 0x025c }
            attr r14 = (defpackage.attr) r14     // Catch:{ all -> 0x025c }
            float r11 = r11.ba()     // Catch:{ all -> 0x025c }
            r15 = r4
            double r3 = (double) r11     // Catch:{ all -> 0x025c }
            boolean r11 = r14.c     // Catch:{ all -> 0x025c }
            if (r11 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r14.c()     // Catch:{ all -> 0x025c }
            r14.c = r2     // Catch:{ all -> 0x025c }
        L_0x019c:
            aucj r11 = r14.b     // Catch:{ all -> 0x025c }
            atts r11 = (defpackage.atts) r11     // Catch:{ all -> 0x025c }
            int r13 = r11.a     // Catch:{ all -> 0x025c }
            r13 = r13 | r0
            r11.a = r13     // Catch:{ all -> 0x025c }
            r11.b = r3     // Catch:{ all -> 0x025c }
            aucj r3 = r14.i()     // Catch:{ all -> 0x025c }
            atts r3 = (defpackage.atts) r3     // Catch:{ all -> 0x025c }
            r4 = r15
            r4.put(r12, r3)     // Catch:{ all -> 0x025c }
            goto L_0x014c
        L_0x01b2:
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x025c }
            anie r3 = r3.c()     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            r11 = 367(0x16f, float:5.14E-43)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r11, (java.lang.String) r7)     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            java.lang.String r11 = "[PlacesProducer] No hierarchical record found for %s"
            r13 = 0
            r3.a((java.lang.String) r11, (java.lang.Object) r13)     // Catch:{ all -> 0x025c }
            goto L_0x014c
        L_0x01c9:
            r13 = 0
            goto L_0x01cc
        L_0x01cb:
            r13 = 0
        L_0x01cc:
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x025c }
            anie r3 = r3.c()     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            r11 = 360(0x168, float:5.04E-43)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r11, (java.lang.String) r7)     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            java.lang.String r11 = "[PlacesProducer] unable to find PlaceId for PlaceLikelihood place %s"
            r3.a((java.lang.String) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x025c }
            goto L_0x014c
        L_0x01e3:
            r13 = 0
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x025c }
            anie r3 = r3.c()     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            r11 = 353(0x161, float:4.95E-43)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r11, (java.lang.String) r7)     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            java.lang.String r11 = "[PlacesProducer] placeLikelihood is null1"
            r3.a((java.lang.String) r11)     // Catch:{ all -> 0x025c }
            goto L_0x014c
        L_0x01fb:
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x025c }
            anie r3 = r3.c()     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            r6 = 346(0x15a, float:4.85E-43)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r6, (java.lang.String) r7)     // Catch:{ all -> 0x025c }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x025c }
            java.lang.String r6 = "[PlacesProducer] Unexpected condition: PlaceLikelihoodBuffer.readFromIntent is null."
            r3.a((java.lang.String) r6)     // Catch:{ all -> 0x025c }
        L_0x0210:
            java.util.Collection r3 = r4.values()     // Catch:{ all -> 0x025c }
            attu r4 = defpackage.attu.b     // Catch:{ all -> 0x025c }
            aucd r4 = r4.o()     // Catch:{ all -> 0x025c }
            attt r4 = (defpackage.attt) r4     // Catch:{ all -> 0x025c }
            r4.a(r3)     // Catch:{ all -> 0x025c }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x025c }
            aucj r6 = r4.b     // Catch:{ all -> 0x025c }
            attu r6 = (defpackage.attu) r6     // Catch:{ all -> 0x025c }
            aucx r6 = r6.a     // Catch:{ all -> 0x025c }
            int r6 = r6.size()     // Catch:{ all -> 0x025c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x025c }
            r3[r2] = r6     // Catch:{ all -> 0x025c }
            jti r2 = new jti     // Catch:{ all -> 0x025c }
            r3 = 7
            r6 = 18
            r2.<init>(r3, r6, r0)     // Catch:{ all -> 0x025c }
            auci r3 = defpackage.attu.c     // Catch:{ all -> 0x025c }
            aucj r4 = r4.i()     // Catch:{ all -> 0x025c }
            attu r4 = (defpackage.attu) r4     // Catch:{ all -> 0x025c }
            r2.a(r3, r4)     // Catch:{ all -> 0x025c }
            com.google.android.gms.contextmanager.ContextData r2 = r2.a()     // Catch:{ all -> 0x025c }
            r1.c(r2)     // Catch:{ all -> 0x025c }
            r9.c()
            if (r5 == 0) goto L_0x0253
            r5.c()
        L_0x0253:
            int r2 = r1.p
            int r2 = r2 + r0
            r1.p = r2
            r17.j()
            return r0
        L_0x025c:
            r0 = move-exception
            r3 = r5
            goto L_0x0262
        L_0x025f:
            r0 = move-exception
            r13 = 0
            r3 = r13
        L_0x0262:
            r9.c()
            if (r3 == 0) goto L_0x026a
            r3.c()
        L_0x026a:
            throw r0
        L_0x026b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cen.a(android.content.Intent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Intent intent = new Intent("android.gms.contextmanager.PLACE_UPDATES");
        intent.setPackage("com.google.android.gms");
        this.m = PendingIntent.getBroadcast(this.d, this.e.hashCode(), intent, 134217728);
        cer cer = this.k;
        a(cer.b, cer.c);
        jtm jtm = new jtm();
        jtm.a(7);
        gra.d(this.d, this.g).a(jtm.a()).a((acvp) new cem(this, "[PlacesProducer] get current screen context", new Object[0]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r22, android.content.Intent r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            java.lang.String r2 = r23.getAction()
            java.lang.String r3 = "android.gms.contextmanager.PLACE_UPDATES"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x029c
            android.content.Context r2 = r1.d
            java.lang.String r3 = "context must not be null"
            defpackage.iva.a((java.lang.Object) r2, (java.lang.Object) r3)
            r2 = 0
            if (r0 == 0) goto L_0x00c8
            java.lang.String r4 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY"
            boolean r5 = r0.hasExtra(r4)
            if (r5 == 0) goto L_0x00c8
            java.lang.String r5 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY"
            boolean r6 = r0.hasExtra(r5)
            if (r6 == 0) goto L_0x00c8
            java.lang.String r6 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY"
            boolean r7 = r0.hasExtra(r6)
            if (r7 == 0) goto L_0x00c8
            android.os.Parcelable$Creator r7 = com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity.CREATOR
            java.util.ArrayList r4 = defpackage.ivy.b(r0, r4, r7)
            if (r4 == 0) goto L_0x00c8
            android.os.Parcelable$Creator r7 = com.google.android.gms.common.api.Status.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r5 = defpackage.ivy.a((android.content.Intent) r0, (java.lang.String) r5, (android.os.Parcelable.Creator) r7)
            com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
            if (r5 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.c
        L_0x0047:
            r7 = -1
            int r6 = r0.getIntExtra(r6, r7)
            java.lang.String[] r7 = defpackage.rks.b
            ilm r7 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r7)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r9 = r4.size()
            r10 = 0
        L_0x005c:
            if (r10 >= r9) goto L_0x00a1
            java.lang.Object r11 = r4.get(r10)
            com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity r11 = (com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity) r11
            com.google.android.gms.location.places.internal.PlaceEntity r12 = r11.b
            android.content.ContentValues r12 = r12.s()
            float r13 = r11.d
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.String r14 = "place_likelihood"
            r12.put(r14, r13)
            int r13 = r11.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "place_hierarchy_level"
            r12.put(r14, r13)
            java.util.List r13 = r11.f
            byte[] r13 = defpackage.ilj.c((java.util.List) r13)
            java.lang.String r14 = "place_contained_place_ids"
            r12.put(r14, r13)
            byte[] r13 = defpackage.ivy.a(r11)
            java.lang.String r14 = "data"
            r12.put(r14, r13)
            r7.a((android.content.ContentValues) r12)
            com.google.android.gms.location.places.internal.PlaceEntity r11 = r11.b
            java.util.List r11 = r11.n
            r8.addAll(r11)
            int r10 = r10 + 1
            goto L_0x005c
        L_0x00a1:
            java.lang.String r4 = defpackage.rjd.a(r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x00b5
            java.lang.String r9 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY"
            r8.putString(r9, r4)
        L_0x00b5:
            java.lang.String r4 = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            rhj r9 = new rhj
            int r5 = r5.i
            com.google.android.gms.common.data.DataHolder r5 = r7.a(r5, r8)
            r9.<init>(r5, r4, r6)
            goto L_0x00c9
        L_0x00c8:
            r9 = 0
        L_0x00c9:
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "a"
            java.lang.String r6 = "cen"
            if (r9 == 0) goto L_0x0286
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x027a }
            int r8 = r9.a()     // Catch:{ all -> 0x027a }
            r7.<init>(r8)     // Catch:{ all -> 0x027a }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x027a }
        L_0x00de:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x027a }
            if (r10 == 0) goto L_0x0153
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x027a }
            rhi r10 = (defpackage.rhi) r10     // Catch:{ all -> 0x027a }
            if (r10 == 0) goto L_0x013d
            rhq r11 = r10.bb()     // Catch:{ all -> 0x027a }
            if (r11 == 0) goto L_0x0127
            java.lang.String r12 = r11.a()     // Catch:{ all -> 0x027a }
            if (r12 == 0) goto L_0x0127
            java.lang.String r12 = r11.a()     // Catch:{ all -> 0x027a }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x027a }
            if (r12 != 0) goto L_0x0127
            java.lang.String r11 = r11.a()     // Catch:{ all -> 0x027a }
            rhq r12 = r10.bb()     // Catch:{ all -> 0x027a }
            int r15 = r10.s()     // Catch:{ all -> 0x027a }
            float r13 = r10.ba()     // Catch:{ all -> 0x027a }
            double r13 = (double) r13     // Catch:{ all -> 0x027a }
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.List r18 = r10.t()     // Catch:{ all -> 0x027a }
            r19 = r13
            r13 = r16
            r16 = r19
            atts r10 = a(r12, r13, r15, r16, r18)     // Catch:{ all -> 0x027a }
            r7.put(r11, r10)     // Catch:{ all -> 0x027a }
            goto L_0x00de
        L_0x0127:
            jjg r10 = defpackage.bxk.a     // Catch:{ all -> 0x027a }
            anie r10 = r10.c()     // Catch:{ all -> 0x027a }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x027a }
            r12 = 328(0x148, float:4.6E-43)
            anie r10 = r10.a((java.lang.String) r6, (java.lang.String) r5, (int) r12, (java.lang.String) r4)     // Catch:{ all -> 0x027a }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x027a }
            java.lang.String r12 = "[PlacesProducer] unable to find PlaceId for HierarchicalPlaceLikelihood place %s"
            r10.a((java.lang.String) r12, (java.lang.Object) r11)     // Catch:{ all -> 0x027a }
            goto L_0x00de
        L_0x013d:
            jjg r10 = defpackage.bxk.a     // Catch:{ all -> 0x027a }
            anie r10 = r10.c()     // Catch:{ all -> 0x027a }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x027a }
            r11 = 321(0x141, float:4.5E-43)
            anie r10 = r10.a((java.lang.String) r6, (java.lang.String) r5, (int) r11, (java.lang.String) r4)     // Catch:{ all -> 0x027a }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x027a }
            java.lang.String r11 = "[PlacesProducer] hierarchicalPlaceLikelihood is null1"
            r10.a((java.lang.String) r11)     // Catch:{ all -> 0x027a }
            goto L_0x00de
        L_0x0153:
            ria r8 = defpackage.ria.a((android.content.Intent) r23)     // Catch:{ all -> 0x027a }
            r0 = 1
            if (r8 == 0) goto L_0x0215
            java.util.Iterator r10 = r8.iterator()     // Catch:{ all -> 0x0277 }
        L_0x015e:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0277 }
            if (r11 == 0) goto L_0x022b
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0277 }
            rhy r11 = (defpackage.rhy) r11     // Catch:{ all -> 0x0277 }
            if (r11 == 0) goto L_0x01fb
            rhq r12 = r11.bb()     // Catch:{ all -> 0x0277 }
            if (r12 == 0) goto L_0x01e1
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x0277 }
            if (r13 == 0) goto L_0x01de
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x0277 }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x0277 }
            if (r13 != 0) goto L_0x01de
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x0277 }
            java.lang.Object r13 = r7.get(r13)     // Catch:{ all -> 0x0277 }
            atts r13 = (defpackage.atts) r13     // Catch:{ all -> 0x0277 }
            if (r13 == 0) goto L_0x01c4
            java.lang.String r12 = r12.a()     // Catch:{ all -> 0x0277 }
            r14 = 5
            java.lang.Object r14 = r13.c(r14)     // Catch:{ all -> 0x0277 }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ all -> 0x0277 }
            r14.a((defpackage.aucj) r13)     // Catch:{ all -> 0x0277 }
            attr r14 = (defpackage.attr) r14     // Catch:{ all -> 0x0277 }
            float r11 = r11.ba()     // Catch:{ all -> 0x0277 }
            r13 = r4
            double r3 = (double) r11     // Catch:{ all -> 0x0277 }
            boolean r11 = r14.c     // Catch:{ all -> 0x0277 }
            if (r11 != 0) goto L_0x01a9
            goto L_0x01ae
        L_0x01a9:
            r14.c()     // Catch:{ all -> 0x0277 }
            r14.c = r2     // Catch:{ all -> 0x0277 }
        L_0x01ae:
            aucj r11 = r14.b     // Catch:{ all -> 0x0277 }
            atts r11 = (defpackage.atts) r11     // Catch:{ all -> 0x0277 }
            int r15 = r11.a     // Catch:{ all -> 0x0277 }
            r15 = r15 | r0
            r11.a = r15     // Catch:{ all -> 0x0277 }
            r11.b = r3     // Catch:{ all -> 0x0277 }
            aucj r3 = r14.i()     // Catch:{ all -> 0x0277 }
            atts r3 = (defpackage.atts) r3     // Catch:{ all -> 0x0277 }
            r7.put(r12, r3)     // Catch:{ all -> 0x0277 }
            r4 = r13
            goto L_0x015e
        L_0x01c4:
            r13 = r4
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x0277 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            r4 = 367(0x16f, float:5.14E-43)
            r11 = r13
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r4, (java.lang.String) r11)     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = "[PlacesProducer] No hierarchical record found for %s"
            r13 = 0
            r3.a((java.lang.String) r4, (java.lang.Object) r13)     // Catch:{ all -> 0x0277 }
            r4 = r11
            goto L_0x015e
        L_0x01de:
            r11 = r4
            r13 = 0
            goto L_0x01e3
        L_0x01e1:
            r11 = r4
            r13 = 0
        L_0x01e3:
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x0277 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            r4 = 360(0x168, float:5.04E-43)
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r4, (java.lang.String) r11)     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = "[PlacesProducer] unable to find PlaceId for PlaceLikelihood place %s"
            r3.a((java.lang.String) r4, (java.lang.Object) r12)     // Catch:{ all -> 0x0277 }
            r4 = r11
            goto L_0x015e
        L_0x01fb:
            r11 = r4
            r13 = 0
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x0277 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            r4 = 353(0x161, float:4.95E-43)
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r4, (java.lang.String) r11)     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = "[PlacesProducer] placeLikelihood is null1"
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0277 }
            r4 = r11
            goto L_0x015e
        L_0x0215:
            r11 = r4
            jjg r3 = defpackage.bxk.a     // Catch:{ all -> 0x0277 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            r4 = 346(0x15a, float:4.85E-43)
            anie r3 = r3.a((java.lang.String) r6, (java.lang.String) r5, (int) r4, (java.lang.String) r11)     // Catch:{ all -> 0x0277 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = "[PlacesProducer] Unexpected condition: PlaceLikelihoodBuffer.readFromIntent is null."
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0277 }
        L_0x022b:
            java.util.Collection r3 = r7.values()     // Catch:{ all -> 0x0277 }
            attu r4 = defpackage.attu.b     // Catch:{ all -> 0x0277 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0277 }
            attt r4 = (defpackage.attt) r4     // Catch:{ all -> 0x0277 }
            r4.a(r3)     // Catch:{ all -> 0x0277 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0277 }
            aucj r5 = r4.b     // Catch:{ all -> 0x0277 }
            attu r5 = (defpackage.attu) r5     // Catch:{ all -> 0x0277 }
            aucx r5 = r5.a     // Catch:{ all -> 0x0277 }
            int r5 = r5.size()     // Catch:{ all -> 0x0277 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0277 }
            r3[r2] = r5     // Catch:{ all -> 0x0277 }
            jti r2 = new jti     // Catch:{ all -> 0x0277 }
            r3 = 7
            r5 = 18
            r2.<init>(r3, r5, r0)     // Catch:{ all -> 0x0277 }
            auci r3 = defpackage.attu.c     // Catch:{ all -> 0x0277 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0277 }
            attu r4 = (defpackage.attu) r4     // Catch:{ all -> 0x0277 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0277 }
            com.google.android.gms.contextmanager.ContextData r2 = r2.a()     // Catch:{ all -> 0x0277 }
            r1.c(r2)     // Catch:{ all -> 0x0277 }
            r9.c()
            if (r8 == 0) goto L_0x026e
            r8.c()
        L_0x026e:
            int r2 = r1.p
            int r2 = r2 + r0
            r1.p = r2
            r21.j()
            return
        L_0x0277:
            r0 = move-exception
            r3 = r8
            goto L_0x027d
        L_0x027a:
            r0 = move-exception
            r13 = 0
            r3 = r13
        L_0x027d:
            r9.c()
            if (r3 == 0) goto L_0x0285
            r3.c()
        L_0x0285:
            throw r0
        L_0x0286:
            r11 = r4
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 273(0x111, float:3.83E-43)
            anie r0 = r0.a((java.lang.String) r6, (java.lang.String) r5, (int) r2, (java.lang.String) r11)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[PlacesProducer] Received an intent but no PlaceLikelihoodBuffer or NearbyLikelihoodBuffer"
            r0.a((java.lang.String) r2)
        L_0x029c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cen.a(android.content.Context, android.content.Intent):void");
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        if (cas.f()) {
            int a = cas.g().a();
            if (!(a == 2 || a == 3)) {
                if (a == 5) {
                    ((anih) ((anih) bxk.a.b()).a("cen", "a", 229, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer]Unexpected ProductionPolicy");
                    return;
                } else if (a != 6) {
                    if (a != 7) {
                        ((anih) ((anih) bxk.a.c()).a("cen", "a", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer] Not handling onRemovedInterest production policy type=%s", (Object) Integer.toString(cas.g().a()));
                        return;
                    } else if (this.n.remove(cas)) {
                        j();
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (this.k.a(cas)) {
                j();
            }
        }
    }

    public final void a(cas cas, cas cas2) {
        Object[] objArr = {cas, cas2};
        boolean a = this.k.a(cas, cas2);
        if (cas.f()) {
            int a2 = cas.g().a();
            if (a2 == 5) {
                ((anih) ((anih) bxk.a.b()).a("cen", "a", 189, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer]Unexpected ProductionPolicy");
            } else if (a2 != 7) {
                new Object[1][0] = Integer.toString(cas.g().a());
            } else {
                a |= this.n.add(cas);
            }
        }
        if (cas2 != null && cas2.f()) {
            int a3 = cas2.g().a();
            if (a3 == 5) {
                ((anih) ((anih) bxk.a.b()).a("cen", "a", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlacesProducer]Unexpected ProductionPolicy");
            } else if (a3 != 7) {
                new Object[1][0] = Integer.toString(cas2.g().a());
            } else {
                a |= this.n.remove(cas2);
            }
        }
        if (a) {
            j();
        }
    }
}
