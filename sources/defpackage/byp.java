package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: byp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byp {
    public final int a = 0;
    public final cla b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final ikh f;
    public final Runnable g;
    public boolean h = false;
    private Set i;

    private final PendingIntent c(String str) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "c", 401, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not getExistingPendingIntent. pendingIntentKey=%s. Cache is null.", (Object) str);
            return null;
        }
        byl byl = (byl) this.d.get(str);
        if (byl != null) {
            return byl.a;
        }
        List d2 = this.f.d();
        int size = d2.size();
        int i2 = 0;
        while (i2 < size) {
            FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) d2.get(i2);
            i2++;
            if (TextUtils.equals(fencePendingIntentCache$FencePendingIntentItem.a, str)) {
                return fencePendingIntentCache$FencePendingIntentItem.b;
            }
        }
        return null;
    }

    public final void a() {
        jjg jjg = bxk.a;
        ikh ikh = this.f;
        if (ikh == null || ikh.a()) {
            Collection<byl> values = this.c.values();
            aucd o = jyf.c.o();
            if (!jir.a((Collection) values)) {
                for (byl byl : values) {
                    Collection a2 = byl.a();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    jyf jyf = (jyf) o.b;
                    if (!jyf.a.a()) {
                        jyf.a = aucj.a(jyf.a);
                    }
                    auab.a((Iterable) a2, (List) jyf.a);
                    jyh jyh = byl.d;
                    if (jyh != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        jyf jyf2 = (jyf) o.b;
                        jyh.getClass();
                        if (!jyf2.b.a()) {
                            jyf2.b = aucj.a(jyf2.b);
                        }
                        jyf2.b.add(jyh);
                    }
                }
            }
            cbi.q().a(juj.a(7, (jyf) o.i()));
            this.h = false;
            return;
        }
        ((anih) ((anih) bxk.a.c()).a("byp", "a", 320, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]persistState called before cache is initialized.");
        this.h = true;
    }

    public final byl b(String str) {
        PendingIntent pendingIntent;
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "c", 401, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not getExistingPendingIntent. pendingIntentKey=%s. Cache is null.", (Object) str);
            pendingIntent = null;
        } else {
            byl byl = (byl) this.d.get(str);
            if (byl == null) {
                List d2 = this.f.d();
                int size = d2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pendingIntent = null;
                        break;
                    }
                    FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) d2.get(i2);
                    i2++;
                    if (TextUtils.equals(fencePendingIntentCache$FencePendingIntentItem.a, str)) {
                        pendingIntent = fencePendingIntentCache$FencePendingIntentItem.b;
                        break;
                    }
                }
            } else {
                pendingIntent = byl.a;
            }
        }
        if (pendingIntent != null) {
            return new byl(pendingIntent, str);
        }
        ((anih) ((anih) bxk.a.b()).a("byp", "b", 568, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Expected to find a PendingIntent for pendingIntentKey=%s", (Object) str);
        return null;
    }

    public byp(Context context, byo byo, but but) {
        if (byo != null) {
            cla cla = new cla();
            this.b = cla;
            cla.a(byo, but);
        } else {
            this.b = null;
        }
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = ikh.a(context, "com.google.android.contextmanager.service.ContextManagerService", 0, new bym());
        long l = awuz.a.a().l();
        if (l > 0) {
            this.g = new byj(this);
            cbi.k().a(this.g, l, bvq.a("RestartBroadcast"));
            return;
        }
        this.g = null;
    }

    public final Set c() {
        HashSet hashSet;
        String aS = awuz.a.a().aS();
        if (!TextUtils.isEmpty(aS)) {
            hashSet = new HashSet(Arrays.asList(aS.split(",")));
        } else {
            hashSet = new HashSet();
        }
        Set set = this.i;
        if (set != null) {
            hashSet.removeAll(set);
        }
        return hashSet;
    }

    public final String b(PendingIntent pendingIntent) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "b", 375, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not getExistingPendingIntentKey.  pendingIntent=%s. Cache is null.", (Object) pendingIntent);
            return null;
        }
        byl byl = (byl) this.c.get(pendingIntent);
        if (byl != null) {
            return byl.b;
        }
        List d2 = this.f.d();
        int size = d2.size();
        int i2 = 0;
        while (i2 < size) {
            FencePendingIntentCache$FencePendingIntentItem fencePendingIntentCache$FencePendingIntentItem = (FencePendingIntentCache$FencePendingIntentItem) d2.get(i2);
            i2++;
            if (fencePendingIntentCache$FencePendingIntentItem.b.equals(pendingIntent)) {
                return fencePendingIntentCache$FencePendingIntentItem.a;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Collection b() {
        HashSet<String> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        try {
            juj a2 = cbi.q().a((bsz) null, 7);
            if (a2 == null) {
                Set c2 = c();
                boolean B = awuz.B();
                if (B) {
                    hashSet2.removeAll(hashSet);
                    c2.removeAll(hashSet2);
                } else {
                    c2.retainAll(hashSet);
                    for (String str : hashSet) {
                        if (!c2.contains(str)) {
                            ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str);
                        }
                    }
                }
                if (this.g != null && (B || !c2.isEmpty())) {
                    cbi.k().a(this.g);
                }
                if (!c2.isEmpty()) {
                    a(c2);
                }
                return null;
            }
            jyf jyf = (jyf) aucj.a((aucj) jyf.c, a2.c(), aubs.c());
            if (jyf == null) {
                Set c3 = c();
                boolean B2 = awuz.B();
                if (B2) {
                    hashSet2.removeAll(hashSet);
                    c3.removeAll(hashSet2);
                } else {
                    c3.retainAll(hashSet);
                    for (String str2 : hashSet) {
                        if (!c3.contains(str2)) {
                            ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str2);
                        }
                    }
                }
                if (this.g != null && (B2 || !c3.isEmpty())) {
                    cbi.k().a(this.g);
                }
                if (!c3.isEmpty()) {
                    a(c3);
                }
                return null;
            }
            if (jyf.a.isEmpty()) {
                if (jyf.b.isEmpty()) {
                    Set c4 = c();
                    boolean B3 = awuz.B();
                    if (B3) {
                        hashSet2.removeAll(hashSet);
                        c4.removeAll(hashSet2);
                    } else {
                        c4.retainAll(hashSet);
                        for (String str3 : hashSet) {
                            if (!c4.contains(str3)) {
                                ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str3);
                            }
                        }
                    }
                    if (this.g != null && (B3 || !c4.isEmpty())) {
                        cbi.k().a(this.g);
                    }
                    if (!c4.isEmpty()) {
                        a(c4);
                    }
                    return null;
                }
            }
            HashMap hashMap = new HashMap();
            for (jyg jyg : jyf.a) {
                byl byl = (byl) hashMap.get(jyg.b);
                if (byl == null) {
                    byl = b(jyg.b);
                    if (byl != null) {
                        hashMap.put(jyg.b, byl);
                    } else {
                        hashSet.add(jyg.c);
                    }
                }
                byl.a(bzm.a(jyg.c, jyg.d, jyg.e, jyg.f), jyg);
                hashSet2.add(jyg.c);
            }
            for (jyh jyh : jyf.b) {
                byl byl2 = (byl) hashMap.get(jyh.b);
                if (byl2 == null) {
                    byl2 = b(jyh.b);
                    if (byl2 != null) {
                        hashMap.put(jyh.b, byl2);
                    } else {
                        hashSet.add(jyh.c);
                    }
                }
                byl2.d = jyh;
            }
            Collection values = hashMap.values();
            Set c5 = c();
            boolean B4 = awuz.B();
            if (B4) {
                hashSet2.removeAll(hashSet);
                c5.removeAll(hashSet2);
            } else {
                c5.retainAll(hashSet);
                for (String str4 : hashSet) {
                    if (!c5.contains(str4)) {
                        ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str4);
                    }
                }
            }
            if (this.g != null && (B4 || !c5.isEmpty())) {
                cbi.k().a(this.g);
            }
            if (!c5.isEmpty()) {
                a(c5);
            }
            return values;
        } catch (auda e2) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("byp", "b", 440, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not deserialize proto.");
            Set c6 = c();
            boolean B5 = awuz.B();
            if (B5) {
                hashSet2.removeAll(hashSet);
                c6.removeAll(hashSet2);
            } else {
                c6.retainAll(hashSet);
                for (String str5 : hashSet) {
                    if (!c6.contains(str5)) {
                        ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str5);
                    }
                }
            }
            if (this.g != null && (B5 || !c6.isEmpty())) {
                cbi.k().a(this.g);
            }
            if (!c6.isEmpty()) {
                a(c6);
            }
            return null;
        } catch (Throwable th) {
            Set c7 = c();
            boolean B6 = awuz.B();
            if (B6) {
                hashSet2.removeAll(hashSet);
                c7.removeAll(hashSet2);
            } else {
                c7.retainAll(hashSet);
                for (String str6 : hashSet) {
                    if (!c7.contains(str6)) {
                        ((anih) ((anih) bxk.a.d()).a("byp", "b", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]%s not whitelisted", (Object) str6);
                    }
                }
            }
            if (this.g != null && (B6 || !c7.isEmpty())) {
                cbi.k().a(this.g);
            }
            if (!c7.isEmpty()) {
                a(c7);
            }
            throw th;
        }
    }

    public final void a(PendingIntent pendingIntent) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "a", 289, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not removeListener pendingIntent=%s. Cache is null.", (Object) pendingIntent);
            return;
        }
        byl byl = (byl) this.c.get(pendingIntent);
        if (byl != null && byl.d != null) {
            byl.d = null;
            if (byl.c()) {
                this.c.remove(byl.a);
                this.d.remove(byl.b);
                this.f.b((Parcelable) new FencePendingIntentCache$FencePendingIntentItem(byl.b, byl.a));
                jjg jjg = bxk.a;
            }
        }
    }

    public final void a(PendingIntent pendingIntent, bzm bzm, boolean z) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "a", 152, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not add registration=%s. Cache is null.", (Object) bzm);
            return;
        }
        String b2 = b(pendingIntent);
        if (b2 == null) {
            b2 = UUID.randomUUID().toString();
            this.f.a((Parcelable) new FencePendingIntentCache$FencePendingIntentItem(b2, pendingIntent));
            jjg jjg = bxk.a;
        }
        byl byl = (byl) this.c.get(pendingIntent);
        if (byl == null) {
            byl = new byl(pendingIntent, b2);
            this.c.put(pendingIntent, byl);
            this.d.put(b2, byl);
        }
        this.e.put(bzm.e, byl);
        aucd o = jyg.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        jyg jyg = (jyg) o.b;
        b2.getClass();
        int i2 = jyg.a | 1;
        jyg.a = i2;
        jyg.b = b2;
        String str = bzm.f;
        str.getClass();
        int i3 = i2 | 2;
        jyg.a = i3;
        jyg.c = str;
        String str2 = bzm.g;
        str2.getClass();
        int i4 = i3 | 4;
        jyg.a = i4;
        jyg.d = str2;
        String str3 = bzm.h;
        str3.getClass();
        int i5 = i4 | 8;
        jyg.a = i5;
        jyg.e = str3;
        String str4 = bzm.a;
        str4.getClass();
        int i6 = i5 | 16;
        jyg.a = i6;
        jyg.f = str4;
        atjt atjt = (atjt) bzm.b.c;
        atjt.getClass();
        jyg.g = atjt;
        int i7 = i6 | 32;
        jyg.a = i7;
        long j = bzm.c;
        int i8 = i7 | 64;
        jyg.a = i8;
        jyg.h = j;
        jyg.a = i8 | 128;
        jyg.i = z;
        byl.a(bzm.e, (jyg) o.i());
        jjg jjg2 = bxk.a;
    }

    public final void a(PendingIntent pendingIntent, ContextManagerClientInfo contextManagerClientInfo, jtp jtp) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "a", 199, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not add data filter=%s. Cache is null.", (Object) jtp);
            return;
        }
        String b2 = b(pendingIntent);
        if (b2 == null) {
            b2 = UUID.randomUUID().toString();
            this.f.a((Parcelable) new FencePendingIntentCache$FencePendingIntentItem(b2, pendingIntent));
            jjg jjg = bxk.a;
        }
        byl byl = (byl) this.c.get(pendingIntent);
        if (byl == null) {
            byl = new byl(pendingIntent, b2);
            this.c.put(pendingIntent, byl);
            this.d.put(b2, byl);
        }
        aucd o = jyh.h.o();
        if (b2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyh jyh = (jyh) o.b;
            b2.getClass();
            jyh.a |= 1;
            jyh.b = b2;
        }
        String str = contextManagerClientInfo.b;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyh jyh2 = (jyh) o.b;
            str.getClass();
            jyh2.a |= 2;
            jyh2.c = str;
        }
        String str2 = contextManagerClientInfo.a;
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyh jyh3 = (jyh) o.b;
            str2.getClass();
            jyh3.a |= 4;
            jyh3.d = str2;
        }
        String str3 = contextManagerClientInfo.d;
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyh jyh4 = (jyh) o.b;
            str3.getClass();
            jyh4.a |= 8;
            jyh4.e = str3;
        }
        if (jtp != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            jyh jyh5 = (jyh) o.b;
            jtp.getClass();
            jyh5.f = jtp;
            jyh5.a |= 16;
        }
        byl.d = (jyh) o.i();
        jjg jjg2 = bxk.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0270, code lost:
        if (r0.isEmpty() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e6, code lost:
        if (r0.isEmpty() != false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r0.isEmpty() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0121, code lost:
        if (r0.isEmpty() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018e, code lost:
        if (r0.isEmpty() == false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "[FencePendingIntentCache]%s not whitelisted"
            jjg r0 = defpackage.bxk.a
            ikh r0 = r1.f
            r0.a()
            ikh r0 = r1.f
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "byp"
            if (r0 != 0) goto L_0x002b
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r2 = 122(0x7a, float:1.71E-43)
            java.lang.String r5 = "a"
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r5, (int) r2, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "[FencePendingIntentCache]Could not initialize.  Cache is null."
            r0.a((java.lang.String) r2)
            return
        L_0x002b:
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0370
            int r0 = defpackage.ikh.b((android.content.Intent) r17)
            if (r0 != 0) goto L_0x0370
            ikh r0 = r1.f
            r5 = r17
            r0.c((android.content.Intent) r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.lang.String r7 = "b"
            r8 = 500(0x1f4, float:7.0E-43)
            cjo r0 = defpackage.cbi.q()     // Catch:{ all -> 0x030d }
            r9 = 7
            r10 = 0
            juj r0 = r0.a((defpackage.bsz) r10, (int) r9)     // Catch:{ all -> 0x030d }
            if (r0 != 0) goto L_0x00b8
            java.util.Set r0 = r16.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x0069
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x0094
        L_0x0069:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0070:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x0070
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x0070
        L_0x0094:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x0099
            goto L_0x00ab
        L_0x0099:
            if (r9 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00ab
        L_0x00a2:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x00ab:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00b6
        L_0x00b1:
            r1.a((java.util.Set) r0)
            goto L_0x02ea
        L_0x00b6:
            goto L_0x02ea
        L_0x00b8:
            byte[] r0 = r0.c()     // Catch:{ auda -> 0x0274 }
            aubs r9 = defpackage.aubs.c()     // Catch:{ auda -> 0x0274 }
            jyf r11 = defpackage.jyf.c     // Catch:{ auda -> 0x0274 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r11, (byte[]) r0, (defpackage.aubs) r9)     // Catch:{ auda -> 0x0274 }
            jyf r0 = (defpackage.jyf) r0     // Catch:{ auda -> 0x0274 }
            if (r0 != 0) goto L_0x0126
            java.util.Set r0 = r16.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x00db
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x0106
        L_0x00db:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00e2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x00e2
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x00e2
        L_0x0106:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x010b
            goto L_0x011d
        L_0x010b:
            if (r9 == 0) goto L_0x010e
            goto L_0x0114
        L_0x010e:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x011d
        L_0x0114:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x011d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0124
            goto L_0x00b1
        L_0x0124:
            goto L_0x02ea
        L_0x0126:
            aucx r9 = r0.a     // Catch:{ all -> 0x030d }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x030d }
            if (r9 != 0) goto L_0x012f
            goto L_0x0192
        L_0x012f:
            aucx r9 = r0.b     // Catch:{ all -> 0x030d }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x030d }
            if (r9 == 0) goto L_0x0192
            java.util.Set r0 = r16.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x0148
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x0173
        L_0x0148:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x014f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0173
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x014f
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x014f
        L_0x0173:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x0178
            goto L_0x018a
        L_0x0178:
            if (r9 == 0) goto L_0x017b
            goto L_0x0181
        L_0x017b:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x018a
        L_0x0181:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x018a:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0124
            goto L_0x00b1
        L_0x0192:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x030d }
            r9.<init>()     // Catch:{ all -> 0x030d }
            aucx r10 = r0.a     // Catch:{ all -> 0x030d }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x030d }
        L_0x019d:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x030d }
            if (r11 == 0) goto L_0x01e0
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x030d }
            jyg r11 = (defpackage.jyg) r11     // Catch:{ all -> 0x030d }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x030d }
            java.lang.Object r12 = r9.get(r12)     // Catch:{ all -> 0x030d }
            byl r12 = (defpackage.byl) r12     // Catch:{ all -> 0x030d }
            if (r12 == 0) goto L_0x01b4
            goto L_0x01c1
        L_0x01b4:
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x030d }
            byl r12 = r1.b((java.lang.String) r12)     // Catch:{ all -> 0x030d }
            if (r12 == 0) goto L_0x01d8
            java.lang.String r13 = r11.b     // Catch:{ all -> 0x030d }
            r9.put(r13, r12)     // Catch:{ all -> 0x030d }
        L_0x01c1:
            java.lang.String r13 = r11.c     // Catch:{ all -> 0x030d }
            java.lang.String r14 = r11.d     // Catch:{ all -> 0x030d }
            java.lang.String r15 = r11.e     // Catch:{ all -> 0x030d }
            java.lang.String r8 = r11.f     // Catch:{ all -> 0x030d }
            java.lang.String r8 = defpackage.bzm.a(r13, r14, r15, r8)     // Catch:{ all -> 0x030d }
            r12.a(r8, r11)     // Catch:{ all -> 0x030d }
            java.lang.String r8 = r11.c     // Catch:{ all -> 0x030d }
            r6.add(r8)     // Catch:{ all -> 0x030d }
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x019d
        L_0x01d8:
            java.lang.String r8 = r11.c     // Catch:{ all -> 0x030d }
            r5.add(r8)     // Catch:{ all -> 0x030d }
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x019d
        L_0x01e0:
            aucx r0 = r0.b     // Catch:{ all -> 0x030d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030d }
        L_0x01e6:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x030d }
            if (r8 == 0) goto L_0x0213
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x030d }
            jyh r8 = (defpackage.jyh) r8     // Catch:{ all -> 0x030d }
            java.lang.String r10 = r8.b     // Catch:{ all -> 0x030d }
            java.lang.Object r10 = r9.get(r10)     // Catch:{ all -> 0x030d }
            byl r10 = (defpackage.byl) r10     // Catch:{ all -> 0x030d }
            if (r10 != 0) goto L_0x0210
            java.lang.String r10 = r8.b     // Catch:{ all -> 0x030d }
            byl r10 = r1.b((java.lang.String) r10)     // Catch:{ all -> 0x030d }
            if (r10 == 0) goto L_0x020a
            java.lang.String r11 = r8.b     // Catch:{ all -> 0x030d }
            r9.put(r11, r10)     // Catch:{ all -> 0x030d }
            goto L_0x0210
        L_0x020a:
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x030d }
            r5.add(r8)     // Catch:{ all -> 0x030d }
            goto L_0x01e6
        L_0x0210:
            r10.d = r8     // Catch:{ all -> 0x030d }
            goto L_0x01e6
        L_0x0213:
            java.util.Collection r10 = r9.values()     // Catch:{ all -> 0x030d }
            java.util.Set r0 = r16.c()
            boolean r8 = defpackage.awuz.B()
            if (r8 == 0) goto L_0x0228
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x0255
        L_0x0228:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x022f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0255
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = r0.contains(r6)
            if (r9 != 0) goto L_0x022f
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r11 = 500(0x1f4, float:7.0E-43)
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x022f
        L_0x0255:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x025a
            goto L_0x026c
        L_0x025a:
            if (r8 == 0) goto L_0x025d
            goto L_0x0263
        L_0x025d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x026c
        L_0x0263:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x026c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x02ea
            goto L_0x00b1
        L_0x0274:
            r0 = move-exception
            jjg r8 = defpackage.bxk.a     // Catch:{ all -> 0x030d }
            anie r8 = r8.b()     // Catch:{ all -> 0x030d }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x030d }
            r8.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x030d }
            r0 = 440(0x1b8, float:6.17E-43)
            anie r0 = r8.a((java.lang.String) r4, (java.lang.String) r7, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x030d }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x030d }
            java.lang.String r8 = "[FencePendingIntentCache]Could not deserialize proto."
            r0.a((java.lang.String) r8)     // Catch:{ all -> 0x030d }
            java.util.Set r0 = r16.c()
            boolean r8 = defpackage.awuz.B()
            if (r8 == 0) goto L_0x029e
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x02cb
        L_0x029e:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x02a5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = r0.contains(r6)
            if (r9 != 0) goto L_0x02a5
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r11 = 500(0x1f4, float:7.0E-43)
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x02a5
        L_0x02cb:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x02d0
            goto L_0x02e2
        L_0x02d0:
            if (r8 == 0) goto L_0x02d3
            goto L_0x02d9
        L_0x02d3:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x02e2
        L_0x02d9:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x02e2:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0124
            goto L_0x00b1
        L_0x02ea:
            cla r0 = r1.b
            if (r0 == 0) goto L_0x02f6
            byn r2 = new byn
            r2.<init>(r10)
            r0.a((defpackage.cky) r2)
        L_0x02f6:
            boolean r0 = r1.h
            if (r0 == 0) goto L_0x0370
            bwn r0 = defpackage.cbi.k()
            byk r2 = new byk
            r2.<init>(r1)
            java.lang.String r3 = "delayedPersistCacheState"
            bvp r3 = defpackage.bvq.a(r3)
            r0.a(r2, r3)
            return
        L_0x030d:
            r0 = move-exception
            java.util.Set r8 = r16.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x031f
            r6.removeAll(r5)
            r8.removeAll(r6)
            goto L_0x034f
        L_0x031f:
            r8.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0326:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x034f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r10 = r8.contains(r6)
            if (r10 != 0) goto L_0x034c
            jjg r10 = defpackage.bxk.a
            anie r10 = r10.d()
            anih r10 = (defpackage.anih) r10
            r11 = 500(0x1f4, float:7.0E-43)
            anie r10 = r10.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r10 = (defpackage.anih) r10
            r10.a((java.lang.String) r2, (java.lang.Object) r6)
            goto L_0x0326
        L_0x034c:
            r11 = 500(0x1f4, float:7.0E-43)
            goto L_0x0326
        L_0x034f:
            java.lang.Runnable r2 = r1.g
            if (r2 != 0) goto L_0x0354
            goto L_0x0366
        L_0x0354:
            if (r9 == 0) goto L_0x0357
            goto L_0x035d
        L_0x0357:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0366
        L_0x035d:
            bwn r2 = defpackage.cbi.k()
            java.lang.Runnable r3 = r1.g
            r2.a((java.lang.Runnable) r3)
        L_0x0366:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x036f
            r1.a((java.util.Set) r8)
        L_0x036f:
            throw r0
        L_0x0370:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byp.a(android.content.Intent):void");
    }

    public final void a(String str) {
        if (this.f == null) {
            ((anih) ((anih) bxk.a.b()).a("byp", "a", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Could not remove fenceKey=%s. Cache is null.", (Object) str);
            return;
        }
        byl byl = (byl) this.e.remove(str);
        if (byl != null) {
            byl.c.remove(str);
            if (byl.c()) {
                this.c.remove(byl.a);
                this.d.remove(byl.b);
                this.f.b((Parcelable) new FencePendingIntentCache$FencePendingIntentItem(byl.b, byl.a));
                jjg jjg = bxk.a;
            }
        }
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            cbi.f().sendBroadcast(new Intent("com.google.com.android.gms.contextmanager.CONTEXT_MANAGER_RESTARTED").setPackage(str).setFlags(268435456));
            cbi.C().c(bvq.a("ContextManagerRestartedBroadcast"));
            ((anih) ((anih) bxk.a.c()).a("byp", "a", 546, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FencePendingIntentCache]Sending CONTEXT_MANAGER_RESTARTED broadcast to %s", (Object) str);
        }
        if (this.g != null) {
            Set set2 = this.i;
            if (set2 != null) {
                set2.addAll(set);
            } else {
                this.i = set;
            }
        }
    }
}
