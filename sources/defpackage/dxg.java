package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;
import java.util.Collection;

/* renamed from: dxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxg extends znj {
    final /* synthetic */ dxm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dxg(dxm dxm, Collection collection) {
        super(collection);
        this.a = dxm;
    }

    public final int a(int i) {
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ View a(Object obj, View view, ViewGroup viewGroup, boolean z) {
        AvatarReferenceImageView avatarReferenceImageView;
        dxl dxl = (dxl) obj;
        if (view == null) {
            view = this.a.N.inflate(R.layout.appinvite_auto_complete_item, viewGroup, false);
        }
        ContactPerson contactPerson = dxl.a;
        ContactPerson.ContactMethod contactMethod = dxl.b;
        if (contactMethod == null) {
            contactMethod = contactPerson.a();
        }
        String a2 = eap.a(this.a.e, contactPerson);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.avatar_container);
        if (viewGroup2.getChildCount() == 0) {
            AvatarReferenceImageView avatarReferenceImageView2 = new AvatarReferenceImageView(viewGroup2.getContext());
            viewGroup2.addView(avatarReferenceImageView2, new ViewGroup.LayoutParams(-1, -1));
            avatarReferenceImageView = avatarReferenceImageView2;
        } else {
            avatarReferenceImageView = (AvatarReferenceImageView) viewGroup2.getChildAt(0);
        }
        avatarReferenceImageView.d();
        if (dxl.c != 5) {
            avatarReferenceImageView.a(a2);
        } else {
            String str = null;
            if (!(a2 == null || a2.trim().length() == 0)) {
                str = a2.trim().substring(0, 1);
            }
            avatarReferenceImageView.a(str);
        }
        dxm dxm = this.a;
        eam.a(dxm.d, dxm.j, avatarReferenceImageView, contactPerson, contactMethod, dxm.m);
        ((TextView) view.findViewById(R.id.name)).setText(a2);
        ((TextView) view.findViewById(R.id.contact_detail)).setText(eam.a(this.a.e, contactMethod));
        return view;
    }
}
