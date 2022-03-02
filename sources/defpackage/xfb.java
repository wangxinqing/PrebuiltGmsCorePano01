package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: xfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xfb {
    private static final Random l = new Random();
    private static final String[] q = {"display_name", "formatted_name", "given_name", "family_name", "middle_name", "honorific_suffix", "honorific_prefix", "yomi_given_name", "yomi_family_name", "yomi_honorific_suffix", "yomi_honorific_prefix"};
    public final jiq a;
    public final wtz b;
    public final wtx c;
    public final String d;
    public final String e;
    public final String f;
    public Set g = null;
    public Set h = null;
    public final xey i = new xey(this);
    public final xez j = new xez(this);
    public final xfa k = new xfa(this);
    private final Context m;
    private final wmy n;
    private final long o;
    private final ContentValues p = new ContentValues();

    public xfb(Context context, String str, String str2) {
        int i2;
        this.m = context;
        this.a = ycm.a(context);
        wtz a2 = wtz.a(context);
        this.b = a2;
        this.c = a2.c();
        long a3 = wtw.a(context).a(str, str2);
        this.o = a3;
        this.d = String.valueOf(a3);
        this.e = str;
        this.f = str2;
        this.n = wmy.a(context);
        xip.a();
        if (Boolean.valueOf(aywy.a.a().bC()).booleanValue() && l.nextDouble() < Double.valueOf(aywy.a.a().bB()).doubleValue()) {
            wml.a();
            if (this.o != -1) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            aucd o2 = xmo.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xmo xmo = (xmo) o2.b;
            xmo.c = i2 - 1;
            xmo.a = 2 | xmo.a;
            int a4 = xmm.a(1);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xmo xmo2 = (xmo) o2.b;
            int i3 = a4 - 1;
            if (a4 != 0) {
                xmo2.b = i3;
                xmo2.a = 1 | xmo2.a;
                xmo xmo3 = (xmo) o2.i();
                aucd o3 = xol.w.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                xol xol = (xol) o3.b;
                xmo3.getClass();
                xol.o = xmo3;
                xol.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                wmm.a(str, o3);
                return;
            }
            throw null;
        }
    }

    private static final void a(ContentValues contentValues, Person.Metadata metadata) {
        contentValues.put("affinity1", Double.valueOf(xeg.a(metadata, "gplusAutocomplete")));
        contentValues.put("logging_id", xeg.b(metadata, "gplusAutocomplete"));
        contentValues.put("affinity2", Double.valueOf(xeg.a(metadata, "chatAutocomplete")));
        contentValues.put("logging_id2", xeg.b(metadata, "chatAutocomplete"));
        contentValues.put("affinity3", Double.valueOf(xeg.a(metadata, "peopleAutocompleteSocial")));
        contentValues.put("logging_id3", xeg.b(metadata, "peopleAutocompleteSocial"));
        contentValues.put("affinity4", Double.valueOf(xeg.a(metadata, "fieldAutocompleteSocial")));
        contentValues.put("logging_id4", xeg.b(metadata, "fieldAutocompleteSocial"));
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id5");
    }

    public static boolean b(Person person) {
        Person.Metadata metadata = person.x;
        return (metadata == null || xeg.a(metadata.f) == 0) ? false : true;
    }

    public final String c() {
        return this.c.c("SELECT cover_photo_url FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{this.e});
    }

    /* access modifiers changed from: package-private */
    public final int d(String str) {
        this.c.e();
        return this.c.a("ac_people", "owner_id=? AND people_v2_id=?", new String[]{this.d, str});
    }

    public final void e() {
        this.c.d();
    }

    public final void f() {
        this.c.b();
    }

    public final String c(String str) {
        iva.a(this.f == null);
        iva.a((Object) str);
        return this.c.c("SELECT cover_photo_url FROM owners WHERE account_name=? AND page_gaia_id=?", new String[]{this.e, str});
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return this.c.a("SELECT last_successful_sync_time FROM owners WHERE _id=?", new String[]{this.d}, -1);
    }

    public final void d() {
        this.c.a();
    }

    public final void b(String str) {
        a(str, (String) null);
    }

    public final ContentValues a() {
        this.p.clear();
        return this.p;
    }

    public final String a(String str) {
        return this.c.c("SELECT value FROM sync_tokens WHERE owner_id=? AND name=?", new String[]{this.d, str});
    }

    public final void a(Person person) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        Person person2 = person;
        this.c.e();
        xeg.b(person);
        ContentValues a2 = a();
        a2.put("gaia_id", person2.x.p);
        Person.Names b2 = xeg.b(person);
        String str5 = null;
        if (b2 != null) {
            str = b2.b;
        } else {
            str = null;
        }
        a2.put("display_name", str);
        if (b2 != null) {
            str2 = b2.e;
        } else {
            str2 = null;
        }
        a2.put("given_name", str2);
        if (b2 != null) {
            str3 = b2.c;
        } else {
            str3 = null;
        }
        a2.put("family_name", str3);
        a2.put("etag", person2.k);
        a2.put("is_active_plus_account", Integer.valueOf(xeg.a(person) ? 1 : 0));
        Person.Images c2 = xeg.c(person);
        if (c2 != null && !c2.b) {
            a2.put("avatar", ycc.a(c2.e));
        } else {
            a2.put("avatar", (String) null);
        }
        Person.CoverPhotos d2 = xeg.d(person);
        if (d2 != null) {
            str4 = ycc.a(d2.f);
        } else {
            str4 = null;
        }
        a2.put("cover_photo_url", str4);
        int i4 = 0;
        if (d2 != null) {
            i2 = d2.b;
        } else {
            i2 = 0;
        }
        a2.put("cover_photo_height", Integer.valueOf(i2));
        if (d2 != null) {
            i3 = d2.g;
        } else {
            i3 = 0;
        }
        a2.put("cover_photo_width", Integer.valueOf(i3));
        if (d2 != null) {
            str5 = d2.c;
        }
        a2.put("cover_photo_id", str5);
        int i5 = 1;
        this.c.a("owners", a2, "_id = ?", new String[]{this.d});
        this.c.a("owner_emails", "owner_id=?", new String[]{this.d});
        List list = person2.j;
        int a3 = xeg.a(list);
        int i6 = 0;
        while (i6 < a3) {
            Person.Emails emails = (Person.Emails) list.get(i6);
            if (!TextUtils.isEmpty(emails.f) && xeg.a(emails.d)) {
                wtx wtx = this.c;
                ContentValues a4 = a();
                a4.put("owner_id", Long.valueOf(this.o));
                a4.put("custom_label", emails.e);
                a4.put("email", emails.f);
                a4.put("type", Integer.valueOf(xeg.a(emails)));
                wtx.a("owner_emails", a4);
            }
            i6++;
            i5 = 1;
            i4 = 0;
        }
        wtx wtx2 = this.c;
        String[] strArr = new String[i5];
        strArr[i4] = this.d;
        wtx2.a("owner_phones", "owner_id=?", strArr);
        List list2 = person2.D;
        int a5 = xeg.a(list2);
        int i7 = 0;
        while (i7 < a5) {
            Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list2.get(i7);
            if (!TextUtils.isEmpty(phoneNumbers.f) && xeg.a(phoneNumbers.d)) {
                wtx wtx3 = this.c;
                ContentValues a6 = a();
                a6.put("owner_id", Long.valueOf(this.o));
                a6.put("custom_label", phoneNumbers.e);
                a6.put("phone", phoneNumbers.f);
                a6.put("type", Integer.valueOf(xeg.a(phoneNumbers)));
                wtx3.a("owner_phones", a6);
            }
            i7++;
            i5 = 1;
            i4 = 0;
        }
        wtx wtx4 = this.c;
        String[] strArr2 = new String[i5];
        strArr2[i4] = this.d;
        wtx4.a("owner_postal_address", "owner_id=?", strArr2);
        List list3 = person2.c;
        int a7 = xeg.a(list3);
        while (i4 < a7) {
            Person.Addresses addresses = (Person.Addresses) list3.get(i4);
            if (!TextUtils.isEmpty(addresses.k) && xeg.a(addresses.e)) {
                wtx wtx5 = this.c;
                ContentValues a8 = a();
                a8.put("owner_id", Long.valueOf(this.o));
                a8.put("custom_label", addresses.j);
                a8.put("postal_address", addresses.k);
                a8.put("type", Integer.valueOf(((Integer) xeg.a(xeg.c, (Object) addresses.j)).intValue()));
                wtx5.a("owner_postal_address", a8);
            }
            i4++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.plus.service.v2whitelisted.models.Person r22, boolean r23, boolean r24, defpackage.wmn r25) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r9 = r24
            r10 = r25
            wtx r0 = r7.c
            r0.e()
            if (r23 == 0) goto L_0x0034
            boolean r0 = defpackage.xeg.p(r22)
            if (r0 != 0) goto L_0x0028
            boolean r0 = defpackage.xeg.q(r22)
            boolean r1 = defpackage.xeg.g(r22)
            boolean r2 = defpackage.xeg.h(r22)
            if (r1 != 0) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            if (r0 != 0) goto L_0x0034
            if (r2 != 0) goto L_0x0034
        L_0x0028:
            int r0 = r10.m
            java.lang.String r1 = r8.p
            int r1 = r7.d(r1)
            int r0 = r0 + r1
            r10.m = r0
            return
        L_0x0034:
            boolean r0 = defpackage.xeg.l(r22)
            java.lang.String r1 = "@circle@"
            java.lang.String r2 = "ac_people"
            java.lang.String r3 = "last_update_time"
            java.lang.String r4 = "sync_is_alive"
            java.lang.String r5 = "@profile@"
            if (r0 != 0) goto L_0x0247
            java.lang.String r0 = r8.p
            r7.d(r0)
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata r0 = r8.x
            wtx r13 = r7.c
            java.lang.String r14 = r8.p
            android.content.ContentValues r15 = new android.content.ContentValues
            r15.<init>()
            long r11 = r7.o
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "owner_id"
            r15.put(r12, r11)
            java.lang.String r11 = "people_v2_id"
            r15.put(r11, r14)
            java.lang.String r11 = defpackage.xeg.o(r22)
            java.lang.String r12 = "qualified_id"
            r15.put(r12, r11)
            long r11 = defpackage.xeg.n(r22)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r15.put(r3, r11)
            r3 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r15.put(r4, r11)
            a((android.content.ContentValues) r15, (com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata) r0)
            long r12 = r13.a((java.lang.String) r2, (android.content.ContentValues) r15)
            int r2 = r10.l
            int r2 = r2 + r3
            r10.l = r2
            nz r2 = new nz
            r2.<init>()
            java.lang.String r3 = "in_circle"
            java.lang.String r4 = "profile_type"
            java.lang.String r14 = "people_id"
            java.lang.String r15 = "container_type"
            if (r9 != 0) goto L_0x0100
            boolean r17 = defpackage.xeg.g(r22)
            if (r17 == 0) goto L_0x00d5
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            r2.put(r5, r6)
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r6.put(r14, r10)
            r10 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r6.put(r15, r7)
            java.lang.String r0 = r0.p
            java.lang.String r7 = "gaia_id"
            r6.put(r7, r0)
            int r0 = defpackage.xeg.e(r22)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r4, r0)
            boolean r0 = defpackage.xeg.q(r22)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.put(r3, r0)
        L_0x00d5:
            boolean r0 = defpackage.xeg.j(r22)
            if (r0 == 0) goto L_0x0100
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r2.put(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0.put(r14, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r15, r1)
            r0.put(r4, r11)
            boolean r1 = defpackage.xeg.q(r22)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.put(r3, r1)
        L_0x0100:
            java.util.List r0 = defpackage.xeg.i(r22)
            int r1 = r0.size()
            r6 = 0
        L_0x0109:
            if (r6 >= r1) goto L_0x0147
            java.lang.Object r7 = r0.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            r2.put(r7, r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r10.put(r14, r11)
            r17 = r0
            r11 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r10.put(r15, r0)
            java.lang.String r0 = "contact_id"
            r10.put(r0, r7)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.put(r4, r0)
            boolean r0 = defpackage.xeg.q(r22)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.put(r3, r0)
            int r6 = r6 + 1
            r0 = r17
            goto L_0x0109
        L_0x0147:
            xeo r0 = new xeo
            xec r1 = defpackage.xec.a
            r0.<init>(r1, r8, r2, r9)
            r0.a()
            xep r0 = new xep
            xed r1 = defpackage.xed.a
            r0.<init>(r1, r8, r2, r9)
            r0.a()
            xeq r0 = new xeq
            xeb r1 = defpackage.xeb.a
            r0.<init>(r1, r8, r2, r9)
            r0.a()
            if (r9 != 0) goto L_0x01ac
            java.lang.Object r0 = r2.get(r5)
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            if (r0 == 0) goto L_0x01ac
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0177:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01ac
            java.lang.Object r3 = r1.next()
            android.content.ContentValues r3 = (android.content.ContentValues) r3
            java.lang.Integer r4 = r3.getAsInteger(r15)
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto L_0x0177
            java.lang.String r4 = "display_name"
            java.lang.String r4 = r3.getAsString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0177
            java.lang.String[] r4 = q
            int r5 = r4.length
            r6 = 0
        L_0x019e:
            if (r6 >= r5) goto L_0x0177
            r7 = r4[r6]
            java.lang.String r10 = r0.getAsString(r7)
            r3.put(r7, r10)
            int r6 = r6 + 1
            goto L_0x019e
        L_0x01ac:
            nz r7 = new nz
            r7.<init>()
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r2.get(r1)
            android.content.ContentValues r3 = (android.content.ContentValues) r3
            r10 = r21
            wtx r4 = r10.c
            java.lang.String r5 = "ac_container"
            long r3 = r4.a((java.lang.String) r5, (android.content.ContentValues) r3)
            r11 = r25
            int r5 = r11.o
            r6 = 1
            int r5 = r5 + r6
            r11.o = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.put(r1, r3)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r4 = "container_id"
            r1.put(r4, r3)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "item_type"
            r1.put(r3, r4)
            java.lang.String r3 = r8.p
            java.lang.String r4 = "value"
            r1.put(r4, r3)
            wtx r3 = r10.c
            java.lang.String r4 = "ac_item"
            r3.a((java.lang.String) r4, (android.content.ContentValues) r1)
            goto L_0x01b9
        L_0x0207:
            r10 = r21
            r11 = r25
            xer r14 = new xer
            xdy r2 = defpackage.xdy.a
            r0 = r14
            r1 = r21
            r3 = r22
            r4 = r7
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.a()
            xes r14 = new xes
            xee r2 = defpackage.xee.a
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.a()
            xet r14 = new xet
            xef r2 = defpackage.xef.a
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.a()
            wtz r0 = r10.b
            wue r0 = r0.e
            wtz r1 = r0.b
            wtx r1 = r1.c()
            if (r1 == 0) goto L_0x0246
            wuc r0 = r0.d
            r0.a(r1, r12)
        L_0x0246:
            return
        L_0x0247:
            r11 = r10
            r10 = r7
            java.lang.String r0 = r8.p
            wtx r6 = r10.c
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r7.put(r4, r13)
            long r12 = defpackage.xeg.n(r22)
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r7.put(r3, r4)
            com.google.android.gms.plus.service.v2whitelisted.models.Person$Metadata r3 = r8.x
            a((android.content.ContentValues) r7, (com.google.android.gms.plus.service.v2whitelisted.models.Person.Metadata) r3)
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r12 = r10.d
            r13 = 0
            r4[r13] = r12
            r12 = 1
            r4[r12] = r0
            java.lang.String r14 = "owner_id = ? AND people_v2_id = ?"
            r6.a((java.lang.String) r2, (android.content.ContentValues) r7, (java.lang.String) r14, (java.lang.String[]) r4)
            wtx r2 = r10.c
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r3 = r10.d
            r4[r13] = r3
            r4[r12] = r0
            java.lang.String r0 = "SELECT _id FROM ac_people WHERE owner_id=? AND people_v2_id=?"
            r6 = -1
            long r2 = r2.a((java.lang.String) r0, (java.lang.String[]) r4, (long) r6)
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x035d
            int r0 = r11.n
            int r0 = r0 + r12
            r11.n = r0
            nz r12 = new nz
            r12.<init>()
            if (r9 != 0) goto L_0x02f4
            boolean r0 = defpackage.xeg.g(r22)
            java.lang.String r4 = "SELECT _id FROM ac_container WHERE people_id=? AND container_type=?"
            if (r0 == 0) goto L_0x02ca
            wtx r0 = r10.c
            r15 = 2
            java.lang.String[] r13 = new java.lang.String[r15]
            java.lang.String r14 = java.lang.Long.toString(r2)
            r15 = 0
            r13[r15] = r14
            java.lang.String r14 = java.lang.Integer.toString(r15)
            r15 = 1
            r13[r15] = r14
            long r13 = r0.a((java.lang.String) r4, (java.lang.String[]) r13, (long) r6)
            r18 = 0
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x02ca
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r12.put(r5, r0)
        L_0x02ca:
            boolean r0 = defpackage.xeg.j(r22)
            if (r0 == 0) goto L_0x02f4
            wtx r0 = r10.c
            r5 = 2
            java.lang.String[] r13 = new java.lang.String[r5]
            java.lang.String r14 = java.lang.Long.toString(r2)
            r15 = 0
            r13[r15] = r14
            java.lang.String r14 = java.lang.Integer.toString(r5)
            r5 = 1
            r13[r5] = r14
            long r4 = r0.a((java.lang.String) r4, (java.lang.String[]) r13, (long) r6)
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x02f4
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r12.put(r1, r0)
        L_0x02f4:
            java.util.List r0 = defpackage.xeg.i(r22)
            int r1 = r0.size()
            r4 = 0
        L_0x02fd:
            if (r4 >= r1) goto L_0x0333
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            wtx r13 = r10.c
            r14 = 3
            java.lang.String[] r14 = new java.lang.String[r14]
            java.lang.String r15 = java.lang.Long.toString(r2)
            r20 = 0
            r14[r20] = r15
            r15 = 1
            java.lang.String r16 = java.lang.Integer.toString(r15)
            r14[r15] = r16
            r16 = 2
            r14[r16] = r5
            java.lang.String r15 = "SELECT _id FROM ac_container WHERE people_id=? AND container_type=? AND contact_id=?"
            long r13 = r13.a((java.lang.String) r15, (java.lang.String[]) r14, (long) r6)
            r17 = 0
            int r15 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r15 < 0) goto L_0x0330
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.put(r5, r13)
        L_0x0330:
            int r4 = r4 + 1
            goto L_0x02fd
        L_0x0333:
            xeu r7 = new xeu
            xdy r2 = defpackage.xdy.a
            r0 = r7
            r1 = r21
            r3 = r22
            r4 = r12
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a()
            xev r7 = new xev
            xee r2 = defpackage.xee.a
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a()
            xew r7 = new xew
            xef r2 = defpackage.xef.a
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a()
        L_0x035d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfb.a(com.google.android.gms.plus.service.v2whitelisted.models.Person, boolean, boolean, wmn):void");
    }

    public final void a(String str, String str2) {
        iva.c(str);
        this.c.a();
        try {
            this.c.a("DELETE FROM sync_tokens WHERE owner_id = ? AND name = ?", (Object[]) new String[]{this.d, str});
            if (!TextUtils.isEmpty(str2)) {
                this.c.a("INSERT INTO sync_tokens(owner_id,name,value) VALUES (?,?,?)", (Object[]) new String[]{this.d, str, str2});
            }
            this.c.b();
        } finally {
            this.c.d();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.c.a();
        try {
            wtx wtx = this.c;
            StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length() + str3.length() + str4.length());
            sb.append("DELETE FROM ");
            sb.append(str);
            sb.append(" WHERE NOT EXISTS (SELECT 1 FROM ");
            sb.append(str2);
            sb.append(" AS p WHERE ");
            sb.append(str3);
            sb.append(" = p.");
            sb.append(str4);
            sb.append(")");
            wtx.a(sb.toString());
            this.c.b();
        } finally {
            this.c.d();
        }
    }

    public final void a(boolean z, long j2, Long l2) {
        this.c.f();
        ContentValues a2 = a();
        a2.put("last_sync_start_time", Long.valueOf(j2));
        if (l2 == null) {
            a2.put("last_sync_status", 1);
            a2.put("last_sync_finish_time", 0);
        } else {
            a2.put("last_sync_finish_time", l2);
            if (z) {
                a2.put("last_sync_status", 2);
                a2.put("last_successful_sync_time", l2);
            } else {
                a2.put("last_sync_status", 3);
            }
        }
        this.n.a(this.e, this.f, 1);
        this.c.a("owners", a2, "_id = ?", new String[]{this.d});
        this.n.b();
    }
}
