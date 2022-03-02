package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.invites.contactpicker.AutoCompleteTextView;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

/* renamed from: mmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmr extends Fragment implements mms {
    static final Long a = -1L;
    public TreeMap b;
    public HashSet c;
    ArrayList d;
    public AutoCompleteTextView e;
    public RecyclerView f;
    public ContactPickerOptionsData g;
    int h;
    public boolean i;
    public mmp j;
    mmk k;
    private LinearLayout l;
    private View m;

    public static ContactPerson a(ContactPerson.ContactMethod contactMethod) {
        ContactPerson contactPerson = new ContactPerson("", a, (AvatarReference) null, (Uri) null);
        contactPerson.a(amzy.a((Object) contactMethod));
        return contactPerson;
    }

    private final void c() {
        Toast.makeText(getContext(), this.g.g, 1).show();
    }

    private final void d() {
        TextView textView = (TextView) qb.e(this.m, R.id.fm_cp_confirmation);
        textView.setEnabled(false);
        textView.setAlpha(0.3f);
    }

    private final void f(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        LinearLayout linearLayout = this.l;
        linearLayout.removeView(linearLayout.findViewWithTag(new Pair(contactPerson, contactMethod)));
    }

    public final void b() {
        TextView textView = (TextView) qb.e(this.m, R.id.fm_cp_confirmation);
        textView.setEnabled(true);
        textView.setAlpha(1.0f);
    }

    public final boolean e(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        return c(contactPerson).contains(contactMethod);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.j = (mmp) mfy.a(mmp.class, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = (ContactPickerOptionsData) getArguments().getParcelable("contactPickerOptionsData");
        this.i = false;
        this.c = new HashSet();
        this.d = new ArrayList();
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("selectedContactPersons");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("selectedContactsMethods");
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                this.d.add(new Pair((ContactPerson) parcelableArrayList.get(i2), (ContactPerson.ContactMethod) parcelableArrayList2.get(i2)));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_contact_picker, viewGroup, false);
        iva.a((Object) inflate);
        this.m = inflate;
        this.l = (LinearLayout) qb.e(inflate, R.id.fm_cp_selected_contacts_container);
        ((TextView) qb.e(this.m, R.id.fm_cp_title)).setText(this.g.a);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) qb.e(this.m, R.id.fm_cp_mactv);
        this.e = autoCompleteTextView;
        ContactPickerOptionsData contactPickerOptionsData = this.g;
        autoCompleteTextView.b = contactPickerOptionsData.h;
        autoCompleteTextView.setHint(contactPickerOptionsData.b);
        this.e.a = this;
        a();
        this.f = (RecyclerView) qb.e(this.m, R.id.fm_cp_contact_list);
        getContext();
        this.f.setLayoutManager(new abk());
        TextView textView = (TextView) qb.e(this.m, R.id.fm_cp_confirmation);
        textView.setText(this.g.f);
        textView.setOnClickListener(new mml(this));
        d();
        getLoaderManager().initLoader(0, (Bundle) null, new mmo(this));
        return this.m;
    }

    public final void onDetach() {
        super.onDetach();
        this.j = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList3.get(i2);
            arrayList.add((ContactPerson) pair.first);
            arrayList2.add((ContactPerson.ContactMethod) pair.second);
        }
        bundle.putParcelableArrayList("selectedContactPersons", arrayList);
        bundle.putParcelableArrayList("selectedContactsMethods", arrayList2);
    }

    public static boolean d(ContactPerson contactPerson) {
        return contactPerson.b.equals(a);
    }

    public final void b(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        if (e(contactPerson, contactMethod)) {
            c(contactPerson, contactMethod);
        } else if (b(contactPerson)) {
            if (contactMethod.a == 1) {
                c();
            }
            mmq mmq = (mmq) this.b.get(contactPerson);
            ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) mmq.a.get(0);
            this.d.remove(new Pair(contactPerson, contactMethod2));
            f(contactPerson, contactMethod2);
            mmq.a.clear();
            mmq.a.add(contactMethod);
            this.k.K(a(contactPerson));
            this.d.add(new Pair(contactPerson, contactMethod));
            LinearLayout linearLayout = this.l;
            String str = contactMethod.b;
            String string = getString(R.string.cp_selected_string);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            mfo.a(linearLayout, sb.toString());
            a(contactPerson, contactMethod);
        } else {
            d(contactPerson, contactMethod);
        }
    }

    public final List c(ContactPerson contactPerson) {
        return ((mmq) this.b.get(contactPerson)).a;
    }

    /* access modifiers changed from: package-private */
    public final int a(ContactPerson contactPerson) {
        return amzy.a((Collection) new ArrayList(this.b.keySet())).indexOf(contactPerson);
    }

    public final void d(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        int i2 = this.h;
        if (i2 < this.g.j) {
            int i3 = i2 + 1;
            this.h = i3;
            if (i3 > 0) {
                b();
            }
            if (contactMethod.a == 1) {
                c();
            }
            if (d(contactPerson)) {
                this.c.add(contactMethod);
            } else {
                mmq mmq = (mmq) this.b.get(contactPerson);
                if (!mmq.a.isEmpty()) {
                    ContactPerson.ContactMethod contactMethod2 = (ContactPerson.ContactMethod) mmq.a.get(0);
                    this.d.remove(new Pair(contactPerson, contactMethod2));
                    f(contactPerson, contactMethod2);
                    mmq.a.clear();
                    this.h--;
                }
                mmq.a.add(contactMethod);
                this.k.K(a(contactPerson));
            }
            this.d.add(new Pair(contactPerson, contactMethod));
            LinearLayout linearLayout = this.l;
            String str = contactMethod.b;
            String string = getString(R.string.cp_selected_string);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            mfo.a(linearLayout, sb.toString());
            a(contactPerson, contactMethod);
            a();
        }
    }

    public final void c(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        int i2 = this.h - 1;
        this.h = i2;
        if (i2 == 0) {
            d();
        }
        if (d(contactPerson)) {
            this.c.remove(contactMethod);
        } else {
            ((mmq) this.b.get(contactPerson)).a.remove(contactMethod);
            this.k.K(a(contactPerson));
        }
        LinearLayout linearLayout = this.l;
        String str = contactMethod.b;
        String string = getString(R.string.cp_unselected_string);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
        sb.append(str);
        sb.append(" ");
        sb.append(string);
        mfo.a(linearLayout, sb.toString());
        this.d.remove(new Pair(contactPerson, contactMethod));
        f(contactPerson, contactMethod);
        a();
    }

    public final void a() {
        TextView textView = (TextView) qb.e(this.m, R.id.fm_cp_selection_limit);
        textView.setText(String.format("%d/%d", new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.g.j)}));
        textView.setContentDescription(String.format(this.g.i, new Object[]{Integer.valueOf(this.h)}));
    }

    public final void a(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.fm_contact_picker_chip, (ViewGroup) null);
        ((TextView) qb.e(inflate, R.id.fm_cp_contact_chip_name)).setText(contactPerson.a);
        TextView textView = (TextView) qb.e(inflate, R.id.fm_cp_contact_chip_method);
        String str = contactMethod.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("<");
        sb.append(str);
        sb.append(">");
        textView.setText(sb.toString());
        String str2 = contactMethod.b;
        String string = getString(R.string.cp_selected_string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string).length());
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(string);
        textView.setContentDescription(sb2.toString());
        inflate.setTag(new Pair(contactPerson, contactMethod));
        qb.e(inflate, R.id.fm_cp_contact_chip_remove).setOnClickListener(new mmm(this, contactPerson, contactMethod));
        this.l.addView(inflate);
    }

    public final boolean b(ContactPerson contactPerson) {
        return !c(contactPerson).isEmpty();
    }
}
