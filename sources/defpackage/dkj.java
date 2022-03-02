package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dkj {
    final Map a;
    final List b;
    final List c;
    private final Map d;

    protected dkj() {
        this.d = new HashMap();
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    private final void b(String str, String str2) {
        if (str2 != null) {
            this.d.put(str, str2);
        }
    }

    public final Map a() {
        HashMap hashMap = new HashMap(this.d);
        List list = this.b;
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            dlr dlr = (dlr) list.get(i2);
            dkg.a("&promo", i);
            hashMap.putAll(dlr.a());
            i++;
        }
        List list2 = this.c;
        int size2 = list2.size();
        int i3 = 1;
        for (int i4 = 0; i4 < size2; i4++) {
            dlq dlq = (dlq) list2.get(i4);
            dkg.a("&pr", i3);
            hashMap.putAll(dlq.a());
            i3++;
        }
        int i5 = 1;
        for (Map.Entry entry : this.a.entrySet()) {
            String a2 = dkg.a("&il", i5);
            int i6 = 1;
            for (dlq dlq2 : (List) entry.getValue()) {
                String valueOf = String.valueOf(a2);
                String valueOf2 = String.valueOf(dkg.a(i6));
                if (valueOf2.length() == 0) {
                    new String(valueOf);
                } else {
                    valueOf.concat(valueOf2);
                }
                hashMap.putAll(dlq.a());
                i6++;
            }
            if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                hashMap.put(String.valueOf(a2).concat("nm"), (String) entry.getKey());
            }
            i5++;
        }
        return hashMap;
    }

    public void c(String str) {
        a("&ec", str);
    }

    public void d(String str) {
        a("&el", str);
    }

    public void b(String str) {
        a("&ea", str);
    }

    public dkj(byte[] bArr) {
        this();
        a("&t", "event");
    }

    public void a(int i, String str) {
        a(dkg.a("&cd", i), str);
    }

    public void a(long j) {
        a("&ev", Long.toString(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            java.lang.String r3 = "gmob_t"
            java.lang.String r4 = "aclid"
            java.lang.String r5 = "dclid"
            java.lang.String r6 = "gclid"
            java.lang.String r7 = "anid"
            java.lang.String r8 = "utm_id"
            java.lang.String r9 = "utm_term"
            java.lang.String r10 = "utm_source"
            java.lang.String r11 = "utm_campaign"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "utm_content"
            if (r2 != 0) goto L_0x00cd
            java.lang.String r2 = "?"
            boolean r2 = r0.contains(r2)
            r15 = 1
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "[\\?]"
            java.lang.String[] r2 = r0.split(r2)
            int r14 = r2.length
            if (r14 <= r15) goto L_0x0034
            r0 = r2[r15]
        L_0x0034:
            java.lang.String r2 = "%3D"
            boolean r2 = r0.contains(r2)
            java.lang.String r14 = "="
            if (r2 != 0) goto L_0x004d
            boolean r2 = r0.contains(r14)
            if (r2 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            r17 = r3
            r18 = r4
            r14 = 0
            goto L_0x00d2
        L_0x004d:
            java.lang.String r2 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x00cc }
        L_0x0053:
            java.util.Map r0 = defpackage.dpx.a((java.lang.String) r0)
            r2 = 11
            java.lang.String[] r15 = new java.lang.String[r2]
            r16 = 0
            r15[r16] = r5
            r17 = 1
            r15[r17] = r10
            r17 = 2
            r15[r17] = r6
            r17 = 3
            r15[r17] = r4
            r17 = 4
            r15[r17] = r11
            r17 = 5
            r15[r17] = r12
            r17 = 6
            r15[r17] = r9
            r17 = 7
            r15[r17] = r13
            r17 = 8
            r15[r17] = r8
            r17 = 9
            r15[r17] = r7
            r17 = 10
            r15[r17] = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r17 = r3
            r3 = 0
        L_0x008f:
            r18 = r4
            r4 = 11
            if (r3 >= r4) goto L_0x00c7
            r4 = r15[r3]
            java.lang.Object r4 = r0.get(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00a4
            goto L_0x00c2
        L_0x00a4:
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x00af
            java.lang.String r4 = "&"
            r2.append(r4)
        L_0x00af:
            r4 = r15[r3]
            r2.append(r4)
            r2.append(r14)
            r4 = r15[r3]
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
        L_0x00c2:
            int r3 = r3 + 1
            r4 = r18
            goto L_0x008f
        L_0x00c7:
            java.lang.String r14 = r2.toString()
            goto L_0x00d2
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            r17 = r3
            r18 = r4
            r14 = 0
        L_0x00d2:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0159
            java.util.Map r0 = defpackage.dpx.a((java.lang.String) r14)
            java.lang.Object r2 = r0.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&cc"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r12)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&cm"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&cn"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&cs"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&ck"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&ci"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&anid"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&gclid"
            r1.b(r3, r2)
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&dclid"
            r1.b(r3, r2)
            r2 = r18
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "&aclid"
            r1.b(r3, r2)
            r2 = r17
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "&gmob_t"
            r1.b(r2, r0)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkj.a(java.lang.String):void");
    }

    public final void a(String str, String str2) {
        if (str != null) {
            this.d.put(str, str2);
        } else {
            dph.a("HitBuilder.set() called with a null paramName.");
        }
    }
}
