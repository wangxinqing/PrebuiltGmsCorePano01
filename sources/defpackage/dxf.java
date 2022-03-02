package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxf extends BaseAdapter {
    public ContactPerson a;
    public boolean b;
    public int c;
    private final Context d;
    private final View.OnClickListener e;
    private final List f = new ArrayList();
    private final SparseIntArray g;
    private int h;

    public dxf(Context context, SparseIntArray sparseIntArray, View.OnClickListener onClickListener) {
        this.d = context;
        this.g = sparseIntArray;
        this.e = onClickListener;
    }

    /* renamed from: a */
    public final ContactPerson.ContactMethod getItem(int i) {
        if (this.a == null || i <= 0) {
            return null;
        }
        return (ContactPerson.ContactMethod) this.f.get(i - 1);
    }

    public final int getCount() {
        if (this.a != null) {
            return this.f.size() + 1;
        }
        return 0;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ContactPerson.ContactMethod contactMethod;
        int i2;
        int i3 = 0;
        if (view == null) {
            view = LayoutInflater.from(this.d).inflate(R.layout.appinvite_contextual_selection_dropdown_item, viewGroup, false);
        }
        Resources resources = this.d.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.appinvite_method_padding_medium);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.appinvite_method_padding_large);
        TextView textView = (TextView) view.findViewById(R.id.name);
        ImageView imageView = (ImageView) view.findViewById(R.id.avatar_method);
        TextView textView2 = (TextView) view.findViewById(R.id.contact_detail);
        View findViewById = view.findViewById(R.id.delete_icon);
        int i4 = 8;
        if (i == 0) {
            contactMethod = this.a.a();
            textView.setText(eap.a(this.d, this.a));
            textView.setVisibility(0);
            textView2.setTextColor(-1);
            textView2.setPadding(0, 0, 0, dimensionPixelSize);
            if (this.h == 0) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(this.e);
            } else {
                findViewById.setVisibility(8);
            }
            view.setBackgroundColor(this.c);
        } else {
            textView.setVisibility(8);
            textView2.setTextColor(resources.getColor(R.color.appinvite_medium_black));
            textView2.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize2);
            findViewById.setVisibility(8);
            view.setBackgroundColor(0);
            contactMethod = (ContactPerson.ContactMethod) this.f.get(i - 1);
        }
        String a2 = eam.a(this.d, contactMethod);
        textView2.setText(a2);
        if (!TextUtils.isEmpty(a2)) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        boolean z = true;
        if (contactMethod == null) {
            z = false;
        } else {
            int i5 = contactMethod.a;
            if (i5 == 0) {
                i2 = R.drawable.quantum_ic_notifications_black_36;
            } else if (i5 == 1) {
                String string = resources.getString(R.string.appinvite_contextual_selection_content_description_email);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(a2).length());
                sb.append(string);
                sb.append(" ");
                sb.append(a2);
                a2 = sb.toString();
                i2 = R.drawable.quantum_ic_email_black_36;
            } else if (i5 != 2) {
                i2 = 0;
            } else {
                String string2 = resources.getString(R.string.appinvite_contextual_selection_content_description_sms);
                String formatNumber = PhoneNumberUtils.formatNumber(a2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 1 + String.valueOf(formatNumber).length());
                sb2.append(string2);
                sb2.append(" ");
                sb2.append(formatNumber);
                a2 = sb2.toString();
                i2 = R.drawable.quantum_ic_message_black_36;
            }
            if (a2 != null) {
                String valueOf = String.valueOf(a2);
                String string3 = i == 0 ? resources.getString(R.string.appinvite_recipient_selected) : resources.getString(R.string.appinvite_recipient_not_selected);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(string3).length());
                sb3.append(valueOf);
                sb3.append(", ");
                sb3.append(string3);
                a2 = sb3.toString();
            }
            SparseIntArray sparseIntArray = this.g;
            if (sparseIntArray == null) {
                i3 = i2;
                z = false;
            } else if (sparseIntArray.indexOfKey(contactMethod.a) < 0 || this.g.get(contactMethod.a) == 0) {
                i3 = i2;
                z = false;
            } else {
                i3 = this.g.get(contactMethod.a);
            }
        }
        imageView.setImageDrawable(eav.a(this.d, i3, resources.getColor(R.color.material_grey_600), z));
        textView2.setContentDescription(a2);
        return view;
    }

    public final void a(ContactPerson contactPerson, int i) {
        this.a = contactPerson;
        this.h = i;
        this.f.clear();
        if (this.b) {
            this.f.addAll(this.a.e);
            this.f.remove(this.a.a());
        }
        notifyDataSetChanged();
    }
}
