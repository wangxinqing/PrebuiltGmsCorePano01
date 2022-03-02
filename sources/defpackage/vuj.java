package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.widget.SwitchCompat;
import android.text.BidiFormatter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: vuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vuj extends vud {
    public final SwitchCompat s;
    final /* synthetic */ vuk t;
    private final LinearLayout u;
    private final QuickContactBadge v;
    private final TextView w;
    private final TextView x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vuj(vuk vuk, View view) {
        super(view);
        this.t = vuk;
        this.u = (LinearLayout) view.findViewById(R.id.contact_list_root);
        this.w = (TextView) view.findViewById(R.id.display_name);
        this.v = (QuickContactBadge) view.findViewById(R.id.profile_badge);
        this.x = (TextView) view.findViewById(R.id.contact_info);
        this.s = (SwitchCompat) view.findViewById(R.id.select_switch);
    }

    private final void b(Context context, Contact contact) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(contact.a, contact.b);
        if (lookupUri != null) {
            this.v.assignContactUri(lookupUri);
        }
        this.v.setImageDrawable(new vwp(context, new vwo(contact.c, contact.d, true), 64));
        this.v.setContentDescription(contact.c);
        this.v.setOverlay(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Contact contact) {
        this.w.setText(contact.c);
        this.x.setText(BidiFormatter.getInstance().unicodeWrap(contact.f.b));
        b(context, contact);
        this.u.setOnTouchListener(new vuh(this));
        vuk vuk = this.t;
        if (!vuk.e) {
            this.s.setVisibility(8);
        } else {
            this.s.setChecked(vuk.a(contact));
            this.s.setVisibility(0);
            this.s.setOnClickListener(new vui(this, contact));
        }
        b(context, contact);
    }
}
