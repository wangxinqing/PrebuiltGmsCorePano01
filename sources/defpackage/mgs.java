package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;
import java.util.List;

/* renamed from: mgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgs extends acg {
    private final List a;
    private final icc e;
    private final wli f;
    private final boolean g;
    private final Resources h;

    public mgs(List list, icc icc, wli wli, boolean z, Context context) {
        this.a = list;
        this.e = icc;
        this.f = wli;
        this.g = z;
        this.h = context.getResources();
    }

    private static final String a(Contact contact) {
        return !contact.b() ? contact.c : contact.a;
    }

    private final void a(AvatarReferenceImageView avatarReferenceImageView, String str, AvatarReference avatarReference) {
        avatarReferenceImageView.a(str);
        avatarReferenceImageView.d();
        avatarReferenceImageView.a(this.e, this.f, avatarReference);
        avatarReferenceImageView.setBackgroundResource(0);
        avatarReferenceImageView.a(0);
    }

    public final int a() {
        return this.a.size();
    }

    public final int a(int i) {
        Contact contact = (Contact) this.a.get(i);
        return (TextUtils.isEmpty(contact.b) || contact.b.equals(a(contact)) || !contact.a()) ? 0 : 1;
    }

    public final adl a(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            if (!axgg.b()) {
                i2 = R.layout.fm_item_1_line_with_avatar_reference_and_icon;
            } else {
                i2 = R.layout.fm_item_1_line_with_avatar_and_icon;
            }
            return new mgq(from.inflate(i2, viewGroup, false), this.g);
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Incorrect view type: ");
            sb.append(i);
            mfv.f("ContactsAdapter", sb.toString(), new Object[0]);
            return null;
        } else {
            if (!axgg.b()) {
                i3 = R.layout.fm_item_2_line_with_avatar_reference_and_icon;
            } else {
                i3 = R.layout.fm_item_2_line_with_avatar_and_icon;
            }
            return new mgr(from.inflate(i3, viewGroup, false), this.g);
        }
    }

    public final void a(adl adl, int i) {
        String str;
        Contact contact = (Contact) this.a.get(i);
        if (adl instanceof mgq) {
            mgq mgq = (mgq) adl;
            if (!contact.a()) {
                str = contact.b;
            } else {
                str = a(contact);
            }
            if (axgg.b()) {
                Uri uri = contact.i;
                if (uri == null) {
                    ImageView imageView = mgq.t;
                    Resources resources = this.h;
                    int i2 = Build.VERSION.SDK_INT;
                    imageView.setImageDrawable(iqw.a(resources, this.h.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48, (Resources.Theme) null)));
                } else {
                    mgq.t.setImageURI(uri);
                }
            } else {
                a(mgq.s, str, contact.g);
            }
            mgq.u.setText(str);
        } else if (adl instanceof mgr) {
            mgr mgr = (mgr) adl;
            if (axgg.b()) {
                Uri uri2 = contact.i;
                if (uri2 == null) {
                    ImageView imageView2 = mgr.t;
                    Resources resources2 = this.h;
                    int i3 = Build.VERSION.SDK_INT;
                    imageView2.setImageDrawable(iqw.a(resources2, this.h.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48, (Resources.Theme) null)));
                } else {
                    mgr.t.setImageURI(uri2);
                }
            } else {
                a(mgr.s, contact.b, contact.g);
            }
            mgr.u.setText(contact.b);
            mgr.v.setText(a(contact));
        }
    }
}
