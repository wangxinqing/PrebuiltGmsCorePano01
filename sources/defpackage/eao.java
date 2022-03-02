package defpackage;

import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: eao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eao {
    public final ArrayList a = new ArrayList();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    private final void a(ContactPerson contactPerson, String str) {
        if (!ius.a(contactPerson.a, str)) {
            Object obj = this.d.get(str);
            if (contactPerson.equals(obj)) {
                this.d.remove(str);
            } else if (obj instanceof Set) {
                ((Set) obj).remove(contactPerson);
            }
        }
        b(contactPerson);
    }

    private final void b(ContactPerson contactPerson) {
        if (!TextUtils.isEmpty(contactPerson.b)) {
            this.b.put(contactPerson.b, contactPerson);
        }
        Long l = contactPerson.c;
        if (l != null) {
            this.c.put(l, contactPerson);
        }
        Object obj = this.d.get(contactPerson.a);
        if (obj == null) {
            this.d.put(contactPerson.a, contactPerson);
        } else if (obj instanceof ContactPerson) {
            if (!contactPerson.equals(obj)) {
                HashSet hashSet = new HashSet();
                hashSet.add((ContactPerson) obj);
                hashSet.add(contactPerson);
                this.d.put(contactPerson.a, hashSet);
            }
        } else if (obj instanceof Set) {
            ((Set) obj).add(contactPerson);
        }
    }

    public final ContactPerson a(ContactPerson contactPerson) {
        ContactPerson contactPerson2 = (ContactPerson) this.b.get(contactPerson.b);
        if (contactPerson2 == null) {
            ContactPerson contactPerson3 = (ContactPerson) this.c.get(contactPerson.c);
            if (contactPerson3 == null) {
                Object obj = this.d.get(contactPerson.a);
                if (obj instanceof ContactPerson) {
                    ContactPerson contactPerson4 = (ContactPerson) obj;
                    if (eap.c(contactPerson4, contactPerson)) {
                        b(contactPerson4);
                        return contactPerson4;
                    }
                } else if (obj instanceof Set) {
                    for (ContactPerson contactPerson5 : (Set) obj) {
                        if (eap.c(contactPerson5, contactPerson)) {
                            b(contactPerson5);
                            return contactPerson5;
                        }
                    }
                }
                this.a.add(contactPerson);
                b(contactPerson);
                return contactPerson;
            }
            String str = contactPerson3.a;
            eap.a(contactPerson3, contactPerson);
            a(contactPerson3, str);
            return contactPerson3;
        }
        String str2 = contactPerson2.a;
        eap.a(contactPerson2, contactPerson);
        a(contactPerson2, str2);
        return contactPerson2;
    }

    public final void a() {
        Collator instance = Collator.getInstance();
        instance.setStrength(1);
        Collections.sort(this.a, new ean(instance));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection r4) {
        /*
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0013
            java.lang.Object r2 = r4.get(r1)
            com.google.android.gms.appinvite.model.ContactPerson r2 = (com.google.android.gms.appinvite.model.ContactPerson) r2
            r3.a((com.google.android.gms.appinvite.model.ContactPerson) r2)
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eao.a(java.util.Collection):void");
    }
}
