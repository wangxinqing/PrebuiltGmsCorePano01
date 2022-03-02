package defpackage;

import android.util.Pair;
import android.widget.Filter;
import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: mmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mmd extends Filter {
    final /* synthetic */ mmf a;

    public mmd(mmf mmf) {
        this.a = mmf;
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.a.a.size(); i++) {
                ContactPerson contactPerson = (ContactPerson) this.a.a.get(i);
                String charSequence2 = charSequence.toString();
                if (!contactPerson.a.toLowerCase(Locale.getDefault()).startsWith(charSequence2.toLowerCase(Locale.getDefault()))) {
                    arrayList = new ArrayList();
                    ArrayList arrayList3 = contactPerson.d;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList3.get(i2);
                        if (contactMethod.b.toLowerCase(Locale.US).startsWith(charSequence2.toLowerCase(Locale.US))) {
                            arrayList.add(contactMethod);
                        }
                    }
                } else {
                    arrayList = contactPerson.d;
                }
                amzt j = amzy.j();
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ContactPerson contactPerson2 = new ContactPerson(contactPerson.a, contactPerson.b, contactPerson.c, contactPerson.e);
                    contactPerson2.a(amzy.a((Object) (ContactPerson.ContactMethod) arrayList.get(i3)));
                    j.c(contactPerson2);
                }
                amzy a2 = j.a();
                int size3 = a2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(new Pair((ContactPerson) a2.get(i4), Integer.valueOf(i)));
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        this.a.b = filterResults.values != null ? amzy.a((Collection) (ArrayList) filterResults.values) : amzy.h();
        this.a.notifyDataSetChanged();
    }
}
