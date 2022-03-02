package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.people.identity.models.Person;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: abft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abft extends BaseAdapter {
    public final Fragment a;
    public final Resources b = this.a.getResources();
    private final LayoutInflater c;
    private List d;
    private final ablp e;

    public abft(Fragment fragment, SmartProfilePerson smartProfilePerson, ablp ablp) {
        this.a = fragment;
        this.c = LayoutInflater.from(fragment.getActivity());
        this.e = ablp;
        if (smartProfilePerson != null && smartProfilePerson.H()) {
            this.d = new ArrayList();
            List list = smartProfilePerson.s;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Person.Memberships memberships = (Person.Memberships) list.get(i);
                if (memberships.a()) {
                    Person.Metadata b2 = memberships.b();
                    if (b2.a() && b2.b().equals("cp2")) {
                        abfr abfr = new abfr();
                        abfr.b = b2.f();
                        this.d.add(abfr);
                    }
                }
            }
            if (smartProfilePerson.K()) {
                HashMap hashMap = new HashMap();
                List list2 = smartProfilePerson.u;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Person.Names names = (Person.Names) list2.get(i2);
                    if (names.a()) {
                        Person.Metadata b3 = names.b();
                        if (b3.a() && b3.b().equals("cp2")) {
                            hashMap.put(b3.f(), names.e());
                        }
                    }
                }
                List list3 = this.d;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    abfr abfr2 = (abfr) list3.get(i3);
                    String str = abfr2.b;
                    if (hashMap.containsKey(str)) {
                        abfr2.a = (String) hashMap.get(str);
                    }
                }
            }
        }
    }

    public final int getCount() {
        return this.d.size();
    }

    public final Object getItem(int i) {
        return this.d.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        abfs abfs;
        if (view == null) {
            view = this.c.inflate(R.layout.profile_contacts_picker_item, viewGroup, false);
            abfs = new abfs();
            abfs.a = (ImageView) view.findViewById(R.id.avatar);
            abfs.b = (TextView) view.findViewById(R.id.display_name);
            view.setTag(abfs);
        } else {
            abfs = (abfs) view.getTag();
        }
        abfr abfr = (abfr) this.d.get(i);
        ablp ablp = this.e;
        int i2 = i + 100;
        ablp.a.initLoader(i2, (Bundle) null, new ablo(ablp, abfr.b, new abfp(this, abfs)));
        abfs.b.setText(abfr.a);
        view.setOnClickListener(new abfq(this, abfr));
        return view;
    }
}
