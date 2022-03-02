package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrl {
    public final List a;
    public volatile String b;
    final /* synthetic */ ahrs c;
    private final List d;
    private final List e = new ArrayList();
    private Map f = Collections.synchronizedMap(new HashMap());
    private Map g = Collections.synchronizedMap(new HashMap());
    private Map h = Collections.synchronizedMap(new HashMap());

    public ahrl(ahrs ahrs, List list, String str) {
        this.c = ahrs;
        this.a = list;
        this.b = str;
        this.d = ahvx.a();
        for (int i = 0; i < list.size(); i++) {
            this.d.add(ahrm.NOT_READ_YET);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ahvw a(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            ahvw r0 = new ahvw     // Catch:{ all -> 0x007d }
            r0.<init>()     // Catch:{ all -> 0x007d }
            java.util.List r1 = r5.a     // Catch:{ all -> 0x007d }
            int r1 = r1.indexOf(r6)     // Catch:{ all -> 0x007d }
            r2 = 1
            if (r1 < 0) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            java.lang.String r4 = "File not found."
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x007d }
            java.util.List r3 = r5.d     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x007d }
            ahrm r1 = (defpackage.ahrm) r1     // Catch:{ all -> 0x007d }
            ahrm r3 = defpackage.ahrm.NOT_READ_YET     // Catch:{ all -> 0x007d }
            r4 = 0
            if (r1 == r3) goto L_0x0079
            int r1 = r1.ordinal()     // Catch:{ all -> 0x007d }
            if (r1 == r2) goto L_0x0046
            r3 = 2
            if (r1 == r3) goto L_0x0040
            r3 = 3
            if (r1 == r3) goto L_0x003a
            r3 = 4
            if (r1 == r3) goto L_0x0034
            goto L_0x004b
        L_0x0034:
            int r1 = r0.d     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.d = r1     // Catch:{ all -> 0x007d }
            goto L_0x004b
        L_0x003a:
            int r1 = r0.b     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.b = r1     // Catch:{ all -> 0x007d }
            goto L_0x004b
        L_0x0040:
            int r1 = r0.a     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.a = r1     // Catch:{ all -> 0x007d }
            goto L_0x004b
        L_0x0046:
            int r1 = r0.c     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.c = r1     // Catch:{ all -> 0x007d }
        L_0x004b:
            java.util.Map r1 = r5.g     // Catch:{ all -> 0x007d }
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x007d }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x007d }
            if (r6 == 0) goto L_0x007b
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x007d }
        L_0x0059:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x007d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0073
            int r1 = r0.e     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.e = r1     // Catch:{ all -> 0x007d }
            goto L_0x0059
        L_0x0073:
            int r1 = r0.f     // Catch:{ all -> 0x007d }
            int r1 = r1 + r2
            r0.f = r1     // Catch:{ all -> 0x007d }
            goto L_0x0059
        L_0x0079:
            monitor-exit(r5)
            return r4
        L_0x007b:
            monitor-exit(r5)
            return r0
        L_0x007d:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0081
        L_0x0080:
            throw r6
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrl.a(java.lang.String):ahvw");
    }

    public final synchronized ahvw b() {
        ahvw ahvw;
        ahvw = new ahvw();
        List list = this.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                ahvw a2 = a((String) list.get(i));
                if (a2 == null) {
                    ahvw = null;
                    break;
                }
                ahvw.a += a2.a;
                ahvw.b += a2.b;
                ahvw.c += a2.c;
                ahvw.d += a2.d;
                ahvw.e += a2.e;
                ahvw.f += a2.f;
                i++;
            } else {
                break;
            }
        }
        return ahvw;
    }

    public final synchronized String c(int i) {
        String str;
        str = (String) this.h.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(76);
        sb.append("seqNum #");
        sb.append(i);
        sb.append(" not exist. addGLocRequest need to be called before this.");
        amrl.a((Object) str, (Object) sb.toString());
        return str;
    }

    public final synchronized void c(String str) {
        this.b = str;
    }

    public final synchronized String b(String str) {
        String valueOf;
        String valueOf2;
        valueOf = String.valueOf(this.c.c);
        valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f.entrySet()) {
            List list = (List) this.g.get(entry.getKey());
            if (list != null) {
                List list2 = (List) entry.getValue();
                for (int i = 0; i < list2.size(); i++) {
                    if (list.get(i) != null && ((Boolean) list.get(i)).booleanValue()) {
                        arrayList.add((Integer) list2.get(i));
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized boolean b(int i) {
        return this.e.contains(Integer.valueOf(i));
    }

    public final synchronized List a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i) == ahrm.NOT_READ_YET) {
                this.d.set(i, ahrm.READ_FAILURE);
                arrayList.add((String) this.a.get(i));
            }
        }
        return arrayList;
    }

    public final synchronized void a(int i) {
        this.e.add(Integer.valueOf(i));
    }

    public final synchronized void a(int i, boolean z) {
        boolean z2;
        Map map = this.h;
        Integer valueOf = Integer.valueOf(i);
        String str = (String) map.get(valueOf);
        amrl.a((Object) str, (Object) "Need to call corresponding addGLocRequest before calling this.");
        List list = (List) this.f.get(str);
        List list2 = (List) this.g.get(str);
        amrl.a((Object) list, (Object) "Need to call corresponding addGLocRequest before calling this.");
        amrl.a((Object) list2, (Object) "Need to call corresponding addGLocRequest before calling this.");
        boolean z3 = true;
        if (list.size() == list2.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, (Object) "Inconsistent state.");
        int indexOf = list.indexOf(valueOf);
        if (indexOf < 0) {
            z3 = false;
        }
        amrl.b(z3, (Object) "Need to call corresponding addGLocRequest before calling this.");
        list2.set(indexOf, Boolean.valueOf(z));
    }

    public final synchronized void a(String str, int i) {
        if (!this.f.containsKey(str)) {
            this.f.put(str, new ArrayList());
            this.g.put(str, new ArrayList());
        }
        List<Integer> list = (List) this.f.get(str);
        List list2 = (List) this.g.get(str);
        boolean z = false;
        for (Integer intValue : list) {
            if (intValue.intValue() == i) {
                z = true;
            }
        }
        if (!z) {
            list.add(Integer.valueOf(i));
            list2.add((Object) null);
        }
        Map map = this.h;
        Integer valueOf = Integer.valueOf(i);
        amrl.b(!map.containsKey(valueOf), (Object) "Duplicated seqNum (the same seqNum exists in more than one file)!");
        this.h.put(valueOf, str);
    }

    public final synchronized void a(String str, ahrm ahrm) {
        int indexOf = this.a.indexOf(str);
        amrl.b(indexOf >= 0, (Object) String.valueOf(str).concat(" not in upload list."));
        this.d.set(indexOf, ahrm);
    }
}
