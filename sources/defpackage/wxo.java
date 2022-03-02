package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* renamed from: wxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wxo implements ilh {
    final /* synthetic */ idf a;
    final /* synthetic */ wxq b;

    public wxo(wxq wxq, idf idf) {
        this.b = wxq;
        this.a = idf;
    }

    public final int a() {
        return this.b.b.length;
    }

    public final Bundle b() {
        return null;
    }

    public final void c() {
        idf idf = this.a;
        if (idf != null) {
            idf.b();
        }
        for (DataHolder close : this.b.c) {
            close.close();
        }
    }

    public final void close() {
        c();
    }

    public final Iterator iterator() {
        return new ili(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: wwi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: wwi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: wwh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: wwi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: wwi} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[Catch:{ jaq -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba A[Catch:{ jaq -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r9 = "DefaultPersonFactory"
            wxq r2 = r1.b
            java.util.ArrayList r2 = r2.n
            if (r2 == 0) goto L_0x0018
            java.lang.Object r2 = r2.get(r0)
            android.os.Bundle r2 = (android.os.Bundle) r2
            wwk r2 = defpackage.wwk.a(r2)
            r11 = r2
            goto L_0x0019
        L_0x0018:
            r11 = 0
        L_0x0019:
            wxq r2 = r1.b
            wvz[] r3 = r2.x
            if (r3 == 0) goto L_0x0023
            r3 = r3[r0]
            r12 = r3
            goto L_0x0024
        L_0x0023:
            r12 = 0
        L_0x0024:
            com.google.android.gms.common.data.DataHolder r3 = r2.o
            if (r3 == 0) goto L_0x0069
            com.google.android.gms.common.data.DataHolder r4 = r2.p
            com.google.android.gms.common.data.DataHolder r5 = r2.q
            com.google.android.gms.common.data.DataHolder r6 = r2.r
            com.google.android.gms.common.data.DataHolder r7 = r2.s
            com.google.android.gms.common.data.DataHolder r8 = r2.t
            com.google.android.gms.common.data.DataHolder r13 = r2.u
            com.google.android.gms.common.data.DataHolder r14 = r2.v
            com.google.android.gms.common.data.DataHolder r15 = r2.w
            java.util.ArrayList r2 = defpackage.wwg.a(r3, r0)
            java.lang.Object r2 = defpackage.wwg.a((java.util.ArrayList) r2)
            r3 = r2
            wwf r3 = (defpackage.wwf) r3
            if (r3 == 0) goto L_0x004f
            wwi r13 = new wwi
            r2 = r13
            r7 = r15
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x006a
        L_0x004f:
            java.util.ArrayList r2 = defpackage.wwg.a(r7, r0)
            java.lang.Object r2 = defpackage.wwg.a((java.util.ArrayList) r2)
            r3 = r2
            wwf r3 = (defpackage.wwf) r3
            if (r3 == 0) goto L_0x0069
            wwh r15 = new wwh
            r2 = r15
            r4 = r8
            r5 = r13
            r6 = r14
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7)
            r13 = r15
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            wxq r2 = r1.b
            android.content.Context r3 = r2.m
            java.lang.Object[] r2 = r2.b
            r0 = r2[r0]
            com.google.android.gms.smart_profile.SmartProfilePerson r2 = new com.google.android.gms.smart_profile.SmartProfilePerson
            r2.<init>()
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L_0x00d2
            byte[] r0 = r11.a
            if (r0 == 0) goto L_0x00d2
            int r0 = r11.b     // Catch:{ jaq -> 0x00c9 }
            if (r0 == r5) goto L_0x00ba
            if (r0 == r4) goto L_0x008f
            java.lang.String r0 = "Unrecognized data format"
            android.util.Log.w(r9, r0)     // Catch:{ jaq -> 0x00c9 }
            r10 = 0
            goto L_0x0550
        L_0x008f:
            wyh r0 = new wyh     // Catch:{ jaq -> 0x00c9 }
            r0.<init>()     // Catch:{ jaq -> 0x00c9 }
            byte[] r8 = r11.a     // Catch:{ jaq -> 0x00c9 }
            r0.b((byte[]) r8)     // Catch:{ jaq -> 0x00c9 }
            java.util.Set r8 = r0.a     // Catch:{ jaq -> 0x00c9 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ jaq -> 0x00c9 }
            boolean r8 = r8.contains(r11)     // Catch:{ jaq -> 0x00c9 }
            if (r8 == 0) goto L_0x00d2
            java.util.List r8 = r0.b     // Catch:{ jaq -> 0x00c9 }
            int r8 = r8.size()     // Catch:{ jaq -> 0x00c9 }
            if (r8 <= 0) goto L_0x00d2
            java.util.List r0 = r0.b     // Catch:{ jaq -> 0x00c9 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ jaq -> 0x00c9 }
            com.google.android.gms.plus.service.v2whitelisted.models.Person r0 = (com.google.android.gms.plus.service.v2whitelisted.models.Person) r0     // Catch:{ jaq -> 0x00c9 }
            defpackage.wyg.a(r0, r2)     // Catch:{ jaq -> 0x00c9 }
            goto L_0x0258
        L_0x00ba:
            com.google.android.gms.plus.service.v2whitelisted.models.Person r0 = new com.google.android.gms.plus.service.v2whitelisted.models.Person     // Catch:{ jaq -> 0x00c9 }
            r0.<init>()     // Catch:{ jaq -> 0x00c9 }
            byte[] r8 = r11.a     // Catch:{ jaq -> 0x00c9 }
            r0.b((byte[]) r8)     // Catch:{ jaq -> 0x00c9 }
            defpackage.wyg.a(r0, r2)     // Catch:{ jaq -> 0x00c9 }
            goto L_0x0258
        L_0x00c9:
            r0 = move-exception
            java.lang.String r2 = "ParseException"
            android.util.Log.w(r9, r2, r0)
            r10 = 0
            goto L_0x0550
        L_0x00d2:
            if (r13 == 0) goto L_0x0258
            boolean r0 = r2.J()
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl
            r0.<init>()
            r2.t = r0
            goto L_0x00e4
        L_0x00e2:
            com.google.android.gms.people.identity.internal.models.PersonImpl$PersonMetadataImpl r0 = r2.t
        L_0x00e4:
            int r8 = r13.e()
            if (r8 == r7) goto L_0x00f0
            if (r8 == r5) goto L_0x00ed
            goto L_0x00f4
        L_0x00ed:
            java.lang.String r8 = "page"
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r8 = "person"
        L_0x00f2:
            r0.h = r8
        L_0x00f4:
            java.util.List r8 = r13.g()
            java.lang.String r9 = "profile"
            if (r8 == 0) goto L_0x0139
            java.util.List r8 = r13.g()
            java.util.Iterator r8 = r8.iterator()
        L_0x0104:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0139
            java.lang.Object r11 = r8.next()
            wwc r11 = (defpackage.wwc) r11
            java.lang.String r14 = r11.a()
            java.util.List r15 = r0.a()
            r15.add(r14)
            com.google.android.gms.people.identity.internal.models.PersonImpl$MembershipsImpl r14 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MembershipsImpl
            r14.<init>()
            java.lang.String r11 = r11.a()
            r14.c = r11
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r11.<init>()
            r11.b = r9
            java.lang.String r15 = r13.b()
            r11.d = r15
            r14.b = r11
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.MembershipsImpl) r14)
            goto L_0x0104
        L_0x0139:
            com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl
            r0.<init>()
            java.lang.String r8 = r13.a()
            r0.c = r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            boolean r11 = r13.c()
            r8.b(r11)
            r0.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.NamesImpl) r0)
            java.lang.String r0 = r13.b()
            r2.m = r0
            com.google.android.gms.people.identity.internal.models.PersonImpl$TaglinesImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$TaglinesImpl
            r0.<init>()
            java.lang.String r8 = r13.d()
            r0.c = r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            r0.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.TaglinesImpl) r0)
            com.google.android.gms.people.identity.internal.models.PersonImpl$ImagesImpl r0 = new com.google.android.gms.people.identity.internal.models.PersonImpl$ImagesImpl
            r0.<init>()
            com.google.android.gms.people.identity.internal.models.ImageReferenceImpl r8 = new com.google.android.gms.people.identity.internal.models.ImageReferenceImpl
            r8.<init>()
            java.lang.String r11 = r13.f()
            r8.c = r11
            r8.a(r7)
            r0.c = r8
            r0.a(r7)
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            r0.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.ImagesImpl) r0)
            java.util.List r0 = r13.h()
            if (r0 == 0) goto L_0x01e4
            java.util.List r0 = r13.h()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b8:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r8 = r0.next()
            wwb r8 = (defpackage.wwb) r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl
            r11.<init>()
            java.lang.String r14 = r8.a
            r11.j = r14
            java.lang.String r8 = r8.b
            r11.f = r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            r11.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.AddressesImpl) r11)
            goto L_0x01b8
        L_0x01e4:
            java.util.List r0 = r13.i()
            if (r0 == 0) goto L_0x021e
            java.util.List r0 = r13.i()
            java.util.Iterator r0 = r0.iterator()
        L_0x01f2:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x021e
            java.lang.Object r8 = r0.next()
            wwe r8 = (defpackage.wwe) r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$PhoneNumbersImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$PhoneNumbersImpl
            r11.<init>()
            java.lang.String r14 = r8.a
            r11.f = r14
            java.lang.String r8 = r8.b
            r11.d = r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            r11.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.PhoneNumbersImpl) r11)
            goto L_0x01f2
        L_0x021e:
            java.util.List r0 = r13.j()
            if (r0 == 0) goto L_0x0258
            java.util.List r0 = r13.j()
            java.util.Iterator r0 = r0.iterator()
        L_0x022c:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0258
            java.lang.Object r8 = r0.next()
            wwd r8 = (defpackage.wwd) r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$EmailsImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$EmailsImpl
            r11.<init>()
            java.lang.String r13 = r8.a
            r11.e = r13
            java.lang.String r8 = r8.b
            r11.c = r8
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r8 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl
            r8.<init>()
            r8.b = r9
            r8.a((boolean) r7)
            r8.c(r6)
            r11.b = r8
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.EmailsImpl) r11)
            goto L_0x022c
        L_0x0258:
            if (r12 == 0) goto L_0x054e
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.List r0 = r12.a
            java.util.Iterator r9 = r0.iterator()
        L_0x0265:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x054e
            java.lang.Object r0 = r9.next()
            wwj r0 = (defpackage.wwj) r0
            java.lang.String r11 = r0.a(r6)
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r13 = 13
            if (r11 == 0) goto L_0x0287
            java.lang.String r11 = r0.a(r13)
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0265
        L_0x0287:
            java.lang.String r11 = r0.a
            boolean r11 = r8.contains(r11)
            if (r11 != 0) goto L_0x02a6
            java.lang.String r11 = r0.a
            r8.add(r11)
            com.google.android.gms.people.identity.internal.models.PersonImpl$MembershipsImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$MembershipsImpl
            r11.<init>()
            java.lang.String r14 = r0.a
            r11.d = r14
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r14 = defpackage.wxi.a(r0)
            r11.b = r14
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.MembershipsImpl) r11)
        L_0x02a6:
            java.lang.String r11 = r0.c
            int r14 = r11.hashCode()
            r15 = 3
            r10 = 8
            switch(r14) {
                case -1569536764: goto L_0x0328;
                case -1328682538: goto L_0x031e;
                case -1079224304: goto L_0x0314;
                case -1079210633: goto L_0x0309;
                case -601229436: goto L_0x02fe;
                case 456415478: goto L_0x02f3;
                case 684173810: goto L_0x02e9;
                case 689862072: goto L_0x02df;
                case 905843021: goto L_0x02d4;
                case 950831081: goto L_0x02ca;
                case 1409846529: goto L_0x02bf;
                case 2034973555: goto L_0x02b4;
                default: goto L_0x02b2;
            }
        L_0x02b2:
            goto L_0x0332
        L_0x02b4:
            java.lang.String r14 = "vnd.android.cursor.item/nickname"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 3
            goto L_0x0333
        L_0x02bf:
            java.lang.String r14 = "vnd.android.cursor.item/relation"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 6
            goto L_0x0333
        L_0x02ca:
            java.lang.String r14 = "vnd.android.cursor.item/im"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 2
            goto L_0x0333
        L_0x02d4:
            java.lang.String r14 = "vnd.android.cursor.item/photo"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 10
            goto L_0x0333
        L_0x02df:
            java.lang.String r14 = "vnd.android.cursor.item/organization"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 4
            goto L_0x0333
        L_0x02e9:
            java.lang.String r14 = "vnd.android.cursor.item/phone_v2"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 5
            goto L_0x0333
        L_0x02f3:
            java.lang.String r14 = "vnd.android.cursor.item/website"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 9
            goto L_0x0333
        L_0x02fe:
            java.lang.String r14 = "vnd.android.cursor.item/postal-address_v2"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 8
            goto L_0x0333
        L_0x0309:
            java.lang.String r14 = "vnd.android.cursor.item/note"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 11
            goto L_0x0333
        L_0x0314:
            java.lang.String r14 = "vnd.android.cursor.item/name"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 7
            goto L_0x0333
        L_0x031e:
            java.lang.String r14 = "vnd.android.cursor.item/contact_event"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 1
            goto L_0x0333
        L_0x0328:
            java.lang.String r14 = "vnd.android.cursor.item/email_v2"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0332
            r11 = 0
            goto L_0x0333
        L_0x0332:
            r11 = -1
        L_0x0333:
            switch(r11) {
                case 0: goto L_0x0527;
                case 1: goto L_0x0505;
                case 2: goto L_0x04d7;
                case 3: goto L_0x04bb;
                case 4: goto L_0x047b;
                case 5: goto L_0x0454;
                case 6: goto L_0x0432;
                case 7: goto L_0x03f0;
                case 8: goto L_0x03aa;
                case 9: goto L_0x038e;
                case 10: goto L_0x034e;
                case 11: goto L_0x0338;
                default: goto L_0x0336;
            }
        L_0x0336:
            goto L_0x0265
        L_0x0338:
            com.google.android.gms.people.identity.internal.models.PersonImpl$NotesImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$NotesImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r0 = r0.a(r6)
            r10.c = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.NotesImpl) r10)
            goto L_0x0265
        L_0x034e:
            java.lang.String r10 = r0.a(r13)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0265
            com.google.android.gms.people.identity.internal.models.PersonImpl$ImagesImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$ImagesImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            com.google.android.gms.people.identity.internal.models.ImageReferenceImpl r11 = new com.google.android.gms.people.identity.internal.models.ImageReferenceImpl
            r11.<init>()
            java.lang.String r0 = r0.a(r13)
            if (r0 == 0) goto L_0x0381
            android.net.Uri r13 = android.provider.ContactsContract.DisplayPhoto.CONTENT_URI     // Catch:{ NumberFormatException -> 0x037e }
            long r14 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x037e }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r13, r14)     // Catch:{ NumberFormatException -> 0x037e }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x037e }
            goto L_0x0382
        L_0x037e:
            r0 = move-exception
            r0 = 0
            goto L_0x0382
        L_0x0381:
            r0 = 0
        L_0x0382:
            r11.c = r0
            r11.a(r5)
            r10.c = r11
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.ImagesImpl) r10)
            goto L_0x0265
        L_0x038e:
            com.google.android.gms.people.identity.internal.models.PersonImpl$UrlsImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$UrlsImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxg.a(r0)
            r10.e = r11
            java.lang.String r0 = defpackage.wxg.b(r0)
            r10.d = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.UrlsImpl) r10)
            goto L_0x0265
        L_0x03aa:
            com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$AddressesImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wwy.a(r0)
            r10.k = r11
            java.lang.String r11 = defpackage.wwy.a(r3, r0)
            r10.f = r11
            java.lang.String r11 = defpackage.wwy.b(r0)
            r10.j = r11
            java.lang.String r11 = defpackage.wwy.c(r0)
            r10.g = r11
            java.lang.String r11 = defpackage.wwy.d(r0)
            r10.c = r11
            java.lang.String r11 = defpackage.wwy.e(r0)
            r10.i = r11
            java.lang.String r11 = defpackage.wwy.f(r0)
            r10.h = r11
            java.lang.String r11 = defpackage.wwy.g(r0)
            r10.d = r11
            java.lang.String r0 = defpackage.wwy.h(r0)
            r10.e = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.AddressesImpl) r10)
            goto L_0x0265
        L_0x03f0:
            com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl r11 = new com.google.android.gms.people.identity.internal.models.PersonImpl$NamesImpl
            r11.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r13 = defpackage.wxi.a(r0)
            r11.b = r13
            java.lang.String r13 = r0.a(r6)
            r11.c = r13
            java.lang.String r13 = r0.a(r7)
            r11.f = r13
            java.lang.String r13 = r0.a(r5)
            r11.d = r13
            java.lang.String r13 = r0.a(r15)
            r11.g = r13
            java.lang.String r13 = r0.a(r4)
            r11.i = r13
            r13 = 5
            java.lang.String r13 = r0.a(r13)
            r11.h = r13
            r13 = 6
            java.lang.String r13 = r0.a(r13)
            r11.k = r13
            java.lang.String r0 = r0.a(r10)
            r11.j = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.NamesImpl) r11)
            goto L_0x0265
        L_0x0432:
            com.google.android.gms.people.identity.internal.models.PersonImpl$RelationsImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$RelationsImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxf.a(r0)
            r10.e = r11
            java.lang.String r11 = defpackage.wxf.b(r0)
            r10.d = r11
            java.lang.String r0 = defpackage.wxf.a(r3, r0)
            r10.c = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.RelationsImpl) r10)
            goto L_0x0265
        L_0x0454:
            com.google.android.gms.people.identity.internal.models.PersonImpl$PhoneNumbersImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$PhoneNumbersImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxe.a(r0)
            r10.f = r11
            java.lang.String r11 = defpackage.wxe.b(r0)
            r10.e = r11
            java.lang.String r11 = defpackage.wxe.a(r3, r0)
            r10.d = r11
            int r0 = r0.g
            r10.a(r0)
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.PhoneNumbersImpl) r10)
            goto L_0x0265
        L_0x047b:
            com.google.android.gms.people.identity.internal.models.PersonImpl$OrganizationsImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$OrganizationsImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxd.a(r0)
            r10.i = r11
            java.lang.String r11 = defpackage.wxd.b(r0)
            r10.n = r11
            java.lang.String r11 = defpackage.wxd.c(r0)
            r10.m = r11
            java.lang.String r11 = defpackage.wxd.d(r0)
            r10.d = r11
            java.lang.String r11 = defpackage.wxd.e(r0)
            r10.e = r11
            java.lang.String r11 = defpackage.wxd.f(r0)
            r10.l = r11
            java.lang.String r11 = defpackage.wxd.g(r0)
            r10.j = r11
            java.lang.String r0 = defpackage.wxd.h(r0)
            r10.h = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.OrganizationsImpl) r10)
            goto L_0x0265
        L_0x04bb:
            com.google.android.gms.people.identity.internal.models.PersonImpl$NicknamesImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$NicknamesImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxc.a(r0)
            r10.d = r11
            java.lang.String r0 = defpackage.wxc.b(r0)
            r10.c = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.NicknamesImpl) r10)
            goto L_0x0265
        L_0x04d7:
            com.google.android.gms.people.identity.internal.models.PersonImpl$InstantMessagingImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$InstantMessagingImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxb.a(r0)
            r10.g = r11
            java.lang.String r11 = defpackage.wxb.b(r0)
            r10.f = r11
            java.lang.String r11 = defpackage.wxb.a(r3, r0)
            r10.d = r11
            java.lang.String r11 = defpackage.wxb.c(r0)
            r10.e = r11
            java.lang.String r0 = defpackage.wxb.b(r3, r0)
            r10.c = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.InstantMessagingImpl) r10)
            goto L_0x0265
        L_0x0505:
            com.google.android.gms.people.identity.internal.models.PersonImpl$EventsImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$EventsImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wxa.a(r0)
            r10.e = r11
            java.lang.String r11 = defpackage.wxa.a(r3, r0)
            r10.d = r11
            java.lang.String r0 = defpackage.wxa.b(r0)
            r10.c = r0
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.EventsImpl) r10)
            goto L_0x0265
        L_0x0527:
            com.google.android.gms.people.identity.internal.models.PersonImpl$EmailsImpl r10 = new com.google.android.gms.people.identity.internal.models.PersonImpl$EmailsImpl
            r10.<init>()
            com.google.android.gms.people.identity.internal.models.PersonImpl$MetadataImpl r11 = defpackage.wxi.a(r0)
            r10.b = r11
            java.lang.String r11 = defpackage.wwz.a(r0)
            r10.e = r11
            java.lang.String r11 = defpackage.wwz.b(r0)
            r10.d = r11
            java.lang.String r11 = defpackage.wwz.a(r3, r0)
            r10.c = r11
            int r0 = r0.g
            r10.a(r0)
            r2.a((com.google.android.gms.people.identity.internal.models.PersonImpl.EmailsImpl) r10)
            goto L_0x0265
        L_0x054e:
            r10 = r2
        L_0x0550:
            if (r12 == 0) goto L_0x0591
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r2 = r12.a
            java.util.Iterator r2 = r2.iterator()
        L_0x055d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x058f
            java.lang.Object r3 = r2.next()
            wwj r3 = (defpackage.wwj) r3
            wwa r3 = r3.f
            if (r3 == 0) goto L_0x055d
            wwa r4 = new wwa
            android.net.Uri r12 = r3.a
            java.lang.String r13 = r3.b
            int r14 = r3.c
            java.lang.String r15 = r3.d
            java.lang.String r5 = r3.e
            java.lang.String r6 = r3.f
            int r7 = r3.g
            java.lang.String r3 = r3.h
            r11 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.add(r4)
            goto L_0x055d
        L_0x058f:
            r10.J = r0
        L_0x0591:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxo.a(int):java.lang.Object");
    }
}
