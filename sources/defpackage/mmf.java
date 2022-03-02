package defpackage;

import android.net.Uri;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.Collection;
import java.util.List;

/* renamed from: mmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmf extends BaseAdapter implements Filterable {
    public final amzy a;
    public amzy b = amzy.h();
    private final mms c;

    public mmf(List list, mms mms) {
        this.a = amzy.a((Collection) list);
        this.c = mms;
    }

    private static ContactPerson.ContactMethod a(ContactPerson contactPerson) {
        return (ContactPerson.ContactMethod) contactPerson.d.get(0);
    }

    private final ContactPerson.ContactMethod b(int i) {
        return a((ContactPerson) ((Pair) this.b.get(i)).first);
    }

    private final ContactPerson c(int i) {
        return (ContactPerson) this.a.get(((Integer) ((Pair) this.b.get(i)).second).intValue());
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Filter getFilter() {
        return new mmd(this);
    }

    public final Object getItem(int i) {
        return new Pair(c(i), b(i));
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate(R.layout.fm_contact_picker_contact_row, viewGroup, false);
        }
        mme mme = new mme(view);
        ContactPerson contactPerson = (ContactPerson) ((Pair) this.b.get(i)).first;
        AvatarReference avatarReference = contactPerson.c;
        if (avatarReference != null) {
            mme.s.setImageURI(Uri.parse(avatarReference.b));
            mme.t.setVisibility(4);
            mme.s.setVisibility(0);
        } else {
            mme.t.setVisibility(0);
            mme.s.setVisibility(4);
        }
        if (a(i)) {
            mme.s.setAlpha(0.3f);
            mme.t.setAlpha(0.3f);
            mme.u.setAlpha(0.3f);
            mme.v.setAlpha(0.3f);
        } else {
            mme.s.setAlpha(1.0f);
            mme.t.setAlpha(1.0f);
            mme.u.setAlpha(1.0f);
            mme.v.setAlpha(1.0f);
        }
        mme.u.setText(contactPerson.a);
        mme.v.setText(a(contactPerson).b);
        return view;
    }

    public final boolean isEnabled(int i) {
        return !a(i);
    }

    private final boolean a(int i) {
        return this.c.e(c(i), b(i));
    }
}
