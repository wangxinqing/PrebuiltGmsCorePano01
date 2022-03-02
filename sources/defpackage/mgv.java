package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: mgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgv extends mhh {
    private final List b;
    private final String c;
    private final mfr d;
    private final String e;
    private final mfp f;

    public mgv(Context context, mfp mfp, mfr mfr, String str, List list, String str2) {
        super(context);
        this.b = list;
        this.c = str;
        this.e = str2;
        this.d = mfr;
        this.f = mfp;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList arrayList = new ArrayList();
        try {
            List<Contact> list = this.b;
            String str = this.c;
            String str2 = this.e;
            aucd o = apii.e.o();
            HashMap hashMap = new HashMap();
            for (Contact contact : list) {
                aucd o2 = apih.c.o();
                aucd o3 = apif.c.o();
                String str3 = contact.c;
                if (str3 != null) {
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    apif apif = (apif) o3.b;
                    str3.getClass();
                    apif.a |= 2;
                    apif.b = str3;
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                apih apih = (apih) o2.b;
                apif apif2 = (apif) o3.i();
                apif2.getClass();
                apih.b = apif2;
                apih.a = 1 | apih.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                apii apii = (apii) o.b;
                apih apih2 = (apih) o2.i();
                apih2.getClass();
                if (!apii.c.a()) {
                    apii.c = aucj.a(apii.c);
                }
                apii.c.add(apih2);
                hashMap.put(((apif) o3.b).b, contact);
            }
            apgv a = mgg.a(getContext(), this.d, this.f);
            if (o.c) {
                o.c();
                o.c = false;
            }
            apii apii2 = (apii) o.b;
            a.getClass();
            apii2.b = a;
            int i = apii2.a | 1;
            apii2.a = i;
            if (str != null) {
                str.getClass();
                apii2.a = i | 2;
                apii2.d = str;
            }
            String valueOf = String.valueOf(o);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Direct Add Request:");
            sb.append(valueOf);
            sb.toString();
            ith ith = mfv.a;
            mhp a2 = mgk.a();
            ClientContext a3 = mgk.a(str2);
            apii apii3 = (apii) o.i();
            if (mhp.v == null) {
                mhp.v = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/DirectAddMembers", baoq.a(apii.e), baoq.a(apij.d));
            }
            apij apij = (apij) a2.a.a(mhp.v, a3, apii3, (long) mhp.b, TimeUnit.MILLISECONDS);
            mfr mfr = this.d;
            apgw apgw = apij.a;
            if (apgw == null) {
                apgw = apgw.c;
            }
            mgg.a(mfr, apgw);
            String valueOf2 = String.valueOf(apij);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("Direct Add Response:");
            sb2.append(valueOf2);
            sb2.toString();
            ArrayList arrayList2 = new ArrayList();
            for (apig apig : apij.b) {
                apif apif3 = apig.a;
                if (apif3 == null) {
                    apif3 = apif.c;
                }
                Contact contact2 = new Contact((Contact) hashMap.get(apif3.b));
                contact2.j = 15;
                arrayList2.add(contact2);
            }
            for (apik apik : apij.c) {
                apif apif4 = apik.a;
                if (apif4 == null) {
                    apif4 = apif.c;
                }
                Contact contact3 = new Contact((Contact) hashMap.get(apif4.b));
                contact3.j = 16;
                arrayList2.add(contact3);
            }
            return new mhg(true, arrayList2);
        } catch (babk | eif e2) {
            throw new mgf(e2.getMessage(), e2);
        } catch (mgf e3) {
            String valueOf3 = String.valueOf(e3.getMessage());
            if (valueOf3.length() == 0) {
                new String("Error directAdding: ");
            } else {
                "Error directAdding: ".concat(valueOf3);
            }
            ith ith2 = mfv.a;
            return new mhg(false, arrayList);
        }
    }
}
