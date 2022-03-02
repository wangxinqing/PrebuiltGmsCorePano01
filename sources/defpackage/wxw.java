package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxw extends wlp implements wwr {
    public final wvy a;
    public final Set b = new HashSet();
    public xbi c;
    public Status m;
    public boolean n = false;
    public Bundle o;
    public boolean p = false;
    private final WeakReference q;
    private Context r;
    private Status s;
    private wvz[] t;
    private idg u;
    private final wxk v;

    public wxw(icc icc, wvy wvy, wxk wxk) {
        super(icc);
        this.q = new WeakReference(icc);
        this.a = wvy;
        this.v = wxk;
        this.u = this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.plus.service.v2whitelisted.models.Person$Images} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: com.google.android.gms.plus.service.v2whitelisted.models.Person$Names} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] f() {
        /*
            r19 = this;
            r1 = r19
            idg r0 = r1.u
            if (r0 == 0) goto L_0x0242
            wvy r0 = r1.a
            boolean r3 = r0.d
            r4 = 100
            if (r3 == 0) goto L_0x0019
            com.google.android.gms.common.api.Status r3 = r1.s
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r4)
            r3 = r0
            goto L_0x0032
        L_0x0019:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0025
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            r3 = r0
            goto L_0x0032
        L_0x0025:
            boolean r0 = r1.n
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r4)
            goto L_0x0031
        L_0x002f:
            com.google.android.gms.common.api.Status r0 = r1.m
        L_0x0031:
            r3 = r0
        L_0x0032:
            int r0 = r3.i
            r6 = 0
            if (r0 == r4) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            idg r7 = r1.u
            java.lang.ref.WeakReference r0 = r1.q
            java.lang.Object r0 = r0.get()
            icc r0 = (defpackage.icc) r0
            if (r4 == 0) goto L_0x0048
            r8 = 0
            goto L_0x005d
        L_0x0048:
            if (r0 == 0) goto L_0x005c
            wxr r8 = new wxr
            ibq r9 = defpackage.wlt.a
            r8.<init>(r9, r0)
            boolean r9 = r0.i()
            if (r9 == 0) goto L_0x005b
            r0.b((defpackage.idf) r8)
            goto L_0x005d
        L_0x005b:
            goto L_0x005d
        L_0x005c:
            r8 = 0
        L_0x005d:
            r1.u = r8
            wxk r0 = r1.v
            android.os.Bundle r9 = r1.o
            wwk r9 = defpackage.wwk.a(r9)
            wvz[] r10 = r1.t
            if (r9 == 0) goto L_0x01f2
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            byte[] r12 = r9.a
            if (r12 == 0) goto L_0x01ef
            wyh r12 = new wyh     // Catch:{ jaq -> 0x01e4 }
            r12.<init>()     // Catch:{ jaq -> 0x01e4 }
            byte[] r9 = r9.a     // Catch:{ jaq -> 0x01e4 }
            r12.b((byte[]) r9)     // Catch:{ jaq -> 0x01e4 }
            java.util.List r9 = r12.b     // Catch:{ jaq -> 0x01e4 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ jaq -> 0x01e4 }
        L_0x0084:
            boolean r12 = r9.hasNext()     // Catch:{ jaq -> 0x01e4 }
            if (r12 == 0) goto L_0x01e1
            java.lang.Object r12 = r9.next()     // Catch:{ jaq -> 0x01e4 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person r12 = (com.google.android.gms.plus.service.v2whitelisted.models.Person) r12     // Catch:{ jaq -> 0x01e4 }
            java.util.List r13 = r12.y     // Catch:{ jaq -> 0x01e4 }
            if (r13 == 0) goto L_0x00bc
            boolean r14 = r13.isEmpty()     // Catch:{ jaq -> 0x01e4 }
            if (r14 != 0) goto L_0x00bc
            java.util.Iterator r14 = r13.iterator()     // Catch:{ jaq -> 0x01e4 }
        L_0x009e:
            boolean r15 = r14.hasNext()     // Catch:{ jaq -> 0x01e4 }
            if (r15 == 0) goto L_0x00b3
            java.lang.Object r15 = r14.next()     // Catch:{ jaq -> 0x01e4 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Names r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Names) r15     // Catch:{ jaq -> 0x01e4 }
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r2 = r15.h     // Catch:{ jaq -> 0x01e4 }
            if (r2 == 0) goto L_0x009e
            boolean r2 = r2.j     // Catch:{ jaq -> 0x01e4 }
            if (r2 == 0) goto L_0x009e
            goto L_0x00bd
        L_0x00b3:
            java.lang.Object r2 = r13.get(r6)     // Catch:{ jaq -> 0x01e4 }
            r15 = r2
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Names r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Names) r15     // Catch:{ jaq -> 0x01e4 }
            goto L_0x00bd
        L_0x00bc:
            r15 = 0
        L_0x00bd:
            if (r15 == 0) goto L_0x00c2
            java.lang.String r2 = r15.b     // Catch:{ jaq -> 0x01e4 }
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            java.util.List r13 = r12.q     // Catch:{ jaq -> 0x01e4 }
            if (r13 == 0) goto L_0x00ef
            boolean r14 = r13.isEmpty()     // Catch:{ jaq -> 0x01e4 }
            if (r14 != 0) goto L_0x00ef
            java.util.Iterator r14 = r13.iterator()     // Catch:{ jaq -> 0x01e4 }
        L_0x00d1:
            boolean r15 = r14.hasNext()     // Catch:{ jaq -> 0x01e4 }
            if (r15 == 0) goto L_0x00e6
            java.lang.Object r15 = r14.next()     // Catch:{ jaq -> 0x01e4 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Images r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Images) r15     // Catch:{ jaq -> 0x01e4 }
            com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata r5 = r15.c     // Catch:{ jaq -> 0x01e4 }
            if (r5 == 0) goto L_0x00d1
            boolean r5 = r5.j     // Catch:{ jaq -> 0x01e4 }
            if (r5 == 0) goto L_0x00d1
            goto L_0x00f0
        L_0x00e6:
            java.lang.Object r5 = r13.get(r6)     // Catch:{ jaq -> 0x01e4 }
            r15 = r5
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Images r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Images) r15     // Catch:{ jaq -> 0x01e4 }
            goto L_0x00f0
        L_0x00ef:
            r15 = 0
        L_0x00f0:
            if (r15 == 0) goto L_0x0103
            java.lang.String r5 = r15.e     // Catch:{ jaq -> 0x01e4 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ jaq -> 0x01e4 }
            if (r5 != 0) goto L_0x0103
            com.google.android.gms.people.model.AvatarReference r5 = new com.google.android.gms.people.model.AvatarReference     // Catch:{ jaq -> 0x01e4 }
            java.lang.String r13 = r15.e     // Catch:{ jaq -> 0x01e4 }
            r14 = 1
            r5.<init>(r14, r13)     // Catch:{ jaq -> 0x01e4 }
            goto L_0x0104
        L_0x0103:
            r5 = 0
        L_0x0104:
            java.lang.String r13 = r12.p     // Catch:{ jaq -> 0x01e4 }
            java.lang.String r13 = defpackage.ycm.f(r13)     // Catch:{ jaq -> 0x01e4 }
            java.lang.String r14 = r12.p     // Catch:{ jaq -> 0x01e4 }
            if (r14 == 0) goto L_0x0117
            int r15 = r14.length()     // Catch:{ jaq -> 0x01e4 }
            r6 = 21
            if (r15 != r6) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r14 = 0
        L_0x0118:
            if (r14 != 0) goto L_0x011d
            r17 = r9
            goto L_0x013f
        L_0x011d:
            r6 = 0
        L_0x011e:
            int r15 = r14.length()     // Catch:{ jaq -> 0x01e4 }
            if (r6 >= r15) goto L_0x013d
            char r15 = r14.charAt(r6)     // Catch:{ jaq -> 0x01e4 }
            r17 = r9
            r9 = 48
            if (r15 < r9) goto L_0x013b
            char r9 = r14.charAt(r6)     // Catch:{ jaq -> 0x01e4 }
            r15 = 57
            if (r9 > r15) goto L_0x013b
            int r6 = r6 + 1
            r9 = r17
            goto L_0x011e
        L_0x013b:
            r14 = 0
            goto L_0x013f
        L_0x013d:
            r17 = r9
        L_0x013f:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ jaq -> 0x01e4 }
            r6.<init>()     // Catch:{ jaq -> 0x01e4 }
            if (r14 == 0) goto L_0x0150
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r9 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod     // Catch:{ jaq -> 0x01e4 }
            r15 = 0
            r9.<init>(r15, r14)     // Catch:{ jaq -> 0x01e4 }
            r6.add(r9)     // Catch:{ jaq -> 0x01e4 }
            goto L_0x0151
        L_0x0150:
            r15 = 0
        L_0x0151:
            java.util.List r9 = r12.j     // Catch:{ jaq -> 0x01e4 }
            if (r9 == 0) goto L_0x018c
            java.util.Iterator r9 = r9.iterator()     // Catch:{ jaq -> 0x01e4 }
        L_0x0159:
            boolean r16 = r9.hasNext()     // Catch:{ jaq -> 0x01e4 }
            if (r16 == 0) goto L_0x0188
            java.lang.Object r16 = r9.next()     // Catch:{ jaq -> 0x01e4 }
            r15 = r16
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Emails r15 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.Emails) r15     // Catch:{ jaq -> 0x01e4 }
            r16 = r9
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r9 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod     // Catch:{ jaq -> 0x01e4 }
            java.lang.String r15 = r15.f     // Catch:{ jaq -> 0x01e4 }
            r18 = r7
            r7 = 1
            r9.<init>(r7, r15)     // Catch:{ jaq -> 0x01df }
            boolean r15 = r6.contains(r9)     // Catch:{ jaq -> 0x01df }
            if (r15 != 0) goto L_0x0182
            r6.add(r9)     // Catch:{ jaq -> 0x01df }
            r9 = r16
            r7 = r18
            r15 = 0
            goto L_0x0159
        L_0x0182:
            r9 = r16
            r7 = r18
            r15 = 0
            goto L_0x0159
        L_0x0188:
            r18 = r7
            r7 = 1
            goto L_0x018f
        L_0x018c:
            r18 = r7
            r7 = 1
        L_0x018f:
            java.util.List r9 = r12.D     // Catch:{ jaq -> 0x01df }
            if (r9 != 0) goto L_0x0194
            goto L_0x01b9
        L_0x0194:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ jaq -> 0x01df }
        L_0x0198:
            boolean r12 = r9.hasNext()     // Catch:{ jaq -> 0x01df }
            if (r12 == 0) goto L_0x01b9
            java.lang.Object r12 = r9.next()     // Catch:{ jaq -> 0x01df }
            com.google.android.gms.plus.service.v2whitelisted.models.Person$PhoneNumbers r12 = (com.google.android.gms.plus.service.v2whitelisted.models.Person.PhoneNumbers) r12     // Catch:{ jaq -> 0x01df }
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r15 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod     // Catch:{ jaq -> 0x01df }
            java.lang.String r12 = r12.f     // Catch:{ jaq -> 0x01df }
            r7 = 2
            r15.<init>(r7, r12)     // Catch:{ jaq -> 0x01df }
            boolean r7 = r6.contains(r15)     // Catch:{ jaq -> 0x01df }
            if (r7 != 0) goto L_0x01b7
            r6.add(r15)     // Catch:{ jaq -> 0x01df }
            r7 = 1
            goto L_0x0198
        L_0x01b7:
            r7 = 1
            goto L_0x0198
        L_0x01b9:
            dzb r7 = r0.a     // Catch:{ jaq -> 0x01df }
            r7.a(r6)     // Catch:{ jaq -> 0x01df }
            int r7 = r6.size()     // Catch:{ jaq -> 0x01df }
            if (r7 <= 0) goto L_0x01d8
            dze r7 = new dze     // Catch:{ jaq -> 0x01df }
            com.google.android.gms.appinvite.model.ContactPerson r9 = new com.google.android.gms.appinvite.model.ContactPerson     // Catch:{ jaq -> 0x01df }
            r9.<init>(r2, r14, r5, r6)     // Catch:{ jaq -> 0x01df }
            r7.<init>(r13, r9)     // Catch:{ jaq -> 0x01df }
            r11.add(r7)     // Catch:{ jaq -> 0x01df }
            r9 = r17
            r7 = r18
            r6 = 0
            goto L_0x0084
        L_0x01d8:
            r9 = r17
            r7 = r18
            r6 = 0
            goto L_0x0084
        L_0x01df:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e1:
            r18 = r7
            goto L_0x01f8
        L_0x01e4:
            r0 = move-exception
            r18 = r7
        L_0x01e7:
            java.lang.String r2 = "IdentityLoader"
            java.lang.String r5 = "ParseException"
            android.util.Log.w(r2, r5, r0)
            goto L_0x01f8
        L_0x01ef:
            r18 = r7
            goto L_0x01f8
        L_0x01f2:
            r18 = r7
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x01f8:
            if (r10 == 0) goto L_0x0200
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0204
        L_0x0200:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0204:
            wxj r2 = new wxj
            r2.<init>(r11, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6 = 0
        L_0x020f:
            int r5 = r2.a()
            if (r6 >= r5) goto L_0x0226
            java.lang.Object r5 = r2.a(r6)
            dze r5 = (defpackage.dze) r5
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L_0x0220
            goto L_0x0223
        L_0x0220:
            r0.add(r5)
        L_0x0223:
            int r6 = r6 + 1
            goto L_0x020f
        L_0x0226:
            wxs r5 = new wxs
            r5.<init>(r1, r2, r8)
            wxt r2 = new wxt
            r2.<init>(r3, r5, r4, r8)
            r3 = r18
            r3.a((java.lang.Object) r2)
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0242:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxw.f():java.lang.String[]");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return wxx.b(status);
    }

    public final void a(Status status, wvz[] wvzArr) {
        try {
            this.s = status;
            this.t = wvzArr;
            f();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById CP2 callback error.", e);
            throw e;
        }
    }

    public final void a(DataHolder dataHolder) {
        HashSet hashSet = new HashSet();
        if (dataHolder != null) {
            for (int i = 0; i < dataHolder.h; i++) {
                hashSet.add(wxh.g(dataHolder.c("contact_id", i, dataHolder.a(i))));
            }
        }
        new Thread(new wwv(this, this.r, this.a.a.a, hashSet)).start();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        xbi xbi = (xbi) ibf;
        this.c = xbi;
        this.r = xbi.v;
        wvy wvy = this.a;
        if (wvy.a.a == null || (!wvy.c && !wvy.b)) {
            this.n = true;
            if (wvy.b || wvy.c) {
                this.m = Status.c;
            } else {
                this.m = Status.a;
            }
            a((DataHolder) null);
            return;
        }
        xbi.a(new wxv(this), this.a);
    }
}
