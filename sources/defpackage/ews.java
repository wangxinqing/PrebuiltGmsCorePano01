package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: ews  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ews extends qcg implements fcr {
    public fcq a;
    public eyf b;
    public fco c;
    public RecyclerView d;
    public hol e;
    public fgr f;
    private View g;
    private View h;
    private TextView i;
    private TextView j;
    private boolean k;

    private final void a() {
        this.k = true;
        this.g.setVisibility(8);
        this.h.setVisibility(0);
        this.i.setAlpha(0.3f);
        this.j.setAlpha(0.3f);
        this.d.setAlpha(0.3f);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f = new fgr(this, this.b.g, this.e);
        this.b.i.a(this, new ewn(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.k = bundle.getBoolean("key_stop_user_interaction", false);
        }
        Context context = getContext();
        View inflate = layoutInflater.cloneInContext(new vt(context, (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_assisted_signin_multiple_entries, viewGroup, false);
        Activity activity = getActivity();
        this.a = (fcq) qck.a(activity).a(fcq.class);
        this.b = (eyf) qck.a(activity).a(eyf.class);
        inflate.findViewById(R.id.cancel).setOnClickListener(new ewo(this));
        this.g = inflate.findViewById(R.id.divider);
        this.h = inflate.findViewById(R.id.progress);
        this.i = (TextView) inflate.findViewById(R.id.title);
        TextView textView = (TextView) inflate.findViewById(R.id.subtitle);
        this.j = textView;
        textView.setText(getString(R.string.credentials_assisted_choose_account_subtitle, this.b.e));
        this.d = (RecyclerView) inflate.findViewById(R.id.list);
        fco fco = new fco(this, this.b.d);
        this.c = fco;
        this.d.setAdapter(fco);
        this.d.setHasFixedSize(true);
        Context context2 = getContext();
        this.d.setLayoutManager(new abk());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.credentials_assisted_dialog_side_padding);
        qcm.a(context2, this.d, 0, R.drawable.credentials_assisted_divider_drawable, dimensionPixelSize, dimensionPixelSize);
        if (this.k) {
            a();
        }
        this.e = new hol(context, "IDENTITY_GMSCORE", (String) null);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_stop_user_interaction", this.k);
        super.onSaveInstanceState(bundle);
    }

    public final void a(fcp fcp, int i2) {
        if (!this.k) {
            a();
            List list = (List) this.b.i.b();
            if (list != null) {
                fgr fgr = this.f;
                antr a2 = fgn.a((InternalSignInCredentialWrapper) list.get(i2));
                hol hol = fgr.b;
                aucd o = anty.n.o();
                String str = fgr.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anty anty = (anty) o.b;
                str.getClass();
                int i3 = anty.a | 2;
                anty.a = i3;
                anty.c = str;
                anty.b = 8;
                anty.a = i3 | 1;
                aucd o2 = ants.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ants ants = (ants) o2.b;
                ants.b = 4;
                int i4 = ants.a | 1;
                ants.a = i4;
                int i5 = 4 | i4;
                ants.a = i5;
                ants.c = i2;
                a2.getClass();
                ants.d = a2;
                ants.a = i5 | 8;
                long b2 = fgr.c.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ants ants2 = (ants) o2.b;
                ants2.a |= 16;
                ants2.e = b2;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anty anty2 = (anty) o.b;
                ants ants3 = (ants) o2.i();
                ants3.getClass();
                anty2.i = ants3;
                anty2.a |= 128;
                hol.a((audx) o.i()).b();
            }
            this.b.i.a((aj) this);
            eyf eyf = this.b;
            eyf.n = (InternalSignInCredentialWrapper) anbs.d(eyf.o, new exu(fcp)).b();
            eyf.a();
        }
    }
}
