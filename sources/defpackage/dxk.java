package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Filter;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: dxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dxk extends Filter {
    final /* synthetic */ dxm a;

    public dxk(dxm dxm) {
        this.a = dxm;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            filterResults.values = charSequence.toString().trim();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Iterator it;
        ArrayList arrayList;
        this.a.t = (String) filterResults.values;
        if (!TextUtils.isEmpty(this.a.t)) {
            dxm dxm = this.a;
            String str = dxm.t;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String charSequence2 = str.toString();
            String lowerCase = str.toString().toLowerCase();
            String a2 = dxm.a(charSequence2);
            Iterator it2 = dxm.n.iterator();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                int i = 1;
                if (!it2.hasNext()) {
                    break;
                }
                ContactPerson contactPerson = (ContactPerson) it2.next();
                if (TextUtils.isEmpty(contactPerson.a)) {
                    it = it2;
                } else if (!contactPerson.a.toLowerCase().contains(lowerCase)) {
                    it = it2;
                } else {
                    if (dxm.g) {
                        linkedHashSet.add(new dxl(contactPerson, contactPerson.a(), 3));
                        it = it2;
                    } else {
                        ArrayList arrayList2 = contactPerson.e;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            linkedHashSet.add(new dxl(contactPerson, (ContactPerson.ContactMethod) arrayList2.get(i2), 3));
                            i2++;
                            it2 = it2;
                        }
                        it = it2;
                    }
                    it2 = it;
                }
                ArrayList arrayList3 = contactPerson.e;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList3.get(i3);
                        String str2 = contactMethod.b;
                        if (TextUtils.isEmpty(str2)) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            int i4 = contactMethod.a;
                            if (i4 != i) {
                                if (i4 == 2) {
                                    if (dxm.l && a2.length() >= dxm.u) {
                                        String a3 = dxm.a(str2);
                                        if (a3.contains(a2)) {
                                            linkedHashSet.add(new dxl(contactPerson, contactMethod, 3));
                                            if (a3.equals(a2)) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                            } else if (dxm.k) {
                                if (str2.toLowerCase().contains(lowerCase)) {
                                    linkedHashSet.add(new dxl(contactPerson, contactMethod, 3));
                                    if (str2.equals(charSequence2)) {
                                        z = true;
                                    }
                                }
                            }
                            i3++;
                            arrayList3 = arrayList;
                            i = 1;
                        }
                        i3++;
                        arrayList3 = arrayList;
                        i = 1;
                    }
                    it2 = it;
                }
                it2 = it;
            }
            if (dxm.k && !z && Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new ContactPerson.ContactMethod(1, charSequence2));
                linkedHashSet.add(new dxl(new ContactPerson(charSequence2, (String) null, (AvatarReference) null, arrayList4), (ContactPerson.ContactMethod) null, 5));
            }
            if (dxm.l && !z2 && Patterns.PHONE.matcher(str).matches()) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new ContactPerson.ContactMethod(2, charSequence2));
                linkedHashSet.add(new dxl(new ContactPerson(charSequence2, (String) null, (AvatarReference) null, arrayList5), (ContactPerson.ContactMethod) null, 5));
            }
            dxm.o = new ArrayList(linkedHashSet);
            dxm dxm2 = this.a;
            dxm2.y = new dxg(dxm2, dxm2.o);
            dxm dxm3 = this.a;
            dxm3.a((zni) dxm3.y);
            dxm dxm4 = this.a;
            if (dxm4.f) {
                dxm4.r.a(dxm4.t);
                return;
            }
            return;
        }
        dxm dxm5 = this.a;
        dxm5.a((zni) dxm5.w);
    }
}
